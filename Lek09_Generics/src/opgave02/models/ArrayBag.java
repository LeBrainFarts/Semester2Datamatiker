package opgave02.models;

public class ArrayBag<E> implements Bag<E> {
    // the array to hold the items
    private final E[] items;
    // current number of items in the bag,
    // items are at index 0..size-1
    private int size;

    /** Create a bag with the given capacity. */
    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        E[] empty = (E[]) new Object[capacity];
        items = empty;
        size = 0;
    }

    /** Create a bag with capacity 10. */
    public ArrayBag() {
        this(10);
    }

    @Override
    public int getCurrentSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == items.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E newEntry) {
        //if newEntry is null, cant add anything
        if (newEntry == null) {
            return false;
        }
        //if newEntry is full, cant add anymore items
        if (isFull()) {
            return false;
        }
        //makes a new entry
        items[size] = newEntry;
        //resizes the array counter
        size++;
        //returns true so we know we've made a new entry in the array
        return true;
    }

    @Override
    public E remove() {
        if (isEmpty()){
            return null;
        }
        //Får den sidste item i arrayet
        E removedItem = items[size-1];
        //sætter den sidste item i arrayet til null
        items[size-1] = null;
        //resizer arraycount
        size--;
        //returner det fjernet item
        return removedItem;
    }

    @Override
    public boolean remove(E anEntry) {
        if (anEntry == null) {
           return false;
        }
        for (int i = 0; i < size; i++) {
            if (items[i].equals(anEntry)) {
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
    public void clear() {
        for (int i = 0; i < size; i++) {
            items[i] = null;
        }
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        if (anEntry == null) {
            return 0;
        }
        int count = 0;
        if (items.equals(anEntry)) {
            count++;
        }
            return count;
    }

    @Override
    public boolean contains(E anEntry) {
        if (anEntry == null) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (items[i].equals(anEntry)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E[] toArray() {
        E[] toArray = (E[]) new Object[size];
        for (int i = 0; i < size; i++) {
            toArray[i] = items[i];
        }
        return toArray;
    }
}