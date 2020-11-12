package com.jt.test.httpClient;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class TestHttpClient {

	// get方法
	@Test
	public void doGet() throws ClientProtocolException, IOException {
		// 1 实例化HttpClient对象
		CloseableHttpClient client = HttpClients.createDefault();
		// 2 定义url
		String url = "http://manage.jt.com/web/item/562379";
		// 3 定义请求类型
		HttpGet get = new HttpGet(url);
		String method = get.getRequestLine().getMethod();
		System.out.println("获取请求类型:" + method);
		String http = get.getRequestLine().getProtocolVersion().toString();
		System.out.println("获取请求协议:" + http);
		String uri = get.getRequestLine().getUri();
		System.out.println("获取请求路径:" + uri);

		// 4 发起http请求
		CloseableHttpResponse response = client.execute(get);
		System.out.println(response.toString());
		// 判断状态信息是否正确为200
		if (response.getStatusLine().getStatusCode() == 200) {
			HttpEntity entity = response.getEntity();
			String result = EntityUtils.toString(entity);
			System.out.println(result);
		}
	}

	@Test
	public void doPost() throws ClientProtocolException, IOException {
		CloseableHttpClient client = HttpClients.createDefault();
		String url = "https://www.baidu.com";
		HttpPost post = new HttpPost(url);
		String method = post.getRequestLine().getMethod();
		System.out.println("获取请求类型"+method);
		String http = post.getRequestLine().getProtocolVersion().toString();
		System.out.println("获取请求协议："+http);
		String uri = post.getRequestLine().getUri();
		System.out.println("获取请求路径："+uri);
		
		CloseableHttpResponse response = client.execute(post);
		System.out.println(response.getStatusLine().getStatusCode());
		if(response.getStatusLine().getStatusCode()==200) {
			String result = EntityUtils.toString( response.getEntity());
			System.out.println(result);			
		}
		
		
	}

}
