public class Program {
    public static void main(String[] args) {
        String message="Kişi 'Benim adım Ahmet' dedi.\n" ; // back slash ve n newline yani yazdıktan sonra yeni satıra geçer.
        String message2="Kişi \"Benim adım Ahmet\" dedi."; /* Arasında yazılanları yorum satırına alır.  / escape kaçış sembolüdür ve istisnai olarak
        kullanımı gereken ama normalde sorun çıkartanff sembolleri yazdırır.*/
        System.out.print(message);
        System.out.println("merhaba dünya");
}
}

