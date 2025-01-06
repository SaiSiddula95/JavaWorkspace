public class DynamicArray {

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
        this.size = 0;
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
        this.size = 0;
    }

    public void add(Object data) {
        if(size>=capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {

    }

    public void delete(Object data)
    {

    }

    public int search(Object data) {
        return -1;
    }

    private void grow()
    {}

    private boolean isEmpty()
    {
        return size==0;
    }

    public String toString()
    {
        String string = "";

        for(int i=0; i<size; i++)
        {
            string += "[" + array[i] + "]";
        }
        if(string !="")
        {
            string = string.substring(0,string.length()-1);
        }else {
            string = "[]";
        }
        return string;
    }




}
