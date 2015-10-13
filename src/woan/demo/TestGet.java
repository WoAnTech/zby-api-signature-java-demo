package woan.demo;

import java.util.Date;

import m.i.k.k.o.utils.HttpTool;
import woan.videoserver.signature.Signature;

public class TestGet {

	public static void main(String[] args) {
		String queryKey = "abc";
		String uri="/api/20140928/task_list";
		String timeStamp=String.valueOf(new Date().getTime());
		String queryString="service_code=TESTING";
		String signature=null;
		try
		{
			signature = Signature.SignatureForGet(uri, queryKey, queryString, timeStamp);
			//System.out.println(timeStamp);
		}
		catch (Exception e)
		{
			
		}
		String result = HttpTool.get("http://c.zhiboyun.com/api/20140928/task_list?service_code=TESTING", timeStamp, signature);
		System.out.println(result);
	}

}
