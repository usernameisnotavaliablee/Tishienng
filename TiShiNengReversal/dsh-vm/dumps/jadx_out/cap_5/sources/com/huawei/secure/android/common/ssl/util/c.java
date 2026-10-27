package com.huawei.secure.android.common.ssl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private static android.content.Context a;

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Context a() {
            android.content.Context r0 = com.huawei.secure.android.common.ssl.util.c.a
            return r0
    }

    public static void b(android.content.Context r1) {
            if (r1 == 0) goto L10
            android.content.Context r0 = com.huawei.secure.android.common.ssl.util.c.a
            if (r0 != 0) goto L10
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.huawei.secure.android.common.ssl.util.c.a = r1
        L10:
            return
    }
}
