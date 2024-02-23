package ma;

import ma.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class PresentationXml {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        IMetier metier= (IMetier) applicationContext.getBean("metier");
        System.out.println("Version Xml");
        System.out.println("Le resultat : "+metier.calcul());
    }
}
