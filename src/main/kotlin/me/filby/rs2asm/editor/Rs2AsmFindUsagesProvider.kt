package me.filby.rs2asm.editor

import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement
import me.filby.rs2asm.psi.Rs2AsmLabel
import me.filby.rs2asm.psi.Rs2AsmOperandLabel

class Rs2AsmFindUsagesProvider : FindUsagesProvider {
    override fun canFindUsagesFor(psiElement: PsiElement): Boolean {
        return psiElement is Rs2AsmLabel || psiElement is Rs2AsmOperandLabel
    }

    override fun getHelpId(psiElement: PsiElement): String? {
        return null
    }

    override fun getType(element: PsiElement): String {
        return "label"
    }

    override fun getDescriptiveName(element: PsiElement): String {
        return element.text
    }

    override fun getNodeText(element: PsiElement, useFullName: Boolean): String {
        return element.text
    }
}
