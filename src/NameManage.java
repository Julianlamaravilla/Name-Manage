import javax.swing.*;
import java.util.Scanner;

public class NameManage {

    public static void main(String[] args){

        String firstName = null;
        String secondName = null;
        String thirdName = null;

        try {

            firstName = JOptionPane.showInputDialog(null, "Please Enter first name \b: ");
            String newFirst = firstName.substring(1,2).concat(".") + firstName.substring(firstName.length() - 2);

            secondName = JOptionPane.showInputDialog(null, "Please Enter second name \b: ");
            String newSecond = secondName.substring(1,2).concat(".") + secondName.substring(secondName.length() - 2);


            thirdName = JOptionPane.showInputDialog(null , "Please Enter third name \b: ");
            String newThird = thirdName.substring(1,2).concat(".") + thirdName.substring(thirdName.length() - 2);


            JOptionPane.showMessageDialog(null, newFirst.concat("_").concat(newSecond).concat("_").concat(newThird).toUpperCase());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null ,  "Please, enter right numbers");
            main(args);
            System.exit(0);
        }

    }
}
