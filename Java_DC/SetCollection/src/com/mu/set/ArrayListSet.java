package com.mu.set;

import com.mu.arrayList.ArrayList;
import com.mu.arrayList.List;

public class ArrayListSet<E> implements Set<E>{
    ArrayList<E> arrayList = new ArrayList<>();
    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public void clear() {
        arrayList.clear();
    }

    @Override
    public boolean contains(E element) {
        return arrayList.contains(element);
    }

    @Override
    public void add(E element) {
        if (arrayList.contains(element)){
            arrayList.set(arrayList.indexOf(element),element);
        } else {
            arrayList.add(element);
        }

    }

    @Override
    public void remove(E element) {
        if (arrayList.indexOf(element) != List.ELEMENT_NOT_FOUND){
            arrayList.remove(arrayList.indexOf(element));
        }
    }

    @Override
    public void traversal(Visitor<E> visitor) {
        if (visitor == null) return;

        for (int i = 0; i < arrayList.size(); i++) {
            if (visitor.visit(arrayList.get(i))) return;
        }
    }
}
