import java.util.Scanner;

public class NameManage {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String firstName = null;
        String secondName = null;
        String thirdName = null;

        try {
            System.out.println("Please Enter first name \b: ");
            firstName = scanner.next();

            String newFirst = firstName.substring(1,2).concat(".") + firstName.substring(firstName.length() - 2);

            System.out.println("Please Enter second name \b: ");
            secondName = scanner.next();

            String newSecond = secondName.substring(1,2).concat(".") + secondName.substring(secondName.length() - 2);

            System.out.println("Please Enter third name \b: ");
            thirdName = scanner.next();

            String newThird = thirdName.substring(1,2).concat(".") + thirdName.substring(thirdName.length() - 2);

            System.out.println(newFirst.concat("_").concat(newSecond).concat("_").concat(newThird));
        } catch (Exception e){
            System.out.println("Please, enter right numbers");
            main(args);
            System.exit(0);
        }

    }
}
