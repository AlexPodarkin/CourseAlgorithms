package homeWork.finalWork;

public class finalProject 
{
    
    public static void main(String[] args) 
    {
        final  RedBlackTree tree = new RedBlackTree();
        for (int i = 0; i < 15; i++) 
        {
            tree.add(i);
        }
        tree.print();

    }
}
