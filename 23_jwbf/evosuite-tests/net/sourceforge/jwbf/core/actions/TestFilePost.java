/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jwbf.core.actions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import java.util.Map;
import net.sourceforge.jwbf.core.actions.FilePost;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestFilePost {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FilePost filePost0 = new FilePost("");
      filePost0.addPart("", "");
      assertEquals("utf-8", filePost0.getCharset());
  }

  @Test
  public void test1()  throws Throwable  {
      FilePost filePost0 = new FilePost("rq32OY)3V");
      filePost0.addPart("e(!sDna#HQ\"~MRc0", (File) null);
      assertEquals("rq32OY)3V", filePost0.getRequest());
  }

  @Test
  public void test2()  throws Throwable  {
      FilePost filePost0 = new FilePost("rq32OY)3V");
      Map<String, Object> map0 = filePost0.getParts();
      assertEquals(true, map0.isEmpty());
  }
}
