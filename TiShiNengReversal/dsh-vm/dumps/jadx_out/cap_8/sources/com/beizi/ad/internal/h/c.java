package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L2d
            r0.<init>()     // Catch: java.lang.Exception -> L2d
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Exception -> L2d
            r2.<init>(r0)     // Catch: java.lang.Exception -> L2d
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Exception -> L2d
            r2.write(r3)     // Catch: java.lang.Exception -> L2d
            r2.close()     // Catch: java.lang.Exception -> L2d
            byte[] r3 = r0.toByteArray()     // Catch: java.lang.Exception -> L2d
            r0.flush()     // Catch: java.lang.Exception -> L2d
            r0.close()     // Catch: java.lang.Exception -> L2d
            r0 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)     // Catch: java.lang.Exception -> L2d
            return r3
        L2d:
            return r1
    }
}
