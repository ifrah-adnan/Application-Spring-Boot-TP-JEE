package ma;

import ma.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class PresentationAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext("ma");
        IMetier metier= (IMetier) applicationContext.getBean("metier");
        System.out.println("Version Spring Annotation");
        System.out.println("version annotation "+metier.calcul());
    }
}
