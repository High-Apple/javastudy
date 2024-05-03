package pkg02_open_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class MainClass {

  public static void main(String[] args) {

    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath");
    builder.append("?serviceKey=").append("Ey838Ex4vbl3nnmdT%2FqDPRbqU8Qh9R0I9oSuImdTG0MsEmY1Lv51hNXQTf6l9zzeqoZyhIvonnH%2B10OjPn5Fdg%3D%3D");
    builder.append("&searchYear=").append(2022);
    builder.append("&siDo=").append(1100);
    builder.append("&guGun=").append(1125);
    builder.append("&type=").append("json");
    builder.append("&numOfRows=").append(10);
    builder.append("&pageNo=").append(1);
    
    String spec = builder.toString();
    URL url = null;
    HttpURLConnection con = null;
    
    BufferedReader in = null;
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection)url.openConnection();
      if(con.getResponseCode() != 200) {
        System.out.println("접속불가");
      }
      
      in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      String Line = null;
      
      StringBuilder sb = new StringBuilder();
      
      while((Line = in.readLine()) != null) {
        sb.append(Line);
      }
      
      /*
       * JSON object -> {} 객체 처리용
       * JSON Array -> [] 배열 처리용
       * 
       * JSON Object obj = {name:value}
       * obj.get
       * -> value가 int인 경우 obj.getInt(name)
       * -> value가 String인 경우 obj.getString(name)
       * -> value가 {}객체인 경우 obj.getJSONObject(name)
       * -> value가 []배열인 경우 obj.getJSONArray(name)
       * 
       * String responseData = sb.toString();
       * JSONObject obj = new JSONObject(responseData);
       * obj.getString("resultCode") == "00"
       * obj.getString("resultMsg") == "NORMAL_CODE"
       * obj.getJSONObject("items").getJSONArray("item")
       *
       *item에 배열이 들어있는 구조. 여기까지 해야 원하는 뒷부분 배열 데이터들을 가져옴.
       */

      JSONObject obj = new JSONObject(sb.toString());
      JSONArray items = obj.getJSONObject("items").getJSONArray("item");
      for(int i = 0, length = items.length(); i < length; i++) {
        Map<String, Object> map = items.getJSONObject(i).toMap();
        System.out.println(map.get("occrrnc_dt") + ":" + map.get("dth_dnv_cnt"));
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      con.disconnect();
    }
    
  }

}
