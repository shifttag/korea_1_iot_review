package com.korit.test1;


class Test1 {
        void a() {
            System.out.println("a함수 호출");
        }

        static void b() {
            Tes1tMain.main(null);
        }
    }

public class Tes1tMain {

    public static int getNum10() {
        return 10;
    }


    public static void main(String[] args) {
        Test1 t = new Test1();  // 생성된 인스턴스가 존재하는 위치의 주소값
//        t.a();

//        Test1.b();

        int num2;
        int num3;
        int num4;
        int[] nums = new int[3];
        int[] nums2 = new int[3];

        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            System.out.println(n);    // 인덱스 번호가 필요한 경우 기존 for문 사용
        }

        for(int n : nums2) {
            System.out.println(n);      // 인덱스 번호가 필요없는 경우 forEach문
        }


    }
}
