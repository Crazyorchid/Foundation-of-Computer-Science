public class Main {
    public static boolean bracketsMatching(String input) {
        MyStack mystack = new MyStack();

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '('){
                Node node = new Node();
                node.setData("(");
                mystack.push(node);
            }
            else if(input.charAt(i) == '{'){
                Node node = new Node();
                node.setData("{");
                mystack.push(node);
            }
            else if(input.charAt(i) == ')'){
                if(!mystack.isEmpty() && mystack.peek().getData().equals("(")){
                    mystack.pop();
                }
                else{
                    return false;
                }
            }
            else if(input.charAt(i) == '}'){
                if(!mystack.isEmpty() && mystack.peek().getData().equals("{")){
                    mystack.pop();
                }
                else{
                    return false;
                }
            }
        }

        if(mystack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static MyQueue reverseQueue(MyQueue myqueue){
        MyQueue reversed = new MyQueue();
        MyStack mystack = new MyStack();

        Node node;
        while(!myqueue.isEmpty()){
            node = myqueue.dequeue();
            node.setNext(null);
            mystack.push(node);
        }

        while(!mystack.isEmpty()){
            reversed.enqueue(mystack.pop());
        }

        return reversed;
    }

    public static void main(String [] args){

        String str;
        boolean result;

        /*
         *
         * stack operations
         */
        System.out.println("Matching brackets...");
        str = "({}){}";
        System.out.println("Input : " + str);
        result = bracketsMatching(str);
        System.out.println("Output: " + result);

        str = "(2 * 3) + {(1+3)*(2+5)}";
        System.out.println("Input : " + str);
        result = bracketsMatching(str);
        System.out.println("Output: " + result);

        str = "(2 * 3) + {(1+3()*(2+5)}";
        System.out.println("Input : " + str);
        result = bracketsMatching(str);
        System.out.println("Output: " + result);

        /*
         *
         * queue operations
         */
        System.out.println("\n\nMyQueue operations...");

        Node node;
        MyQueue mq = new MyQueue();

        node = new Node();
        node.setData("1");
        mq.enqueue(node);
        System.out.println("Inserted into My queue 1.");

        node = new Node();
        node.setData("4");
        mq.enqueue(node);
        System.out.println("Inserted into My queue 4.");

        node = new Node();
        node.setData("8");
        mq.enqueue(node);
        System.out.println("Inserted into My queue 7.");

        node = new Node();
        node.setData("2");
        mq.enqueue(node);
        System.out.println("Inserted into My queue 9.");

        node = new Node();
        node.setData("1");
        mq.enqueue(node);
        System.out.println("Inserted into My queue 2.");

        System.out.println("My Queue before reverse: ");
        mq.displayQueue();

        mq = reverseQueue(mq);

        System.out.println("My Queue after reverse: ");
        mq.displayQueue();
    }


}
