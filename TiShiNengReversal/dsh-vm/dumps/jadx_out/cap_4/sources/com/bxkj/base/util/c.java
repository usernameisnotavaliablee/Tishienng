package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.graphics.Bitmap r4) {
            r0 = 0
            if (r4 == 0) goto L3d
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            r3 = 100
            r4.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            r1.flush()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            r1.close()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            byte[] r4 = r1.toByteArray()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            r2 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r4, r2)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            r4 = r0
            r0 = r1
            goto L3e
        L21:
            r4 = move-exception
            r0 = r1
            goto L2b
        L24:
            goto L34
        L26:
            r4 = move-exception
            goto L2b
        L28:
            r1 = r0
            goto L34
        L2b:
            if (r0 == 0) goto L33
            r0.flush()     // Catch: java.io.IOException -> L33
            r0.close()     // Catch: java.io.IOException -> L33
        L33:
            throw r4
        L34:
            if (r1 == 0) goto L47
            r1.flush()     // Catch: java.io.IOException -> L47
            r1.close()     // Catch: java.io.IOException -> L47
            goto L47
        L3d:
            r4 = r0
        L3e:
            if (r0 == 0) goto L46
            r0.flush()     // Catch: java.io.IOException -> L46
            r0.close()     // Catch: java.io.IOException -> L46
        L46:
            r0 = r4
        L47:
            return r0
    }
}
