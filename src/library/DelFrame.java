package library;

import java.awt.*;

import javax.swing.*;

public class DelFrame extends JDialog {
	private Frame owner;
	private JDialog dialog;
	public DelFrame()
	{
		dialog=new JDialog(owner, true);
		dialog.setVisible(true);
	}
}
