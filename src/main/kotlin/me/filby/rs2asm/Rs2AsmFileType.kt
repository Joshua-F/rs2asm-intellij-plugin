package me.filby.rs2asm

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class Rs2AsmFileType : LanguageFileType(Rs2AsmLanguage.INSTANCE) {
    override fun getName() = Rs2AsmBundle.message("name")

    override fun getDescription() = Rs2AsmBundle.message("description")

    override fun getDefaultExtension() = "rs2asm"

    override fun getIcon(): Icon? {
        // TODO need an icon
        return null
    }

    companion object {
        @JvmStatic
        val INSTANCE = Rs2AsmFileType()
    }
}
