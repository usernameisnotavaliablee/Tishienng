package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class a2 {
    private final com.huawei.hms.scankit.p.a0 a;
    private final com.huawei.hms.scankit.p.x0[] b;

    a2(com.huawei.hms.scankit.p.a0 r2) {
            r1 = this;
            r1.<init>()
            com.huawei.hms.scankit.p.a0 r0 = new com.huawei.hms.scankit.p.a0
            r0.<init>(r2)
            r1.a = r0
            int r0 = r2.d()
            int r2 = r2.f()
            int r0 = r0 - r2
            int r0 = r0 + 1
            com.huawei.hms.scankit.p.x0[] r2 = new com.huawei.hms.scankit.p.x0[r0]
            r1.b = r2
            return
    }

    final com.huawei.hms.scankit.p.a0 a() {
            r1 = this;
            com.huawei.hms.scankit.p.a0 r0 = r1.a
            return r0
    }

    final com.huawei.hms.scankit.p.x0 a(int r2) {
            r1 = this;
            com.huawei.hms.scankit.p.x0[] r0 = r1.b
            int r2 = r1.c(r2)
            r2 = r0[r2]
            return r2
    }

    final void a(int r2, com.huawei.hms.scankit.p.x0 r3) {
            r1 = this;
            com.huawei.hms.scankit.p.x0[] r0 = r1.b
            int r2 = r1.c(r2)
            r0[r2] = r3
            return
    }

    final com.huawei.hms.scankit.p.x0 b(int r5) {
            r4 = this;
            com.huawei.hms.scankit.p.x0 r0 = r4.a(r5)
            if (r0 == 0) goto L7
            return r0
        L7:
            r0 = 1
        L8:
            r1 = 5
            if (r0 >= r1) goto L2b
            int r1 = r4.c(r5)
            int r1 = r1 - r0
            if (r1 < 0) goto L19
            com.huawei.hms.scankit.p.x0[] r2 = r4.b
            r1 = r2[r1]
            if (r1 == 0) goto L19
            return r1
        L19:
            int r1 = r4.c(r5)
            int r1 = r1 + r0
            com.huawei.hms.scankit.p.x0[] r2 = r4.b
            int r3 = r2.length
            if (r1 >= r3) goto L28
            r1 = r2[r1]
            if (r1 == 0) goto L28
            return r1
        L28:
            int r0 = r0 + 1
            goto L8
        L2b:
            r5 = 0
            return r5
    }

    final com.huawei.hms.scankit.p.x0[] b() {
            r1 = this;
            com.huawei.hms.scankit.p.x0[] r0 = r1.b
            return r0
    }

    final int c(int r2) {
            r1 = this;
            com.huawei.hms.scankit.p.a0 r0 = r1.a
            int r0 = r0.f()
            int r2 = r2 - r0
            return r2
    }

    public java.lang.String toString() {
            r12 = this;
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            com.huawei.hms.scankit.p.x0[] r1 = r12.b     // Catch: java.lang.Throwable -> L23
            int r2 = r1.length     // Catch: java.lang.Throwable -> L23
            r3 = 0
            r4 = 0
            r5 = 0
        Lb:
            if (r4 >= r2) goto L4e
            r6 = r1[r4]     // Catch: java.lang.Throwable -> L23
            r7 = 1
            if (r6 != 0) goto L25
            java.lang.String r6 = "%3d:    |   %n"
            int r8 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L23
            r7[r3] = r5     // Catch: java.lang.Throwable -> L23
            r0.format(r6, r7)     // Catch: java.lang.Throwable -> L23
            r5 = r8
            goto L4b
        L23:
            r1 = move-exception
            goto L56
        L25:
            java.lang.String r8 = "%3d: %3d|%3d%n"
            int r9 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L23
            int r10 = r6.c()     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L23
            int r6 = r6.e()     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L23
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L23
            r11[r3] = r5     // Catch: java.lang.Throwable -> L23
            r11[r7] = r10     // Catch: java.lang.Throwable -> L23
            r5 = 2
            r11[r5] = r6     // Catch: java.lang.Throwable -> L23
            r0.format(r8, r11)     // Catch: java.lang.Throwable -> L23
            r5 = r9
        L4b:
            int r4 = r4 + 1
            goto Lb
        L4e:
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r0.close()
            return r1
        L56:
            r0.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r0 = move-exception
            r1.addSuppressed(r0)
        L5e:
            throw r1
    }
}
