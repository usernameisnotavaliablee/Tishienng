package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class s2 implements com.huawei.hms.scankit.p.v2 {
    s2() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.CharSequence r8, int r9) {
            int r0 = r8.length()
            int r0 = r0 - r9
            if (r0 == 0) goto L57
            char r1 = r8.charAt(r9)
            r2 = 0
            r3 = 2
            if (r0 < r3) goto L16
            int r4 = r9 + 1
            char r4 = r8.charAt(r4)
            goto L17
        L16:
            r4 = 0
        L17:
            r5 = 3
            if (r0 < r5) goto L21
            int r6 = r9 + 2
            char r6 = r8.charAt(r6)
            goto L22
        L21:
            r6 = 0
        L22:
            r7 = 4
            if (r0 < r7) goto L2a
            int r9 = r9 + r5
            char r2 = r8.charAt(r9)
        L2a:
            int r8 = r1 << 18
            int r9 = r4 << 12
            int r8 = r8 + r9
            int r9 = r6 << 6
            int r8 = r8 + r9
            int r8 = r8 + r2
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            char r9 = (char) r9
            int r1 = r8 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r8 = r8 & 255(0xff, float:3.57E-43)
            char r8 = (char) r8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r9)
            if (r0 < r3) goto L4d
            r2.append(r1)
        L4d:
            if (r0 < r5) goto L52
            r2.append(r8)
        L52:
            java.lang.String r8 = r2.toString()
            return r8
        L57:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "StringBuilder must not be empty"
            r8.<init>(r9)
            throw r8
    }

    private static void a(char r2, java.lang.StringBuilder r3) {
            r0 = 32
            if (r2 < r0) goto Lc
            r0 = 63
            if (r2 > r0) goto Lc
            r3.append(r2)
            return
        Lc:
            r0 = 64
            if (r2 < r0) goto L1a
            r1 = 94
            if (r2 > r1) goto L1a
            int r2 = r2 - r0
            char r2 = (char) r2
            r3.append(r2)
            return
        L1a:
            com.huawei.hms.scankit.p.d4.a(r2)
            return
    }

    private static void a(com.huawei.hms.scankit.p.y2 r7, java.lang.CharSequence r8) {
            r0 = 0
            int r1 = r8.length()     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto Lb
            r7.b(r0)
            return
        Lb:
            r2 = 2
            r3 = 1
            if (r1 != r3) goto L45
            r7.l()     // Catch: java.lang.Throwable -> L3b
            com.huawei.hms.scankit.p.d7 r4 = r7.g()     // Catch: java.lang.Throwable -> L3b
            int r4 = r4.a()     // Catch: java.lang.Throwable -> L3b
            int r5 = r7.a()     // Catch: java.lang.Throwable -> L3b
            int r4 = r4 - r5
            int r5 = r7.f()     // Catch: java.lang.Throwable -> L3b
            if (r5 <= r4) goto L3d
            int r4 = r7.a()     // Catch: java.lang.Throwable -> L3b
            int r4 = r4 + r3
            r7.c(r4)     // Catch: java.lang.Throwable -> L3b
            com.huawei.hms.scankit.p.d7 r4 = r7.g()     // Catch: java.lang.Throwable -> L3b
            int r4 = r4.a()     // Catch: java.lang.Throwable -> L3b
            int r6 = r7.a()     // Catch: java.lang.Throwable -> L3b
            int r4 = r4 - r6
            goto L3d
        L3b:
            r8 = move-exception
            goto L98
        L3d:
            if (r5 > r4) goto L45
            if (r4 > r2) goto L45
            r7.b(r0)
            return
        L45:
            r4 = 4
            if (r1 > r4) goto L90
            int r1 = r1 - r3
            java.lang.String r8 = a(r8, r0)     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r7.i()     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto L56
            if (r1 > r2) goto L56
            goto L57
        L56:
            r3 = 0
        L57:
            if (r1 > r2) goto L7e
            int r2 = r7.a()     // Catch: java.lang.Throwable -> L3b
            int r2 = r2 + r1
            r7.c(r2)     // Catch: java.lang.Throwable -> L3b
            com.huawei.hms.scankit.p.d7 r2 = r7.g()     // Catch: java.lang.Throwable -> L3b
            int r2 = r2.a()     // Catch: java.lang.Throwable -> L3b
            int r4 = r7.a()     // Catch: java.lang.Throwable -> L3b
            int r2 = r2 - r4
            r4 = 3
            if (r2 < r4) goto L7e
            int r2 = r7.a()     // Catch: java.lang.Throwable -> L3b
            int r3 = r8.length()     // Catch: java.lang.Throwable -> L3b
            int r2 = r2 + r3
            r7.c(r2)     // Catch: java.lang.Throwable -> L3b
            r3 = 0
        L7e:
            if (r3 == 0) goto L89
            r7.k()     // Catch: java.lang.Throwable -> L3b
            int r8 = r7.f     // Catch: java.lang.Throwable -> L3b
            int r8 = r8 - r1
            r7.f = r8     // Catch: java.lang.Throwable -> L3b
            goto L8c
        L89:
            r7.a(r8)     // Catch: java.lang.Throwable -> L3b
        L8c:
            r7.b(r0)
            return
        L90:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = "Count must not exceed 4"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            throw r8     // Catch: java.lang.Throwable -> L3b
        L98:
            r7.b(r0)
            throw r8
    }

    public int a() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // com.huawei.hms.scankit.p.v2
    public void a(com.huawei.hms.scankit.p.y2 r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            boolean r1 = r6.i()
            if (r1 == 0) goto L41
            char r1 = r6.c()
            a(r1, r0)
            int r1 = r6.f
            int r1 = r1 + 1
            r6.f = r1
            int r1 = r0.length()
            r2 = 4
            if (r1 < r2) goto L5
            r1 = 0
            java.lang.String r3 = a(r0, r1)
            r6.a(r3)
            r0.delete(r1, r2)
            java.lang.String r2 = r6.d()
            int r3 = r6.f
            int r4 = r5.a()
            int r2 = com.huawei.hms.scankit.p.d4.a(r2, r3, r4)
            int r3 = r5.a()
            if (r2 == r3) goto L5
            r6.b(r1)
        L41:
            r1 = 31
            r0.append(r1)
            a(r6, r0)
            return
    }
}
