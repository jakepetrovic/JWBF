/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jwbf.mediawiki.actions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.jwbf.mediawiki.actions.HTMLEntities;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HTMLEntitiesEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      String string0 = HTMLEntities.unhtmlQuotes("&OQiJ9AT;");
      assertNotNull(string0);
      assertEquals("&OQiJ9AT;", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = HTMLEntities.unhtmlentities("&OQiJ9AT;");
      assertNotNull(string0);
      assertEquals("&OQiJ9AT;", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = HTMLEntities.unhtmlentities("~&!$#L2;#'^;&");
      assertNotNull(string0);
      assertEquals("~&!$#L2;#'^;&", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        HTMLEntities.unhtmlentities("&#m&;EcMh&");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"m&\"
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      String string0 = HTMLEntities.unhtmlentities("&hArr;");
      assertNotNull(string0);
      assertEquals("\u21D4", string0);
  }
}
