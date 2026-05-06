package ch04;
import java.util.Random;

public class Hashing {

    public static void main(String[] args) {
        MakeRandom mr = new MakeRandom();
        CountValue cv = new CountValue();
        Printer p = new Printer();
        int i = 0;
        int[] count = new int[10];
        int random;
        while(i<500) {
            i++;
            random = mr.getRandome();
            count[cv.compare(random)-1]++;
        }
        p.print(count);
    }
}
class Printer {
    public void print(int[] count) {
        for(int i=0;i<count.length;i++) {
            System.out.println(i+1+" : "+count[i]);
        }
    }
}


class MakeRandom {
    private Random r = new Random();
    public int getRandome() {
        return r.nextInt(100)+1;
    }
}

class CountValue {

    int compare(int a) {
        if(a>=1 && a<=10) {
            return 1;
        }else if(a>=11 && a<=20) {
            return 2;
        }else if(a>=21 && a<=30) {
            return 3;
        }else if(a>=31 && a<=40) {
            return 4;
        }else if(a>=41 && a<=50) {
            return 5;
        }else if(a>=51 && a<=60) {
            return 6;
        }else if(a>=61 && a<=70) {
            return 7;
        }else if(a>=71 && a<=80) {
            return 8;
        }else if(a>=81 && a<=90) {
            return 9;
        }else if(a>=91 && a<=100) {
            return 10;
        }else {
            return 0;
        }
    }
}
