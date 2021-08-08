package me.filby.rs2asm

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import me.filby.rs2asm.psi.Rs2AsmPsiElement

object Rs2AsmElementFactory {
    fun createElement(node: ASTNode): PsiElement {
        return Rs2AsmPsiElement(node)
    }
}
