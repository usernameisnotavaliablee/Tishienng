package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class wi {
    static final java.lang.String j = null;
    private static java.lang.String oq;
    private static long qv;

    /* renamed from: r, reason: collision with root package name */
    private static final java.util.List<com.bytedance.embedapplog.up> f2117r = null;
    private static boolean vl;
    private static final java.lang.String xt = null;
    private final com.bytedance.embedapplog.gr ae;
    private final java.util.concurrent.locks.ReentrantLock cw;
    private final java.util.concurrent.atomic.AtomicBoolean g;
    private java.util.Map<java.lang.String, java.lang.String> jy;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f2118m;
    private final android.content.Context tl;
    private final com.bytedance.embedapplog.tk up;
    private java.lang.Long ws;


    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<com.bytedance.embedapplog.wi> r1 = com.bytedance.embedapplog.wi.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.embedapplog.wi.xt = r0
            com.bytedance.embedapplog.wi.j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bytedance.embedapplog.wi.f2117r = r0
            return
    }

    wi(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.cw = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.g = r0
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r2.tl = r0
            com.bytedance.embedapplog.tk r0 = com.bytedance.embedapplog.fx.j(r3)
            r2.up = r0
            if (r0 == 0) goto L2b
            boolean r0 = r0.j(r3)
            r2.f2118m = r0
            goto L2d
        L2b:
            r2.f2118m = r1
        L2d:
            com.bytedance.embedapplog.gr r0 = new com.bytedance.embedapplog.gr
            r0.<init>(r3)
            r2.ae = r0
            return
    }

    private static java.lang.Object[] cw() {
            java.util.List<com.bytedance.embedapplog.up> r0 = com.bytedance.embedapplog.wi.f2117r
            monitor-enter(r0)
            int r1 = r0.size()     // Catch: java.lang.Throwable -> Le
            if (r1 <= 0) goto L10
            java.lang.Object[] r1 = r0.toArray()     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            goto L13
        L10:
            r1 = 0
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.WorkerThread
    private android.util.Pair<java.lang.String, java.lang.Boolean> j(android.content.Context r5) {
            r4 = this;
            com.bytedance.embedapplog.tk r0 = r4.up
            if (r0 == 0) goto L21
            com.bytedance.embedapplog.tk$j r5 = r0.xt(r5)
            if (r5 == 0) goto L21
            java.lang.String r0 = r5.xt
            boolean r1 = r5.cw
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r2 = r5 instanceof com.bytedance.embedapplog.ll.j
            if (r2 == 0) goto L23
            com.bytedance.embedapplog.ll$j r5 = (com.bytedance.embedapplog.ll.j) r5
            long r2 = r5.j
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            r4.ws = r5
            goto L23
        L21:
            r0 = 0
            r1 = r0
        L23:
            android.util.Pair r5 = new android.util.Pair
            r5.<init>(r0, r1)
            return r5
    }

    private static void j(@androidx.annotation.Nullable com.bytedance.embedapplog.up.j r3, java.lang.Object[] r4) {
            if (r3 == 0) goto L12
            if (r4 == 0) goto L12
            int r0 = r4.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L12
            r2 = r4[r1]
            com.bytedance.embedapplog.up r2 = (com.bytedance.embedapplog.up) r2
            r2.j(r3)
            int r1 = r1 + 1
            goto L6
        L12:
            return
    }

    @androidx.annotation.AnyThread
    static void j(@androidx.annotation.Nullable com.bytedance.embedapplog.up r5) {
            java.util.List<com.bytedance.embedapplog.up> r0 = com.bytedance.embedapplog.wi.f2117r
            monitor-enter(r0)
            r0.add(r5)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = com.bytedance.embedapplog.wi.oq
            if (r0 == 0) goto L1d
            com.bytedance.embedapplog.up$j r1 = new com.bytedance.embedapplog.up$j
            boolean r2 = com.bytedance.embedapplog.wi.vl
            long r3 = com.bytedance.embedapplog.wi.qv
            r1.<init>(r0, r2, r3)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r5
            j(r1, r0)
        L1d:
            return
        L1e:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r5
    }

    static /* synthetic */ void j(com.bytedance.embedapplog.wi r0) {
            r0.r()
            return
    }

    private static void j(java.lang.Runnable r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.bytedance.embedapplog.wi.j
            r0.append(r1)
            java.lang.String r1 = "-query"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.embedapplog.qo.j(r0, r2)
            return
    }

    static <K, V> void j(java.util.Map<K, V> r0, K r1, V r2) {
            if (r1 == 0) goto L7
            if (r2 == 0) goto L7
            r0.put(r1, r2)
        L7:
            return
    }

    static void j(org.json.JSONObject r1, java.lang.String r2, java.lang.Object r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L10
            if (r3 == 0) goto L10
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Lc
            return
        Lc:
            r1 = move-exception
            com.bytedance.embedapplog.uc.j(r1)
        L10:
            return
    }

    private void r() {
            r14 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r14.cw     // Catch: java.lang.Throwable -> L21
            r0.lock()     // Catch: java.lang.Throwable -> L21
            com.bytedance.embedapplog.gr r0 = r14.ae     // Catch: java.lang.Throwable -> L21
            com.bytedance.embedapplog.na r0 = r0.j()     // Catch: java.lang.Throwable -> L21
            r1 = -1
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L39
            java.lang.String r5 = r0.j     // Catch: java.lang.Throwable -> L21
            com.bytedance.embedapplog.wi.oq = r5     // Catch: java.lang.Throwable -> L21
            java.lang.Boolean r5 = r0.cw     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L24
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L24
            r5 = 1
            goto L25
        L21:
            r0 = move-exception
            goto Ld1
        L24:
            r5 = 0
        L25:
            com.bytedance.embedapplog.wi.vl = r5     // Catch: java.lang.Throwable -> L21
            java.lang.Long r5 = r0.ae     // Catch: java.lang.Throwable -> L21
            if (r5 != 0) goto L2d
            r5 = r1
            goto L31
        L2d:
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> L21
        L31:
            com.bytedance.embedapplog.wi.qv = r5     // Catch: java.lang.Throwable -> L21
            java.util.Map r5 = r0.j()     // Catch: java.lang.Throwable -> L21
            r14.jy = r5     // Catch: java.lang.Throwable -> L21
        L39:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L21
            android.content.Context r7 = r14.tl     // Catch: java.lang.Throwable -> L21
            android.util.Pair r7 = r14.j(r7)     // Catch: java.lang.Throwable -> L21
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L21
            long r8 = r8 - r5
            java.lang.Object r5 = r7.first     // Catch: java.lang.Throwable -> L21
            r6 = 0
            if (r5 == 0) goto L95
            if (r0 == 0) goto L59
            java.lang.String r6 = r0.xt     // Catch: java.lang.Throwable -> L21
            java.lang.Integer r0 = r0.f2087m     // Catch: java.lang.Throwable -> L21
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L21
            int r0 = r0 + r4
            goto L5a
        L59:
            r0 = -1
        L5a:
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L68
            java.util.UUID r5 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = r5.toString()     // Catch: java.lang.Throwable -> L21
        L68:
            if (r0 > 0) goto L6b
            r0 = 1
        L6b:
            com.bytedance.embedapplog.na r5 = new com.bytedance.embedapplog.na     // Catch: java.lang.Throwable -> L21
            java.lang.Object r10 = r7.first     // Catch: java.lang.Throwable -> L21
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L21
            java.lang.Object r7 = r7.second     // Catch: java.lang.Throwable -> L21
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L21
            java.lang.Long r9 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L21
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L21
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L21
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.Long r12 = r14.ws     // Catch: java.lang.Throwable -> L21
            r13 = r7
            r7 = r6
            r6 = r10
            r10 = r8
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L21
            com.bytedance.embedapplog.gr r0 = r14.ae     // Catch: java.lang.Throwable -> L21
            r0.j(r5)     // Catch: java.lang.Throwable -> L21
            r6 = r5
        L95:
            if (r6 == 0) goto Lb9
            java.lang.String r0 = r6.j     // Catch: java.lang.Throwable -> L21
            com.bytedance.embedapplog.wi.oq = r0     // Catch: java.lang.Throwable -> L21
            java.lang.Boolean r0 = r6.cw     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto La6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto La6
            r3 = 1
        La6:
            com.bytedance.embedapplog.wi.vl = r3     // Catch: java.lang.Throwable -> L21
            java.lang.Long r0 = r6.ae     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto Lad
            goto Lb1
        Lad:
            long r1 = r0.longValue()     // Catch: java.lang.Throwable -> L21
        Lb1:
            com.bytedance.embedapplog.wi.qv = r1     // Catch: java.lang.Throwable -> L21
            java.util.Map r0 = r6.j()     // Catch: java.lang.Throwable -> L21
            r14.jy = r0     // Catch: java.lang.Throwable -> L21
        Lb9:
            java.util.concurrent.locks.ReentrantLock r0 = r14.cw
            r0.unlock()
            com.bytedance.embedapplog.up$j r0 = new com.bytedance.embedapplog.up$j
            java.lang.String r1 = com.bytedance.embedapplog.wi.oq
            boolean r2 = com.bytedance.embedapplog.wi.vl
            long r3 = com.bytedance.embedapplog.wi.qv
            r0.<init>(r1, r2, r3)
            java.lang.Object[] r1 = cw()
            j(r0, r1)
            return
        Ld1:
            java.util.concurrent.locks.ReentrantLock r1 = r14.cw
            r1.unlock()
            com.bytedance.embedapplog.up$j r1 = new com.bytedance.embedapplog.up$j
            java.lang.String r2 = com.bytedance.embedapplog.wi.oq
            boolean r3 = com.bytedance.embedapplog.wi.vl
            long r4 = com.bytedance.embedapplog.wi.qv
            r1.<init>(r2, r3, r4)
            java.lang.Object[] r2 = cw()
            j(r1, r2)
            throw r0
    }

    public com.bytedance.embedapplog.tk j() {
            r1 = this;
            com.bytedance.embedapplog.tk r0 = r1.up
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    public java.util.Map<java.lang.String, java.lang.String> j(long r3) {
            r2 = this;
            boolean r0 = r2.f2118m
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = com.bytedance.embedapplog.j.xt
            if (r0 != 0) goto L18
            com.bytedance.embedapplog.gr r3 = r2.ae
            com.bytedance.embedapplog.na r3 = r3.j()
            if (r3 == 0) goto L17
            java.util.Map r3 = r3.j()
            return r3
        L17:
            return r1
        L18:
            r2.xt()
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.jy
            if (r0 != 0) goto L3a
            android.os.SystemClock.elapsedRealtime()
            java.util.concurrent.locks.ReentrantLock r0 = r2.cw     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L34
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L34
            boolean r3 = r0.tryLock(r3, r1)     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L34
            if (r3 == 0) goto L3a
            java.util.concurrent.locks.ReentrantLock r3 = r2.cw
            r3.unlock()
            goto L3a
        L32:
            r3 = move-exception
            goto L36
        L34:
            r3 = move-exception
            goto L37
        L36:
            throw r3
        L37:
            com.bytedance.embedapplog.uc.j(r3)
        L3a:
            java.util.Map<java.lang.String, java.lang.String> r3 = r2.jy
            return r3
    }

    public void xt() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.g
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L12
            com.bytedance.embedapplog.wi$1 r0 = new com.bytedance.embedapplog.wi$1
            r0.<init>(r3)
            j(r0)
        L12:
            return
    }
}
