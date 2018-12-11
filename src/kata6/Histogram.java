package kata6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author wwwam
 * @param <T>
 */
public class Histogram<T> {

    private final HashMap<T, Integer> map;
    
    public Histogram(Iterator<T> iterator){
        this(iterableOf(iterator));
    }
    
    public Histogram(Iterable<T> iterable){
        this.map = new HashMap<>();
        for (T item : iterable) add(item);
    }
    
    private static <T> Iterable<T> iterableOf(Iterator <T> iterator){
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return iterator;
            }
        };
    }
    
    private void add(T item){
        map.put(item, get(item)+1);
    }
    
    private int get(T item){
        return map.containsKey(item) ? map.get(item) : 0;
    }
}
