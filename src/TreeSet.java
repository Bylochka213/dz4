import java.util.AbstractSet;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeSet<E extends Comparable<E>> extends AbstractSet<E> {
    private TreeMap<E, Object> map;

    public TreeSet() {
        map = new TreeMap<>();
    }

    @Override
    public boolean add(E element) {
        return map.put(element, null) == null;
    }

    @Override
    public boolean remove(Object obj) {
        return map.remove(obj) != null;
    }

    @Override
    public boolean contains(Object obj) {
        return map.containsKey(obj);
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }
}
