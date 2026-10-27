package com.bxkj.base.v2.common.ext;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class e {
    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a(@org.jetbrains.annotations.NotNull java.lang.Exception r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r2.getClass()
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    public static final boolean b(@org.jetbrains.annotations.NotNull java.lang.Exception r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r4 instanceof retrofit2.HttpException
            r1 = 1
            if (r0 == 0) goto L25
            r0 = r4
            retrofit2.HttpException r0 = (retrofit2.HttpException) r0
            int r2 = r0.code()
            r3 = 502(0x1f6, float:7.03E-43)
            if (r2 == r3) goto L37
            int r2 = r0.code()
            r3 = 503(0x1f7, float:7.05E-43)
            if (r2 == r3) goto L37
            int r0 = r0.code()
            r2 = 504(0x1f8, float:7.06E-43)
            if (r0 == r2) goto L37
        L25:
            boolean r0 = r4 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L38
            java.lang.String r4 = r4.getMessage()
            if (r4 == 0) goto L38
            java.lang.String r0 = "3秒未请求到接口主动取消"
            boolean r4 = r4.equals(r0)
            if (r4 != r1) goto L38
        L37:
            return r1
        L38:
            r4 = 0
            return r4
    }

    public static final void c(@org.jetbrains.annotations.NotNull java.lang.Exception r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = a(r1)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.orhanobut.logger.j.e(r1, r0)
            return
    }
}
