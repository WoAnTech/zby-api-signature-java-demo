package woan.demo;
import woan.videoserver.signature.Challenge;
public class TestChallenge {

	public static void main(String[] args) {
		 //challengestr,��Ƶ��������������֤�ӿں󣬻Ὣ��ֵ֪ͨ���ӿ�
		//�û�����
		String password="123456";
		//��Ƶ���������ص�challenge�ַ���
		String challengestr="4d0606d422bed2376f2c22ba268a1cf2";
		try
		{
		String response = Challenge.GetChallenge(password, challengestr);
		System.out.println(response);
		}
		catch (Exception e)
		{
			
		}
		
	}

}
