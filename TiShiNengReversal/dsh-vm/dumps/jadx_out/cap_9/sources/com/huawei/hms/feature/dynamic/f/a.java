package com.huawei.hms.feature.dynamic.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class a {
    public static final java.lang.String a = "Base64";

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(byte[] r3) {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            r1 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r1)     // Catch: java.lang.AssertionError -> Ld
            if (r3 == 0) goto L15
            return r3
        Ld:
            r3 = move-exception
            java.lang.String r1 = "Base64"
            java.lang.String r2 = "An exception occurred while encoding with Base64,AssertionError:"
            com.huawei.hms.common.util.Logger.e(r1, r2, r3)
        L15:
            return r0
    }

    public static byte[] a(java.lang.String r3) {
            r0 = 0
            if (r3 != 0) goto L6
            byte[] r3 = new byte[r0]
            return r3
        L6:
            r1 = 2
            byte[] r3 = android.util.Base64.decode(r3, r1)     // Catch: java.lang.IllegalArgumentException -> Le
            if (r3 == 0) goto L16
            return r3
        Le:
            r3 = move-exception
            java.lang.String r1 = "Base64"
            java.lang.String r2 = "Decoding with Base64 IllegalArgumentException:"
            com.huawei.hms.common.util.Logger.e(r1, r2, r3)
        L16:
            byte[] r3 = new byte[r0]
            return r3
    }
}
