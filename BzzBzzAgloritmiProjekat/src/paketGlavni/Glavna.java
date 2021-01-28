package paketGlavni;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Glavna {

	public static void main(String[] args) {
        Random r=new Random();
        	
		ArrayList<Integer> lista=new ArrayList<>();
	
		for(int i=0;i<50;i++) {
			int rand1=-1;
			boolean daLiSePonavlja=true;
			
			 rand1=r.nextInt(51);    
			 lista.add(rand1);
		
			 while(daLiSePonavlja){
			
				 daLiSePonavlja=false;
			 for(int j=0;j<lista.size()-1;j++) {
				 
				 if(lista.get(i)==lista.get(j)) {
					 rand1=r.nextInt(51);
					 lista.set(i, rand1);
					 daLiSePonavlja=true;
				 }//else {daLiSePonavlja=false;}
				
			 }
			 
			 }}
		
		for(int i=0;i<lista.size();i++) {
			
			System.out.println(lista.get(i));
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
	
        JFrame prozor=new JFrame();
        MojPanel p=new MojPanel(lista);
        JPanel panelSever=new JPanel();
        Nit nit=new Nit(p);
        JButton dugme1=new JButton("Random Niz");
        dugme1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nit.suspend();
				for(int i=0;i<50;i++) {
					int rand1=r.nextInt(51);
					lista.set(i, rand1);
					
					p.repaint();
					} 	 }
		});
        
        
        JButton dugme2=new JButton("Pokreni");
        
        dugme2.addActionListener(new ActionListener() {
        	  int ll=0;
			public void actionPerformed(ActionEvent e) {
				nit.a.i=30;
				if(ll==0) {
				nit.start(); 
				ll++;         }
				else { nit.resume(); }
				 
	
				
			}
		});
        panelSever.add(dugme1);
        panelSever.add(dugme2);
        prozor.add(panelSever, BorderLayout.NORTH);
        prozor.add(p);
        prozor.setBounds(500, 300, 800, 700);
        prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        prozor.setVisible(true);
    	
	

		
	}

}
