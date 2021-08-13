package me.filby.rs2asm

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

class Rs2AsmFileType : LanguageFileType(Rs2AsmLanguage.INSTANCE) {
    override fun getName() = Rs2AsmBundle.message("name")

    override fun getDescription() = Rs2AsmBundle.message("description")

    override fun getDefaultExtension() = "rs2asm"

    override fun getIcon() = IconLoader.getIcon("/me/filby/rs2asm/rs2asm.svg", Rs2AsmFileType::class.java)

    companion object {
        @JvmStatic
        val INSTANCE = Rs2AsmFileType()
    }
}
