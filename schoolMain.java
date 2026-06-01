import bankingProject.BankAccount;
import schoolManagement.studentManager;

void main() {
    Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;

    System.out.println("=====Students Management System=====");

    System.out.print("Enter student name: ");
    String name = scanner.nextLine();

    studentManager manager = new studentManager(name);

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
                System.out.print("Enter number of subject you want to add: ");
                int numberOfSubject = scanner.nextInt();
                manager.addStudent(name, numberOfSubject);

            }
            case 2 -> {
                System.out.print("Enter student name: ");
                String findName = scanner.nextLine();
                manager.findStudent(findName);
            }

            case 3 -> {}
            case 4 -> {}
            case 5 -> {
                isRunning = false;
                System.out.println("Thank you for using this service! " + name);
            }
            default -> System.out.println("Invalid choice.");
        }

    }
    scanner.close();

}