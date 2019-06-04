package com.microstrategy.slackapp.utils;

import okhttp3.*;

import java.io.IOException;
import java.util.Map;

/**
 * http工具类
 *
 **/
public class HttpUtils {
  public static String sendGet(String url){
    OkHttpClient okHttpClient = new OkHttpClient();
    Request request = new Request.Builder()
            .url(url)
            .build();
    Call call = okHttpClient.newCall(request);
    Response response = null;
    String res="";
    try {
      response = call.execute();
      res=response.body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return res;
  }
  public static String doPost(String urlPath, Map<String, String> params){

    OkHttpClient okHttpClient = new OkHttpClient();
    FormBody.Builder formBuilder = new FormBody.Builder();
    for(Map.Entry<String,String> entry : params.entrySet()){
      formBuilder.add(entry.getKey(),entry.getValue());
    }
    FormBody requestBody = formBuilder.build();
    Request request = new Request.Builder().url(urlPath)
            .post(requestBody).build();
    try {
      Response response = okHttpClient.newCall(request).execute();
      return response.body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "";

  }


  /*public static String doGet(String urlPath,Map<String,String> params) {
    URL url = null;
    try {
      url = new URL(urlPath);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      // 设置属性
      conn.setRequestProperty("Accept", "application/json");
      *//*String access_token=params.get("access_token");
      conn.setRequestProperty("Authorization", "token "+access_token);*//*
      conn.setConnectTimeout(3000);
      conn.setRequestMethod("GET");
      // 建立连接
      conn.connect();
      // 读取响应状态，建立输入流，获取响应内容
      int rspCode = conn.getResponseCode();
      if (200 == rspCode) {
        InputStream in = conn.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuffer temp = new StringBuffer();
        String line = reader.readLine();
        while (line != null) {
          temp.append(line);
          line = reader.readLine();
        }
        reader.close();
        String result = new String(temp.toString().getBytes(),"utf-8");
        if (result != null) {
          *//*System.out.println("返回结果：" + result);*//*
          return result;
        }
      }
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }*/


  /*public static String doPost(String urlPath, Map<String, String> params) {
    URL url=null;
    try {
      url = new URL(urlPath);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      // 设置属性
      conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded" );
      conn.setRequestProperty("Accept", "application/json");
      conn.setDoOutput(true);
      conn.setConnectTimeout(3000);
      conn.setRequestMethod("POST");
      // 建立连接
      conn.connect();
      // 设置请求体
      OutputStream outputStream = conn.getOutputStream();
      //String requestParam = JSON.toJSONString(params);
      String requestParam = "client_id="+URLEncoder.encode(params.get("client_id"),"utf-8")+"&client_secret="+
              URLEncoder.encode(params.get("client_secret"),"utf-8")+"&code="+
              URLEncoder.encode(params.get("code"),"utf-8");
      outputStream.write(requestParam.getBytes());
      outputStream.flush();
      outputStream.close();
      // 读取响应状态，建立输入流，获取响应内容
      int resultCode = conn.getResponseCode();
      if (HttpURLConnection.HTTP_OK == resultCode) {
        InputStream in = conn.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        StringBuffer temp = new StringBuffer();
        String line = bufferedReader.readLine();
        while (line != null) {
          temp.append(line);
          line = bufferedReader.readLine();
        }
        bufferedReader.close();
        String result=new String(temp.toString().getBytes());
        if (result != null) {
          *//*System.out.println("返回结果：" + result);*//*
          return result;
        }
      }
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }*/



}