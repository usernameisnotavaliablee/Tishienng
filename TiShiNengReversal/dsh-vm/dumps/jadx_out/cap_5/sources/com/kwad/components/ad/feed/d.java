package com.kwad.components.ad.feed;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d {
    private static com.kwad.sdk.core.g.d gX;
    private static com.kwad.sdk.core.g.c gY;
    private static android.os.Vibrator gZ;
    private static java.util.List<com.kwad.components.ad.feed.d.c> ha;
    private static java.util.List<com.kwad.components.ad.feed.d.a> hb;
    private static long hc;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private com.kwad.components.ad.feed.d.b hf;
        private android.content.Context mContext;

        public a(com.kwad.components.ad.feed.d.b r1, android.content.Context r2) {
                r0 = this;
                r0.<init>()
                r0.hf = r1
                r0.mContext = r2
                return
        }

        static /* synthetic */ com.kwad.components.ad.feed.d.b a(com.kwad.components.ad.feed.d.a r0) {
                com.kwad.components.ad.feed.d$b r0 = r0.hf
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        boolean s(java.lang.String r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c {
        private com.kwad.components.ad.feed.d.InterfaceC0013d hg;
        private android.content.Context mContext;

        public c(com.kwad.components.ad.feed.d.InterfaceC0013d r1, android.content.Context r2) {
                r0 = this;
                r0.<init>()
                r0.hg = r1
                r0.mContext = r2
                return
        }

        static /* synthetic */ com.kwad.components.ad.feed.d.InterfaceC0013d a(com.kwad.components.ad.feed.d.c r0) {
                com.kwad.components.ad.feed.d$d r0 = r0.hg
                return r0
        }

        static /* synthetic */ android.content.Context b(com.kwad.components.ad.feed.d.c r0) {
                android.content.Context r0 = r0.mContext
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.feed.d$d, reason: collision with other inner class name */
    public interface InterfaceC0013d {
        boolean b(double r1);
    }

    static {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.kwad.components.ad.feed.d.ha = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.kwad.components.ad.feed.d.hb = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void D(android.content.Context r1) {
            com.kwad.sdk.core.g.c r0 = com.kwad.components.ad.feed.d.gY     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto La
            r0.bH(r1)     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            com.kwad.components.ad.feed.d.gY = r1     // Catch: java.lang.Throwable -> Lb
        La:
            return
        Lb:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            return
    }

    public static void E(android.content.Context r1) {
            com.kwad.sdk.core.g.d r0 = com.kwad.components.ad.feed.d.gX     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto La
            r0.bH(r1)     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            com.kwad.components.ad.feed.d.gX = r1     // Catch: java.lang.Throwable -> Lb
        La:
            return
        Lb:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            return
    }

    private static android.os.Vibrator F(android.content.Context r1) {
            android.os.Vibrator r0 = com.kwad.components.ad.feed.d.gZ
            if (r0 != 0) goto Le
            java.lang.String r0 = "vibrator"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.os.Vibrator r1 = (android.os.Vibrator) r1
            com.kwad.components.ad.feed.d.gZ = r1
        Le:
            android.os.Vibrator r1 = com.kwad.components.ad.feed.d.gZ
            return r1
    }

    static /* synthetic */ android.os.Vibrator G(android.content.Context r0) {
            android.os.Vibrator r0 = F(r0)
            return r0
    }

    private static void a(float r2, android.content.Context r3) {
            com.kwad.sdk.core.g.d r0 = new com.kwad.sdk.core.g.d
            r0.<init>(r2)
            com.kwad.components.ad.feed.d.gX = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.kwad.components.ad.feed.d.ha = r0
            com.kwad.sdk.core.g.d r0 = com.kwad.components.ad.feed.d.gX
            com.kwad.components.ad.feed.d$1 r1 = new com.kwad.components.ad.feed.d$1
            r1.<init>()
            r0.a(r1)
            com.kwad.sdk.core.g.d r0 = com.kwad.components.ad.feed.d.gX
            r0.g(r2)
            com.kwad.sdk.core.g.d r2 = com.kwad.components.ad.feed.d.gX
            r2.bG(r3)
            return
    }

    public static void a(float r1, android.content.Context r2, com.kwad.components.ad.feed.d.InterfaceC0013d r3) {
            com.kwad.sdk.core.g.d r0 = com.kwad.components.ad.feed.d.gX
            if (r0 != 0) goto L7
            a(r1, r2)
        L7:
            com.kwad.components.ad.feed.d$c r1 = new com.kwad.components.ad.feed.d$c
            r1.<init>(r3, r2)
            java.util.List<com.kwad.components.ad.feed.d$c> r2 = com.kwad.components.ad.feed.d.ha
            r2.add(r1)
            return
    }

    public static void a(com.kwad.components.ad.feed.d.b r3) {
            java.util.List<com.kwad.components.ad.feed.d$a> r0 = com.kwad.components.ad.feed.d.hb
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.feed.d$a r1 = (com.kwad.components.ad.feed.d.a) r1
            if (r1 == 0) goto L6
            com.kwad.components.ad.feed.d$b r2 = com.kwad.components.ad.feed.d.a.a(r1)
            if (r2 != r3) goto L6
            java.util.List<com.kwad.components.ad.feed.d$a> r2 = com.kwad.components.ad.feed.d.hb
            r2.remove(r1)
            goto L6
        L20:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "sRotateItems size "
            r3.<init>(r0)
            java.util.List<com.kwad.components.ad.feed.d$a> r0 = com.kwad.components.ad.feed.d.hb
            int r0 = r0.size()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "KSFeedRotateAndShakeManager"
            com.kwad.sdk.core.d.c.d(r0, r3)
            return
    }

    public static void a(com.kwad.components.ad.feed.d.InterfaceC0013d r3) {
            java.util.List<com.kwad.components.ad.feed.d$c> r0 = com.kwad.components.ad.feed.d.ha
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.feed.d$c r1 = (com.kwad.components.ad.feed.d.c) r1
            if (r1 == 0) goto L6
            com.kwad.components.ad.feed.d$d r2 = com.kwad.components.ad.feed.d.c.a(r1)
            if (r2 != r3) goto L6
            java.util.List<com.kwad.components.ad.feed.d$c> r2 = com.kwad.components.ad.feed.d.ha
            r2.remove(r1)
            goto L6
        L20:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "sShakeItems size "
            r3.<init>(r0)
            java.util.List<com.kwad.components.ad.feed.d$c> r0 = com.kwad.components.ad.feed.d.ha
            int r0 = r0.size()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "KSFeedRotateAndShakeManager"
            com.kwad.sdk.core.d.c.d(r0, r3)
            return
    }

    private static void a(com.kwad.sdk.core.response.model.AdMatrixInfo.RotateInfo r1, android.content.Context r2) {
            com.kwad.sdk.core.g.c r0 = new com.kwad.sdk.core.g.c
            r0.<init>(r1)
            com.kwad.components.ad.feed.d.gY = r0
            com.kwad.components.ad.feed.d$2 r1 = new com.kwad.components.ad.feed.d$2
            r1.<init>()
            r0.a(r1)
            com.kwad.sdk.core.g.c r1 = com.kwad.components.ad.feed.d.gY
            r1.bG(r2)
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdMatrixInfo.RotateInfo r1, android.content.Context r2, com.kwad.components.ad.feed.d.b r3) {
            com.kwad.sdk.core.g.c r0 = com.kwad.components.ad.feed.d.gY
            if (r0 != 0) goto L8
            a(r1, r2)
            goto Lb
        L8:
            r0.a(r1)
        Lb:
            com.kwad.components.ad.feed.d$a r1 = new com.kwad.components.ad.feed.d$a
            r1.<init>(r3, r2)
            java.util.List<com.kwad.components.ad.feed.d$a> r2 = com.kwad.components.ad.feed.d.hb
            r2.add(r1)
            return
    }

    public static synchronized boolean bY() {
            java.lang.Class<com.kwad.components.ad.feed.d> r0 = com.kwad.components.ad.feed.d.class
            monitor-enter(r0)
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L16
            long r3 = com.kwad.components.ad.feed.d.hc     // Catch: java.lang.Throwable -> L16
            long r3 = r1 - r3
            r5 = 500(0x1f4, double:2.47E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L18
            com.kwad.components.ad.feed.d.hc = r1     // Catch: java.lang.Throwable -> L16
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

    static /* synthetic */ java.util.List bZ() {
            java.util.List<com.kwad.components.ad.feed.d$c> r0 = com.kwad.components.ad.feed.d.ha
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.g.d ca() {
            com.kwad.sdk.core.g.d r0 = com.kwad.components.ad.feed.d.gX
            return r0
    }

    static /* synthetic */ java.util.List cb() {
            java.util.List<com.kwad.components.ad.feed.d$a> r0 = com.kwad.components.ad.feed.d.hb
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.g.c cc() {
            com.kwad.sdk.core.g.c r0 = com.kwad.components.ad.feed.d.gY
            return r0
    }
}
