/*
In this class three objects is created (daddy, mummy and me) and the information
about their hobbies is input and displayed
 */
package Practice3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Hobby daddy = new Hobby();                         //call constructor without parameters
        daddy.setWhoseHobby("my daddy");
        daddy.setWhatHobby("football");
        //daddy.getS1();
        daddy.tellAboutHobby();

        Hobby mummy = new Hobby("my mummy", "skating"); //call constructor with
        mummy.tellAboutHobby();                                                 // 2 parameters

        Hobby me = new Hobby("mine");          //call constructor with 1 parameters
        System.out.println("What is your hobby?");          //input from keyboard
        Scanner scanner = new Scanner(System.in);
        String myHobby = scanner.nextLine();
        me.setWhatHobby(myHobby);
        System.out.println(me.toString());

        Hobby[] arrayOfHobbies = new Hobby[3];              //creating array of objects
        arrayOfHobbies[0] = daddy;                          //initializing array
        arrayOfHobbies[1] = mummy;
        arrayOfHobbies[2] = me;
        System.out.println();
        System.out.println("Realization thechess method tellAboutHobby through the array: ");
        for (int i = 0; i < 3; i++) {
            arrayOfHobbies[i].tellAboutHobby();
        }
    }
}