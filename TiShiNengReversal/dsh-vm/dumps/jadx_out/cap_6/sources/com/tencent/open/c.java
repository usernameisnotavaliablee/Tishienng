package com.tencent.open;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class c extends android.app.Dialog {
    protected com.tencent.open.b a;

    @android.annotation.SuppressLint({"NewApi"})
    protected final android.webkit.WebChromeClient b;


    public c(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.tencent.open.c$1 r1 = new com.tencent.open.c$1
            r1.<init>(r0)
            r0.b = r1
            return
    }

    protected abstract void a(java.lang.String r1);

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            com.tencent.open.b r1 = new com.tencent.open.b
            r1.<init>()
            r0.a = r1
            return
    }
}
