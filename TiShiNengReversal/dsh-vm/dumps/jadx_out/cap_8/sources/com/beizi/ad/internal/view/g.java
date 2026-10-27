package com.beizi.ad.internal.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class g extends com.beizi.ad.internal.view.AdWebView {

    /* renamed from: d, reason: collision with root package name */
    com.beizi.ad.internal.view.f f7226d;

    g(com.beizi.ad.internal.view.AdViewImpl r2, com.beizi.ad.internal.view.f r3) {
            r1 = this;
            r1.<init>(r2)
            java.lang.String[] r2 = com.beizi.ad.internal.view.f.a
            com.beizi.ad.internal.view.f$b r0 = com.beizi.ad.internal.view.f.b.f7224b
            int r0 = r0.ordinal()
            r2 = r2[r0]
            r1.f7136b = r2
            r1.f7226d = r3
            return
    }

    @Override // com.beizi.ad.internal.view.AdWebView
    void e() {
            r1 = this;
            super.e()
            com.beizi.ad.internal.view.f r0 = r1.f7226d
            r0.a()
            return
    }

    @Override // com.beizi.ad.internal.view.AdWebView, android.webkit.WebView, android.view.View
    protected void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)
            return
    }
}
