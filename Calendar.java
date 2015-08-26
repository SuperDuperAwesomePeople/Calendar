import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.Dimension;

	public class Calendar extends JFrame implements MouseListener {
		
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
			grid.setSize(1000,600);
			grid.setResizable( true );
			grid.setLocationRelativeTo( null );
			JPanel temp = null;
			panel1.setBackground(Color.BLUE);
			panel2.setLayout( new GridLayout(6, 7));
			JLabel[] labels = new JLabel[42];
			blackline = BorderFactory.createLineBorder(Color.black);


			for (int i = 0; i < labels.length; i++) {
			    JLabel label = new JLabel("", SwingConstants.CENTER);
			    if (i == 0){
			    	label.setText("Sunday");
			    } else if (i == 1) {
			    	label.setText("Monday");
			    } else if (i == 2) {
			    	label.setText("Tuesday");
			    } else if (i == 3) {
			    	label.setText("Wednesday");
			    } else if (i == 4) {
			    	label.setText("Thursday");
			    } else if (i == 5) {
			    	label.setText("Friday");
			    } else if (i == 6) {
			    	label.setText("Saturday");
			    }
			    label.setPreferredSize(new Dimension(22, 22 )); 
			    if (i <= 37 && i > 6) {
			    	label.setText(Integer.toString(i-6));
			    	label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			        label.setHorizontalTextPosition(JLabel.RIGHT);
					label.setBorder(blackline);
					label.addMouseListener(new MouseAdapter()  
					{  
					    public void mouseClicked(MouseEvent e)  
					    {  
					    	JOptionPane.showMessageDialog(null, "Yer a fluffy, Harry");
					    }  
					}); 
			    }
	
			    panel2.add(label);
			    labels[i] = label;

			}
		    String[] months = { "January","February", "March","April","May","June", "July", "August", "September", "October", "November", "December"};

		    final JComboBox<String> cb = new JComboBox<String>(months);

		    cb.setVisible(true);
		    panel1.add(cb);
			grid.setVisible(true);
			
			
		}
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

}
	
