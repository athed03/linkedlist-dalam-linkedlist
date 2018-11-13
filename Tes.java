class Tes{
    Node head;
    
    public Tes(){
        head=null;    
    }

    public void tambah(int data, String s){
        Node baru =  new Node(data);
        baru.tamb(s);
        if(head ==  null)
            head=baru;
        else{
            baru.next = head;
            head = baru;
        }
    }
        

    public void tampil(){
        Node c=head;
        while(c != null){
            System.out.println("--- "+c.data);
            Node2 c2 = c.h;
            while (c2!=null){
                System.out.println("* "+c2.kategori);
                c2=c2.next;
            }        
            c=c.next;
        }
    }

    public void tambkat(int data, String kat){
        Node c = head;
        
        while(c.data != data){
            c=c.next;
        }

        c.tamb(kat);
    }

    public static void main(String[] args){
        Tes t = new Tes();
        t.tambah(1,"aku");
        t.tambkat(1,"kamu");
        t.tambah(2,"dia");
        t.tambkat(2,"mereka");
        t.tambkat(2,"kalian");
        t.tambkat(1,"antum");
        t.tampil();
    }

}

class Node{
    int data;
    Node next;    
    Node2 h;

    public Node(){
        h=null;    
    }
    
    public Node(int data){
        this.data = data;
        new Node();
    }

    public void tamb(String ka){
        Node2 baru =  new Node2(ka);
        if(h ==  null)
            h=baru;
        else{
            baru.next = h;
            h = baru;
        }
    }
}

class Node2{
    Node2 next;
    String kategori;

    public Node2(String kate){
        kategori = kate;    
    }
}
