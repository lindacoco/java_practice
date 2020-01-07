package java_practice.swing;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class ContentPaneEx extends JFrame {
	private JButton OK;
	private JButton Cancel;
	private JButton Ignore;
	public ContentPaneEx() {
		initialize();
	}
	private void initialize() {
		getContentPane().setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("ContentPane과 JFrame");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		OK = new JButton("OK");
		getContentPane().add(OK);
		
		Cancel = new JButton("Cancel");
		getContentPane().add(Cancel);
		
		Ignore = new JButton("Ignore");
		getContentPane().add(Ignore);
		
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
          new ContentPaneEx();
	}

}
