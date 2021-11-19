package com.company;

import java.util.Iterator;

public class ElementIterator <E> implements Iterator<E> {
    PositionList<E> list;
    Position<E> cursor;

    public ElementIterator(PositionList<E> l){
        this.list=l;
        cursor=(list.isEmpty())?null:list.first();
    }
    @Override
    public boolean hasNext() {
        return cursor!=null;
    }

    @Override
    public E next() {
        E toReturn = cursor.element();
        cursor=(cursor==list.last())? null: list.next(cursor);
        return  toReturn;
    }
}
