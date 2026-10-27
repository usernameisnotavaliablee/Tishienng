package com.ss.android.socialbase.downloader.qv;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class ae {
    private final com.ss.android.socialbase.downloader.qv.cw ae;
    private final boolean av;
    private final long az;
    private final com.ss.android.socialbase.downloader.ae.cw cw;
    private volatile boolean g;
    private long i;
    private final java.util.List<com.ss.android.socialbase.downloader.qv.vl> j;
    private final boolean jy;
    private final com.ss.android.socialbase.downloader.ws.m m;
    private volatile long mi;
    private volatile boolean oq;
    private volatile boolean qv;
    private final com.ss.android.socialbase.downloader.downloader.vl r;
    private com.ss.android.socialbase.downloader.up.j tl;
    private final com.ss.android.socialbase.downloader.jy.j up;
    private final com.ss.android.socialbase.downloader.j.j vl;
    private volatile long w;
    private final long ws;
    private final java.util.List<com.ss.android.socialbase.downloader.qv.vl> xt;

    ae(com.ss.android.socialbase.downloader.ae.cw r8, com.ss.android.socialbase.downloader.ws.m r9, com.ss.android.socialbase.downloader.qv.cw r10) {
            r7 = this;
            r7.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r7.j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.xt = r0
            r0 = 0
            r7.g = r0
            r7.oq = r0
            r7.qv = r0
            r1 = 0
            r7.w = r1
            r7.mi = r1
            r7.cw = r8
            com.ss.android.socialbase.downloader.downloader.vl r3 = com.ss.android.socialbase.downloader.downloader.cw.x()
            r7.r = r3
            r7.m = r9
            r7.ae = r10
            com.ss.android.socialbase.downloader.j.j r9 = com.ss.android.socialbase.downloader.j.j.j()
            r7.vl = r9
            int r8 = r8.ae()
            com.ss.android.socialbase.downloader.jy.j r8 = com.ss.android.socialbase.downloader.jy.j.j(r8)
            r7.up = r8
            java.lang.String r9 = "sync_strategy"
            int r9 = r8.j(r9, r0)
            r10 = 1
            if (r9 != r10) goto L45
            r9 = 1
            goto L46
        L45:
            r9 = 0
        L46:
            r7.jy = r9
            if (r9 == 0) goto L6b
            java.lang.String r9 = "sync_interval_ms_fg"
            r1 = 5000(0x1388, float:7.006E-42)
            int r9 = r8.j(r9, r1)
            long r1 = (long) r9
            java.lang.String r9 = "sync_interval_ms_bg"
            r3 = 1000(0x3e8, float:1.401E-42)
            int r9 = r8.j(r9, r3)
            long r3 = (long) r9
            r5 = 500(0x1f4, double:2.47E-321)
            long r1 = java.lang.Math.max(r1, r5)
            r7.ws = r1
            long r1 = java.lang.Math.max(r3, r5)
            r7.az = r1
            goto L6f
        L6b:
            r7.ws = r1
            r7.az = r1
        L6f:
            java.lang.String r9 = "monitor_rw"
            int r8 = r8.xt(r9)
            if (r8 != r10) goto L78
            r0 = 1
        L78:
            r7.av = r0
            return
    }

    private void cw() throws java.io.IOException {
            r11 = this;
            boolean r0 = r11.av
            if (r0 == 0) goto L9
            long r1 = java.lang.System.nanoTime()
            goto Lb
        L9:
            r1 = 0
        Lb:
            com.ss.android.socialbase.downloader.ae.cw r3 = r11.cw
            com.ss.android.socialbase.downloader.downloader.vl r4 = r11.r
            java.util.List<com.ss.android.socialbase.downloader.qv.vl> r5 = r11.j
            java.util.List<com.ss.android.socialbase.downloader.qv.vl> r6 = r11.xt
            int r7 = r3.ae()
            java.util.Map r7 = r4.vl(r7)
            if (r7 != 0) goto L23
            java.util.HashMap r7 = new java.util.HashMap
            r8 = 4
            r7.<init>(r8)
        L23:
            monitor-enter(r11)
            r11.j(r5)     // Catch: java.lang.Throwable -> L45
            r8 = 1
            r11.xt(r5)     // Catch: java.lang.Throwable -> L2d
            r9 = 1
            goto L32
        L2d:
            r9 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r9)     // Catch: java.lang.Throwable -> L45
            r9 = 0
        L32:
            r11.j(r5, r7)     // Catch: java.lang.Throwable -> L45
            int r10 = r6.size()     // Catch: java.lang.Throwable -> L45
            if (r10 <= 0) goto L47
            r11.cw(r6)     // Catch: java.lang.Throwable -> L45
            r5.removeAll(r6)     // Catch: java.lang.Throwable -> L45
            r6.clear()     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r0 = move-exception
            goto L6a
        L47:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L45
            if (r9 == 0) goto L5d
            r3.ae(r8)
            int r5 = r3.ae()
            r4.j(r5, r7)
            r4.j(r3)
            long r3 = r3.uq()
            r11.w = r3
        L5d:
            if (r0 == 0) goto L69
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r1
            long r0 = r11.i
            long r0 = r0 + r3
            r11.i = r0
        L69:
            return
        L6a:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L45
            throw r0
    }

    private void cw(java.util.List<com.ss.android.socialbase.downloader.qv.vl> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()
            com.ss.android.socialbase.downloader.qv.vl r0 = (com.ss.android.socialbase.downloader.qv.vl) r0
            r0.r()
            goto L4
        L14:
            return
    }

    private void j(long r7, boolean r9) throws java.io.IOException {
            r6 = this;
            long r0 = r6.mi
            long r0 = r7 - r0
            boolean r2 = r6.jy
            if (r2 == 0) goto L1a
            com.ss.android.socialbase.downloader.j.j r9 = r6.vl
            boolean r9 = r9.xt()
            if (r9 == 0) goto L13
            long r2 = r6.ws
            goto L15
        L13:
            long r2 = r6.az
        L15:
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L2c
            goto L2d
        L1a:
            com.ss.android.socialbase.downloader.ae.cw r2 = r6.cw
            long r2 = r2.uq()
            long r4 = r6.w
            long r2 = r2 - r4
            if (r9 != 0) goto L2d
            boolean r9 = r6.j(r2, r0)
            if (r9 == 0) goto L2c
            goto L2d
        L2c:
            return
        L2d:
            r6.cw()
            r6.mi = r7
            return
    }

    private void j(com.ss.android.socialbase.downloader.qv.up r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.ss.android.socialbase.downloader.qv.vl> r0 = r1.xt     // Catch: java.lang.Throwable -> La
            com.ss.android.socialbase.downloader.qv.vl r2 = (com.ss.android.socialbase.downloader.qv.vl) r2     // Catch: java.lang.Throwable -> La
            r0.add(r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return
        La:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    private void j(java.util.List<com.ss.android.socialbase.downloader.qv.vl> r2) throws java.io.IOException {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()
            com.ss.android.socialbase.downloader.qv.vl r0 = (com.ss.android.socialbase.downloader.qv.vl) r0
            r0.xt()
            goto L4
        L14:
            return
    }

    private void j(java.util.List<com.ss.android.socialbase.downloader.qv.vl> r5, java.util.Map<java.lang.Long, com.ss.android.socialbase.downloader.qv.g> r6) {
            r4 = this;
            java.util.Iterator r5 = r5.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r5.next()
            com.ss.android.socialbase.downloader.qv.vl r0 = (com.ss.android.socialbase.downloader.qv.vl) r0
            com.ss.android.socialbase.downloader.qv.g r0 = r0.up()
            long r1 = r0.cw()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r6.get(r1)
            com.ss.android.socialbase.downloader.qv.g r1 = (com.ss.android.socialbase.downloader.qv.g) r1
            if (r1 != 0) goto L35
            com.ss.android.socialbase.downloader.qv.g r1 = new com.ss.android.socialbase.downloader.qv.g
            r1.<init>(r0)
            long r2 = r0.cw()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.put(r0, r1)
            goto L4
        L35:
            long r2 = r0.r()
            r1.j(r2)
            long r2 = r0.m()
            r1.cw(r2)
            goto L4
        L44:
            return
    }

    private boolean j(long r4, long r6) {
            r3 = this;
            r0 = 65536(0x10000, double:3.2379E-319)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lf
            r4 = 500(0x1f4, double:2.47E-321)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lf
            r4 = 1
            return r4
        Lf:
            r4 = 0
            return r4
    }

    private void xt(java.util.List<com.ss.android.socialbase.downloader.qv.vl> r2) throws java.io.IOException {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()
            com.ss.android.socialbase.downloader.qv.vl r0 = (com.ss.android.socialbase.downloader.qv.vl) r0
            r0.cw()
            goto L4
        L14:
            return
    }

    public void j() {
            r1 = this;
            r0 = 1
            r1.qv = r0
            r1.g = r0
            return
    }

    void j(com.ss.android.socialbase.downloader.qv.r r29) throws com.ss.android.socialbase.downloader.up.j {
            r28 = this;
            r1 = r28
            boolean r0 = r1.oq
            if (r0 != 0) goto L453
            boolean r0 = r1.qv
            if (r0 == 0) goto Lc
            goto L453
        Lc:
            com.ss.android.socialbase.downloader.g.xt.up()
            r2 = 0
            r1.tl = r2
            com.ss.android.socialbase.downloader.ae.cw r4 = r1.cw
            com.ss.android.socialbase.downloader.ws.m r3 = r1.m
            com.ss.android.socialbase.downloader.qv.cw r0 = r1.ae
            long r5 = r4.uq()
            long r7 = java.lang.System.nanoTime()
            boolean r14 = r1.av
            r10 = 0
            r4.qa()     // Catch: java.lang.Throwable -> L1fb com.ss.android.socialbase.downloader.up.j -> L32b com.ss.android.socialbase.downloader.qv.av -> L3d5
            r12 = r10
            r15 = r12
            r17 = r15
            r2 = 0
        L2c:
            if (r14 == 0) goto L4f
            long r12 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L33 com.ss.android.socialbase.downloader.up.j -> L3e com.ss.android.socialbase.downloader.qv.av -> L47
            goto L4f
        L33:
            r0 = move-exception
            r9 = r2
            r21 = r4
            r22 = r5
        L39:
            r17 = r15
        L3b:
            r15 = r10
            goto L205
        L3e:
            r0 = move-exception
            r9 = r2
            r22 = r5
        L42:
            r17 = r15
        L44:
            r15 = r10
            goto L333
        L47:
            r0 = move-exception
            r9 = r2
            r22 = r5
        L4b:
            r17 = r15
            goto L3dc
        L4f:
            com.ss.android.socialbase.downloader.qv.j r9 = r29.j()     // Catch: java.lang.Throwable -> L1e4 com.ss.android.socialbase.downloader.up.j -> L1eb com.ss.android.socialbase.downloader.qv.av -> L1f3
            if (r14 == 0) goto L5d
            long r21 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L33 com.ss.android.socialbase.downloader.up.j -> L3e com.ss.android.socialbase.downloader.qv.av -> L47
            long r21 = r21 - r12
            long r10 = r10 + r21
        L5d:
            r21 = r4
            int r4 = r9.cw     // Catch: java.lang.Throwable -> L1d8 com.ss.android.socialbase.downloader.up.j -> L1dc com.ss.android.socialbase.downloader.qv.av -> L1e0
            r22 = r5
            r5 = -1
            if (r4 != r5) goto L85
            com.ss.android.socialbase.downloader.qv.up r4 = r9.xt     // Catch: java.lang.Throwable -> L73 com.ss.android.socialbase.downloader.up.j -> L76 com.ss.android.socialbase.downloader.qv.av -> L7d
            r1.j(r4)     // Catch: java.lang.Throwable -> L73 com.ss.android.socialbase.downloader.up.j -> L76 com.ss.android.socialbase.downloader.qv.av -> L7d
            r0.j(r9)     // Catch: java.lang.Throwable -> L73 com.ss.android.socialbase.downloader.up.j -> L76 com.ss.android.socialbase.downloader.qv.av -> L7d
            r4 = r21
        L70:
            r5 = r22
            goto L2c
        L73:
            r0 = move-exception
        L74:
            r9 = r2
            goto L39
        L76:
            r0 = move-exception
            r9 = r2
            r17 = r15
            r4 = r21
            goto L44
        L7d:
            r0 = move-exception
        L7e:
            r9 = r2
            r17 = r15
        L81:
            r4 = r21
            goto L3dc
        L85:
            if (r14 == 0) goto L8c
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L73 com.ss.android.socialbase.downloader.up.j -> L76 com.ss.android.socialbase.downloader.qv.av -> L7d
            r12 = r5
        L8c:
            com.ss.android.socialbase.downloader.qv.up r5 = r9.xt     // Catch: java.lang.Throwable -> L1c5 com.ss.android.socialbase.downloader.up.j -> L1cc com.ss.android.socialbase.downloader.qv.av -> L1d3
            r5.xt(r9)     // Catch: java.lang.Throwable -> L1c5 com.ss.android.socialbase.downloader.up.j -> L1cc com.ss.android.socialbase.downloader.qv.av -> L1d3
            if (r14 == 0) goto L99
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L73 com.ss.android.socialbase.downloader.up.j -> L76 com.ss.android.socialbase.downloader.qv.av -> L7d
            long r5 = r5 - r12
            long r15 = r15 + r5
        L99:
            r5 = r17
            r17 = r15
            r0.j(r9)     // Catch: java.lang.Throwable -> L1b8 com.ss.android.socialbase.downloader.up.j -> L1bc com.ss.android.socialbase.downloader.qv.av -> L1c0
            boolean r9 = r1.g     // Catch: java.lang.Throwable -> L1b8 com.ss.android.socialbase.downloader.up.j -> L1bc com.ss.android.socialbase.downloader.qv.av -> L1c0
            if (r9 == 0) goto L134
            boolean r9 = r1.oq     // Catch: java.lang.Throwable -> Lb2 com.ss.android.socialbase.downloader.up.j -> Lb5 com.ss.android.socialbase.downloader.qv.av -> Lbc
            if (r9 != 0) goto Lbf
            boolean r9 = r1.qv     // Catch: java.lang.Throwable -> Lb2 com.ss.android.socialbase.downloader.up.j -> Lb5 com.ss.android.socialbase.downloader.qv.av -> Lbc
            if (r9 == 0) goto Lad
            goto Lbf
        Lad:
            r9 = 0
            r1.g = r9     // Catch: java.lang.Throwable -> Lb2 com.ss.android.socialbase.downloader.up.j -> Lb5 com.ss.android.socialbase.downloader.qv.av -> Lbc
            goto L135
        Lb2:
            r0 = move-exception
            r9 = r2
            goto L3b
        Lb5:
            r0 = move-exception
            r9 = r2
            r15 = r10
            r4 = r21
            goto L333
        Lbc:
            r0 = move-exception
        Lbd:
            r9 = r2
            goto L81
        Lbf:
            if (r2 <= 0) goto Lc7
            long r4 = (long) r2
            r3.xt(r4)     // Catch: java.lang.Throwable -> Lc6
            goto Lc7
        Lc6:
        Lc7:
            boolean r0 = r1.qv
            if (r0 != 0) goto Le1
            r1.cw()     // Catch: java.lang.Throwable -> Lcf
            goto Le1
        Lcf:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "MultiSegmentWriter"
            java.lang.String r3 = "loopAndWrite: finally sync, e = "
            java.lang.String r4 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r3.concat(r4)
            com.ss.android.socialbase.downloader.m.j.r(r0, r3)
            goto Le2
        Le1:
            r2 = 0
        Le2:
            monitor-enter(r28)
            java.util.List<com.ss.android.socialbase.downloader.qv.vl> r0 = r1.j     // Catch: java.lang.Throwable -> L131
            r1.cw(r0)     // Catch: java.lang.Throwable -> L131
            java.util.List<com.ss.android.socialbase.downloader.qv.vl> r0 = r1.j     // Catch: java.lang.Throwable -> L131
            r0.clear()     // Catch: java.lang.Throwable -> L131
            monitor-exit(r28)     // Catch: java.lang.Throwable -> L131
            long r3 = r21.uq()
            long r3 = r3 - r22
            long r5 = java.lang.System.nanoTime()
            long r12 = r5 - r7
            r15 = r10
            r10 = r3
            com.ss.android.socialbase.downloader.jy.j r3 = r1.up
            java.lang.String r5 = r21.oq()
            boolean r7 = r1.oq
            boolean r8 = r1.qv
            com.ss.android.socialbase.downloader.up.j r9 = r1.tl
            r0 = r3
            long r3 = r1.i
            r19 = r3
            r4 = r21
            r21 = 0
            r6 = 0
            r3 = r0
            com.ss.android.socialbase.downloader.tl.j.j(r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r17, r19, r21)
            if (r2 == 0) goto L453
            boolean r0 = r1.oq
            if (r0 != 0) goto L453
            boolean r0 = r1.qv
            if (r0 != 0) goto L453
            com.ss.android.socialbase.downloader.up.j r0 = r1.tl
            if (r0 == 0) goto L126
            goto L453
        L126:
            java.lang.String r0 = "loopAndWrite_finally"
            com.ss.android.socialbase.downloader.az.m.j(r2, r0)     // Catch: com.ss.android.socialbase.downloader.up.j -> L12d
            goto L453
        L12d:
            r0 = move-exception
            r1.tl = r0
            throw r0
        L131:
            r0 = move-exception
            monitor-exit(r28)     // Catch: java.lang.Throwable -> L131
            throw r0
        L134:
            r9 = 0
        L135:
            int r2 = r2 + r4
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r2 < r4) goto L1ac
            r24 = r10
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L196 com.ss.android.socialbase.downloader.up.j -> L19c com.ss.android.socialbase.downloader.qv.av -> L1a4
            long r15 = r9 - r5
            r26 = 100
            int r4 = (r15 > r26 ? 1 : (r15 == r26 ? 0 : -1))
            if (r4 <= 0) goto L1ae
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L196 com.ss.android.socialbase.downloader.up.j -> L19c com.ss.android.socialbase.downloader.qv.av -> L1a4
            boolean r2 = r3.xt(r4)     // Catch: java.lang.Throwable -> L196 com.ss.android.socialbase.downloader.up.j -> L19c com.ss.android.socialbase.downloader.qv.av -> L1a4
            r1.j(r9, r2)     // Catch: java.lang.Throwable -> L16d com.ss.android.socialbase.downloader.up.j -> L173 com.ss.android.socialbase.downloader.qv.av -> L17b
            boolean r2 = com.ss.android.socialbase.downloader.g.xt.j     // Catch: java.lang.Throwable -> L16d com.ss.android.socialbase.downloader.up.j -> L173 com.ss.android.socialbase.downloader.qv.av -> L17b
            if (r2 != 0) goto L189
            boolean r2 = r21.x()     // Catch: java.lang.Throwable -> L16d com.ss.android.socialbase.downloader.up.j -> L173 com.ss.android.socialbase.downloader.qv.av -> L17b
            if (r2 != 0) goto L183
            boolean r2 = r21.e()     // Catch: java.lang.Throwable -> L16d com.ss.android.socialbase.downloader.up.j -> L173 com.ss.android.socialbase.downloader.qv.av -> L17b
            if (r2 == 0) goto L189
            boolean r2 = r21.qb()     // Catch: java.lang.Throwable -> L16d com.ss.android.socialbase.downloader.up.j -> L173 com.ss.android.socialbase.downloader.qv.av -> L17b
            if (r2 != 0) goto L167
            goto L189
        L167:
            com.ss.android.socialbase.downloader.up.m r0 = new com.ss.android.socialbase.downloader.up.m     // Catch: java.lang.Throwable -> L16d com.ss.android.socialbase.downloader.up.j -> L173 com.ss.android.socialbase.downloader.qv.av -> L17b
            r0.<init>()     // Catch: java.lang.Throwable -> L16d com.ss.android.socialbase.downloader.up.j -> L173 com.ss.android.socialbase.downloader.qv.av -> L17b
            throw r0     // Catch: java.lang.Throwable -> L16d com.ss.android.socialbase.downloader.up.j -> L173 com.ss.android.socialbase.downloader.qv.av -> L17b
        L16d:
            r0 = move-exception
            r15 = r24
        L170:
            r9 = 0
            goto L205
        L173:
            r0 = move-exception
            r4 = r21
            r15 = r24
        L178:
            r9 = 0
            goto L333
        L17b:
            r0 = move-exception
            r4 = r21
            r10 = r24
        L180:
            r9 = 0
            goto L3dc
        L183:
            com.ss.android.socialbase.downloader.up.r r0 = new com.ss.android.socialbase.downloader.up.r     // Catch: java.lang.Throwable -> L16d com.ss.android.socialbase.downloader.up.j -> L173 com.ss.android.socialbase.downloader.qv.av -> L17b
            r0.<init>()     // Catch: java.lang.Throwable -> L16d com.ss.android.socialbase.downloader.up.j -> L173 com.ss.android.socialbase.downloader.qv.av -> L17b
            throw r0     // Catch: java.lang.Throwable -> L16d com.ss.android.socialbase.downloader.up.j -> L173 com.ss.android.socialbase.downloader.qv.av -> L17b
        L189:
            r15 = r17
            r4 = r21
            r5 = r22
            r2 = 0
            r17 = r9
            r10 = r24
            goto L2c
        L196:
            r0 = move-exception
        L197:
            r9 = r2
        L198:
            r15 = r24
            goto L205
        L19c:
            r0 = move-exception
        L19d:
            r9 = r2
        L19e:
            r4 = r21
            r15 = r24
            goto L333
        L1a4:
            r0 = move-exception
            r9 = r2
            r4 = r21
            r10 = r24
            goto L3dc
        L1ac:
            r24 = r10
        L1ae:
            r15 = r17
            r4 = r21
            r10 = r24
            r17 = r5
            goto L70
        L1b8:
            r0 = move-exception
            r24 = r10
            goto L197
        L1bc:
            r0 = move-exception
            r24 = r10
            goto L19d
        L1c0:
            r0 = move-exception
            r24 = r10
            goto Lbd
        L1c5:
            r0 = move-exception
        L1c6:
            r24 = r10
            r9 = r2
            r17 = r15
            goto L198
        L1cc:
            r0 = move-exception
        L1cd:
            r24 = r10
            r9 = r2
            r17 = r15
            goto L19e
        L1d3:
            r0 = move-exception
        L1d4:
            r24 = r10
            goto L7e
        L1d8:
            r0 = move-exception
            r22 = r5
            goto L1c6
        L1dc:
            r0 = move-exception
            r22 = r5
            goto L1cd
        L1e0:
            r0 = move-exception
            r22 = r5
            goto L1d4
        L1e4:
            r0 = move-exception
            r21 = r4
            r22 = r5
            goto L74
        L1eb:
            r0 = move-exception
            r21 = r4
            r22 = r5
            r9 = r2
            goto L42
        L1f3:
            r0 = move-exception
            r21 = r4
            r22 = r5
            r9 = r2
            goto L4b
        L1fb:
            r0 = move-exception
            r21 = r4
            r22 = r5
            r15 = r10
            r17 = r15
            goto L170
        L205:
            boolean r2 = r1.oq     // Catch: java.lang.Throwable -> L2a8
            if (r2 != 0) goto L20d
            boolean r2 = r1.qv     // Catch: java.lang.Throwable -> L2a8
            if (r2 == 0) goto L211
        L20d:
            r4 = r21
            goto L2b6
        L211:
            boolean r2 = com.ss.android.socialbase.downloader.m.j.j()     // Catch: java.lang.Throwable -> L2a8
            if (r2 == 0) goto L221
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L21b
            goto L221
        L21b:
            r0 = move-exception
            r2 = r0
            r4 = r21
            goto L3e2
        L221:
            java.lang.String r2 = "MultiSegmentWriter"
            java.lang.String r4 = "loopAndWrite:  e = "
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> L2a8
            com.ss.android.socialbase.downloader.m.j.r(r2, r4)     // Catch: java.lang.Throwable -> L2a8
            java.lang.String r2 = "loopAndWrite"
            com.ss.android.socialbase.downloader.az.m.j(r0, r2)     // Catch: java.lang.Throwable -> L2a8 com.ss.android.socialbase.downloader.up.j -> L2ae
            if (r9 <= 0) goto L23d
            long r4 = (long) r9
            r3.xt(r4)     // Catch: java.lang.Throwable -> L23c
            goto L23d
        L23c:
        L23d:
            boolean r0 = r1.qv
            if (r0 != 0) goto L257
            r1.cw()     // Catch: java.lang.Throwable -> L245
            goto L257
        L245:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "MultiSegmentWriter"
            java.lang.String r3 = "loopAndWrite: finally sync, e = "
            java.lang.String r4 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r3.concat(r4)
            com.ss.android.socialbase.downloader.m.j.r(r0, r3)
            goto L258
        L257:
            r2 = 0
        L258:
            monitor-enter(r28)
            java.util.List<com.ss.android.socialbase.downloader.qv.vl> r0 = r1.j     // Catch: java.lang.Throwable -> L2a5
            r1.cw(r0)     // Catch: java.lang.Throwable -> L2a5
            java.util.List<com.ss.android.socialbase.downloader.qv.vl> r0 = r1.j     // Catch: java.lang.Throwable -> L2a5
            r0.clear()     // Catch: java.lang.Throwable -> L2a5
            monitor-exit(r28)     // Catch: java.lang.Throwable -> L2a5
            long r3 = r21.uq()
            long r10 = r3 - r22
            long r3 = java.lang.System.nanoTime()
            long r12 = r3 - r7
            com.ss.android.socialbase.downloader.jy.j r3 = r1.up
            java.lang.String r5 = r21.oq()
            boolean r7 = r1.oq
            boolean r8 = r1.qv
            com.ss.android.socialbase.downloader.up.j r9 = r1.tl
            r0 = r3
            long r3 = r1.i
            r19 = r3
            r4 = r21
            r21 = 0
            r6 = 0
            r3 = r0
            com.ss.android.socialbase.downloader.tl.j.j(r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r17, r19, r21)
            if (r2 == 0) goto L453
            boolean r0 = r1.oq
            if (r0 != 0) goto L453
            boolean r0 = r1.qv
            if (r0 != 0) goto L453
            com.ss.android.socialbase.downloader.up.j r0 = r1.tl
            if (r0 == 0) goto L29a
            goto L453
        L29a:
            java.lang.String r0 = "loopAndWrite_finally"
            com.ss.android.socialbase.downloader.az.m.j(r2, r0)     // Catch: com.ss.android.socialbase.downloader.up.j -> L2a1
            goto L453
        L2a1:
            r0 = move-exception
            r1.tl = r0
            throw r0
        L2a5:
            r0 = move-exception
            monitor-exit(r28)     // Catch: java.lang.Throwable -> L2a5
            throw r0
        L2a8:
            r0 = move-exception
            r4 = r21
        L2ab:
            r2 = r0
            goto L3e2
        L2ae:
            r0 = move-exception
            r4 = r21
            r1.tl = r0     // Catch: java.lang.Throwable -> L2b4
            throw r0     // Catch: java.lang.Throwable -> L2b4
        L2b4:
            r0 = move-exception
            goto L2ab
        L2b6:
            if (r9 <= 0) goto L2be
            long r5 = (long) r9
            r3.xt(r5)     // Catch: java.lang.Throwable -> L2bd
            goto L2be
        L2bd:
        L2be:
            boolean r0 = r1.qv
            if (r0 != 0) goto L2d8
            r1.cw()     // Catch: java.lang.Throwable -> L2c6
            goto L2d8
        L2c6:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "MultiSegmentWriter"
            java.lang.String r3 = "loopAndWrite: finally sync, e = "
            java.lang.String r5 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r3.concat(r5)
            com.ss.android.socialbase.downloader.m.j.r(r0, r3)
            goto L2d9
        L2d8:
            r2 = 0
        L2d9:
            monitor-enter(r28)
            java.util.List<com.ss.android.socialbase.downloader.qv.vl> r0 = r1.j     // Catch: java.lang.Throwable -> L328
            r1.cw(r0)     // Catch: java.lang.Throwable -> L328
            java.util.List<com.ss.android.socialbase.downloader.qv.vl> r0 = r1.j     // Catch: java.lang.Throwable -> L328
            r0.clear()     // Catch: java.lang.Throwable -> L328
            monitor-exit(r28)     // Catch: java.lang.Throwable -> L328
            long r5 = r4.uq()
            long r10 = r5 - r22
            long r5 = java.lang.System.nanoTime()
            long r12 = r5 - r7
            com.ss.android.socialbase.downloader.jy.j r3 = r1.up
            java.lang.String r5 = r4.oq()
            boolean r7 = r1.oq
            boolean r8 = r1.qv
            com.ss.android.socialbase.downloader.up.j r9 = r1.tl
            r0 = r3
            r21 = r4
            long r3 = r1.i
            r19 = r3
            r4 = r21
            r21 = 0
            r6 = 0
            r3 = r0
            com.ss.android.socialbase.downloader.tl.j.j(r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r17, r19, r21)
            if (r2 == 0) goto L453
            boolean r0 = r1.oq
            if (r0 != 0) goto L453
            boolean r0 = r1.qv
            if (r0 != 0) goto L453
            com.ss.android.socialbase.downloader.up.j r0 = r1.tl
            if (r0 == 0) goto L31d
            goto L453
        L31d:
            java.lang.String r0 = "loopAndWrite_finally"
            com.ss.android.socialbase.downloader.az.m.j(r2, r0)     // Catch: com.ss.android.socialbase.downloader.up.j -> L324
            goto L453
        L324:
            r0 = move-exception
            r1.tl = r0
            throw r0
        L328:
            r0 = move-exception
            monitor-exit(r28)     // Catch: java.lang.Throwable -> L328
            throw r0
        L32b:
            r0 = move-exception
            r22 = r5
            r15 = r10
            r17 = r15
            goto L178
        L333:
            com.ss.android.socialbase.downloader.jy.j r2 = r1.up     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r5 = "ignore_base_ex_on_stop_status"
            boolean r2 = r2.j(r5)     // Catch: java.lang.Throwable -> L2b4
            if (r2 == 0) goto L3ba
            boolean r2 = r1.oq     // Catch: java.lang.Throwable -> L2b4
            if (r2 != 0) goto L345
            boolean r2 = r1.qv     // Catch: java.lang.Throwable -> L2b4
            if (r2 == 0) goto L3ba
        L345:
            if (r9 <= 0) goto L34d
            long r5 = (long) r9
            r3.xt(r5)     // Catch: java.lang.Throwable -> L34c
            goto L34d
        L34c:
        L34d:
            boolean r0 = r1.qv
            if (r0 != 0) goto L367
            r1.cw()     // Catch: java.lang.Throwable -> L355
            goto L367
        L355:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "MultiSegmentWriter"
            java.lang.String r3 = "loopAndWrite: finally sync, e = "
            java.lang.String r5 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r3.concat(r5)
            com.ss.android.socialbase.downloader.m.j.r(r0, r3)
            goto L368
        L367:
            r2 = 0
        L368:
            monitor-enter(r28)
            java.util.List<com.ss.android.socialbase.downloader.qv.vl> r0 = r1.j     // Catch: java.lang.Throwable -> L3b7
            r1.cw(r0)     // Catch: java.lang.Throwable -> L3b7
            java.util.List<com.ss.android.socialbase.downloader.qv.vl> r0 = r1.j     // Catch: java.lang.Throwable -> L3b7
            r0.clear()     // Catch: java.lang.Throwable -> L3b7
            monitor-exit(r28)     // Catch: java.lang.Throwable -> L3b7
            long r5 = r4.uq()
            long r10 = r5 - r22
            long r5 = java.lang.System.nanoTime()
            long r12 = r5 - r7
            com.ss.android.socialbase.downloader.jy.j r3 = r1.up
            java.lang.String r5 = r4.oq()
            boolean r7 = r1.oq
            boolean r8 = r1.qv
            com.ss.android.socialbase.downloader.up.j r9 = r1.tl
            r0 = r3
            r21 = r4
            long r3 = r1.i
            r19 = r3
            r4 = r21
            r21 = 0
            r6 = 0
            r3 = r0
            com.ss.android.socialbase.downloader.tl.j.j(r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r17, r19, r21)
            if (r2 == 0) goto L453
            boolean r0 = r1.oq
            if (r0 != 0) goto L453
            boolean r0 = r1.qv
            if (r0 != 0) goto L453
            com.ss.android.socialbase.downloader.up.j r0 = r1.tl
            if (r0 == 0) goto L3ac
            goto L453
        L3ac:
            java.lang.String r0 = "loopAndWrite_finally"
            com.ss.android.socialbase.downloader.az.m.j(r2, r0)     // Catch: com.ss.android.socialbase.downloader.up.j -> L3b3
            goto L453
        L3b3:
            r0 = move-exception
            r1.tl = r0
            throw r0
        L3b7:
            r0 = move-exception
            monitor-exit(r28)     // Catch: java.lang.Throwable -> L3b7
            throw r0
        L3ba:
            boolean r2 = com.ss.android.socialbase.downloader.m.j.j()     // Catch: java.lang.Throwable -> L2b4
            if (r2 == 0) goto L3c3
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L2b4
        L3c3:
            java.lang.String r2 = "MultiSegmentWriter"
            java.lang.String r5 = "loopAndWrite:  BaseException e = "
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> L2b4
            com.ss.android.socialbase.downloader.m.j.r(r2, r5)     // Catch: java.lang.Throwable -> L2b4
            r1.tl = r0     // Catch: java.lang.Throwable -> L2b4
            throw r0     // Catch: java.lang.Throwable -> L2b4
        L3d5:
            r0 = move-exception
            r22 = r5
            r17 = r10
            goto L180
        L3dc:
            r1.tl = r0     // Catch: java.lang.Throwable -> L3df
            throw r0     // Catch: java.lang.Throwable -> L3df
        L3df:
            r0 = move-exception
            r2 = r0
            r15 = r10
        L3e2:
            if (r9 <= 0) goto L3ea
            long r5 = (long) r9
            r3.xt(r5)     // Catch: java.lang.Throwable -> L3e9
            goto L3ea
        L3e9:
        L3ea:
            boolean r0 = r1.qv
            if (r0 != 0) goto L403
            r1.cw()     // Catch: java.lang.Throwable -> L3f2
            goto L403
        L3f2:
            r0 = move-exception
            java.lang.String r3 = "MultiSegmentWriter"
            java.lang.String r5 = "loopAndWrite: finally sync, e = "
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.String r5 = r5.concat(r6)
            com.ss.android.socialbase.downloader.m.j.r(r3, r5)
            goto L404
        L403:
            r0 = 0
        L404:
            monitor-enter(r28)
            java.util.List<com.ss.android.socialbase.downloader.qv.vl> r3 = r1.j     // Catch: java.lang.Throwable -> L450
            r1.cw(r3)     // Catch: java.lang.Throwable -> L450
            java.util.List<com.ss.android.socialbase.downloader.qv.vl> r3 = r1.j     // Catch: java.lang.Throwable -> L450
            r3.clear()     // Catch: java.lang.Throwable -> L450
            monitor-exit(r28)     // Catch: java.lang.Throwable -> L450
            long r5 = r4.uq()
            long r10 = r5 - r22
            long r5 = java.lang.System.nanoTime()
            long r12 = r5 - r7
            com.ss.android.socialbase.downloader.jy.j r3 = r1.up
            java.lang.String r5 = r4.oq()
            boolean r7 = r1.oq
            boolean r8 = r1.qv
            com.ss.android.socialbase.downloader.up.j r9 = r1.tl
            r29 = r2
            r6 = r3
            long r2 = r1.i
            r21 = 0
            r19 = r2
            r3 = r6
            r6 = 0
            com.ss.android.socialbase.downloader.tl.j.j(r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r17, r19, r21)
            if (r0 == 0) goto L44f
            boolean r2 = r1.oq
            if (r2 != 0) goto L44f
            boolean r2 = r1.qv
            if (r2 != 0) goto L44f
            com.ss.android.socialbase.downloader.up.j r2 = r1.tl
            if (r2 == 0) goto L445
            goto L44f
        L445:
            java.lang.String r2 = "loopAndWrite_finally"
            com.ss.android.socialbase.downloader.az.m.j(r0, r2)     // Catch: com.ss.android.socialbase.downloader.up.j -> L44b
            goto L44f
        L44b:
            r0 = move-exception
            r1.tl = r0
            throw r0
        L44f:
            throw r29
        L450:
            r0 = move-exception
            monitor-exit(r28)     // Catch: java.lang.Throwable -> L450
            throw r0
        L453:
            return
    }

    void j(com.ss.android.socialbase.downloader.qv.vl r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.ss.android.socialbase.downloader.qv.vl> r0 = r1.j     // Catch: java.lang.Throwable -> L8
            r0.add(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public void xt() {
            r1 = this;
            r0 = 1
            r1.oq = r0
            r1.g = r0
            return
    }
}
