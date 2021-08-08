package me.filby.rs2asm.editor

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import me.filby.rs2asm.Rs2AsmLanguage
import net.runelite.cache.script.assembler.rs2asmLexer
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.TokenIElementType

class Rs2AsmHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        val lexer = rs2asmLexer(null)
        return ANTLRLexerAdaptor(Rs2AsmLanguage.INSTANCE, lexer)
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        if (tokenType !is TokenIElementType) {
            return emptyArray()
        }

        val attrKey =  when (tokenType.antlrTokenType) {
            rs2asmLexer.INT -> INT
            rs2asmLexer.QSTRING -> STRING
            rs2asmLexer.IDENTIFIER -> IDENTIFIER
            rs2asmLexer.COMMENT -> COMMENT
            else -> return emptyArray()
        }
        return arrayOf(attrKey)
    }

    companion object {
        private val INT = createTextAttributesKey("RS2ASM_INT",
            DefaultLanguageHighlighterColors.NUMBER)
        private val STRING = createTextAttributesKey("RS2ASM_STRING",
            DefaultLanguageHighlighterColors.STRING)
        private val IDENTIFIER = createTextAttributesKey("RS2ASM_IDENTIFIER",
            DefaultLanguageHighlighterColors.IDENTIFIER)
        private val COMMENT = createTextAttributesKey("RS2ASM_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT)
    }
}
