package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class g8 extends com.amap.api.col.p0003l.f8 {
    public g8() {
            r1 = this;
            r0 = 2048(0x800, float:2.87E-42)
            r1.<init>(r0)
            return
    }

    private int b(long r18, java.util.List<com.amap.api.col.p0003l.m9> r20) {
            r17 = this;
            r0 = r17
            g(r20)
            int r1 = r20.size()
            if (r1 <= 0) goto L53
            int[] r2 = new int[r1]
            r3 = 0
            r4 = 0
        Lf:
            if (r4 >= r1) goto L46
            r5 = r20
            java.lang.Object r6 = r5.get(r4)
            com.amap.api.col.3l.m9 r6 = (com.amap.api.col.p0003l.m9) r6
            com.amap.api.col.3l.h8 r7 = r0.a
            java.lang.String r8 = r6.f3685b
            int r14 = r7.b(r8)
            long r11 = r6.a
            int r7 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r7 != 0) goto L30
            r7 = -1
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 == 0) goto L30
            r7 = 1
            r10 = 1
            goto L31
        L30:
            r10 = 0
        L31:
            com.amap.api.col.3l.h8 r9 = r0.a
            int r7 = r6.f3686c
            short r13 = (short) r7
            short r15 = r6.f3690g
            int r6 = r6.f3687d
            short r6 = (short) r6
            r16 = r6
            int r6 = com.amap.api.col.p0003l.d9.b(r9, r10, r11, r13, r14, r15, r16)
            r2[r4] = r6
            int r4 = r4 + 1
            goto Lf
        L46:
            com.amap.api.col.3l.h8 r1 = r0.a
            int r1 = com.amap.api.col.p0003l.c9.c(r1, r2)
            com.amap.api.col.3l.h8 r2 = r0.a
            int r1 = com.amap.api.col.p0003l.c9.b(r2, r1)
            return r1
        L53:
            r1 = -1
            return r1
    }

    private int c(com.amap.api.col.3l.j8.a r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            java.util.List<com.amap.api.col.3l.ko> r2 = r1.f3575f
            e(r2)
            java.util.List<com.amap.api.col.3l.ko> r2 = r1.f3575f
            int r2 = r2.size()
            int[] r3 = new int[r2]
            r5 = 0
        L12:
            r6 = 2
            if (r5 >= r2) goto L10b
            java.util.List<com.amap.api.col.3l.ko> r8 = r1.f3575f
            java.lang.Object r8 = r8.get(r5)
            com.amap.api.col.3l.ko r8 = (com.amap.api.col.p0003l.ko) r8
            boolean r9 = r8 instanceof com.amap.api.col.p0003l.kq
            if (r9 == 0) goto L62
            r6 = r8
            com.amap.api.col.3l.kq r6 = (com.amap.api.col.p0003l.kq) r6
            boolean r9 = r6.f3653i
            if (r9 != 0) goto L3b
            com.amap.api.col.3l.h8 r9 = r0.a
            int r11 = r6.f3656j
            int r12 = r6.f3657k
            int r13 = r6.f3647c
            int r6 = r6.l
            int r6 = com.amap.api.col.p0003l.x8.b(r9, r11, r12, r13, r6)
        L36:
            r14 = r6
            r4 = -1
            r13 = 1
            goto Lf1
        L3b:
            com.amap.api.col.3l.h8 r11 = r0.a
            int r12 = r6.b()
            int r13 = r6.c()
            int r14 = r6.f3656j
            int r15 = r6.f3657k
            int r9 = r6.f3647c
            int r4 = r6.m
            int r7 = r6.n
            int r10 = r6.f3648d
            int r6 = r6.l
            r17 = r4
            r20 = r6
            r18 = r7
            r16 = r9
            r19 = r10
            int r6 = com.amap.api.col.p0003l.x8.c(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L36
        L62:
            boolean r4 = r8 instanceof com.amap.api.col.p0003l.kr
            if (r4 == 0) goto L8c
            r4 = r8
            com.amap.api.col.3l.kr r4 = (com.amap.api.col.p0003l.kr) r4
            com.amap.api.col.3l.h8 r9 = r0.a
            int r10 = r4.b()
            int r11 = r4.c()
            int r12 = r4.f3658j
            int r13 = r4.f3659k
            int r14 = r4.l
            int r15 = r4.f3647c
            int r6 = r4.m
            int r4 = r4.f3648d
            r17 = r4
            r16 = r6
            int r6 = com.amap.api.col.p0003l.y8.b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4 = 3
            r14 = r6
            r4 = -1
            r13 = 3
            goto Lf1
        L8c:
            boolean r4 = r8 instanceof com.amap.api.col.p0003l.kp
            if (r4 == 0) goto Lc4
            r4 = r8
            com.amap.api.col.3l.kp r4 = (com.amap.api.col.p0003l.kp) r4
            boolean r7 = r4.f3653i
            if (r7 != 0) goto Lad
            com.amap.api.col.3l.h8 r9 = r0.a
            int r10 = r4.f3654j
            int r11 = r4.f3655k
            int r12 = r4.l
            int r13 = r4.m
            int r14 = r4.n
            int r15 = r4.f3647c
            int r4 = com.amap.api.col.p0003l.q8.b(r9, r10, r11, r12, r13, r14, r15)
        La9:
            r14 = r4
            r4 = -1
            r13 = 2
            goto Lf1
        Lad:
            com.amap.api.col.3l.h8 r9 = r0.a
            int r10 = r4.f3654j
            int r11 = r4.f3655k
            int r12 = r4.l
            int r13 = r4.m
            int r14 = r4.n
            int r15 = r4.f3647c
            int r4 = r4.f3648d
            r16 = r4
            int r4 = com.amap.api.col.p0003l.q8.c(r9, r10, r11, r12, r13, r14, r15, r16)
            goto La9
        Lc4:
            boolean r4 = r8 instanceof com.amap.api.col.p0003l.ks
            if (r4 == 0) goto Lee
            r4 = r8
            com.amap.api.col.3l.ks r4 = (com.amap.api.col.p0003l.ks) r4
            com.amap.api.col.3l.h8 r9 = r0.a
            int r10 = r4.b()
            int r11 = r4.c()
            int r12 = r4.f3660j
            int r13 = r4.f3661k
            int r14 = r4.l
            int r15 = r4.f3647c
            int r6 = r4.m
            int r4 = r4.f3648d
            r17 = r4
            r16 = r6
            int r6 = com.amap.api.col.p0003l.b9.b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4 = 4
            r14 = r6
            r4 = -1
            r13 = 4
            goto Lf1
        Lee:
            r4 = -1
            r13 = 0
            r14 = -1
        Lf1:
            if (r14 == r4) goto L108
            boolean r4 = r8.f3652h
            byte r10 = (byte) r4
            boolean r4 = r8.f3653i
            byte r11 = (byte) r4
            com.amap.api.col.3l.h8 r9 = r0.a
            int r4 = r8.f3651g
            short r12 = (short) r4
            int r4 = com.amap.api.col.p0003l.t8.b(r9, r10, r11, r12, r13, r14)
            r3[r5] = r4
            int r5 = r5 + 1
            goto L12
        L108:
            r21 = -1
            return r21
        L10b:
            com.amap.api.col.3l.h8 r2 = r0.a
            java.lang.String r4 = r1.f3571b
            int r2 = r2.b(r4)
            com.amap.api.col.3l.h8 r4 = r0.a
            int r3 = com.amap.api.col.p0003l.r8.c(r4, r3)
            java.util.List<com.amap.api.col.3l.ko> r4 = r1.f3576g
            int r4 = r4.size()
            int[] r5 = new int[r4]
            r7 = 0
        L122:
            if (r7 >= r4) goto L1a1
            java.util.List<com.amap.api.col.3l.ko> r8 = r1.f3576g
            java.lang.Object r8 = r8.get(r7)
            com.amap.api.col.3l.ko r8 = (com.amap.api.col.p0003l.ko) r8
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r11 = r8.f3649e
            long r9 = r9 - r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r11
            r11 = 32767(0x7fff, double:1.6189E-319)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 > 0) goto L142
            r13 = 0
            int r15 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r15 >= 0) goto L143
        L142:
            r9 = r11
        L143:
            boolean r11 = r8 instanceof com.amap.api.col.p0003l.kq
            if (r11 == 0) goto L157
            com.amap.api.col.3l.kq r8 = (com.amap.api.col.p0003l.kq) r8
            com.amap.api.col.3l.h8 r11 = r0.a
            int r12 = r8.f3656j
            int r8 = r8.f3657k
            int r10 = (int) r9
            short r9 = (short) r10
            int r8 = com.amap.api.col.p0003l.a9.a(r11, r12, r8, r9)
        L155:
            r9 = 1
            goto L195
        L157:
            boolean r11 = r8 instanceof com.amap.api.col.p0003l.kr
            if (r11 == 0) goto L16a
            com.amap.api.col.3l.kr r8 = (com.amap.api.col.p0003l.kr) r8
            com.amap.api.col.3l.h8 r11 = r0.a
            int r12 = r8.f3658j
            int r8 = r8.f3659k
            int r10 = (int) r9
            short r9 = (short) r10
            int r8 = com.amap.api.col.p0003l.a9.a(r11, r12, r8, r9)
            goto L155
        L16a:
            boolean r11 = r8 instanceof com.amap.api.col.p0003l.kp
            if (r11 == 0) goto L180
            com.amap.api.col.3l.kp r8 = (com.amap.api.col.p0003l.kp) r8
            com.amap.api.col.3l.h8 r11 = r0.a
            int r12 = r8.f3654j
            int r13 = r8.f3655k
            int r8 = r8.l
            int r10 = (int) r9
            short r9 = (short) r10
            int r8 = com.amap.api.col.p0003l.z8.a(r11, r12, r13, r8, r9)
            r9 = 2
            goto L195
        L180:
            boolean r11 = r8 instanceof com.amap.api.col.p0003l.ks
            if (r11 == 0) goto L193
            com.amap.api.col.3l.ks r8 = (com.amap.api.col.p0003l.ks) r8
            com.amap.api.col.3l.h8 r11 = r0.a
            int r12 = r8.f3660j
            int r8 = r8.f3661k
            int r10 = (int) r9
            short r9 = (short) r10
            int r8 = com.amap.api.col.p0003l.a9.a(r11, r12, r8, r9)
            goto L155
        L193:
            r8 = 0
            r9 = 0
        L195:
            com.amap.api.col.3l.h8 r10 = r0.a
            byte r9 = (byte) r9
            int r8 = com.amap.api.col.p0003l.s8.b(r10, r9, r8)
            r5[r7] = r8
            int r7 = r7 + 1
            goto L122
        L1a1:
            com.amap.api.col.3l.h8 r4 = r0.a
            int r4 = com.amap.api.col.p0003l.r8.f(r4, r5)
            com.amap.api.col.3l.h8 r5 = r0.a
            byte r1 = r1.a
            int r1 = com.amap.api.col.p0003l.r8.b(r5, r2, r1, r3, r4)
            return r1
    }

    private int d(com.amap.api.col.p0003l.l9 r13) {
            r12 = this;
            long r3 = r13.f3676k
            long r1 = r13.f3638c
            double r5 = r13.f3640e
            r7 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r5 = r5 * r7
            int r5 = (int) r5
            double r9 = r13.f3639d
            double r9 = r9 * r7
            int r6 = (int) r9
            double r7 = r13.f3641f
            int r7 = (int) r7
            float r0 = r13.f3644i
            int r8 = (int) r0
            float r0 = r13.f3642g
            int r9 = (int) r0
            float r0 = r13.f3643h
            int r0 = (int) r0
            short r10 = (short) r0
            byte r11 = r13.l
            com.amap.api.col.3l.h8 r0 = r12.a
            int r13 = com.amap.api.col.p0003l.w8.b(r0, r1, r3, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }

    private static void e(java.util.List<com.amap.api.col.p0003l.ko> r3) {
            if (r3 == 0) goto L71
            int r0 = r3.size()
            if (r0 != 0) goto L9
            goto L71
        L9:
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r3.next()
            com.amap.api.col.3l.ko r0 = (com.amap.api.col.p0003l.ko) r0
            boolean r1 = r0 instanceof com.amap.api.col.p0003l.kq
            if (r1 == 0) goto L2f
            r1 = r0
            com.amap.api.col.3l.kq r1 = (com.amap.api.col.p0003l.kq) r1
            int r2 = r1.f3656j
            int r1 = r1.f3657k
            long r1 = com.amap.api.col.p0003l.g9.a(r2, r1)
            short r1 = com.amap.api.col.p0003l.g9.b(r1)
            r0.f3651g = r1
            goto Ld
        L2f:
            boolean r1 = r0 instanceof com.amap.api.col.p0003l.kr
            if (r1 == 0) goto L45
            r1 = r0
            com.amap.api.col.3l.kr r1 = (com.amap.api.col.p0003l.kr) r1
            int r2 = r1.f3658j
            int r1 = r1.f3659k
            long r1 = com.amap.api.col.p0003l.g9.a(r2, r1)
            short r1 = com.amap.api.col.p0003l.g9.b(r1)
            r0.f3651g = r1
            goto Ld
        L45:
            boolean r1 = r0 instanceof com.amap.api.col.p0003l.ks
            if (r1 == 0) goto L5b
            r1 = r0
            com.amap.api.col.3l.ks r1 = (com.amap.api.col.p0003l.ks) r1
            int r2 = r1.f3660j
            int r1 = r1.f3661k
            long r1 = com.amap.api.col.p0003l.g9.a(r2, r1)
            short r1 = com.amap.api.col.p0003l.g9.b(r1)
            r0.f3651g = r1
            goto Ld
        L5b:
            boolean r1 = r0 instanceof com.amap.api.col.p0003l.kp
            if (r1 == 0) goto Ld
            r1 = r0
            com.amap.api.col.3l.kp r1 = (com.amap.api.col.p0003l.kp) r1
            int r2 = r1.f3655k
            int r1 = r1.l
            long r1 = com.amap.api.col.p0003l.g9.a(r2, r1)
            short r1 = com.amap.api.col.p0003l.g9.b(r1)
            r0.f3651g = r1
            goto Ld
        L71:
            return
    }

    private static void g(java.util.List<com.amap.api.col.p0003l.m9> r3) {
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r3.next()
            com.amap.api.col.3l.m9 r0 = (com.amap.api.col.p0003l.m9) r0
            long r1 = r0.a
            short r1 = com.amap.api.col.p0003l.g9.d(r1)
            r0.f3690g = r1
            goto L4
        L19:
            return
    }

    public final byte[] f(com.amap.api.col.p0003l.l9 r3, com.amap.api.col.3l.j8.a r4, long r5, java.util.List<com.amap.api.col.p0003l.m9> r7) {
            r2 = this;
            super.a()
            int r3 = r2.d(r3)     // Catch: java.lang.Throwable -> L19
            r0 = -1
            if (r4 == 0) goto L1b
            java.util.List<com.amap.api.col.3l.ko> r1 = r4.f3575f     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L19
            if (r1 <= 0) goto L1b
            int r4 = r2.c(r4)     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r3 = move-exception
            goto L52
        L1b:
            r4 = -1
        L1c:
            if (r7 == 0) goto L28
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L19
            if (r1 <= 0) goto L28
            int r0 = r2.b(r5, r7)     // Catch: java.lang.Throwable -> L19
        L28:
            com.amap.api.col.3l.h8 r5 = r2.a     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.p0003l.o8.a(r5)     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.3l.h8 r5 = r2.a     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.p0003l.o8.b(r5, r3)     // Catch: java.lang.Throwable -> L19
            if (r4 <= 0) goto L39
            com.amap.api.col.3l.h8 r3 = r2.a     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.p0003l.o8.e(r3, r4)     // Catch: java.lang.Throwable -> L19
        L39:
            if (r0 <= 0) goto L40
            com.amap.api.col.3l.h8 r3 = r2.a     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.p0003l.o8.d(r3, r0)     // Catch: java.lang.Throwable -> L19
        L40:
            com.amap.api.col.3l.h8 r3 = r2.a     // Catch: java.lang.Throwable -> L19
            int r3 = com.amap.api.col.p0003l.o8.c(r3)     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.3l.h8 r4 = r2.a     // Catch: java.lang.Throwable -> L19
            r4.w(r3)     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.3l.h8 r3 = r2.a     // Catch: java.lang.Throwable -> L19
            byte[] r3 = r3.z()     // Catch: java.lang.Throwable -> L19
            return r3
        L52:
            com.amap.api.col.p0003l.p9.a(r3)
            r3 = 0
            return r3
    }
}
