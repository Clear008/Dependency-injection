package ma.enset.presentation;

import ma.enset.dao.DaoImpl;
import ma.enset.metier.MetierImpl;
import ma.enset.dao.DaoImplV2;

public class Presentation1 {

    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        System.out.println(" Resultat = "+metier.calcul());
    }
}
