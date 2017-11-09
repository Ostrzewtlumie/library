package library;

import java.awt.*;

import javax.swing.*;

public class AddFrame extends JDialog {
	private Frame owner;
	private JDialog dialog;
	public AddFrame()
	{
		dialog=new JDialog(owner, true);
		dialog.setVisible(true);
	}
}
