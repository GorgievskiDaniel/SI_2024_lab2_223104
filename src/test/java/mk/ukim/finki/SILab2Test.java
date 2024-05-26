package mk.ukim.finki;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    public void EveryBranchMethod(){
        RuntimeException ex;
        List<Item> items = null;
        ex = assertThrows(RuntimeException.class,()->SILab2.checkCart(items,5));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));
        List<Item> items1= Arrays.asList(new Item("Slika", "DA", 340, 9.0f));
        ex = assertThrows(RuntimeException.class,()->SILab2.checkCart(items1,200));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));
        List<Item> items5 = Arrays.asList(new Item("Chinija","1233",400,15.0f));
        assertFalse(SILab2.checkCart(items5,350));
        List<Item> items3 = Arrays.asList(new Item("Guma","0104",40,0.0f));
        assertTrue(SILab2.checkCart(items3,55));
        List<Item> items4 = Arrays.asList(new Item("","05",300,20.0f));
        assertFalse(SILab2.checkCart(items4,160));
        List<Item> items2= Arrays.asList(new Item("Tetratka", null, 100, 5.0f));
        ex = assertThrows(RuntimeException.class,()->SILab2.checkCart(items2,45));
        assertTrue(ex.getMessage().contains("No barcode!"));
    }
    @Test
    public void MultipleConditionMethod(){
        List<Item> items = Arrays.asList(new Item("Anything", "321", 150, 0.1f));
        assertTrue(SILab2.checkCart(items,30));
        List<Item> items01 = Arrays.asList(new Item("FirstItem", "005", 200, 0.0f));
        assertTrue(SILab2.checkCart(items01,340));
        List<Item> items02= Arrays.asList(new Item("SecondItem", "104", 370, 0.2f));
        assertTrue(SILab2.checkCart(items02,310));
    }

}