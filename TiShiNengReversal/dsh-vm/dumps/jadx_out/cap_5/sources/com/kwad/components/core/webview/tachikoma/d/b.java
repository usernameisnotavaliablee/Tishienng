package com.kwad.components.core.webview.tachikoma.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b extends com.kwad.sdk.mvp.a {
    public java.lang.String AI;
    public long AO;
    public com.kwad.components.core.webview.tachikoma.f.c Yd;
    public com.kwad.components.offline.api.tk.model.StyleTemplate Yf;
    public com.kwad.components.core.webview.tachikoma.d.e afi;
    public com.kwad.sdk.widget.g ahq;
    public com.kwad.sdk.components.l ahr;
    public com.kwad.components.core.webview.tachikoma.k ahs;
    public boolean aht;
    public com.kwad.components.core.webview.tachikoma.d.e.a ahu;
    public android.app.Activity mActivity;
    public com.kwad.sdk.core.response.model.AdResultData mAdResultData;

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(com.kwad.sdk.core.response.model.AdResultData r1) {
            r0 = this;
            r0.mAdResultData = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = com.kwad.sdk.core.response.b.c.r(r1)
            r0.mAdTemplate = r1
            return
    }

    @Override // com.kwad.sdk.mvp.a
    public void release() {
            r1 = this;
            r0 = 0
            r1.afi = r0
            r1.mActivity = r0
            r1.ahq = r0
            return
    }
}
