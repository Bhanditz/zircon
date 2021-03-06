package org.codetome.zircon.api.animation

import org.codetome.zircon.api.Beta
import org.codetome.zircon.internal.behavior.Identifiable
import java.util.*

/**
 * Note that this class is in **BETA**!
 * It's API is subject to change!
 */
@Beta
interface Animation : Identifiable {

    fun getFrameCount(): Int

    fun getLoopCount(): Int

    fun getLength(): Int

    fun getTick(): Long

    fun getCurrentFrame() : AnimationFrame

    fun fetchNextFrame(): Optional<AnimationFrame>

    fun hasNextFrame(): Boolean

    fun getAllFrames(): List<AnimationFrame>
}