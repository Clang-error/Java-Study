package ftest;

// 게임에 접속하는 사람들을 관리하는 프로그램을 작성하라. 메뉴는 “입장, 퇴장, 보기, 종료”로 4가지이다.
// 처음 프로그램이 시작될 때, 파일로부터 현재 입장 중인 회원들을 읽어들인다. 그리고 입장 중인 회원은 종료될 때,
// 파일(/Users/clang_error/01.Java/ftest/FinalTest/src/ftest/lol_members.txt)에 기록한다.

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

//입력단이랑 출력단 분리
public class MemberEx {
    HashMap<String, String> dic = new HashMap<>();
    public MemberEx() {
        File file = new File("C:\\data\\lol_members.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String name;
            while ((name = br.readLine()) != null) {
                if (!name.isBlank()) {
                    dic.put(name, name);
                }
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("읽을 파일이 없습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다.");
        }

        run(file);
    }

    public void run(File file) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("파일에서 회원 정보를 성공적으로 가져왔습니다. (총"+dic.size()+"명)");
        while (true) {

            System.out.println("\n=== LOL 게임방 접속 관리 프로그램 ===");
            System.out.println("1) 회원 입장\n2) 회원 퇴장\n3) 회원 전체 정보보기\n0) 종료");
            System.out.print("메뉴 선택:");

            String menu = scanner.nextLine();

            if (menu.equals("1")) {
                System.out.print("추가할 회원의 이름을 입력하세요: ");
                String name = scanner.nextLine();

                if (dic.containsKey(name)) {
                    System.out.println(name + "님은 이미 게임방에 입장 중입니다.");
                } else {
                    dic.put(name, name);
                    System.out.println(name + "님이 게임방에 입장했습니다.");
                }
            } else if (menu.equals("2")) {
                System.out.print("삭제할 회원의 이름을 입력하세요: ");
                String name = scanner.nextLine();

                if (dic.containsKey(name)) {
                    dic.remove(name);
                    System.out.println(name + "님이 게임방에서 퇴장하셨습니다.");
                } else {
                    System.out.println("해당 이름의 회원을 찾을 수 없습니다.");
                }
            } else if (menu.equals("3")) {

                if (dic.isEmpty()) {
                    System.out.println("입장 중인 회원이 없습니다.");
                } else {
                    System.out.println("\n--- 현재 게임방 접속자 목록 (총" +dic.size()+"명) ---");
                    for (int i = 0; i < dic.size(); i++) {
                        System.out.println((i + 1) + ". " + dic.get(dic.keySet().toArray()[i]));
                    }
                    System.out.println("-------------------------------------------");
                }
            } else if (menu.equals("0")) {
                save(file);
                System.out.println("현재 회원 목록을 파일('"+file+"')에 성공적으로 저장되었습니다.");
                System.out.println("프로그램을 종료합니다. 소환사의 협곡을 떠납니다!");
                break;
            } else {
                System.out.println("잘못된 메뉴선택입니다. 다시 입력해주세요.");
            }
        }

        scanner.close();
    }

    public void save(File file) { //저장 함수, 제일 중요함 
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (String name : dic.keySet()) {
                bw.write(name);
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            System.out.println("파일에 저장할 수 없습니다.");
        }
    }

    public static void main(String[] args) {
        new MemberEx();
    }
}
