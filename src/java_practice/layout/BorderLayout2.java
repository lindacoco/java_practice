package java_practice.layout;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class BorderLayout2 extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;


	public BorderLayout2() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(30, 20));
		
		btnNewButton = new JButton("Calculate");
		contentPane.add(btnNewButton, BorderLayout.CENTER);
		
		btnNewButton_1 = new JButton("add");
		contentPane.add(btnNewButton_1, BorderLayout.NORTH);
		
		btnNewButton_2 = new JButton("div");
		contentPane.add(btnNewButton_2, BorderLayout.WEST);
		
		btnNewButton_3 = new JButton("mul");
		contentPane.add(btnNewButton_3, BorderLayout.EAST);
		
		btnNewButton_4 = new JButton("sub");
		contentPane.add(btnNewButton_4, BorderLayout.SOUTH);
	}

}
