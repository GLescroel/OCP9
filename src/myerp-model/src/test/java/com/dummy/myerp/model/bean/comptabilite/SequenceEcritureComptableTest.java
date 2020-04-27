package com.dummy.myerp.model.bean.comptabilite;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class SequenceEcritureComptableTest {
    @Test
    public void testConstruteurWithoutParameters(){
        //Arrange
        Integer annee = 2020;
        Integer derniereValeur = 50;

        //Act
        SequenceEcritureComptable sequenceEcritureComptable = new SequenceEcritureComptable();
        sequenceEcritureComptable.setAnnee(annee);
        sequenceEcritureComptable.setDerniereValeur(derniereValeur);

        //Assert
        assertEquals(annee,sequenceEcritureComptable.getAnnee());
        assertEquals(derniereValeur, sequenceEcritureComptable.getDerniereValeur());
        assertEquals("SequenceEcritureComptable{annee=2020, derniereValeur=50}", sequenceEcritureComptable.toString());
    }

    @Test
    public void testConstruteurWithAllParamaters(){
        //Arrange
        Integer annee = 2020;
        Integer derniereValeur = 50;

        //Act
        SequenceEcritureComptable sequenceEcritureComptable = new SequenceEcritureComptable(annee, derniereValeur);

        //Assert
        assertEquals(annee,sequenceEcritureComptable.getAnnee());
        assertEquals(derniereValeur, sequenceEcritureComptable.getDerniereValeur());
        assertEquals("SequenceEcritureComptable{annee=2020, derniereValeur=50}", sequenceEcritureComptable.toString());
    }
}