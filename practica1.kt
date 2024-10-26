fun main() {
    println("Ingrese el primer numero")
    val numeroUno = readLine()?.toDouble()

    println("Ingrese el segundo numero")
    val numeroDos = readLine()?.toDouble()

    println("Ingrese la operacion (+, -, *, /):")
    val operacion = readLine()

    calculate(numeroUno, numeroDos, operacion)
}

fun calculate(numeroUno: Double?, numeroDos: Double?, operacion: String?) {
    if (numeroUno == null || numeroDos == null || operacion == null) {
        println("Error: Ingrese numeros válidos y una operacion válida.")
        return
    }

    val resultado = when (operacion) {
        "+" -> numeroUno + numeroDos
        "-" -> numeroUno - numeroDos
        "*" -> numeroUno * numeroDos
        "/" -> numeroUno / numeroDos
        else -> {
            println("Error: Operacion no válida.")
            return
        }
    }
    println("Resultado de la operacion $numeroUno $operacion $numeroDos = $resultado")
}
