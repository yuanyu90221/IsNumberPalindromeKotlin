# IsNumberPalindromeKotlin

## 題目描述

寫一個演算法判斷輸入數字是否為一個回文數字。

舉例來說，
輸入數字： 131，則回 true
輸入數字： 123，則回 false
輸入數字： 101，則回 true

並且符合空間複雜度需要是 O(1)。

## 解題想法

所謂回文數字也就是

把每個位元素反過來跟原本數字是相同的

因此只要把利用整數除法以及同餘算法找出每個位元數

並且反向把位元數算出來確認是否與原本的數相同即可

## 程式碼
```kotlin
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
```