package CH08;
// �D�{�����O
public class Ch8_4 {
	// �D�{��
	public static void main(String[] args) {
		SavingAccount s; // SavingAccount���O�������ܼ�
		// �ŧiSavingAccount���O���A���ܼ�, �åB�إߪ���
		SavingAccount s1 = new SavingAccount("002-10-222-345", 5000.00, 0.015,true);
		Account s2 = new SavingAccount("002-10-333-123", 15000.00, 0.02, false);
		// ��ܱb��s1�����
		System.out.println("�s�ڱb��s1����� =====");
		System.out.println("�b��: " + s1.accountid);
		System.out.println("�l�B: " + s1.getBalance());
		System.out.println("�Q�v: " + s1.interest);
		System.out.println("�O�_��ATM�d: " + s1.haveCard);
		s1.calInterest(); // �I�s���󪺤�k
		// ��ܱb��s2�����, �ˬd�O�_��SavingAccount����
		if (s2 instanceof SavingAccount)
			System.out.println("->s2�OSavingAccount����");
		System.out.println("�s�ڱb��s2����� =====");
		s = (SavingAccount) s2; // ���A�ഫ
		System.out.println("�b��: " + s2.accountid);
		System.out.println("�l�B: " + s2.getBalance());
		System.out.println("�Q�v: " + s.interest);
		System.out.println("�O�_��ATM�d: " + s.haveCard);
		s2.calInterest(); // �I�s���󪺤�k
	}
}

abstract class Account { // Account���O�ŧi
	public String accountid; // �b��s��
	private double amount; // �b��l�B
	public double interest; // �Q��

	// ��H��k: �p��Q��
	public abstract void calInterest();

	// ������k: ���w�b��l�B
	public void setBalance(double a) {
		amount = a;
	}

	// ������k: ���o�b��l�B
	public double getBalance() {
		return amount;
	}
}

// SavingAccount���O�ŧi
class SavingAccount extends Account {
	public boolean haveCard;

	// �غc�l
	public SavingAccount(String id, double amount, double interest,	boolean haveCard) {
		accountid = id;
		setBalance(amount);
		this.interest = interest;
		this.haveCard = haveCard;
	}

	// ������k: ��@��H��kcalInterest()
	public void calInterest() {
		double amount = getBalance();
		System.out.println("�Q��: " + (amount * interest));
	}
}