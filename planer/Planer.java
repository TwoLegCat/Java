package planer;

public class Planer {
    int hrs;
    public Planer(int h) {
        this.hrs = h;
    }
    String[][] planer = new String[5][6];
    String[] subjects = {"Phy", "Eva", "Eng", "Pow", "Mat", "Deu", "Mus", "Spo", "Inf", "Ges"};
    void show() {
        System.out.println("Mon\tDie\tMit\tDon\tFre");
        System.out.println("-----------------------------------");
        for(int j = 0; j < hrs; j++) {
            for(int i = 0; i < 5; i++) {
                System.out.print(planer[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    void create() {
        for(int j = 0; j < hrs; j++) {
            for(int i = 0; i < 5; i++) {
                planer[i][j] = subjects[(int) Math.floor(Math.random() * subjects.length)];
            }
        }
    }
    //change planer
    void change(String d, int h, String subj) {
        int day = -1;
        switch(d) {
            case "Fre": day++;
            case "Don": day++;
            case "Mit": day++;
            case "Die": day++;
            case "Mon": day++;
        }
        if(day < 0) {
            System.out.println("Invalid day");
        } else if(--h > hrs) {
            System.out.println("Invalid hour"); 
        } else {
            planer[day][h] = subj;
            System.out.println("Changes made!");
        }
    }
    void menu() {
        System.out.println("********** Stundenplaner **********");
        System.out.println("Ansehen: show\n");
        System.out.println("Editieren: edit\n");
        System.out.println("Schließen: close\n");
    }
}