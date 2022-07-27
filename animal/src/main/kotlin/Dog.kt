class Dog {

    fun character(): Animal {
        val character = Animal(
            walkOnEath = true,
            canFly = false,
            swin = true,
            isAlive = true,
            layEggs = false
        )
        return character
    }
}