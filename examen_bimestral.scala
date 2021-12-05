//Método Newton-Raphson.

import scala.math._

var tempPoint: Float = 0

//Se toma como punto de partida el 1
var point: Float = 1
var i = 1

def calculate(): Float = {
  var fx: Float = pow(point, 2).toFloat - sqrt(10).toFloat
  var fxPrime: Float = 2 * point
  var expression: Float = point - (fx / fxPrime)

  println("Iteración: " + i + " --> Punto: " + point)

  point = expression
  if (point == tempPoint) return point

  //Se copia el valor de point
  tempPoint = point.toFloat
  i += 1
  calculate()
}

var result = calculate()
println("Raíz: " + result)

