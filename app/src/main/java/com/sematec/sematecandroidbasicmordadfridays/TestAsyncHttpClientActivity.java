package com.sematec.sematecandroidbasicmordadfridays;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.sematec.sematecandroidbasicmordadfridays.pray.PrayTimesClass;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class TestAsyncHttpClientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_async_http_client);


        String url = "https://api.aladhan.com/v1/timingsByCity?city=Dubai&country=United%20Arab%20Emirates&method=8";
        AsyncHttpClient client = new AsyncHttpClient();


        client.get(url, new JsonHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);

                Gson gson = new Gson();
                PrayTimesClass pray = gson.fromJson(response.toString(), PrayTimesClass.class);
                String maqrib = pray.getData().getTimings().getMaghrib();
                Log.d("MYTAG", maqrib);
            }


            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
                Log.d("MYTAG", throwable.getMessage());
            }
        });

    }
}
