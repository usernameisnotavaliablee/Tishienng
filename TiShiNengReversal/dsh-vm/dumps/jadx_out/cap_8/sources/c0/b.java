package c0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface b {
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/fieldPlan/fieldPlanAppointedList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("type") int r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/fieldPlan/stuAppointField")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("fieldPlanDateId") java.lang.String r2, @retrofit2.http.Field("detailId") java.lang.String r3, @retrofit2.http.Field("status") java.lang.String r4);

    @retrofit2.http.POST("app/syscampus/getCampusList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/userInfoUserByUserNum2App")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("userNum") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/fieldPlan/getFieldAppHelp")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> f(@retrofit2.http.Field("type") int r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/fieldPlan/getFieldplanList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> g(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("type") int r2, @retrofit2.http.Field("pid") java.lang.String r3, @retrofit2.http.Field("applyDate") java.lang.String r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/fieldPlan/stuAppointField")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> h(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("fieldPlanDateId") java.lang.String r2, @retrofit2.http.Field("companions") java.lang.String r3, @retrofit2.http.Field("note") java.lang.String r4, @retrofit2.http.Field("appointType") int r5, @retrofit2.http.Field("status") java.lang.String r6);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/field/getFieldByCampus")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> i(@retrofit2.http.Field("campusId") java.lang.String r1);
}
