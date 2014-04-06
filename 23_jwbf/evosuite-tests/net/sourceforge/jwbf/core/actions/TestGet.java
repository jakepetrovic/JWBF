/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jwbf.core.actions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.jwbf.core.actions.Get;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestGet {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Get get0 = new Get("");
      String string0 = get0.toString();
      assertEquals("utf-8", string0);
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      Get get0 = new Get("");
      int int0 = get0.hashCode();
      assertEquals((-835143569), int0);
  }

  @Test
  public void test2()  throws Throwable  {
      Get get0 = new Get("&Q5VB}UBt,,{z!6-L6x", (String) null);
      int int0 = get0.hashCode();
      assertEquals(521404374, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      Get get0 = new Get((String) null, (String) null);
      int int0 = get0.hashCode();
      assertEquals(961, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      Get get0 = new Get("");
      boolean boolean0 = get0.equals((Object) "utf-8");
      assertEquals("utf-8", get0.toString());
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      Get get0 = new Get("9a*lvF", "9a*lvF");
      boolean boolean0 = get0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      Get get0 = new Get("y~bqkY!SzmJs]*I+");
      Get get1 = new Get((String) null, (String) null);
      boolean boolean0 = get1.equals((Object) get0);
      assertEquals(false, boolean0);
      assertEquals("utf-8y~bqkY!SzmJs]*I+", get0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      Get get0 = new Get("z|.6blP`s!5[8Z", "cEK;'1:aUXys");
      Get get1 = new Get("cEK;'1:aUXys");
      boolean boolean0 = get1.equals((Object) get0);
      assertEquals(false, boolean0);
      assertEquals("utf-8cEK;'1:aUXys", get1.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      Get get0 = new Get((String) null, (String) null);
      Get get1 = new Get("nullnull", (String) null);
      boolean boolean0 = get0.equals((Object) get1);
      assertEquals(false, boolean0);
      assertEquals("nullnullnull", get1.toString());
      assertFalse(get1.equals(get0));
  }

  @Test
  public void test9()  throws Throwable  {
      Get get0 = new Get("cEK;'1:aUXys");
      Get get1 = new Get("cEK;'1:aUXys");
      boolean boolean0 = get0.equals((Object) get1);
      assertEquals(true, boolean0);
      assertEquals("utf-8cEK;'1:aUXys", get1.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      Get get0 = new Get((String) null, (String) null);
      Get get1 = new Get((String) null, (String) null);
      boolean boolean0 = get0.equals((Object) get1);
      assertEquals(true, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      Get get0 = new Get("cEK;'1:aUXys");
      Get get1 = new Get("");
      boolean boolean0 = get0.equals((Object) get1);
      assertEquals("utf-8", get0.getCharset());
      assertEquals(false, boolean0);
  }
}
