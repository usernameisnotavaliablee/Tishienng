package com.bxkj.equipment;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface i {
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appEquipment/teaEquDistributeRecords")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a(@retrofit2.http.Field("teacherCurriculumId") java.lang.String r1, @retrofit2.http.Field("teacherCurriculumWeek") int r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appEquipment/myEquDistributeRecords")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appEquipment/updateEdrRoomPerson")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("campusId") java.lang.String r2, @retrofit2.http.Field("eDetailId") java.lang.String r3, @retrofit2.http.Field("applyReason") java.lang.String r4, @retrofit2.http.Field("amount") java.lang.Integer r5, @retrofit2.http.Field("forReceiveTime") java.lang.String r6, @retrofit2.http.Field("forBackTime") java.lang.String r7, @retrofit2.http.Field("status") java.lang.String r8, @retrofit2.http.Field("recordId") java.lang.String r9);

    @retrofit2.http.POST("app/syscampus/getCampusList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appEquipment/getEquipmentList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e(@retrofit2.http.Field("campusId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appEquipment/addTeacherEquRoomDealRecord")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> f(@retrofit2.http.Field("teacherCurriculumId") java.lang.String r1, @retrofit2.http.Field("week") int r2, @retrofit2.http.Field("eDetailId") java.lang.String r3, @retrofit2.http.Field("applyReason") java.lang.String r4, @retrofit2.http.Field("amount") java.lang.Integer r5, @retrofit2.http.Field("forReceiveTime") java.lang.String r6, @retrofit2.http.Field("forBackTime") java.lang.String r7, @retrofit2.http.Field("status") java.lang.String r8, @retrofit2.http.Field("recordId") java.lang.String r9);
}
