package library;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.*;

import javafx.print.Printer;


public class ExportFrame extends JFrame
{
	private Frame owner;
	private JDialog dialog;
	private JTextArea text;
	private JButton okbutton,cancelbutton;
	public ExportFrame()
	{
		dialog=new JDialog(owner, true);
		dialog.setSize(500,100);
		text=new JTextArea(1,10);
		okbutton=new JButton("Wyślij");
		okbutton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event) 
			{
				try {
					PrintWriter pw=new PrintWriter(new FileOutputStream(GetPath()));
					for(Book b: LibraryFrame.book)
					{
						pw.println(b.getName()+" "+b.getTitle()+" "+b.getPublic());
					}
					pw.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				dialog.setVisible(false);
			}

		
		});
	    cancelbutton=new JButton("Anuluj");
		cancelbutton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event) 
			{
				dialog.setVisible(false);
			}

		
		});
		JPanel panel=new JPanel();

		GridBagLayout layout=new GridBagLayout();
		panel.setLayout(layout);
		//etykieta1
		GridBagConstraints con=new GridBagConstraints();
		con.weightx=10;
		con.weighty=10;
		con.gridheight=1;
		con.gridwidth=1;
		con.gridx=0;
		con.gridy=0;
		//nazwa pliku
		GridBagConstraints con1=new GridBagConstraints();
		con1.weightx=10;
		con1.weighty=10;
		con1.gridheight=1;
		con1.gridwidth=1;
		con1.gridx=1;
		con1.gridy=0;
		//przycisk ok
		GridBagConstraints con2=new GridBagConstraints();
		con2.weightx=10;
		con2.weighty=10;
		con2.gridheight=1;
		con2.gridwidth=1;
		con2.gridx=0;
		con2.gridy=1;
		//przycisk anuluj
		GridBagConstraints con3=new GridBagConstraints();
		con3.weightx=10;
		con3.weighty=10;
		con3.gridheight=1;
		con3.gridwidth=1;
		con3.gridx=1;
		con3.gridy=1;
		
		add(panel,BorderLayout.CENTER);
		panel.add(new JLabel("Podaj plik do jakiego chcesz eksportować dane:"),con);
		panel.add(text,con1);
		panel.add(okbutton,con2);
		panel.add(cancelbutton,con3);
		add(panel,BorderLayout.SOUTH);
		dialog.add(panel);
		dialog.setVisible(true);
	}
	public String GetPath()
	{
		return text.getText();
	}
}