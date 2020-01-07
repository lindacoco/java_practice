package java_practice.layout;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BorderLayoutEx extends JFrame implements ActionListener {
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	public BorderLayoutEx() {
		initialize();
	}
	private void initialize() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(30, 20));
		
		btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(this);
		getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		btnNewButton_1 = new JButton("add");
		getContentPane().add(btnNewButton_1, BorderLayout.NORTH);
		
		btnNewButton_2 = new JButton("div");
		getContentPane().add(btnNewButton_2, BorderLayout.WEST);
		
		btnNewButton_3 = new JButton("mul");
		getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		btnNewButton_4 = new JButton("sub");
		getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
     new BorderLayoutEx();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			btnNewButtonActionPerformed(e);
		}
	}
	protected void btnNewButtonActionPerformed(ActionEvent e) {
	}
}
