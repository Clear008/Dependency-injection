package ma.enset.presentation;

import ma.enset.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Presentation4Annotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("ma.enset");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("Resultat =" +metier.calcul());
    }
}
