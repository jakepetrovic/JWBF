/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jwbf.core.actions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestGetPage {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GetPage getPage0 = new GetPage("\"&]Ie-!9G");
      assertEquals(true, getPage0.hasMoreMessages());
      
      boolean boolean0 = getPage0.isSelfExecuter();
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      GetPage getPage0 = new GetPage("\"&]Ie-!9G");
      assertEquals(true, getPage0.hasMoreMessages());
      
      Get get0 = (Get)getPage0.getNextMessage();
      getPage0.processReturningText("", (HttpAction) get0);
      assertEquals("utf-8\"&]Ie-!9G", get0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      GetPage getPage0 = new GetPage("\"&]Ie-!9G");
      assertEquals(true, getPage0.hasMoreMessages());
      
      boolean boolean0 = getPage0.hasMoreMessages();
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      GetPage getPage0 = new GetPage("\"&]Ie-!9G");
      String string0 = getPage0.getText();
      assertEquals("", string0);
  }
}
