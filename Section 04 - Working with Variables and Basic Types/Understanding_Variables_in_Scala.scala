scala> var number_01: Int = 10
number_01: Int = 10

scala> var number_02: Int = 20
number_02: Int = 20

scala> number_01 = -30
number_01: Int = -30

scala> number_01
res0: Int = -30

scala> val number_03: Int = 45
number_03: Int = 45

scala> number_03
res1: Int = 45

scala> val number = 56 // this is a special number
number: Int = 56

scala> number
res2: Int = 56

scala> :paste
// Entering paste mode (ctrl-D to finish)

/**
 * This is 
 * a multiline
 * comment
 */
val number_05: Int = 99

// Exiting paste mode, now interpreting.

number_05: Int = 99

scala> number_05
res3: Int = 99

scala> var aString: String = "He said"
aString: String = He said

scala> var aString: String = "He said - \"I am good, how are you?\""
aString: String = He said - "I am good, how are you?"

scala> val anInt: Int =  5
anInt: Int = 5

scala> val aDouble: Double = 3.2
aDouble: Double = 3.2

scala> val aFloat: Float = 1.3f
aFloat: Float = 1.3

scala> val aLong: Long = 1999L
aLong: Long = 1999

scala> val aShort: Short = 'c'
aShort: Short = 99

scala> val aChar: Char = 'c'
aChar: Char = c

scala> val aShort: Short = 120
aShort: Short = 120

scala> val aByte: Byte = 1
aByte: Byte = 1

scala> // Non-Numeric Types Next

scala> val aFalse: Boolean = false
aFalse: Boolean = false

scala> val aTrue: Boolean = true
aTrue: Boolean = true

scala> var five: Int = 5
five: Int = 5

scala> var five: AnyVal = 5
five: AnyVal = 5

scala> var arr: Array[Int] = Array(1, 2)
arr: Array[Int] = Array(1, 2)

scala> var arr: AnyRef = Array(1, 2)
arr: AnyRef = Array(1, 2)

scala> five
res0: AnyVal = 5

scala> arr
res1: AnyRef = Array(1, 2)

scala> var arr: Array[Int] = Array(1, 2)
arr: Array[Int] = Array(1, 2)

scala> arr(1)
res2: Int = 2

scala> arr(0)
res3: Int = 1

scala> val aNull: Null = null
aNull: Null = null

scala> val aShort: Short = 128
aShort: Short = 128

scala> val anInt: Int = aShort
anInt: Int = 128

scala> val aChar: Char = '#'
aChar: Char = #

scala> val anIntFromChar: Int = aChar
anIntFromChar: Int = 35

scala> import java.time._
import java.time._

scala> LocalDate.now()
res0: java.time.LocalDate = 2021-06-16

scala> val d1 = LocalDate.of(2012, 11, 24)
d1: java.time.LocalDate = 2012-11-24

scala> d1.isAfter(res0)
res1: Boolean = false

scala> d1.isBefore(res0)
res2: Boolean = true

scala> val lt1: LocalTime = LocalTime.of(15, 55 ,10)
lt1: java.time.LocalTime = 15:55:10

scala> lt1.isBefore(res4)
res6: Boolean = false

scala> ZonedDateTime.now()
res8: java.time.ZonedDateTime = 2021-06-16T14:17:15.844-03:00[America/Sao_Paulo]

scala> ZonedDateTime.now()
res8: java.time.ZonedDateTime = 2021-06-16T14:17:15.844-03:00[America/Sao_Paulo]

scala> val zdt1 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/London"))
zdt1: java.time.ZonedDateTime = 2021-06-16T14:19:00.319+01:00[Europe/London]

scala> zdt1.plusYears(200)
res10: java.time.ZonedDateTime = 2221-06-16T14:19:00.319+01:00[Europe/London]
