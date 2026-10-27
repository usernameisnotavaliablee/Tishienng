package com.kwad.components.ad.reward.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private java.lang.String liveStartTime;

    @androidx.annotation.Nullable
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private java.lang.String originPrice;
    private int playableStyle;
    private java.lang.String price;
    private java.lang.String sW;
    private java.lang.String sX;
    private java.lang.String title;
    private java.util.List<java.lang.String> uQ;
    private java.lang.String uR;
    private java.lang.String uS;
    private java.lang.String uT;
    private boolean uU;
    private java.lang.String uV;
    private java.lang.String uW;
    private java.lang.String uX;
    private java.util.List<java.lang.String> uY;

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.response.model.AdTemplate uZ;

    public a() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "查看详情"
            r1.uW = r0
            java.lang.String r0 = "立即预约"
            r1.uX = r0
            return
    }

    @androidx.annotation.Nullable
    public static com.kwad.components.ad.reward.model.a R(com.kwad.sdk.core.response.model.AdTemplate r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
            com.kwad.sdk.core.response.model.AdProductInfo r0 = com.kwad.sdk.core.response.b.a.cV(r3)
            com.kwad.components.ad.reward.model.a r1 = new com.kwad.components.ad.reward.model.a
            r1.<init>()
            java.lang.String r2 = r0.getName()
            r1.title = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L23
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.ax(r3)
            r1.title = r2
        L23:
            java.lang.String r2 = r0.getIcon()
            r1.sW = r2
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.au(r3)
            r1.sX = r3
            java.lang.String r3 = r0.getPrice()
            r1.price = r3
            java.lang.String r3 = r0.getOriginPrice()
            r1.originPrice = r3
            boolean r3 = r0.isCouponListEmpty()
            if (r3 != 0) goto L55
            com.kwad.sdk.core.response.model.CouponInfo r3 = r0.getFirstCouponList()
            if (r3 == 0) goto L55
            java.lang.String r0 = com.kwad.sdk.core.response.model.CouponInfo.jinniuFormatCoupon(r3)
            r1.T(r0)
            java.lang.String r3 = r3.getFormattedJinniuPrefix()
            r1.S(r3)
        L55:
            return r1
    }

    @androidx.annotation.Nullable
    public static com.kwad.components.ad.reward.model.a S(com.kwad.sdk.core.response.model.AdTemplate r3) {
            com.kwad.sdk.core.response.model.AdMatrixInfo$MerchantLiveReservationInfo r0 = com.kwad.sdk.core.response.b.b.dt(r3)
            com.kwad.components.ad.reward.model.a r1 = new com.kwad.components.ad.reward.model.a
            r1.<init>()
            java.lang.String r2 = r0.userHeadUrl
            r1.sW = r2
            java.lang.String r2 = r0.liveStartTime
            r1.liveStartTime = r2
            java.lang.String r2 = r0.title
            r1.title = r2
            boolean r2 = r0.needShowSubscriberCount()
            r1.uU = r2
            java.lang.String r2 = r0.getFormattedLiveSubscribeCount()
            r1.uV = r2
            java.util.List<java.lang.String> r2 = r0.bookUserUrlList
            r1.uY = r2
            com.kwad.sdk.core.response.model.AdMatrixInfo$MerchantLiveReservationInfo$LiveReservationPlayEndInfo r0 = r0.playEndCard
            java.lang.String r2 = r0.detailBtnTitle
            r1.uW = r2
            java.lang.String r0 = r0.reservationBtnTitle
            r1.uX = r0
            r1.uZ = r3
            return r1
    }

    private void S(java.lang.String r1) {
            r0 = this;
            r0.uS = r1
            return
    }

    private void T(java.lang.String r1) {
            r0 = this;
            r0.uT = r1
            return
    }

    @androidx.annotation.Nullable
    public static com.kwad.components.ad.reward.model.a a(com.kwad.components.ad.reward.n.r r4, boolean r5) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.getAdTemplate()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r1)
            com.kwad.components.ad.reward.model.a r2 = new com.kwad.components.ad.reward.model.a
            r2.<init>()
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.cl(r0)
            r2.title = r3
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.co(r0)
            r2.sW = r3
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.au(r0)
            r2.sX = r3
            java.util.List r3 = com.kwad.sdk.core.response.b.d.ec(r1)
            r2.uQ = r3
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.aE(r0)
            r2.uR = r0
            int r5 = com.kwad.sdk.core.response.b.e.l(r1, r5)
            r2.playableStyle = r5
            r2.uZ = r1
            com.kwad.components.core.e.d.c r4 = r4.ij()
            r2.mApkDownloadHelper = r4
            return r2
    }

    public final java.lang.String getOriginPrice() {
            r1 = this;
            java.lang.String r0 = r1.originPrice
            return r0
    }

    public final java.lang.String getPrice() {
            r1 = this;
            java.lang.String r0 = r1.price
            return r0
    }

    public final java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public final java.lang.String ho() {
            r1 = this;
            java.lang.String r0 = r1.sW
            return r0
    }

    public final java.lang.String hp() {
            r1 = this;
            java.lang.String r0 = r1.sX
            return r0
    }

    public final java.lang.String ig() {
            r1 = this;
            java.lang.String r0 = r1.uT
            return r0
    }

    public final java.lang.String ih() {
            r1 = this;
            java.lang.String r0 = r1.uS
            return r0
    }

    @androidx.annotation.Nullable
    public final com.kwad.sdk.core.response.model.AdTemplate ii() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.uZ
            return r0
    }

    @androidx.annotation.Nullable
    public final com.kwad.components.core.e.d.c ij() {
            r1 = this;
            com.kwad.components.core.e.d.c r0 = r1.mApkDownloadHelper
            return r0
    }

    public final java.util.List<java.lang.String> ik() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.uQ
            return r0
    }

    public final boolean il() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.uQ
            if (r0 == 0) goto Ld
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public final int im() {
            r1 = this;
            int r0 = r1.playableStyle
            return r0
    }

    public final java.lang.String in() {
            r1 = this;
            java.lang.String r0 = r1.uV
            return r0
    }

    public final java.lang.String io() {
            r1 = this;
            java.lang.String r0 = r1.uX
            return r0
    }

    public final boolean ip() {
            r1 = this;
            boolean r0 = r1.uU
            return r0
    }

    public final java.util.List<java.lang.String> iq() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.uY
            return r0
    }

    public final java.lang.String ir() {
            r1 = this;
            java.lang.String r0 = r1.liveStartTime
            return r0
    }
}
