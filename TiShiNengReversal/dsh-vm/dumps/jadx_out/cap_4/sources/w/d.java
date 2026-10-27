package w;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface d {
    public static final java.lang.String a = "https://h.boxkj.com/";

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/appRecruitVitae/loadRecruitVitae")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/appApplyRecuitment/addApplyRecuit")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b(@retrofit2.http.Field("recruitId") java.lang.String r1, @retrofit2.http.Field("schoolId") java.lang.String r2, @retrofit2.http.Field("userId") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/userZp/grantUser")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("userName") java.lang.String r3, @retrofit2.http.Field("sex") java.lang.String r4, @retrofit2.http.Field("userNum") java.lang.String r5, @retrofit2.http.Field("phone") java.lang.String r6);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/appRecruitUserPublish/addRecruitUserpubInfo")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("workType") java.lang.String r3, @retrofit2.http.Field("function") java.lang.String r4, @retrofit2.http.Field("expectMoney") java.lang.String r5, @retrofit2.http.Field("place") java.lang.String r6, @retrofit2.http.Field("otherDemand") java.lang.String r7, @retrofit2.http.Field("funcIntroduce") java.lang.String r8);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/appRecruitVitae/addRecruitVitae")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("userName") java.lang.String r3, @retrofit2.http.Field("sex") java.lang.String r4, @retrofit2.http.Field("age") java.lang.String r5, @retrofit2.http.Field("nativePlace") java.lang.String r6, @retrofit2.http.Field("education") java.lang.String r7, @retrofit2.http.Field("probatePeriodMoney") java.lang.String r8, @retrofit2.http.Field("becomeMemberMoney") java.lang.String r9, @retrofit2.http.Field("welfare") java.lang.String r10, @retrofit2.http.Field("telphone") java.lang.String r11, @retrofit2.http.Field("marriage") java.lang.String r12, @retrofit2.http.Field("political") java.lang.String r13, @retrofit2.http.Field("workYear") java.lang.String r14, @retrofit2.http.Field("workPlace") java.lang.String r15, @retrofit2.http.Field("eduUndergo") java.lang.String r16, @retrofit2.http.Field("trainUndergo") java.lang.String r17, @retrofit2.http.Field("workUndergo") java.lang.String r18, @retrofit2.http.Field("introduceSelf") java.lang.String r19, @retrofit2.http.Field("weixin") java.lang.String r20, @retrofit2.http.Field("qq") java.lang.String r21, @retrofit2.http.Field("workTime") java.lang.String r22);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/appRecruitUserPublish/loadRecruitUserpubInfo")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> f(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/appRecruitmentCompany/appRecruitmentCompanyDetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> g(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/appRecruitUserPublish/recruitUserPublishList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> h(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3, @retrofit2.http.Field("type") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/appRecruitment/appRecruitmentList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> i(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3, @retrofit2.http.Field("type") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/userZp/userHasGranted")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> j(@retrofit2.http.Field("regionUserId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/appRecruitment/appRecruitmentDetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> k(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("id") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://h.boxkj.com/app/appRecruitVitae/updateRecruitVitae")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> l(@retrofit2.http.Field("id") java.lang.String r1, @retrofit2.http.Field("schoolId") java.lang.String r2, @retrofit2.http.Field("userId") java.lang.String r3, @retrofit2.http.Field("userName") java.lang.String r4, @retrofit2.http.Field("sex") java.lang.String r5, @retrofit2.http.Field("age") java.lang.String r6, @retrofit2.http.Field("nativePlace") java.lang.String r7, @retrofit2.http.Field("education") java.lang.String r8, @retrofit2.http.Field("probatePeriodMoney") java.lang.String r9, @retrofit2.http.Field("becomeMemberMoney") java.lang.String r10, @retrofit2.http.Field("welfare") java.lang.String r11, @retrofit2.http.Field("telphone") java.lang.String r12, @retrofit2.http.Field("marriage") java.lang.String r13, @retrofit2.http.Field("political") java.lang.String r14, @retrofit2.http.Field("workYear") java.lang.String r15, @retrofit2.http.Field("workPlace") java.lang.String r16, @retrofit2.http.Field("eduUndergo") java.lang.String r17, @retrofit2.http.Field("trainUndergo") java.lang.String r18, @retrofit2.http.Field("workUndergo") java.lang.String r19, @retrofit2.http.Field("introduceSelf") java.lang.String r20, @retrofit2.http.Field("weixin") java.lang.String r21, @retrofit2.http.Field("qq") java.lang.String r22, @retrofit2.http.Field("workTime") java.lang.String r23);
}
