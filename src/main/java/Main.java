import okhttp3.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=WxGAAsGaYTyGgGyagTzyh2SiS6vRIyy3&language=en-us&details=true&metric=false")
                .build();

        OkHttpClient client = new OkHttpClient();
        Call call = client.newCall(request);
        Response response = call.execute();
        String json = response.body().string();
        System.out.println(json);
    }

}
