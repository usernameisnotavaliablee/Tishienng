package com.kwad.framework.filedownloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class j {
    static int alZ = 10;
    static int ama = 5;
    private final java.util.concurrent.Executor alV;
    private final java.util.concurrent.LinkedBlockingQueue<com.kwad.framework.filedownloader.t> alW;
    private final java.lang.Object alX;
    private final java.util.ArrayList<com.kwad.framework.filedownloader.t> alY;
    private final android.os.Handler handler;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        private static final com.kwad.framework.filedownloader.j amd = null;

        static {
                com.kwad.framework.filedownloader.j r0 = new com.kwad.framework.filedownloader.j
                r1 = 0
                r0.<init>(r1)
                com.kwad.framework.filedownloader.j.a.amd = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.framework.filedownloader.j xt() {
                com.kwad.framework.filedownloader.j r0 = com.kwad.framework.filedownloader.j.a.amd
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements android.os.Handler.Callback {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private static void a(java.util.ArrayList<com.kwad.framework.filedownloader.t> r2) {
                java.util.Iterator r0 = r2.iterator()
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                com.kwad.framework.filedownloader.t r1 = (com.kwad.framework.filedownloader.t) r1
                if (r1 == 0) goto L4
                r1.xv()
                goto L4
            L16:
                r2.clear()
                return
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                r1 = 1
                if (r0 != r1) goto Ld
                java.lang.Object r4 = r4.obj
                com.kwad.framework.filedownloader.t r4 = (com.kwad.framework.filedownloader.t) r4
                r4.xv()
                goto L1e
            Ld:
                r2 = 2
                if (r0 != r2) goto L1e
                java.lang.Object r4 = r4.obj
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                a(r4)
                com.kwad.framework.filedownloader.j r4 = com.kwad.framework.filedownloader.j.xr()
                com.kwad.framework.filedownloader.j.a(r4)
            L1e:
                return r1
        }
    }

    static {
            return
    }

    private j() {
            r4 = this;
            r4.<init>()
            r0 = 5
            java.lang.String r1 = "BlockCompleted"
            java.util.concurrent.ThreadPoolExecutor r0 = com.kwad.framework.filedownloader.f.b.r(r0, r1)
            r4.alV = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.alX = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.alY = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            com.kwad.framework.filedownloader.j$b r2 = new com.kwad.framework.filedownloader.j$b
            r3 = 0
            r2.<init>(r3)
            r0.<init>(r1, r2)
            r4.handler = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r4.alW = r0
            return
    }

    /* synthetic */ j(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(com.kwad.framework.filedownloader.j r0) {
            r0.push()
            return
    }

    private void a(com.kwad.framework.filedownloader.t r3, boolean r4) {
            r2 = this;
            boolean r4 = r3.xw()
            if (r4 == 0) goto La
            r3.xv()
            return
        La:
            boolean r4 = r3.xx()
            if (r4 == 0) goto L1b
            java.util.concurrent.Executor r4 = r2.alV
            com.kwad.framework.filedownloader.j$1 r0 = new com.kwad.framework.filedownloader.j$1
            r0.<init>(r2, r3)
            r4.execute(r0)
            return
        L1b:
            boolean r4 = xs()
            if (r4 != 0) goto L55
            java.util.concurrent.LinkedBlockingQueue<com.kwad.framework.filedownloader.t> r4 = r2.alW
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L55
            java.lang.Object r4 = r2.alX
            monitor-enter(r4)
            java.util.concurrent.LinkedBlockingQueue<com.kwad.framework.filedownloader.t> r0 = r2.alW     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L4c
            java.util.concurrent.LinkedBlockingQueue<com.kwad.framework.filedownloader.t> r0 = r2.alW     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4a
        L3a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4a
            com.kwad.framework.filedownloader.t r1 = (com.kwad.framework.filedownloader.t) r1     // Catch: java.lang.Throwable -> L4a
            r2.b(r1)     // Catch: java.lang.Throwable -> L4a
            goto L3a
        L4a:
            r3 = move-exception
            goto L53
        L4c:
            java.util.concurrent.LinkedBlockingQueue<com.kwad.framework.filedownloader.t> r0 = r2.alW     // Catch: java.lang.Throwable -> L4a
            r0.clear()     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4a
            goto L55
        L53:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4a
            throw r3
        L55:
            boolean r4 = xs()
            if (r4 != 0) goto L5f
            r2.b(r3)
            return
        L5f:
            r2.c(r3)
            return
    }

    private void b(com.kwad.framework.filedownloader.t r3) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            r1 = 1
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }

    private void c(com.kwad.framework.filedownloader.t r3) {
            r2 = this;
            java.lang.Object r0 = r2.alX
            monitor-enter(r0)
            java.util.concurrent.LinkedBlockingQueue<com.kwad.framework.filedownloader.t> r1 = r2.alW     // Catch: java.lang.Throwable -> Ld
            r1.offer(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            r2.push()
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    private void push() {
            r6 = this;
            java.lang.Object r0 = r6.alX
            monitor-enter(r0)
            java.util.ArrayList<com.kwad.framework.filedownloader.t> r1 = r6.alY     // Catch: java.lang.Throwable -> Ld
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            goto L56
        Lf:
            java.util.concurrent.LinkedBlockingQueue<com.kwad.framework.filedownloader.t> r1 = r6.alW     // Catch: java.lang.Throwable -> Ld
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L19:
            boolean r1 = xs()     // Catch: java.lang.Throwable -> Ld
            r2 = 0
            if (r1 != 0) goto L28
            java.util.concurrent.LinkedBlockingQueue<com.kwad.framework.filedownloader.t> r1 = r6.alW     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayList<com.kwad.framework.filedownloader.t> r3 = r6.alY     // Catch: java.lang.Throwable -> Ld
            r1.drainTo(r3)     // Catch: java.lang.Throwable -> Ld
            goto L47
        L28:
            int r1 = com.kwad.framework.filedownloader.j.alZ     // Catch: java.lang.Throwable -> Ld
            java.util.concurrent.LinkedBlockingQueue<com.kwad.framework.filedownloader.t> r3 = r6.alW     // Catch: java.lang.Throwable -> Ld
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Ld
            int r4 = com.kwad.framework.filedownloader.j.ama     // Catch: java.lang.Throwable -> Ld
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> Ld
        L36:
            if (r2 >= r3) goto L46
            java.util.ArrayList<com.kwad.framework.filedownloader.t> r4 = r6.alY     // Catch: java.lang.Throwable -> Ld
            java.util.concurrent.LinkedBlockingQueue<com.kwad.framework.filedownloader.t> r5 = r6.alW     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r5 = r5.remove()     // Catch: java.lang.Throwable -> Ld
            r4.add(r5)     // Catch: java.lang.Throwable -> Ld
            int r2 = r2 + 1
            goto L36
        L46:
            r2 = r1
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            android.os.Handler r0 = r6.handler
            r1 = 2
            java.util.ArrayList<com.kwad.framework.filedownloader.t> r3 = r6.alY
            android.os.Message r1 = r0.obtainMessage(r1, r3)
            long r2 = (long) r2
            r0.sendMessageDelayed(r1, r2)
            return
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public static com.kwad.framework.filedownloader.j xr() {
            com.kwad.framework.filedownloader.j r0 = com.kwad.framework.filedownloader.j.a.xt()
            return r0
    }

    private static boolean xs() {
            int r0 = com.kwad.framework.filedownloader.j.alZ
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    final void a(com.kwad.framework.filedownloader.t r2) {
            r1 = this;
            r0 = 0
            r1.a(r2, r0)
            return
    }
}
