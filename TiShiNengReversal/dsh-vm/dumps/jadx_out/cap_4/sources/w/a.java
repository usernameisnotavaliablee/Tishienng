package w;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface a {
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/chat/updateReadStatus")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a(@retrofit2.http.Field("type") int r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("groupId") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/chat/getUserInfo")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.POST("app/chat/listChats")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c();

    @retrofit2.http.POST("app/chat/getChatInfo")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/chat/getChat")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e(@retrofit2.http.Field("type") int r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("groupId") java.lang.String r3, @retrofit2.http.Field("pageSize") java.lang.Integer r4, @retrofit2.http.Field("pageIndex") java.lang.Integer r5, @retrofit2.http.Field("lastDateTime") java.lang.String r6);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/chat/listFriends")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> f(@retrofit2.http.Field("groupId") java.lang.String r1);
}
