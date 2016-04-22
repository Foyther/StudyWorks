package sequences;

/**
 *
 * @author Artem
 */
public class Sequences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("We push 1, 3 and 2 for all sequences and do pop\n");
        
        QueueArray a = new QueueArray();
        a.push("QueueArray:");
        a.push(1);
        a.push(3);
        a.push(2);
        System.out.println(a.pop());
        System.out.println("size = " + a.size());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop() + " <--- Ooops, element is absent");
        System.out.println("size = " + a.size());
        
        System.out.println("-------------------------------------------");
        
        StackArray b = new StackArray();
        b.push(1);
        b.push(3);
        b.push(2);
        b.push("StackArray:");
        System.out.println(b.pop());
        System.out.println("size = " + b.size());
        System.out.println(b.pop());
        System.out.println(b.pop());
        System.out.println(b.pop());
        System.out.println(b.pop() + " <--- Ooops, element is absent");
        System.out.println("size = " + b.size());
        
        System.out.println("-------------------------------------------");
        
        QueueLink c = new QueueLink();
        c.push("QueueLink:");
        c.push(1);
        c.push(3);
        c.push(2);
        System.out.println(c.pop());
        System.out.println("size = " + c.size());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop() + " <--- Ooops, element is absent");
        System.out.println("size = " + c.size());
        
        System.out.println("-------------------------------------------");
        
        StackLink d = new StackLink();
        d.push(1);
        d.push(3);
        d.push(2);
        d.push("StackLink:");
        System.out.println(d.pop());
        System.out.println("size = " + d.size());
        System.out.println(d.pop());
        System.out.println(d.pop());
        System.out.println(d.pop());
        System.out.println(d.pop() + " <--- Ooops, element is absent");
        System.out.println("size = " + d.size());
        
        System.out.println("-------------------------------------------");
    }
    
}
