package w;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface c {
    public static final java.lang.String a = "https://h.boxkj.com/";

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/appInformation/appInformationTitle")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a(@retrofit2.http.Field("pageSize") java.lang.Integer r1, @retrofit2.http.Field("pageIndex") java.lang.Integer r2, @retrofit2.http.Field("inforTypeId") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/appInformation/appInformationTitleDesc")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b(@retrofit2.http.Field("pageSize") java.lang.Integer r1, @retrofit2.http.Field("pageIndex") java.lang.Integer r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/appInformation/appInformationIndex")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c(@retrofit2.http.Field("pageSize") java.lang.Integer r1, @retrofit2.http.Field("pageIndex") java.lang.Integer r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/appInformation/appInformationindex")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d(@retrofit2.http.Field("pageSize") java.lang.Integer r1, @retrofit2.http.Field("pageIndex") java.lang.Integer r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/appInformation/appInformationPublish")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e(@retrofit2.http.Field("inforId") java.lang.String r1);
}
