var amount = 50
amount match {
  case 50 => println("$50")
  case 100 => println("$100")
}


var amount = 100
amount match {
  case 50 => println("$50")
  case 100 => println("$100")
}

var amount = -100
amount match {
  case 50 => println("$50")
  case 100 => println("$100")
  case _ => println("Not a $50 or $100 bill")
}


var amount = 50
amount match {
  case a => println("The amount is $" + a)
}


var amount = 50000
amount match {
  case a => println("The amount is $" + a)
  case a if a >= 50 => println("Bill is >= 50, it's " + a)
}


var amount = 50000
amount match {
  case a if a >= 50 => println("Bill is >= 50, it's " + a)
  case a => println("The amount is $" + a)
}


var amount = 1000
amount match {
  case a if a == 50 => println("Bill is $50 " + a)
  case a if a == 100 => println("Bill is $100 " + a)
  case a => println("The amount is $" + a)
}


var amount = 1000
val result: String = amount match {
    case a if a == 50 => "Bill is $50"
    case a if a == 100 => "Bill is $100"
    case a => "The amount is $" + a
}


abstract class Currency
case class USD() extends Currency
case class CAD() extends Currency
case class NZD() extends Currency

val currency: Currency = NZD()
val amount = 100

currency match {
  case u: USD => println("USD " + amount)
  case c: CAD => println("CAD " + amount * (1 / 1.30))
  case n: NZD => println("NZD " + amount * (1 / 1.50))
}


abstract class Currency
case class USD() extends Currency
case class CAD() extends Currency
case class NZD() extends Currency

val currency: Currency = CAD()
val amount = 100

currency match {
  case u: USD => println("USD " + amount)
  case c: CAD => println("CAD " + amount * (1 / 1.30))
  case n: NZD => println("NZD " + amount * (1 / 1.50))
}


val anArray = Array(100, 200, 300)

anArray match {
  case Array(first, second, third) => println("Third " + third)
}

anArray match {
  case Array(_, _, third) => println("Third " + third)
}

anArray match {
  case Array(_, second, _) => println("Second " + second)
}


val aTuple = ("NZD", 100)

aTuple match {
  case (currency, amount) if currency == "USD" => println("USD " + amount)
  case (currency, amount) if currency == "USD" => println("USD " + amount * (1 / 1.50))
}
