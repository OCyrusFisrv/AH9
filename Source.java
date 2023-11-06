class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }

  // Write a method, reverseList, that takes in the head of a 
  // linked list as an argument. The method should reverse 
  // the order of the nodes in the linked list in-place 
  // and return the new head of the reversed linked list.

  class Source {
    public static <T> Node<T> reverseList(Node<T> head) {
      if (head == null || head.next == null)
      return head;

      Node<T> other = reverseList(head.next);
      head.next.next = head;

      head.next = null;

      return other;
    }
    
    public static void main(String[] args) {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
    
        x.next = y; // x -> y
    
        reverseList(x); // y -> x

        // Printing solution
        Node<String> head = Source.reverseList(x);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;            
        }


    }
  }