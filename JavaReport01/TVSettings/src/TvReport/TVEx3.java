package TvReport;

public class TVEx3 {
    public static void main(String[] args) {
        TV Samsung = new TV("SUMSUNG 울트라HD 스마트TV", 75, 980000); //new를 사용하여 생성자 호출하여 인자정보를 초기화.
        Samsung.powerOn();
        TV LG = new TV("LG 4K UHD TV", 65, 930000); // 생성자에 들어갈 인자 "제품명","사이즈","가격"
        TV Sony = new TV("SONY HD TV X90L", 65, 750000);
        Samsung.powerOn();
        Sony.powerOn();

        for (int i = 0; i < 9; i++) {Samsung.channelUp();} //Samsung의 채널을 수를 올림
        for (int i = 0; i < 15; i++) {Samsung.volumeUp();} //Samsung의 볼륨을 올림
        //LG는 바꾸지 않아도 되기에 따로 for문을 돌리지 않음(이미 0으로 초기화 해뒀음)
        for (int i = 0; i < 24; i++) {Sony.channelUp();} //Sony의 채널을 수를 올림
        for (int i = 0; i < 15; i++) {Sony.volumeUp();} //Sony의 볼륨을 올림
        Samsung.print(); //TV.java에 있는 print()메소드를 호출하여 출력.
        LG.print();
        Sony.print();
    }
}
