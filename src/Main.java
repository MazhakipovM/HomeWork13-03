import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        task1();
    }

    private static void task1() {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first name ?");
        String firstName = scan.next();
        System.out.println("What is your middle name ?");
        String middleName = scan.next();
        System.out.println("What is your last name ?");
        String lastName = scan.next();
        String fullname = lastName +" "+ firstName+" "+middleName;

        System.out.println("ФИО сотрудника — "+ fullname);


        task2(fullname);


    }

    private static void task2(String fullname) {
        System.out.println("ФИО сотрудника — "+ fullname.toUpperCase());


        task3(fullname);


    }

    private static void task3(String fullname) {
        fullname = fullname.replace("ё","е");
        System.out.println("Данные ФИО сотрудника — " + fullname);
    }
}


