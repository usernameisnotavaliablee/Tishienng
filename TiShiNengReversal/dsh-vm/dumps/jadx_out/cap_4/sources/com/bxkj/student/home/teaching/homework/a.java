package com.bxkj.student.home.teaching.homework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface a {
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/homeAppLearnQuestion/saveRadioHomeWorkLearnQuestion")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a(@retrofit2.http.Field("learnQuestionId") java.lang.String r1, @retrofit2.http.Field("answer") java.lang.String r2);

    @retrofit2.http.POST("app/homeAppLearnQuestion/saveRadioHomeWorkLearnQuestion")
    @retrofit2.http.Multipart
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b(@retrofit2.http.Part java.util.List<okhttp3.MultipartBody.Part> r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/homeAppLearnQuestion/getHomeWorkLearnQuestiondetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c(@retrofit2.http.Field("questionId") java.lang.String r1, @retrofit2.http.Field("isQualified") int r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/homeAppLearnQuestion/deleteLearnHomeWork")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d(@retrofit2.http.Field("questionId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/homeAppLearnQuestion/loadHomeWorkLearnQuestionList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e(@retrofit2.http.Field("teacherCurriculumId") java.lang.String r1, @retrofit2.http.Field("week") java.lang.Integer r2);
}
