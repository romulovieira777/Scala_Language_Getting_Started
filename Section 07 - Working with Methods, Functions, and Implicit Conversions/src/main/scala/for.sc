val amounts = Array(10, 24, 35 , 23, 12)
var sum = 0
for (amount <- amounts) {
  sum = sum + amount
}
println(sum)

val result: Unit = for (amount <- amounts) {
  println(amount)
}

val result01: Array[Int] = for (amount <- amounts) yield {
  amount
}

val result02: Array[Int] = for (amount <- amounts) yield amount


val currencies = Array("USD", "NZD")
val result04: Array[String] = for {
  amount <- amounts
  currency <- currencies
} yield currency + " " + amount


val result04: Array[String] = for {
  amount <- amounts
  currency <- currencies
  if amount > 20
} yield currency + " " + amount


val result04: Array[String] = for {
  amount <- amounts
  currency <- currencies
  if amount > 20 && amount < 30
} yield currency + " " + amount


val result04: Array[String] = for {
  amount <- amounts
  currency <- currencies
  if amount > 20 && (currency == "NZD")
} yield currency + " " + amount


val result04: Array[String] = for {
  amount <- amounts
  currency <- currencies
  if amount > 20 && (currency == "NZD" || currency == "USD")
} yield currency + " " + amount


// foreach is a statement
amounts.foreach(amount => println(amount * 1000))

List(1, 2, 3, 4).foreach(num => println(num * 20))
