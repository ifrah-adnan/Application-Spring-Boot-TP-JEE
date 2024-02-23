package ma;

import ma.Dao.DaoImpl;
import ma.Dao.IDao;
import ma.Metier.IMetier;
import ma.Metier.MetierImpl;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class PresentationStatique {
    public static void main(String[] args) {
        IDao dao=new DaoImpl();
        IMetier metier=new MetierImpl(dao);
        System.out.println("le resultat est :"+metier.calcul());
    }
}
