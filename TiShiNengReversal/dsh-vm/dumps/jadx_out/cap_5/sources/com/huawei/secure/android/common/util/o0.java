package com.huawei.secure.android.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class o0 {
    private static android.os.Handler a;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.huawei.secure.android.common.util.o0.a = r0
            return
    }

    public o0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.lang.Runnable r1) {
            if (r1 != 0) goto L3
            return
        L3:
            android.os.Handler r0 = com.huawei.secure.android.common.util.o0.a
            r0.post(r1)
            return
    }
}
