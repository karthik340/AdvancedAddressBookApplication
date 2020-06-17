import java.util.LinkedList;
import java.util.Scanner;

public class AddressBookMain {

    private static final LinkedList<Person>personsList=new LinkedList<>();
    private static final Scanner input=new Scanner(System.in);
    public static void addPerson()
    {
        System.out.println("enter first name");
        String firstName=input.nextLine();
        System.out.println("enter last name");
        String lastName=input.nextLine();
        System.out.println("enter address");
        String address=input.nextLine();
        System.out.println("enter city");
        String city=input.nextLine();
        System.out.println("enter state");
        String state=input.nextLine();
        System.out.println("enter zip");
        String zip=input.nextLine();
        System.out.println("enter phone number");
        String phoneNumber=input.nextLine();
        Person person1 = new Person(firstName,lastName,address,city,state,zip,phoneNumber);
        personsList.add(person1);
    }
    public static void main(String[] args)
    {
        System.out.println("enter 1 for adding address book 2 for quit");
        int n=input.nextInt();
        input1.nextLine();
        while(n==1)
        {
            addPerson();
            System.out.println("enter 1 for adding address book 2 for quit");
            n=input.nextInt();
        }
    }
}
