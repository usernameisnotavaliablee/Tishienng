package w;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface h {
    public static final java.lang.String a = "https://w.boxkj.com/";

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/AppDeliverSettleAccount/getDeliverWithdrawMoney")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/appDeliverTaskPublish/updateDeliverTaskPublishStatus")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("taskStatus") java.lang.String r3, @retrofit2.http.Field("taskId") java.lang.String r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/userPt/userHasGranted")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c(@retrofit2.http.Field("regionUserId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/appDeliverTaskOrder/addDeliverTaskOrder")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d(@retrofit2.http.Field("taskId") java.lang.String r1, @retrofit2.http.Field("schoolId") java.lang.String r2, @retrofit2.http.Field("userId") java.lang.String r3);

    @retrofit2.http.POST("https://w.boxkj.com/app/appDeliverItemType/getAllItemType")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/userPt/grantUser")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> f(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("userName") java.lang.String r3, @retrofit2.http.Field("sex") java.lang.String r4, @retrofit2.http.Field("userNum") java.lang.String r5, @retrofit2.http.Field("phone") java.lang.String r6);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/appDeliverTaskProcess/addDeliverTaskFinishProcess")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> g(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("orderId") java.lang.String r3, @retrofit2.http.Field("taskCode") java.lang.String r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/appDeliverUserBasicInfo/getDeliverUserBasicInfo")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> h(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/appDeliverTaskPublish/getDeliverTaskPublish")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> i(@retrofit2.http.Field("taskId") java.lang.String r1, @retrofit2.http.Field("orderId") java.lang.String r2, @retrofit2.http.Field("schoolId") java.lang.String r3, @retrofit2.http.Field("userId") java.lang.String r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/AppDeliverSettleAccount/getExpendDeliverMoney")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> j(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/appDeliverTaskPublish/appMyDeliverTaskPublishList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> k(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("taskStatus") java.lang.String r3, @retrofit2.http.Field("pageIndex") int r4, @retrofit2.http.Field("pageSize") int r5);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/appDeliverUserBasicInfo/addDeliverUserBasicInfo")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> l(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("telPhone") java.lang.String r3, @retrofit2.http.Field("birthday") java.lang.String r4, @retrofit2.http.Field("identificate") java.lang.String r5, @retrofit2.http.Field("userAddress") java.lang.String r6, @retrofit2.http.Field("cardFrontImg") java.lang.String r7, @retrofit2.http.Field("cardReverseImg") java.lang.String r8, @retrofit2.http.Field("cardHandImg") java.lang.String r9);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/appDeliverTaskOrder/appMyDeliverTaskOrderList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> m(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("orderStatus") java.lang.String r3, @retrofit2.http.Field("pageIndex") int r4, @retrofit2.http.Field("pageSize") int r5);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/AppDeliverSettleAccount/getIncomeDeliverMoney")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> n(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/weixinpayController/appPay")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> o(@retrofit2.http.Field("taskId") java.lang.String r1, @retrofit2.http.Field("schoolId") java.lang.String r2, @retrofit2.http.Field("userId") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/appDeliverTaskAppraise/addDeliverTaskAppraise")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> p(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("orderId") java.lang.String r3, @retrofit2.http.Field("appraiseStar") java.lang.String r4, @retrofit2.http.Field("appraiseContent") java.lang.String r5, @retrofit2.http.Field("images") java.lang.String r6, @retrofit2.http.Field("imgNames") java.lang.String r7);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/appDeliverTaskOrder/updateDeliverTaskOrderStatus")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> q(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("orderId") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/alipayController/appPay")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> r(@retrofit2.http.Field("taskId") java.lang.String r1, @retrofit2.http.Field("schoolId") java.lang.String r2, @retrofit2.http.Field("userId") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/appDeliverTaskPublish/addDeliverTaskPublish")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> s(@retrofit2.http.Field("taskName") java.lang.String r1, @retrofit2.http.Field("taskContent") java.lang.String r2, @retrofit2.http.Field("goodsTypeId") java.lang.String r3, @retrofit2.http.Field("schoolId") java.lang.String r4, @retrofit2.http.Field("userId") java.lang.String r5, @retrofit2.http.Field("publishUser") java.lang.String r6, @retrofit2.http.Field("publishTelPhone") java.lang.String r7, @retrofit2.http.Field("taskStartAddress") java.lang.String r8, @retrofit2.http.Field("startLat") java.lang.String r9, @retrofit2.http.Field("startLng") java.lang.String r10, @retrofit2.http.Field("taskStartTime") java.lang.String r11, @retrofit2.http.Field("receverUser") java.lang.String r12, @retrofit2.http.Field("receverTelPhone") java.lang.String r13, @retrofit2.http.Field("taskEndAddress") java.lang.String r14, @retrofit2.http.Field("endLat") java.lang.String r15, @retrofit2.http.Field("endLng") java.lang.String r16, @retrofit2.http.Field("taskEndTime") java.lang.String r17, @retrofit2.http.Field("taskPrice") java.lang.String r18);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/appDeliverTaskProcess/addDelivertaskTakeProcess")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> t(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("orderId") java.lang.String r3, @retrofit2.http.Field("images") java.lang.String r4, @retrofit2.http.Field("imgNames") java.lang.String r5);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/appDeliverTaskPublish/appDeliverTaskPublishList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> u(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://w.boxkj.com/app/AppDeliverWithdrawApply/addDeliverWithdrawApplyRecord")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> v(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("withDrawMoney") double r3);
}
