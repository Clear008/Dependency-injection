package ma.enset.dao;

public class DaoImplV2 implements IDao{

    @Override
    public double getData() {
        System.out.println("Version capteur");
        double t = Math.random();
        return t;
    }
}
