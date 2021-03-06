/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jwbf.mediawiki.actions.meta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Set;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.meta.GetUserinfo;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import org.jdom.Content;
import org.jdom.Element;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GetUserinfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.MW1_15;
      GetUserinfo getUserinfo0 = new GetUserinfo(mediaWiki_Version0);
      String string0 = getUserinfo0.processAllReturningText("groups");
      assertEquals("", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.MW1_14;
      GetUserinfo getUserinfo0 = new GetUserinfo(mediaWiki_Version0);
      Set<String> set0 = getUserinfo0.getRights();
      assertEquals(0, set0.size());
  }

  @Test
  public void test2()  throws Throwable  {
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.MW1_15;
      GetUserinfo getUserinfo0 = new GetUserinfo(mediaWiki_Version0);
      Set<String> set0 = getUserinfo0.getGroups();
      assertEquals(0, set0.size());
  }

  @Test
  public void test3()  throws Throwable  {
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.MW1_11;
      GetUserinfo getUserinfo0 = new GetUserinfo(mediaWiki_Version0);
      String string0 = getUserinfo0.getUsername();
      assertEquals("", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.MW1_14;
      GetUserinfo getUserinfo0 = new GetUserinfo(mediaWiki_Version0);
      assertNotNull(getUserinfo0);
      
      Get get0 = (Get)getUserinfo0.getNextMessage();
      assertEquals("utf-8/api.php?action=query&meta=userinfo&uiprop=blockinfo%7Chasmsg%7Cgroups%7Crights%7Coptions%7Ceditcount%7Cratelimits&format=xml", get0.toString());
      assertNotNull(get0);
  }

  @Test
  public void test5()  throws Throwable  {
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.MW1_11;
      GetUserinfo getUserinfo0 = new GetUserinfo(mediaWiki_Version0);
      Element element0 = new Element("_Sh.");
      Element element1 = new Element("_Sh.");
      Element element2 = element0.addContent((Content) element1);
      getUserinfo0.findContent(element2);
      assertEquals("", element2.getValue());
  }

  @Test
  public void test6()  throws Throwable  {
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.MW1_15;
      GetUserinfo getUserinfo0 = new GetUserinfo(mediaWiki_Version0);
      Element element0 = new Element("groups");
      Element element1 = new Element("groups");
      Element element2 = element0.addContent((Content) element1);
      getUserinfo0.findContent(element2);
      assertEquals("", element2.getNamespaceURI());
  }

  @Test
  public void test7()  throws Throwable  {
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.MW1_11;
      GetUserinfo getUserinfo0 = new GetUserinfo(mediaWiki_Version0);
      Element element0 = new Element("rights");
      Element element1 = new Element("rights");
      Element element2 = element0.addContent((Content) element1);
      getUserinfo0.findContent(element2);
      assertEquals("", element2.getNamespaceURI());
  }
}
