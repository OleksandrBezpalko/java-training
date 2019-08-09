package com.training.java;

import java.util.Collection;

public interface SuperInterface<T> extends Iterable<T> {
    boolean add(T t);
    boolean add(int index, T t);
    boolean addAll(Collection<? extends  T>collection);
    boolean contains(Object o);
    int size();
    T remove(int index);
    T set(int index,T t);
    T get(int index);
    void ensureCapacity(int index);
    void trimToSize();
}