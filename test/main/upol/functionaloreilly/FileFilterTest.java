package main.upol.functionaloreilly;

import static org.junit.Assert.assertEquals;

import java.io.File;
import org.junit.Test;

public class FileFilterTest {

  private final File root = new File("src/main/java/upol");

  @Test
  public void listFiles(){

    File[] files = root.listFiles();

    if ( files != null ) {
      for (File file : files) {
        System.out.println(file);
      }

      assertEquals(5, files.length);
    }
  }

  @Test
  public void listDirectories(){
    
  }

}
