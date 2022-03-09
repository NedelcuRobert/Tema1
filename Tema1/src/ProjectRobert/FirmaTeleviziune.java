package ProjectRobert;

import java.util.Scanner;

public class FirmaTeleviziune {

    private Canal[] canale;
  

	public void functionare(Scanner sc) {
    	System.out.println("Numar Canale:");
    	int n=sc.nextInt();
    	canale = new Canal[n];
    	for(int i=0;i<n;i++) {
            canale[i] = new Canal();
    		canale[i].citire(sc);
    	}
    	for(int i=0;i<n;i++) {
    		System.out.println(canale[i].toString());
    	}
    }   	
}
