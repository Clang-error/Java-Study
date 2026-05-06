//package TvReport;
//
//public class TV {
//	String model;
//	private int size=0;
//	private boolean power = false;
//	String Power = "OFF";
//	private int channel =0;
//	private int volume =0;
//	private int savevolume;
//	private int price=0;
//
//	TV(){ //똑같은 이름의 메서드가 여러개존재가능 , 구별법: 호출된 메서드가
//		//뒤에 따라오는 인자를 확인하고 알아서 호출함.	(method overloading)
//	}//캡슐화, 다형성, 생성자에 대하여. 레포트 다음 주 월요일까지
//	TV(String s,int size,int price){//생성자  객체를 만들때 호출이 되는 메서드
//		this.model=s;
//		this.size = size;
//		this.price = price;
//	}
//	void setModel(String m) {
//		model = m; //이게 없으면 아무것도 없는 생성자를 생성
//	}
//
//	void setSize(int size) {
//		this.size = size; //class 안에있는 size를 size라고 함.
//		// 이름이 중복되었기에 this를 사용함.
//	}
//
//	void powerOn() {
//		power = true;
//		Power = "ON";
//		System.out.println("현재전원"+ Power);
//	}
//
//	void powerOff() {
//		power = false;
//		Power = "OFF";
//		System.out.println("현재전원 "+ Power);
//	}
//
//	void setChannel(int c) {
//		channel = c;
//		System.out.printf("현재채널 : (%d)\n",channel);
//	}
//
//	int getChannel() {
//		return channel;
//	}
//
//	void channelUp() {
//		channel++;
//		System.out.printf("현재채널 : (%d)\n",channel);
//	}
//
//	void channelDown() {
//		channel--;
//		System.out.printf("현재채널 : (%d)\n",channel);
//	}
//
//	void volumeUp() {
//		volume++;
//		System.out.printf("현재볼륨 : (%d)\n",volume);
//	}
//
//	void volumeDown() {
//		volume--;
//		System.out.printf("현재볼륨 : (%d)\n",volume);
//	}
//
//	void resumevolume() {
//		volume = savevolume;
//	}
//
//	void mutevolume() {
//		savevolume = volume;
//		volume = 0;
//	}
//
//	void print() {
//		System.out.println("기기 정보");
//		System.out.println("모델 :"+ model);
//		System.out.println("사이즈 :"+ size);
//		System.out.println("현재전원 :"+ Power);
//		System.out.printf("현재채널 : (%d)\n",channel);
//		System.out.printf("현재볼륨 : (%d)\n",volume);
//		mutevolume();
//		System.out.printf("현재볼륨 : (%d)\n",volume);
//		resumevolume();
//		System.out.printf("현재볼륨 : (%d)\n",volume);
//		System.out.printf("가격 : %d원\n\n",price);
//	}
//}

package TvReport;

public class TV {
	String model; //모델정의
	private int size = 0; //private를 선언하여 캡슐화를 함, 모니터 사이즈
	private boolean Power = false; //boolean 변수를 사용하여 전원의 기본값을 false로 초기화
	private int channel = 0; //TV의 채널변수를 0으로 초기화
	private int volume = 0; //TV의 볼륨변수를 선언 후 0으로 초기화
	private int savevolume;//TV의 현재 볼륨을 저장하기 위한 변수
	private int price = 0; // TV의 가격변수를 선언 후 0으로 초기화

	TV() {
		//똑같은 이름의 생성자가 여러개존재가능 , 구별법: 호출된 생성자가
		//뒤에 따라오는 인자를 확인하고 알아서 호출함.
		//(constructor overloading)
	}


	TV(String s, int size, int price) {
		this.model = s; //this
		this.size = size;
		this.price = price;
	}

	TV(String x) {
		this.model = x;
	}

	//객체를 만들때 호출이 되는 생성자
	//아래 기술되는 함수는 메서드라고 칭하고 메서드 오버로딩되는
	//함수도 존재
	void powerOn() {
		Power = true;
	}

	void powerOff() {
		Power = false;
	}

	boolean isPowerOn() {
		System.out.println("현재전원:"+ (Power ? "ON" : "OFF"));
		return Power;
	}

	void channelUp() {
			channel++;
	}

	void channelDown () {
			channel--;
	}

	void setChannel ( int c){
			channel = c;
	}

	int getChannel () {
			return channel;
	}

	void volumeUp () { //++연산자를 사용하여 volume값을 1 증가함
			volume++;
	}

	void volumeDown () {//--연산자를 사용하여 volume값을 1 감소함
			volume--;
	}

	void mutevolume () { //현재 볼륨을 ‘savevolume’에 저장 후
			//볼륨을 0으로 초기화하여 데이터 값을 유지
			savevolume = volume;
			volume = 0;
	}

	void resumevolume() {
			//‘savevolume’에 저장되어있던 볼륨을
			//volume값에 덮어씌움
			volume = savevolume;
	}

	void print() {
			System.out.println("기기 정보");
			System.out.println("모델 :" + model);
			System.out.println("사이즈 :" + size);
			System.out.println("현재전원 : " + (Power ? "ON" : "OFF"));
			System.out.printf("현재채널 : (%d)\n", channel);
			System.out.printf("현재볼륨 : (%d)\n", volume);
			System.out.printf("가격 : %d원\n\n", price);
	}
}
