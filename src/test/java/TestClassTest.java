/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class TestClassTest {
    
    public TestClassTest() {
    }
    @BeforeClass
public static void beforeClassTest(){
System.out.println("before une seule fois");
}
    @Before
public void beforeTest(){
System.out.println("avant methode non class");
}
     @Test
public void junitTest()
{
System.out.println("essayer commit et build directement");
assertEquals(1,1);
} 
@Test
public void secondJunitTest(){

System.out.println("test2");

}

@After
public void afterTest(){
System.out.println("apres methode");
}
    

}
