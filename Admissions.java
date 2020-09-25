import java.util.Scanner;

public class Admissions {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Elite;
        int solid;
        int acceptable;
        int nope;

        System.out.println("What is your SAT score?");
        int satScore = scanner.nextInt();
        System.out.println("What is your class rank?");
        int classRank = scanner.nextInt();
        System.out.println("How many awards do you have?");
        int awardsAmount = scanner.nextInt();
        System.out.println("What state do you reside in?");

        if(satScore >= 1500) {
            Elite++;
        } else if(satScore >= 1400) {
            solid++;
        } else if(satScore >= 1200) {
            acceptable++;
        } else {
            nope++;
        }

        if(classRank >= 95) {
            Elite++;
        } if(classRank >= 90) {
            solid++;
        } // not done yet, was doing college board sign up.

    }

}
