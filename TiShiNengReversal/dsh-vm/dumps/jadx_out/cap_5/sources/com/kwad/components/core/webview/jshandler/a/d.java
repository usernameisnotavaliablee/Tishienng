package com.kwad.components.core.webview.jshandler.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d implements com.kwad.sdk.core.webview.c.a {
    private final java.lang.ref.WeakReference<android.content.Context> aeJ;

    public d(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.aeJ = r0
            return
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    private static boolean aD(android.content.Context r4) {
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L25
            r0.<init>()     // Catch: java.lang.Exception -> L25
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = "com.tencent.mm"
            java.lang.String r3 = "com.tencent.mm.ui.LauncherUI"
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L25
            r0.setComponent(r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "LauncherUI.From.Scaner.Shortcut"
            r2 = 1
            r0.putExtra(r1, r2)     // Catch: java.lang.Exception -> L25
            r1 = 335544320(0x14000000, float:6.4623485E-27)
            r0.setFlags(r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.setAction(r1)     // Catch: java.lang.Exception -> L25
            r4.startActivity(r0)     // Catch: java.lang.Exception -> L25
            return r2
        L25:
            r4 = 0
            return r4
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            java.lang.ref.WeakReference<android.content.Context> r2 = r1.aeJ
            java.lang.Object r2 = r2.get()
            android.content.Context r2 = (android.content.Context) r2
            if (r2 == 0) goto L25
            java.lang.ref.WeakReference<android.content.Context> r2 = r1.aeJ
            java.lang.Object r2 = r2.get()
            android.content.Context r2 = (android.content.Context) r2
            boolean r2 = aD(r2)
            if (r3 == 0) goto L25
            if (r2 == 0) goto L1f
            r2 = 0
            r3.a(r2)
            return
        L1f:
            r2 = -1
            java.lang.String r0 = "wechat launch error"
            r3.onError(r2, r0)
        L25:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "openWechatQRScan"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
