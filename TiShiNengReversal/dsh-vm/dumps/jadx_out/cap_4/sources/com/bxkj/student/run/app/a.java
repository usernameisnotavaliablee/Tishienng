package com.bxkj.student.run.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface a {
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/sportRecordSetting/setting")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a(@retrofit2.http.Field("uid") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/runingFeedback/add")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b(@retrofit2.http.Field("sportRecordId") java.lang.String r1, @retrofit2.http.Field("content") java.lang.String r2, @retrofit2.http.Field("base64Images") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appRunningLeaderboard/findAppRunningLeaderboardByUserId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/sportRecordSetting/checkTimeOut")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d(@retrofit2.http.Field("identify") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appSportRecord/getSportSpecification")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e(@retrofit2.http.Field("runType") int r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/sportRecordSetting/getRunningStartTime")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> f(@retrofit2.http.Field("identify") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appSportRecord/appSportRecordList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> g(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("sportType") int r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.POST("app/runingFace/appRuningFace")
    @retrofit2.http.Multipart
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> h(@retrofit2.http.Part okhttp3.MultipartBody.Part r1, @retrofit2.http.Part okhttp3.MultipartBody.Part r2, @retrofit2.http.Part okhttp3.MultipartBody.Part r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appAvoidRunningUser/findAvoidRunningUserListByUserId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> i(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appRuningStatistics/appPersonalStatistics")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> j(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/sportRecordSetting/getSetting")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> k(@retrofit2.http.Field("runType") int r1, @retrofit2.http.Field("uid") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appSportRecord/appAddSportRecord")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> l(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("runType") int r2, @retrofit2.http.Field("startTime") long r3, @retrofit2.http.Field("endTime") long r5, @retrofit2.http.Field("gitudeLatitude") java.lang.String r7, @retrofit2.http.Field("identify") java.lang.String r8, @retrofit2.http.Field("formatSportTime") java.lang.String r9, @retrofit2.http.Field("formatSportRange") java.lang.String r10, @retrofit2.http.Field("avgspeed") java.lang.String r11, @retrofit2.http.Field("speed") java.lang.String r12, @retrofit2.http.Field("okPointList") java.lang.String r13, @retrofit2.http.Field("brand") java.lang.String r14, @retrofit2.http.Field("model") java.lang.String r15, @retrofit2.http.Field("system") java.lang.String r16, @retrofit2.http.Field("version") java.lang.String r17, @retrofit2.http.Field("appVersion") java.lang.String r18, @retrofit2.http.Field("stepNumbers") java.lang.String r19, @retrofit2.http.Field("isFaceStatus") java.lang.String r20, @retrofit2.http.Field("points") java.lang.String r21, @retrofit2.http.Field("uploadType") java.lang.Integer r22, @retrofit2.http.Field("keepId") java.lang.String r23);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appSportRecord/getSportRecordId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> m(@retrofit2.http.Field("sportRecordId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appAvoidRunningUser/applyAvoidRunningUserApply")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> n(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("applyReason") java.lang.String r2, @retrofit2.http.Field("fileNames") java.lang.String r3, @retrofit2.http.Field("imgs") java.lang.String r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appAvoidRunningUser/findAppAvoidRunningUserById")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> o(@retrofit2.http.Field("avoidRunningUserId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appSportRecord/sumSportRecord")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> p(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.GET("https://keep.boxkj.com/keep/records")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> q(@retrofit2.http.Query("token") java.lang.String r1, @retrofit2.http.Query("date") java.lang.String r2);
}
