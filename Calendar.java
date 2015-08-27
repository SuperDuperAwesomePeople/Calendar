import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
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
		static JPanel addEvent = new JPanel();
		static Border blackline;
		static Border empty;
		static JButton cmd = new JButton();
		public static void main(String[] args) {
			JTextField addEventText = new JTextField();
			addEvent.add(addEventText);
			
			cmd.setText("Add Event");
			cmd.setVerticalTextPosition(AbstractButton.CENTER);
			cmd.setHorizontalTextPosition(AbstractButton.LEADING);
			cmd.setEnabled(true);
			cmd.addActionListener(new ActionListener()
			{
			  public void actionPerformed(ActionEvent e)
			  {
			    JDialog d = new JDialog(grid, "Add Your Event Here", true);
			    d.setLocationRelativeTo(grid);
			    d.add(addEvent);
			    d.setMinimumSize(new Dimension(300, 200));
			    d.setVisible(true);
			  }
			});
			
			container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
			Color cbc = new Color(118, 196, 174);
			grid.add(panel1);
			grid.add(panel2);
			panel1.setPreferredSize(new Dimension(150, 150));
			panel2.setPreferredSize(new Dimension(350,300));
			grid.setTitle("Calendar");
			grid.setSize(1000,600);
			grid.setResizable( true );
			grid.setLocationRelativeTo( null );
			panel1.setBackground(cbc);
			panel2.setLayout( new GridLayout(7, 7));
			JLabel[] labels = new JLabel[49];
			blackline = BorderFactory.createLineBorder(Color.black);
			empty = BorderFactory.createEmptyBorder();


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
			    if (i <= 41 && i > 10) {
			    	label.setText(Integer.toString(i-10));
			        label.setHorizontalTextPosition(JLabel.RIGHT);
					label.setBorder(blackline);
		    		label.addMouseListener(new MouseAdapter()  
		    		   {  
		    			   public void mouseClicked(MouseEvent e)  
		    			   {  
		    				   JOptionPane.showMessageDialog(null, "Events Listed Here");
		    			   }  
		    		   }); 
		    		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			    }
	
			    panel2.add(label);
			    labels[i] = label;

			}
		    String[] months = { "January","February", "March","April","May","June", "July", "August", "September", "October", "November", "December"};
		    final JComboBox<String> cb = new JComboBox<String>(months);
		    cb.addActionListener(
		                new ActionListener(){
		                    public void actionPerformed(ActionEvent e){
		                       String currentMonth = (String)cb.getSelectedItem();
		                       if (currentMonth == "January"){
		           		    	   for (int i = 7; i < 49; i++ ){ 
		           		    		   labels[i].setText("");
		           		    		   labels[i].setBorder(empty);
		           		    		   if (i < 42 && i > 10) {
			           		    		   labels[i].setText(Integer.toString(i-10));
			           		    		   labels[i].setBorder(blackline);
			           		    		   labels[i].addMouseListener(new MouseAdapter()  
			           		    		   {  
			           		    			   public void mouseClicked(MouseEvent e)  
			           		    			   {  
			           		    				   JOptionPane.showMessageDialog(null, "Events Listed Here");
			           		    			   }  
			           		    		   }); 
			           		    		   labels[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		           		    		   }
		           		    	   }
		        		       }
		           		       if (currentMonth == "February"){
		           		    	   for (int i = 7; i < 49; i++ ){ 
		           		    		   labels[i].setText("");
		           		    		   labels[i].setBorder(empty);
		           		    		   if (i < 35) {
			           		    		   labels[i].setText(Integer.toString(i-6));
			           		    		   labels[i].setBorder(blackline);
			           		    		   labels[i].addMouseListener(new MouseAdapter()  
			           		    		   {  
			           		    			   public void mouseClicked(MouseEvent e)  
			           		    			   {  
			           		    				   JOptionPane.showMessageDialog(null, "Events Listed Here");
			           		    			   }  
			           		    		   }); 
			           		    		   labels[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		           		    		   }
		           		    	   }
		        		       }
		           		       if (currentMonth == "March"){
		           		    	   for (int i = 7; i < 49; i++ ){ 
		           		    		   labels[i].setText("");
		           		    		   labels[i].setBorder(empty);
		           		    		   if (i < 38) {
			           		    		   labels[i].setText(Integer.toString(i-6));
			           		    		   labels[i].setBorder(blackline);
			           		    		   labels[i].addMouseListener(new MouseAdapter()  
			           		    		   {  
			           		    			   public void mouseClicked(MouseEvent e)  
			           		    			   {  
			           		    				   JOptionPane.showMessageDialog(null, "Events Listed Here");
			           		    			   }  
			           		    		   }); 
			           		    		   labels[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		           		    		   }
		           		    	   }
		        		       }
		           		       if (currentMonth == "April"){
		           		    	   for (int i = 7; i < 49; i++ ){ 
		           		    		   labels[i].setText("");
		           		    		   labels[i].setBorder(empty);
		           		    		   if (i < 40 && i > 9) {
			           		    		   labels[i].setText(Integer.toString(i-9));
			           		    		   labels[i].setBorder(blackline);
			           		    		   labels[i].addMouseListener(new MouseAdapter()  
			           		    		   {  
			           		    			   public void mouseClicked(MouseEvent e)  
			           		    			   {  
			           		    				   JOptionPane.showMessageDialog(null, "Events Listed Here");
			           		    			   }  
			           		    		   }); 
			           		    		   labels[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		           		    		   }
		           		    	   }
		        		       }
		           		       if (currentMonth == "May"){
		           		    	   for (int i = 7; i < 49; i++ ){ 
		           		    		   labels[i].setText("");
		           		    		   labels[i].setBorder(empty);
		           		    		   if (i > 11 && i < 43) {
			           		    		   labels[i].setText(Integer.toString(i-11));
			           		    		   labels[i].setBorder(blackline);
			           		    		   labels[i].addMouseListener(new MouseAdapter()  
			           		    		   {  
			           		    			   public void mouseClicked(MouseEvent e)  
			           		    			   {  
			           		    				   JOptionPane.showMessageDialog(null, "Events Listed Here");
			           		    			   }  
			           		    		   }); 
			           		    		   labels[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		           		    		   }
		           		    	   }
		        		       }
		           		       if (currentMonth == "June"){
		           		    	   for (int i = 7; i < 49; i++ ){ 
		           		    		   labels[i].setText("");
		           		    		   labels[i].setBorder(empty);
		           		    		   if (i < 38 && i > 7) {
			           		    		   labels[i].setText(Integer.toString(i-7));
			           		    		   labels[i].setBorder(blackline);
			           		    		   labels[i].addMouseListener(new MouseAdapter()  
			           		    		   {  
			           		    			   public void mouseClicked(MouseEvent e)  
			           		    			   {  
			           		    				   JOptionPane.showMessageDialog(null, "Events Listed Here");
			           		    			   }  
			           		    		   }); 
			           		    		   labels[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		           		    		   }
		           		    	   }
		        		       }
		           		       if (currentMonth == "July"){
		           		    	   for (int i = 7; i < 49; i++ ){ 
		           		    		   labels[i].setText("");
		           		    		   labels[i].setBorder(empty);
		           		    		   if (i < 41 && i > 9) {
			           		    		   labels[i].setText(Integer.toString(i-9));
			           		    		   labels[i].setBorder(blackline);
			           		    		   labels[i].addMouseListener(new MouseAdapter()  
			           		    		   {  
			           		    			   public void mouseClicked(MouseEvent e)  
			           		    			   {  
			           		    				   JOptionPane.showMessageDialog(null, "Events Listed Here");
			           		    			   }  
			           		    		   }); 
			           		    		   labels[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		           		    		   }
		           		    	   }
		        		       }
		           		       if (currentMonth == "August"){
		           		    	   for (int i = 7; i < 49; i++ ){ 
		           		    		   labels[i].setText("");
		           		    		   labels[i].setBorder(empty);
		           		    		   if (i > 12 && i < 44) {
			           		    		   labels[i].setText(Integer.toString(i-12));
			           		    		   labels[i].setBorder(blackline);
			           		    		   labels[i].addMouseListener(new MouseAdapter()  
			           		    		   {  
			           		    			   public void mouseClicked(MouseEvent e)  
			           		    			   {  
			           		    				   JOptionPane.showMessageDialog(null, "Events Listed Here");
			           		    			   }  
			           		    		   }); 
			           		    		   labels[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		           		    		   }
		           		    	   }
		        		       }
		           		       if (currentMonth == "September"){
		           		    	   for (int i = 7; i < 49; i++ ){ 
		           		    		   labels[i].setText("");
		           		    		   labels[i].setBorder(empty);
		           		    		   if (i < 39 && i > 8) {
			           		    		   labels[i].setText(Integer.toString(i-8));
			           		    		   labels[i].setBorder(blackline);
			           		    		   labels[i].addMouseListener(new MouseAdapter()  
			           		    		   {  
			           		    			   public void mouseClicked(MouseEvent e)  
			           		    			   {  
			           		    				   JOptionPane.showMessageDialog(null, "Events Listed Here");
			           		    			   }  
			           		    		   }); 
			           		    		   labels[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		           		    		   }
		           		    	   }
		        		       }
		           		       if (currentMonth == "October"){
		           		    	   for (int i = 7; i < 49; i++ ){ 
		           		    		   labels[i].setText("");
		           		    		   labels[i].setBorder(empty);
		           		    		   if (i > 10 && i < 42) {
			           		    		   labels[i].setText(Integer.toString(i-10));
			           		    		   labels[i].setBorder(blackline);
			           		    		   labels[i].addMouseListener(new MouseAdapter()  
			           		    		   {  
			           		    			   public void mouseClicked(MouseEvent e)  
			           		    			   {  
			           		    				   JOptionPane.showMessageDialog(null, "Events Listed Here");
			           		    			   }  
			           		    		   }); 
			           		    		   labels[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		           		    		   }
		           		    	   }
		        		       }
		           		       if (currentMonth == "November"){
		           		    	   for (int i = 7; i < 49; i++ ){ 
		           		    		   labels[i].setText("");
		           		    		   labels[i].setBorder(empty);
		           		    		   if (i < 37 && i > 6) {
			           		    		   labels[i].setText(Integer.toString(i-6));
			           		    		   labels[i].setBorder(blackline);
			           		    		   labels[i].addMouseListener(new MouseAdapter()  
			           		    		   {  
			           		    			   public void mouseClicked(MouseEvent e)  
			           		    			   {  
			           		    				   JOptionPane.showMessageDialog(null, "Events Listed Here");
			           		    			   }  
			           		    		   }); 
			           		    		   labels[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		           		    		   }
		           		    	   }
		        		       }
		           		       if (currentMonth == "December"){
		           		    	   for (int i = 7; i < 49; i++ ){ 
		           		    		   labels[i].setText("");
		           		    		   labels[i].setBorder(empty);
		           		    		   if (i < 40 && i > 8) {
			           		    		   labels[i].setText(Integer.toString(i-8));
			           		    		   labels[i].setBorder(blackline);
			           		    		   labels[i].addMouseListener(new MouseAdapter()  
			           		    		   {  
			           		    			   public void mouseClicked(MouseEvent e)  
			           		    			   {  
			           		    				   JOptionPane.showMessageDialog(null, "Events Listed Here");
			           		    			   }  
			           		    		   }); 
			           		    		   labels[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		           		    		   }
		           		    	   }
		        		       }
		                    }
		                }            
		        );


		    cb.setVisible(true);
		    panel1.add(cb);
			panel1.add(cmd);
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
