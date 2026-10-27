package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class i8 extends com.amap.api.col.p0003l.f8 {

    /* renamed from: c, reason: collision with root package name */
    private static com.amap.api.col.p0003l.i8 f3516c;

    static {
            com.amap.api.col.3l.i8 r0 = new com.amap.api.col.3l.i8
            r0.<init>()
            com.amap.api.col.p0003l.i8.f3516c = r0
            return
    }

    private i8() {
            r1 = this;
            r0 = 5120(0x1400, float:7.175E-42)
            r1.<init>(r0)
            return
    }

    private static java.lang.String b(java.lang.String r0) {
            if (r0 != 0) goto L4
            java.lang.String r0 = ""
        L4:
            return r0
    }

    public static com.amap.api.col.p0003l.i8 d() {
            com.amap.api.col.3l.i8 r0 = com.amap.api.col.p0003l.i8.f3516c
            return r0
    }

    public final byte[] c(byte[] r9, byte[] r10, java.util.List<? extends com.amap.api.col.p0003l.m8> r11) {
            r8 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r1 = r11.size()     // Catch: java.lang.Throwable -> L3b
            if (r1 <= 0) goto L5d
            if (r9 == 0) goto L5d
            r8.a()     // Catch: java.lang.Throwable -> L3b
            com.amap.api.col.3l.h8 r2 = r8.a     // Catch: java.lang.Throwable -> L3b
            int r9 = com.amap.api.col.p0003l.p8.c(r2, r9)     // Catch: java.lang.Throwable -> L3b
            int[] r2 = new int[r1]     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            r4 = 0
        L19:
            if (r4 >= r1) goto L3d
            java.lang.Object r5 = r11.get(r4)     // Catch: java.lang.Throwable -> L3b
            com.amap.api.col.3l.m8 r5 = (com.amap.api.col.p0003l.m8) r5     // Catch: java.lang.Throwable -> L3b
            com.amap.api.col.3l.h8 r6 = r8.a     // Catch: java.lang.Throwable -> L3b
            byte[] r7 = r5.b()     // Catch: java.lang.Throwable -> L3b
            int r6 = com.amap.api.col.p0003l.u8.c(r6, r7)     // Catch: java.lang.Throwable -> L3b
            com.amap.api.col.3l.h8 r7 = r8.a     // Catch: java.lang.Throwable -> L3b
            int r5 = r5.a()     // Catch: java.lang.Throwable -> L3b
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L3b
            int r5 = com.amap.api.col.p0003l.u8.b(r7, r5, r6)     // Catch: java.lang.Throwable -> L3b
            r2[r4] = r5     // Catch: java.lang.Throwable -> L3b
            int r4 = r4 + 1
            goto L19
        L3b:
            r9 = move-exception
            goto L5e
        L3d:
            com.amap.api.col.3l.h8 r11 = r8.a     // Catch: java.lang.Throwable -> L3b
            int r11 = com.amap.api.col.p0003l.p8.d(r11, r2)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L4b
            com.amap.api.col.3l.h8 r1 = r8.a     // Catch: java.lang.Throwable -> L3b
            int r3 = com.amap.api.col.p0003l.p8.f(r1, r10)     // Catch: java.lang.Throwable -> L3b
        L4b:
            com.amap.api.col.3l.h8 r10 = r8.a     // Catch: java.lang.Throwable -> L3b
            int r9 = com.amap.api.col.p0003l.p8.b(r10, r9, r3, r11)     // Catch: java.lang.Throwable -> L3b
            com.amap.api.col.3l.h8 r10 = r8.a     // Catch: java.lang.Throwable -> L3b
            r10.w(r9)     // Catch: java.lang.Throwable -> L3b
            com.amap.api.col.3l.h8 r9 = r8.a     // Catch: java.lang.Throwable -> L3b
            byte[] r9 = r9.z()     // Catch: java.lang.Throwable -> L3b
            return r9
        L5d:
            return r0
        L5e:
            com.amap.api.col.p0003l.p9.a(r9)
            return r0
    }

    public final byte[] e() {
            r18 = this;
            r1 = r18
            super.a()
            com.amap.api.col.3l.h8 r0 = r1.a     // Catch: java.lang.Exception -> L94
            java.lang.String r2 = com.amap.api.col.p0003l.n9.m()     // Catch: java.lang.Exception -> L94
            int r5 = r0.b(r2)     // Catch: java.lang.Exception -> L94
            com.amap.api.col.3l.h8 r0 = r1.a     // Catch: java.lang.Exception -> L94
            java.lang.String r2 = com.amap.api.col.p0003l.n9.g()     // Catch: java.lang.Exception -> L94
            int r6 = r0.b(r2)     // Catch: java.lang.Exception -> L94
            com.amap.api.col.3l.h8 r0 = r1.a     // Catch: java.lang.Exception -> L94
            java.lang.String r2 = com.amap.api.col.p0003l.n9.s()     // Catch: java.lang.Exception -> L94
            int r8 = r0.b(r2)     // Catch: java.lang.Exception -> L94
            com.amap.api.col.3l.h8 r0 = r1.a     // Catch: java.lang.Exception -> L94
            java.lang.String r2 = com.amap.api.col.p0003l.n9.q()     // Catch: java.lang.Exception -> L94
            int r9 = r0.b(r2)     // Catch: java.lang.Exception -> L94
            com.amap.api.col.3l.h8 r0 = r1.a     // Catch: java.lang.Exception -> L94
            java.lang.String r2 = com.amap.api.col.p0003l.n9.o()     // Catch: java.lang.Exception -> L94
            java.lang.String r2 = b(r2)     // Catch: java.lang.Exception -> L94
            int r10 = r0.b(r2)     // Catch: java.lang.Exception -> L94
            com.amap.api.col.3l.h8 r0 = r1.a     // Catch: java.lang.Exception -> L94
            java.lang.String r2 = com.amap.api.col.p0003l.n9.u()     // Catch: java.lang.Exception -> L94
            java.lang.String r2 = b(r2)     // Catch: java.lang.Exception -> L94
            int r11 = r0.b(r2)     // Catch: java.lang.Exception -> L94
            java.lang.String r0 = com.amap.api.col.p0003l.n9.C()     // Catch: java.lang.Exception -> L94
            long r12 = com.amap.api.col.p0003l.m9.a(r0)     // Catch: java.lang.Exception -> L94
            com.amap.api.col.3l.h8 r0 = r1.a     // Catch: java.lang.Exception -> L94
            java.lang.String r2 = com.amap.api.col.p0003l.n9.y()     // Catch: java.lang.Exception -> L94
            int r14 = r0.b(r2)     // Catch: java.lang.Exception -> L94
            com.amap.api.col.3l.h8 r0 = r1.a     // Catch: java.lang.Exception -> L94
            java.lang.String r2 = com.amap.api.col.p0003l.n9.w()     // Catch: java.lang.Exception -> L94
            int r15 = r0.b(r2)     // Catch: java.lang.Exception -> L94
            com.amap.api.col.3l.h8 r0 = r1.a     // Catch: java.lang.Exception -> L94
            java.lang.String r2 = com.amap.api.col.p0003l.n9.i()     // Catch: java.lang.Exception -> L94
            int r16 = r0.b(r2)     // Catch: java.lang.Exception -> L94
            com.amap.api.col.3l.h8 r0 = r1.a     // Catch: java.lang.Exception -> L94
            java.lang.String r2 = com.amap.api.col.p0003l.n9.k()     // Catch: java.lang.Exception -> L94
            int r17 = r0.b(r2)     // Catch: java.lang.Exception -> L94
            com.amap.api.col.3l.h8 r3 = r1.a     // Catch: java.lang.Exception -> L94
            byte r4 = com.amap.api.col.p0003l.n9.a()     // Catch: java.lang.Exception -> L94
            int r0 = com.amap.api.col.p0003l.n9.A()     // Catch: java.lang.Exception -> L94
            byte r7 = (byte) r0     // Catch: java.lang.Exception -> L94
            int r0 = com.amap.api.col.p0003l.o9.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L94
            com.amap.api.col.3l.h8 r2 = r1.a     // Catch: java.lang.Exception -> L94
            r2.w(r0)     // Catch: java.lang.Exception -> L94
            com.amap.api.col.3l.h8 r0 = r1.a     // Catch: java.lang.Exception -> L94
            byte[] r0 = r0.z()     // Catch: java.lang.Exception -> L94
            return r0
        L94:
            r0 = move-exception
            com.amap.api.col.p0003l.p9.a(r0)
            r0 = 0
            return r0
    }
}
