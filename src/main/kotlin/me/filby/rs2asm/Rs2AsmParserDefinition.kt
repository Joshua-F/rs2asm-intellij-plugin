package me.filby.rs2asm

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import me.filby.rs2asm.psi.Rs2AsmFile
import net.runelite.cache.script.assembler.rs2asmLexer
import net.runelite.cache.script.assembler.rs2asmParser
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor
import org.antlr.v4.runtime.Parser
import org.antlr.v4.runtime.tree.ParseTree

class Rs2AsmParserDefinition : ParserDefinition {
    override fun createLexer(project: Project?): Lexer {
        val lexer = rs2asmLexer(null)
        return ANTLRLexerAdaptor(Rs2AsmLanguage.INSTANCE, lexer)
    }

    override fun createParser(project: Project?): PsiParser {
        val parser = rs2asmParser(null)
        return object : ANTLRParserAdaptor(Rs2AsmLanguage.INSTANCE, parser) {
            override fun parse(parser: Parser, root: IElementType): ParseTree {
                if (root is IFileElementType) {
                    return (parser as rs2asmParser).prog()
                }
                throw UnsupportedOperationException("Unsupported root: ${root.javaClass.name}")
            }
        }
    }

    override fun getFileNodeType() = FILE

    override fun getWhitespaceTokens(): TokenSet = WHITESPACE

    override fun getCommentTokens(): TokenSet = COMMENT

    override fun getStringLiteralElements(): TokenSet = STRING

    override fun createElement(node: ASTNode) = Rs2AsmElementFactory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider) = Rs2AsmFile(viewProvider)

    companion object {
        init {
            @Suppress("DEPRECATION")
            PSIElementTypeFactory.defineLanguageIElementTypes(
                Rs2AsmLanguage.INSTANCE,
                rs2asmParser.tokenNames,
                rs2asmParser.ruleNames
            )
        }

        val tokens: List<TokenIElementType> = PSIElementTypeFactory.getTokenIElementTypes(Rs2AsmLanguage.INSTANCE)
        val rules: List<RuleIElementType> = PSIElementTypeFactory.getRuleIElementTypes(Rs2AsmLanguage.INSTANCE)

        private val FILE = IFileElementType(Rs2AsmLanguage.INSTANCE)

        private val WHITESPACE = PSIElementTypeFactory.createTokenSet(Rs2AsmLanguage.INSTANCE, rs2asmLexer.WS)
        private val COMMENT = PSIElementTypeFactory.createTokenSet(Rs2AsmLanguage.INSTANCE, rs2asmLexer.COMMENT)
        private val STRING = PSIElementTypeFactory.createTokenSet(Rs2AsmLanguage.INSTANCE, rs2asmLexer.QSTRING)
    }
}
