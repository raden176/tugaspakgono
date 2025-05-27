public class phone {
    private string merk;
    private int harga;
    public Phone(){
    }
public phone (string merk){
        this.merk=merk;
    }
public phone (String merk, int harga){
        this.merk=merk;
        this.harga=harga;
    }
public void lihatPhone(){
    System.out.println("Merk :".merk);
    System.out.println("Harga :".harga);
    System.out.println("");
    }
    
}

Public class DemoOverLoading {
    public static void main (string args[]){
        System.out.println("");
        Phone p1 = new Phone ();
        Phone p2 = new Phone ("Nokia");
        Phone p3 = new Phone ("Sony Ericsoon",500);
    
    System.out.println("Perbedaan output dari maring-masing konstruktor");
        p1.lihatPhone ();
        p2.lihatPhone ();
        p3.lihatPhone ();

        Phone p4,p5;
        p4 = new Phone();
        p5 = new Phone();
        p4.isiPhone("Samsung");
        p5.isiPhone("Samsung", 5000);

    System.out.println("Pebedan outuput dari masing masing method");
        p4.lihatPhone();
        p5.lihatPhone();
    }
}