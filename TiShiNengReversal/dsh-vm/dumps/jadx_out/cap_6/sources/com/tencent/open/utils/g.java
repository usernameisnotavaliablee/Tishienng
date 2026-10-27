package com.tencent.open.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class g {
    private static android.content.Context a;

    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final android.content.Context a() {
            android.content.Context r0 = com.tencent.open.utils.g.a
            if (r0 != 0) goto L5
            r0 = 0
        L5:
            return r0
    }

    public static final java.io.File a(java.lang.String r1) {
            android.content.Context r0 = a()
            java.io.File r1 = com.tencent.open.utils.m.h(r0, r1)
            return r1
    }

    public static final void a(android.content.Context r0) {
            com.tencent.open.utils.g.a = r0
            return
    }

    public static final java.lang.String b() {
            android.content.Context r0 = a()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            android.content.Context r0 = a()
            java.lang.String r0 = r0.getPackageName()
            return r0
    }

    public static final java.io.File c() {
            android.content.Context r0 = a()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            android.content.Context r0 = a()
            java.io.File r0 = r0.getFilesDir()
            return r0
    }

    public static final java.io.File d() {
            android.content.Context r0 = a()
            if (r0 == 0) goto Lb
            java.io.File r0 = r0.getCacheDir()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static final java.io.File e() {
            r0 = 0
            java.io.File r0 = a(r0)
            return r0
    }
}
