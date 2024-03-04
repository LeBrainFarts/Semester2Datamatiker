package opgave03.models;

public class ArrayListRing<T> implements Ring<T>{
    private final T[] items;
    private int size;


    public ArrayListRing(int capacity) {
        T[] empty = (T[]) new Object[capacity];
        items = empty;
        size = 0;
    }

    public ArrayListRing() {
        this(10);
    }

    @Override
    public void advance() {
        if (isEmpty()) {
            return;
        }
        T lastItem = items[size-1];
        for (int i = 0 ; i < size; i++) {
            items[i+1] = items[i];
        }
        items[0] = lastItem;
    }

    @Override
    public T getCurrentItem() {
        if (isEmpty()) {
            throw new RuntimeException("The ring is empty."); // Throw exception if the ring is empty
        }
        return items[size];
    }

    @Override
    public void add(T item) {
        //makes a new entry
        items[size] = item;
        //resizes the array counter
        size++;
    }

    @Override
    public boolean removeItem(T item) {
        if (item == null) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                for (int j = 0; j < size; j++) {
                    items[j] = items[j+1];
                }
                items[size-1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public T removeCurrentItem() {
        if (isEmpty()){
            return null;
        }
        //Får den sidste item i arrayet
        T removedItem = items[size-1];
        //sætter den sidste item i arrayet til null
        items[size-1] = null;
        //resizer arraycount
        size--;
        //returner det fjernet item
        return removedItem;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else
        return false;
    }
}
