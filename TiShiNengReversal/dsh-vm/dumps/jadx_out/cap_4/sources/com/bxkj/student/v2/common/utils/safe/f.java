package com.bxkj.student.v2.common.utils.safe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class f {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.safe.f a = null;

    static {
            com.bxkj.student.v2.common.utils.safe.f r0 = new com.bxkj.student.v2.common.utils.safe.f
            r0.<init>()
            com.bxkj.student.v2.common.utils.safe.f.a = r0
            return
    }

    private f() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean a() {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/data/local/tmp/frida-server"
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    private final boolean b() {
            r1 = this;
            java.lang.String r0 = "de.robv.android.xposed.XposedBridge"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final boolean c() {
            r1 = this;
            boolean r0 = r1.b()
            if (r0 != 0) goto Lf
            boolean r0 = r1.a()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }
}
