package collection;

public class Set<T> {
    Object[] objects = new Object[10];
    int size;

    public void add(T obj) {
        objects[size++] = obj;
    }
}
