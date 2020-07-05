/*
 * LiquidBounce Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/CCBlueX/LiquidBounce/
 */

package net.ccbluex.liquidbounce.api.minecraft.client.gui

interface IGuiSlot : IGui {
    var slotHeight: Int
    var height: Int
    var width: Int
    var top: Int
    var bottom: Int
    var left: Int
    var right: Int

    fun scrollBy(value: Int)
    fun registerScrollButtons(down: Int, up: Int)
    fun drawBackground(i: Int)
    fun drawScreen(mouseX: Int, mouseY: Int, partialTicks: Float)
    fun elementClicked(index: Int, doubleClick: Boolean, var3: Int, var4: Int)
    fun handleMouseInput()
}