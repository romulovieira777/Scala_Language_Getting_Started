val number = 10

val symbol1: Unit = if (number > 10) {
  println("> 10")
} else {
  println("<= 10")
}

val number2 = 100

val symbol2: String = if (number > 10) {
  "> 10"
} else if (number == 10) {
  "== 10"
} else {
  "<= 10"
}
