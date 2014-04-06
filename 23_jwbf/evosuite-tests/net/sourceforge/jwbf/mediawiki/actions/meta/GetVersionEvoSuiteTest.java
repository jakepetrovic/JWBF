/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jwbf.mediawiki.actions.meta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.meta.GetVersion;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.jdom.Content;
import org.jdom.Element;
import org.jdom.Namespace;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GetVersionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GetVersion getVersion0 = new GetVersion();
      String string0 = getVersion0.getBase();
      assertEquals("", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      GetVersion getVersion0 = new GetVersion();
      String string0 = getVersion0.getMainpage();
      assertEquals("", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      GetVersion getVersion0 = new GetVersion();
      String string0 = getVersion0.getCase();
      assertEquals("", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      GetVersion getVersion0 = new GetVersion();
      MediaWiki.Version mediaWiki_Version0 = getVersion0.getVersion();
      assertEquals(MediaWiki.Version.UNKNOWN, mediaWiki_Version0);
  }

  @Test
  public void test4()  throws Throwable  {
      GetVersion getVersion0 = new GetVersion();
      try {
        getVersion0.processAllReturningText("");
        fail("Expecting exception: ProcessException");
      } catch(ProcessException e) {
        /*
         * Error on line 1: Premature end of file.
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      MediaWikiBot mediaWikiBot0 = new MediaWikiBot();
      GetVersion getVersion0 = null;
      try {
        getVersion0 = new GetVersion(mediaWikiBot0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * please use another constructor or inject net.sourceforge.jwbf.core.bots.HttpBot
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      GetVersion getVersion0 = new GetVersion();
      Get get0 = (Get)getVersion0.getNextMessage();
      assertNotNull(get0);
      assertEquals("/api.php?action=query&meta=siteinfo&format=xml", get0.getRequest());
  }

  @Test
  public void test7()  throws Throwable  {
      GetVersion getVersion0 = new GetVersion();
      String string0 = getVersion0.getSitename();
      assertEquals("", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      GetVersion getVersion0 = new GetVersion();
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      Element element0 = new Element("ghquuo", namespace0);
      Element element1 = new Element("ghquuo");
      Element element2 = element0.setContent((Content) element1);
      getVersion0.findContent(element2);
      assertEquals("http://www.w3.org/XML/1998/namespace", element2.getNamespaceURI());
  }
}
