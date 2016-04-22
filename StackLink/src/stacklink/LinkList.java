
package stacklink;


/** 
 *
 * @author Nurislam
 */
public class LinkList{
    protected Link head = new Link(0, null, null);
    int i = 0;
    
    public void add(Object obj){
        Link link = new Link(i, head, obj);
        head = link;
        this.i++;
    }
    
    public Object remove(){
        if(i == 0){
            head = head.getLink();
            return null;
        }
        Link abs = getLink(i-1);
        Link temp = abs;
        abs.setLink(abs.getLink().getLink());
        return abs.getObj();
    }
    
    public Link getLink(int i){
        int k = 0;
        Link abs;
        for(abs = head; abs != null && k != i; abs=abs.getLink()){
            k++;
        }
        return abs;
    }

    public class Link {
        private int value;
        private Link link;
        private Object obj;
    
        public Link(int value, Link link, Object obj){
            this.value = value;
            this.link = link;
            this.obj = obj;
        }
        
        public Object getObj(){
            return obj;
        }
    
        public void setObj(Object obj){
            this.obj = obj;
        }
    
        public Link getLink(){
            return link;
        }
    
        public void setLink(Link link){
            this.link = link;
        }
    
        public int getValue(){
            return value;
        }
    
        public void setValue(int value){
            this.value = value;
        }
}

}
