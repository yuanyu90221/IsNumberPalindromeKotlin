import kotlin.test.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val sol: Solution = Solution()
    @Test
    fun isNumberPalindromeExample1() {
        assertEquals(true, sol.isNumberPalindrome(131))
    }

    @Test
    fun isNumberPalindromeExample2() {
        assertEquals(false, sol.isNumberPalindrome(123))
    }

    @Test
    fun isNumberPalindromeExample3() {
        assertEquals(true, sol.isNumberPalindrome(1221))
    }
}