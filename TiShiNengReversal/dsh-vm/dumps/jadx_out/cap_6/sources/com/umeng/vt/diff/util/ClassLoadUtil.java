package com.umeng.vt.diff.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ClassLoadUtil {
    public ClassLoadUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Class<?> findClass(java.lang.String r2) {
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L8
            return r0
        L8:
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Ld
            return r2
        Ld:
            return r0
    }
}
