package com.beizi.ad.lance.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    private android.view.View a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.ad.internal.e.e f7259b;

    /* renamed from: c, reason: collision with root package name */
    private com.beizi.ad.internal.e.g f7260c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.concurrent.ScheduledThreadPoolExecutor f7261d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.Runnable f7262e;

    /* renamed from: f, reason: collision with root package name */
    private java.text.DecimalFormatSymbols f7263f;

    /* renamed from: g, reason: collision with root package name */
    private java.text.Format f7264g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7265h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7266i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.lance.a.f$1, reason: invalid class name */
    class AnonymousClass1 implements java.lang.Runnable {
        final /* synthetic */ com.beizi.ad.lance.a.f a;


        AnonymousClass1(com.beizi.ad.lance.a.f r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                com.beizi.ad.lance.a.f r0 = r8.a
                com.beizi.ad.lance.a.f$1$1 r1 = new com.beizi.ad.lance.a.f$1$1
                r1.<init>(r8)
                com.beizi.ad.lance.a.f.a(r0, r1)
                com.beizi.ad.lance.a.f r0 = r8.a
                com.beizi.ad.lance.a.c r1 = com.beizi.ad.lance.a.c.b()
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.g()
                com.beizi.ad.lance.a.f.a(r0, r1)
                com.beizi.ad.lance.a.f r0 = r8.a
                java.util.concurrent.ScheduledThreadPoolExecutor r0 = com.beizi.ad.lance.a.f.d(r0)
                if (r0 != 0) goto L20
                return
            L20:
                com.beizi.ad.lance.a.f r0 = r8.a
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.beizi.ad.lance.a.f.d(r0)
                com.beizi.ad.lance.a.f r0 = r8.a
                java.lang.Runnable r2 = com.beizi.ad.lance.a.f.e(r0)
                r5 = 250(0xfa, double:1.235E-321)
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
                r3 = 0
                r1.scheduleWithFixedDelay(r2, r3, r5, r7)
                return
        }
    }

    public f(android.view.View r4, com.beizi.ad.internal.e.e r5, com.beizi.ad.internal.e.g r6) {
            r3 = this;
            r3.<init>()
            java.text.DecimalFormatSymbols r0 = new java.text.DecimalFormatSymbols
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r0.<init>(r1)
            r3.f7263f = r0
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "0.00"
            java.text.DecimalFormatSymbols r2 = r3.f7263f
            r0.<init>(r1, r2)
            r3.f7264g = r0
            r0 = 0
            r3.f7265h = r0
            r3.f7266i = r0
            r3.a = r4
            r3.f7259b = r5
            r3.f7260c = r6
            r3.b()
            return
    }

    static /* synthetic */ java.lang.Runnable a(com.beizi.ad.lance.a.f r0, java.lang.Runnable r1) {
            r0.f7262e = r1
            return r1
    }

    static /* synthetic */ java.util.concurrent.ScheduledThreadPoolExecutor a(com.beizi.ad.lance.a.f r0, java.util.concurrent.ScheduledThreadPoolExecutor r1) {
            r0.f7261d = r1
            return r1
    }

    private boolean a(int r5) {
            r4 = this;
            r0 = 0
            android.view.View r1 = r4.a     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto L44
            int r1 = r1.getVisibility()     // Catch: java.lang.Exception -> L44
            if (r1 != 0) goto L44
            android.view.View r1 = r4.a     // Catch: java.lang.Exception -> L44
            android.view.ViewParent r1 = r1.getParent()     // Catch: java.lang.Exception -> L44
            if (r1 != 0) goto L14
            goto L44
        L14:
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.Exception -> L44
            r1.<init>()     // Catch: java.lang.Exception -> L44
            android.view.View r2 = r4.a     // Catch: java.lang.Exception -> L44
            boolean r2 = r2.getGlobalVisibleRect(r1)     // Catch: java.lang.Exception -> L44
            if (r2 != 0) goto L22
            return r0
        L22:
            int r2 = r1.height()     // Catch: java.lang.Exception -> L44
            int r1 = r1.width()     // Catch: java.lang.Exception -> L44
            int r2 = r2 * r1
            android.view.View r1 = r4.a     // Catch: java.lang.Exception -> L44
            int r1 = r1.getHeight()     // Catch: java.lang.Exception -> L44
            android.view.View r3 = r4.a     // Catch: java.lang.Exception -> L44
            int r3 = r3.getWidth()     // Catch: java.lang.Exception -> L44
            int r1 = r1 * r3
            if (r1 <= 0) goto L44
            int r2 = r2 * 100
            int r5 = r5 * r1
            if (r2 < r5) goto L44
            r5 = 1
            return r5
        L44:
            return r0
    }

    static /* synthetic */ boolean a(com.beizi.ad.lance.a.f r0) {
            boolean r0 = r0.f7265h
            return r0
    }

    static /* synthetic */ boolean a(com.beizi.ad.lance.a.f r0, int r1) {
            boolean r0 = r0.a(r1)
            return r0
    }

    static /* synthetic */ boolean a(com.beizi.ad.lance.a.f r0, boolean r1) {
            r0.f7265h = r1
            return r1
    }

    static /* synthetic */ com.beizi.ad.internal.e.g b(com.beizi.ad.lance.a.f r0) {
            com.beizi.ad.internal.e.g r0 = r0.f7260c
            return r0
    }

    private void b() {
            r2 = this;
            android.view.View r0 = r2.a
            if (r0 != 0) goto L5
            return
        L5:
            com.beizi.ad.lance.a.f$1 r1 = new com.beizi.ad.lance.a.f$1
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    static /* synthetic */ boolean b(com.beizi.ad.lance.a.f r0, boolean r1) {
            r0.f7266i = r1
            return r1
    }

    static /* synthetic */ boolean c(com.beizi.ad.lance.a.f r0) {
            boolean r0 = r0.f7266i
            return r0
    }

    static /* synthetic */ java.util.concurrent.ScheduledThreadPoolExecutor d(com.beizi.ad.lance.a.f r0) {
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r0.f7261d
            return r0
    }

    static /* synthetic */ java.lang.Runnable e(com.beizi.ad.lance.a.f r0) {
            java.lang.Runnable r0 = r0.f7262e
            return r0
    }

    static /* synthetic */ android.view.View f(com.beizi.ad.lance.a.f r0) {
            android.view.View r0 = r0.a
            return r0
    }

    static /* synthetic */ com.beizi.ad.internal.e.e g(com.beizi.ad.lance.a.f r0) {
            com.beizi.ad.internal.e.e r0 = r0.f7259b
            return r0
    }

    public void a() {
            r2 = this;
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r2.f7261d     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto Lb
            java.lang.Runnable r1 = r2.f7262e     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto Lb
            r0.remove(r1)     // Catch: java.lang.Throwable -> L14
        Lb:
            r0 = 0
            r2.f7260c = r0     // Catch: java.lang.Throwable -> L14
            r2.f7259b = r0     // Catch: java.lang.Throwable -> L14
            r2.a = r0     // Catch: java.lang.Throwable -> L14
            r2.f7261d = r0     // Catch: java.lang.Throwable -> L14
        L14:
            return
    }
}
