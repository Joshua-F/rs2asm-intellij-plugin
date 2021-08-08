package me.filby.rs2asm.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import me.filby.rs2asm.Rs2AsmFileType
import me.filby.rs2asm.Rs2AsmLanguage
import org.antlr.intellij.adaptor.psi.ScopeNode

class Rs2AsmFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, Rs2AsmLanguage.INSTANCE), ScopeNode {
    override fun getContext(): ScopeNode? = null

    override fun resolve(element: PsiNamedElement?): PsiElement? = null

    override fun getFileType(): FileType = Rs2AsmFileType.INSTANCE
}
