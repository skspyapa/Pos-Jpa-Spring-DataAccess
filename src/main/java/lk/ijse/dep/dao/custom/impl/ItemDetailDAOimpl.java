package lk.ijse.dep.dao.custom.impl;

import lk.ijse.dep.dao.CrudDAOImpl;
import lk.ijse.dep.dao.custom.ItemDetailDAO;
import lk.ijse.dep.entity.ItemDetail;
import lk.ijse.dep.entity.ItemDetailPK;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
@Component
public class ItemDetailDAOimpl extends CrudDAOImpl<ItemDetail,ItemDetailPK> implements ItemDetailDAO {
    public ItemDetailDAOimpl() {
        super();
    }
}


