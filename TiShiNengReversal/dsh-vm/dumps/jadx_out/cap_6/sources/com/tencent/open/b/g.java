package com.tencent.open.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class g {
    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    static void a() {
            android.content.Context r0 = com.tencent.open.utils.g.a()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r1 = "sdk_report.db"
            r0.deleteDatabase(r1)
            return
    }

    public static void a(java.lang.String r0) {
            return
    }

    public static void a(java.lang.String r0, java.util.List<java.io.Serializable> r1) {
            return
    }

    public static java.util.List<java.io.Serializable> b(java.lang.String r0) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            return r0
    }
}
