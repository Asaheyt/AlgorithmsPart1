import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
  public static void main(String[] args) {
    int i = 2;
    String result = StdIn.readString();
    while (!StdIn.isEmpty()) {
      String word = StdIn.readString();
      if (StdRandom.bernoulli(1 / (double) i)) {
        result = word;
      }
      i++;
    }
    StdOut.println(result);
  }
}
