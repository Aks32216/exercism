import java.util.*;
import java.lang.reflect.Array;

class SimpleLinkedList <T> {
    // here is where the List starts
    Node head;

    // class for list elements contains Data and Pointer which is a Node itself
    class Node{
        T data;
        Node next;
        // takes only T because creates one Node Point
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    // constructor for the list
    // Array of Objects so it has length
    //
    SimpleLinkedList(T[] data){
        for(int i = 0; i < data.length; i++)
            push(data[i]);
    }

    //create empty List
    SimpleLinkedList(){
    }


    void push(T a){
        if(head == null){
            head = new Node(a);
            return;
        }
        Node current = new Node(a);
        current.next = head;
        head = current;
    }


    T pop(){
        if(head == null){
            throw new NoSuchElementException();
        }

        if(head.next == null){
            T data = head.data;
            head = null;
            return data;
        }

        T currentData = head.data;
        Node current = head.next;
        head = head.next;

        return currentData;
    }

    T[] asArray(Class<T> c){
        T[] arrayOfT = (T[]) Array.newInstance(c, size());

        Node current = head;
        int count = 0;
        while(current != null){
            arrayOfT[count] = current.data;
            current = current.next;
            count ++;
        }

        return arrayOfT;
    }

    void reverse(){
        Object[] reversedArray =  new Object[size()];
        Node current = head;
        int j = 0;
        while(size() != 0){
            reversedArray[j] = pop();
            j++;
        }

        for(int i = 0; i<reversedArray.length; i++)
            this.push((T)reversedArray[i]);
    }


    int size(){
        if(head == null){
            return 0;
        }

        int count = 0;
        Node current = head;
        // current must be null complete else every count would be one to small
        while(current != null){
            count ++;
            current = current.next;
        }
        return count;
    }
}
