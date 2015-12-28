package spring.persistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring.persistence.daos.UnidirectionalOneToManyEmbeddedDao;
import spring.persistence.entities.AnyClass;
import spring.persistence.entities.UnidirectionalOneToManyEmbeddedEntity;

@Controller
public class UnidirectionalOneToManyEmbeddedController {

    @Autowired
    private UnidirectionalOneToManyEmbeddedDao unidirectionalOneToManyEmbeddedDao;

    public void process() {
        AnyClass[] array = {new AnyClass(0,"cero"), new AnyClass(1,"uno"), new AnyClass(2,"dos"), new AnyClass(3,"tres")};
        UnidirectionalOneToManyEmbeddedEntity entity = new UnidirectionalOneToManyEmbeddedEntity("Mi Nick",array);
        unidirectionalOneToManyEmbeddedDao.save(entity);
        System.out.println(">>>> UnidirectionalOneToManyEmbeddedEntity:  " + unidirectionalOneToManyEmbeddedDao.findOne(entity.getId()));
    }
}
