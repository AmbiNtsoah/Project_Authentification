package frames;

import java.awt.EventQueue;


/**
 * Classe Main pour lancer l'application.
 * Cette classe contient le point d'entrée principal de l'application et initialise la fenêtre principale.
 */
public class Main {

	public static void main(String[] args) {
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
