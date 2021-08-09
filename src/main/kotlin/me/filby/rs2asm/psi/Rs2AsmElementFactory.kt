package me.filby.rs2asm.psi

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiFileFactory
import me.filby.rs2asm.Rs2AsmLanguage
import me.filby.rs2asm.Rs2AsmParserDefinition.Companion.rules
import me.filby.rs2asm.Rs2AsmParserDefinition.Companion.tokens
import net.runelite.cache.script.assembler.rs2asmLexer
import net.runelite.cache.script.assembler.rs2asmParser

object Rs2AsmElementFactory {
    fun createIdentifier(name: String, project: Project): PsiElement? {
        val file = createFile("$name:\n", project)
        return file.node.firstChildNode
            .findChildByType(rules[rs2asmParser.RULE_line])
            ?.firstChildNode
            ?.findChildByType(tokens[rs2asmLexer.IDENTIFIER])
            ?.psi
    }

    fun createFile(content: String, project: Project): PsiFile {
        return PsiFileFactory.getInstance(project)
            .createFileFromText("a.rs2asm", Rs2AsmLanguage.INSTANCE, content)
    }
}
