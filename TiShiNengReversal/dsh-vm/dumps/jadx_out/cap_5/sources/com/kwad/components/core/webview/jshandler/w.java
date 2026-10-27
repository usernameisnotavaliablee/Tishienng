package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class w implements com.kwad.sdk.core.webview.c.a {
    private android.os.Vibrator gZ;

    public w() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            android.content.Context r2 = com.kwad.sdk.service.ServiceProvider.getContext()
            java.lang.String r0 = "vibrator"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.os.Vibrator r2 = (android.os.Vibrator) r2
            r1.gZ = r2
            android.content.Context r2 = com.kwad.sdk.service.ServiceProvider.getContext()
            android.os.Vibrator r0 = r1.gZ
            com.kwad.sdk.utils.bw.a(r2, r0)
            r2 = 0
            r3.a(r2)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "startVibrate"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
