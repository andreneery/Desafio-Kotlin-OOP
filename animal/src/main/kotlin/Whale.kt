class Whale {

    fun character(): Animal {
        val character = Animal(
            walkOnEath = false,
            canFly = false,
            swin = true,
            isAlive = true,
            layEggs = false
        )
        return character
    }
}