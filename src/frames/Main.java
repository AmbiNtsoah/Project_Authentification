package frames;

import java.awt.EventQueue;

public class Main {
<<<<<<< HEAD
	/** 
	 * Classe qui contient permet d'afficher l'interface utilisateur
	 * Classe qui gère comment les fonctionnalités s'éxécute
	 * */
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
=======
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
>>>>>>> 935d8e7ce7cd6399ad72e5d586815bb49d777390
