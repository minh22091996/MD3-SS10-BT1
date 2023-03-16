package rikkei;

import java.util.Arrays;

public class MyList<E> {
int size = 0;
static final int DEFAULT_CAPACITY = 10;

Object elements[];
public boolean isEmty(){
    return size == 1;
}

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

}
