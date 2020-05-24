
public class MyStack<C> {
    private Node top;

    public MyStack() {
        this.top = null;
    }

    public void push(Node node) {
        node.setNext(top);
        this.top = node;
    }

    public Node pop() {
        //check if it's empty
        if (top == null) {
            System.out.println("Can't remove, stack is empty.");
            return null;
        }
        Node topNode = top;
        if (top.getNext() == null) {
            top = null;
        } else {
            top = top.getNext();
        }
        return topNode;
    }



        public Node peek() {
            if (top == null) {
                System.out.println("Can't remove, stack is empty.");
                return null;
            }
            return top;
        }

        public boolean isEmpty () {
            if (this.top == null) {
                //System.out.println("Stack is empty");
                return true;
            } else {
                return false;

            }
        }


    }


