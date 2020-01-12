import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class IteratorEx {

	public static void main(String[] args) {
     ArrayList arr = new ArrayList();
     arr.add(1);
     arr.add(2);
     arr.add(3);
     
    // JOptionPane.showMessageDialog(null, arr);
     
     arr.remove(1);
   //  JOptionPane.showMessageDialog(null, arr);
     arr.add(1,10);
   //  JOptionPane.showMessageDialog(null, arr);
     
     for(Iterator i = arr.iterator(); i.hasNext();) {
    	// JOptionPane.showMessageDialog(null, i.next());
        int i2 = (int) i.next();	 
        System.out.print(i2+" ");
      }
	}
}
