package com.kwad.components.ad.nativead;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    private static long hc;
    private com.kwad.sdk.core.g.d gX;
    private com.kwad.sdk.core.g.c gY;
    private java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.ad.nativead.b.d> oA;
    private java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.ad.nativead.b.C0032b> oB;
    private int oC;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        private static final com.kwad.components.ad.nativead.b oF = null;

        static {
                com.kwad.components.ad.nativead.b r0 = new com.kwad.components.ad.nativead.b
                r0.<init>()
                com.kwad.components.ad.nativead.b.a.oF = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.ad.nativead.b fn() {
                com.kwad.components.ad.nativead.b r0 = com.kwad.components.ad.nativead.b.a.oF
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.nativead.b$b, reason: collision with other inner class name */
    public static class C0032b {
        private android.content.Context mContext;
        private com.kwad.components.ad.nativead.b.c oG;

        public C0032b(com.kwad.components.ad.nativead.b.c r1, android.content.Context r2) {
                r0 = this;
                r0.<init>()
                r0.oG = r1
                r0.mContext = r2
                return
        }

        static /* synthetic */ com.kwad.components.ad.nativead.b.c a(com.kwad.components.ad.nativead.b.C0032b r0) {
                com.kwad.components.ad.nativead.b$c r0 = r0.oG
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void B(java.lang.String r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class d {
        private final com.kwad.components.ad.nativead.b.e oH;
        private final java.lang.ref.WeakReference<android.view.View> oI;

        public d(com.kwad.components.ad.nativead.b.e r2, android.view.View r3) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r3)
                r1.oI = r0
                r1.oH = r2
                return
        }

        static /* synthetic */ com.kwad.components.ad.nativead.b.e a(com.kwad.components.ad.nativead.b.d r0) {
                com.kwad.components.ad.nativead.b$e r0 = r0.oH
                return r0
        }

        static /* synthetic */ java.lang.ref.WeakReference b(com.kwad.components.ad.nativead.b.d r0) {
                java.lang.ref.WeakReference<android.view.View> r0 = r0.oI
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface e {
        void f(double r1);
    }

    public b() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.oA = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.oB = r0
            return
    }

    static /* synthetic */ java.util.concurrent.CopyOnWriteArrayList a(com.kwad.components.ad.nativead.b r0) {
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.ad.nativead.b$d> r0 = r0.oA
            return r0
    }

    private void a(float r3, android.content.Context r4) {
            r2 = this;
            com.kwad.sdk.core.g.d r0 = new com.kwad.sdk.core.g.d
            r0.<init>(r3)
            r2.gX = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.oA = r0
            com.kwad.sdk.core.g.d r0 = r2.gX
            com.kwad.components.ad.nativead.b$1 r1 = new com.kwad.components.ad.nativead.b$1
            r1.<init>(r2)
            r0.a(r1)
            com.kwad.sdk.core.g.d r0 = r2.gX
            r0.g(r3)
            com.kwad.sdk.core.g.d r3 = r2.gX
            r3.bG(r4)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.nativead.b r0, double r1) {
            r0.e(r1)
            return
    }

    private void a(com.kwad.sdk.core.response.model.AdMatrixInfo.RotateInfo r2, android.content.Context r3) {
            r1 = this;
            com.kwad.sdk.core.g.c r0 = new com.kwad.sdk.core.g.c
            r0.<init>(r2)
            r1.gY = r0
            com.kwad.components.ad.nativead.b$2 r2 = new com.kwad.components.ad.nativead.b$2
            r2.<init>(r1)
            r0.a(r2)
            com.kwad.sdk.core.g.c r2 = r1.gY
            r2.bG(r3)
            return
    }

    static /* synthetic */ com.kwad.sdk.core.g.d b(com.kwad.components.ad.nativead.b r0) {
            com.kwad.sdk.core.g.d r0 = r0.gX
            return r0
    }

    public static synchronized boolean bY() {
            java.lang.Class<com.kwad.components.ad.nativead.b> r0 = com.kwad.components.ad.nativead.b.class
            monitor-enter(r0)
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L16
            long r3 = com.kwad.components.ad.nativead.b.hc     // Catch: java.lang.Throwable -> L16
            long r3 = r1 - r3
            r5 = 500(0x1f4, double:2.47E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L18
            com.kwad.components.ad.nativead.b.hc = r1     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            r0 = 1
            return r0
        L16:
            r1 = move-exception
            goto L1b
        L18:
            monitor-exit(r0)
            r0 = 0
            return r0
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    static /* synthetic */ java.util.concurrent.CopyOnWriteArrayList c(com.kwad.components.ad.nativead.b r0) {
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.ad.nativead.b$b> r0 = r0.oB
            return r0
    }

    private void e(double r10) {
            r9 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.ad.nativead.b$d> r0 = r9.oA
            float r1 = com.kwad.sdk.core.config.e.FH()
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto La1
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r3 = r2
            r4 = 2147483647(0x7fffffff, float:NaN)
        L1d:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L6b
            java.lang.Object r5 = r0.next()
            com.kwad.components.ad.nativead.b$d r5 = (com.kwad.components.ad.nativead.b.d) r5
            java.lang.ref.WeakReference r6 = com.kwad.components.ad.nativead.b.d.b(r5)
            if (r6 == 0) goto L1d
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            java.lang.Object r8 = r6.get()
            android.view.View r8 = (android.view.View) r8
            boolean r8 = r8.getGlobalVisibleRect(r7)
            if (r8 == 0) goto L1d
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            boolean r6 = com.kwad.sdk.utils.bz.o(r6, r1)
            if (r6 == 0) goto L1d
            int r6 = r9.oC
            int r6 = r6 / 2
            int r8 = r7.top
            int r8 = r8 - r6
            int r8 = java.lang.Math.abs(r8)
            int r7 = r7.bottom
            int r7 = r7 - r6
            int r6 = java.lang.Math.abs(r7)
            int r6 = java.lang.Math.min(r8, r6)
            if (r6 >= r4) goto L67
            r2 = r5
            r4 = r6
            goto L1d
        L67:
            if (r6 != r4) goto L1d
            r3 = r5
            goto L1d
        L6b:
            if (r2 == 0) goto La1
            if (r3 == 0) goto L9a
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.lang.ref.WeakReference r1 = com.kwad.components.ad.nativead.b.d.b(r2)
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            r1.getGlobalVisibleRect(r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            java.lang.ref.WeakReference r4 = com.kwad.components.ad.nativead.b.d.b(r3)
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            r4.getGlobalVisibleRect(r0)
            int r0 = r0.top
            int r1 = r1.top
            if (r0 >= r1) goto L9a
            r2 = r3
        L9a:
            com.kwad.components.ad.nativead.b$e r0 = com.kwad.components.ad.nativead.b.d.a(r2)
            r0.f(r10)
        La1:
            return
    }

    public static com.kwad.components.ad.nativead.b fm() {
            com.kwad.components.ad.nativead.b r0 = com.kwad.components.ad.nativead.b.a.fn()
            return r0
    }

    public final void D(android.content.Context r2) {
            r1 = this;
            com.kwad.sdk.core.g.c r0 = r1.gY     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.bH(r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r2 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r2)
            return
    }

    public final void N(android.content.Context r2) {
            r1 = this;
            com.kwad.sdk.core.g.c r0 = r1.gY     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.bG(r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r2 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r2)
            return
    }

    public final void a(float r2, android.view.View r3, com.kwad.components.ad.nativead.b.e r4) {
            r1 = this;
            if (r3 == 0) goto L28
            android.content.Context r0 = r3.getContext()
            if (r0 != 0) goto L9
            goto L28
        L9:
            com.kwad.sdk.core.g.d r0 = r1.gX
            if (r0 != 0) goto L1e
            android.content.Context r0 = r3.getContext()
            int r0 = com.kwad.sdk.c.a.a.bi(r0)
            r1.oC = r0
            android.content.Context r0 = r3.getContext()
            r1.a(r2, r0)
        L1e:
            com.kwad.components.ad.nativead.b$d r2 = new com.kwad.components.ad.nativead.b$d
            r2.<init>(r4, r3)
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.ad.nativead.b$d> r3 = r1.oA
            r3.add(r2)
        L28:
            return
    }

    public final void a(com.kwad.components.ad.nativead.b.c r4) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.ad.nativead.b$b> r0 = r3.oB
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.nativead.b$b r1 = (com.kwad.components.ad.nativead.b.C0032b) r1
            if (r1 == 0) goto L6
            com.kwad.components.ad.nativead.b$c r2 = com.kwad.components.ad.nativead.b.C0032b.a(r1)
            if (r2 != r4) goto L6
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.ad.nativead.b$b> r2 = r3.oB
            r2.remove(r1)
            goto L6
        L20:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "sRotateItems size "
            r4.<init>(r0)
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.ad.nativead.b$b> r0 = r3.oB
            int r0 = r0.size()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "KSNativeAdRotateAndShakeManager"
            com.kwad.sdk.core.d.c.d(r0, r4)
            return
    }

    public final void a(com.kwad.components.ad.nativead.b.e r4) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.ad.nativead.b$d> r0 = r3.oA
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.nativead.b$d r1 = (com.kwad.components.ad.nativead.b.d) r1
            com.kwad.components.ad.nativead.b$e r2 = com.kwad.components.ad.nativead.b.d.a(r1)
            if (r2 != r4) goto L6
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.ad.nativead.b$d> r2 = r3.oA
            r2.remove(r1)
            goto L6
        L1e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "sShakeItems size "
            r4.<init>(r0)
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.ad.nativead.b$d> r0 = r3.oA
            int r0 = r0.size()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "KSNativeAdRotateAndShakeManager"
            com.kwad.sdk.core.d.c.d(r0, r4)
            return
    }

    public final void a(com.kwad.sdk.core.response.model.AdMatrixInfo.RotateInfo r2, android.content.Context r3, com.kwad.components.ad.nativead.b.c r4) {
            r1 = this;
            com.kwad.sdk.core.g.c r0 = r1.gY
            if (r0 != 0) goto L8
            r1.a(r2, r3)
            goto Lb
        L8:
            r0.a(r2)
        Lb:
            com.kwad.components.ad.nativead.b$b r2 = new com.kwad.components.ad.nativead.b$b
            r2.<init>(r4, r3)
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.ad.nativead.b$b> r3 = r1.oB
            r3.add(r2)
            return
    }
}
