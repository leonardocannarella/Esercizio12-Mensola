
/**
 * Mensola
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 28/11/2019)
 */
public class Mensola
{
    private static final int MAX_NUM_VOLUMI=15;
    private Libro volumi[];
    
    public Mensola()
    {
        volumi = new Libro[MAX_NUM_VOLUMI];
    }
    
    public Mensola(Mensola mensola)
    {
        int posizione;
        volumi = new Libro[MAX_NUM_VOLUMI];
        
        for(posizione=0; posizione<MAX_NUM_VOLUMI; posizione++)
        {
            if(mensola.getVolume(posizione)!=null)
            {
                volumi[posizione] = new Libro(mensola.getVolume(posizione));
            }
        }
    }
    
    public int setVolume(Libro libro, int posizione)
    {
        try
        {
            if(volumi[posizione]!=null)
            {
                return -2;
            }
            else
            {
                volumi[posizione]=new Libro(libro);
                return posizione;
            }
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            return -1;
        }
    }
    
    public Libro getVolume(int posizione)
    {
        try
        {
            return new Libro(volumi[posizione]);
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            return null;
        }
        catch(NullPointerException exception)
        {
            return null;
        }
    }
    
    public int rimuoviVolume(int posizione)
    {
        try
        {
            volumi[posizione] = null; 
            return posizione;
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            return -1;
        }
    }
    
    public int getNumMaxVolumi()
    {
        return MAX_NUM_VOLUMI;
    }
    
    public int getNumVolumi()
    {
        int posizione, n=0;
        
        for(posizione=0; posizione<MAX_NUM_VOLUMI; posizione++)
        {
            if(volumi[posizione]!=null)
            {
                n++;
            }
        }
        
        return n;
    }
}





















