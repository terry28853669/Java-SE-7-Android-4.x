package CH10;

// �D���O
public class Ch10_4_2_2 {
	// �D�{��
	public static void main(String[] args) {
		System.out.print("�����: ");
		System.out.println(Thread.currentThread());
		// �إ߰ΦW���h���O�ӱҰʰ����
		new Thread("�����B") {
			int length = 150;

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
		}.start(); // �Ұʰ����
	}
}