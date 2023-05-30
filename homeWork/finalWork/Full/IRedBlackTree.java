package homeWork.finalWork.Full;


public interface IRedBlackTree<T extends Comparable<T>> 
{
	
	/**
    * Добавить элемент в дерево
    * @param o
    */
    void add(T o);
    
    /**
     * Удалить элемент из дерева
     * @param o
     */
    boolean remove(T o);
    
    /**
     * Возвращает true, если элемент содержится в дереве
     * @param o
     */
    boolean contains(T o);
}