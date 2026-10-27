package com.beizi.ad.internal.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c extends com.beizi.ad.internal.d.b {
    private c(android.content.Context r11, com.beizi.ad.internal.f r12, com.beizi.ad.internal.d.a r13, com.beizi.ad.internal.c r14, com.beizi.ad.internal.f.c r15) {
            r10 = this;
            com.beizi.ad.internal.k r4 = com.beizi.ad.internal.k.f7002d
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Class<com.beizi.ad.internal.d.d> r1 = com.beizi.ad.internal.d.d.class
            boolean r1 = r10.a(r1)
            if (r1 != 0) goto L13
            goto L64
        L13:
            r10.e()
            r10.g()
            r8 = -1
            r9 = 0
            if (r11 == 0) goto L52
            boolean r1 = r10.d()     // Catch: java.lang.Throwable -> L51
            if (r1 != 0) goto L52
            com.beizi.ad.b.b r1 = r10.f6680b     // Catch: java.lang.Throwable -> L51
            com.beizi.ad.internal.d.d r1 = (com.beizi.ad.internal.d.d) r1     // Catch: java.lang.Throwable -> L51
            com.beizi.ad.internal.d.a r2 = r10.f6681c     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = r2.b()     // Catch: java.lang.Throwable -> L51
            com.beizi.ad.internal.d.a r2 = r10.f6681c     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = r2.e()     // Catch: java.lang.Throwable -> L51
            com.beizi.ad.internal.d.a r2 = r10.f6681c     // Catch: java.lang.Throwable -> L51
            int r5 = r2.c()     // Catch: java.lang.Throwable -> L51
            com.beizi.ad.internal.d.a r2 = r10.f6681c     // Catch: java.lang.Throwable -> L51
            int r6 = r2.d()     // Catch: java.lang.Throwable -> L51
            com.beizi.ad.b.a r7 = r10.a()     // Catch: java.lang.Throwable -> L51
            r2 = r11
            r0 = r1
            r1 = r10
            android.view.View r0 = r0.a(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L51
            com.beizi.ad.internal.d.e r2 = r10.f6683e     // Catch: java.lang.Throwable -> L51
            r2.a(r0)     // Catch: java.lang.Throwable -> L51
            r0 = -1
            goto L53
        L51:
        L52:
            r0 = 0
        L53:
            if (r0 != r8) goto L5e
            com.beizi.ad.internal.d.e r2 = r10.f6683e
            android.view.View r2 = r2.getView()
            if (r2 != 0) goto L5e
            goto L5f
        L5e:
            r9 = r0
        L5f:
            if (r9 == r8) goto L64
            r10.a(r9)
        L64:
            return
    }

    public static com.beizi.ad.internal.d.c a(android.content.Context r6, com.beizi.ad.internal.f r7, com.beizi.ad.internal.d.a r8, com.beizi.ad.internal.c r9, com.beizi.ad.internal.f.c r10) {
            com.beizi.ad.internal.d.c r0 = new com.beizi.ad.internal.d.c
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
