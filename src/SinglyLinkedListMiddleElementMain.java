public class SinglyLinkedListMiddleElementMain {
  public static void main(String[] args) {
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(30);
    Node n4 = new Node(40);
    Node n5 = new Node(50);

    SinglyLinkedListMiddleElement obj = new SinglyLinkedListMiddleElement();
    obj.insert(n1);
    obj.insert(n2);
    obj.insert(n3);
   // obj.insert(n4);
   // obj.insert(n5);
    obj.display();
    obj.getMiddleNode();


  }
}
