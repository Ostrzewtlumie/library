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

