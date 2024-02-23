package ma.Dao;

import org.springframework.stereotype.Component;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        return 10;
    }
}
