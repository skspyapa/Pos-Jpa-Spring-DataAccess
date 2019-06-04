package lk.ijse.dep.dao.custom.impl;

import lk.ijse.dep.dao.CrudDAOImpl;
import lk.ijse.dep.dao.custom.CustomerDAO;
import lk.ijse.dep.entity.Customer;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;
@Component
public class CustomerDAOimpl extends CrudDAOImpl<Customer,String> implements CustomerDAO {
    public CustomerDAOimpl() {
        super();
    }

    public String findMaxCustId() throws Exception {
        Object objects = entityManager.createNativeQuery("SELECT id from customer ORDER BY id DESC LIMIT 1").getSingleResult();
        return objects.toString();
    }
}
