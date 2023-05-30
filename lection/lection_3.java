package lection;

public class lection_3 
{
    Node head; // head of list

    static class Node 
    {

        int data;
        Node next;

        Node(int d) 
        {
            data = d;
            next = null;
        }

        public static lection_3 insert(lection_3 list, int data) 
        {

            
            Node new_node = new Node(data);
            new_node.next = null;

            if (list.head == null)    
            {
                list.head = new_node;
            } 
            else 
            {
                Node last = list.head;
                while (last.next != null) {
                    last = last.next;
                }


                last.next = new_node;
            }

            return list;
        }

        public static void printList(lection_3 list) 
        {
            Node currNode = list.head;

            System.out.print("LinkedList: ");

            while (currNode != null) 
            {
                System.out.print(currNode.data + " ");

                currNode = currNode.next;
            }

            System.out.println();
        }

        public static void main(String[] args) 
        {

            lection_3 list = new lection_3();

            list = insert(list, 1);
            list = insert(list, 2);
            list = insert(list, 3);
            list = insert(list, 4);
            list = insert(list, 5);
            list = insert(list, 6);
            list = insert(list, 7);
            list = insert(list, 8);


            printList(list);
        }
    }
}
