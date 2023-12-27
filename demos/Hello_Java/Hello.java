public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello, World!");

    test("test");
    test(1);
  }

  public static <T> T test(T val) {
    return val;
  }

}
