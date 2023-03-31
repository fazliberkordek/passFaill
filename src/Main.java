/**
 * @author fazliberkordek
 */

import java.util.Scanner;
/* TODO:Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
    Ödev: Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.


*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, phsyc, turkish, chemistry, music, totalClass = 5;
        double avarageGrade = 0;


        System.out.print("Enter the Math exam result");
        math = input.nextInt();
        if (math < 0 || math > 100) {
            System.out.println("ınvalid user input!");
            totalClass -= 1;
        } else {
            avarageGrade += math;
        }

        System.out.print("Enter the Phyics exam result");
        phsyc = input.nextInt();
        if (phsyc < 0 || phsyc > 100) {
            System.out.println("Invalid user input");
            totalClass -= 1;
        } else {
            avarageGrade += phsyc;
        }

        System.out.print("Enter the Turkish exam result");
        turkish = input.nextInt();
        if (turkish < 0 || turkish > 100) {
            System.out.println("Invalid user input");
            totalClass -= 1;
        } else {
            avarageGrade += turkish;
        }


        System.out.print("Enter the Chemistry exam result");
        chemistry = input.nextInt();
        if (chemistry < 0 || chemistry > 100) {
            System.out.println("Invalid user input");
            totalClass -= 1;
        } else {
            avarageGrade += chemistry;
        }

        System.out.print("Enter the Music exam result");
        music = input.nextInt();

        if (music < 0 || music > 100) {
            System.out.println("Invalid user input");
            totalClass -= 1;
        } else {
            avarageGrade += music;
        }

        double avarage = avarageGrade / totalClass;

        System.out.println(avarage >= 55 ? "You have Passed" : "You have Failed");
        System.out.println("Your avarage is : " + avarage);
    }

}