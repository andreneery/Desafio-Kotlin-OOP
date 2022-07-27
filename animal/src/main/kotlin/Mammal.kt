class Mammal {

    fun character(): Animal {
        val character = Animal(
            walkOnEath = true,
            canFly = true,
            swin = true,
            isAlive = true,
            layEggs = true
        )
        return character
    }
}