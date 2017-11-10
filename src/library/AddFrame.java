package library;

import java.awt.*;

import javax.swing.*;

public class AddFrame extends JDialog 
{
	private Frame owner;
	private JDialog dialog;
	private JTextArea text;
	public AddFrame()
	{
		dialog=new JDialog(owner, true);
		dialog.setSize(100,100);
		text=new JTextArea(1,1);
		JPanel panel=new JPanel();
		add(panel,BorderLayout.CENTER);
		panel.add(new JLabel("Autor"));
		panel.add(text);
		add(panel,BorderLayout.SOUTH);
		dialog.add(panel);
		dialog.setVisible(true);
	}
}

