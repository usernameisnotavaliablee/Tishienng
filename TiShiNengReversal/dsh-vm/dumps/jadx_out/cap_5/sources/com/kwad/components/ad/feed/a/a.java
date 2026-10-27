package com.kwad.components.ad.feed.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    public static com.kwad.sdk.core.config.item.d hq;
    public static com.kwad.sdk.core.config.item.k hr;

    static {
            com.kwad.sdk.core.config.item.d r0 = new com.kwad.sdk.core.config.item.d
            java.lang.String r1 = "feedAdClickGuideSwitch"
            r2 = 0
            r0.<init>(r1, r2)
            com.kwad.components.ad.feed.a.a.hq = r0
            com.kwad.sdk.core.config.item.k r0 = new com.kwad.sdk.core.config.item.k
            java.lang.String r1 = "feedNativeRenderSwitch"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r2)
            com.kwad.components.ad.feed.a.a.hr = r0
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
