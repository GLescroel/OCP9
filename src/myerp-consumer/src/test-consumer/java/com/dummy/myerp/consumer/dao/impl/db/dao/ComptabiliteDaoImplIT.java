package com.dummy.myerp.consumer.dao.impl.db.dao;

import com.dummy.myerp.model.bean.comptabilite.CompteComptable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContextIT.xml")
public class ComptabiliteDaoImplIT {

    @Autowired
    ComptabiliteDaoImpl comptabiliteDaoImpl;

    @Test
    public void testGetListCompteComptable() {
        //act
        List<CompteComptable> compteComptableList = comptabiliteDaoImpl.getListCompteComptable();

        //assert
        Assert.assertEquals("Vérification du nombre de comptes dans la base de test", 7, compteComptableList.size());
    }
}