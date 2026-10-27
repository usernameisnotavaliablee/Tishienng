package com.bxkj.base.v2.netty4android.client.command;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {
    private byte a;
    private int b;

    @org.jetbrains.annotations.NotNull
    private java.lang.String c;

    public a(byte r2, int r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "datas"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    public static /* synthetic */ void e(com.bxkj.base.v2.netty4android.client.command.a r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "命令数据："
        L6:
            r0.d(r1)
            return
    }

    public final byte a() {
            r1 = this;
            byte r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public final int c() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public final void d(@org.jetbrains.annotations.Nullable java.lang.String r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.orhanobut.logger.j.g(r2, r0)
            return
    }

    public final void f(byte r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void g(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.c = r2
            return
    }

    public final void h(int r1) {
            r0 = this;
            r0.b = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r5 = this;
            a0.a r0 = a0.a.a
            byte r1 = r5.a
            r2 = 1
            byte[] r2 = new byte[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r0 = r0.b(r2)
            int r1 = r5.b
            java.lang.String r2 = r5.c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Command{cType="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ", length="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ", datas='"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "'}"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }
}
