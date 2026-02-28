import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int a = 2142548658;
        byte b = 127;
        short x = 32765;
        long d = 9222222222222222222L;
        float z = 3.4432454f;
        double s = 1.5059349504505843;


        System.out.println("Значение переменной a c типом int равно "+ a);
        System.out.println("Значение переменной b c типом byte равно "+ b);
        System.out.println("Значение переменной x c типом short равно "+ x);
        System.out.println("Значение переменной d c типом long равно "+ d);
        System.out.println("Значение переменной z c типом float равно "+ z);
        System.out.println("Значение переменной s c типом double равно "+ s);

        float aa = 27.12f;
        long bb = 987678965549L;
        float xx = 2.786f;
        short dd = 569;
        short ee = 27897;
        byte zz = 67;

        //задача 3

        byte uch1 = 23;
        byte uch2 = 27;
        byte uch3 = 30;
        short list = 480;
        int summ = uch1 + uch2 + uch3;
        int itog = list/summ;
        System.out.println("На каждого ученика рассчитано "+ itog + " листов бумаги.");

        //задача 4
        byte minut = 60;
        byte chas = 24;
        byte dney = 30;
        byte dney1 =3;
        byte butilok = 16;
        byte time = 2;
        byte dva = 20;
        int za20min = dva/time*butilok;
        int sutki = chas*minut/time*butilok;
        int friday = dney1*chas*minut/time*butilok;
        int moon = dney*chas*minut/time*butilok;
        System.out.println("За "+dva+" минут машина произвела "+ za20min + " штук бутылок.");
        System.out.println("За сутки машина произвела "+ sutki + " штук бутылок.");
        System.out.println("За "+dney1+" дня машина произвела "+ friday + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела "+ moon + " штук бутылок.");

        //задача 5
        byte nugno = 120;
        byte bel = 2;
        byte kor = 4;
        int classov = 120/(bel+kor);
        int bel1 = classov*bel;
        int kor2 = classov*kor;
        System.out.println("В школе, где "+classov+" классов, нужно "+ bel1 + " банок белой краски и " + kor2 + " банок коричневой краски.");
//задача 6
        byte banan = 5;
        byte massBanan = 80;
        short molokoml = 200;
        byte molokoed = 100;
        byte massMolok = 105;
        byte plom = 2;
        byte massPlom = 100;
        byte yaic = 4;
        byte massYaic = 70;
        float kg = 0.001f;

        int massGramm = banan*massBanan+molokoml*massMolok/molokoed+plom*massPlom+yaic*massYaic;
        float massKG = (banan*massBanan+molokoml*massMolok/molokoed+plom*massPlom+yaic*massYaic)*kg;
        System.out.println("Масса в граммах равна " + massGramm);
        System.out.println("Масса в кг равна "+ massKG);
//задача 7
        byte kgg = 7;
        int kgGr = 1000*kgg;
        short pot1 = 250;
        short pot2 = 500;
        int day250 = kgGr/pot1;
        int day500 = kgGr/pot2;
        int srednee = (day250-day500)/2+day500;
        System.out.println("Дней при потере 250 грамм в день - "+ day250);
        System.out.println("Дней при потере 500 грамм в день - "+ day500);
        System.out.println("Среднее количество дней - "+ srednee);
//задача 8.
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        float zp = 1.1f;
        byte god = 12;
        float mashazp = masha*zp;
        float deniszp = denis*zp;
        float kriszp = kris*zp;
        float mG = mashazp*god-masha*god;
        float mD = deniszp*god-denis*god;
        float kG = kriszp*god-kris*god;
        System.out.println("Маша теперь получает "+mashazp + " рублей. Годовой доход вырос на " + mG + " рублей.");
        System.out.println("Денис теперь получает "+deniszp + " рублей. Годовой доход вырос на " + mD + " рублей.");
        System.out.println("Кристина теперь получает "+kriszp + " рублей. Годовой доход вырос на " + kG + " рублей.");

    }
}