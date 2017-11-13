package library;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.*;

public class AddFrame extends JFrame 
{
	private Frame owner;
	private JDialog dialog;
	private JTextArea text,text1,text2;
	private JComboBox<String> date;
	private JButton okbutton,cancelbutton;
	boolean ok=false;
	public AddFrame()
	{
		
		dialog=new JDialog(owner, true);
		dialog.setSize(500,100);
		text=new JTextArea(1,1);
		text1=new JTextArea(1,1);
		text2=new JTextArea(1,1);
		date=new JComboBox<>();

		for(int i=1200;i<=2017;i++)
		{
			date.addItem(""+i);
		}
		text2=new JTextArea(1,1);
		
		okbutton=new JButton("Wyślij");
	    cancelbutton=new JButton("Anuluj");
		cancelbutton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event) 
			{
				ok=true;
				dialog.setVisible(false);
							}
		});
		
		JPanel panel=new JPanel();

		GridBagLayout layout=new GridBagLayout();
		panel.setLayout(layout);
		//autor
		GridBagConstraints con=new GridBagConstraints();
		con.weightx=10;
		con.weighty=10;
		con.gridheight=1;
		con.gridwidth=1;
		con.gridx=1;
		con.gridy=0;
		//tytul
		GridBagConstraints con1=new GridBagConstraints();
		con1.weightx=10;
		con1.weighty=10;
		con1.gridheight=1;
		con1.gridwidth=1;
		con1.gridx=1;
		con1.gridy=1;
		//rok
		GridBagConstraints con2=new GridBagConstraints();
		con2.weightx=10;
		con2.weighty=10;
		con2.gridheight=1;
		con2.gridwidth=1;
		con2.gridx=1;
		con2.gridy=2;
		//etykieta
		GridBagConstraints con3=new GridBagConstraints();
		con3.weightx=10;
		con3.weighty=10;
		con3.gridheight=1;
		con3.gridwidth=1;
		con3.gridx=0;
		con3.gridy=1;
		//etukieta1
		GridBagConstraints con4=new GridBagConstraints();
		con4.weightx=10;
		con4.weighty=10;
		con4.gridheight=1;
		con4.gridwidth=1;
		con4.gridx=0;
		con4.gridy=0;
		//etykieta3
		GridBagConstraints con5=new GridBagConstraints();
		con5.weightx=10;
		con5.weighty=10;
		con5.gridheight=1;
		con5.gridwidth=1;
		con5.gridx=0;
		con5.gridy=2;
		
		GridBagConstraints con6=new GridBagConstraints();
		con6.weightx=10;
		con6.weighty=10;
		con6.gridheight=1;
		con6.gridwidth=1;
		con6.gridx=0;
		con6.gridy=3;
		
		GridBagConstraints con7=new GridBagConstraints();
		con7.weightx=10;
		con7.weighty=10;
		con7.gridheight=1;
		con7.gridwidth=1;
		con7.gridx=1;
		con7.gridy=3;
		
		add(panel,BorderLayout.CENTER);
		panel.add(new JLabel("Imię i nazwidko autora: "),con3);
		panel.add(text,con);
		panel.add(new JLabel("Tytuł: "),con4);
		panel.add(text1,con1);
		panel.add(new JLabel("Rok wydania:"),con5);
		panel.add(date,con2);
		panel.add(okbutton,con6);
		panel.add(cancelbutton,con7);
		add(panel,BorderLayout.SOUTH);
		dialog.add(panel);
		dialog.setVisible(true);

	}

	
	public Book getBook()
	{
		return new Book(text.getText(),text1.getText(),date.getItemAt(date.getSelectedIndex()));
	}
}
