
/**
 * Libro
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 28/11/2019)
 */
public class Libro
{
    private String titolo;
    private String autore;
    private int numeroPagine;
    private static double costoPagina=0.05;
    final double COSTO_FISSO=5.5;
    
    public Libro(String titolo, String autore, int numeroPagine)
    {
        this.titolo=titolo;
        this.autore=autore;
        this.numeroPagine=numeroPagine;
    }
    
    public Libro(Libro libro)
    {
        this.titolo=libro.getTitolo();
        this.autore=libro.getAutore();
        this.numeroPagine=libro.getNumeroPagine();
    }
    
    public String getTitolo()
    {
        return titolo;
    }
    
    public String getAutore()
    {
        return autore;
    }
    
    public int getNumeroPagine()
    {
        return numeroPagine;
    }
    
    public double prezzo()
    {
        return COSTO_FISSO+numeroPagine*costoPagina;
    }
    
    public static void setCostoPagina(double costo)
    {
        costoPagina=costo;
    }
}
