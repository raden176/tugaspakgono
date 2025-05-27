class luar {
    private int a;
    public void setA(int nilai){
        a=nilai;
    }
    public int getA(){
        return a;
    }
    class dalam {
        private int x =10;
        public void showData(){
            System.out.println("Nilai a dari kelas luar :"+a);
            System.out.println("Nilai x dari kelad dalam :"+ x);
        }
    }
    public void showData(){
        Dalam obj= new Dalam();
        Obj.showData();
    }
}
class DemoInnerClass {
    public static void main(String[] args) {
        luar obj1 = new luar();
        obj1.setA(5);
        obj1.showData();
    }
}