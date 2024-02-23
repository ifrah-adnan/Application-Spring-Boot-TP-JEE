package ma;

import ma.Dao.IDao;
import ma.Metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class PresentationDynamique {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String line1=scanner.nextLine();
        Class daoClass=Class.forName(line1);
        IDao dao= (IDao) daoClass.newInstance();

        String line2=scanner.nextLine();
        Class metierClass=Class.forName(line2);
        IMetier metier= (IMetier) metierClass.getConstructor(IDao.class).newInstance(dao);
        System.out.println("la resultat est :"+metier.calcul());



    }
}
