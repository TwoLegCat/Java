package head;

import javax.swing.JOptionPane;
public class Head {
    public static void main(String[] args) {
        int streak = 0;
        int solution;
        do {
            int x = (int) Math.floor((Math.random() * 198)) - 99;
            int y = (int) Math.floor((Math.random() * 198)) - 99;
            solution = x + y;
            String answer = JOptionPane.showInputDialog("Question: " + x + " + " + y);
            int ans = Integer.parseInt(answer);
            if(solution == ans) {
                streak++;
            } else {
                JOptionPane.showMessageDialog(null, "Leider falsch, das richtige Ergebnis ist " + solution + ", Streak: " + streak, "Leider Falsch", 0);
                streak = 0;
            }
        } while(streak > 0);
        
    }
}
