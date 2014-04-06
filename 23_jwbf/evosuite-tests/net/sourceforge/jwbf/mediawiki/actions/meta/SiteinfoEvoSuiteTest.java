/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jwbf.mediawiki.actions.meta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Map;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.mediawiki.actions.meta.Siteinfo;
import org.jdom.Content;
import org.jdom.Element;
import org.jdom.Namespace;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SiteinfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Siteinfo siteinfo0 = new Siteinfo();
      int[] intArray0 = siteinfo0.getNamespacesArray();
      assertNotNull(intArray0);
  }

  @Test
  public void test1()  throws Throwable  {
      Siteinfo siteinfo0 = new Siteinfo();
      assertNotNull(siteinfo0);
      
      Get get0 = (Get)siteinfo0.getNextMessage();
      assertEquals("utf-8/api.php?action=query&meta=siteinfo&siprop=general%7Cnamespaces%7Cinterwikimap&format=xml", get0.toString());
      assertNotNull(get0);
  }

  @Test
  public void test2()  throws Throwable  {
      Siteinfo siteinfo0 = new Siteinfo();
      Map<String, String> map0 = siteinfo0.getInterwikis();
      assertEquals(0, map0.size());
  }

  @Test
  public void test3()  throws Throwable  {
      Siteinfo siteinfo0 = new Siteinfo();
      Element element0 = new Element("iw");
      Namespace namespace0 = element0.getNamespace();
      Element element1 = new Element("iw", namespace0);
      Element element2 = element0.setContent((Content) element1);
      siteinfo0.findContent(element2);
      assertEquals("", element2.getText());
  }
}