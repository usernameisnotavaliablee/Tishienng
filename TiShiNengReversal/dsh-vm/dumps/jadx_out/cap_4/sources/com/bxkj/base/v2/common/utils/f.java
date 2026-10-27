package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAndroidDevice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDevice.kt\ncom/bxkj/base/v2/common/utils/AndroidDevice\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class f {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.common.utils.f a = null;

    @org.jetbrains.annotations.NotNull
    private static java.lang.String b;

    static {
            com.bxkj.base.v2.common.utils.f r0 = new com.bxkj.base.v2.common.utils.f
            r0.<init>()
            com.bxkj.base.v2.common.utils.f.a = r0
            java.lang.String r0 = ""
            com.bxkj.base.v2.common.utils.f.b = r0
            return
    }

    private f() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.CharSequence a(byte r0) {
            java.lang.CharSequence r0 = h(r0)
            return r0
    }

    public static /* synthetic */ java.lang.CharSequence b(byte r0) {
            java.lang.CharSequence r0 = f(r0)
            return r0
    }

    private final java.lang.String c(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = com.bxkj.base.v2.common.utils.f.b
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L32
            r0 = 0
            com.baidu.liantian.ac.LH.init(r3, r0)     // Catch: java.lang.Exception -> L32
            java.lang.String r0 = "1"
            android.util.Pair r3 = com.baidu.liantian.ac.LH.getId(r3, r0)     // Catch: java.lang.Exception -> L32
            if (r3 == 0) goto L32
            java.lang.Object r3 = r3.second     // Catch: java.lang.Exception -> L32
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L32
            if (r3 == 0) goto L32
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "getDefault(...)"
            kotlin.jvm.internal.g0.o(r0, r1)     // Catch: java.lang.Exception -> L32
            java.lang.String r3 = r3.toUpperCase(r0)     // Catch: java.lang.Exception -> L32
            java.lang.String r0 = "toUpperCase(...)"
            kotlin.jvm.internal.g0.o(r3, r0)     // Catch: java.lang.Exception -> L32
            if (r3 == 0) goto L32
            com.bxkj.base.v2.common.utils.f.b = r3     // Catch: java.lang.Exception -> L32
        L32:
            java.lang.String r3 = com.bxkj.base.v2.common.utils.f.b
            return r3
    }

    private final java.lang.String e(java.lang.String r12) {
            r11 = this;
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L34
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = "forName(...)"
            kotlin.jvm.internal.g0.o(r1, r2)     // Catch: java.lang.Exception -> L34
            byte[] r12 = r12.getBytes(r1)     // Catch: java.lang.Exception -> L34
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r12, r1)     // Catch: java.lang.Exception -> L34
            byte[] r2 = r0.digest(r12)     // Catch: java.lang.Exception -> L34
            kotlin.jvm.internal.g0.m(r2)     // Catch: java.lang.Exception -> L34
            java.lang.String r3 = ""
            com.bxkj.base.v2.common.utils.d r8 = new com.bxkj.base.v2.common.utils.d     // Catch: java.lang.Exception -> L34
            r8.<init>()     // Catch: java.lang.Exception -> L34
            r9 = 30
            r10 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r12 = kotlin.collections.n.yh(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L34
            return r12
        L34:
            r0 = move-exception
            r12 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r12
            java.lang.String r12 = "MD5HashError：Error computing MD5 hash"
            com.orhanobut.logger.j.e(r12, r0)
            r12 = 0
            return r12
    }

    private static final java.lang.CharSequence f(byte r3) {
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "%02x"
            java.lang.String r3 = java.lang.String.format(r0, r3)
            java.lang.String r0 = "format(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            return r3
    }

    private final java.lang.String g(java.lang.String r12) {
            r11 = this;
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)     // Catch: java.lang.Exception -> L32
            kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.Exception -> L32
            byte[] r12 = r12.getBytes(r1)     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r12, r1)     // Catch: java.lang.Exception -> L32
            byte[] r2 = r0.digest(r12)     // Catch: java.lang.Exception -> L32
            kotlin.jvm.internal.g0.m(r2)     // Catch: java.lang.Exception -> L32
            java.lang.String r3 = ""
            com.bxkj.base.v2.common.utils.e r8 = new com.bxkj.base.v2.common.utils.e     // Catch: java.lang.Exception -> L32
            r8.<init>()     // Catch: java.lang.Exception -> L32
            r9 = 30
            r10 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r12 = kotlin.collections.n.yh(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L32
            return r12
        L32:
            r0 = move-exception
            r12 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r12
            java.lang.String r1 = "Error computing SHA-256 hash"
            com.orhanobut.logger.j.e(r1, r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r12)
            throw r0
    }

    private static final java.lang.CharSequence h(byte r3) {
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "%02x"
            java.lang.String r3 = java.lang.String.format(r0, r3)
            java.lang.String r0 = "format(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String d(@org.jetbrains.annotations.NotNull android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = ""
            java.lang.String r1 = com.bxkj.base.v2.common.utils.f.b
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L3a
            java.lang.String r0 = com.bxkj.base.v2.common.utils.a0.a(r3)     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = r2.c(r3)     // Catch: java.lang.Exception -> L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2f
            r1.<init>()     // Catch: java.lang.Exception -> L2f
            r1.append(r0)     // Catch: java.lang.Exception -> L2f
            r1.append(r3)     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = r2.e(r3)     // Catch: java.lang.Exception -> L2f
            if (r3 == 0) goto L3a
            com.bxkj.base.v2.common.utils.f.b = r3     // Catch: java.lang.Exception -> L2f
            goto L3a
        L2f:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()
            com.orhanobut.logger.j.c(r0)
            com.tencent.bugly.crashreport.CrashReport.postCatchedException(r3)
        L3a:
            java.lang.String r3 = com.bxkj.base.v2.common.utils.f.b
            return r3
    }
}
