public class BST {

    Node root;

    public BST() {
        this.root = null;
    }

    Node newNode (int data)
    {
        root = new Node(data);
        return root;
    }



    Node insert(Node root,int data)
    {
        if(root!=null) //eğer eleman varsa
        {
            if(data< root.data)
            {
                root.setLeft(insert(root.left,data)); // sola ekleme yapıldı
            }
            else
            {
                root.setRight(insert(root.right,data));  // sağa ekleme yapıldı
            }
        }
        else //eğer eleman yoksa
        {
            root = newNode(data); // root'u oluşturduk
        }

        return root;
    }



    public void preOrder(Node current)
    {
        if(current!=null) // root dolu mu boş mu kontrol et
        {

            System.out.print(current.getData()+" ");//rootları önce yaz
            preOrder(current.left);//sonra solda kalanları al ve yazdır
            preOrder(current.right); // daha sonra sağda kalanları al ve yazdır
        }
    }

    public void inOrder(Node current)
    {
        if(current!=null)
        {
            inOrder(current.left);
            System.out.print(current.getData()+" ");
            inOrder(current.right);
        }
    }

    public void postOrder(Node current)
    {
        if(current!=null)
        {
            postOrder(current.left);
            postOrder(current.right);
            System.out.print(current.getData()+" ");
        }
    }




}
