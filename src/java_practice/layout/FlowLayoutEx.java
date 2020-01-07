package java_practice.layout;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class FlowLayoutEx extends JFrame {
	private JButton sub;
	private JButton mul;
	private JButton div;
	private JButton Calculate;
	private JButton add;
	public FlowLayoutEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("FlowLayout Sample");
		getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		add = new JButton("add");
		getContentPane().add(add);
		
		sub = new JButton("sub");
		getContentPane().add(sub);
		
		mul = new JButton("mul");
		getContentPane().add(mul);
		
		div = new JButton("div");
		getContentPane().add(div);
		
		Calculate = new JButton("Calculate");
		getContentPane().add(Calculate);
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
        new FlowLayoutEx();
	}

}
