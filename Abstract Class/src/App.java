public class App {
    public static void main(String[] args) {
        Pembeli pembeli1 = new Pembeli();
        pembeli1.idPLN = 1202220265 ; 
        pembeli1.nama = "Mukidi";
        pembeli1.jumlahToken = 100000 ;

        System.out.println("ID PLN = "+ pembeli1.idPLN);
        System.out.println("Nama = "+ pembeli1.nama);
        System.out.println("Jumlah Token = "+ pembeli1.jumlahToken);
        pembeli1.caraBayar();
        System.out.println();
    }
}
