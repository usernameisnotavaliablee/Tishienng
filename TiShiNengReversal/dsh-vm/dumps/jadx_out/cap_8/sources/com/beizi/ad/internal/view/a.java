package com.beizi.ad.internal.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends android.webkit.WebChromeClient {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(android.webkit.ConsoleMessage r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(android.webkit.WebView r1, java.lang.String r2, java.lang.String r3, android.webkit.JsResult r4) {
            r0 = this;
            r4.confirm()
            r1 = 1
            return r1
    }
}
