//A fibonacci is a special kind of series which adds previous two nubers to form the third
//0 1 1 2 3 5 8 ...

class Fibonacci {
  public static void main(String args[]) {
    fibo();
  }

  public static void fibo() {
    int n1 = 0, n2 = 1, n3, i, count = 10;
    System.out.print(n1 + " " + n2);

    for (i = 2; i < count; ++i) {
      n3 = n1 + n2;
      System.out.print(" " + n3);
      n1 = n2;
      n2 = n3;
    }
  }
}
