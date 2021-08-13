package me.filby.rs2asm.editor

import com.intellij.lang.Commenter

class Rs2AsmCommenter : Commenter {
    override fun getLineCommentPrefix() = ";"

    override fun getBlockCommentPrefix(): String? = null

    override fun getBlockCommentSuffix(): String? = null

    override fun getCommentedBlockCommentPrefix(): String? = null

    override fun getCommentedBlockCommentSuffix(): String? = null
}
