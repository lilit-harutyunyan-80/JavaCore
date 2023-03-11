package chapter14;

public class Storage<T> {

    Object[] objects = new Object[10];
    int size;

    public void add(T obj) {
        objects[size++] = obj;

    }

    public T getByIndex(int index) {
        return (T) objects[index];
    }
}
