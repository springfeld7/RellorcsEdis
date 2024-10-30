package com.thomasspringfeldt.rellorcsedis.entities

import com.thomasspringfeldt.rellorcsedis.engine

const val GOAL = "yellow_exclamation"

/**
 * A Goal tile placed at the end of each level.
 * @author Thomas Springfeldt
 */
class Goal(spriteName: String, x: Float, y: Float) : StaticEntity(spriteName, x, y) {

    override fun onCollision(that: Entity) {
        if (that is Player) {
            engine.loadNextLevel()
        }
        super.onCollision(that)
    }


}