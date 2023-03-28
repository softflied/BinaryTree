public class main {

    public static void main(String[] args) {

        BST bt = new BST();
        bt.root =bt.insert(bt.root,10);
        bt.root =bt.insert(bt.root,8);
        bt.root = bt.insert(bt.root,5);
        bt.root = bt.insert(bt.root,9);
        bt.root = bt.insert(bt.root,15);
        bt.root = bt.insert(bt.root,12);
        bt.root = bt.insert(bt.root,20);


        System.out.print("preOrder -> ");
        bt.preOrder(bt.root);

        System.out.print("\ninOrder -> ");
        bt.inOrder(bt.root);

        System.out.print("\npostOrder -> ");
        bt.postOrder(bt.root);

    }
}
