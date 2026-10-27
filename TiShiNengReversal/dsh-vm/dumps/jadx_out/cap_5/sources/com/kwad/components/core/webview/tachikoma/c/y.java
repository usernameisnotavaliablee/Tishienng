package com.kwad.components.core.webview.tachikoma.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.ksad.json.annotation.KsJson
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class y extends com.kwad.sdk.core.response.a.a {
    public java.lang.String ahn;
    public int errorCode;
    public java.lang.String errorReason;
    public int qz;

    public y() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean isFailed() {
            r2 = this;
            java.lang.String r0 = "failed"
            java.lang.String r1 = r2.ahn
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            return r0
    }

    public final boolean vA() {
            r2 = this;
            java.lang.String r0 = "end"
            java.lang.String r1 = r2.ahn
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            return r0
    }

    public final boolean vB() {
            r2 = this;
            java.lang.String r0 = "progress"
            java.lang.String r1 = r2.ahn
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            return r0
    }

    public final boolean vC() {
            r2 = this;
            java.lang.String r0 = "pause"
            java.lang.String r1 = r2.ahn
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            return r0
    }

    public final boolean vD() {
            r2 = this;
            java.lang.String r0 = "resume"
            java.lang.String r1 = r2.ahn
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            return r0
    }

    public final int vE() {
            r2 = this;
            java.lang.String r0 = r2.errorReason     // Catch: java.lang.NumberFormatException -> L8
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L8
            int r1 = (int) r0
            return r1
        L8:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r0)
            r0 = 0
            return r0
    }

    public final boolean vz() {
            r2 = this;
            java.lang.String r0 = "start"
            java.lang.String r1 = r2.ahn
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            return r0
    }
}
