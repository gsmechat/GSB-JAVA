package applicationgsb;

import java.sql.Connection;

public abstract class GeneriqueDAO <T> {

        public Connection connect;
        public abstract T select(T obj);
        public abstract T insert(T obj);
        public abstract T update(T obj);
        public abstract void delete(T obj);

    

}
