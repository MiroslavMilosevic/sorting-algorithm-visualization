package paketGlavni;

import java.awt.Panel;

public class Nit extends Thread {
	    Algoritam a;
	    MojPanel p;
	    
	
         public Nit( MojPanel p) {
		
		this.p=p;
		 a=new Algoritam(p);
	}
	 
	@Override
	public void run() {
		a.i=0;
		a.kvikSort(p.listaPanel);
		//p.repaint();
		
		
	}
}
