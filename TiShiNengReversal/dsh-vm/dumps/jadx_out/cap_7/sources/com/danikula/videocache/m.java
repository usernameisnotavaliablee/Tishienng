package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class m {
    private static final org.slf4j.c d = null;
    private static final java.lang.String e = "ping";
    private static final java.lang.String f = "ping ok";
    private final java.util.concurrent.ExecutorService a;
    private final java.lang.String b;
    private final int c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements java.util.concurrent.Callable<java.lang.Boolean> {
        final /* synthetic */ com.danikula.videocache.m a;

        private b(com.danikula.videocache.m r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(com.danikula.videocache.m r1, com.danikula.videocache.m.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public java.lang.Boolean call() throws java.lang.Exception {
                r1 = this;
                com.danikula.videocache.m r0 = r1.a
                boolean r0 = com.danikula.videocache.m.a(r0)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Boolean call() throws java.lang.Exception {
                r1 = this;
                java.lang.Boolean r0 = r1.call()
                return r0
        }
    }

    static {
            java.lang.String r0 = "Pinger"
            org.slf4j.c r0 = org.slf4j.d.j(r0)
            com.danikula.videocache.m.d = r0
            return
    }

    m(java.lang.String r2, int r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r1.a = r0
            java.lang.Object r2 = com.danikula.videocache.n.d(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.b = r2
            r1.c = r3
            return
    }

    static /* synthetic */ boolean a(com.danikula.videocache.m r0) throws com.danikula.videocache.ProxyCacheException {
            boolean r0 = r0.f()
            return r0
    }

    private java.util.List<java.net.Proxy> b() {
            r3 = this;
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()     // Catch: java.net.URISyntaxException -> L12
            java.net.URI r1 = new java.net.URI     // Catch: java.net.URISyntaxException -> L12
            java.lang.String r2 = r3.c()     // Catch: java.net.URISyntaxException -> L12
            r1.<init>(r2)     // Catch: java.net.URISyntaxException -> L12
            java.util.List r0 = r0.select(r1)     // Catch: java.net.URISyntaxException -> L12
            return r0
        L12:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }

    private java.lang.String c() {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r5.b
            int r2 = r5.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            java.lang.String r1 = "ping"
            r2 = 2
            r3[r2] = r1
            java.lang.String r1 = "http://%s:%d/%s"
            java.lang.String r0 = java.lang.String.format(r0, r1, r3)
            return r0
    }

    private boolean f() throws com.danikula.videocache.ProxyCacheException {
            r6 = this;
            java.lang.String r0 = r6.c()
            com.danikula.videocache.k r1 = new com.danikula.videocache.k
            r1.<init>(r0)
            java.lang.String r0 = "ping ok"
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            r2 = 0
            r1.a(r2)     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            int r2 = r0.length     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            r1.read(r2)     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            boolean r0 = java.util.Arrays.equals(r0, r2)     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            org.slf4j.c r3 = com.danikula.videocache.m.d     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            r4.<init>()     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            java.lang.String r5 = "Ping response: `"
            r4.append(r5)     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            r4.append(r5)     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            java.lang.String r2 = "`, pinged? "
            r4.append(r2)     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            r4.append(r0)     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            r3.info(r2)     // Catch: java.lang.Throwable -> L45 com.danikula.videocache.ProxyCacheException -> L47
            r1.close()
            return r0
        L45:
            r0 = move-exception
            goto L54
        L47:
            r0 = move-exception
            org.slf4j.c r2 = com.danikula.videocache.m.d     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "Error reading ping response"
            r2.error(r3, r0)     // Catch: java.lang.Throwable -> L45
            r1.close()
            r0 = 0
            return r0
        L54:
            r1.close()
            throw r0
    }

    boolean d(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "ping"
            boolean r2 = r0.equals(r2)
            return r2
    }

    boolean e(int r8, int r9) {
            r7 = this;
            r0 = 0
            r1 = 1
            if (r8 < r1) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            com.danikula.videocache.n.b(r2)
            if (r9 <= 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            com.danikula.videocache.n.b(r2)
            r2 = 0
        L13:
            if (r2 >= r8) goto L64
            java.util.concurrent.ExecutorService r3 = r7.a     // Catch: java.util.concurrent.ExecutionException -> L31 java.lang.InterruptedException -> L33 java.util.concurrent.TimeoutException -> L3c
            com.danikula.videocache.m$b r4 = new com.danikula.videocache.m$b     // Catch: java.util.concurrent.ExecutionException -> L31 java.lang.InterruptedException -> L33 java.util.concurrent.TimeoutException -> L3c
            r5 = 0
            r4.<init>(r7, r5)     // Catch: java.util.concurrent.ExecutionException -> L31 java.lang.InterruptedException -> L33 java.util.concurrent.TimeoutException -> L3c
            java.util.concurrent.Future r3 = r3.submit(r4)     // Catch: java.util.concurrent.ExecutionException -> L31 java.lang.InterruptedException -> L33 java.util.concurrent.TimeoutException -> L3c
            long r4 = (long) r9     // Catch: java.util.concurrent.ExecutionException -> L31 java.lang.InterruptedException -> L33 java.util.concurrent.TimeoutException -> L3c
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.ExecutionException -> L31 java.lang.InterruptedException -> L33 java.util.concurrent.TimeoutException -> L3c
            java.lang.Object r3 = r3.get(r4, r6)     // Catch: java.util.concurrent.ExecutionException -> L31 java.lang.InterruptedException -> L33 java.util.concurrent.TimeoutException -> L3c
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.util.concurrent.ExecutionException -> L31 java.lang.InterruptedException -> L33 java.util.concurrent.TimeoutException -> L3c
            boolean r3 = r3.booleanValue()     // Catch: java.util.concurrent.ExecutionException -> L31 java.lang.InterruptedException -> L33 java.util.concurrent.TimeoutException -> L3c
            if (r3 == 0) goto L5f
            return r1
        L31:
            r3 = move-exception
            goto L34
        L33:
            r3 = move-exception
        L34:
            org.slf4j.c r4 = com.danikula.videocache.m.d
            java.lang.String r5 = "Error pinging server due to unexpected error"
            r4.error(r5, r3)
            goto L5f
        L3c:
            org.slf4j.c r3 = com.danikula.videocache.m.d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error pinging server (attempt: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ", timeout: "
            r4.append(r5)
            r4.append(r9)
            java.lang.String r5 = "). "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.warn(r4)
        L5f:
            int r2 = r2 + 1
            int r9 = r9 * 2
            goto L13
        L64:
            java.util.Locale r8 = java.util.Locale.US
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            int r9 = r9 / r3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.util.List r4 = r7.b()
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r0] = r2
            r5[r1] = r9
            r5[r3] = r4
            java.lang.String r9 = "Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, report at https://github.com/danikula/AndroidVideoCache/issues/134. Default proxies are: %s"
            java.lang.String r8 = java.lang.String.format(r8, r9, r5)
            org.slf4j.c r9 = com.danikula.videocache.m.d
            com.danikula.videocache.ProxyCacheException r1 = new com.danikula.videocache.ProxyCacheException
            r1.<init>(r8)
            r9.error(r8, r1)
            return r0
    }

    void g(java.net.Socket r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r2 = r2.getOutputStream()
            java.lang.String r0 = "HTTP/1.1 200 OK\n\n"
            byte[] r0 = r0.getBytes()
            r2.write(r0)
            java.lang.String r0 = "ping ok"
            byte[] r0 = r0.getBytes()
            r2.write(r0)
            return
    }
}
