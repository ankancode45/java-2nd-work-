import java.util.Scanner;

class Person {
    private String name;

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to check if the name is a palindrome
    public boolean isPalindrome() {
        String cleanedName = cleanName(name);

        // Checking if the string is a palindrome by comparing characters from both ends
        int left = 0;
        int right = cleanedName.length() - 1;

        while (left < right) {
            if (cleanedName.charAt(left) != cleanedName.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }

        return true; // If all characters matched, it's a palindrome
    }

    public String cleanName(String name) {
        // New string to store the cleaned name
        StringBuilder cleanedName = new StringBuilder();

        // Loop through the name and add non-space characters to the cleaned name
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            // If the character is not a space, append to cleanedName
            if (c != ' ') {
                cleanedName.append(Character.toLowerCase(c)); // Convert to lowercase
            }
        }

        return cleanedName.toString(); // Return the cleaned name
    }
}

class PalindromeChecker {

    // Method to get user input and check if it is a palindrome
    public static void checkPalindrome() {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter a name to check if it is a palindrome: ");
        String nameInput = scanner.nextLine(); // Read the input

        // If the user does not input a name, exit the program
        if (nameInput.trim().isEmpty()) {
            System.out.println("No name entered. Exiting program.");
            scanner.close(); // Close the scanner
            return; 
        }

        // Person object
        Person person = new Person();
        person.setName(nameInput); // Set name using the setter method

        // Checking if the name is a palindrome and display the result
        if (person.isPalindrome()) {
            System.out.println(person.getName() + " is a palindrome.");
        } else {
            System.out.println(person.getName() + " is not a palindrome.");
        }

        scanner.close(); // Close the scanner
    }

    public static void main(String[] args) {
        // Main method
        checkPalindrome();
    }
}
