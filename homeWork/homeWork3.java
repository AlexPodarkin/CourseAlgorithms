package homeWork;

import java.util.Arrays;

class Node
{
    int data;
    Node next;
 
    Node(int data) 
    {
        this.data = data;
    }
}
 
class homeWork3
{
    // Вспомогательная функция для печати заданного связанного списка
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " - ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
 
    // Вспомогательная функция для вставки нового узла в начало связанного списка
    public static Node push(Node head, int data)
    {
        Node node = new Node(data);
        node.next = head;
        return node;
    }
 
    // Рекурсивная функция для обращения заданного связанного списка. Он обращает вспять
    // полученный связанный список путем фиксации указателя заголовка и затем `.next`
    // указатели на каждый узел в обратном порядке
    public static Node reverse(Node head, Node headRef)
    {
        Node first, rest;
 
        // базовый случай пустого списка
        if (head == null) 
        {
            return headRef;
        }
 
        first = head;           // предположим, что сначала = {1, 2, 3}
        rest = first.next;      // rest = {2, 3}
 
        // базовый случай: список имеет только один узел
        if (rest == null)
        {
            // фиксируем здесь указатель головы
            headRef = first;
            return headRef;
        }
 
        // рекурсивно инвертируем меньший случай {2, 3}
        // после: rest = {3, 2}
        headRef = reverse(rest, headRef);
 
        // помещаем первый элемент в конец списка
        rest.next = first;
        first.next = null;      
 
        return headRef;
    }
 
    // Реверсировать заданный связанный список. Функция принимает ссылку на
    // головной узел
    public static Node reverse(Node head) 
    {
        return reverse(head, head);
    }
 
    public static void main(String[] args)
    {
        int[] keys = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Исходный: "+Arrays.toString(keys));
        
        Node head = null;
        for (int i = keys.length - 1; i >=0; i--) 
        {
            head = push(head, keys[i]);
        }
 
        head = reverse(head);
        System.out.print("в обратном порядке: ");
        printList(head);
    }
}