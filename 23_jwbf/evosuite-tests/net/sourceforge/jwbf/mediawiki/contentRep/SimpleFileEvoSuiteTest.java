/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jwbf.mediawiki.contentRep;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.contentRep.SimpleFile;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SimpleFileEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SimpleFile simpleFile0 = new SimpleFile("K\"k@xWQ E17:2)");
      assertNotNull(simpleFile0);
      
      int int0 = simpleFile0.hashCode();
      assertEquals(1669427248, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      SimpleFile simpleFile0 = new SimpleFile("", "");
      File file0 = simpleFile0.getFile();
      SimpleFile simpleFile1 = new SimpleFile(file0);
      assertNotNull(simpleFile1);
      
      boolean boolean0 = simpleFile1.equals((Object) simpleFile0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      SimpleFile simpleFile0 = new SimpleFile("", (File) null);
      int int0 = simpleFile0.hashCode();
      assertEquals(28629151, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      SimpleFile simpleFile0 = new SimpleFile("", "");
      String string0 = simpleFile0.getFilename();
      assertEquals("", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      SimpleFile simpleFile0 = new SimpleFile("", (File) null);
      SimpleFile simpleFile1 = new SimpleFile("", "");
      boolean boolean0 = simpleFile0.equals((Object) simpleFile1);
      assertEquals(false, boolean0);
      assertFalse(simpleFile1.equals(simpleFile0));
  }

  @Test
  public void test5()  throws Throwable  {
      SimpleFile simpleFile0 = new SimpleFile("", "");
      boolean boolean0 = simpleFile0.equals((Object) "");
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      SimpleFile simpleFile0 = new SimpleFile("", "");
      SimpleArticle simpleArticle0 = (SimpleArticle)simpleFile0.clone();
      boolean boolean0 = simpleFile0.equals((Object) simpleArticle0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      SimpleFile simpleFile0 = new SimpleFile("", (File) null);
      SimpleFile simpleFile1 = new SimpleFile("", (File) null);
      boolean boolean0 = simpleFile0.equals((Object) simpleFile1);
      assertEquals(true, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      SimpleFile simpleFile0 = new SimpleFile("K\"k@xWQ E17:2)");
      assertNotNull(simpleFile0);
      
      File file0 = new File("", "K\"k@xWQ E17:2)");
      SimpleFile simpleFile1 = new SimpleFile("K\"k@xWQ E17:2)", file0);
      boolean boolean0 = simpleFile0.equals((Object) simpleFile1);
      assertEquals(false, boolean0);
      assertEquals("K\"k@xWQ E17:2)", simpleFile0.getLabel());
      assertEquals("K\"k@xWQ E17:2)", simpleFile1.getTitle());
  }
}