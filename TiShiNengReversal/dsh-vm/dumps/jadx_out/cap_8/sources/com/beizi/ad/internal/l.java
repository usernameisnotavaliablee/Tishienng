package com.beizi.ad.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l extends com.beizi.ad.internal.m {
    private com.beizi.ad.internal.f.a a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.ad.internal.e f7008b;

    l() {
            r3 = this;
            r3.<init>()
            com.beizi.ad.internal.e r0 = new com.beizi.ad.internal.e
            com.beizi.ad.internal.h r1 = com.beizi.ad.internal.h.a()
            android.content.Context r1 = r1.e()
            java.lang.String r2 = com.beizi.ad.internal.h.o.a()
            r0.<init>(r1, r2)
            r3.f7008b = r0
            return
    }

    @Override // com.beizi.ad.internal.f
    public void a() {
            r3 = this;
            com.beizi.ad.internal.f.a r0 = new com.beizi.ad.internal.f.a
            com.beizi.ad.internal.f.a$a r1 = new com.beizi.ad.internal.f.a$a
            r1.<init>()
            r0.<init>(r1)
            r3.a = r0
            r3.g()
            com.beizi.ad.internal.f.a r0 = r3.a     // Catch: java.lang.IllegalStateException -> L25 java.util.concurrent.RejectedExecutionException -> L29
            r0.a(r3)     // Catch: java.lang.IllegalStateException -> L25 java.util.concurrent.RejectedExecutionException -> L29
            com.beizi.ad.internal.f.a r0 = r3.a     // Catch: java.lang.IllegalStateException -> L25 java.util.concurrent.RejectedExecutionException -> L29
            com.beizi.ad.lance.a.c r1 = com.beizi.ad.lance.a.c.b()     // Catch: java.lang.IllegalStateException -> L25 java.util.concurrent.RejectedExecutionException -> L29
            java.util.concurrent.ExecutorService r1 = r1.c()     // Catch: java.lang.IllegalStateException -> L25 java.util.concurrent.RejectedExecutionException -> L29
            r2 = 0
            java.lang.Void[] r2 = new java.lang.Void[r2]     // Catch: java.lang.IllegalStateException -> L25 java.util.concurrent.RejectedExecutionException -> L29
            r0.executeOnExecutor(r1, r2)     // Catch: java.lang.IllegalStateException -> L25 java.util.concurrent.RejectedExecutionException -> L29
            return
        L25:
            r0 = move-exception
            r0.getMessage()
        L29:
            return
    }

    @Override // com.beizi.ad.internal.f
    public void a(int r1) {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.internal.f
    public void a(com.beizi.ad.internal.f.c r1) {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.internal.f
    public com.beizi.ad.internal.e c() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f7008b
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
            com.beizi.ad.internal.f.a r0 = r3.a
            r1 = 0
            if (r0 == 0) goto Lb
            r2 = 1
            r0.cancel(r2)
            r3.a = r1
        Lb:
            r3.a(r1)
            return
    }
}
