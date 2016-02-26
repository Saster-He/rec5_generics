
package rec5_generics;

public class Array<T> {
    // Though we want an array of items of type T,
    // Java cannot explicitly instantiate those
    // So instead create an array of Objects,
    // of which any non-primitive T is a subclass of.
    private Object[] items;
    
    public Array(int length) {
	items = new Object[length];
    }

    public T get(int index) {
	return (T)items[index];
    }

    public void set(int index, T item) {
	items[index] = item;
    }

    public int size() {
	return items.length;
    }
}
