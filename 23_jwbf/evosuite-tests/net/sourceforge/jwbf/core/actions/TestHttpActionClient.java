/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jwbf.core.actions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.CookieException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.login.PostLoginOld;
import net.sourceforge.jwbf.mediawiki.contentRep.LoginData;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestHttpActionClient {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BasicHttpParams basicHttpParams0 = new BasicHttpParams();
      DefaultHttpClient defaultHttpClient0 = new DefaultHttpClient((HttpParams) basicHttpParams0);
      File file0 = new File("KpW)q8)b}01&", "KpW)q8)b}01&");
      URI uRI0 = file0.toURI();
      URL uRL0 = uRI0.toURL();
      HttpActionClient httpActionClient0 = new HttpActionClient((HttpClient) defaultHttpClient0, uRL0);
      httpActionClient0.getHostUrl();
  }

  @Test
  public void test1()  throws Throwable  {
      File file0 = new File("", "");
      URI uRI0 = file0.toURI();
      URL uRL0 = uRI0.toURL();
      HttpActionClient httpActionClient0 = new HttpActionClient(uRL0);
      LoginData loginData0 = new LoginData();
      PostLoginOld postLoginOld0 = new PostLoginOld((String) null, "", "", loginData0);
      // Undeclared exception!
      try {
        httpActionClient0.performAction((ContentProcessable) postLoginOld0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.apache.http.conn.ssl.SSLSocketFactory
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      BasicHttpParams basicHttpParams0 = new BasicHttpParams();
      DefaultHttpClient defaultHttpClient0 = new DefaultHttpClient((HttpParams) basicHttpParams0);
      File file0 = new File("KpW)q8)b}01&", "KpW)q8)b}01&");
      URI uRI0 = file0.toURI();
      URL uRL0 = uRI0.toURL();
      HttpActionClient httpActionClient0 = new HttpActionClient((HttpClient) defaultHttpClient0, uRL0);
      assertNotNull(httpActionClient0);
      
      GetPage getPage0 = new GetPage("file://", "file://");
      // Undeclared exception!
      String string0 = "";
      try {
        string0 = httpActionClient0.performAction((ContentProcessable) getPage0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.apache.http.conn.ssl.SSLSocketFactory
         */
      }
      assertEquals("file://", httpActionClient0.getHostUrl());
  }

  @Test
  public void test3()  throws Throwable  {
      BasicHttpParams basicHttpParams0 = new BasicHttpParams();
      DefaultHttpClient defaultHttpClient0 = new DefaultHttpClient((HttpParams) basicHttpParams0);
      File file0 = new File("0-IWh\"A", "0-IWh\"A");
      URI uRI0 = file0.toURI();
      URL uRL0 = uRI0.toURL();
      HttpActionClient httpActionClient0 = new HttpActionClient((HttpClient) defaultHttpClient0, uRL0);
      assertNotNull(httpActionClient0);
      
      Get get0 = new Get("0-IWh\"A", "0-IWh\"A");
      // Undeclared exception!
      try {
        httpActionClient0.get(get0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Illegal character in path at index 5: 0-IWh\"A
         */
      }
  }
}