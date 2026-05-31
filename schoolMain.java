import bankingProject.BankAccount;

void main() {
    Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;

    System.out.println("=====Students Management System=====");
    while(isRunning){
        System.out.println("\nWhat do you want to do?");
        System.out.println("1. Add Student");
        System.out.println("2. Find students by name");
        System.out.println("3. View all students");
        System.out.println("4. View top performing student");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1 -> {

            }
            case 2 -> {

            }

            case 3 -> {}
            case 4 -> {}
            case 5 -> {
                isRunning = false;
                System.out.println("Thank you for using this service! ");
            }
            default -> System.out.println("Invalid choice.");
        }

    }
    scanner.close();

}