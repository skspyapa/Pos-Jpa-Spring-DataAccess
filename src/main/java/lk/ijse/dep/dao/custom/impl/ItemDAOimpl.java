package lk.ijse.dep.dao.custom.impl;

import lk.ijse.dep.dao.CrudDAOImpl;
import lk.ijse.dep.dao.custom.ItemDAO;
import lk.ijse.dep.entity.Item;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.sql.SQLException;
import java.util.List;
@Component
public class ItemDAOimpl extends CrudDAOImpl<Item,String> implements ItemDAO {
    public ItemDAOimpl() {
        super();
    }

    public String findMaxItemCode() throws Exception {
        Object objects = entityManager.createNativeQuery("SELECT code from item ORDER BY code DESC LIMIT 1").getSingleResult();
        return objects.toString();
    }
}

