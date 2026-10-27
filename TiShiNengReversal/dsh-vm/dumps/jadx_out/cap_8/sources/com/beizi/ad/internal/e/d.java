package com.beizi.ad.internal.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d extends com.beizi.ad.internal.m {
    private final java.lang.ref.SoftReference<com.beizi.ad.internal.e.c> a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.ad.internal.e.a.a f6759b;


    public d(com.beizi.ad.internal.e.c r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r2)
            r1.a = r0
            return
    }

    @Override // com.beizi.ad.internal.f
    public void a() {
            r3 = this;
            java.lang.ref.SoftReference<com.beizi.ad.internal.e.c> r0 = r3.a
            java.lang.Object r0 = r0.get()
            com.beizi.ad.internal.e.c r0 = (com.beizi.ad.internal.e.c) r0
            if (r0 != 0) goto Lb
            goto L24
        Lb:
            r3.g()
            r0.a(r3)     // Catch: java.lang.IllegalStateException -> L20 java.util.concurrent.RejectedExecutionException -> L24
            com.beizi.ad.lance.a.c r1 = com.beizi.ad.lance.a.c.b()     // Catch: java.lang.IllegalStateException -> L20 java.util.concurrent.RejectedExecutionException -> L24
            java.util.concurrent.ExecutorService r1 = r1.c()     // Catch: java.lang.IllegalStateException -> L20 java.util.concurrent.RejectedExecutionException -> L24
            r2 = 0
            java.lang.Void[] r2 = new java.lang.Void[r2]     // Catch: java.lang.IllegalStateException -> L20 java.util.concurrent.RejectedExecutionException -> L24
            r0.executeOnExecutor(r1, r2)     // Catch: java.lang.IllegalStateException -> L20 java.util.concurrent.RejectedExecutionException -> L24
            return
        L20:
            r0 = move-exception
            r0.getMessage()
        L24:
            return
    }

    @Override // com.beizi.ad.internal.f
    public void a(int r2) {
            r1 = this;
            r1.h()
            java.lang.ref.SoftReference<com.beizi.ad.internal.e.c> r0 = r1.a
            java.lang.Object r0 = r0.get()
            com.beizi.ad.internal.e.c r0 = (com.beizi.ad.internal.e.c) r0
            if (r0 == 0) goto L14
            com.beizi.ad.internal.c r0 = r0.e()
            r0.a(r2)
        L14:
            return
    }

    public void a(com.beizi.ad.internal.f.b r2) {
            r1 = this;
            r1.h()
            com.beizi.ad.internal.e.a.a r0 = r1.f6759b
            if (r0 == 0) goto La
            r0 = 0
            r1.f6759b = r0
        La:
            java.lang.ref.SoftReference<com.beizi.ad.internal.e.c> r0 = r1.a
            java.lang.Object r0 = r0.get()
            com.beizi.ad.internal.e.c r0 = (com.beizi.ad.internal.e.c) r0
            if (r0 == 0) goto L1c
            com.beizi.ad.internal.c r0 = r0.e()
            r0.a(r2)
            return
        L1c:
            r2.h()
            return
    }

    @Override // com.beizi.ad.internal.f
    public void a(com.beizi.ad.internal.f.c r4) {
            r3 = this;
            java.lang.ref.SoftReference<com.beizi.ad.internal.e.c> r0 = r3.a
            java.lang.Object r0 = r0.get()
            com.beizi.ad.internal.e.c r0 = (com.beizi.ad.internal.e.c) r0
            if (r0 == 0) goto L82
            boolean r1 = r4.h()
            java.util.LinkedList r2 = r3.b()
            if (r2 == 0) goto L20
            java.util.LinkedList r2 = r3.b()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L20
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            if (r1 != 0) goto L2e
            if (r2 != 0) goto L2e
            com.beizi.ad.internal.c r4 = r0.e()
            r0 = 3
            r4.a(r0)
            return
        L2e:
            if (r1 == 0) goto L37
            java.util.LinkedList r1 = r4.g()
            r3.a(r1)
        L37:
            java.util.LinkedList r1 = r3.b()
            if (r1 == 0) goto L5b
            java.util.LinkedList r1 = r3.b()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L5b
            com.beizi.ad.internal.d.a r0 = r3.i()
            if (r0 == 0) goto L54
            java.util.HashMap r1 = r4.j()
            r0.a(r1)
        L54:
            com.beizi.ad.internal.e.a.a r4 = com.beizi.ad.internal.e.a.a.a(r0, r3, r4)
            r3.f6759b = r4
            return
        L5b:
            com.beizi.ad.i r1 = r4.a()
            com.beizi.ad.internal.e.a r1 = (com.beizi.ad.internal.e.a) r1
            com.beizi.ad.internal.e r2 = r0.d()
            java.lang.String r2 = r2.a()
            r1.a(r2)
            boolean r2 = r0.a()
            r1.a(r2)
            boolean r0 = r0.b()
            r1.b(r0)
            com.beizi.ad.internal.e.d$1 r0 = new com.beizi.ad.internal.e.d$1
            r0.<init>(r3, r1, r4)
            r3.a(r0)
        L82:
            return
    }

    @Override // com.beizi.ad.internal.f
    public com.beizi.ad.internal.e c() {
            r1 = this;
            java.lang.ref.SoftReference<com.beizi.ad.internal.e.c> r0 = r1.a
            java.lang.Object r0 = r0.get()
            com.beizi.ad.internal.e.c r0 = (com.beizi.ad.internal.e.c) r0
            if (r0 == 0) goto Lf
            com.beizi.ad.internal.e r0 = r0.d()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // com.beizi.ad.internal.f
    public com.beizi.ad.b.a d() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.beizi.ad.internal.m
    public void e() {
            r3 = this;
            java.lang.ref.SoftReference<com.beizi.ad.internal.e.c> r0 = r3.a
            java.lang.Object r0 = r0.get()
            com.beizi.ad.internal.e.c r0 = (com.beizi.ad.internal.e.c) r0
            r1 = 1
            if (r0 == 0) goto Le
            r0.cancel(r1)
        Le:
            r0 = 0
            r3.a(r0)
            com.beizi.ad.internal.e.a.a r2 = r3.f6759b
            if (r2 == 0) goto L1b
            r2.a(r1)
            r3.f6759b = r0
        L1b:
            return
    }
}
