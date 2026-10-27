package com.beizi.ad.internal.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f extends com.beizi.ad.internal.d.b {
    private f(android.content.Context r9, com.beizi.ad.internal.f r10, com.beizi.ad.internal.d.a r11, com.beizi.ad.internal.c r12, com.beizi.ad.internal.f.c r13) {
            r8 = this;
            com.beizi.ad.internal.k r4 = com.beizi.ad.internal.k.f7003e
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Class<com.beizi.ad.internal.d.g> r1 = com.beizi.ad.internal.d.g.class
            boolean r1 = r8.a(r1)
            if (r1 != 0) goto L13
            goto L3f
        L13:
            r8.e()
            r8.g()
            r6 = -1
            r7 = 0
            if (r9 == 0) goto L3a
            com.beizi.ad.b.b r1 = r8.f6680b     // Catch: java.lang.Throwable -> L39
            com.beizi.ad.internal.d.g r1 = (com.beizi.ad.internal.d.g) r1     // Catch: java.lang.Throwable -> L39
            com.beizi.ad.internal.d.a r2 = r8.f6681c     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = r2.b()     // Catch: java.lang.Throwable -> L39
            com.beizi.ad.internal.d.a r2 = r8.f6681c     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = r2.e()     // Catch: java.lang.Throwable -> L39
            com.beizi.ad.b.a r5 = r8.a()     // Catch: java.lang.Throwable -> L39
            r2 = r9
            r0 = r1
            r1 = r8
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L39
            r7 = -1
            goto L3a
        L39:
        L3a:
            if (r7 == r6) goto L3f
            r8.a(r7)
        L3f:
            return
    }

    public static com.beizi.ad.internal.d.f a(android.content.Context r6, com.beizi.ad.internal.f r7, com.beizi.ad.internal.d.a r8, com.beizi.ad.internal.c r9, com.beizi.ad.internal.f.c r10) {
            com.beizi.ad.internal.d.f r0 = new com.beizi.ad.internal.d.f
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r6 = r0.f6685g
            if (r6 == 0) goto L10
            r6 = 0
            return r6
        L10:
            return r0
    }

    @Override // com.beizi.ad.internal.d.b
    public void c() {
            r1 = this;
            com.beizi.ad.b.b r0 = r1.f6680b
            if (r0 == 0) goto L11
            boolean r0 = r1.d()
            if (r0 != 0) goto L11
            com.beizi.ad.b.b r0 = r1.f6680b
            com.beizi.ad.internal.d.g r0 = (com.beizi.ad.internal.d.g) r0
            r0.a()
        L11:
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
