package is.its.ac.id;

public class LinkedList {
    Node header;

    LinkedList(){
        header=null;
    }

    void addAtFront(Node n){
        n.next=header;
        header=n;
    }

    void addAtEnd(Node n){
        if (header==null){
            header=n;
            return;
        }
        for(Node c=header;c!=null;c=c.next){
            if (c.next==null){
                c.next=n;
                return;
            }

        }

    }

    void deleteValue(Object v){
        if (header.value==v){
            header=header.next;
            return;
        }
        for(Node c=header;c.next!=null;c=c.next){
            if (c.next.value.equals(v)){
                c.next=c.next.next;
                return;
            }
        }

    }

    void deleteAtFront(){
        header=header.next;

    }

    void deleteAtEnd(){
        if (header.next==null){
            header=null;
            return;
        }
        for(Node c=header;c.next!=null;c=c.next){
            if (c.next.next==null){
                c.next=null;
                return;
            }
        }

    }

    void printFirstToEnd(){
        for(Node c=header;c!=null;c=c.next){
            System.out.print(c.value+" ");
        }

    }
}
