import kotlin.math.pow

class Solution {
    fun isNumberPalindrome(input: Int): Boolean {
        var quotient: Int = input
        var count = 0
        do {
            quotient /= 10
            count++
        } while(quotient > 0)
        var reverseNumber = 0
        var digit: Int
        quotient = input
        do {
            digit = quotient % 10
            quotient /= 10
            count--
            reverseNumber += 10.toFloat().pow(count).toInt()*digit
        } while(count > 0)
        return reverseNumber == input
    }
}