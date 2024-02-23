package ma.Metier;

import ma.Dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
@Component("metier")
public class MetierImpl implements IMetier{
    private IDao dao;

    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
         double res =dao.getData()*15;
        return res;
    }
}
