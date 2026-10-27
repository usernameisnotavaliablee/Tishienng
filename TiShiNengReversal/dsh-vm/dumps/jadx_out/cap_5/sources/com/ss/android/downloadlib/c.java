package com.ss.android.downloadlib;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private static volatile com.ss.android.downloadlib.c f;
    private final android.os.Handler a;
    private final java.util.List<com.ss.android.downloadlib.addownload.a> b;
    private final java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> c;
    private final java.util.concurrent.CopyOnWriteArrayList<java.lang.Object> d;
    private long e;

    class a implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.j.j.cw.b a;
        final /* synthetic */ com.ss.android.j.j.cw.c b;
        final /* synthetic */ com.ss.android.j.j.cw.g c;
        final /* synthetic */ com.ss.android.downloadlib.c d;

        a(com.ss.android.downloadlib.c r1, com.ss.android.j.j.cw.b r2, com.ss.android.j.j.cw.c r3, com.ss.android.j.j.cw.g r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.ss.android.downloadlib.c r0 = r3.d
                java.util.concurrent.CopyOnWriteArrayList r0 = com.ss.android.downloadlib.c.e(r0)
                java.util.Iterator r0 = r0.iterator()
            La:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2a
                java.lang.Object r1 = r0.next()
                boolean r2 = r1 instanceof s2.a
                if (r2 != 0) goto La
                boolean r2 = r1 instanceof java.lang.ref.SoftReference
                if (r2 == 0) goto La
                java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1
                java.lang.Object r2 = r1.get()
                boolean r2 = r2 instanceof s2.a
                if (r2 == 0) goto La
                r1.get()
                goto La
            L2a:
                return
        }
    }

    class b implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw a;
        final /* synthetic */ com.ss.android.socialbase.downloader.up.j b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ com.ss.android.downloadlib.c d;

        b(com.ss.android.downloadlib.c r1, com.ss.android.socialbase.downloader.ae.cw r2, com.ss.android.socialbase.downloader.up.j r3, java.lang.String r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.ss.android.downloadlib.c r0 = r3.d
                java.util.concurrent.CopyOnWriteArrayList r0 = com.ss.android.downloadlib.c.e(r0)
                java.util.Iterator r0 = r0.iterator()
            La:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2a
                java.lang.Object r1 = r0.next()
                boolean r2 = r1 instanceof s2.a
                if (r2 != 0) goto La
                boolean r2 = r1 instanceof java.lang.ref.SoftReference
                if (r2 == 0) goto La
                java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1
                java.lang.Object r2 = r1.get()
                boolean r2 = r2 instanceof s2.a
                if (r2 == 0) goto La
                r1.get()
                goto La
            L2a:
                return
        }
    }

    /* renamed from: com.ss.android.downloadlib.c$c, reason: collision with other inner class name */
    class RunnableC0211c implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.ss.android.downloadlib.c c;

        RunnableC0211c(com.ss.android.downloadlib.c r1, com.ss.android.socialbase.downloader.ae.cw r2, java.lang.String r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.ss.android.downloadlib.c r0 = r3.c
                java.util.concurrent.CopyOnWriteArrayList r0 = com.ss.android.downloadlib.c.e(r0)
                java.util.Iterator r0 = r0.iterator()
            La:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2a
                java.lang.Object r1 = r0.next()
                boolean r2 = r1 instanceof s2.a
                if (r2 != 0) goto La
                boolean r2 = r1 instanceof java.lang.ref.SoftReference
                if (r2 == 0) goto La
                java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1
                java.lang.Object r2 = r1.get()
                boolean r2 = r2 instanceof s2.a
                if (r2 == 0) goto La
                r1.get()
                goto La
            L2a:
                return
        }
    }

    class d implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.ss.android.downloadlib.c c;

        d(com.ss.android.downloadlib.c r1, com.ss.android.socialbase.downloader.ae.cw r2, java.lang.String r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.ss.android.downloadlib.c r0 = r4.c
                java.util.concurrent.CopyOnWriteArrayList r0 = com.ss.android.downloadlib.c.e(r0)
                java.util.Iterator r0 = r0.iterator()
            La:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L3e
                java.lang.Object r1 = r0.next()
                boolean r2 = r1 instanceof s2.a
                if (r2 == 0) goto L22
                s2.a r1 = (s2.a) r1
                com.ss.android.socialbase.downloader.ae.cw r2 = r4.a
                java.lang.String r3 = r4.b
                r1.j(r2, r3)
                goto La
            L22:
                boolean r2 = r1 instanceof java.lang.ref.SoftReference
                if (r2 == 0) goto La
                java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1
                java.lang.Object r2 = r1.get()
                boolean r2 = r2 instanceof s2.a
                if (r2 == 0) goto La
                java.lang.Object r1 = r1.get()
                s2.a r1 = (s2.a) r1
                com.ss.android.socialbase.downloader.ae.cw r2 = r4.a
                java.lang.String r3 = r4.b
                r1.j(r2, r3)
                goto La
            L3e:
                return
        }
    }

    class e implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw a;
        final /* synthetic */ com.ss.android.downloadlib.c b;

        e(com.ss.android.downloadlib.c r1, com.ss.android.socialbase.downloader.ae.cw r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.ss.android.downloadlib.c r0 = r3.b
                java.util.concurrent.CopyOnWriteArrayList r0 = com.ss.android.downloadlib.c.e(r0)
                java.util.Iterator r0 = r0.iterator()
            La:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2a
                java.lang.Object r1 = r0.next()
                boolean r2 = r1 instanceof s2.a
                if (r2 != 0) goto La
                boolean r2 = r1 instanceof java.lang.ref.SoftReference
                if (r2 == 0) goto La
                java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1
                java.lang.Object r2 = r1.get()
                boolean r2 = r2 instanceof s2.a
                if (r2 == 0) goto La
                r1.get()
                goto La
            L2a:
                return
        }
    }

    static {
            return
    }

    private c() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.c = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.d = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.a = r0
            return
    }

    private void a() {
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.e
            long r2 = r0 - r2
            r4 = 300000(0x493e0, double:1.482197E-318)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L10
            goto L1d
        L10:
            r7.e = r0
            java.util.List<com.ss.android.downloadlib.addownload.a> r0 = r7.b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            r7.r()
        L1d:
            return
    }

    private void b(android.content.Context r2, int r3, com.ss.android.j.j.cw.e r4, com.ss.android.j.j.cw.b r5) {
            r1 = this;
            if (r5 != 0) goto L3
            return
        L3:
            com.ss.android.downloadlib.addownload.l r0 = new com.ss.android.downloadlib.addownload.l
            r0.<init>()
            com.ss.android.downloadlib.addownload.a r2 = r0.xt(r2)
            com.ss.android.downloadlib.addownload.a r2 = r2.f(r3, r4)
            com.ss.android.downloadlib.addownload.a r2 = r2.a(r5)
            r2.j()
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r2 = r1.c
            java.lang.String r3 = r5.j()
            r2.put(r3, r0)
            return
    }

    public static com.ss.android.downloadlib.c d() {
            com.ss.android.downloadlib.c r0 = com.ss.android.downloadlib.c.f
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.downloadlib.c> r0 = com.ss.android.downloadlib.c.class
            monitor-enter(r0)
            com.ss.android.downloadlib.c r1 = com.ss.android.downloadlib.c.f     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.downloadlib.c r1 = new com.ss.android.downloadlib.c     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.downloadlib.c.f = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.ss.android.downloadlib.c r0 = com.ss.android.downloadlib.c.f
            return r0
    }

    static /* synthetic */ java.util.concurrent.CopyOnWriteArrayList e(com.ss.android.downloadlib.c r0) {
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Object> r0 = r0.d
            return r0
    }

    private synchronized void g(android.content.Context r4, int r5, com.ss.android.j.j.cw.e r6, com.ss.android.j.j.cw.b r7, java.lang.String r8) {
            r3 = this;
            monitor-enter(r3)
            java.util.List<com.ss.android.downloadlib.addownload.a> r0 = r3.b     // Catch: java.lang.Throwable -> Lf
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lf
            if (r0 > 0) goto L13
            r3.u(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lf
            r4 = r3
            monitor-exit(r3)
            return
        Lf:
            r0 = move-exception
            r4 = r3
        L11:
            r5 = r0
            goto L49
        L13:
            r0 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            java.util.List<com.ss.android.downloadlib.addownload.a> r1 = r4.b     // Catch: java.lang.Throwable -> L47
            r2 = 0
            java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L47
            com.ss.android.downloadlib.addownload.a r1 = (com.ss.android.downloadlib.addownload.a) r1     // Catch: java.lang.Throwable -> L47
            com.ss.android.downloadlib.addownload.a r5 = r1.xt(r5)     // Catch: java.lang.Throwable -> L47
            com.ss.android.downloadlib.addownload.a r5 = r5.f(r6, r7)     // Catch: java.lang.Throwable -> L47
            com.ss.android.downloadlib.addownload.a r5 = r5.a(r8)     // Catch: java.lang.Throwable -> L47
            com.ss.android.downloadlib.addownload.a r5 = r5.j(r0)     // Catch: java.lang.Throwable -> L47
            r5.j()     // Catch: java.lang.Throwable -> L47
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r5 = r4.c     // Catch: java.lang.Throwable -> L47
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L47
            com.ss.android.downloadlib.addownload.g r5 = com.ss.android.downloadlib.addownload.g.b()     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = r8.j()     // Catch: java.lang.Throwable -> L47
            r5.e(r0, r6)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)
            return
        L47:
            r0 = move-exception
            goto L11
        L49:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L47
            throw r5
    }

    private void r() {
            r10 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List<com.ss.android.downloadlib.addownload.a> r3 = r10.b
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L35
            java.lang.Object r4 = r3.next()
            com.ss.android.downloadlib.addownload.a r4 = (com.ss.android.downloadlib.addownload.a) r4
            boolean r5 = r4.xt()
            if (r5 != 0) goto Lf
            long r5 = r4.r()
            long r5 = r0 - r5
            r7 = 300000(0x493e0, double:1.482197E-318)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto Lf
            r4.tl()
            r2.add(r4)
            goto Lf
        L35:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L40
            java.util.List<com.ss.android.downloadlib.addownload.a> r0 = r10.b
            r0.removeAll(r2)
        L40:
            return
    }

    private synchronized void t(android.content.Context r3, int r4, com.ss.android.j.j.cw.e r5, com.ss.android.j.j.cw.b r6) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.ss.android.downloadlib.addownload.a> r0 = r2.b     // Catch: java.lang.Throwable -> Le
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Le
            if (r0 > 0) goto L10
            r2.b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        Le:
            r3 = move-exception
            goto L33
        L10:
            java.util.List<com.ss.android.downloadlib.addownload.a> r0 = r2.b     // Catch: java.lang.Throwable -> Le
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> Le
            com.ss.android.downloadlib.addownload.a r0 = (com.ss.android.downloadlib.addownload.a) r0     // Catch: java.lang.Throwable -> Le
            com.ss.android.downloadlib.addownload.a r3 = r0.xt(r3)     // Catch: java.lang.Throwable -> Le
            com.ss.android.downloadlib.addownload.a r3 = r3.f(r4, r5)     // Catch: java.lang.Throwable -> Le
            com.ss.android.downloadlib.addownload.a r3 = r3.a(r6)     // Catch: java.lang.Throwable -> Le
            r3.j()     // Catch: java.lang.Throwable -> Le
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r3 = r2.c     // Catch: java.lang.Throwable -> Le
            java.lang.String r4 = r6.j()     // Catch: java.lang.Throwable -> Le
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        L33:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    private void u(android.content.Context r2, int r3, com.ss.android.j.j.cw.e r4, com.ss.android.j.j.cw.b r5, java.lang.String r6) {
            r1 = this;
            if (r5 != 0) goto L3
            return
        L3:
            com.ss.android.downloadlib.addownload.l r0 = new com.ss.android.downloadlib.addownload.l
            r0.<init>()
            com.ss.android.downloadlib.addownload.a r2 = r0.xt(r2)
            com.ss.android.downloadlib.addownload.a r2 = r2.f(r3, r4)
            com.ss.android.downloadlib.addownload.a r2 = r2.a(r5)
            com.ss.android.downloadlib.addownload.a r2 = r2.j(r6)
            r2.j()
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r2 = r1.c
            r2.put(r6, r0)
            com.ss.android.downloadlib.addownload.g r2 = com.ss.android.downloadlib.addownload.g.b()
            java.lang.String r3 = r5.j()
            r2.e(r6, r3)
            return
    }

    public com.ss.android.downloadlib.addownload.l c(java.lang.String r5) {
            r4 = this;
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r0 = r4.c
            r1 = 0
            if (r0 == 0) goto L40
            int r0 = r0.size()
            if (r0 == 0) goto L40
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L12
            goto L40
        L12:
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r2 = "filter_download_url_key"
            r3 = 0
            int r0 = r0.optInt(r2, r3)
            r2 = 1
            if (r0 != r2) goto L31
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r0 = r4.c
            com.ss.android.downloadlib.addownload.g r2 = com.ss.android.downloadlib.addownload.g.b()
            java.lang.String r5 = r2.d(r5)
            java.lang.Object r5 = r0.get(r5)
            com.ss.android.downloadlib.addownload.a r5 = (com.ss.android.downloadlib.addownload.a) r5
            goto L39
        L31:
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r0 = r4.c
            java.lang.Object r5 = r0.get(r5)
            com.ss.android.downloadlib.addownload.a r5 = (com.ss.android.downloadlib.addownload.a) r5
        L39:
            boolean r0 = r5 instanceof com.ss.android.downloadlib.addownload.l
            if (r0 == 0) goto L40
            com.ss.android.downloadlib.addownload.l r5 = (com.ss.android.downloadlib.addownload.l) r5
            return r5
        L40:
            return r1
    }

    public void f(android.content.Context r10, int r11, com.ss.android.j.j.cw.e r12, com.ss.android.j.j.cw.b r13) {
            r9 = this;
            if (r13 == 0) goto Lfd
            java.lang.String r0 = r13.j()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            goto Lfd
        Le:
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r1 = "filter_download_url_key"
            r2 = 0
            int r0 = r0.optInt(r1, r2)
            r1 = 1
            if (r0 != r1) goto L1d
            r2 = 1
        L1d:
            com.ss.android.downloadlib.addownload.g r0 = com.ss.android.downloadlib.addownload.g.b()
            java.lang.String r1 = r13.j()
            java.lang.String r8 = r0.d(r1)
            if (r2 == 0) goto L4e
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L4e
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r0 = r9.c
            java.lang.Object r0 = r0.get(r8)
            com.ss.android.downloadlib.addownload.a r0 = (com.ss.android.downloadlib.addownload.a) r0
            boolean r1 = r13 instanceof com.ss.android.xt.j.j.a
            if (r1 == 0) goto L5a
            r1 = r13
            com.ss.android.xt.j.j.a r1 = (com.ss.android.xt.j.j.a) r1
            java.lang.String r3 = r1.k()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L5a
            r1.u(r8)
            goto L5a
        L4e:
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r0 = r9.c
            java.lang.String r1 = r13.j()
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.downloadlib.addownload.a r0 = (com.ss.android.downloadlib.addownload.a) r0
        L5a:
            if (r0 == 0) goto L6c
            com.ss.android.downloadlib.addownload.a r10 = r0.xt(r10)
            com.ss.android.downloadlib.addownload.a r10 = r10.f(r11, r12)
            com.ss.android.downloadlib.addownload.a r10 = r10.a(r13)
            r10.j()
            return
        L6c:
            java.util.List<com.ss.android.downloadlib.addownload.a> r0 = r9.b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lbc
            if (r2 == 0) goto Lb4
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L85
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.g(r4, r5, r6, r7, r8)
            return
        L85:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            com.ss.android.downloadlib.addownload.g r10 = com.ss.android.downloadlib.addownload.g.b()
            java.lang.String r6 = r10.c(r5)
            boolean r10 = android.text.TextUtils.isEmpty(r6)
            if (r10 == 0) goto L9b
            r9.t(r2, r3, r4, r5)
            return
        L9b:
            r1 = r9
            r1.g(r2, r3, r4, r5, r6)
            boolean r10 = r5 instanceof com.ss.android.xt.j.j.a
            if (r10 == 0) goto Lfd
            r13 = r5
            com.ss.android.xt.j.j.a r13 = (com.ss.android.xt.j.j.a) r13
            java.lang.String r10 = r13.k()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto Lfd
            r13.u(r6)
            return
        Lb4:
            r4 = r10
            r3 = r11
            r6 = r12
            r5 = r13
            r9.t(r4, r3, r6, r5)
            return
        Lbc:
            r4 = r10
            r3 = r11
            r6 = r12
            r5 = r13
            if (r2 == 0) goto Lf8
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 != 0) goto Lcf
            r7 = r5
            r5 = r3
            r3 = r9
            r3.u(r4, r5, r6, r7, r8)
            return
        Lcf:
            r2 = r4
            r4 = r6
            com.ss.android.downloadlib.addownload.g r10 = com.ss.android.downloadlib.addownload.g.b()
            java.lang.String r6 = r10.c(r5)
            boolean r10 = android.text.TextUtils.isEmpty(r6)
            if (r10 != 0) goto Lfa
            r1 = r9
            r1.u(r2, r3, r4, r5, r6)
            boolean r10 = r5 instanceof com.ss.android.xt.j.j.a
            if (r10 == 0) goto Lfd
            r13 = r5
            com.ss.android.xt.j.j.a r13 = (com.ss.android.xt.j.j.a) r13
            java.lang.String r10 = r13.k()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto Lfd
            r13.u(r6)
            return
        Lf8:
            r2 = r4
            r4 = r6
        Lfa:
            r9.b(r2, r3, r4, r5)
        Lfd:
            return
    }

    public void h(com.ss.android.j.j.cw.b r3, @androidx.annotation.Nullable com.ss.android.j.j.cw.c r4, @androidx.annotation.Nullable com.ss.android.j.j.cw.g r5) {
            r2 = this;
            android.os.Handler r0 = r2.a
            com.ss.android.downloadlib.c$a r1 = new com.ss.android.downloadlib.c$a
            r1.<init>(r2, r3, r4, r5)
            r0.post(r1)
            return
    }

    public void i(com.ss.android.socialbase.downloader.ae.cw r3) {
            r2 = this;
            android.os.Handler r0 = r2.a
            com.ss.android.downloadlib.c$e r1 = new com.ss.android.downloadlib.c$e
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    public void j(com.ss.android.socialbase.downloader.ae.cw r3, com.ss.android.socialbase.downloader.up.j r4, java.lang.String r5) {
            r2 = this;
            android.os.Handler r0 = r2.a
            com.ss.android.downloadlib.c$b r1 = new com.ss.android.downloadlib.c$b
            r1.<init>(r2, r3, r4, r5)
            r0.post(r1)
            return
    }

    public void k(com.ss.android.socialbase.downloader.ae.cw r3, java.lang.String r4) {
            r2 = this;
            android.os.Handler r0 = r2.a
            com.ss.android.downloadlib.c$c r1 = new com.ss.android.downloadlib.c$c
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            return
    }

    public void l(java.lang.String r4, int r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            goto L61
        L7:
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r1 = "filter_download_url_key"
            r2 = 0
            int r0 = r0.optInt(r1, r2)
            r1 = 1
            if (r0 != r1) goto L16
            r2 = 1
        L16:
            com.ss.android.downloadlib.addownload.g r0 = com.ss.android.downloadlib.addownload.g.b()
            java.lang.String r0 = r0.d(r4)
            if (r2 == 0) goto L2f
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2f
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r1 = r3.c
            java.lang.Object r1 = r1.get(r0)
            com.ss.android.downloadlib.addownload.a r1 = (com.ss.android.downloadlib.addownload.a) r1
            goto L37
        L2f:
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r1 = r3.c
            java.lang.Object r1 = r1.get(r4)
            com.ss.android.downloadlib.addownload.a r1 = (com.ss.android.downloadlib.addownload.a) r1
        L37:
            if (r1 == 0) goto L61
            boolean r5 = r1.j(r5)
            if (r5 == 0) goto L5e
            java.util.List<com.ss.android.downloadlib.addownload.a> r5 = r3.b
            r5.add(r1)
            if (r2 == 0) goto L59
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L59
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r4 = r3.c
            r4.remove(r0)
            com.ss.android.downloadlib.addownload.g r4 = com.ss.android.downloadlib.addownload.g.b()
            r4.f(r0)
            goto L5e
        L59:
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r5 = r3.c
            r5.remove(r4)
        L5e:
            r3.a()
        L61:
            return
    }

    public void m(java.lang.String r10, long r11, int r13, com.ss.android.j.j.cw.g r14, com.ss.android.j.j.cw.c r15) {
            r9 = this;
            r7 = 0
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r0.n(r1, r2, r4, r5, r6, r7, r8)
            return
    }

    public void n(java.lang.String r4, long r5, int r7, com.ss.android.j.j.cw.g r8, com.ss.android.j.j.cw.c r9, v2.d r10, v2.h r11) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            goto L50
        L7:
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r1 = "filter_download_url_key"
            r2 = 0
            int r0 = r0.optInt(r1, r2)
            r1 = 1
            if (r0 != r1) goto L16
            r2 = 1
        L16:
            com.ss.android.downloadlib.addownload.g r0 = com.ss.android.downloadlib.addownload.g.b()
            java.lang.String r0 = r0.d(r4)
            if (r2 == 0) goto L2f
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2f
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r4 = r3.c
            java.lang.Object r4 = r4.get(r0)
            com.ss.android.downloadlib.addownload.a r4 = (com.ss.android.downloadlib.addownload.a) r4
            goto L37
        L2f:
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r0 = r3.c
            java.lang.Object r4 = r0.get(r4)
            com.ss.android.downloadlib.addownload.a r4 = (com.ss.android.downloadlib.addownload.a) r4
        L37:
            if (r4 == 0) goto L50
            com.ss.android.downloadlib.addownload.a r4 = r4.j(r5)
            com.ss.android.downloadlib.addownload.a r4 = r4.b(r8)
            com.ss.android.downloadlib.addownload.a r4 = r4.c(r9)
            com.ss.android.downloadlib.addownload.a r4 = r4.e(r10)
            com.ss.android.downloadlib.addownload.a r4 = r4.d(r11)
            r4.xt(r7)
        L50:
            return
    }

    public void o(java.lang.String r10, long r11, int r13, com.ss.android.j.j.cw.g r14, com.ss.android.j.j.cw.c r15, v2.h r16) {
            r9 = this;
            r7 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r8 = r16
            r0.n(r1, r2, r4, r5, r6, r7, r8)
            return
    }

    public void p(java.lang.String r4, boolean r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            goto L3c
        L7:
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r1 = "filter_download_url_key"
            r2 = 0
            int r0 = r0.optInt(r1, r2)
            r1 = 1
            if (r0 != r1) goto L16
            r2 = 1
        L16:
            com.ss.android.downloadlib.addownload.g r0 = com.ss.android.downloadlib.addownload.g.b()
            java.lang.String r0 = r0.d(r4)
            if (r2 == 0) goto L2f
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2f
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r4 = r3.c
            java.lang.Object r4 = r4.get(r0)
            com.ss.android.downloadlib.addownload.a r4 = (com.ss.android.downloadlib.addownload.a) r4
            goto L37
        L2f:
            java.util.Map<java.lang.String, com.ss.android.downloadlib.addownload.a> r0 = r3.c
            java.lang.Object r4 = r0.get(r4)
            com.ss.android.downloadlib.addownload.a r4 = (com.ss.android.downloadlib.addownload.a) r4
        L37:
            if (r4 == 0) goto L3c
            r4.j(r5)
        L3c:
            return
    }

    public void q(s2.a r4) {
            r3 = this;
            if (r4 == 0) goto L1f
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "fix_listener_oom"
            r2 = 0
            boolean r0 = r0.xt(r1, r2)
            if (r0 == 0) goto L1a
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Object> r0 = r3.d
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference
            r1.<init>(r4)
            r0.add(r1)
            return
        L1a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Object> r0 = r3.d
            r0.add(r4)
        L1f:
            return
    }

    public android.os.Handler s() {
            r1 = this;
            android.os.Handler r0 = r1.a
            return r0
    }

    public void v(com.ss.android.socialbase.downloader.ae.cw r3, java.lang.String r4) {
            r2 = this;
            android.os.Handler r0 = r2.a
            com.ss.android.downloadlib.c$d r1 = new com.ss.android.downloadlib.c$d
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            return
    }
}
