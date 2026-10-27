package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class i {
    private static final org.slf4j.c i = null;
    private static final java.lang.String j = "127.0.0.1";
    private final java.lang.Object a;
    private final java.util.concurrent.ExecutorService b;
    private final java.util.Map<java.lang.String, com.danikula.videocache.j> c;
    private final java.net.ServerSocket d;
    private final int e;
    private final java.lang.Thread f;
    private final com.danikula.videocache.f g;
    private final com.danikula.videocache.m h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {
        private static final long e = 536870912;
        private java.io.File a;
        private com.danikula.videocache.file.c b;
        private com.danikula.videocache.file.a c;
        private com.danikula.videocache.sourcestorage.c d;

        public b(android.content.Context r3) {
                r2 = this;
                r2.<init>()
                com.danikula.videocache.sourcestorage.c r0 = com.danikula.videocache.sourcestorage.d.b(r3)
                r2.d = r0
                java.io.File r3 = com.danikula.videocache.t.c(r3)
                r2.a = r3
                com.danikula.videocache.file.h r3 = new com.danikula.videocache.file.h
                r0 = 536870912(0x20000000, double:2.65249474E-315)
                r3.<init>(r0)
                r2.c = r3
                com.danikula.videocache.file.f r3 = new com.danikula.videocache.file.f
                r3.<init>()
                r2.b = r3
                return
        }

        static /* synthetic */ com.danikula.videocache.f a(com.danikula.videocache.i.b r0) {
                com.danikula.videocache.f r0 = r0.c()
                return r0
        }

        private com.danikula.videocache.f c() {
                r5 = this;
                com.danikula.videocache.f r0 = new com.danikula.videocache.f
                java.io.File r1 = r5.a
                com.danikula.videocache.file.c r2 = r5.b
                com.danikula.videocache.file.a r3 = r5.c
                com.danikula.videocache.sourcestorage.c r4 = r5.d
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public com.danikula.videocache.i b() {
                r3 = this;
                com.danikula.videocache.f r0 = r3.c()
                com.danikula.videocache.i r1 = new com.danikula.videocache.i
                r2 = 0
                r1.<init>(r0, r2)
                return r1
        }

        public com.danikula.videocache.i.b d(java.io.File r1) {
                r0 = this;
                java.lang.Object r1 = com.danikula.videocache.n.d(r1)
                java.io.File r1 = (java.io.File) r1
                r0.a = r1
                return r0
        }

        public com.danikula.videocache.i.b e(com.danikula.videocache.file.a r1) {
                r0 = this;
                java.lang.Object r1 = com.danikula.videocache.n.d(r1)
                com.danikula.videocache.file.a r1 = (com.danikula.videocache.file.a) r1
                r0.c = r1
                return r0
        }

        public com.danikula.videocache.i.b f(com.danikula.videocache.file.c r1) {
                r0 = this;
                java.lang.Object r1 = com.danikula.videocache.n.d(r1)
                com.danikula.videocache.file.c r1 = (com.danikula.videocache.file.c) r1
                r0.b = r1
                return r0
        }

        public com.danikula.videocache.i.b g(int r2) {
                r1 = this;
                com.danikula.videocache.file.g r0 = new com.danikula.videocache.file.g
                r0.<init>(r2)
                r1.c = r0
                return r1
        }

        public com.danikula.videocache.i.b h(long r2) {
                r1 = this;
                com.danikula.videocache.file.h r0 = new com.danikula.videocache.file.h
                r0.<init>(r2)
                r1.c = r0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class c implements java.lang.Runnable {
        private final java.net.Socket a;
        final /* synthetic */ com.danikula.videocache.i b;

        public c(com.danikula.videocache.i r1, java.net.Socket r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.danikula.videocache.i r0 = r2.b
                java.net.Socket r1 = r2.a
                com.danikula.videocache.i.b(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class d implements java.lang.Runnable {
        private final java.util.concurrent.CountDownLatch a;
        final /* synthetic */ com.danikula.videocache.i b;

        public d(com.danikula.videocache.i r1, java.util.concurrent.CountDownLatch r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.a
                r0.countDown()
                com.danikula.videocache.i r0 = r1.b
                com.danikula.videocache.i.a(r0)
                return
        }
    }

    static {
            java.lang.String r0 = "HttpProxyCacheServer"
            org.slf4j.c r0 = org.slf4j.d.j(r0)
            com.danikula.videocache.i.i = r0
            return
    }

    public i(android.content.Context r2) {
            r1 = this;
            com.danikula.videocache.i$b r0 = new com.danikula.videocache.i$b
            r0.<init>(r2)
            com.danikula.videocache.f r2 = com.danikula.videocache.i.b.a(r0)
            r1.<init>(r2)
            return
    }

    private i(com.danikula.videocache.f r5) {
            r4 = this;
            java.lang.String r0 = "127.0.0.1"
            r4.<init>()
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r4.a = r1
            r1 = 8
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newFixedThreadPool(r1)
            r4.b = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r4.c = r2
            java.lang.Object r5 = com.danikula.videocache.n.d(r5)
            com.danikula.videocache.f r5 = (com.danikula.videocache.f) r5
            r4.g = r5
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r0)     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            java.net.ServerSocket r2 = new java.net.ServerSocket     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            r3 = 0
            r2.<init>(r3, r1, r5)     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            r4.d = r2     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            int r5 = r2.getLocalPort()     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            r4.e = r5     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            com.danikula.videocache.l.a(r0, r5)     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            r2 = 1
            r1.<init>(r2)     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            java.lang.Thread r2 = new java.lang.Thread     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            com.danikula.videocache.i$d r3 = new com.danikula.videocache.i$d     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            r3.<init>(r4, r1)     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            r2.<init>(r3)     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            r4.f = r2     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            r2.start()     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            r1.await()     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            com.danikula.videocache.m r1 = new com.danikula.videocache.m     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            r1.<init>(r0, r5)     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            r4.h = r1     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            org.slf4j.c r5 = com.danikula.videocache.i.i     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            r0.<init>()     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            java.lang.String r1 = "Proxy cache server started. Is it alive? "
            r0.append(r1)     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            boolean r1 = r4.l()     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            r0.append(r1)     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            java.lang.String r0 = r0.toString()     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            r5.info(r0)     // Catch: java.lang.InterruptedException -> L72 java.io.IOException -> L74
            return
        L72:
            r5 = move-exception
            goto L75
        L74:
            r5 = move-exception
        L75:
            java.util.concurrent.ExecutorService r0 = r4.b
            r0.shutdown()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Error starting local proxy server"
            r0.<init>(r1, r5)
            throw r0
    }

    /* synthetic */ i(com.danikula.videocache.f r1, com.danikula.videocache.i.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ void a(com.danikula.videocache.i r0) {
            r0.w()
            return
    }

    static /* synthetic */ void b(com.danikula.videocache.i r0, java.net.Socket r1) {
            r0.o(r1)
            return
    }

    private java.lang.String c(java.lang.String r6) {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.US
            int r1 = r5.e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r6 = com.danikula.videocache.p.f(r6)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "127.0.0.1"
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r1
            r1 = 2
            r2[r1] = r6
            java.lang.String r6 = "http://%s:%d/%s"
            java.lang.String r6 = java.lang.String.format(r0, r6, r2)
            return r6
    }

    private void d(java.net.Socket r3) {
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
            com.danikula.videocache.ProxyCacheException r0 = new com.danikula.videocache.ProxyCacheException
            java.lang.String r1 = "Error closing socket"
            r0.<init>(r1, r3)
            r2.n(r0)
            return
    }

    private void e(java.net.Socket r3) {
            r2 = this;
            boolean r0 = r3.isInputShutdown()     // Catch: java.io.IOException -> La java.net.SocketException -> L16
            if (r0 != 0) goto L1d
            r3.shutdownInput()     // Catch: java.io.IOException -> La java.net.SocketException -> L16
            return
        La:
            r3 = move-exception
            com.danikula.videocache.ProxyCacheException r0 = new com.danikula.videocache.ProxyCacheException
            java.lang.String r1 = "Error closing socket input stream"
            r0.<init>(r1, r3)
            r2.n(r0)
            goto L1d
        L16:
            org.slf4j.c r3 = com.danikula.videocache.i.i
            java.lang.String r0 = "Releasing input stream… Socket is closed by client."
            r3.debug(r0)
        L1d:
            return
    }

    private void f(java.net.Socket r3) {
            r2 = this;
            boolean r0 = r3.isOutputShutdown()     // Catch: java.io.IOException -> La
            if (r0 != 0) goto Lc
            r3.shutdownOutput()     // Catch: java.io.IOException -> La
            return
        La:
            r3 = move-exception
            goto Ld
        Lc:
            return
        Ld:
            org.slf4j.c r0 = com.danikula.videocache.i.i
            java.lang.String r1 = "Failed to close socket on proxy side: {}. It seems client have already closed connection."
            java.lang.String r3 = r3.getMessage()
            r0.warn(r1, r3)
            return
    }

    private java.io.File g(java.lang.String r3) {
            r2 = this;
            com.danikula.videocache.f r0 = r2.g
            java.io.File r1 = r0.a
            com.danikula.videocache.file.c r0 = r0.b
            java.lang.String r3 = r0.generate(r3)
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r3)
            return r0
    }

    private com.danikula.videocache.j h(java.lang.String r4) throws com.danikula.videocache.ProxyCacheException {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.danikula.videocache.j> r1 = r3.c     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L1a
            com.danikula.videocache.j r1 = (com.danikula.videocache.j) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            com.danikula.videocache.j r1 = new com.danikula.videocache.j     // Catch: java.lang.Throwable -> L1a
            com.danikula.videocache.f r2 = r3.g     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L1a
            java.util.Map<java.lang.String, com.danikula.videocache.j> r2 = r3.c     // Catch: java.lang.Throwable -> L1a
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

    private int i() {
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.danikula.videocache.j> r1 = r4.c     // Catch: java.lang.Throwable -> L20
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L20
            r2 = 0
        Le:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L22
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L20
            com.danikula.videocache.j r3 = (com.danikula.videocache.j) r3     // Catch: java.lang.Throwable -> L20
            int r3 = r3.b()     // Catch: java.lang.Throwable -> L20
            int r2 = r2 + r3
            goto Le
        L20:
            r1 = move-exception
            goto L24
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r2
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
    }

    private boolean l() {
            r3 = this;
            com.danikula.videocache.m r0 = r3.h
            r1 = 3
            r2 = 70
            boolean r0 = r0.e(r1, r2)
            return r0
    }

    private void n(java.lang.Throwable r3) {
            r2 = this;
            org.slf4j.c r0 = com.danikula.videocache.i.i
            java.lang.String r1 = "HttpProxyCacheServer error"
            r0.error(r1, r3)
            return
    }

    private void o(java.net.Socket r6) {
            r5 = this;
            java.lang.String r0 = "Opened connections: "
            java.io.InputStream r1 = r6.getInputStream()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            com.danikula.videocache.g r1 = com.danikula.videocache.g.c(r1)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            org.slf4j.c r2 = com.danikula.videocache.i.i     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            r3.<init>()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            java.lang.String r4 = "Request to cache proxy:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            r3.append(r1)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            r2.debug(r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            java.lang.String r3 = r1.a     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            java.lang.String r3 = com.danikula.videocache.p.e(r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            com.danikula.videocache.m r4 = r5.h     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            boolean r4 = r4.d(r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            if (r4 == 0) goto L3a
            com.danikula.videocache.m r1 = r5.h     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            r1.g(r6)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            goto L41
        L34:
            r1 = move-exception
            goto La2
        L36:
            r1 = move-exception
            goto L5b
        L38:
            r1 = move-exception
            goto L5b
        L3a:
            com.danikula.videocache.j r3 = r5.h(r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
            r3.d(r1, r6)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 com.danikula.videocache.ProxyCacheException -> L38 java.net.SocketException -> L81
        L41:
            r5.q(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            int r0 = r5.i()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r2.debug(r6)
            return
        L5b:
            com.danikula.videocache.ProxyCacheException r2 = new com.danikula.videocache.ProxyCacheException     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = "Error processing request"
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L34
            r5.n(r2)     // Catch: java.lang.Throwable -> L34
            r5.q(r6)
            org.slf4j.c r6 = com.danikula.videocache.i.i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            int r0 = r5.i()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.debug(r0)
            goto La1
        L81:
            org.slf4j.c r1 = com.danikula.videocache.i.i     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "Closing socket… Socket is closed by client."
            r1.debug(r2)     // Catch: java.lang.Throwable -> L34
            r5.q(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            int r0 = r5.i()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r1.debug(r6)
        La1:
            return
        La2:
            r5.q(r6)
            org.slf4j.c r6 = com.danikula.videocache.i.i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            int r0 = r5.i()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.debug(r0)
            throw r1
    }

    private void q(java.net.Socket r1) {
            r0 = this;
            r0.e(r1)
            r0.f(r1)
            r0.d(r1)
            return
    }

    private void s() {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.danikula.videocache.j> r1 = r3.c     // Catch: java.lang.Throwable -> L1d
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1d
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1d
            com.danikula.videocache.j r2 = (com.danikula.videocache.j) r2     // Catch: java.lang.Throwable -> L1d
            r2.f()     // Catch: java.lang.Throwable -> L1d
            goto Ld
        L1d:
            r1 = move-exception
            goto L26
        L1f:
            java.util.Map<java.lang.String, com.danikula.videocache.j> r1 = r3.c     // Catch: java.lang.Throwable -> L1d
            r1.clear()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    private void t(java.io.File r5) {
            r4 = this;
            com.danikula.videocache.f r0 = r4.g     // Catch: java.io.IOException -> L8
            com.danikula.videocache.file.a r0 = r0.c     // Catch: java.io.IOException -> L8
            r0.a(r5)     // Catch: java.io.IOException -> L8
            return
        L8:
            r0 = move-exception
            org.slf4j.c r1 = com.danikula.videocache.i.i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error touching file "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.error(r5, r0)
            return
    }

    private void w() {
            r4 = this;
        L0:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.io.IOException -> L31
            boolean r0 = r0.isInterrupted()     // Catch: java.io.IOException -> L31
            if (r0 != 0) goto L33
            java.net.ServerSocket r0 = r4.d     // Catch: java.io.IOException -> L31
            java.net.Socket r0 = r0.accept()     // Catch: java.io.IOException -> L31
            org.slf4j.c r1 = com.danikula.videocache.i.i     // Catch: java.io.IOException -> L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L31
            r2.<init>()     // Catch: java.io.IOException -> L31
            java.lang.String r3 = "Accept new socket "
            r2.append(r3)     // Catch: java.io.IOException -> L31
            r2.append(r0)     // Catch: java.io.IOException -> L31
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L31
            r1.debug(r2)     // Catch: java.io.IOException -> L31
            java.util.concurrent.ExecutorService r1 = r4.b     // Catch: java.io.IOException -> L31
            com.danikula.videocache.i$c r2 = new com.danikula.videocache.i$c     // Catch: java.io.IOException -> L31
            r2.<init>(r4, r0)     // Catch: java.io.IOException -> L31
            r1.submit(r2)     // Catch: java.io.IOException -> L31
            goto L0
        L31:
            r0 = move-exception
            goto L34
        L33:
            return
        L34:
            com.danikula.videocache.ProxyCacheException r1 = new com.danikula.videocache.ProxyCacheException
            java.lang.String r2 = "Error during waiting connection"
            r1.<init>(r2, r0)
            r4.n(r1)
            return
    }

    public java.lang.String j(java.lang.String r2) {
            r1 = this;
            r0 = 1
            java.lang.String r2 = r1.k(r2, r0)
            return r2
    }

    public java.lang.String k(java.lang.String r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L18
            boolean r2 = r0.m(r1)
            if (r2 == 0) goto L18
            java.io.File r1 = r0.g(r1)
            r0.t(r1)
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            java.lang.String r1 = r1.toString()
            return r1
        L18:
            boolean r2 = r0.l()
            if (r2 == 0) goto L22
            java.lang.String r1 = r0.c(r1)
        L22:
            return r1
    }

    public boolean m(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "Url can't be null!"
            com.danikula.videocache.n.e(r2, r0)
            java.io.File r2 = r1.g(r2)
            boolean r2 = r2.exists()
            return r2
    }

    public void p(com.danikula.videocache.e r3, java.lang.String r4) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r4
            com.danikula.videocache.n.a(r0)
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            com.danikula.videocache.j r4 = r2.h(r4)     // Catch: java.lang.Throwable -> L17 com.danikula.videocache.ProxyCacheException -> L19
            r4.e(r3)     // Catch: java.lang.Throwable -> L17 com.danikula.videocache.ProxyCacheException -> L19
            goto L21
        L17:
            r3 = move-exception
            goto L23
        L19:
            r3 = move-exception
            org.slf4j.c r4 = com.danikula.videocache.i.i     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "Error registering cache listener"
            r4.warn(r1, r3)     // Catch: java.lang.Throwable -> L17
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    public void r() {
            r3 = this;
            org.slf4j.c r0 = com.danikula.videocache.i.i
            java.lang.String r1 = "Shutdown proxy server"
            r0.info(r1)
            r3.s()
            com.danikula.videocache.f r0 = r3.g
            com.danikula.videocache.sourcestorage.c r0 = r0.d
            r0.release()
            java.lang.Thread r0 = r3.f
            r0.interrupt()
            java.net.ServerSocket r0 = r3.d     // Catch: java.io.IOException -> L24
            boolean r0 = r0.isClosed()     // Catch: java.io.IOException -> L24
            if (r0 != 0) goto L26
            java.net.ServerSocket r0 = r3.d     // Catch: java.io.IOException -> L24
            r0.close()     // Catch: java.io.IOException -> L24
            return
        L24:
            r0 = move-exception
            goto L27
        L26:
            return
        L27:
            com.danikula.videocache.ProxyCacheException r1 = new com.danikula.videocache.ProxyCacheException
            java.lang.String r2 = "Error shutting down proxy server"
            r1.<init>(r2, r0)
            r3.n(r1)
            return
    }

    public void u(com.danikula.videocache.e r4) {
            r3 = this;
            com.danikula.videocache.n.d(r4)
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.danikula.videocache.j> r1 = r3.c     // Catch: java.lang.Throwable -> L20
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L20
        L10:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L20
            com.danikula.videocache.j r2 = (com.danikula.videocache.j) r2     // Catch: java.lang.Throwable -> L20
            r2.h(r4)     // Catch: java.lang.Throwable -> L20
            goto L10
        L20:
            r4 = move-exception
            goto L24
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r4
    }

    public void v(com.danikula.videocache.e r3, java.lang.String r4) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r4
            com.danikula.videocache.n.a(r0)
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            com.danikula.videocache.j r4 = r2.h(r4)     // Catch: java.lang.Throwable -> L17 com.danikula.videocache.ProxyCacheException -> L19
            r4.h(r3)     // Catch: java.lang.Throwable -> L17 com.danikula.videocache.ProxyCacheException -> L19
            goto L21
        L17:
            r3 = move-exception
            goto L23
        L19:
            r3 = move-exception
            org.slf4j.c r4 = com.danikula.videocache.i.i     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "Error registering cache listener"
            r4.warn(r1, r3)     // Catch: java.lang.Throwable -> L17
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }
}
