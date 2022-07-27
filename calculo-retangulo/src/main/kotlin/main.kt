fun main(){
    val rectangle = mutableMapOf("Width" to 10, "Height" to 10, "Color" to "Red");

    println(toString(rectangle));
    print("A area do retangulo é: ${calcArea(rectangle)}");
}
// a função toString irá retornar os atributos do retangulo
// o Map server como um buscador de parametros de que seu desejo extrair
fun toString(shape: Map<String, Any>): String{
    return "Width = ${shape["Width"]},\nHeight = ${shape["Height"]},\ncolor = ${shape["Color"]}"

}

fun calcArea(shape : Map<String, Any>) : Int{
    var width = shape["Width"] as Int;
    var height = shape["Height"] as Int;
    var calculoDaArea = width * height;

    return calculoDaArea;
}