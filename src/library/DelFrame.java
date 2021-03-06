package library;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DelFrame extends JFrame 
{
	private Frame owner;
	private JDialog dialog;
	private JTextArea text;
	private JButton deletebutton,cancelbutton;
	boolean ok=false;
	public DelFrame()
	{
		dialog=new JDialog(owner, true);
		dialog.setSize(500,100);
		text=new JTextArea(1,10);
		deletebutton=new JButton("Usuń");
		deletebutton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event) 
			{
				dialog.setVisible(false);
				ok=true;
			}

		
		});
		cancelbutton=new JButton("Anuluj");
		cancelbutton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event) 
			{
				dialog.setVisible(false);
				ok=false;
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
		//tytul ksiazki
		GridBagConstraints con1=new GridBagConstraints();
		con1.weightx=10;
		con1.weighty=10;
		con1.gridheight=1;
		con1.gridwidth=1;
		con1.gridx=1;
		con1.gridy=0;
		//przycisk usuniecia
		GridBagConstraints con2=new GridBagConstraints();
		con2.weightx=10;
		con2.weighty=10;
		con2.gridheight=1;
		con2.gridwidth=1;
		con2.gridx=0;
		con2.gridy=1;
		//przycisk anulowania
		GridBagConstraints con3=new GridBagConstraints();
		con3.weightx=10;
		con3.weighty=10;
		con3.gridheight=1;
		con3.gridwidth=1;
		con3.gridx=1;
		con3.gridy=1;
		
		add(panel,BorderLayout.CENTER);
		panel.add(new JLabel("podaj tytuł książki do usuniecia: "),con);
		panel.add(text,con1);
		panel.add(deletebutton,con2);
		panel.add(cancelbutton,con3);
		add(panel,BorderLayout.SOUTH);
		dialog.add(panel);
		dialog.setVisible(true);
	}
	public String getTitlee()
		{
			return text.getText();
		
		}
}