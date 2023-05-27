package homeWork;

public class homeWork3_1 
{

    public static void main(String args[]) 
    {
    SinglyLinkedList list = new SinglyLinkedList();
    list.append("1");
    list.append("2");
    list.append("3");
    list.append("4");

    System.out.println("связный список : " + list);
    
    int n = 2;
    System.out.println("n-ый (" + n + ") узел от конца: " + list.getLastNode(n));
    }
  }
  
  class SinglyLinkedList 
  {
    static class Node 
    {
      private Node next;
      private String data;
  
      public Node(String data) 
      {
        this.data = data;
      }
  
      @Override
      public String toString() 
      {
        return data.toString();
      }
    }
  
    private Node head; // Голова - это первый узел связного списка
  
    //возвращает true если связный список пуст, т.е., узлов нет
    public boolean isEmpty() 
    {
      return length() == 0;
    }
  
    // добавляет узел в хвост связного списка

    public void append(String data) 
    {
      if (head == null) 
      {
        head = new Node(data);
        return;
      }
      tail().next = new Node(data);
    }
  
    // возвращает последний узел или хвост данного связного списка

    private Node tail() {
      Node tail = head;
      // Находит последний элемент связного списка, известный как хвост
      while (tail.next != null) {
        tail = tail.next;
      }
      return tail;
    }
  
    // метод возвращающий длину связного списка

    public int length() {
      int length = 0;
      Node current = head;
  
      while (current != null) {
        length++;
        current = current.next;
      }
      return length;
    }

    // получения n-го узла от конца

    public String getLastNode(int n) {
      Node fast = head;
      Node slow = head;
      int start = 1;
  
      while (fast.next != null) {
        fast = fast.next;
        start++;
  
        if (start > n) {
          slow = slow.next;
        }
      }
  
      return slow.data;
    }
  
    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
  
      Node current = head;
      while (current != null) {
        sb.append(current).append("-->");
        current = current.next;
      }
  
      if (sb.length() >= 3) {
        sb.delete(sb.length() - 3, sb.length());
  
      }
      return sb.toString();
    }
  
  }
