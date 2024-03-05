package sec02;

public class CastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double d;
		byte b;

		i = 7 / 4;
		System.out.println(i); // 정수형이기 때문에 결과는 1
		d = 7 / 4;
		System.out.println(d); // 실수형이기 때문에 결과는 1.0
		d = 7 / (double) 4; // 정수 4를 강제로 실수 4.0로 변환, 7을 4.0으로 나누면 1.75
		System.out.println(d);
		// i = 7 / (double) 4; ---> 타입 불일치 오류 발생. 실수를 정수형에 저장할 수 없다.

		i = 300;
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
			// Byte.MIN_VALUE(byte 타입이 표현할 수 있는 가장 작은 값 -128)
			// Byte.MAX_VALUE(byte 타입이 표현할수 있는 가장 큰 값 127)
			System.out.println("byte 타입으로 변환할 수 없습니다.");
		else
			b = (byte) i;

		// 만약에 i 가 -128보다 작거나 127보다 크면 출력문을 출력하고,
		// 아니면 b에 i를 byte타입으로 형변환해서 대입하라
	}

}
