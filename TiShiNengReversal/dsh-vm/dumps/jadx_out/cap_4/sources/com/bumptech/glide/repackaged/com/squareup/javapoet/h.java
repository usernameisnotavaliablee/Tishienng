package com.bumptech.glide.repackaged.com.squareup.javapoet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class h {
    private final java.lang.Appendable a;
    private final java.lang.String b;
    private final int c;
    private boolean d;
    private final java.lang.StringBuilder e;
    private int f;
    private int g;

    h(java.lang.Appendable r3, java.lang.String r4, int r5) {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2.e = r0
            r0 = 0
            r2.f = r0
            r1 = -1
            r2.g = r1
            java.lang.String r1 = "out == null"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r3, r1, r0)
            r2.a = r3
            r2.b = r4
            r2.c = r5
            return
    }

    private void b(boolean r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2d
            java.lang.Appendable r4 = r3.a
            r1 = 10
            r4.append(r1)
            r4 = 0
        Lb:
            int r1 = r3.g
            if (r4 >= r1) goto L19
            java.lang.Appendable r1 = r3.a
            java.lang.String r2 = r3.b
            r1.append(r2)
            int r4 = r4 + 1
            goto Lb
        L19:
            java.lang.String r4 = r3.b
            int r4 = r4.length()
            int r1 = r1 * r4
            r3.f = r1
            java.lang.StringBuilder r4 = r3.e
            int r4 = r4.length()
            int r1 = r1 + r4
            r3.f = r1
            goto L34
        L2d:
            java.lang.Appendable r4 = r3.a
            r1 = 32
            r4.append(r1)
        L34:
            java.lang.Appendable r4 = r3.a
            java.lang.StringBuilder r1 = r3.e
            r4.append(r1)
            java.lang.StringBuilder r4 = r3.e
            int r1 = r4.length()
            r4.delete(r0, r1)
            r4 = -1
            r3.g = r4
            return
    }

    void a(java.lang.String r7) throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.d
            if (r0 != 0) goto L58
            int r0 = r6.g
            r1 = 1
            r2 = 10
            r3 = -1
            if (r0 == r3) goto L3c
            int r0 = r7.indexOf(r2)
            if (r0 != r3) goto L2c
            int r4 = r6.f
            int r5 = r7.length()
            int r4 = r4 + r5
            int r5 = r6.c
            if (r4 > r5) goto L2c
            java.lang.StringBuilder r0 = r6.e
            r0.append(r7)
            int r0 = r6.f
            int r7 = r7.length()
            int r0 = r0 + r7
            r6.f = r0
            return
        L2c:
            if (r0 == r3) goto L38
            int r4 = r6.f
            int r4 = r4 + r0
            int r0 = r6.c
            if (r4 <= r0) goto L36
            goto L38
        L36:
            r0 = 0
            goto L39
        L38:
            r0 = 1
        L39:
            r6.b(r0)
        L3c:
            java.lang.Appendable r0 = r6.a
            r0.append(r7)
            int r0 = r7.lastIndexOf(r2)
            if (r0 == r3) goto L4e
            int r7 = r7.length()
            int r7 = r7 - r0
            int r7 = r7 - r1
            goto L55
        L4e:
            int r0 = r6.f
            int r7 = r7.length()
            int r7 = r7 + r0
        L55:
            r6.f = r7
            return
        L58:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r7.<init>(r0)
            throw r7
    }

    void c(int r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.d
            if (r0 != 0) goto L16
            int r0 = r2.g
            r1 = -1
            if (r0 == r1) goto Ld
            r0 = 0
            r2.b(r0)
        Ld:
            int r0 = r2.f
            int r0 = r0 + 1
            r2.f = r0
            r2.g = r3
            return
        L16:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r3.<init>(r0)
            throw r3
    }
}
