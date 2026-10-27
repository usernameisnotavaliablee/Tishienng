package com.beizi.ad.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class g extends com.beizi.ad.internal.m {
    private final java.lang.ref.SoftReference<com.beizi.ad.internal.view.AdViewImpl> a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.ad.internal.d.b f6812b;

    /* renamed from: c, reason: collision with root package name */
    private com.beizi.ad.internal.f.a f6813c;



    g(com.beizi.ad.internal.view.AdViewImpl r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r2)
            r1.a = r0
            return
    }

    static /* synthetic */ com.beizi.ad.internal.d.b a(com.beizi.ad.internal.g r0, com.beizi.ad.internal.d.b r1) {
            r0.f6812b = r1
            return r1
    }

    static /* synthetic */ void a(com.beizi.ad.internal.g r0, com.beizi.ad.internal.view.AdViewImpl r1, com.beizi.ad.internal.f.c r2) {
            r0.a(r1, r2)
            return
    }

    private void a(com.beizi.ad.internal.view.AdViewImpl r6, com.beizi.ad.internal.f.c r7) {
            r5 = this;
            r0 = 0
            com.beizi.ad.internal.e r1 = r6.getAdParameters()     // Catch: java.lang.Exception -> L26
            r1.a(r0)     // Catch: java.lang.Exception -> L26
            com.beizi.ad.internal.view.AdWebView r1 = new com.beizi.ad.internal.view.AdWebView     // Catch: java.lang.Exception -> L26
            r1.<init>(r6)     // Catch: java.lang.Exception -> L26
            com.beizi.ad.internal.k r2 = r6.getMediaType()     // Catch: java.lang.Exception -> L26
            com.beizi.ad.internal.k r3 = com.beizi.ad.internal.k.a     // Catch: java.lang.Exception -> L26
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L26
            if (r2 != 0) goto L28
            com.beizi.ad.internal.k r2 = r6.getMediaType()     // Catch: java.lang.Exception -> L26
            com.beizi.ad.internal.k r3 = com.beizi.ad.internal.k.f7002d     // Catch: java.lang.Exception -> L26
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L26
            if (r2 == 0) goto L2b
            goto L28
        L26:
            r6 = move-exception
            goto L62
        L28:
            r1.loadAd(r7)     // Catch: java.lang.Exception -> L26
        L2b:
            com.beizi.ad.internal.f.c$a r2 = r7.z()     // Catch: java.lang.Exception -> L26
            com.beizi.ad.internal.f.c$a r3 = r7.A()     // Catch: java.lang.Exception -> L26
            r6.createAdLogo(r2, r3)     // Catch: java.lang.Exception -> L26
            com.beizi.ad.internal.k r2 = r6.getMediaType()     // Catch: java.lang.Exception -> L26
            com.beizi.ad.internal.k r3 = com.beizi.ad.internal.k.f7002d     // Catch: java.lang.Exception -> L26
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L26
            if (r2 == 0) goto L59
            r6.addBannerCloseBtn()     // Catch: java.lang.Exception -> L26
            r2 = r6
            com.beizi.ad.internal.view.BannerAdViewImpl r2 = (com.beizi.ad.internal.view.BannerAdViewImpl) r2     // Catch: java.lang.Exception -> L26
            boolean r3 = r2.getExpandsToFitScreenWidth()     // Catch: java.lang.Exception -> L26
            if (r3 == 0) goto L59
            int r3 = r7.d()     // Catch: java.lang.Exception -> L26
            int r4 = r7.c()     // Catch: java.lang.Exception -> L26
            r2.expandToFitScreenWidth(r3, r4, r1)     // Catch: java.lang.Exception -> L26
        L59:
            com.beizi.ad.internal.g$2 r2 = new com.beizi.ad.internal.g$2     // Catch: java.lang.Exception -> L26
            r2.<init>(r5, r6, r1, r7)     // Catch: java.lang.Exception -> L26
            r5.a(r2)     // Catch: java.lang.Exception -> L26
            return
        L62:
            r6.toString()
            r5.a(r0)
            return
    }

    @Override // com.beizi.ad.internal.f
    public void a() {
            r3 = this;
            com.beizi.ad.internal.f.a$a r0 = r3.f()
            if (r0 != 0) goto L7
            goto L40
        L7:
            com.beizi.ad.internal.f.a r0 = new com.beizi.ad.internal.f.a
            com.beizi.ad.internal.f.a$a r1 = r3.f()
            r0.<init>(r1)
            r3.f6813c = r0
            r3.g()
            com.beizi.ad.internal.f.a r0 = r3.f6813c     // Catch: java.lang.IllegalStateException -> L3c java.util.concurrent.RejectedExecutionException -> L40
            r0.a(r3)     // Catch: java.lang.IllegalStateException -> L3c java.util.concurrent.RejectedExecutionException -> L40
            com.beizi.ad.internal.f.a r0 = r3.f6813c     // Catch: java.lang.IllegalStateException -> L3c java.util.concurrent.RejectedExecutionException -> L40
            com.beizi.ad.lance.a.c r1 = com.beizi.ad.lance.a.c.b()     // Catch: java.lang.IllegalStateException -> L3c java.util.concurrent.RejectedExecutionException -> L40
            java.util.concurrent.ExecutorService r1 = r1.c()     // Catch: java.lang.IllegalStateException -> L3c java.util.concurrent.RejectedExecutionException -> L40
            r2 = 0
            java.lang.Void[] r2 = new java.lang.Void[r2]     // Catch: java.lang.IllegalStateException -> L3c java.util.concurrent.RejectedExecutionException -> L40
            r0.executeOnExecutor(r1, r2)     // Catch: java.lang.IllegalStateException -> L3c java.util.concurrent.RejectedExecutionException -> L40
            java.lang.ref.SoftReference<com.beizi.ad.internal.view.AdViewImpl> r0 = r3.a     // Catch: java.lang.IllegalStateException -> L3c java.util.concurrent.RejectedExecutionException -> L40
            java.lang.Object r0 = r0.get()     // Catch: java.lang.IllegalStateException -> L3c java.util.concurrent.RejectedExecutionException -> L40
            com.beizi.ad.internal.view.AdViewImpl r0 = (com.beizi.ad.internal.view.AdViewImpl) r0     // Catch: java.lang.IllegalStateException -> L3c java.util.concurrent.RejectedExecutionException -> L40
            if (r0 == 0) goto L40
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()     // Catch: java.lang.IllegalStateException -> L3c java.util.concurrent.RejectedExecutionException -> L40
            r0.e()     // Catch: java.lang.IllegalStateException -> L3c java.util.concurrent.RejectedExecutionException -> L40
            return
        L3c:
            r0 = move-exception
            r0.getMessage()
        L40:
            return
    }

    @Override // com.beizi.ad.internal.f
    public void a(int r2) {
            r1 = this;
            r1.h()
            java.lang.ref.SoftReference<com.beizi.ad.internal.view.AdViewImpl> r0 = r1.a
            java.lang.Object r0 = r0.get()
            com.beizi.ad.internal.view.AdViewImpl r0 = (com.beizi.ad.internal.view.AdViewImpl) r0
            if (r0 == 0) goto L14
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            r0.a(r2)
        L14:
            return
    }

    public void a(com.beizi.ad.internal.f.b r2) {
            r1 = this;
            r1.h()
            com.beizi.ad.internal.d.b r0 = r1.f6812b
            if (r0 == 0) goto La
            r0 = 0
            r1.f6812b = r0
        La:
            java.lang.ref.SoftReference<com.beizi.ad.internal.view.AdViewImpl> r0 = r1.a
            java.lang.Object r0 = r0.get()
            com.beizi.ad.internal.view.AdViewImpl r0 = (com.beizi.ad.internal.view.AdViewImpl) r0
            if (r0 == 0) goto L1c
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            r0.a(r2)
            return
        L1c:
            r2.h()
            return
    }

    @Override // com.beizi.ad.internal.f
    public void a(com.beizi.ad.internal.f.c r4) {
            r3 = this;
            java.lang.ref.SoftReference<com.beizi.ad.internal.view.AdViewImpl> r0 = r3.a
            java.lang.Object r0 = r0.get()
            com.beizi.ad.internal.view.AdViewImpl r0 = (com.beizi.ad.internal.view.AdViewImpl) r0
            if (r0 == 0) goto L16
            android.os.Handler r1 = r0.getMyHandler()
            com.beizi.ad.internal.g$1 r2 = new com.beizi.ad.internal.g$1
            r2.<init>(r3, r4, r0)
            r1.post(r2)
        L16:
            return
    }

    @Override // com.beizi.ad.internal.f
    public com.beizi.ad.internal.e c() {
            r1 = this;
            java.lang.ref.SoftReference<com.beizi.ad.internal.view.AdViewImpl> r0 = r1.a
            java.lang.Object r0 = r0.get()
            com.beizi.ad.internal.view.AdViewImpl r0 = (com.beizi.ad.internal.view.AdViewImpl) r0
            if (r0 == 0) goto Lf
            com.beizi.ad.internal.e r0 = r0.getAdParameters()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // com.beizi.ad.internal.f
    public com.beizi.ad.b.a d() {
            r1 = this;
            com.beizi.ad.internal.f.a$a r0 = r1.f()
            if (r0 == 0) goto Lb
            com.beizi.ad.b.a r0 = r0.a()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // com.beizi.ad.internal.m
    public void e() {
            r3 = this;
            com.beizi.ad.internal.f.a r0 = r3.f6813c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lb
            r0.cancel(r1)
            r3.f6813c = r2
        Lb:
            r3.a(r2)
            com.beizi.ad.internal.d.b r0 = r3.f6812b
            if (r0 == 0) goto L17
            r0.a(r1)
            r3.f6812b = r2
        L17:
            return
    }

    protected com.beizi.ad.internal.f.a.C0104a f() {
            r1 = this;
            java.lang.ref.SoftReference<com.beizi.ad.internal.view.AdViewImpl> r0 = r1.a
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L15
            java.lang.ref.SoftReference<com.beizi.ad.internal.view.AdViewImpl> r0 = r1.a
            java.lang.Object r0 = r0.get()
            com.beizi.ad.internal.view.AdViewImpl r0 = (com.beizi.ad.internal.view.AdViewImpl) r0
            com.beizi.ad.internal.f.a$a r0 = r0.getAdRequest()
            return r0
        L15:
            r0 = 0
            return r0
    }
}
