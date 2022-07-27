class Retangulo(
    var width: Int,
    var height: Int,
    var color: String
){


    fun calcArea(calculoDaArea: Int): Int {
        var calculoDaArea = width * height

        return calculoDaArea
    }

    override fun toString(): String{
        return "Width = ${width},\nHeight = ${height},\nColor = ${color}, \nArea: ${calcArea()}"
    }
}