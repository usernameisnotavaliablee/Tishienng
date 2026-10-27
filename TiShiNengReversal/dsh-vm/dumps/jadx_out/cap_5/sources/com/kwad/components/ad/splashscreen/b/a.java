package com.kwad.components.ad.splashscreen.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    public static com.kwad.sdk.core.config.item.k FM;
    public static com.kwad.sdk.core.config.item.r FN;
    public static com.kwad.sdk.core.config.item.r FO;
    public static com.kwad.sdk.core.config.item.d FP;
    public static com.kwad.sdk.core.config.item.d FQ;
    public static com.kwad.sdk.core.config.item.k FR;

    static {
            com.kwad.sdk.core.config.item.k r0 = new com.kwad.sdk.core.config.item.k
            r1 = 5000(0x1388, float:7.006E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "splashTimeOutMilliSecond"
            r0.<init>(r2, r1)
            com.kwad.components.ad.splashscreen.b.a.FM = r0
            com.kwad.sdk.core.config.item.r r0 = new com.kwad.sdk.core.config.item.r
            java.lang.String r1 = "splashTimerTips"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.kwad.components.ad.splashscreen.b.a.FN = r0
            com.kwad.sdk.core.config.item.r r0 = new com.kwad.sdk.core.config.item.r
            java.lang.String r1 = "splashBtnText"
            java.lang.String r2 = "点击跳转详情页或第三方应用"
            r0.<init>(r1, r2)
            com.kwad.components.ad.splashscreen.b.a.FO = r0
            com.kwad.sdk.core.config.item.d r0 = new com.kwad.sdk.core.config.item.d
            java.lang.String r1 = "splashCropNewSwitch"
            r2 = 1
            r0.<init>(r1, r2)
            com.kwad.components.ad.splashscreen.b.a.FP = r0
            com.kwad.sdk.core.config.item.d r0 = new com.kwad.sdk.core.config.item.d
            java.lang.String r1 = "splashAdLoadProcessChange"
            r2 = 0
            r0.<init>(r1, r2)
            com.kwad.components.ad.splashscreen.b.a.FQ = r0
            com.kwad.sdk.core.config.item.k r0 = new com.kwad.sdk.core.config.item.k
            r1 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "splashMaterialDownloadTimeMs"
            r0.<init>(r2, r1)
            com.kwad.components.ad.splashscreen.b.a.FR = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    @com.ksad.annotation.invoker.InvokeBy(invokerClass = com.kwad.sdk.core.config.e.class, methodId = "initConfigList")
    public static void init() {
            return
    }
}
