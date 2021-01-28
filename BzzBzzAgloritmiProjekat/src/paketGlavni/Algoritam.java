package paketGlavni;

import java.util.ArrayList;

public class Algoritam {
	public static int min=0;
    MojPanel panel;
    int i=0;
	public Algoritam(MojPanel panel) {	
		
		this.panel=panel;
	}
	
	
	
	public void kvikSort(ArrayList<Integer> lista) {
		
		for( i=0;i<lista.size();i++) {
			int brojacUpetlji=i;
			 min=lista.get(i);	
			for(int j=i+1;j<lista.size();j++) {
				if(lista.get(j)<min) {
					min=lista.get(j);
					panel.repaint();
					 brojacUpetlji=j;
				}
			}
			try {
				Thread.sleep(120);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		//	System.out.println("promena broj" +i);
			for(int p=0;p<lista.size();p++) {
				System.out.println(lista.get(p));
			}
				int sadrzaj=lista.get(i);
				lista.set(i, min);
				lista.set(brojacUpetlji, sadrzaj);
				
				panel.repaint();
			
			
			
		}
		
		
		
	}
	int [] aw= {1,8,4,1,5};
	public void kvikSortpppppp(int[] lista) {
		
		for(int i=0;i<lista.length-1;i++) {
			int brojacUpetlji=i;
			int min=lista[i];
			for(int j=i+1;j<lista.length;j++) {
				if(lista[j]<min) {
					min=lista[j];
					panel.repaint();
					 brojacUpetlji=j; }
				}
				int sadrzaj=lista[i];
				lista[i]=min;
				lista[brojacUpetlji]=sadrzaj;
				
				
			
			
			
		}
		
		
		
	}
}
