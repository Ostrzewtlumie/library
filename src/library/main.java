package library;
import java.awt.*;
import javax.swing.*;
public class main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
				{
				public void run() {
					JFrame frame=new LibraryFrame();
					frame.setTitle("Biblioteka");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			});
	}

}
<<<<<<< HEAD
=======

>>>>>>> 668f1f93ebc05cf98b800b3ce0d4d52dc60c9d13
