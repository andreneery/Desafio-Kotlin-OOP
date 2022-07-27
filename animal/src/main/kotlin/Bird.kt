class Bird {

    fun character(): Animal {
        val character = Animal(
            walkOnEath = true,
            canFly = true,
            swin = false,
            isAlive = true,
            layEggs = true
        )
        return character
    }
}