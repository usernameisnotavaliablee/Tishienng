package com.acse.ottn.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CustomWebView extends android.webkit.WebView {
    public CustomWebView(android.content.Context r1) {
            r0 = this;
            android.content.Context r1 = a(r1)
            r0.<init>(r1)
            return
    }

    public CustomWebView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            android.content.Context r1 = a(r1)
            r0.<init>(r1, r2)
            return
    }

    public CustomWebView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = a(r1)
            r0.<init>(r1, r2, r3)
            return
    }

    public static android.content.Context a(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto Lf
            android.content.res.Configuration r0 = new android.content.res.Configuration
            r0.<init>()
            android.content.Context r2 = r2.createConfigurationContext(r0)
        Lf:
            return r2
    }
}
