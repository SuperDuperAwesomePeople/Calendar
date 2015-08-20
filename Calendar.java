import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.*;
	
	public class Calendar extends JFrame {
			
		static Calendar grid = new Calendar();
		static Container container = grid.getContentPane();
		static ArrayList<JPanel>components = new ArrayList<JPanel>();
		public static void main(String[] args) {
			Color blankColor = new Color(50, 50, 50, 50);
			grid.setTitle("The Bunny Calendar");
			grid.setSize(500,500);
			grid.setResizable( true );
			grid.setLocationRelativeTo( null );
			grid.setLayout( new GridLayout(50,50) );
			JPanel temp = null;
			for ( int i = 0; i < 2500; i++ )
			{
				  temp = new JPanel();
				  container.add(temp);
				  components.add(temp);
				  if (((i % 50) < 45) && ((i % 50 ) > 14) && (i > 250) && (i < 1750)) {
					  components.get(i).setBackground(blankColor);
				  }
				  else {
					  components.get( i ).setBackground( Color.WHITE );
				  }
			}
			grid.setVisible(true);
		}

}
