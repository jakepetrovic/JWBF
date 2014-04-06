/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jwbf.mediawiki.actions.editing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.editing.GetApiToken;
import net.sourceforge.jwbf.mediawiki.actions.meta.GetUserinfo;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GetApiTokenEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GetApiToken.Intoken getApiToken_Intoken0 = GetApiToken.Intoken.DELETE;
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.MW1_12;
      GetUserinfo getUserinfo0 = new GetUserinfo(mediaWiki_Version0);
      GetApiToken getApiToken0 = new GetApiToken(getApiToken_Intoken0, "DELETE", mediaWiki_Version0, (Userinfo) getUserinfo0);
      assertNotNull(getApiToken0);
      
      String string0 = getApiToken0.getToken();
      assertEquals(true, getApiToken0.hasMoreMessages());
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      GetApiToken.Intoken getApiToken_Intoken0 = GetApiToken.Intoken.PROTECT;
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.DEVELOPMENT;
      GetUserinfo getUserinfo0 = new GetUserinfo(mediaWiki_Version0);
      GetApiToken getApiToken0 = new GetApiToken(getApiToken_Intoken0, "unknown_action:BLOCK", mediaWiki_Version0, (Userinfo) getUserinfo0);
      assertNotNull(getApiToken0);
      
      boolean boolean0 = getApiToken0.hasMoreMessages();
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      GetApiToken.Intoken getApiToken_Intoken0 = GetApiToken.Intoken.IMPORT;
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.MW1_15;
      GetApiToken getApiToken0 = new GetApiToken(getApiToken_Intoken0, "", mediaWiki_Version0, (Userinfo) null);
      assertNotNull(getApiToken0);
      
      Post post0 = new Post("");
      String string0 = getApiToken0.processReturningText("", (HttpAction) post0);
      assertEquals(true, getApiToken0.hasMoreMessages());
      assertNotNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      GetApiToken.Intoken getApiToken_Intoken0 = GetApiToken.Intoken.DELETE;
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.MW1_12;
      GetUserinfo getUserinfo0 = new GetUserinfo(mediaWiki_Version0);
      GetApiToken getApiToken0 = new GetApiToken(getApiToken_Intoken0, "DELETE", mediaWiki_Version0, (Userinfo) getUserinfo0);
      assertNotNull(getApiToken0);
      
      Get get0 = (Get)getApiToken0.getNextMessage();
      String string0 = getApiToken0.processReturningText("DELETE", (HttpAction) get0);
      assertEquals(false, getApiToken0.hasMoreMessages());
      assertNotNull(string0);
      assertEquals("utf-8/api.php?action=query&prop=info&intoken=delete&titles=DELETE&format=xml", get0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      GetApiToken.Intoken getApiToken_Intoken0 = GetApiToken.Intoken.PROTECT;
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.DEVELOPMENT;
      GetUserinfo getUserinfo0 = new GetUserinfo(mediaWiki_Version0);
      GetApiToken getApiToken0 = new GetApiToken(getApiToken_Intoken0, "unknown_action:BLOCK", mediaWiki_Version0, (Userinfo) getUserinfo0);
      assertNotNull(getApiToken0);
      
      Get get0 = (Get)getApiToken0.getNextMessage();
      String string0 = getApiToken0.processReturningText("unknown_action:BLOCK", (HttpAction) get0);
      assertEquals(false, getApiToken0.hasMoreMessages());
      assertNotNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      GetApiToken.Intoken getApiToken_Intoken0 = GetApiToken.Intoken.DELETE;
      MediaWiki.Version mediaWiki_Version0 = MediaWiki.Version.MW1_12;
      GetUserinfo getUserinfo0 = new GetUserinfo(mediaWiki_Version0);
      GetApiToken getApiToken0 = new GetApiToken(getApiToken_Intoken0, "DELETE", mediaWiki_Version0, (Userinfo) getUserinfo0);
      assertNotNull(getApiToken0);
      
      Get get0 = (Get)getApiToken0.getNextMessage();
      assertNotNull(get0);
      
      getApiToken0.getNextMessage();
      assertEquals(false, getApiToken0.hasMoreMessages());
  }
}
