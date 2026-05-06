package TvReport;

public class TVEx2 {
 	
	public static void main(String[] args) {
	TV tv2 = new TV("Samsung View2026",85,980000) ;//  tv2.model = "Samsung View2026";
//	tv2.powerOn();
//	System.out.println(tv2.model);
//	for(int i = 0; i<24; i++) {
//		tv2.channelUp();
//	}
//
//	for(int i = 0; i<10; i++) {
//		tv2.volumeUp();
//	}
//	tv2.setChannel(50);
	int c = tv2.getChannel();
	System.out.printf("현재 가져온 채널: %d\n\n", c);
	tv2.print();
	}
}
