import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

class SimpleLinkedList<T> {
    LinkedList<T> musicPlayList;

    SimpleLinkedList() {
        musicPlayList = new LinkedList<T>();
    }

    SimpleLinkedList(T[] values) {
        musicPlayList=
    }

    void push(T value) {
        musicPlayList.add(value);
    }

    T pop() {
        return musicPlayList.removeLast();
    }

    void reverse() {
        Collections.reverse(musicPlayList);
    }

    T[] asArray(Class<T> clazz) {
        
    }

    int size() {
        return musicPlayList.size();
    }
}
