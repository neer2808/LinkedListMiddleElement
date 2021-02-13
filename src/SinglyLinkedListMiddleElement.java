public class SinglyLinkedListMiddleElement {
  Node head;

  SinglyLinkedListMiddleElement() {
    head = null;
  }

  public void insert(Node newnode) {
    if (head == null) {
      head = newnode;

    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newnode;
    }
  }

  public void display() {
    Node temp = head;
    // using stringbuffer to append the output in StringBuffer object
    StringBuffer sb = new StringBuffer();
    int counter=0;
    while (temp != null) {
      counter++;
      sb.append(temp.data);
      sb.append("-->");
      //System.out.println(temp.data);
      temp = temp.next;
    }
    //sb = 10-->20-->30-->
    // to remove last -->(arrow)
    // find the total length - 3
    if (sb.length() >= 3) {
      sb.delete(sb.length() - 3, sb.length());
    }
    System.out.println(sb);
  }

  public void getMiddleNode() {
    Node current = head;
    Node previous = head;
    int len = 0;
    while (current != null) {
      len++;
      if (len % 2 == 0) {
        previous = previous.next;
      }
      current = current.next;
    }

    System.out.println(previous.data);

  }

}
