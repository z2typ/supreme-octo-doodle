public class DynamicArray {
    private int[] arr;
    private int size;
    
    private final int INITIAL_CAPACITY = 10;
    private final double GROWTH_FACTOR = 1.5;

    public DynamicArray(){
        arr = new int[INITIAL_CAPACITY];
        size = 0;
    }

    public int capacity(){
        return arr.length;
    }
    public int size(){
        return size;
    }

    private void extendSize(){
        int[] new_array = new int[(int)(capacity()*GROWTH_FACTOR)];
        for(int i=0;i<arr.length;i++){
            new_array[i] = arr[i];
        }
        arr = new_array;
    }

    public void add(int val){
        if(size >= capacity()){
            extendSize();
        }
        arr[size] = val;
        size++;
    }

    public int get(int idx){
        return arr[idx];
    }

    public void set(int idx, int val){
        arr[idx] = val;
    }

    public void remove(int idx){
        for(int i=idx+1;i<size();i++){
            arr[i-1] = arr[i];
        }
        size--;
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        for(int i=0;i<size();i++){
            res.append(arr[i]+" ");
        }
        return res.toString();
    }

}
