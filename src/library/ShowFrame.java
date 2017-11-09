package library;

import java.awt.*;

import javax.swing.*;

public class ShowFrame {
	private Frame owner;
	private JDialog dialog;
	public ShowFrame()
	{
		dialog=new JDialog(owner, true);
		dialog.setVisible(true);
	}
}
