package me.filby.rs2asm

import com.intellij.lang.Language

class Rs2AsmLanguage : Language("Rs2Asm") {
    companion object {
        @JvmStatic
        val INSTANCE = Rs2AsmLanguage()
    }
}
