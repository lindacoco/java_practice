package java_practice.layout;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class GridLayoutEx extends JFrame {

	private JPanel contentPane;
	private JLabel 이름;
	private JTextField textField;
	private JLabel 학번;
	private JTextField textField_1;
	private JLabel 학과;
	private JTextField textField_2;
	private JLabel 과목;
	private JTextField textField_3;

	
	public GridLayoutEx() {
		initialize();
	}
	private void initialize() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 2, 10, 0));
		
		이름 = new JLabel("이름");
		이름.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(이름);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		학번 = new JLabel("학번");
		학번.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(학번);
		
		textField_1 = new JTextField();
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		학과 = new JLabel("학원");
		학과.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(학과);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		과목 = new JLabel("과목");
		과목.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(과목);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		contentPane.add(textField_3);
	}

}
