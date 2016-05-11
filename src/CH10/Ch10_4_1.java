package CH10;

// �D���O
public class Ch10_4_1 {
	// �D�{��
	public static void main(String[] args) {
		System.out.print("�����: ");
		System.out.println(Thread.currentThread());
		// �إ߰��������
		SumThread st1 = new SumThread(150);
		Thread t1 = new Thread(st1, "�����A");
		SumThread st2 = new SumThread(150);
		Thread t2 = new Thread(st2, "�����B");
		// �Ұʰ����
		t1.start();
		t2.start();
	}
}

// �ϥΪ����O
class SumClass {
	private long length;

	// �غc�l
	public SumClass(long length) {
		this.length = length;
	}

	// �p���`�M
	public long sum() {
		long temp = 0;
		for (int i = 1; i <= length; i++) {
			try { // �Ȱ��@�q�ɶ�
				Thread.sleep((int) (Math.random() * 10));
			} catch (InterruptedException e) {
			}
			temp += i;
		}
		return temp;
	}
}

// ��������O
class SumThread extends SumClass implements Runnable {
	// �غc�l
	public SumThread(long length) {
		super(length);
	}

	// ��������
	public void run() {
		System.out.println(Thread.currentThread() + "�`�M = " + sum());
	}
}