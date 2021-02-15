package Fikri.app.chatz.Fragments;

import Fikri.app.chatz.Notifications.MyResponse;
import Fikri.app.chatz.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAK9tRIhM:APA91bED5T5H-571oXHag0vVNOP_jyzJ-0Ze901t-hIgxieeedZknsqu0gwaLOl97KPb6UwKsV4nQti0pQjIKk-7IfMvGNUSeeeuyPcGnzyDMBn2QI8NwnixkZlbs6gmhdOgH9A0uaPx"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
