package com.huawei.secure.android.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class i {
    private static final java.lang.String a = "SafeStringBuilder";
    private static final java.lang.String b = "";

    static {
            return
    }

    public i() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.StringBuilder r2, int r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = ""
            if (r0 != 0) goto L1a
            int r0 = r2.length()
            if (r0 < r3) goto L1a
            if (r3 >= 0) goto L11
            goto L1a
        L11:
            java.lang.String r2 = r2.substring(r3)     // Catch: java.lang.Exception -> L16
            return r2
        L16:
            r2 = move-exception
            r2.getMessage()
        L1a:
            return r1
    }

    public static java.lang.String b(java.lang.StringBuilder r2, int r3, int r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = ""
            if (r0 != 0) goto L1c
            if (r3 < 0) goto L1c
            int r0 = r2.length()
            if (r4 > r0) goto L1c
            if (r4 >= r3) goto L13
            goto L1c
        L13:
            java.lang.String r2 = r2.substring(r3, r4)     // Catch: java.lang.Exception -> L18
            return r2
        L18:
            r2 = move-exception
            r2.getMessage()
        L1c:
            return r1
    }
}
