package w;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface f {
    public static final java.lang.String a = "https://m.boxkj.com/";
    public static final java.lang.String b = "e8167ef026cbc5e456ab837d9d6d9254";
    public static final java.lang.String c = "bxkj2018";

    @com.bxkj.base.v2.http.interceptor.Test(demo = "7d7f2d3627c76f56f26fb6f1e1b8fed1")
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/update")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("appSign") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/api/permission/getPermission")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userNum") java.lang.String r2, @retrofit2.http.Field("pid") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/uploadVideo/loadUploadVideoDetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/uploadVideo/loadVideoType")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/sch/getSchoolById")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e(@retrofit2.http.Field("schoolId") java.lang.String r1);

    @retrofit2.http.POST("https://m.boxkj.com/app/province/findAllProvince")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> f();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/replyFeedBack/getReplyFeedBackBySuId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> g(@retrofit2.http.Field("feedBackId") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/admin/analysis/addUploadRecord")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> h(@retrofit2.http.Field("schoolId") java.lang.Integer r1, @retrofit2.http.Field("platform") java.lang.Integer r2, @retrofit2.http.Field("deviceId") java.lang.String r3, @retrofit2.http.Field("brandName") java.lang.String r4, @retrofit2.http.Field("deviceNum") java.lang.String r5, @retrofit2.http.Field("sysUserId") java.lang.String r6, @retrofit2.http.Field("versionName") java.lang.String r7);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/sys/addintegral")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> i(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userNum") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/replyFeedBack/addReplyFeedBack2")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> j(@retrofit2.http.Field("appVersion") java.lang.String r1, @retrofit2.http.Field("platform") java.lang.String r2, @retrofit2.http.Field("schoolId") java.lang.String r3, @retrofit2.http.Field("feedbackContent") java.lang.String r4, @retrofit2.http.Field("userId") java.lang.String r5, @retrofit2.http.Field("phone") java.lang.String r6, @retrofit2.http.Field("fileName") java.lang.String r7, @retrofit2.http.Field("images") java.lang.String r8, @retrofit2.http.Field("type") java.lang.String r9);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/sysFeedback/getFeedBackByUid")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> k(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("schoolId") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/bindDevice/getBindDevicePagerData")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> l(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("keys") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/sys/integralInfo")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> m(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userNum") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/sch/listSchoolByProvinceId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> n(@retrofit2.http.Field("provinceId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/bindDevice/unBindDevice")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> o(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/replyFeedBack/getReplyFeedBackByUserId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> p(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/uploadVideo/loadSchoolUploadVideo")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> q(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("keyword") java.lang.String r2, @retrofit2.http.Field("typeId") java.lang.String r3, @retrofit2.http.Field("pageIndex") int r4, @retrofit2.http.Field("pageSize") int r5);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/admin/appUpdate/teaAppVersion2")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> r(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("type") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/replyFeedBack/getReplyFeedBackCountUser")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> s(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/replyFeedBack/addReplyFeedBack")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> t(@retrofit2.http.Field("feedBackId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("replyContent") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/sys/sumIntegralAndIsSign")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> u(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userNum") java.lang.String r2, @retrofit2.http.Field("name") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/appadverties/addappadverties")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> v(@retrofit2.http.Field("advertiesId") java.lang.String r1, @retrofit2.http.Field("schoolId") java.lang.String r2, @retrofit2.http.Field("userId") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/bindDevice/validateDeviceBind")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> w(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userNum") java.lang.String r2, @retrofit2.http.Field("code") java.lang.String r3, @retrofit2.http.Field("manufacturer") java.lang.String r4, @retrofit2.http.Field("model") java.lang.String r5, @retrofit2.http.Field("platform") java.lang.String r6);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://m.boxkj.com/app/replyFeedBack/addReplyFeedBack2")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> x(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("appVersion") java.lang.String r3, @retrofit2.http.Field("platform") java.lang.String r4, @retrofit2.http.Field("replyContent") java.lang.String r5, @retrofit2.http.Field("fileName") java.lang.String r6, @retrofit2.http.Field("userName") java.lang.String r7, @retrofit2.http.Field("userNum") java.lang.String r8, @retrofit2.http.Field("userPhone") java.lang.String r9);
}
