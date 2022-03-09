package ProjectRobert;

import java.math.BigDecimal;
import java.util.Scanner;

public class Program extends Emisiune {

	private String tipProgram;
	private BigDecimal durataMedie;
    private int emisiuniLive;
    private int emisiuniInregistrate;
    private String publicTinta;
    private int oraPreponderentaEmisiune;
    
    public String getTipProgram() {
		return tipProgram;
	}

	public void setTipProgram(String tipProgram) {
		this.tipProgram = tipProgram;
	}

	public BigDecimal getDurataMedie() {
		return durataMedie;
	}

	public void setDurataMedie(BigDecimal durataMedie) {
		this.durataMedie = durataMedie;
	}

	public int getEmisiuniLive() {
		return emisiuniLive;
	}

	public void setEmisiuniLive(int emisiuniLive) {
		this.emisiuniLive = emisiuniLive;
	}

	public int getEmisiuniInregistrate() {
		return emisiuniInregistrate;
	}

	public void setEmisiuniInregistrate(int emisiuniInregistrate) {
		this.emisiuniInregistrate = emisiuniInregistrate;
	}

	public String getPublicTinta() {
		return publicTinta;
	}

	public void setPublicTinta(String publicTinta) {
		this.publicTinta = publicTinta;
	}

	public int getOraPreponderentaEmisiune() {
		return oraPreponderentaEmisiune;
	}

	public void setOraPreponderentaEmisiune(int oraPreponderentaEmisiune) {
		this.oraPreponderentaEmisiune = oraPreponderentaEmisiune;
	}
    

	public void citire(Scanner sc) {
		System.out.println("Tip Program:");
		String tip=sc.next();
    	this.setTipProgram(tip);
    	System.out.println("Durata Medie:");
    	BigDecimal dur=sc.nextBigDecimal();
        this.setDurataMedie(dur);
        System.out.println("Emisiuni Live:");
        int emL=sc.nextInt();
        this.setEmisiuniLive(emL);
        System.out.println("Emisiuni Inregistrare:");
        int emI=sc.nextInt();
        this.setEmisiuniInregistrate(emI);
        System.out.println("Public Tinta:");
        String pbT=sc.next();
        this.setPublicTinta(pbT);
        System.out.println("Ora Emisiune:");
        int ora=sc.nextInt();
        this.setOraPreponderentaEmisiune(ora);
	}
    
	@Override
	public String toString() {
		return "Program [tipProgram=" + tipProgram + ", durataMedie=" + durataMedie + ", emisiuniLive=" + emisiuniLive
				+ ", emisiuniInregistrate=" + emisiuniInregistrate + ", publicTinta=" + publicTinta
				+ ", oraPreponderentaEmisiune=" + oraPreponderentaEmisiune + "]";
	}  
	       
}
