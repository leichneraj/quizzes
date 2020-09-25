import java.util.Scanner;

public class Admissions {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean accepted;

        int elite = 0;
        int solid = 0;
        int acceptable = 0;
        int nope = 0;

        System.out.println("What is your first name?");
        String firstName = scanner.next();
        System.out.println("What is your last name?");
        String lastName = scanner.next();
        System.out.println("What is your SAT score?");
        int satScore = scanner.nextInt();
        System.out.println("What is your class rank? The higher the number the better.");
        int classRank = scanner.nextInt();
        System.out.println("How many awards do you have?");
        int awardsAmount = scanner.nextInt();
        System.out.println("What state do you reside in? Use capital letters as needed.");
        String state = scanner.next();

        scanner.close();

        if(satScore >= 1500) {
            elite++;
        } else if(satScore >= 1400) {
            solid++;
        } else if(satScore >= 1200) {
            acceptable++;
        } else {
            nope++;
        }

        if(classRank >= 95) {
            elite++;
        } if(classRank >= 90) {
            solid++;
        } else if(classRank >= 85) {
            acceptable++;
        } else {
            nope++;
        }

        if (awardsAmount >= 10) {
            elite++;
        } else if(awardsAmount >= 8) {
            solid++;
        } else if(awardsAmount >= 3) {
            acceptable++;
        } else {
            nope++;
        }

        if(state.contains("Colorado")) {
            elite++;
        } else if(state.contains("Florida")) {
            nope++;
        } else {
            acceptable++;
        }


        if(nope == 0) {
            if(lastName.contains("Padjen")) {
                System.out.println("\nYou have been accepted to Padjen University! Since your last name is Padjen you have instantly been accepted!");
            } else if(elite >= 1) {
                System.out.println("\nYou have been accepted to Padjen University! You have been found to contain " + elite + " of the elite level values. You needed only one or more and you had: " + elite);
            } else if(solid >=2) {
                System.out.println("\nYou have been accepted to Padjen University! You have been found to contain " + solid + " of the solid level values. You needed only two or more and you had: " + solid);
            } else {
                System.out.println("\nWe are all very sorry but you have not been accepted to Padjen University. This is due to the fact that you had only acceptable level skills and " + solid + " level skills.");
            }

        } else {
            System.out.println("\nI'm sorry but you have not been accepted to Padjen University. This is due to the fact that you had " + nope + " characteristic(s) that did not meet our standards.");
        }

    }

}