/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jwbf.core.bots.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import net.sourceforge.jwbf.core.bots.util.SimpleCache;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestSimpleCache {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      File file0 = new File("c5m+ZI3.k80|$/(@N'[", "c5m+ZI3.k80|$/(@N'[");
      SimpleCache simpleCache0 = null;
      try {
        simpleCache0 = new SimpleCache(file0, 1149);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class net.sourceforge.jwbf.core.bots.util.SimpleCache
         */
      }
  }
}
