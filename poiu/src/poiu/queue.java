package poiu;
public class queue {
    private int first;
    private int last;
    private Object[] a;
    
    public queue(){
        first = 0;
        a = new Object [1000];
        last = 0;
    }
    
    public void push(Object obj){
        a[last] = obj;
        last++;
    }
    
    public Object pop(){
        first++;
        return last - first;
    }
    
    public int size(){
        return last - first;
    }
}
