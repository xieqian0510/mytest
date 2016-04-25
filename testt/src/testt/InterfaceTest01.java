package testt;

import java.util.List;

interface Extendbroadable {
	public void inPut();
}

interface Extendbroadable1<T> {
	public T getVar(T t);
}

interface Extendbroadable2 {
	public <T> T getVar(List<T> t);
}

class KeyBroad1<T> implements Extendbroadable1<T> {

	@Override
	public T getVar(T t) {
		// TODO Auto-generated method stub
		return t;
	}
}

class KeyBroad2 implements Extendbroadable2 {

	@Override
	public <T> T getVar(List<T> t) {
		// TODO Auto-generated method stub
		return (T) t;
	}
}

class KeyBroad implements Extendbroadable {
	public void inPut() {
		System.out.println(" hi,keybroad has be input into then mainbroad! ");
	}
}

class NetCardBroad implements Extendbroadable {
	public void inPut() {
		System.out
				.println(" hi,netCardBroad has be input into then mainbroad! ");
	}
}

class CheckBroad {
	public static void getMainMessage(Extendbroadable ext) {
		ext.inPut();
	}
}

class test {
	public void t1() {
		CheckBroad.getMainMessage(new Extendbroadable() {
			public void inPut() {
				System.out
						.println(" hi,keybroad has be input into then mainbroad! ");

			}
		});
	}

	public void t2() {
		CheckBroad.getMainMessage(new Extendbroadable() {
			public void inPut() {
				System.out
						.println(" hi,netCardBroad has be input into then mainbroad! ");

			}
		});
	}
}

public class InterfaceTest01 {
	public static void main(String[] args) {
		// // 1��ÿ����̳нӿ�ʵ�֣��������
		// // ȱ��:
		// // 1,��ͬ��������Ҫһ������ʵ��
		// KeyBroad kb = new KeyBroad();
		// kb.inPut();
		// NetCardBroad ncb = new NetCardBroad();
		// ncb.inPut();
		//
		// // 2��ÿ����̳нӿ�ʵ�֣���ͨ��ʵ�����ʵ������ͨ��Ĳ�������ÿ�����ʵ�������ÿ��ʵ����Ĳ���
		// // ȱ��:
		// // 1,��ͬ��������Ҫһ������ʵ��
		// CheckBroad cb = new CheckBroad();
		// cb.getMainMessage(kb);
		// cb.getMainMessage(ncb);
		//
		// // 3����ͨ��ʵ�����ʵ������ͨ��Ĳ�������ÿ�����ʵ�������������ÿ������ʹ��������ʵ�ֽӿڣ�
		// // ȱ�㣺
		// // 1���������޷�����
		// test t = new test();
		// t.t1();
		// t.t2();

		KeyBroad1 KeyBroad2 = new KeyBroad1();

		System.out.println(KeyBroad2.getVar(22));
	}
}