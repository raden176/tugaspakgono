Public class Lagu {
    private String band;
    private String judul;
    public void isiparam (string judul, string band){
        this.judul = judul;
        this.band = band;
    }

  public void cetakKeLayar(){
    if(judul==null&&band==null)return;
    System.out.println("Judul :" + judul + "\nband :" + pencipta);
  }

 public class DemoLagu {
    public static void main(String [] args){
        Lagu song = new Lagu();
        song.isiparam("Dance Beside", "All American Reject");
        song.cetakKeLayar();
    }
 }
}