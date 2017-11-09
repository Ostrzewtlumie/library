package library;

import java.awt.*;

import javax.swing.*;

public class ExportFrame {
	private Frame owner;
	private JDialog dialog;
	public ExportFrame()
	{
		dialog=new JDialog(owner, true);
		dialog.setVisible(true);
	}
}
