package planer;

import java.util.Scanner;

public class Plan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Planer planer = new Planer(6);
        planer.create();
        while(true) {
            planer.menu();
            String cmd = scan.next();
            if(cmd.equals("close")) {
                scan.close();
                break;
            } else if(cmd.equals("edit")) {
                System.out.println("********** Stunde ändern **********");
                System.out.println("Tage als dreibuchstäbige Abkürzungen\n");
                System.out.print("Tag: ");
                String day = scan.next();
                System.out.print("Stunde: ");
                String h = scan.next();
                int hr = Integer.parseInt(h);
                System.out.print("Fach: ");
                String subject = scan.next();
                planer.change(day, hr, subject);
            } else if(cmd.equals("show")) {
                planer.show();
            } else {
                System.out.println("Invalid command\n");
            }
        }
    }
}