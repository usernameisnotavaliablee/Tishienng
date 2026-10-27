package com.bxkj.student.home.teaching.learning;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface m {
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnQuestion/saveRadioLearnQuestion")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a(@retrofit2.http.Field("learnQuestionId") java.lang.String r1, @retrofit2.http.Field("answer") java.lang.String r2);

    @retrofit2.http.POST("app/appLearnQuestion/saveRadioLearnQuestion")
    @retrofit2.http.Multipart
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b(@retrofit2.http.Part java.util.List<okhttp3.MultipartBody.Part> r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnQuestion/getLearnQuestiondetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c(@retrofit2.http.Field("questionId") java.lang.String r1, @retrofit2.http.Field("isQualified") int r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnResource/myLearnResourceDetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("resultType") java.lang.String r2, @retrofit2.http.Field("pageSize") java.lang.Integer r3, @retrofit2.http.Field("pageIndex") java.lang.Integer r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnResource/nextRresourceTypes")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e(@retrofit2.http.Field("pId") java.lang.String r1);

    @retrofit2.http.POST("app/appLearnResource/startLearnData")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> f();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnQuestion/deleteLearnWork")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> g(@retrofit2.http.Field("questionId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnResource/myLearnUserRecord")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> h(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnResource/learnResourceList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> i(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("oneTypeId") java.lang.String r2, @retrofit2.http.Field("twoTypeId") java.lang.String r3, @retrofit2.http.Field("pageSize") java.lang.Integer r4, @retrofit2.http.Field("pageIndex") java.lang.Integer r5);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnQuestion/getStuUnqualifiedLearnQuestionList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> j(@retrofit2.http.Field("pageSize") java.lang.Integer r1, @retrofit2.http.Field("pageIndex") java.lang.Integer r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnResource/getTheLearnResource")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> k(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("id") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnQuestion/loadLearnQuestionList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> l(@retrofit2.http.Field("type") int r1, @retrofit2.http.Field("resourceId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnResource/childTypesAndRresources")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> m(@retrofit2.http.Field("pId") java.lang.String r1);

    @retrofit2.http.POST("app/appLearnResource/firstRresourceTypes")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> n();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnResource/saveLearnQuestionPaper")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> o(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("radio") java.lang.String r2, @retrofit2.http.Field("check") java.lang.String r3);

    @retrofit2.http.POST("app/appLearnResource/listResourceType")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> p();

    @retrofit2.http.POST("app/appLearnResource/showResourceTypePage")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> q();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnResource/isCompetedLearnByTypeId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> r(@retrofit2.http.Field("typeId") java.lang.String r1);

    @retrofit2.http.POST("app/appLearnInstructions/loadLearnInstructions")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> s();

    @retrofit2.http.POST("app/appLearnResource/getReviewNotOkCount")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> t();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnResource/selectdTypeRresoure")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> u(@retrofit2.http.Field("typeId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnResource/learnResourceDetailOperation")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> v(@retrofit2.http.Field("detailId") java.lang.String r1, @retrofit2.http.Field("operateType") java.lang.String r2, @retrofit2.http.Field("status") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnResource/clickAnswerButton")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> w(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("detailId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appLearnResource/loadLearnQuestionPaper")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> x(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("learnResourceId") java.lang.String r2);
}
