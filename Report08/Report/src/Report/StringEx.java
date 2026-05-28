package Report;

class SetString {
    String str;
    SetString(int a) {
        if (a == 0)
            this.str = "Only I can change me life, no one can do it for me.";
        else if (a==1)
            this.str="They must often change who would be constant in happiness or wisdom.";
        else if (a==2)
            this.str="Life is unfair, get used to it.";
        else if (a==3)
            this.str="Great minds have purposes, others have wishes.";
        else if (a==4)
            this.str="A day without laughter is a day wasted. ";
    }

}

class CompareString {
    private int longest=0;
    private int pointers=0;
    private SetString[] arr;

    CompareString(SetString[] str) {
        this.arr = str;
    }

    public void compare() {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].str.length() > longest) {
                pointers = i;
                longest = arr[i].str.length();
            }
        }

        System.out.println("가장 긴 문장은: " + arr[pointers].str +" 입니다.");
    }

}

class VowelCount {
    private SetString[] arr;
    VowelCount(SetString[] str) {
        this.arr = str;
    }
    public void count() {
        for (int i = 0; i < arr.length; i++) {
            int vowel = 0;
            for (int j = 0; j < arr[i].str.length(); j++) {
                if (arr[i].str.charAt(j) == 'a' || arr[i].str.charAt(j)=='A' ||
                        arr[i].str.charAt(j) == 'e' || arr[i].str.charAt(j) == 'E' ||
                        arr[i].str.charAt(j) == 'i' || arr[i].str.charAt(j) == 'I' ||
                        arr[i].str.charAt(j) == 'o' || arr[i].str.charAt(j) == 'O' ||
                        arr[i].str.charAt(j) == 'u' || arr[i].str.charAt(j) == 'U');
                vowel++;
            }
            System.out.println("\n "+arr[i].str + "\n 모음 개수는 " + vowel +"개 입니다.");
        }
    }
}

class WhichBe {
    private SetString[] arr;
    WhichBe(SetString[] str) {
        this.arr = str;
    }
    public void CheckBe() {
        for (int i = 0; i < arr.length; i++) {
            int beCount = 0;
            String[] words = arr[i].str.split(" ");
            for (int j = 0; j < words.length; j++) {
                if(words[j].equals("be") || words[j].equals("am") || words[j].equals("is")||
                        words[j].equals("are")|| words[j].equals("was")|| words[j].equals("were")) {
                            beCount++;
                }
            }
            if(beCount==0) {
                System.out.println("\n"+arr[i].str + "\n이 문장에는 be동사가 없습니다.");
            } else {
                System.out.println("\n"+arr[i].str + "\n이 문장에는 "+beCount+"개의 be동사가 존재합니다.");
            }
        }
    }
}

public class StringEx {
    public static void main(String[] args) {
        SetString[] arr = new SetString[5]; //배열 선언
        for (int i = 0; i < arr.length; i++) { //배열 요소 초기화
            arr[i] = new SetString(i);
        }
        CompareString cs = new CompareString(arr);
        VowelCount vc = new VowelCount(arr);
        WhichBe wb = new WhichBe(arr);
//        cs.compare();
//        vc.count();
        wb.CheckBe();
    }
}

