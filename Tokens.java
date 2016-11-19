
package tokens;

public class Tokens {

    public static void main(String[] args) {
        String s = "Hello, 741!!! Buу 52!";
        LinkedList result1 = new LinkedList();
        result1 = Tokenizer.tokenize1(s);
        result1.print();
    }
    
}
