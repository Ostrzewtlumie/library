package library;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ShowFrame extends JFrame
{
	private Frame owner;
	private JDialog dialog;
	private JLabel label,label1;

	private int i=0;
	private JButton backbutton;
	public ShowFrame()
	{
		dialog=new JDialog(owner, true);
		dialog.setSize(500,100);

		JPanel panel=new JPanel();
		GridBagLayout layout=new GridBagLayout();
		panel.setLayout(layout);
		
		
		for (Book b: LibraryFrame.book)
		{
			GridBagConstraints con=new GridBagConstraints();
			con.weightx=10;
			con.weighty=10;
			con.gridheight=1;
			con.gridwidth=1;
			con.gridx=0;
			con.gridy=i;
			 label=new JLabel();
			 label.setText(b.getName()+" "+b.getTitle()+" "+b.getPublic()+"\n");
			 
			 panel.add(label,con);
			 i++;
		}
		
		GridBagConstraints con1=new GridBagConstraints();
		con1.weightx=10;
		con1.weighty=10;
		con1.gridheight=1;
		con1.gridwidth=1;
		con1.gridx=0;
		con1.gridy=i+1;
		
		backbutton=new JButton("Cofnij");
		backbutton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event) 
			{
				dialog.setVisible(false);
			}

		
		});
		
		add(panel,BorderLayout.CENTER);
		panel.add(backbutton,con1);
		add(panel,BorderLayout.SOUTH);
		dialog.add(panel);
		dialog.setVisible(true);
	}
}