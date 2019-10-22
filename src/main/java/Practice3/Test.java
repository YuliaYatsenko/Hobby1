/*
In this class three objects is created (daddy, mummy and me) and the information
about their hobbies is input and displayed
 */
package Practice3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Hobby daddy = new PapaHobby("my daddy", "football", 1);

        Hobby me = new MyHobby("My", "chess",5);

        Hobby mummy = new MyHobby("My mummy", "sewing", 10);

        Hobby arrayOfHobbies[] = {daddy, me, mummy};                        //initializing array
        System.out.println();
        for (Hobby s:arrayOfHobbies){
            s.tellAboutHobby();
        }
    }
}