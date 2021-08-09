package me.filby.rs2asm.psi

import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiPolyVariantReferenceBase
import com.intellij.psi.ResolveResult
import com.intellij.psi.util.PsiTreeUtil

class Rs2AsmLabelReference(element: Rs2AsmOperandLabel, rangeInElement: TextRange) :
    PsiPolyVariantReferenceBase<Rs2AsmOperandLabel>(element, rangeInElement) {
    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val labels = PsiTreeUtil.findChildrenOfType(element.containingFile, Rs2AsmLabel::class.java)
        val results = labels
            .filter { it.firstChild.textMatches(element) }
            .map { it }
        return PsiElementResolveResult.createResults(results)
    }

    override fun getVariants(): Array<Any> {
        val labels = PsiTreeUtil.findChildrenOfType(element.containingFile, Rs2AsmLabel::class.java)
            .mapNotNull { LookupElementBuilder.create(it.name ?: return@mapNotNull null) }
        return labels.toTypedArray()
    }

    override fun handleElementRename(newElementName: String): PsiElement {
        return myElement.setName(newElementName)
    }
}
