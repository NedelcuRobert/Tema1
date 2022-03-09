package ProjectRobert;

import java.util.Arrays;
import java.util.Scanner;

public class Canal extends Program {
	
	private Program[] programe;
    private String frecventa;
    private int ziRevizie;

    public Program[] getPrograme() {
		return programe;
	}

	public void setPrograme(Program[] programe) {
		this.programe = programe;
	}

	public String getFrecventa() {
		return frecventa;
	}

	public void setFrecventa(String frecventa) {
		this.frecventa = frecventa;
	}

	public int getZiRevizie() {
		return ziRevizie;
	}

	public void setZiRevizie(int ziRevizie) {
		this.ziRevizie = ziRevizie;
	}
    

	public void citire(Scanner sc) {
    	System.out.println("Numar Programe:");
    	int n=sc.nextInt();
    	programe = new Program[n];
    	for(int i=0;i<n;i++) {
    		programe[i] = new Program();
    		programe[i].citire(sc);
    	}
    	System.out.println("Frecventa:");
    	String f=sc.next();
    	this.setFrecventa(f);
    	System.out.println("Zi Revizie:");
    	int zi=sc.nextInt();
    	this.setZiRevizie(zi);
    }

	@Override
    public String toString() {
        return "Canal{" +
                "programe=" + Arrays.toString(programe) +
                ", frecventa='" + frecventa + '\'' +
                ", ziRevizie=" + ziRevizie +
                '}';
    }

}
