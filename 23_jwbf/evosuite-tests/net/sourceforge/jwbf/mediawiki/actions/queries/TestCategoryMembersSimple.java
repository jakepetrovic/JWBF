/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jwbf.mediawiki.actions.queries;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersSimple;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestCategoryMembersSimple {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CategoryMembersSimple categoryMembersSimple0 = null;
      try {
        categoryMembersSimple0 = new CategoryMembersSimple((MediaWikiBot) null, "Z3Ip<AU'z");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembersSimple
         */
      }
  }
}
