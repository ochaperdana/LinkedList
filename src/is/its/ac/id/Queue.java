package is.its.ac.id;

public interface Queue {
    boolean isEmpty();
    Object enqueue(Object item);
    Object peek();
    Object dequeue();
    int search (Object o);
}
