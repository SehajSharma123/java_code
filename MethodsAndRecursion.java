/*
=====================================================
          METHODS AND RECURSION IN JAVA
=====================================================
Programs Included:
1. Method Without Parameters
2. Method With Parameters
3. Method With Return Value
4. Method Overloading
5. Recursive Factorial
=====================================================
*/

public class MethodsAndRecursion {

    public static void main(String[] args) {

        System.out.println("========== Program 1 ==========");
        displayMessage();

        System.out.println("\n========== Program 2 ==========");
        greet("Divyanshi", 20);

        System.out.println("\n========== Program 3 ==========");
        int sum = addNumbers(15, 25);
        System.out.println("Sum = " + sum);

        System.out.println("\n========== Program 4 ==========");
        System.out.println("Addition of Integers = " + add(10, 20));
        System.out.println("Addition of Doubles = " + add(10.5, 20.7));

        System.out.println("\n========== Program 5 ==========");
        int number = 5;
        System.out.println("Factorial of " + number + " = " + factorial(number));
    }

    //====================================================
    // Program 1 : Method Without Parameters
    //====================================================

    static void displayMessage() {
        System.out.println("Welcome to Java Methods.");
        System.out.println("This method has no parameters.");
    }

    //====================================================
    // Program 2 : Method With Parameters
    //====================================================

    static void greet(String name, int age) {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    //====================================================
    // Program 3 : Method With Return Value
    //====================================================

    static int addNumbers(int a, int b) {
        return a + b;
    }

    //====================================================
    // Program 4 : Method Overloading
    //====================================================

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    //====================================================
    // Program 5 : Recursive Factorial
    //====================================================

    static int factorial(int n) {

        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

}
System.out.println("\n========== Program 6 ==========");
int terms = 10;
System.out.print("Fibonacci Series: ");
for (int i = 0; i < terms; i++) {
    System.out.print(fibonacci(i) + " ");
}

System.out.println("\n\n========== Program 7 ==========");
int n = 10;
System.out.println("Sum of first " + n + " natural numbers = " + sum(n));

System.out.println("\n========== Program 8 ==========");
int base = 2;
int exponent = 5;
System.out.println(base + "^" + exponent + " = " + power(base, exponent));

System.out.println("\n========== Program 9 ==========");
int num1 = 48;
int num2 = 18;
System.out.println("GCD = " + gcd(num1, num2));

System.out.println("\n========== Program 10 ==========");
String word = "madam";
if (isPalindrome(word, 0, word.length() - 1))
    System.out.println(word + " is a Palindrome.");
else
    System.out.println(word + " is not a Palindrome.");
//====================================================
// Program 6 : Recursive Fibonacci
//====================================================

static int fibonacci(int n) {

    if (n <= 1)
        return n;

    return fibonacci(n - 1) + fibonacci(n - 2);
}

//====================================================
// Program 7 : Recursive Sum of Natural Numbers
//====================================================

static int sum(int n) {

    if (n == 1)
        return 1;

    return n + sum(n - 1);
}

//====================================================
// Program 8 : Recursive Power
//====================================================

static int power(int base, int exponent) {

    if (exponent == 0)
        return 1;

    return base * power(base, exponent - 1);
}

//====================================================
// Program 9 : Recursive GCD (Greatest Common Divisor)
//====================================================

static int gcd(int a, int b) {

    if (b == 0)
        return a;

    return gcd(b, a % b);
}

//====================================================
// Program 10 : Recursive Palindrome Check
//====================================================

static boolean isPalindrome(String str, int start, int end) {

    if (start >= end)
        return true;

    if (str.charAt(start) != str.charAt(end))
        return false;

    return isPalindrome(str, start + 1, end - 1);
}

/*
=====================================================
END OF FILE
=====================================================
*/
