package CH10;
// �D���O
public class Ch10_4_2 {
	// �D�{��
	public static void main(String[] args) {
		System.out.print("�����: ");
		System.out.println(Thread.currentThread());
		// �إ߰��������
		SumThread2 st1 = new SumThread2(150, "�����A");
		// �Ұʰ����
		st1.start();		
	}
}

// ��������O
class SumThread2 extends Thread {
	private long length;

	// �غc�l
	public SumThread2(long length, String name) {
		super(name);
		this.length = length;
	}

	// ��������
	public void run() {
		long temp = 0;
		for (int i = 1; i <= length; i++) {
			try { // �Ȱ��@�q�ɶ�
				Thread.sleep((int) (Math.random() * 10));
			} catch (InterruptedException e) {
			}
			temp += i;
		}
		System.out.println(Thread.currentThread() + "�`�M = " + temp);
	}
}