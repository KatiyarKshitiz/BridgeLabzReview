package com.kshitiz;

public class MyArrayList {
    public Object[] data;
    public int size;
    private static final int INITIAL_CAPACITY = 10;
    public MyArrayList(){
        data = new Object[INITIAL_CAPACITY];
        size = 0;
    }
    public void add(Object element){
        if(size == data.length){
            resize();
        }
        data[size] = element;
        size++;
    }
    public void remove(int index){
        if(index >= 0 && index < size){
            for(int i = index; i < size - 1; i++){
                data[i] = data[i + 1];
            }
            data[size - 1] = null;
            size--;
        }else{
            System.out.println("Index out of bounds");
        }
    }
    public Object get(int index){
        if(index >= 0 && index < size){
            return data[index];
        }else{
            System.out.println("Index out of bounds");
            return null;
        }
    }
    public int size(){
        return size;
    }
    private void resize(){
        int newCapacity = data.length * 2;
        Object[] newData = new Object[newCapacity];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
    public void printList(){
        for(int i = 0; i < size; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("List after adding elements:");
        list.printList();
        System.out.println("Element at index 2: " + list.get(2));
        list.remove(2);
        System.out.println("List after removing element at index 2:");
        list.printList();
        System.out.println("Size of the list: " + list.size());
    }
}
