/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jwbf.mediawiki.bots;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MediaWikiBotEvoSuiteTest {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.Properties.SANDBOX_MODE = SandboxMode.RECOMMENDED; 
    Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
    Sandbox.resetDefaultSecurityManager(); 
  } 

  @Before 
  public void initTestCase(){ 
    Sandbox.goingToExecuteSUTCode(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    Sandbox.doneWithExecutingSUTCode(); 
  } 


  @Test
  public void test0()  throws Throwable  {
      MediaWikiBot mediaWikiBot0 = new MediaWikiBot((HttpActionClient) null);
      // Undeclared exception!
      try {
        mediaWikiBot0.readData((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MediaWikiBot mediaWikiBot0 = new MediaWikiBot();
      // Undeclared exception!
      try {
        mediaWikiBot0.delete("asKX");
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * please use another constructor or inject net.sourceforge.jwbf.core.bots.HttpBot
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MediaWikiBot mediaWikiBot0 = new MediaWikiBot((HttpActionClient) null);
      boolean boolean0 = mediaWikiBot0.isEditApi();
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      MediaWikiBot mediaWikiBot0 = null;
      try {
        mediaWikiBot0 = new MediaWikiBot((URL) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      MediaWikiBot mediaWikiBot0 = new MediaWikiBot();
      // Undeclared exception!
      try {
        mediaWikiBot0.getArticle("r");
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * please use another constructor or inject net.sourceforge.jwbf.core.bots.HttpBot
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      MediaWikiBot mediaWikiBot0 = new MediaWikiBot("http://www.ulfZjor]/codes.h!ml#verion_mismath.php");
      assertNotNull(mediaWikiBot0);
      
      String string0 = mediaWikiBot0.getHostUrl();
      assertEquals(true, mediaWikiBot0.isEditApi());
      assertNotNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      MediaWikiBot mediaWikiBot0 = new MediaWikiBot();
      // Undeclared exception!
      try {
        mediaWikiBot0.login("http://www.slf4j.org/codes.html#versihn_m:s_atch/", "http://www.slf4j.org/codes.html#versihn_m:s_atch/");
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * please use another constructor or inject net.sourceforge.jwbf.core.bots.HttpBot
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      MediaWikiBot mediaWikiBot0 = new MediaWikiBot((HttpActionClient) null);
      mediaWikiBot0.useEditApi(true);
      assertEquals(true, mediaWikiBot0.isEditApi());
  }

  @Test
  public void test8()  throws Throwable  {
      MediaWikiBot mediaWikiBot0 = new MediaWikiBot();
      // Undeclared exception!
      try {
        mediaWikiBot0.getWikiType();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * please use another constructor or inject net.sourceforge.jwbf.core.bots.HttpBot
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          MediaWikiBot mediaWikiBot0 = new MediaWikiBot("http://www.ulfZjor]/codes.h!ml#verion_mismath.php");
          assertNotNull(mediaWikiBot0);
          
          // Undeclared exception!
          try {
            mediaWikiBot0.getSiteinfo();
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.net.SocketPermission www.ulfZjor] resolve)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkConnect(SecurityManager.java:1031)
             * java.net.InetAddress.getAllByName0(InetAddress.java:1145)
             * java.net.InetAddress.getAllByName(InetAddress.java:1083)
             * java.net.InetAddress.getAllByName(InetAddress.java:1019)
             * java.net.InetAddress.getByName(InetAddress.java:969)
             * java.net.InetSocketAddress.<init>(InetSocketAddress.java:124)
             * org.apache.http.conn.scheme.PlainSocketFactory.connectSocket(PlainSocketFactory.java:120)
             * org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:123)
             * org.apache.http.impl.conn.AbstractPoolEntry.open(AbstractPoolEntry.java:147)
             * org.apache.http.impl.conn.AbstractPooledConnAdapter.open(AbstractPooledConnAdapter.java:101)
             * org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:381)
             * org.apache.http.impl.client.AbstractHttpClient.execute(AbstractHttpClient.java:641)
             * org.apache.http.impl.client.AbstractHttpClient.execute(AbstractHttpClient.java:576)
             * org.apache.http.impl.client.AbstractHttpClient.execute(AbstractHttpClient.java:554)
             * net.sourceforge.jwbf.core.actions.HttpActionClient.execute(HttpActionClient.java:262)
             * net.sourceforge.jwbf.core.actions.HttpActionClient.get(HttpActionClient.java:224)
             * net.sourceforge.jwbf.core.actions.HttpActionClient.performAction(HttpActionClient.java:144)
             * net.sourceforge.jwbf.core.bots.HttpBot.performAction(HttpBot.java:126)
             * net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot.performAction(MediaWikiBot.java:352)
             * net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot.getSiteinfo(MediaWikiBot.java:403)
             * sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             * sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)
             * sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
             * java.lang.reflect.Method.invoke(Method.java:597)
             * org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:303)
             * java.util.concurrent.FutureTask.run(FutureTask.java:138)
             * java.util.concurrent.ThreadPoolExecutor$Worker.runTask(ThreadPoolExecutor.java:886)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:908)
             * java.lang.Thread.run(Thread.java:662)
             */
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test10()  throws Throwable  {
      MediaWikiBot mediaWikiBot0 = new MediaWikiBot("http://ww<Olf4j.org/coes.html3version_mismatch/");
      assertNotNull(mediaWikiBot0);
      
      SimpleArticle simpleArticle0 = new SimpleArticle();
      // Undeclared exception!
      try {
        mediaWikiBot0.writeContent(simpleArticle0);
        fail("Expecting exception: ActionException");
      } catch(ActionException e) {
        /*
         * Please login first
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      MediaWikiBot mediaWikiBot0 = null;
      try {
        mediaWikiBot0 = new MediaWikiBot("http:/www.slf4j.org/code.html#vesihn_m:smach");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * (http:/www.slf4j.org/code.html#vesihn_m:smach) url must end with slash or .php
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      URL uRL0 = new URL("http://www.slf4j.rg/code.html#versin_mi@mat[//");
      MediaWikiBot mediaWikiBot0 = new MediaWikiBot(uRL0, false);
      assertNotNull(mediaWikiBot0);
      assertEquals(true, mediaWikiBot0.isEditApi());
  }

  @Test
  public void test13()  throws Throwable  {
      URL uRL0 = new URL("http:/\"www.slf4j.org/codes.ztml#vesion_msmatch:");
      MediaWikiBot mediaWikiBot0 = null;
      try {
        mediaWikiBot0 = new MediaWikiBot(uRL0, true);
        fail("Expecting exception: ActionException");
      } catch(ActionException e) {
        /*
         * java.lang.IllegalArgumentException
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      MediaWikiBot mediaWikiBot0 = new MediaWikiBot();
      // Undeclared exception!
      try {
        mediaWikiBot0.getUserinfo();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * please use another constructor or inject net.sourceforge.jwbf.core.bots.HttpBot
         */
      }
  }
}
