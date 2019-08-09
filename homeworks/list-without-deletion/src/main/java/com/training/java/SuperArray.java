package com.training.java;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class SuperArray<T> implements SuperInterface<T> {

    private T[] array;
    private int capacity =10;
    private int size=0;
    private static double loadFactory = 0.75;

    public SuperArray() {
        array = (T[]) new Object[capacity];
    }

    public SuperArray(int capacity) {
        array = (T[]) new Object[capacity];
    }

    public SuperArray(Collection<? extends T> collection) {
        T[] newArray =(T[]) collection.toArray();
        size=collection.size();
        if(getSize()>=(int)(collection.size()*loadFactory))
        {
            capacity=(int)(collection.size()*1.5)+1;
            array=(T[]) new Object[capacity];
            array=newArray.clone();
        }
        else
        {
            array=newArray.clone();
        }

    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public int getSize() {
        return size;
    }

    public int checkLength(T[] array)
    {
        return (int)Arrays.stream(array).filter(x->x!=null).count();
    }


    public int capacity()
    {
        return capacity;
    }

    @Override
    public boolean add(T t) {
        try {
            if ( getSize()+1>= (int)(capacity *loadFactory)) {
                T[] oldArray = array;
                array = (T[]) new Object[capacity *(3/2)+1];
                capacity =array.length*(3/2)+1;
                System.arraycopy(oldArray, 0, array, 0, oldArray.length);
                array[size++]=t;
            } else {
                array[size++]=t;
            }
            return true;
        }catch (ClassCastException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }


    @Override
    public boolean add(int index, T t) {
        try {
            if(index<0||index>=getSize())
            {
                throw new ArrayIndexOutOfBoundsException(index+"does not exist");
            }

            if(getSize()+1>=(int)(capacity *loadFactory))
            {
                T[] oldArray=Arrays.copyOf(array,array.length);
                array = (T[]) new Object[array.length*(3/2)+1];
                System.arraycopy(oldArray,0,array,0,index);
                System.arraycopy(oldArray,index,array,index+1,oldArray.length-index);
                array[index]=t;
            } else {
                T[] oldArray=array;
                System.arraycopy(oldArray,0,array,0,index);
                System.arraycopy(oldArray,index,array,index+1,oldArray.length-index);
                array[index]=t;
            }
            return true;
        }catch (ClassCastException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        catch (ArrayIndexOutOfBoundsException a)
        {
            System.out.println(a.getMessage());
            return false;
        }
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        T[] newArray =(T[]) collection.toArray();
        //  if()
        array=newArray.clone();
        return  true;
    }

    @Override
    public T get(int index) {
        if(index<0 || index>=array.length)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }


    @Override
    public int size() {
        return (int)Arrays.stream(array).filter(x->x!=null).count();
    }

    @Override
    public boolean contains(Object o) {
        for (T elem:array)
        {
            if(elem.equals(o))
                return true;
        }
        return false;
    }

    @Override
    public void ensureCapacity(int capacity) {
        T[] old =Arrays.copyOf(array,array.length);
        array = (T[]) new Object[capacity];
        System.arraycopy(old,0,array,0,capacity);
    }

    @Override
    public T set(int index, T t) {
        if(t==null)
        {
            return array[index];
        }
        else
        {
            T elem = array[index];
            array[index]=t;
            return elem;
        }
    }

    @Override
    public T remove(int index) {
        if(index<0||index>=getSize())
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        else
            return array[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(array);
    }

    @Override
    public void trimToSize() {
        capacity =getSize();
        T[] oldArray=array;
        array=(T[])new Object[capacity];
        System.arraycopy(oldArray,0,array,0,getSize());
    }

    @Override
    public String toString() {
        return "SuperArray{" +
                Arrays.toString(array) +
                '}';
    }
}
