import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.Dimension;

	public class Calendar extends JFrame {
		
		static Calendar grid = new Calendar();
		static Container container = grid.getContentPane();
		static ArrayList<JPanel>components = new ArrayList<JPanel>();
		static JFrame app;
		static JPanel panel1 = new JPanel();
		static JPanel panel2 = new JPanel();
		static Border blackline;
		public static void main(String[] args) {
			container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
			
			grid.add(panel1);
			grid.add(panel2);
			panel1.setPreferredSize(new Dimension(150, 150));
			panel2.setPreferredSize(new Dimension(350,300));
			grid.setTitle("Calendar");
			grid.setSize(500,350);
			grid.setResizable( true );
			grid.setLocationRelativeTo( null );
			JPanel temp = null;
			panel1.setBackground(Color.BLUE);
			panel2.setLayout( new GridLayout(6, 7));
			JLabel[] labels = new JLabel[42];
			blackline = BorderFactory.createLineBorder(Color.black);


			for (int i = 0; i < labels.length; i++) {
			    JLabel label = new JLabel();
			    label.setPreferredSize(new Dimension(22, 22 )); 
			    label.setBorder(blackline);
			    
			    
			    panel2.add(label);
			    labels[i] = label;
			}
			grid.setVisible(true);
		}

}
