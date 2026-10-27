package com.kwad.components.core.webview.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.ksad.json.annotation.KsJson
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
    public java.lang.String NN;
    public java.lang.String abZ;
    public java.lang.String aca;
    public int acb;

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.kwad.sdk.core.response.model.AdInfo.SmallAppJumpInfo aR(java.lang.String r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo$SmallAppJumpInfo r0 = new com.kwad.sdk.core.response.model.AdInfo$SmallAppJumpInfo
            r0.<init>()
            r0.mediaSmallAppId = r2
            java.lang.String r2 = r1.abZ
            r0.originId = r2
            java.lang.String r2 = r1.aca
            r0.smallAppJumpUrl = r2
            return r0
    }
}
