public class Names {

  public static void secretMessage() {
    System.out.println("Hello!");
  }


  public static void paulHello() {
    System.out.println("Hiii!");
  }

  public static void makeTriangle(int rows){
    for (int row = 0; row < rows; row++){
      for (int col = 0; col <= row; col++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public static void sebastianHello() {
    System.out.println("Happy THursday!");
  }
  
  public static void main(String[] args) {
    secretMessage();
    paulHello();
    sebastianHello();
    makeTriangle(4);
    josephineNew();
  }

  public static void josephineNew() {
    System.out.println("Hello world");
  }
}
