package upol.exception;

public class CheckedExceptionRunner {
  /*

Exception Hierarchy

Throwable
├── Error ( Cannot be handled but can be prevented. e.g. Stackoverflow or out of memory, etc. )
│   ├── AssertionError
│   ├── LinkageError
│   │   ├── ClassCircularityError
│   │   ├── ClassFormatError
│   │   ├── ExceptionInInitializerError
│   │   └── UnsupportedClassVersionError
│   ├── VirtualMachineError
│   │   ├── OutOfMemoryError
│   │   ├── StackOverflowError
│   │   └── InternalError
│   └── ...
└── Exception
    ├── RuntimeException ( Unchecked Exception - not required to handle by the compiler.
    |   |   The other children of Exception class are Checked Exception and must be
    |   |   handled otherwise the compiler would complain.
    │   ├── NullPointerException
    │   ├── ClassCastException
    │   ├── IllegalArgumentException
    │   ├── IndexOutOfBoundsException
    │   └── ...
    ├── IOException
    │   ├── FileNotFoundException
    │   ├── EOFException
    │   └── ...
    ├── InterruptedException
    ├── ReflectiveOperationException
    ├── ParseException
    ├── GeneralSecurityException
    └── ...




   */

  public static void main(String[] args) {
    method2();
    try {
      moethod1();
      Thread.sleep(1000);
      System.out.println("Done");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private static void method2() throws RuntimeException {
  }

  private static void moethod1() throws InterruptedException {
    Thread.sleep(500);
  }

}
