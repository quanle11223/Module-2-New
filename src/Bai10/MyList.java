//package Bai10;
//
//import java.util.Arrays;
//
//public class MyList<E> {
//    private int size = 0;
//    private static int DEFAULT_CAPACITY = 10;
//    private Object elements[] ;
//
//
//    public MyList() {
//        elements = new Object[DEFAULT_CAPACITY];
//    }
//    private void ensureCaPa(){
//        int newSize = elements.length * 2;
//        elements = Arrays.copyOf(elements, newSize);
//    }
//    public void add(E e){
//        if (size == elements.length){
//            ensureCaPa();
//        }
//        elements[size++] = e;
//    }
//    public E get(int i){
//        if (i > size || i < 0){
//            throw new IndexOutOfBoundsException("index " + i + ", size " + i );
//        }
//        return (E) elements[i];
//    }
//
//}
