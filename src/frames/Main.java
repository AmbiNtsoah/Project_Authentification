package frames;

import java.awt.EventQueue;

public class Main {
    public static void main(String[] args) {
        // Créez une instance de DBConnect pour vous assurer que la table est créée
        DBConnect dbConnect = new DBConnect();

        // Lancez l'application GUI
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrame frame = new MainFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}