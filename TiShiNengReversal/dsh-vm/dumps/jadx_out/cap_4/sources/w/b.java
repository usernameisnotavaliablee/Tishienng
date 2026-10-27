package w;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface b {
    public static final java.lang.String a = "https://h.boxkj.com/";

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/donationNotice/closeDonationNotice")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a(@retrofit2.http.Field("noticeId") java.lang.String r1, @retrofit2.http.Field("regionUserId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/donationNotice/deleteDonationNotice")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b(@retrofit2.http.Field("noticeId") java.lang.String r1, @retrofit2.http.Field("regionUserId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/donationNotice/myDonationNoticeList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c(@retrofit2.http.Field("regionUserId") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/donationNotice/usefulDonationNoticeList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d(@retrofit2.http.Field("pageIndex") int r1, @retrofit2.http.Field("pageSize") int r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/donationNotice/addDonationNotice")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e(@androidx.annotation.NonNull @retrofit2.http.Field("regionUserId") java.lang.String r1, @androidx.annotation.NonNull @retrofit2.http.Field("goodsTypeId") java.lang.String r2, @androidx.annotation.NonNull @retrofit2.http.Field("buyOrSell") int r3, @androidx.annotation.NonNull @retrofit2.http.Field("description") java.lang.String r4, @androidx.annotation.Nullable @retrofit2.http.Field("img") java.lang.String r5, @androidx.annotation.Nullable @retrofit2.http.Field("phone") java.lang.String r6, @androidx.annotation.Nullable @retrofit2.http.Field("qq") java.lang.String r7, @androidx.annotation.Nullable @retrofit2.http.Field("wechat") java.lang.String r8, @androidx.annotation.Nullable @retrofit2.http.Field("price") java.lang.String r9);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/userJM/userHasGranted")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> f(@retrofit2.http.Field("regionUserId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/userJM/grantUser")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> g(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("userName") java.lang.String r3, @retrofit2.http.Field("sex") java.lang.String r4, @retrofit2.http.Field("userNum") java.lang.String r5, @retrofit2.http.Field("phone") java.lang.String r6);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/donationNotice/getDonationNoticeDetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> h(@retrofit2.http.Field("noticeId") java.lang.String r1, @retrofit2.http.Field("regionUserId") java.lang.String r2);
}
