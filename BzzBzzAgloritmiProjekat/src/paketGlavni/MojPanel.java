package paketGlavni;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MojPanel extends JPanel {
    int visina=12;

    
	ArrayList<Integer> listaPanel;
	public MojPanel(ArrayList<Integer> listaPanel) {
		this.listaPanel=listaPanel;
	}
	
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;
		int xKordinata=50;
		//for(int j=0;j<listaPanel.size(); j++) {
			
			
		//}}
		
		for(int i=1;i<listaPanel.size();i++) {
			 if((listaPanel.get(i)==Algoritam.min)&&(i<listaPanel.size()-1)) {
		    	 g2.setColor(Color.ORANGE);
		    	 g2.fill(new Rectangle2D.Double(xKordinata, 615-listaPanel.get(i)*visina, 10, listaPanel.get(i)*visina)); 
		         g2.setColor(Color.BLUE);    
		         }
			 else {   
			g2.setColor(Color.BLUE);
		g2.fill(new Rectangle2D.Double(xKordinata, 615-listaPanel.get(i)*visina, 10, listaPanel.get(i)*visina));
			 }
		xKordinata+=11;
		}
	}
	
	
	
}
