public class MyStask {
    private Integer[] arr = new Integer[10];


    private int size =0;


    int size(){
        return size;
    }

    void push(int item){
        if (size== arr.length){
            Integer[] arr2 = new Integer[arr.length*2];
            System.arraycopy(arr,0,arr2,0,arr.length);
            arr= arr2;
        }
        arr[size++]=item;
    }

    int peak(){
        return arr[size-1];
    }

    int pop(){
        return arr[--size];
    }
}
