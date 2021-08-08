package me.filby.rs2asm.editor.completion

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.util.ProcessingContext
import net.runelite.cache.script.Instruction
import net.runelite.cache.script.Instructions

/**
 * Handles adding all instruction names as completions.
 */
class Rs2AsmInstructionsCompletionProvider : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
        parameters: CompletionParameters,
        context: ProcessingContext,
        result: CompletionResultSet
    ) {
        result.addAllElements(instructions)
    }

    companion object {
        @Suppress("UNCHECKED_CAST")
        private val instructions = run {
            // very hacky way to access the backing map of instructions to get their names
            val temp = Instructions().apply { init() }
            val field = temp.javaClass.getDeclaredField("instructions")
            field.isAccessible = true
            val names = (field.get(temp) as Map<Int, Instruction>).values.map { it.name }
            val additionalNames = listOf("runelite_callback")
            names + additionalNames
        }.map { LookupElementBuilder.create(it).withCaseSensitivity(true) }
    }
}
