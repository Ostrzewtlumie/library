package library;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ShowFrame extends JFrame
{
	private Frame owner;
	private JDialog dialog;

	private JButton backbutton;
	public ShowFrame()
	{
		for (Book b: LibraryFrame.book)
			System.out.println(b.getName()+" "+b.getTitle()+" "+b.getPublic());
		dialog=new JDialog(owner, true);
		dialog.setSize(500,100);

		JPanel panel=new JPanel();
		
		backbutton=new JButton("Cofnij");
		backbutton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event) 
			{
				dialog.setVisible(false);
			}

		
		});
		
		add(panel,BorderLayout.CENTER);
		panel.add(backbutton);
		add(panel,BorderLayout.SOUTH);
		dialog.add(panel);
		dialog.setVisible(true);
	}
}