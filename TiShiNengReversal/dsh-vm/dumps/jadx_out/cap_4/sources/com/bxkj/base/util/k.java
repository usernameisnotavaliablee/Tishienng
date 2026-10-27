package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class k {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.util.k a = null;

    static {
            com.bxkj.base.util.k r0 = new com.bxkj.base.util.k
            r0.<init>()
            com.bxkj.base.util.k.a = r0
            return
    }

    private k() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.String c(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "get"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L30
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L30
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "getDeclaredMethod(...)"
            kotlin.jvm.internal.g0.o(r1, r3)     // Catch: java.lang.Throwable -> L30
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L30
            r2[r5] = r7     // Catch: java.lang.Throwable -> L30
            java.lang.Object r7 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.g0.n(r7, r0)     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L30
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L2f
            goto L30
        L2f:
            return r7
        L30:
            return r8
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = android.os.Build.DISPLAY
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String b() {
            r2 = this;
            java.lang.String r0 = "hw_sc.build.platform.version"
            java.lang.String r1 = ""
            java.lang.String r0 = r2.c(r0, r1)
            return r0
    }

    public final boolean d() {
            r3 = this;
            java.lang.String r0 = "com.huawei.system.BuildEx"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "getOsBrand"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "Harmony"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1d
            r2 = 1
            boolean r0 = kotlin.text.u.a2(r1, r0, r2)     // Catch: java.lang.Throwable -> L1d
            return r0
        L1d:
            r0 = 0
            return r0
    }
}
