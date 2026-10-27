package com.beizi.ad.internal.i;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    private final java.lang.Object a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f6966b;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.beizi.ad.internal.i.g> f6967c;

    /* renamed from: d, reason: collision with root package name */
    private final java.net.ServerSocket f6968d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6969e;

    /* renamed from: f, reason: collision with root package name */
    private final java.lang.Thread f6970f;

    /* renamed from: g, reason: collision with root package name */
    private final com.beizi.ad.internal.i.c f6971g;

    /* renamed from: h, reason: collision with root package name */
    private final com.beizi.ad.internal.i.j f6972h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.i.f$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private java.io.File a;

        /* renamed from: b, reason: collision with root package name */
        private com.beizi.ad.internal.i.a.c f6973b;

        /* renamed from: c, reason: collision with root package name */
        private com.beizi.ad.internal.i.a.a f6974c;

        /* renamed from: d, reason: collision with root package name */
        private com.beizi.ad.internal.i.b.c f6975d;

        public a(android.content.Context r3) {
                r2 = this;
                r2.<init>()
                com.beizi.ad.internal.i.b.c r0 = com.beizi.ad.internal.i.b.d.a(r3)
                r2.f6975d = r0
                java.io.File r3 = com.beizi.ad.internal.i.q.a(r3)
                r2.a = r3
                com.beizi.ad.internal.i.a.g r3 = new com.beizi.ad.internal.i.a.g
                r0 = 536870912(0x20000000, double:2.65249474E-315)
                r3.<init>(r0)
                r2.f6974c = r3
                com.beizi.ad.internal.i.a.f r3 = new com.beizi.ad.internal.i.a.f
                r3.<init>()
                r2.f6973b = r3
                return
        }

        private com.beizi.ad.internal.i.c b() {
                r5 = this;
                com.beizi.ad.internal.i.c r0 = new com.beizi.ad.internal.i.c
                java.io.File r1 = r5.a
                com.beizi.ad.internal.i.a.c r2 = r5.f6973b
                com.beizi.ad.internal.i.a.a r3 = r5.f6974c
                com.beizi.ad.internal.i.b.c r4 = r5.f6975d
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public com.beizi.ad.internal.i.f.a a(long r2) {
                r1 = this;
                com.beizi.ad.internal.i.a.g r0 = new com.beizi.ad.internal.i.a.g
                r0.<init>(r2)
                r1.f6974c = r0
                return r1
        }

        public com.beizi.ad.internal.i.f a() {
                r3 = this;
                com.beizi.ad.internal.i.c r0 = r3.b()
                com.beizi.ad.internal.i.f r1 = new com.beizi.ad.internal.i.f
                r2 = 0
                r1.<init>(r0, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class b implements java.lang.Runnable {
        final /* synthetic */ com.beizi.ad.internal.i.f a;

        /* renamed from: b, reason: collision with root package name */
        private final java.net.Socket f6976b;

        public b(com.beizi.ad.internal.i.f r1, java.net.Socket r2) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.f6976b = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.beizi.ad.internal.i.f r0 = r2.a
                java.net.Socket r1 = r2.f6976b
                com.beizi.ad.internal.i.f.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class c implements java.lang.Runnable {
        final /* synthetic */ com.beizi.ad.internal.i.f a;

        /* renamed from: b, reason: collision with root package name */
        private final java.util.concurrent.CountDownLatch f6977b;

        public c(com.beizi.ad.internal.i.f r1, java.util.concurrent.CountDownLatch r2) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.f6977b = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.f6977b
                r0.countDown()
                com.beizi.ad.internal.i.f r0 = r1.a
                com.beizi.ad.internal.i.f.a(r0)
                return
        }
    }

    private f(com.beizi.ad.internal.i.c r5) {
            r4 = this;
            java.lang.String r0 = "MTI3LjAuMC4x"
            r4.<init>()
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r4.a = r1
            r1 = 8
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newFixedThreadPool(r1)
            r4.f6966b = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r4.f6967c = r2
            java.lang.Object r5 = com.beizi.ad.internal.i.k.a(r5)
            com.beizi.ad.internal.i.c r5 = (com.beizi.ad.internal.i.c) r5
            r4.f6971g = r5
            java.lang.String r5 = com.beizi.ad.lance.a.b.b(r0)     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r5)     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            java.net.ServerSocket r2 = new java.net.ServerSocket     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            r3 = 0
            r2.<init>(r3, r1, r5)     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            r4.f6968d = r2     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            int r5 = r2.getLocalPort()     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            r4.f6969e = r5     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            r2 = 1
            r1.<init>(r2)     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            java.lang.Thread r2 = new java.lang.Thread     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            com.beizi.ad.internal.i.f$c r3 = new com.beizi.ad.internal.i.f$c     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            r3.<init>(r4, r1)     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            r2.<init>(r3)     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            r4.f6970f = r2     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            r2.start()     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            r1.await()     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            com.beizi.ad.internal.i.j r1 = new com.beizi.ad.internal.i.j     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            java.lang.String r0 = com.beizi.ad.lance.a.b.b(r0)     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            r1.<init>(r0, r5)     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            r4.f6972h = r1     // Catch: java.lang.InterruptedException -> L5d java.io.IOException -> L5f
            return
        L5d:
            r5 = move-exception
            goto L60
        L5f:
            r5 = move-exception
        L60:
            java.util.concurrent.ExecutorService r0 = r4.f6966b
            r0.shutdown()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Error starting local proxy server"
            r0.<init>(r1, r5)
            throw r0
    }

    /* synthetic */ f(com.beizi.ad.internal.i.c r1, com.beizi.ad.internal.i.f.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ void a(com.beizi.ad.internal.i.f r0) {
            r0.b()
            return
    }

    static /* synthetic */ void a(com.beizi.ad.internal.i.f r0, java.net.Socket r1) {
            r0.a(r1)
            return
    }

    private void a(java.io.File r2) {
            r1 = this;
            com.beizi.ad.internal.i.c r0 = r1.f6971g     // Catch: java.io.IOException -> L7
            com.beizi.ad.internal.i.a.a r0 = r0.f6958c     // Catch: java.io.IOException -> L7
            r0.a(r2)     // Catch: java.io.IOException -> L7
        L7:
            return
    }

    private void a(java.lang.Throwable r1) {
            r0 = this;
            return
    }

    private void a(java.net.Socket r4) {
            r3 = this;
            java.io.InputStream r0 = r4.getInputStream()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e com.beizi.ad.internal.i.m -> L20 java.net.SocketException -> L37
            com.beizi.ad.internal.i.d r0 = com.beizi.ad.internal.i.d.a(r0)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e com.beizi.ad.internal.i.m -> L20 java.net.SocketException -> L37
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e com.beizi.ad.internal.i.m -> L20 java.net.SocketException -> L37
            java.lang.String r1 = com.beizi.ad.internal.i.n.c(r1)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e com.beizi.ad.internal.i.m -> L20 java.net.SocketException -> L37
            com.beizi.ad.internal.i.j r2 = r3.f6972h     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e com.beizi.ad.internal.i.m -> L20 java.net.SocketException -> L37
            boolean r2 = r2.a(r1)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e com.beizi.ad.internal.i.m -> L20 java.net.SocketException -> L37
            if (r2 == 0) goto L22
            com.beizi.ad.internal.i.j r0 = r3.f6972h     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e com.beizi.ad.internal.i.m -> L20 java.net.SocketException -> L37
            r0.a(r4)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e com.beizi.ad.internal.i.m -> L20 java.net.SocketException -> L37
            goto L29
        L1c:
            r0 = move-exception
            goto L3b
        L1e:
            r0 = move-exception
            goto L2d
        L20:
            r0 = move-exception
            goto L2d
        L22:
            com.beizi.ad.internal.i.g r1 = r3.e(r1)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e com.beizi.ad.internal.i.m -> L20 java.net.SocketException -> L37
            r1.a(r0, r4)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e com.beizi.ad.internal.i.m -> L20 java.net.SocketException -> L37
        L29:
            r3.b(r4)
            return
        L2d:
            com.beizi.ad.internal.i.m r1 = new com.beizi.ad.internal.i.m     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "Error processing request"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L1c
            r3.a(r1)     // Catch: java.lang.Throwable -> L1c
        L37:
            r3.b(r4)
            goto L3f
        L3b:
            r3.b(r4)
            throw r0
        L3f:
            return
    }

    private boolean a() {
            r3 = this;
            com.beizi.ad.internal.i.j r0 = r3.f6972h
            r1 = 3
            r2 = 70
            boolean r0 = r0.a(r1, r2)
            return r0
    }

    private void b() {
            r3 = this;
        L0:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.io.IOException -> L1b
            boolean r0 = r0.isInterrupted()     // Catch: java.io.IOException -> L1b
            if (r0 != 0) goto L1d
            java.net.ServerSocket r0 = r3.f6968d     // Catch: java.io.IOException -> L1b
            java.net.Socket r0 = r0.accept()     // Catch: java.io.IOException -> L1b
            java.util.concurrent.ExecutorService r1 = r3.f6966b     // Catch: java.io.IOException -> L1b
            com.beizi.ad.internal.i.f$b r2 = new com.beizi.ad.internal.i.f$b     // Catch: java.io.IOException -> L1b
            r2.<init>(r3, r0)     // Catch: java.io.IOException -> L1b
            r1.submit(r2)     // Catch: java.io.IOException -> L1b
            goto L0
        L1b:
            r0 = move-exception
            goto L1e
        L1d:
            return
        L1e:
            com.beizi.ad.internal.i.m r1 = new com.beizi.ad.internal.i.m
            java.lang.String r2 = "Error during waiting connection"
            r1.<init>(r2, r0)
            r3.a(r1)
            return
    }

    private void b(java.net.Socket r1) {
            r0 = this;
            r0.c(r1)
            r0.d(r1)
            r0.e(r1)
            return
    }

    private java.lang.String c(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "aHR0cDovLyVzOiVkLyVz"
            java.lang.String r0 = com.beizi.ad.lance.a.b.b(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Le
            r7 = 0
            return r7
        Le:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "MTI3LjAuMC4x"
            java.lang.String r2 = com.beizi.ad.lance.a.b.b(r2)
            int r3 = r6.f6969e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r7 = com.beizi.ad.internal.i.n.b(r7)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r4[r2] = r3
            r2 = 2
            r4[r2] = r7
            java.lang.String r7 = java.lang.String.format(r1, r0, r4)
            return r7
    }

    private void c(java.net.Socket r3) {
            r2 = this;
            boolean r0 = r3.isInputShutdown()     // Catch: java.io.IOException -> La java.net.SocketException -> L15
            if (r0 != 0) goto L15
            r3.shutdownInput()     // Catch: java.io.IOException -> La java.net.SocketException -> L15
            return
        La:
            r3 = move-exception
            com.beizi.ad.internal.i.m r0 = new com.beizi.ad.internal.i.m
            java.lang.String r1 = "Error closing socket input stream"
            r0.<init>(r1, r3)
            r2.a(r0)
        L15:
            return
    }

    private java.io.File d(java.lang.String r3) {
            r2 = this;
            com.beizi.ad.internal.i.c r0 = r2.f6971g
            java.io.File r1 = r0.a
            com.beizi.ad.internal.i.a.c r0 = r0.f6957b
            java.lang.String r3 = r0.a(r3)
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r3)
            return r0
    }

    private void d(java.net.Socket r2) {
            r1 = this;
            boolean r0 = r2.isOutputShutdown()     // Catch: java.io.IOException -> L9
            if (r0 != 0) goto L9
            r2.shutdownOutput()     // Catch: java.io.IOException -> L9
        L9:
            return
    }

    private com.beizi.ad.internal.i.g e(java.lang.String r4) throws com.beizi.ad.internal.i.m {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.beizi.ad.internal.i.g> r1 = r3.f6967c     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L1a
            com.beizi.ad.internal.i.g r1 = (com.beizi.ad.internal.i.g) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            com.beizi.ad.internal.i.g r1 = new com.beizi.ad.internal.i.g     // Catch: java.lang.Throwable -> L1a
            com.beizi.ad.internal.i.c r2 = r3.f6971g     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L1a
            java.util.Map<java.lang.String, com.beizi.ad.internal.i.g> r2 = r3.f6967c     // Catch: java.lang.Throwable -> L1a
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r4 = move-exception
            goto L1e
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r1
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r4
    }

    private void e(java.net.Socket r3) {
            r2 = this;
            boolean r0 = r3.isClosed()     // Catch: java.io.IOException -> La
            if (r0 != 0) goto Lc
            r3.close()     // Catch: java.io.IOException -> La
            return
        La:
            r3 = move-exception
            goto Ld
        Lc:
            return
        Ld:
            com.beizi.ad.internal.i.m r0 = new com.beizi.ad.internal.i.m
            java.lang.String r1 = "Error closing socket"
            r0.<init>(r1, r3)
            r2.a(r0)
            return
    }

    public java.lang.String a(java.lang.String r2) {
            r1 = this;
            r0 = 1
            java.lang.String r2 = r1.a(r2, r0)
            return r2
    }

    public java.lang.String a(java.lang.String r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L18
            boolean r2 = r0.b(r1)
            if (r2 == 0) goto L18
            java.io.File r1 = r0.d(r1)
            r0.a(r1)
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            java.lang.String r1 = r1.toString()
            return r1
        L18:
            boolean r2 = r0.a()
            if (r2 == 0) goto L22
            java.lang.String r1 = r0.c(r1)
        L22:
            return r1
    }

    public boolean b(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "Url can't be null!"
            com.beizi.ad.internal.i.k.a(r2, r0)
            java.io.File r2 = r1.d(r2)
            boolean r2 = r2.exists()
            return r2
    }
}
