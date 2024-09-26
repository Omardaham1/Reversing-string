public class ReverseString {
    // Method to reverse the string
    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString(); // Reverse and convert back to a string
    }

    public static void main(String[] args) {
        // Example usage
        String input = "Hello";  // Input
        String result = reverse(input);  // Reverse the string
        System.out.println(result);  // Output the reversed string
    }
}
