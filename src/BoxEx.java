import javax.swing.JOptionPane;

public class BoxEx {

	public static void main(String[] args) {
        Box box = new Box();
        
        box.setObj(1);
        int a = (int) box.getObj();
        JOptionPane.showMessageDialog(null, a);
        
        Box<Integer> box3 = new Box<>();
        box3.setObj(33);
        int bb = box3.getObj();
        JOptionPane.showMessageDialog(null, bb);
        
        
        Box<String> box2 = new Box<>();
        box2.setObj("nya");
        String b = box2.getObj();
        JOptionPane.showMessageDialog(null, b);
              
	}

}
