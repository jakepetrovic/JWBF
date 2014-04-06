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
public class FilePostEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FilePost filePost0 = new FilePost("~>S)EoJG3bk&ZjI", "~>S)EoJG3bk&ZjI");
      filePost0.addPart("~>S)EoJG3bk&ZjI", "~>S)EoJG3bk&ZjI");
      assertEquals("~>S)EoJG3bk&ZjI", filePost0.getCharset());
  }

  @Test
  public void test1()  throws Throwable  {
      FilePost filePost0 = new FilePost((String) null);
      assertNull(filePost0.getRequest());
  }

  @Test
  public void test2()  throws Throwable  {
      FilePost filePost0 = new FilePost("j)}5nPH]8<'", "j)}5nPH]8<'");
      File file0 = new File("j)}5nPH]8<'", "j)}5nPH]8<'");
      filePost0.addPart("j)}5nPH]8<'", file0);
      assertEquals(0L, file0.length());
  }

  @Test
  public void test3()  throws Throwable  {
      FilePost filePost0 = new FilePost("~>S)EoJG3bk&ZjI", "~>S)EoJG3bk&ZjI");
      Map<String, Object> map0 = filePost0.getParts();
      assertEquals(true, map0.isEmpty());
  }
}
