package library;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LibraryFrame extends JFrame
{
	private JButton addbutton, deletebutton, showbutton, exportbutton;
	private AddFrame addframe;
	private DelFrame delframe;
	private ShowFrame showframe;
	private ExportFrame exportframe;
	private JFrame owner;
	public LibraryFrame()
	{
		JPanel panel=new JPanel();
		newButton(panel,"Dodaj Ksiązkę",new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						addframe=new AddFrame();
					}
				});
		newButton(panel,"Usuń książkę",new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				delframe=new DelFrame();
			}
		});
		newButton(panel,"Pokaz ksiązki",new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				showframe=new ShowFrame();			
			}
		});
		newButton(panel,"Wyślij do txt",new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				exportframe=new ExportFrame();
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