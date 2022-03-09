package ProjectRobert;

import java.math.BigDecimal;
import java.util.Scanner;

public class Emisiune{
	
	private String genEmisiune;
    private String publicTinta;
    private int oraDifuzarii;
    private BigDecimal durata;
    private String tipEmisiune;

    public String getGenEmisiune() {
		return genEmisiune;
	}

	public void setGenEmisiune(String genEmisiune) {
		this.genEmisiune = genEmisiune;
	}

	public String getPublicTinta() {
		return publicTinta;
	}

	public void setPublicTinta(String publicTinta) {
		this.publicTinta = publicTinta;
	}

	public int getOraDifuzarii() {
		return oraDifuzarii;
	}

	public void setOraDifuzarii(int oraDifuzarii) {
		this.oraDifuzarii = oraDifuzarii;
	}

	public BigDecimal getDurata() {
		return durata;
	}

	public void setDurata(BigDecimal durata) {
		this.durata = durata;
	}

	public String getTipEmisiune() {
		return tipEmisiune;
	}

	public void setTipEmisiune(String tipEmisiune) {
		this.tipEmisiune = tipEmisiune;
	}
    
   
	public void citire(Scanner sc) {
		System.out.println("Gen Emisiune:");
		String GenEm=sc.next();
		this.setGenEmisiune(GenEm);
		System.out.println("Public Tinta:");
		String Publ=sc.next();
		this.setPublicTinta(Publ);
		System.out.println("Ora Difuzare:");
		int o=sc.nextInt();
		this.setOraDifuzarii(o);
		System.out.println("Durata:");
		BigDecimal d=sc.nextBigDecimal();
		this.setDurata(d);
		System.out.println("Tip Emisiun");
		String tip=sc.next();
		this.setTipEmisiune(tip);
	}

	@Override
	public String toString() {
		return "Emisiune [genEmisiune=" + genEmisiune + ", publicTinta=" + publicTinta + ", oraDifuzarii="
				+ oraDifuzarii + ", durata=" + durata + ", tipEmisiune=" + tipEmisiune + "]";
	}
	
}
