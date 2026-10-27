package w;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface e {
    public static final java.lang.String a = "https://h.boxkj.com/";

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/lostAndFoundNotice/closeLostFoundNotice")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a(@retrofit2.http.Field("noticeId") java.lang.String r1, @retrofit2.http.Field("regionUserId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/lostAndFoundNotice/deleteLostFoundNotice")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b(@retrofit2.http.Field("noticeId") java.lang.String r1, @retrofit2.http.Field("regionUserId") java.lang.String r2);

    @retrofit2.http.POST("https://h.boxkj.com/app/goodsType/topLevelGoodsTypeList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/lostAndFoundNotice/addLostNoticeQAValidate")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d(@retrofit2.http.Field("noticeId") java.lang.String r1, @retrofit2.http.Field("regionUserId") java.lang.String r2, @retrofit2.http.Field("question") java.lang.String r3, @retrofit2.http.Field("answer") java.lang.String r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/user/grantUser")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("userName") java.lang.String r3, @retrofit2.http.Field("sex") java.lang.String r4, @retrofit2.http.Field("userNum") java.lang.String r5, @retrofit2.http.Field("phone") java.lang.String r6);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/user/userHasGranted")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> f(@retrofit2.http.Field("regionUserId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/lostAndFoundNotice/allUsefulLostFoundNoticeList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> g(@retrofit2.http.Field("pageIndex") int r1, @retrofit2.http.Field("pageSize") int r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/lostAndFoundNotice/reviewQAValidate")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> h(@retrofit2.http.Field("regionUserId") java.lang.String r1, @retrofit2.http.Field("validateAnswerId") java.lang.String r2, @retrofit2.http.Field("status") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/lostAndFoundNotice/addLostFoundNotice")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> i(@androidx.annotation.NonNull @retrofit2.http.Field("regionUserId") java.lang.String r1, @androidx.annotation.NonNull @retrofit2.http.Field("goodsTypeId") java.lang.String r2, @androidx.annotation.NonNull @retrofit2.http.Field("lostOrFound") int r3, @androidx.annotation.NonNull @retrofit2.http.Field("description") java.lang.String r4, @androidx.annotation.Nullable @retrofit2.http.Field("img") java.lang.String r5, @androidx.annotation.Nullable @retrofit2.http.Field("phone") java.lang.String r6, @androidx.annotation.Nullable @retrofit2.http.Field("qq") java.lang.String r7, @androidx.annotation.Nullable @retrofit2.http.Field("wechat") java.lang.String r8, @androidx.annotation.Nullable @retrofit2.http.Field("price") java.lang.String r9, @androidx.annotation.Nullable @retrofit2.http.Field("isValidate") java.lang.String r10, @androidx.annotation.Nullable @retrofit2.http.Field("validateCount") int r11, @androidx.annotation.Nullable @retrofit2.http.Field("question") java.lang.String r12);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/lostAndFoundNotice/getNoticeDetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> j(@retrofit2.http.Field("noticeId") java.lang.String r1, @retrofit2.http.Field("regionUserId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/lostAndFoundNotice/myLostFoundNoticeList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> k(@retrofit2.http.Field("regionUserId") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3);
}
