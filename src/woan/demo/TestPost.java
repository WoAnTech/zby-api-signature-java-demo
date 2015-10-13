package woan.demo;
import java.util.Date;

import net.sf.json.JSONObject;
import m.i.k.k.o.utils.HttpTool;
import woan.videoserver.signature.Signature;
public class TestPost {

	public static void main(String[] args) {
		String queryKey = "abc";
		String uri="/api/20140928/management";
		String timeStamp=String.valueOf(new Date().getTime());
		String queryString="service_code=TESTING";
		String signature=null;
		JSONObject json=new JSONObject();
		JSONObject json1=new JSONObject();
		json1.accumulate("service_code","TESTING");
		json1.accumulate("file_name", "1.m3u8");
		json.accumulate("function","delete_video");
		json.accumulate("params", json1.toString());

		try
		{
			signature = Signature.SignatureForPost(uri, queryKey, queryString, json.toString(), timeStamp);
			//System.out.println(signature);
		}
		catch (Exception e)
		{
			
		}
		String result = HttpTool.post("http://c.zhiboyun.com/api/20140928/management?service_code=TESTING", json.toString(), timeStamp, signature);
		//String result= HttpTool.post("http://192.168.0.56:8080/cloud/front/taskInfo/add/task", json.toString(), timeStamp, signature);
		System.out.println(result);
	}

}
