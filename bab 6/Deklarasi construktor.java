Public class DemoManusia{
    Public static void main(String[] args){
        Manusia arrMns[] = new Manusia[3];
            Manusia objMnsl = new Manusia();
            objMnsl.setNama ("Markonah");
            objMnsl.setUmur(76);
        Manusia objMns2 = new Manusia("MatConan");
        
        Manusia objMns3 = new Manusia("Bajuri",45);
        arrMns[0]= objMns1;
        arrMns[1] = objMns2
        arrMns[2] = 0bjMns3;
        for(int i=0;i<3;i++){
            System.out.println("Nama :" + arrMns[i].getNama());
            System.out.println("Umur :" + arrMns[i].getUmur());
            System.out.println();
        }
        }
    }