package me.filby.rs2asm.editor

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement
import me.filby.rs2asm.psi.Rs2AsmHeader
import me.filby.rs2asm.psi.Rs2AsmInstructionName
import me.filby.rs2asm.psi.Rs2AsmLabel
import me.filby.rs2asm.psi.Rs2AsmOperandLabel
import net.runelite.cache.script.Instruction
import net.runelite.cache.script.Instructions

class Rs2AsmHighlightAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            is Rs2AsmHeader -> {
                val headerName = element.findElementAt(0) ?: return
                holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .textAttributes(Rs2AsmHighlighter.HEADER_KEY)
                    .range(headerName)
                    .create()
            }
            is Rs2AsmLabel -> {
                holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .textAttributes(Rs2AsmHighlighter.DEC_LABEL)
                    .create()
            }
            is Rs2AsmInstructionName -> annotateInstructionName(element, holder)
            is Rs2AsmOperandLabel -> {
                // check if the label is resolvable
                if (element.reference.resolve() == null) {
                    holder.newAnnotation(HighlightSeverity.ERROR, "Unknown label: ${element.name}")
                        .create()
                    return
                }

                // default label highlighting
                holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .textAttributes(Rs2AsmHighlighter.LABEL)
                    .create()
            }
        }
    }

    /**
     * Handles highlighting instruction names for errors or normal highlight.
     */
    private fun annotateInstructionName(
        element: Rs2AsmInstructionName,
        holder: AnnotationHolder
    ) {
        val name = element.text
        val nameAsInt = name.toIntOrNull()

        if (nameAsInt != null) {
            // TODO should probably be an inspection
            val instruction: Instruction? = INSTRUCTIONS.find(nameAsInt)
            if (instruction != null) {
                holder.newAnnotation(
                    HighlightSeverity.WARNING,
                    "Instruction has a proper name: ${instruction.name}"
                )
                    .create()
            }
        } else if (INSTRUCTIONS.find(name) == null && name != RUNELITE_CALLBACK_INSTRUCTION) {
            holder.newAnnotation(HighlightSeverity.ERROR, "$name is not a valid instruction name.")
                .create()
            return
        }

        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
            .textAttributes(Rs2AsmHighlighter.INSTRUCTION_NAME)
            .create()
    }

    companion object {
        private const val RUNELITE_CALLBACK_INSTRUCTION = "runelite_callback"
        private val INSTRUCTIONS = Instructions().apply { init() }
    }
}
