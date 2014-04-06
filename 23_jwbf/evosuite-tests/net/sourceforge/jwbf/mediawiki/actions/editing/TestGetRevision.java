/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jwbf.mediawiki.actions.editing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.editing.GetRevision;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestGetRevision {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.MW1_10;
      GetRevision getRevision0 = new GetRevision(mediaWiki_Version0, "/api.php?action=query&prop=revisions&titles=%2Fapi.php%3Faction%3Dquery%26prop%3Drevisions%26titles%3Dlg%26rvprop%3Dcontent%257Ccommnt%257Cuser%26rvdir%3Dolder%26rvlimi%60%3D1%26format%3Dxml&rvprop=content%7Ctimestamp%7Cflags&rvdir=newer&rvlimit=1&format=xml", (-2));
      Get get0 = (Get)getRevision0.getNextMessage();
      // Undeclared exception!
      try {
        getRevision0.processReturningText("/api.php?action=query&prop=revisions&titles=%2Fapi.php%3Faction%3Dquery%26prop%3Drevisions%26titles%3Dlg%26rvprop%3Dcontent%257Ccommnt%257Cuser%26rvdir%3Dolder%26rvlimi%60%3D1%26format%3Dxml&rvprop=content%7Ctimestamp%7Cflags&rvdir=newer&rvlimit=1&format=xml", (HttpAction) get0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * org.jdom.input.JDOMParseException: Error on line 1: Content is not allowed in prolog.
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.MW1_17;
      GetRevision getRevision0 = new GetRevision(mediaWiki_Version0, "/api.php?action=query&prop=revisions&titles=lg&rvprop=content%7Ccommnt%7Cuser&rvdir=older&rvlimi`=1&format=xml", 1);
      assertNotNull(getRevision0);
      
      SimpleArticle simpleArticle0 = getRevision0.getArticle();
      assertNotNull(simpleArticle0);
      assertEquals("/api.php?action=query&prop=revisions&titles=lg&rvprop=content%7Ccommnt%7Cuser&rvdir=older&rvlimi`=1&format=xml", simpleArticle0.getLabel());
  }

  @Test
  public void test2()  throws Throwable  {
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.MW1_17;
      GetRevision getRevision0 = new GetRevision(mediaWiki_Version0, "/api.php?action=query&prop=revisions&titles=lg&rvprop=content%7Ccommnt%7Cuser&rvdir=older&rvlimi`=1&format=xml", 1);
      assertNotNull(getRevision0);
      
      Get get0 = (Get)getRevision0.getNextMessage();
      GetRevision getRevision1 = new GetRevision(mediaWiki_Version0, "/api.php?action=query&prop=revisions&titles=lg&rvprop=content%7Ccommnt%7Cuser&rvdir=older&rvlimi`=1&format=xml", (-1940));
      assertNotNull(getRevision1);
      
      String string0 = getRevision1.processReturningText("/api.php?action=query&prop=revisions&titles=lg&rvprop=content%7Ccommnt%7Cuser&rvdir=older&rvlimi`=1&format=xml", (HttpAction) get0);
      assertNotNull(string0);
      assertEquals("/api.php?action=query&prop=revisions&titles=%2Fapi.php%3Faction%3Dquery%26prop%3Drevisions%26titles%3Dlg%26rvprop%3Dcontent%257Ccommnt%257Cuser%26rvdir%3Dolder%26rvlimi%60%3D1%26format%3Dxml&rvprop=&rvdir=older&rvlimit=1&format=xml", get0.getRequest());
      assertEquals("utf-8/api.php?action=query&prop=revisions&titles=%2Fapi.php%3Faction%3Dquery%26prop%3Drevisions%26titles%3Dlg%26rvprop%3Dcontent%257Ccommnt%257Cuser%26rvdir%3Dolder%26rvlimi%60%3D1%26format%3Dxml&rvprop=&rvdir=older&rvlimit=1&format=xml", get0.toString());
  }
}
