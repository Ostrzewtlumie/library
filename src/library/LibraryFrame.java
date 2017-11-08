package library;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LibraryFrame extends JFrame
{
	private JButton addbutton, deletebutton, showbutton, exportbutton;
	public LibraryFrame()
	{
		JPanel panel=new JPanel();
		newButton(panel,"Dodaj Ksiązkę",new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						JDialog frame=new JDialog();
						frame.setVisible(true);
					}
				});
		newButton(panel,"Usuń książkę",new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
			}
		});
		newButton(panel,"Pokaz ksiązki",new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
			}
		});
		newButton(panel,"Wyślij do txt",new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
			}
		});
		add(panel,BorderLayout.SOUTH);
		pack();
		
	}
	public void newButton(Container c,String title,ActionListener listener)
	{
		JButton button=new JButton(title);
		c.add(button);
		button.addActionListener(listener);
	}
}