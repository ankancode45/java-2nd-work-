import java.util.Scanner;

class Student {
    private int age;

    // Getter and Setter methods
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to check if the student is eligible to vote
    public boolean isEligibleToVote() {
        return age >= 18;  // A student is eligible to vote if they are 18 or older
    }
}

class VotingEligibility {

    public static void checkVotingEligibility() {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter student's age: ");
        int age = scanner.nextInt(); // Read the age input

        Student student = new Student();
        student.setAge(age);

        // Checking if the student is eligible to vote and display the result
        if (student.isEligibleToVote()) {
            System.out.println("The student is eligible to vote.");
        } else {
            System.out.println("The student is not eligible to vote.");
        }

        scanner.close(); // Close the scanner
    }

    public static void main(String[] args) {
        checkVotingEligibility(); // Method to check voting eligibility
    }
}