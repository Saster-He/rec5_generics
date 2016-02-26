
package rec5_generics;

public class Array<T> {
    private T[] items;
    
    public Array(int length) {
	items = new T[length];
    }

    public T get(int index) {
	return items[index];
    }

    public void set(int index, T item) {
	items[index] = item;
    }

    public int size() {
	return items.length;
    }
}
