package com.beizi.fusion.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    private android.content.Context a;

    public f(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public java.lang.String a() {
            r5 = this;
            java.lang.String r0 = "content://cn.nubia.identity/identity"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L39
            android.content.Context r3 = r5.a     // Catch: java.lang.Exception -> L39
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Exception -> L39
            android.content.ContentProviderClient r0 = r3.acquireContentProviderClient(r0)     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = "getOAID"
            android.os.Bundle r3 = r0.call(r3, r1, r1)     // Catch: java.lang.Exception -> L39
            r4 = 24
            if (r2 < r4) goto L21
            androidx.core.provider.c.a(r0)     // Catch: java.lang.Exception -> L39
            goto L24
        L21:
            r0.release()     // Catch: java.lang.Exception -> L39
        L24:
            java.lang.String r0 = "code"
            r2 = -1
            int r0 = r3.getInt(r0, r2)     // Catch: java.lang.Exception -> L39
            if (r0 != 0) goto L34
            java.lang.String r0 = "id"
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Exception -> L39
            return r0
        L34:
            java.lang.String r0 = "message"
            r3.getString(r0)     // Catch: java.lang.Exception -> L39
        L39:
            return r1
    }
}
