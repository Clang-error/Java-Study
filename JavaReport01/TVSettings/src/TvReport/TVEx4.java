package TvReport;

public class TVEx4 {
    public static void main(String[] args) {
        TV SamsungTv = new TV("SUMSUNG 울트라HD 스마트TV", 75, 980000);
        SamsungTv.powerOn();
        for(int i = 0; i<9; i++) {
            SamsungTv.channelUp();}
        for(int i = 0; i<15; i++) {
            SamsungTv.volumeUp();}
        SamsungTv.print();
        SamsungTv.mutevolume();
        SamsungTv.print();
        SamsungTv.resumevolume();
        SamsungTv.print();
    }
}
