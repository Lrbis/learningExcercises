public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 5, 8, 17, 44, 107, 1987, 1456879};
        for (int number : arr) {
            if (isPrime(number)) {
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
                System.out.print("factors of " + number + ": ");
                printFac(number);
                System.out.println();
            }
        }
      String[] txt = {"boob","branislav","miro","level","papa"};
        for (String word : txt) {
            if(isPalindrome(word)) {
                System.out.println("word " + word + " is a palindrome");
            } else {
                System.out.println("word " + word + " is not a palindrome");
            }
        }
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }
    static void printFac(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPalindrome(String t) {
        int left = 0;
        int right = t.length() -1;
        while (left<right) {
            if (t.charAt(left) != t.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
