package main.upol.functionaloreilly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;


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
