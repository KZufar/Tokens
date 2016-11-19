
package tokens;

class Node {
private Token value;
private Node next;

   public Node(Token value) {
        this.value = value;
        this.next = next;
    }  
   public Token getValue(){
       return value;
   }
   public Node getNext(){
       return next;
   }
   public void setNext(Node next){
       this.next = next;
   }
}
