import java.util.Random;
public class Main {
    public static void main(String[] args) {
        MyBST tree = new MyBST();
        MyBST bst = new MyBST();
        Random random = new Random();
        int val = 0;
        for(int i = 0;i<10;i++)
        {
            val = random.nextInt(10);
            System.out.println("Inserting val: "+val);
            bst.insert(val);
        }
        System.out.println("\nInorder traversal of bst");
        bst.inorder();

        //System.out.println("Is "+val+" in BST: "+bst.search(val));

        System.out.println("Is 5 in BST: "+bst.search(5));
    }
}
