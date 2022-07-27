open class Snake {

    fun character(): Animal {
        val character = Animal(
            walkOnEath = true,
            canFly = false,
            swin = false,
            isAlive = true,
            layEggs = true
        )
        return character
    }
}