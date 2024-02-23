package ma.Dao;

import org.springframework.stereotype.Component;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
@Component("dao2")
public class DaoImpl2 implements IDao{
    @Override
    public double getData() {
        return 11;
    }
}
