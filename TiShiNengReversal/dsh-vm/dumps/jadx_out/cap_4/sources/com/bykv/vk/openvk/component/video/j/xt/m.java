package com.bykv.vk.openvk.component.video.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m {

    /* renamed from: r, reason: collision with root package name */
    private static volatile com.bykv.vk.openvk.component.video.j.xt.m f1715r;
    private volatile com.bykv.vk.openvk.component.video.j.xt.j.xt ae;
    private final java.util.concurrent.atomic.AtomicInteger cw;
    private final com.bykv.vk.openvk.component.video.j.xt.ae.cw g;
    private volatile java.net.ServerSocket j;
    private final java.util.concurrent.atomic.AtomicBoolean jy;

    /* renamed from: m, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.component.video.j.xt.j.cw f1716m;
    private volatile com.bykv.vk.openvk.component.video.j.xt.cw oq;
    private volatile com.bykv.vk.openvk.component.video.j.xt.cw qv;
    private final android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.component.video.j.xt.ae>> tl;
    private volatile com.bykv.vk.openvk.component.video.j.xt.xt.cw up;
    private final java.lang.Runnable vl;
    private volatile int xt;



    private static final class j implements java.util.concurrent.Callable<java.lang.Boolean> {
        private final java.lang.String j;
        private final int xt;

        j(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public java.lang.Boolean call() {
                r5 = this;
                r0 = 0
                java.net.Socket r1 = new java.net.Socket     // Catch: java.lang.Throwable -> L47
                java.lang.String r2 = r5.j     // Catch: java.lang.Throwable -> L47
                int r3 = r5.xt     // Catch: java.lang.Throwable -> L47
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L47
                r0 = 2000(0x7d0, float:2.803E-42)
                r1.setSoTimeout(r0)     // Catch: java.lang.Throwable -> L41
                java.io.OutputStream r0 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L41
                java.lang.String r2 = "Ping\n"
                java.nio.charset.Charset r3 = com.bykv.vk.openvk.component.video.j.cw.j.j     // Catch: java.lang.Throwable -> L41
                byte[] r2 = r2.getBytes(r3)     // Catch: java.lang.Throwable -> L41
                r0.write(r2)     // Catch: java.lang.Throwable -> L41
                r0.flush()     // Catch: java.lang.Throwable -> L41
                java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L41
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L41
                java.io.InputStream r3 = r1.getInputStream()     // Catch: java.lang.Throwable -> L41
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L41
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L41
                java.lang.String r0 = r0.readLine()     // Catch: java.lang.Throwable -> L41
                java.lang.String r2 = "OK"
                boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L41
                if (r0 == 0) goto L43
                java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L41
                com.bykv.vk.openvk.component.video.j.cw.j.j(r1)
                return r0
            L41:
                r0 = move-exception
                goto L4b
            L43:
                com.bykv.vk.openvk.component.video.j.cw.j.j(r1)
                goto L5c
            L47:
                r1 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
            L4b:
                java.lang.String r2 = "ProxyServer"
                java.lang.String r3 = "call: "
                com.bykv.vk.openvk.component.video.api.m.cw.j(r2, r3, r0)     // Catch: java.lang.Throwable -> L5f
                java.lang.String r2 = "ping error"
                java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch: java.lang.Throwable -> L5f
                com.bykv.vk.openvk.component.video.j.xt.m.j(r2, r0)     // Catch: java.lang.Throwable -> L5f
                goto L43
            L5c:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            L5f:
                r0 = move-exception
                com.bykv.vk.openvk.component.video.j.cw.j.j(r1)
                throw r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Boolean call() throws java.lang.Exception {
                r1 = this;
                java.lang.Boolean r0 = r1.call()
                return r0
        }
    }

    private m() {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r3.cw = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r2 = 2
            r0.<init>(r2)
            r3.tl = r0
            com.bykv.vk.openvk.component.video.j.xt.m$1 r2 = new com.bykv.vk.openvk.component.video.j.xt.m$1
            r2.<init>(r3)
            r3.g = r2
            com.bykv.vk.openvk.component.video.j.xt.m$2 r2 = new com.bykv.vk.openvk.component.video.j.xt.m$2
            r2.<init>(r3)
            r3.vl = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>()
            r3.jy = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r0.put(r1, r2)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2 = 1
            r0.put(r2, r1)
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicInteger ae(com.bykv.vk.openvk.component.video.j.xt.m r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.cw
            return r0
    }

    private boolean ae() {
            r4 = this;
            com.bykv.vk.openvk.component.video.j.xt.m$j r0 = new com.bykv.vk.openvk.component.video.j.xt.m$j
            java.lang.String r1 = r4.g()
            int r2 = r4.xt
            r0.<init>(r1, r2)
            com.bytedance.sdk.component.oq.tl r1 = new com.bytedance.sdk.component.oq.tl
            r2 = 5
            r3 = 1
            r1.<init>(r0, r2, r3)
            java.util.concurrent.ExecutorService r0 = com.bytedance.sdk.component.oq.ae.j()
            r0.submit(r1)
            r4.tl()
            r0 = 0
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L34
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "ProxyServer"
            if (r1 != 0) goto L36
            java.lang.String r1 = "Ping error"
            com.bytedance.sdk.component.utils.vl.r(r2, r1)     // Catch: java.lang.Throwable -> L34
            r4.up()     // Catch: java.lang.Throwable -> L34
            return r0
        L34:
            r1 = move-exception
            goto L45
        L36:
            java.lang.String r1 = "pingTest: "
            com.bykv.vk.openvk.component.video.api.m.cw.j(r2, r1)     // Catch: java.lang.Throwable -> L34
            boolean r1 = com.bykv.vk.openvk.component.video.j.xt.up.cw     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L44
            java.lang.String r1 = "Ping OK!"
            com.bykv.vk.openvk.component.video.api.m.cw.j(r2, r1)     // Catch: java.lang.Throwable -> L34
        L44:
            return r3
        L45:
            com.bytedance.sdk.component.utils.vl.j(r1)
            android.util.Log.getStackTraceString(r1)
            r4.up()
            return r0
    }

    static /* synthetic */ void cw(com.bykv.vk.openvk.component.video.j.xt.m r0) {
            r0.up()
            return
    }

    static /* synthetic */ com.bykv.vk.openvk.component.video.j.xt.ae.cw g(com.bykv.vk.openvk.component.video.j.xt.m r0) {
            com.bykv.vk.openvk.component.video.j.xt.ae$cw r0 = r0.g
            return r0
    }

    private java.lang.String g() {
            r3 = this;
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "MTI3LjAuMC4x"
            byte[] r1 = r1.getBytes()
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r1, r2)
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ int j(com.bykv.vk.openvk.component.video.j.xt.m r0, int r1) {
            r0.xt = r1
            return r1
    }

    static /* synthetic */ android.util.SparseArray j(com.bykv.vk.openvk.component.video.j.xt.m r0) {
            android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.component.video.j.xt.ae>> r0 = r0.tl
            return r0
    }

    public static com.bykv.vk.openvk.component.video.j.xt.m j() {
            com.bykv.vk.openvk.component.video.j.xt.m r0 = com.bykv.vk.openvk.component.video.j.xt.m.f1715r
            if (r0 != 0) goto L19
            java.lang.Class<com.bykv.vk.openvk.component.video.j.xt.m> r0 = com.bykv.vk.openvk.component.video.j.xt.m.class
            monitor-enter(r0)
            com.bykv.vk.openvk.component.video.j.xt.m r1 = com.bykv.vk.openvk.component.video.j.xt.m.f1715r     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bykv.vk.openvk.component.video.j.xt.m r1 = new com.bykv.vk.openvk.component.video.j.xt.m     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bykv.vk.openvk.component.video.j.xt.m.f1715r = r1     // Catch: java.lang.Throwable -> L13
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
            com.bykv.vk.openvk.component.video.j.xt.m r0 = com.bykv.vk.openvk.component.video.j.xt.m.f1715r
            return r0
    }

    static /* synthetic */ java.net.ServerSocket j(com.bykv.vk.openvk.component.video.j.xt.m r0, java.net.ServerSocket r1) {
            r0.j = r1
            return r1
    }

    static /* synthetic */ void j(java.lang.String r0, java.lang.String r1) {
            return
    }

    private void m() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.component.video.j.xt.ae>> r1 = r6.tl
            monitor-enter(r1)
            android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.component.video.j.xt.ae>> r2 = r6.tl     // Catch: java.lang.Throwable -> L26
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L26
            r3 = 0
        Lf:
            if (r3 >= r2) goto L2b
            android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.component.video.j.xt.ae>> r4 = r6.tl     // Catch: java.lang.Throwable -> L26
            int r5 = r4.keyAt(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L26
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L28
            r0.addAll(r4)     // Catch: java.lang.Throwable -> L26
            r4.clear()     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r0 = move-exception
            goto L41
        L28:
            int r3 = r3 + 1
            goto Lf
        L2b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            com.bykv.vk.openvk.component.video.j.xt.ae r1 = (com.bykv.vk.openvk.component.video.j.xt.ae) r1
            r1.j()
            goto L30
        L40:
            return
        L41:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            throw r0
    }

    static /* synthetic */ boolean m(com.bykv.vk.openvk.component.video.j.xt.m r0) {
            boolean r0 = r0.ae()
            return r0
    }

    static /* synthetic */ java.net.ServerSocket r(com.bykv.vk.openvk.component.video.j.xt.m r0) {
            java.net.ServerSocket r0 = r0.j
            return r0
    }

    static /* synthetic */ com.bykv.vk.openvk.component.video.j.xt.xt.cw tl(com.bykv.vk.openvk.component.video.j.xt.m r0) {
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r0 = r0.up
            return r0
    }

    private void tl() {
            r4 = this;
            r0 = 0
            java.net.ServerSocket r1 = r4.j     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.net.Socket r0 = r1.accept()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r1 = 2000(0x7d0, float:2.803E-42)
            r0.setSoTimeout(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.lang.String r2 = "Ping"
            java.lang.String r1 = r1.readLine()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            if (r1 == 0) goto L3d
            java.io.OutputStream r1 = r0.getOutputStream()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.lang.String r2 = "OK\n"
            java.nio.charset.Charset r3 = com.bykv.vk.openvk.component.video.j.cw.j.j     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            byte[] r2 = r2.getBytes(r3)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r1.write(r2)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r1.flush()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            goto L3d
        L39:
            r1 = move-exception
            goto L50
        L3b:
            r1 = move-exception
            goto L41
        L3d:
            com.bykv.vk.openvk.component.video.j.cw.j.j(r0)
            goto L48
        L41:
            com.bytedance.sdk.component.utils.vl.j(r1)     // Catch: java.lang.Throwable -> L39
            android.util.Log.getStackTraceString(r1)     // Catch: java.lang.Throwable -> L39
            goto L3d
        L48:
            java.lang.String r0 = "ProxyServer"
            java.lang.String r1 = "answerPing: "
            com.bykv.vk.openvk.component.video.api.m.cw.j(r0, r1)
            return
        L50:
            com.bykv.vk.openvk.component.video.j.cw.j.j(r0)
            throw r1
    }

    static /* synthetic */ int up(com.bykv.vk.openvk.component.video.j.xt.m r0) {
            int r0 = r0.xt
            return r0
    }

    private void up() {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r3.cw
            r1 = 1
            r2 = 2
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L15
            java.util.concurrent.atomic.AtomicInteger r0 = r3.cw
            r1 = 0
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L14
            goto L15
        L14:
            return
        L15:
            java.net.ServerSocket r0 = r3.j
            com.bykv.vk.openvk.component.video.j.cw.j.j(r0)
            r3.m()
            return
    }

    static /* synthetic */ java.lang.String xt(com.bykv.vk.openvk.component.video.j.xt.m r0) {
            java.lang.String r0 = r0.g()
            return r0
    }

    com.bykv.vk.openvk.component.video.j.xt.cw cw() {
            r1 = this;
            com.bykv.vk.openvk.component.video.j.xt.cw r0 = r1.qv
            return r0
    }

    public java.lang.String j(boolean r4, boolean r5, java.lang.String r6, java.lang.String... r7) {
            r3 = this;
            if (r7 == 0) goto L9a
            int r0 = r7.length
            if (r0 != 0) goto L7
            goto L9a
        L7:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L11
            r4 = r7[r1]
            return r4
        L11:
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r0 = r3.up
            if (r0 != 0) goto L18
            r4 = r7[r1]
            return r4
        L18:
            if (r4 == 0) goto L1d
            com.bykv.vk.openvk.component.video.j.xt.j.xt r0 = r3.ae
            goto L1f
        L1d:
            com.bykv.vk.openvk.component.video.j.xt.j.cw r0 = r3.f1716m
        L1f:
            if (r0 != 0) goto L24
            r4 = r7[r1]
            return r4
        L24:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.cw
            int r0 = r0.get()
            r2 = 1
            if (r0 == r2) goto L30
            r4 = r7[r1]
            return r4
        L30:
            java.util.List r0 = com.bykv.vk.openvk.component.video.j.cw.j.j(r7)
            if (r0 != 0) goto L39
            r4 = r7[r1]
            return r4
        L39:
            if (r5 == 0) goto L3d
            r5 = r6
            goto L41
        L3d:
            java.lang.String r5 = com.bykv.vk.openvk.component.video.api.m.xt.j(r6)
        L41:
            java.lang.String r5 = com.bykv.vk.openvk.component.video.j.xt.g.j(r6, r5, r0)
            if (r5 != 0) goto L4a
            r4 = r7[r1]
            return r4
        L4a:
            java.lang.String r6 = ":"
            java.lang.String r7 = "https://"
            if (r4 == 0) goto L71
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r7)
            java.lang.String r7 = r3.g()
            r4.append(r7)
            r4.append(r6)
            int r6 = r3.xt
            r4.append(r6)
            java.lang.String r6 = "?f=1&"
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L91
        L71:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r7)
            java.lang.String r7 = r3.g()
            r4.append(r7)
            r4.append(r6)
            int r6 = r3.xt
            r4.append(r6)
            java.lang.String r6 = "?"
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L91:
            java.lang.String r5 = "s"
            java.lang.String r6 = ""
            java.lang.String r4 = r4.replaceFirst(r5, r6)
            return r4
        L9a:
            r4 = 0
            return r4
    }

    void j(com.bykv.vk.openvk.component.video.j.xt.j.cw r1) {
            r0 = this;
            r0.f1716m = r1
            return
    }

    void j(com.bykv.vk.openvk.component.video.j.xt.xt.cw r1) {
            r0 = this;
            r0.up = r1
            return
    }

    boolean j(int r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.component.video.j.xt.ae>> r1 = r3.tl
            monitor-enter(r1)
            android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.component.video.j.xt.ae>> r2 = r3.tl     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Throwable -> L2e
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L30
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2e
        L15:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L30
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L2e
            com.bykv.vk.openvk.component.video.j.xt.ae r2 = (com.bykv.vk.openvk.component.video.j.xt.ae) r2     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L15
            java.lang.String r2 = r2.tl     // Catch: java.lang.Throwable -> L2e
            boolean r2 = r5.equals(r2)     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L15
            r4 = 1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            return r4
        L2e:
            r4 = move-exception
            goto L32
        L30:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            return r0
        L32:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            throw r4
    }

    public void r() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.jy
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L1b
            com.bytedance.sdk.component.oq.r.cw r0 = new com.bytedance.sdk.component.oq.r.cw
            java.lang.Runnable r1 = r3.vl
            java.lang.String r2 = "r/ProxyServer"
            r0.<init>(r1, r2)
            java.lang.String r1 = "csj_proxy_server"
            r0.setName(r1)
            r0.start()
        L1b:
            return
    }

    com.bykv.vk.openvk.component.video.j.xt.cw xt() {
            r1 = this;
            com.bykv.vk.openvk.component.video.j.xt.cw r0 = r1.oq
            return r0
    }
}
