package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_CokluCheckedException {

    public static void main(String[] args)  {

        /*
           kodumuzda birden fazla exception olusma ihtimali varsa
           tek try, birden fazla catch blogu kullanabiliriz
           catch bloklari siralanirken, exception turleri dikkate alinmalidir

            -  EGER olusabilecek exception'lar arasinda
               parent child iliskisi yoksa
               istedigimiz siralamada yazabiliriz

            -  EGER  olusabilecek exception'lar parent-child iliskisine sahip iseler
               bu durumda child olani uste,
               parent olani alta yazmaliyiz
               aksi takdirde parent ustte olunca
               tum exception'lari yakalar ve child exception'i yazmak anlamsiz olur

         */

        String dosyaYolu = "src/day40_Exception/yazi.txt";

        try {

            FileInputStream fis = new FileInputStream(dosyaYolu); // doyaya ulasma

            int k=0;
            while((k= fis.read() ) != (-1)) { // dosyayi okuyup, bize getirme
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("yazılan dosya yolunda sorun var");
        } catch (IOException e) {
            System.out.println("dosya okunurken hata olustu");
        } catch (Exception e) {
            System.out.println("ongorulemeyen bir sorun olustu");
        }

    }

}
