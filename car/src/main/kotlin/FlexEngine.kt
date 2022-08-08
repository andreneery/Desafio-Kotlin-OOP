class FlexEngine(val option: String): Motor{

    override fun isEnvironmentalFriendly(): Boolean {
        if(option == "gasolina"){
            return false
    } else if(option == "alcool"){
        return true
        } else throw error("combustivel não permitido")
    }

    override fun useFlammelFuel(): Boolean {
        if(option == "alcool" || option == "gasolina"){
            return true
        } else{
            return throw error("combustivel não permitido")
        }
    }

    override fun useFossilFuel(): Boolean {
        if (option == "gasolina"){
            return true
        }else if(option == "alcool"){
            return false
        } else throw error("combustivel não permitido")
    }

}