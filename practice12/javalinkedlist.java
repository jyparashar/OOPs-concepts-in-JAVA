package practice12;

class node{
    int data;
    node next;
    
    node(int d,node n)
    {
        data=d;
        next=n;
    }
}

public class javalinkedlist {
    public static void main(String a[])
    {
        node n1=new node(10,null);
        node n2=new node(20,null);
        
        n1.next=n2;
        n2.next=null;
        
        node p=n1;
        while(p!=null)
        {
            System.out.print(p.data+" ->");
            p=p.next;
        }
    }
    
}
