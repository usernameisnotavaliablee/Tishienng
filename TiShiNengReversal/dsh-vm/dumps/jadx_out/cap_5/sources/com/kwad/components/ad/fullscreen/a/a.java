package com.kwad.components.ad.fullscreen.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    public static com.kwad.sdk.core.config.item.k jA;
    public static com.kwad.sdk.core.config.item.k jy;
    public static com.kwad.sdk.core.config.item.k jz;

    static {
            com.kwad.sdk.core.config.item.k r0 = new com.kwad.sdk.core.config.item.k
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "fullscreenSkipType"
            r0.<init>(r2, r1)
            com.kwad.components.ad.fullscreen.a.a.jy = r0
            com.kwad.sdk.core.config.item.k r0 = new com.kwad.sdk.core.config.item.k
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "fullscreenSkipShowTime"
            r0.<init>(r3, r2)
            com.kwad.components.ad.fullscreen.a.a.jz = r0
            com.kwad.sdk.core.config.item.k r0 = new com.kwad.sdk.core.config.item.k
            java.lang.String r2 = "fullScreenShakeMaxCount"
            r0.<init>(r2, r1)
            com.kwad.components.ad.fullscreen.a.a.jA = r0
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
