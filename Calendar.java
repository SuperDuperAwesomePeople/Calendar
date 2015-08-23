import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

	public class Calendar extends JFrame {
		
		static Calendar grid = new Calendar();
		static Container container = grid.getContentPane();
		static ArrayList<JPanel>components = new ArrayList<JPanel>();
		static JFrame app;
		static JPanel panel1 = new JPanel();
		static JPanel panel2 = new JPanel();
		public static void main(String[] args) {
			container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
			
			grid.add(panel1);
			grid.add(panel2);
			panel1.setPreferredSize(new Dimension(150, 400));
			panel2.setPreferredSize(new Dimension(350,100));
			grid.setTitle("Calendar");
			grid.setSize(500,500);
			grid.setResizable( true );
			grid.setLocationRelativeTo( null );
			JPanel temp = null;
			panel1.setBackground(Color.BLUE);
			panel2.setBackground(Color.GREEN);
			grid.setVisible(true);
		}

}
