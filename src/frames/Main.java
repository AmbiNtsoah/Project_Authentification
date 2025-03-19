package frames;

import java.awt.EventQueue;

/**
 * La classe principale
 * Le point d'entrée de notre application Authentification
 */
public class Main {

	/** 
	 * Classe qui contient permet d'afficher l'interface utilisateur
	 * Classe qui gère comment les fonctionnalités s'éxécute
	 * */
	public static void main(String[] args) {
        /** Créez une instance de DBConnect pour vous assurer que la table est créée */
        DBConnect dbConnect = new DBConnect();

        /** Lancez l'application GUI */
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