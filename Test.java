
/**
 * Test
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 28/11/2019)
 */
public class Test
{
    public static void main(String[] args)
    {
        Libro l1 = new Libro("La storia infinita", "Michael Ende", 542);
        Libro l2 = new Libro("Il richiamo della foresta", "Jack London", 84);
        Libro l3 = new Libro("Il piccolo principe", "Antoine de Saint-Exupèry", 81); 
        Mensola m1 = new Mensola();
        
        
        System.out.println(m1.setVolume(l1,0));
        System.out.println(m1.setVolume(l2,20));
    }
}
