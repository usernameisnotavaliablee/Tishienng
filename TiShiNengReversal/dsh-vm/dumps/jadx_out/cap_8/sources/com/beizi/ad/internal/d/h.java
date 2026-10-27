package com.beizi.ad.internal.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h extends com.beizi.ad.internal.d.b {
    private h(android.content.Context r12, com.beizi.ad.internal.f r13, com.beizi.ad.internal.d.a r14, com.beizi.ad.internal.c r15, android.view.ViewGroup r16, com.beizi.ad.internal.f.c r17) {
            r11 = this;
            com.beizi.ad.internal.k r4 = com.beizi.ad.internal.k.a
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Class<com.beizi.ad.internal.d.i> r1 = com.beizi.ad.internal.d.i.class
            boolean r1 = r11.a(r1)
            if (r1 != 0) goto L14
            goto L54
        L14:
            r11.e()
            r11.g()
            r9 = -1
            r10 = 0
            if (r12 == 0) goto L4f
            boolean r1 = r11.d()     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L4f
            com.beizi.ad.b.b r1 = r11.f6680b     // Catch: java.lang.Throwable -> L4e
            com.beizi.ad.internal.d.i r1 = (com.beizi.ad.internal.d.i) r1     // Catch: java.lang.Throwable -> L4e
            com.beizi.ad.internal.d.a r2 = r11.f6681c     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = r2.b()     // Catch: java.lang.Throwable -> L4e
            com.beizi.ad.internal.d.a r2 = r11.f6681c     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = r2.e()     // Catch: java.lang.Throwable -> L4e
            com.beizi.ad.internal.d.a r2 = r11.f6681c     // Catch: java.lang.Throwable -> L4e
            int r5 = r2.c()     // Catch: java.lang.Throwable -> L4e
            com.beizi.ad.internal.d.a r2 = r11.f6681c     // Catch: java.lang.Throwable -> L4e
            int r6 = r2.d()     // Catch: java.lang.Throwable -> L4e
            com.beizi.ad.b.a r7 = r11.a()     // Catch: java.lang.Throwable -> L4e
            r2 = r12
            r8 = r16
            r0 = r1
            r1 = r11
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4e
            r10 = -1
            goto L4f
        L4e:
        L4f:
            if (r10 == r9) goto L54
            r11.a(r10)
        L54:
            return
    }

    public static com.beizi.ad.internal.d.h a(android.content.Context r7, com.beizi.ad.internal.f r8, com.beizi.ad.internal.d.a r9, com.beizi.ad.internal.c r10, android.view.ViewGroup r11, com.beizi.ad.internal.f.c r12) {
            com.beizi.ad.internal.d.h r0 = new com.beizi.ad.internal.d.h
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            boolean r7 = r0.f6685g
            if (r7 == 0) goto L11
            r7 = 0
            return r7
        L11:
            return r0
    }

    @Override // com.beizi.ad.internal.d.b
    public void c() {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.internal.d.b
    public void i() {
            r1 = this;
            r0 = 1
            r1.f6687i = r0
            com.beizi.ad.b.b r0 = r1.f6680b
            if (r0 == 0) goto La
            r0.e()
        La:
            return
    }

    @Override // com.beizi.ad.internal.d.b
    public void j() {
            r1 = this;
            com.beizi.ad.b.b r0 = r1.f6680b
            if (r0 == 0) goto L7
            r0.c()
        L7:
            return
    }

    @Override // com.beizi.ad.internal.d.b
    public void k() {
            r1 = this;
            com.beizi.ad.b.b r0 = r1.f6680b
            if (r0 == 0) goto L7
            r0.d()
        L7:
            return
    }
}
