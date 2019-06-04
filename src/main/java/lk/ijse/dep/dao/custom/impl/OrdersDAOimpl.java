package lk.ijse.dep.dao.custom.impl;

import lk.ijse.dep.dao.CrudDAOImpl;
import lk.ijse.dep.dao.custom.OrdersDAO;
import lk.ijse.dep.entity.Orders;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;
@Component
public class OrdersDAOimpl extends CrudDAOImpl<Orders,String> implements OrdersDAO {


    public OrdersDAOimpl() {
        super();
    }

    @Override
    public String findMaxId() throws Exception {
        return (String) entityManager.createNativeQuery("SELECT id from `orders` ORDER BY id DESC LIMIT 1").getSingleResult();

    }
}

