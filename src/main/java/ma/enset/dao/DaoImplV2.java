package ma.enset.dao;

import org.springframework.stereotype.Repository;

@Repository("d2")
public class DaoImplV2 implements IDao{

    @Override
    public double getData() {
        System.out.println("Version capteur");
        double t = Math.random();
        return t;
    }
}
