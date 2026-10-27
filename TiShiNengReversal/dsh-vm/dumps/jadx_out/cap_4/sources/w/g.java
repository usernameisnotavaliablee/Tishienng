package w;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface g {
    public static final java.lang.String a = "https://mall.boxkj.com/";

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/generatingOrder")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> A(@retrofit2.http.Field("ids") java.lang.String r1, @retrofit2.http.Field("addressId") java.lang.String r2, @retrofit2.http.Field("memo") java.lang.String r3, @retrofit2.http.Field("comm") java.lang.String r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/setDefaultAddress")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> B(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/clearUserfavorites")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> C(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/user/grantUser")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> D(@retrofit2.http.Field("schoolId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("userName") java.lang.String r3, @retrofit2.http.Field("sex") java.lang.String r4, @retrofit2.http.Field("userNum") java.lang.String r5, @retrofit2.http.Field("phone") java.lang.String r6);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/getUserShoppingCarList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> E(@retrofit2.http.Field("regionUserId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/loadSecondGoodsRelative")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a(@retrofit2.http.Field("firstTypeId") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/alipayController/appPay")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b(@retrofit2.http.Field("orderId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/addCommodityToShoppingCar")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c(@retrofit2.http.Field("regionUserId") java.lang.String r1, @retrofit2.http.Field("commId") java.lang.String r2, @retrofit2.http.Field("modelId") java.lang.String r3, @retrofit2.http.Field("commNum") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/loadCommodityDetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d(@retrofit2.http.Field("commId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/deleteOrder")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/loadOrderDetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> f(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/getSettlementCenter2")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> g(@retrofit2.http.Field("regionUserId") java.lang.String r1, @retrofit2.http.Field("commId") java.lang.String r2, @retrofit2.http.Field("modelId") java.lang.String r3, @retrofit2.http.Field("commNum") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/askForRefund")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> h(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/favoriteComm")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> i(@retrofit2.http.Field("commId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/loadCommodityList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> j(@retrofit2.http.Field("typeId") java.lang.String r1, @retrofit2.http.Field("keyword") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/getUserOrders")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> k(@retrofit2.http.Field("orderMode") java.lang.String r1, @retrofit2.http.Field("regionUserId") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/loadLoggicInfo")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> l(@retrofit2.http.Field("orderId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/weixinpayController/appPay")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> m(@retrofit2.http.Field("orderId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/getUserShoppingCarNum")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> n(@retrofit2.http.Field("regionUserId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/findUserfavorites")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> o(@retrofit2.http.Field("keyword") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/getSettlementCenter1")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> p(@retrofit2.http.Field("regionUserId") java.lang.String r1, @retrofit2.http.Field("ids") java.lang.String r2);

    @retrofit2.http.POST("https://mall.boxkj.com/app/show/loadFirstGoodsType")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> q();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/confirmReceipt")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> r(@retrofit2.http.Field("orderId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/getReceiveAddressList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> s(@retrofit2.http.Field("regionUserId") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/loadCityStandard")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> t(@retrofit2.http.Field("parentId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/deleteReceiveAddress")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> u(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/batchUpdateUserShoppingCar")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> v(@retrofit2.http.Field("data") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/deleteShoppingCar")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> w(@retrofit2.http.Field("ids") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/cancelOrder")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> x(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/show/addReceiveAddress")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> y(@retrofit2.http.Field("id") java.lang.String r1, @retrofit2.http.Field("regionUserId") java.lang.String r2, @retrofit2.http.Field("cityId") java.lang.String r3, @retrofit2.http.Field("detailAddress") java.lang.String r4, @retrofit2.http.Field("receiverName") java.lang.String r5, @retrofit2.http.Field("receiverPhone") java.lang.String r6);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("https://mall.boxkj.com/app/user/userHasGranted")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> z(@retrofit2.http.Field("regionUserId") java.lang.String r1);
}
