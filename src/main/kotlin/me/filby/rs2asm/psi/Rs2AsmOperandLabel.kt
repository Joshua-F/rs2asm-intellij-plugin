package me.filby.rs2asm.psi

import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference
import com.intellij.util.IncorrectOperationException
import me.filby.rs2asm.Rs2AsmParserDefinition.Companion.tokens
import net.runelite.cache.script.assembler.rs2asmLexer
import org.antlr.intellij.adaptor.psi.IdentifierDefSubtree

class Rs2AsmOperandLabel(node: ASTNode) : IdentifierDefSubtree(node, tokens[rs2asmLexer.IDENTIFIER]) {
    override fun setName(name: String): PsiElement {
        val newNode = Rs2AsmElementFactory.createIdentifier(name, project)
        if (newNode != null) {
            nameIdentifier?.replace(newNode)
            return newNode
        }
        throw IncorrectOperationException()
    }

    override fun getReference(): PsiReference {
        return Rs2AsmLabelReference(this, TextRange(0, this.text.length))
    }
}
