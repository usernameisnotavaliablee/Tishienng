package com.huawei.secure.android.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SafeString {
    private static final java.lang.String a = "SafeString";
    private static final java.lang.String b = "";

    static {
            return
    }

    public SafeString() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String replace(java.lang.String r0, java.lang.CharSequence r1, java.lang.CharSequence r2) {
            if (r0 == 0) goto L10
            if (r1 == 0) goto L10
            if (r2 != 0) goto L7
            goto L10
        L7:
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Exception -> Lc
            return r0
        Lc:
            r1 = move-exception
            r1.getMessage()
        L10:
            return r0
    }

    public static java.lang.String substring(java.lang.String r2, int r3) {
            java.lang.String r0 = ""
            if (r2 == 0) goto L16
            int r1 = r2.length()
            if (r1 < r3) goto L16
            if (r3 >= 0) goto Ld
            goto L16
        Ld:
            java.lang.String r2 = r2.substring(r3)     // Catch: java.lang.Exception -> L12
            return r2
        L12:
            r2 = move-exception
            r2.getMessage()
        L16:
            return r0
    }

    public static java.lang.String substring(java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = ""
            if (r2 == 0) goto L18
            if (r3 < 0) goto L18
            int r1 = r2.length()
            if (r4 > r1) goto L18
            if (r4 >= r3) goto Lf
            goto L18
        Lf:
            java.lang.String r2 = r2.substring(r3, r4)     // Catch: java.lang.Exception -> L14
            return r2
        L14:
            r2 = move-exception
            r2.getMessage()
        L18:
            return r0
    }
}
