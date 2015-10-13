package woan.demo;
import woan.videoserver.signature.Challenge;
public class TestChallenge {

	public static void main(String[] args) {
		 //challengestr,视频服务器在配置认证接口后，会将此值通知给接口
		//用户密码
		String password="123456";
		//视频服务器返回的challenge字符串
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
