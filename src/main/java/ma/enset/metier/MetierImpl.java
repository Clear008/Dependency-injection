package ma.enset.metier;

import ma.enset.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(@Qualifier("d2") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 30 ;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
