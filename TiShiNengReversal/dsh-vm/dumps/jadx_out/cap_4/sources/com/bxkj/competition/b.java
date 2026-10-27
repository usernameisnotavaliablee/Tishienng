package com.bxkj.competition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface b {
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getAppCompeteItems")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b(@retrofit2.http.Field("competitionId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/competeUserSignUp")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d(@retrofit2.http.Field("itemId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getAppCompetitionDetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e(@retrofit2.http.Field("competitionId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/cancelSignUpItem")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> f(@retrofit2.http.Field("itemId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getAppCompetitionList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> g(@retrofit2.http.Field("competitionId") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getMyAppCompeteItems")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> h(@retrofit2.http.Field("competitionId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/competeItemSignin")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> i(@retrofit2.http.Field("itemId") java.lang.String r1, @retrofit2.http.Field("userNum") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getMyAppCompetitionList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> j(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getMaxGroupNumByScheduleId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> k(@retrofit2.http.Field("scheduleId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/loadRollCallData")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> l(@retrofit2.http.Field("scheduleId") java.lang.String r1, @retrofit2.http.Field("groupNum") int r2, @retrofit2.http.Field("progressMode") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/competeRollCallUpdate")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> m(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("rollCallJson") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/loadStuScoreData")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> n(@retrofit2.http.Field("scheduleId") java.lang.String r1, @retrofit2.http.Field("groupNum") int r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getItemListByGroupId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> o(@retrofit2.http.Field("groupId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getCompeteItemAllPlayers")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> p(@retrofit2.http.Field("competeItemId") java.lang.String r1, @retrofit2.http.Field("status") int r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/loadUserCompeteLetterData")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> q(@retrofit2.http.Field("competitionId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getUserEntryCard")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> r(@retrofit2.http.Field("competitionId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getAppCompeteAllItems")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> s(@retrofit2.http.Field("competitionId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getGroupListByCompetitionId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> t(@retrofit2.http.Field("competitionId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/competeAliPay/appPay")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> u(@retrofit2.http.Field("competitionId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("itemIds") java.lang.String r3, @retrofit2.http.Field("insuranceFee") double r4, @retrofit2.http.Field("competitionFee") double r6, @retrofit2.http.Field("totalPrice") double r8, @retrofit2.http.Field("payPrize") double r10);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/loadCompeteScheduleData")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> v(@retrofit2.http.Field("competitionId") java.lang.String r1, @retrofit2.http.Field("groupId") java.lang.Object r2, @retrofit2.http.Field("itemId") java.lang.Object r3, @retrofit2.http.Field("dateId") java.lang.Object r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/competeWXPay/appPay")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> w(@retrofit2.http.Field("competitionId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("itemIds") java.lang.String r3, @retrofit2.http.Field("insuranceFee") double r4, @retrofit2.http.Field("competitionFee") double r6, @retrofit2.http.Field("totalPrice") double r8, @retrofit2.http.Field("payPrize") double r10);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getDateListByCompetitionId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> x(@retrofit2.http.Field("competitionId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/publishCompeteLetter")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> y(@retrofit2.http.Field("competitionId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("content") java.lang.String r3);
}
