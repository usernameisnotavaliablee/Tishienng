package com.ss.android.socialbase.downloader.qv;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class jy implements java.lang.Runnable {
    private java.lang.Thread a;
    volatile long ae;
    private com.ss.android.socialbase.downloader.ae.m av;
    private com.ss.android.socialbase.downloader.g.g az;
    private boolean c;
    private volatile boolean ch;
    final int cw;
    private boolean ed;
    private volatile long f;
    java.lang.String g;
    private long gq;
    private com.ss.android.socialbase.downloader.az.up gx;
    private int h;
    private final java.util.List<com.ss.android.socialbase.downloader.qv.g> i;
    volatile com.ss.android.socialbase.downloader.qv.g j;
    private final com.ss.android.socialbase.downloader.ae.cw jy;
    private volatile long kt;
    private volatile boolean l;
    private int la;
    volatile long m;
    private volatile long mi;
    java.lang.String oq;
    private int p;
    private final com.ss.android.socialbase.downloader.qv.m qv;
    volatile long r;
    private int rn;
    private volatile boolean s;
    private volatile long tj;
    java.lang.String tl;
    private com.ss.android.socialbase.downloader.up.j uf;
    volatile long up;
    private java.util.concurrent.Future v;
    private final com.ss.android.socialbase.downloader.qv.cw vl;
    private long w;
    private boolean wq;
    private final com.ss.android.socialbase.downloader.jy.j ws;
    private volatile boolean x;
    com.ss.android.socialbase.downloader.qv.i xt;

    jy(com.ss.android.socialbase.downloader.ae.cw r3, com.ss.android.socialbase.downloader.qv.qv r4, com.ss.android.socialbase.downloader.qv.cw r5, com.ss.android.socialbase.downloader.qv.i r6, int r7) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.i = r0
            r0 = -1
            r2.tj = r0
            r2.jy = r3
            r2.qv = r4
            r2.vl = r5
            int r3 = r3.ae()
            com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
            r2.ws = r3
            r2.xt = r6
            r2.cw = r7
            return
    }

    private void cw(com.ss.android.socialbase.downloader.qv.g r24) throws com.ss.android.socialbase.downloader.up.j {
            r23 = this;
            r1 = r23
            java.lang.String r2 = "createConn"
            java.lang.String r0 = ", threadIndex = "
            java.lang.String r3 = ", ip = "
            java.lang.String r4 = "SegmentReader"
            java.lang.String r5 = "https"
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r8 = 0
            r1.up = r8     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r1.r = r6     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            long r10 = r24.up()     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r1.w = r10     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            long r10 = r24.m()     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r1.kt = r10     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            long r10 = r1.kt     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 <= 0) goto L48
            long r8 = r1.w     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            long r10 = r1.kt     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 > 0) goto L31
            goto L48
        L31:
            com.ss.android.socialbase.downloader.qv.oq r0 = new com.ss.android.socialbase.downloader.qv.oq     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r3 = "createConn, "
            java.lang.String r4 = java.lang.String.valueOf(r24)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r4 = 6
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            throw r0     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
        L42:
            r0 = move-exception
            goto L172
        L45:
            r0 = move-exception
            goto L178
        L48:
            com.ss.android.socialbase.downloader.az.up r8 = new com.ss.android.socialbase.downloader.az.up     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r8.<init>()     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r1.gx = r8     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            com.ss.android.socialbase.downloader.ae.cw r8 = r1.jy     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.util.List r9 = r8.uf()     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            com.ss.android.socialbase.downloader.ae.cw r8 = r1.jy     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r10 = r8.u()     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            long r11 = r1.w     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            long r13 = r1.kt     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.util.List r8 = com.ss.android.socialbase.downloader.az.m.j(r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            com.ss.android.socialbase.downloader.ae.up r9 = new com.ss.android.socialbase.downloader.ae.up     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r10 = "Segment-Index"
            int r11 = r24.ae()     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r8.add(r9)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            com.ss.android.socialbase.downloader.ae.up r9 = new com.ss.android.socialbase.downloader.ae.up     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r10 = "Thread-Index"
            int r11 = r1.cw     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r8.add(r9)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            com.ss.android.socialbase.downloader.ae.cw r9 = r1.jy     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            com.ss.android.socialbase.downloader.az.m.j(r8, r9)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            com.ss.android.socialbase.downloader.ae.cw r9 = r1.jy     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            com.ss.android.socialbase.downloader.az.m.xt(r8, r9)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            com.ss.android.socialbase.downloader.qv.i r9 = r1.xt     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r9 = r9.j     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            boolean r10 = r1.wq     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            if (r10 == 0) goto La9
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            if (r10 != 0) goto La9
            boolean r10 = r9.startsWith(r5)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            if (r10 == 0) goto La9
            java.lang.String r10 = "http"
            java.lang.String r9 = r9.replaceFirst(r5, r10)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
        La9:
            com.ss.android.socialbase.downloader.qv.i r5 = r1.xt     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r5 = r5.xt     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r11 = "createConnectionBegin: url = "
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r10.append(r9)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r10.append(r3)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r10.append(r5)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r11 = ", segment = "
            r10.append(r11)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r11 = r24
            r10.append(r11)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r10.append(r0)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            int r11 = r1.cw     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r10.append(r11)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            com.ss.android.socialbase.downloader.m.j.cw(r4, r10)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r1.tl = r9     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r1.g = r5     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            com.ss.android.socialbase.downloader.ae.cw r10 = r1.jy     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            boolean r15 = r10.az()     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            com.ss.android.socialbase.downloader.ae.cw r10 = r1.jy     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            int r16 = r10.ed()     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            long r10 = r1.gq     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            long r6 = r6 - r10
            r10 = 3000(0xbb8, double:1.482E-320)
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 <= 0) goto Lfd
            com.ss.android.socialbase.downloader.jy.j r6 = r1.ws     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r7 = "monitor_download_connect"
            int r6 = r6.xt(r7)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            if (r6 <= 0) goto Lfd
            r6 = 1
            r21 = 1
            goto L100
        Lfd:
            r6 = 0
            r21 = 0
        L100:
            com.ss.android.socialbase.downloader.ae.cw r6 = r1.jy     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r20 = 0
            r18 = r5
            r22 = r6
            r19 = r8
            r17 = r9
            com.ss.android.socialbase.downloader.g.g r5 = com.ss.android.socialbase.downloader.downloader.cw.j(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r6 = r18
            if (r5 == 0) goto L163
            r1.az = r5     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            com.ss.android.socialbase.downloader.ae.m r7 = new com.ss.android.socialbase.downloader.ae.m     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r7.<init>(r9, r5)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r1.av = r7     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            boolean r7 = r1.x     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            if (r7 != 0) goto L15d
            boolean r7 = r5 instanceof com.ss.android.socialbase.downloader.g.j     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            if (r7 == 0) goto L12d
            com.ss.android.socialbase.downloader.g.j r5 = (com.ss.android.socialbase.downloader.g.j) r5     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r5 = r5.up()     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r1.oq = r5     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
        L12d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r7 = "createConnectionSuccess: url = "
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r5.append(r9)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r5.append(r3)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r5.append(r6)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r3 = ", hostRealIp = "
            r5.append(r3)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r3 = r1.oq     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r5.append(r3)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r5.append(r0)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            int r0 = r1.cw     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r5.append(r0)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            com.bytedance.sdk.component.utils.vl.j(r4, r0)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
        L156:
            long r2 = java.lang.System.currentTimeMillis()
            r1.up = r2
            return
        L15d:
            com.ss.android.socialbase.downloader.qv.av r0 = new com.ss.android.socialbase.downloader.qv.av     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            throw r0     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
        L163:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            java.lang.String r4 = "download can't continue, chunk connection is null"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            r4 = 1022(0x3fe, float:1.432E-42)
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
            throw r0     // Catch: java.lang.Throwable -> L42 com.ss.android.socialbase.downloader.up.j -> L45
        L172:
            com.ss.android.socialbase.downloader.az.m.j(r0, r2)     // Catch: java.lang.Throwable -> L176
            goto L156
        L176:
            r0 = move-exception
            goto L179
        L178:
            throw r0     // Catch: java.lang.Throwable -> L176
        L179:
            long r2 = java.lang.System.currentTimeMillis()
            r1.up = r2
            throw r0
    }

    private void g() {
            r2 = this;
            long r0 = r2.r
            r2.gq = r0
            r0 = -1
            r2.r = r0
            r2.up = r0
            r2.m = r0
            r2.ae = r0
            r2.oq()
            return
    }

    private com.ss.android.socialbase.downloader.qv.j j(com.ss.android.socialbase.downloader.qv.cw r6, java.io.InputStream r7) throws java.lang.InterruptedException, com.ss.android.socialbase.downloader.up.j, java.io.IOException {
            r5 = this;
            com.ss.android.socialbase.downloader.qv.j r0 = r6.xt()
            r1 = -1
            byte[] r2 = r0.j     // Catch: java.lang.Throwable -> L21
            int r7 = r7.read(r2)     // Catch: java.lang.Throwable -> L21
            if (r7 == r1) goto L17
            r0.cw = r7     // Catch: java.lang.Throwable -> L15
            if (r7 != r1) goto L14
            r6.j(r0)
        L14:
            return r0
        L15:
            r2 = move-exception
            goto L23
        L17:
            com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = "probe"
            r4 = 1073(0x431, float:1.504E-42)
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L15
            throw r2     // Catch: java.lang.Throwable -> L15
        L21:
            r2 = move-exception
            r7 = -1
        L23:
            if (r7 != r1) goto L28
            r6.j(r0)
        L28:
            throw r2
    }

    private boolean j(com.ss.android.socialbase.downloader.qv.g r5) throws com.ss.android.socialbase.downloader.up.j {
            r4 = this;
            r4.qv()
        L3:
            r4.xt(r5)     // Catch: java.lang.Throwable -> Le com.ss.android.socialbase.downloader.qv.oq -> L10
            r4.r(r5)     // Catch: java.lang.Throwable -> Le com.ss.android.socialbase.downloader.qv.oq -> L10
            r4.g()
            r5 = 1
            return r5
        Le:
            r0 = move-exception
            goto L13
        L10:
            r5 = move-exception
            goto L8d
        L13:
            java.lang.String r1 = "SegmentReader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = "download: e = "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L6e
            r2.append(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = ", threadIndex = "
            r2.append(r3)     // Catch: java.lang.Throwable -> L6e
            int r3 = r4.cw     // Catch: java.lang.Throwable -> L6e
            r2.append(r3)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = ", reconnect = "
            r2.append(r3)     // Catch: java.lang.Throwable -> L6e
            boolean r3 = r4.ch     // Catch: java.lang.Throwable -> L6e
            r2.append(r3)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = ", closed = "
            r2.append(r3)     // Catch: java.lang.Throwable -> L6e
            boolean r3 = r4.x     // Catch: java.lang.Throwable -> L6e
            r2.append(r3)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6e
            com.ss.android.socialbase.downloader.m.j.up(r1, r2)     // Catch: java.lang.Throwable -> L6e
            boolean r1 = r4.x     // Catch: java.lang.Throwable -> L6e
            r2 = 0
            if (r1 == 0) goto L4d
            r4.g()
            return r2
        L4d:
            boolean r1 = r4.ch     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = "download"
            if (r1 == 0) goto L70
            r4.ch = r2     // Catch: java.lang.Throwable -> L6e
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L6e
        L5d:
            boolean r0 = r4.s     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L65
        L61:
            r4.g()
            goto L3
        L65:
            r4.s = r2     // Catch: java.lang.Throwable -> L6e
            com.ss.android.socialbase.downloader.qv.oq r5 = new com.ss.android.socialbase.downloader.qv.oq     // Catch: java.lang.Throwable -> L6e
            r0 = 5
            r5.<init>(r0, r3)     // Catch: java.lang.Throwable -> L6e
            throw r5     // Catch: java.lang.Throwable -> L6e
        L6e:
            r5 = move-exception
            goto L90
        L70:
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L6e
            boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L7a
            com.ss.android.socialbase.downloader.up.j r0 = (com.ss.android.socialbase.downloader.up.j) r0     // Catch: java.lang.Throwable -> L6e
            goto L80
        L7a:
            com.ss.android.socialbase.downloader.az.m.j(r0, r3)     // Catch: java.lang.Throwable -> L6e com.ss.android.socialbase.downloader.up.j -> L7f
            r0 = 0
            goto L80
        L7f:
            r0 = move-exception
        L80:
            if (r0 == 0) goto L89
            boolean r0 = r4.j(r5, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L89
            goto L61
        L89:
            r4.g()
            return r2
        L8d:
            r4.uf = r5     // Catch: java.lang.Throwable -> L6e
            throw r5     // Catch: java.lang.Throwable -> L6e
        L90:
            r4.g()
            throw r5
    }

    private boolean j(com.ss.android.socialbase.downloader.qv.g r9, com.ss.android.socialbase.downloader.up.j r10) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleDownloadFailed:  e = "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = ", curRetryCount = "
            r0.append(r1)
            int r1 = r8.la
            r0.append(r1)
            java.lang.String r1 = ", retryCount = "
            r0.append(r1)
            int r1 = r8.h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SegmentReader"
            com.ss.android.socialbase.downloader.m.j.up(r1, r0)
            r8.uf = r10
            com.ss.android.socialbase.downloader.qv.i r0 = r8.xt
            r0.xt()
            com.ss.android.socialbase.downloader.qv.m r1 = r8.qv
            com.ss.android.socialbase.downloader.qv.i r3 = r8.xt
            int r6 = r8.la
            int r7 = r8.h
            r2 = r8
            r4 = r9
            r5 = r10
            r1.j(r2, r3, r4, r5, r6, r7)
            int r9 = r2.la
            int r10 = r2.h
            r0 = 1
            if (r9 >= r10) goto L47
            int r9 = r9 + r0
            r2.la = r9
            return r0
        L47:
            boolean r9 = r8.j(r5)
            if (r9 == 0) goto L4e
            return r0
        L4e:
            com.ss.android.socialbase.downloader.qv.m r9 = r2.qv
            com.ss.android.socialbase.downloader.qv.i r10 = r2.xt
            r9.j(r8, r10, r4, r5)
            r9 = 0
            return r9
    }

    private boolean j(com.ss.android.socialbase.downloader.up.j r3) {
            r2 = this;
            boolean r3 = com.ss.android.socialbase.downloader.az.m.cw(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            com.ss.android.socialbase.downloader.qv.i r3 = r2.xt
            java.lang.String r3 = r3.j
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L30
            java.lang.String r1 = "https"
            boolean r3 = r3.startsWith(r1)
            if (r3 != 0) goto L1b
            goto L30
        L1b:
            com.ss.android.socialbase.downloader.ae.cw r3 = r2.jy
            boolean r3 = r3.d()
            if (r3 != 0) goto L24
            return r0
        L24:
            boolean r3 = r2.wq
            if (r3 == 0) goto L29
            return r0
        L29:
            r3 = 1
            r2.wq = r3
            r2.vl()
            return r3
        L30:
            return r0
    }

    private long jy() {
            r5 = this;
            long r0 = r5.mi
            r2 = 0
            r5.mi = r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Lf
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lf:
            return r0
    }

    private void oq() {
            r4 = this;
            com.ss.android.socialbase.downloader.g.g r0 = r4.az
            if (r0 == 0) goto L1f
            java.lang.String r1 = "SegmentReader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "closeConnection: thread = "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1f
            int r3 = r4.cw     // Catch: java.lang.Throwable -> L1f
            r2.append(r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1f
            com.ss.android.socialbase.downloader.m.j.cw(r1, r2)     // Catch: java.lang.Throwable -> L1f
            r0.r()     // Catch: java.lang.Throwable -> L1f
            r0.cw()     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    private void qv() {
            r1 = this;
            r0 = 0
            r1.wq = r0
            r1.vl()
            return
    }

    private void r(com.ss.android.socialbase.downloader.qv.g r41) throws com.ss.android.socialbase.downloader.up.j {
            r40 = this;
            r1 = r40
            r2 = r41
            com.ss.android.socialbase.downloader.qv.cw r3 = r1.vl
            long r4 = java.lang.System.currentTimeMillis()
            r1.m = r4
            long r4 = r2.up()
            r6 = 1
            r7 = 0
            r8 = -1
            com.ss.android.socialbase.downloader.g.g r0 = r1.az     // Catch: java.lang.Throwable -> L328 com.ss.android.socialbase.downloader.up.j -> L333
            java.io.InputStream r10 = r0.j()     // Catch: java.lang.Throwable -> L328 com.ss.android.socialbase.downloader.up.j -> L333
            if (r10 == 0) goto L315
            com.ss.android.socialbase.downloader.ae.m r0 = r1.av     // Catch: java.lang.Throwable -> L2e7 com.ss.android.socialbase.downloader.up.j -> L2f1
            long r11 = r0.tl()     // Catch: java.lang.Throwable -> L2e7 com.ss.android.socialbase.downloader.up.j -> L2f1
            r13 = 0
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L2fb
            com.ss.android.socialbase.downloader.qv.j r15 = r1.j(r3, r10)     // Catch: java.lang.Throwable -> L2e7 com.ss.android.socialbase.downloader.up.j -> L2f1
            boolean r9 = r1.ch     // Catch: java.lang.Throwable -> L2c3 com.ss.android.socialbase.downloader.up.j -> L2cd
            if (r9 != 0) goto L2d7
            boolean r9 = r1.x     // Catch: java.lang.Throwable -> L2c3 com.ss.android.socialbase.downloader.up.j -> L2cd
            if (r9 != 0) goto L2d7
            com.ss.android.socialbase.downloader.qv.m r9 = r1.qv     // Catch: java.lang.Throwable -> L2c3 com.ss.android.socialbase.downloader.up.j -> L2cd
            r9.xt(r1, r2)     // Catch: java.lang.Throwable -> L2c3 com.ss.android.socialbase.downloader.up.j -> L2cd
            com.ss.android.socialbase.downloader.qv.m r9 = r1.qv     // Catch: java.lang.Throwable -> L2c3 com.ss.android.socialbase.downloader.up.j -> L2cd
            com.ss.android.socialbase.downloader.qv.up r9 = r9.r(r1, r2)     // Catch: java.lang.Throwable -> L2c3 com.ss.android.socialbase.downloader.up.j -> L2cd
            long r17 = r2.m()     // Catch: java.lang.Throwable -> L2b1 com.ss.android.socialbase.downloader.up.j -> L2ba
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r21 = 1
            int r23 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r23 <= 0) goto L4e
            goto L56
        L4e:
            if (r0 <= 0) goto L54
            long r11 = r11 + r4
            long r17 = r11 - r21
            goto L56
        L54:
            r17 = r19
        L56:
            int r0 = r15.cw     // Catch: java.lang.Throwable -> L2b1 com.ss.android.socialbase.downloader.up.j -> L2ba
            long r11 = (long) r0
            r23 = r13
            long r13 = r4 + r11
            int r25 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r25 <= 0) goto Lec
            long r17 = r17 + r21
            int r19 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r19 <= 0) goto L83
            long r19 = r13 - r17
            long r11 = r11 - r19
            int r12 = (int) r11
            if (r12 <= 0) goto L83
            if (r12 >= r0) goto L83
            r15.cw = r12     // Catch: java.lang.Throwable -> L75 com.ss.android.socialbase.downloader.up.j -> L7c
            r13 = r17
            goto L83
        L75:
            r0 = move-exception
            r26 = r4
            r18 = 0
            goto L33e
        L7c:
            r0 = move-exception
            r26 = r4
            r18 = 0
            goto L3b2
        L83:
            r1.tj = r13     // Catch: java.lang.Throwable -> L75 com.ss.android.socialbase.downloader.up.j -> L7c
            r9.xt(r15)     // Catch: java.lang.Throwable -> L75 com.ss.android.socialbase.downloader.up.j -> L7c
            java.io.Closeable[] r0 = new java.io.Closeable[r6]
            r0[r7] = r10
            com.ss.android.socialbase.downloader.az.m.j(r0)
            com.ss.android.socialbase.downloader.qv.j r0 = r3.xt()     // Catch: java.lang.Throwable -> L9d
            r0.cw = r8     // Catch: java.lang.Throwable -> L9a
            r9.xt(r0)     // Catch: java.lang.Throwable -> L9a
        L98:
            r9 = 0
            goto L9f
        L9a:
            r9 = r0
            goto L9f
        L9d:
            goto L98
        L9f:
            if (r9 == 0) goto La4
            r3.j(r9)
        La4:
            long r8 = java.lang.System.currentTimeMillis()
            r1.ae = r8
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 <= 0) goto Le6
            com.ss.android.socialbase.downloader.jy.j r15 = r1.ws
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.jy
            java.lang.String r3 = r1.tl
            java.lang.String r8 = r1.g
            java.lang.String r9 = r1.oq
            boolean r10 = r1.x
            if (r10 != 0) goto Lc4
            boolean r10 = r1.ch
            if (r10 == 0) goto Lc1
            goto Lc4
        Lc1:
            r20 = 0
            goto Lc6
        Lc4:
            r20 = 1
        Lc6:
            com.ss.android.socialbase.downloader.g.g r6 = r1.az
            com.ss.android.socialbase.downloader.up.j r7 = r1.uf
            long r23 = r13 - r4
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r10 = r1.ae
            long r12 = r1.m
            long r10 = r10 - r12
            long r25 = r4.toNanos(r10)
            r16 = r0
            r17 = r3
            r21 = r6
            r22 = r7
            r18 = r8
            r19 = r9
            com.ss.android.socialbase.downloader.tl.j.j(r15, r16, r17, r18, r19, r20, r21, r22, r23, r25)
        Le6:
            com.ss.android.socialbase.downloader.qv.m r0 = r1.qv
            r0.cw(r1, r2)
            return
        Lec:
            r1.tj = r13     // Catch: java.lang.Throwable -> L75 com.ss.android.socialbase.downloader.up.j -> L7c
            r9.xt(r15)     // Catch: java.lang.Throwable -> L75 com.ss.android.socialbase.downloader.up.j -> L7c
            r11 = r17
        Lf3:
            boolean r0 = r1.l     // Catch: java.lang.Throwable -> L2a7 com.ss.android.socialbase.downloader.up.j -> L2ac
            if (r0 == 0) goto L19f
            monitor-enter(r40)     // Catch: java.lang.Throwable -> L176 com.ss.android.socialbase.downloader.up.j -> L17e
            r1.l = r7     // Catch: java.lang.Throwable -> L186
            boolean r0 = r1.ch     // Catch: java.lang.Throwable -> L186
            if (r0 != 0) goto L18e
            boolean r0 = r1.x     // Catch: java.lang.Throwable -> L186
            if (r0 != 0) goto L18e
            monitor-exit(r40)     // Catch: java.lang.Throwable -> L186
            com.ss.android.socialbase.downloader.qv.m r15 = r1.qv     // Catch: java.lang.Throwable -> L176 com.ss.android.socialbase.downloader.up.j -> L17e
            monitor-enter(r15)     // Catch: java.lang.Throwable -> L176 com.ss.android.socialbase.downloader.up.j -> L17e
            r17 = 1
            r18 = 0
            long r6 = r1.mi     // Catch: java.lang.Throwable -> L159
            int r0 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r0 == 0) goto L168
            java.lang.String r0 = "SegmentReader"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L159
            java.lang.String r7 = "loopAndRead:  change readEnd = "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L159
            r6.append(r11)     // Catch: java.lang.Throwable -> L159
            java.lang.String r7 = ", segmentNewEndOffset = "
            r6.append(r7)     // Catch: java.lang.Throwable -> L159
            long r11 = r1.mi     // Catch: java.lang.Throwable -> L159
            r6.append(r11)     // Catch: java.lang.Throwable -> L159
            java.lang.String r7 = ", segment = "
            r6.append(r7)     // Catch: java.lang.Throwable -> L159
            r6.append(r2)     // Catch: java.lang.Throwable -> L159
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L159
            com.ss.android.socialbase.downloader.m.j.cw(r0, r6)     // Catch: java.lang.Throwable -> L159
            long r11 = r1.jy()     // Catch: java.lang.Throwable -> L159
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L168
            long r6 = r11 + r21
            long r21 = r13 - r6
            int r0 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r0 <= 0) goto L15d
            java.lang.String r0 = "SegmentReader"
            java.lang.String r8 = "loopAndRead: redundant = "
            r26 = r4
            java.lang.String r4 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> L157
            java.lang.String r4 = r8.concat(r4)     // Catch: java.lang.Throwable -> L157
            com.ss.android.socialbase.downloader.m.j.up(r0, r4)     // Catch: java.lang.Throwable -> L157
            goto L15f
        L157:
            r0 = move-exception
            goto L16c
        L159:
            r0 = move-exception
            r26 = r4
            goto L16c
        L15d:
            r26 = r4
        L15f:
            r1.tj = r6     // Catch: java.lang.Throwable -> L165
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L165
            r13 = r6
            goto L1fd
        L165:
            r0 = move-exception
            r13 = r6
            goto L16c
        L168:
            r26 = r4
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L157
            goto L1a5
        L16c:
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L157
            throw r0     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
        L16e:
            r0 = move-exception
        L16f:
            r15 = 0
            goto L33e
        L172:
            r0 = move-exception
        L173:
            r15 = 0
            goto L3b2
        L176:
            r0 = move-exception
            r26 = r4
            r17 = 1
        L17b:
            r18 = 0
            goto L16f
        L17e:
            r0 = move-exception
            r26 = r4
            r17 = 1
        L183:
            r18 = 0
            goto L173
        L186:
            r0 = move-exception
            r26 = r4
            r17 = 1
            r18 = 0
            goto L19d
        L18e:
            r26 = r4
            r17 = 1
            r18 = 0
            com.ss.android.socialbase.downloader.qv.av r0 = new com.ss.android.socialbase.downloader.qv.av     // Catch: java.lang.Throwable -> L19c
            java.lang.String r4 = "loopAndRead"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L19c
            throw r0     // Catch: java.lang.Throwable -> L19c
        L19c:
            r0 = move-exception
        L19d:
            monitor-exit(r40)     // Catch: java.lang.Throwable -> L19c
            throw r0     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
        L19f:
            r26 = r4
            r17 = 1
            r18 = 0
        L1a5:
            com.ss.android.socialbase.downloader.qv.j r15 = r3.xt()     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            byte[] r0 = r15.j     // Catch: java.lang.Throwable -> L1b9 com.ss.android.socialbase.downloader.up.j -> L1bc
            int r0 = r10.read(r0)     // Catch: java.lang.Throwable -> L1b9 com.ss.android.socialbase.downloader.up.j -> L1bc
            r15.cw = r0     // Catch: java.lang.Throwable -> L1b9 com.ss.android.socialbase.downloader.up.j -> L1bc
            r4 = -1
            if (r0 != r4) goto L1bf
            r9.xt(r15)     // Catch: java.lang.Throwable -> L1b9 com.ss.android.socialbase.downloader.up.j -> L1bc
            r9 = 0
            goto L1fd
        L1b9:
            r0 = move-exception
            goto L33e
        L1bc:
            r0 = move-exception
            goto L3b2
        L1bf:
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L1b9 com.ss.android.socialbase.downloader.up.j -> L1bc
            long r13 = r13 + r4
            int r6 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r6 <= 0) goto L29b
            long r21 = r11 + r21
            int r6 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r6 <= 0) goto L1d7
            long r6 = r13 - r21
            long r4 = r4 - r6
            int r5 = (int) r4     // Catch: java.lang.Throwable -> L1b9 com.ss.android.socialbase.downloader.up.j -> L1bc
            if (r5 <= 0) goto L1d7
            if (r5 >= r0) goto L1d7
            r15.cw = r5     // Catch: java.lang.Throwable -> L1b9 com.ss.android.socialbase.downloader.up.j -> L1bc
            r13 = r21
        L1d7:
            r1.tj = r13     // Catch: java.lang.Throwable -> L1b9 com.ss.android.socialbase.downloader.up.j -> L1bc
            r9.xt(r15)     // Catch: java.lang.Throwable -> L1b9 com.ss.android.socialbase.downloader.up.j -> L1bc
            java.lang.String r0 = "SegmentReader"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            java.lang.String r5 = "loopAndRead: bytesRead = "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            long r5 = r13 - r26
            r4.append(r5)     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            java.lang.String r5 = ", url = "
            r4.append(r5)     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            com.ss.android.socialbase.downloader.qv.i r5 = r1.xt     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            java.lang.String r5 = r5.j     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            r4.append(r5)     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            com.ss.android.socialbase.downloader.m.j.cw(r0, r4)     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
        L1fd:
            int r0 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            if (r0 <= 0) goto L209
            int r0 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r0 == 0) goto L209
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L20b
        L209:
            r4 = 1
            goto L236
        L20b:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            java.lang.String r4 = "range[%d, %d] , but readCurrent[%d] , readStart[%d]"
            java.lang.Long r5 = java.lang.Long.valueOf(r26)     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            java.lang.Long r6 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            java.lang.Long r7 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            java.lang.Long r8 = java.lang.Long.valueOf(r26)     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            r11[r18] = r5     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            r11[r17] = r6     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            r5 = 2
            r11[r5] = r7     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            r5 = 3
            r11[r5] = r8     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            java.lang.String r4 = java.lang.String.format(r4, r11)     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            r5 = 1051(0x41b, float:1.473E-42)
            r0.<init>(r5, r4)     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
            throw r0     // Catch: java.lang.Throwable -> L16e com.ss.android.socialbase.downloader.up.j -> L172
        L236:
            java.io.Closeable[] r0 = new java.io.Closeable[r4]
            r0[r18] = r10
            com.ss.android.socialbase.downloader.az.m.j(r0)
            if (r9 == 0) goto L249
            com.ss.android.socialbase.downloader.qv.j r0 = r3.xt()     // Catch: java.lang.Throwable -> L24e
            r4 = -1
            r0.cw = r4     // Catch: java.lang.Throwable -> L24b
            r9.xt(r0)     // Catch: java.lang.Throwable -> L24b
        L249:
            r9 = 0
            goto L250
        L24b:
            r9 = r0
            goto L250
        L24e:
            goto L249
        L250:
            if (r9 == 0) goto L255
            r3.j(r9)
        L255:
            long r3 = java.lang.System.currentTimeMillis()
            r1.ae = r3
            int r0 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r0 <= 0) goto Le6
            com.ss.android.socialbase.downloader.jy.j r0 = r1.ws
            com.ss.android.socialbase.downloader.ae.cw r3 = r1.jy
            java.lang.String r4 = r1.tl
            java.lang.String r5 = r1.g
            java.lang.String r6 = r1.oq
            boolean r7 = r1.x
            if (r7 != 0) goto L275
            boolean r7 = r1.ch
            if (r7 == 0) goto L272
            goto L275
        L272:
            r33 = 0
            goto L277
        L275:
            r33 = 1
        L277:
            com.ss.android.socialbase.downloader.g.g r7 = r1.az
            com.ss.android.socialbase.downloader.up.j r8 = r1.uf
            long r36 = r13 - r26
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r10 = r1.ae
            long r12 = r1.m
            long r10 = r10 - r12
            long r38 = r9.toNanos(r10)
            r28 = r0
            r29 = r3
            r30 = r4
            r31 = r5
            r32 = r6
            r34 = r7
            r35 = r8
            com.ss.android.socialbase.downloader.tl.j.j(r28, r29, r30, r31, r32, r33, r34, r35, r36, r38)
            goto Le6
        L29b:
            r1.tj = r13     // Catch: java.lang.Throwable -> L1b9 com.ss.android.socialbase.downloader.up.j -> L1bc
            r9.xt(r15)     // Catch: java.lang.Throwable -> L1b9 com.ss.android.socialbase.downloader.up.j -> L1bc
            r4 = r26
            r6 = 1
            r7 = 0
            r8 = -1
            goto Lf3
        L2a7:
            r0 = move-exception
            r26 = r4
            goto L17b
        L2ac:
            r0 = move-exception
            r26 = r4
            goto L183
        L2b1:
            r0 = move-exception
            r26 = r4
            r18 = 0
            r13 = r26
            goto L33e
        L2ba:
            r0 = move-exception
            r26 = r4
            r18 = 0
            r13 = r26
            goto L3b2
        L2c3:
            r0 = move-exception
            r26 = r4
            r18 = 0
        L2c8:
            r13 = r26
            r9 = 0
            goto L33e
        L2cd:
            r0 = move-exception
            r26 = r4
            r18 = 0
        L2d2:
            r13 = r26
            r9 = 0
            goto L3b2
        L2d7:
            r26 = r4
            r18 = 0
            com.ss.android.socialbase.downloader.qv.av r0 = new com.ss.android.socialbase.downloader.qv.av     // Catch: java.lang.Throwable -> L2e3 com.ss.android.socialbase.downloader.up.j -> L2e5
            java.lang.String r4 = "probe"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2e3 com.ss.android.socialbase.downloader.up.j -> L2e5
            throw r0     // Catch: java.lang.Throwable -> L2e3 com.ss.android.socialbase.downloader.up.j -> L2e5
        L2e3:
            r0 = move-exception
            goto L2c8
        L2e5:
            r0 = move-exception
            goto L2d2
        L2e7:
            r0 = move-exception
            r26 = r4
            r18 = 0
        L2ec:
            r13 = r26
            r9 = 0
            goto L16f
        L2f1:
            r0 = move-exception
            r26 = r4
            r18 = 0
        L2f6:
            r13 = r26
            r9 = 0
            goto L173
        L2fb:
            r26 = r4
            r18 = 0
            com.ss.android.socialbase.downloader.up.ae r0 = new com.ss.android.socialbase.downloader.up.ae     // Catch: java.lang.Throwable -> L311 com.ss.android.socialbase.downloader.up.j -> L313
            java.lang.String r4 = "the content-length is 0, contentLength = "
            java.lang.String r5 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L311 com.ss.android.socialbase.downloader.up.j -> L313
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> L311 com.ss.android.socialbase.downloader.up.j -> L313
            r5 = 1004(0x3ec, float:1.407E-42)
            r0.<init>(r5, r4)     // Catch: java.lang.Throwable -> L311 com.ss.android.socialbase.downloader.up.j -> L313
            throw r0     // Catch: java.lang.Throwable -> L311 com.ss.android.socialbase.downloader.up.j -> L313
        L311:
            r0 = move-exception
            goto L2ec
        L313:
            r0 = move-exception
            goto L2f6
        L315:
            r26 = r4
            r18 = 0
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L311 com.ss.android.socialbase.downloader.up.j -> L313
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L311 com.ss.android.socialbase.downloader.up.j -> L313
            java.lang.String r5 = "inputStream is null"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L311 com.ss.android.socialbase.downloader.up.j -> L313
            r5 = 1042(0x412, float:1.46E-42)
            r0.<init>(r5, r4)     // Catch: java.lang.Throwable -> L311 com.ss.android.socialbase.downloader.up.j -> L313
            throw r0     // Catch: java.lang.Throwable -> L311 com.ss.android.socialbase.downloader.up.j -> L313
        L328:
            r0 = move-exception
            r26 = r4
            r18 = 0
            r13 = r26
            r9 = 0
            r10 = 0
            goto L16f
        L333:
            r0 = move-exception
            r26 = r4
            r18 = 0
            r13 = r26
            r9 = 0
            r10 = 0
            goto L173
        L33e:
            java.lang.String r4 = "SegmentReader"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3ab
            java.lang.String r6 = "loopAndRead: "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3ab
            r5.append(r0)     // Catch: java.lang.Throwable -> L3ab
            java.lang.String r6 = ",stack = "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3ab
            java.lang.String r6 = android.util.Log.getStackTraceString(r0)     // Catch: java.lang.Throwable -> L3ab
            r5.append(r6)     // Catch: java.lang.Throwable -> L3ab
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3ab
            com.ss.android.socialbase.downloader.m.j.up(r4, r5)     // Catch: java.lang.Throwable -> L3ab
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L3ab
            java.lang.String r4 = "loopAndRead"
            com.ss.android.socialbase.downloader.az.m.j(r0, r4)     // Catch: java.lang.Throwable -> L3ab com.ss.android.socialbase.downloader.up.j -> L3ae
            r4 = 1
            java.io.Closeable[] r0 = new java.io.Closeable[r4]
            r0[r18] = r10
            com.ss.android.socialbase.downloader.az.m.j(r0)
            if (r9 == 0) goto L380
            if (r15 != 0) goto L375
            com.ss.android.socialbase.downloader.qv.j r15 = r3.xt()     // Catch: java.lang.Throwable -> L377
        L375:
            r4 = -1
            goto L379
        L377:
            goto L380
        L379:
            r15.cw = r4     // Catch: java.lang.Throwable -> L377
            r9.xt(r15)     // Catch: java.lang.Throwable -> L377
            r9 = 0
            goto L381
        L380:
            r9 = r15
        L381:
            if (r9 == 0) goto L386
            r3.j(r9)
        L386:
            long r3 = java.lang.System.currentTimeMillis()
            r1.ae = r3
            int r0 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r0 <= 0) goto Le6
            com.ss.android.socialbase.downloader.jy.j r0 = r1.ws
            com.ss.android.socialbase.downloader.ae.cw r3 = r1.jy
            java.lang.String r4 = r1.tl
            java.lang.String r5 = r1.g
            java.lang.String r6 = r1.oq
            boolean r7 = r1.x
            if (r7 != 0) goto L3a7
            boolean r7 = r1.ch
            if (r7 == 0) goto L3a3
            goto L3a7
        L3a3:
            r33 = 0
            goto L277
        L3a7:
            r33 = 1
            goto L277
        L3ab:
            r0 = move-exception
            r4 = 1
            goto L3b5
        L3ae:
            r0 = move-exception
            r1.uf = r0     // Catch: java.lang.Throwable -> L3ab
            throw r0     // Catch: java.lang.Throwable -> L3ab
        L3b2:
            r1.uf = r0     // Catch: java.lang.Throwable -> L3ab
            throw r0     // Catch: java.lang.Throwable -> L3ab
        L3b5:
            java.io.Closeable[] r5 = new java.io.Closeable[r4]
            r5[r18] = r10
            com.ss.android.socialbase.downloader.az.m.j(r5)
            if (r9 == 0) goto L3cf
            if (r15 != 0) goto L3c4
            com.ss.android.socialbase.downloader.qv.j r15 = r3.xt()     // Catch: java.lang.Throwable -> L3c6
        L3c4:
            r5 = -1
            goto L3c8
        L3c6:
            goto L3cf
        L3c8:
            r15.cw = r5     // Catch: java.lang.Throwable -> L3c6
            r9.xt(r15)     // Catch: java.lang.Throwable -> L3c6
            r9 = 0
            goto L3d0
        L3cf:
            r9 = r15
        L3d0:
            if (r9 == 0) goto L3d5
            r3.j(r9)
        L3d5:
            long r5 = java.lang.System.currentTimeMillis()
            r1.ae = r5
            int r3 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r3 <= 0) goto L419
            com.ss.android.socialbase.downloader.jy.j r3 = r1.ws
            com.ss.android.socialbase.downloader.ae.cw r5 = r1.jy
            java.lang.String r6 = r1.tl
            java.lang.String r7 = r1.g
            java.lang.String r8 = r1.oq
            boolean r9 = r1.x
            if (r9 != 0) goto L3f5
            boolean r9 = r1.ch
            if (r9 == 0) goto L3f2
            goto L3f5
        L3f2:
            r33 = 0
            goto L3f7
        L3f5:
            r33 = 1
        L3f7:
            com.ss.android.socialbase.downloader.g.g r4 = r1.az
            com.ss.android.socialbase.downloader.up.j r9 = r1.uf
            long r36 = r13 - r26
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r11 = r1.ae
            long r13 = r1.m
            long r11 = r11 - r13
            long r38 = r10.toNanos(r11)
            r28 = r3
            r34 = r4
            r29 = r5
            r30 = r6
            r31 = r7
            r32 = r8
            r35 = r9
            com.ss.android.socialbase.downloader.tl.j.j(r28, r29, r30, r31, r32, r33, r34, r35, r36, r38)
        L419:
            com.ss.android.socialbase.downloader.qv.m r3 = r1.qv
            r3.cw(r1, r2)
            throw r0
    }

    private void vl() {
            r1 = this;
            com.ss.android.socialbase.downloader.qv.i r0 = r1.xt
            boolean r0 = r0.r
            if (r0 == 0) goto Ld
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.jy
            int r0 = r0.c()
            goto L13
        Ld:
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.jy
            int r0 = r0.gx()
        L13:
            r1.h = r0
            r0 = 0
            r1.la = r0
            return
    }

    private void xt(com.ss.android.socialbase.downloader.qv.g r4) throws com.ss.android.socialbase.downloader.up.j, com.ss.android.socialbase.downloader.up.oq {
            r3 = this;
            r3.cw(r4)
            com.ss.android.socialbase.downloader.qv.m r0 = r3.qv
            com.ss.android.socialbase.downloader.qv.i r1 = r3.xt
            com.ss.android.socialbase.downloader.ae.m r2 = r3.av
            r0.j(r3, r4, r1, r2)
            com.ss.android.socialbase.downloader.qv.i r4 = r3.xt
            r4.cw()
            return
    }

    boolean ae() {
            r1 = this;
            boolean r0 = r1.ed
            return r0
    }

    public long cw() {
            r8 = this;
            com.ss.android.socialbase.downloader.qv.m r0 = r8.qv
            monitor-enter(r0)
            long r1 = r8.tj     // Catch: java.lang.Throwable -> L14
            long r3 = r8.w     // Catch: java.lang.Throwable -> L14
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L16
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L16
            long r1 = r1 - r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r1
        L14:
            r1 = move-exception
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r5
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    public void cw(boolean r1) {
            r0 = this;
            r0.c = r1
            return
    }

    long j(long r2, long r4) {
            r1 = this;
            com.ss.android.socialbase.downloader.az.up r0 = r1.gx
            if (r0 != 0) goto L7
            r2 = -1
            return r2
        L7:
            long r2 = r0.xt(r2, r4)
            return r2
    }

    void j() {
            r7 = this;
            com.ss.android.socialbase.downloader.qv.i r0 = r7.xt
            com.ss.android.socialbase.downloader.qv.m r1 = r7.qv     // Catch: java.lang.Throwable -> L22
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L22
            long r2 = r7.cw()     // Catch: java.lang.Throwable -> L18
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1a
            long r4 = r7.f     // Catch: java.lang.Throwable -> L18
            long r4 = r4 + r2
            r7.f = r4     // Catch: java.lang.Throwable -> L18
            r0.j(r2)     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r0 = move-exception
            goto L20
        L1a:
            r2 = -1
            r7.tj = r2     // Catch: java.lang.Throwable -> L18
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            return
        L20:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L22
        L22:
            return
    }

    void j(java.util.concurrent.Future r1) {
            r0 = this;
            r0.v = r1
            return
    }

    public void j(boolean r4) {
            r3 = this;
            java.lang.String r0 = "SegmentReader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "reconnect: threadIndex = "
            r1.<init>(r2)
            int r2 = r3.cw
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
            monitor-enter(r3)
            r3.s = r4     // Catch: java.lang.Throwable -> L3e
            r4 = 1
            r3.ch = r4     // Catch: java.lang.Throwable -> L3e
            r3.l = r4     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3e
            r3.oq()
            java.lang.Thread r4 = r3.a
            if (r4 == 0) goto L3d
            java.lang.String r0 = "SegmentReader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "reconnect: t.interrupt threadIndex = "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3d
            int r2 = r3.cw     // Catch: java.lang.Throwable -> L3d
            r1.append(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3d
            com.bytedance.sdk.component.utils.vl.j(r0, r1)     // Catch: java.lang.Throwable -> L3d
            r4.interrupt()     // Catch: java.lang.Throwable -> L3d
        L3d:
            return
        L3e:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3e
            throw r4
    }

    public boolean j(long r7) {
            r6 = this;
            long r0 = r6.kt
            r2 = 0
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 > 0) goto Le
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto Le
            return r2
        Le:
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 <= 0) goto L17
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L17
            return r2
        L17:
            r6.mi = r7
            r7 = 1
            r6.l = r7
            return r7
    }

    boolean j(com.ss.android.socialbase.downloader.qv.i r3) {
            r2 = this;
            int r0 = r2.rn
            r1 = 30
            if (r0 < r1) goto L8
            r3 = 0
            return r3
        L8:
            r1 = 1
            int r0 = r0 + r1
            r2.rn = r0
            com.ss.android.socialbase.downloader.qv.i r0 = r2.xt
            if (r0 == 0) goto L13
            r0.xt(r2)
        L13:
            r3.j(r2)
            r2.xt = r3
            r2.vl()
            return r1
    }

    public void m() {
            r1 = this;
            r0 = 0
            r1.j(r0)
            return
    }

    public long r() {
            r2 = this;
            long r0 = r2.tj
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r0 = 0
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L37
            r5.a = r1     // Catch: java.lang.Throwable -> L37
            com.ss.android.socialbase.downloader.qv.m r1 = r5.qv     // Catch: java.lang.Throwable -> L37
            r1.j(r5)     // Catch: java.lang.Throwable -> L37
            com.ss.android.socialbase.downloader.qv.i r1 = r5.xt     // Catch: java.lang.Throwable -> L37
            r1.j(r5)     // Catch: java.lang.Throwable -> L37
        L16:
            com.ss.android.socialbase.downloader.qv.m r1 = r5.qv     // Catch: java.lang.Throwable -> L37
            com.ss.android.socialbase.downloader.qv.i r2 = r5.xt     // Catch: java.lang.Throwable -> L37
            com.ss.android.socialbase.downloader.qv.g r1 = r1.j(r5, r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "SegmentReader"
            if (r1 != 0) goto L3a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "no more segment, thread_index = "
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L37
            int r3 = r5.cw     // Catch: java.lang.Throwable -> L37
            r1.append(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L37
            com.ss.android.socialbase.downloader.m.j.cw(r2, r1)     // Catch: java.lang.Throwable -> L37
            goto Lb8
        L37:
            r1 = move-exception
            goto Ld7
        L3a:
            r5.j = r1     // Catch: java.lang.Throwable -> L37
            boolean r3 = r5.j(r1)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.qv.oq -> L52
            if (r3 == 0) goto L54
            java.util.List<com.ss.android.socialbase.downloader.qv.g> r3 = r5.i     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.qv.oq -> L52
            r3.add(r1)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.qv.oq -> L52
            r5.j = r0     // Catch: java.lang.Throwable -> L37
            goto Lcb
        L4b:
            r2.j(r5, r1)     // Catch: java.lang.Throwable -> L37
            goto L16
        L4f:
            r2 = move-exception
            goto Lcf
        L52:
            r3 = move-exception
            goto L82
        L54:
            boolean r3 = r5.x     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.qv.oq -> L52
            if (r3 != 0) goto L7d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.qv.oq -> L52
            java.lang.String r4 = "download segment failed, segment = "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.qv.oq -> L52
            r3.append(r1)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.qv.oq -> L52
            java.lang.String r4 = ", thread_index = "
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.qv.oq -> L52
            int r4 = r5.cw     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.qv.oq -> L52
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.qv.oq -> L52
            java.lang.String r4 = ", failedException = "
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.qv.oq -> L52
            com.ss.android.socialbase.downloader.up.j r4 = r5.uf     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.qv.oq -> L52
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.qv.oq -> L52
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.qv.oq -> L52
            com.ss.android.socialbase.downloader.m.j.up(r2, r3)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.qv.oq -> L52
        L7d:
            r5.j = r0     // Catch: java.lang.Throwable -> L37
        L7f:
            com.ss.android.socialbase.downloader.qv.m r2 = r5.qv     // Catch: java.lang.Throwable -> L37
            goto Lb5
        L82:
            java.lang.String r4 = "run: SegmentApplyException, e = "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r4.concat(r3)     // Catch: java.lang.Throwable -> L4f
            com.ss.android.socialbase.downloader.m.j.up(r2, r3)     // Catch: java.lang.Throwable -> L4f
            int r3 = r5.p     // Catch: java.lang.Throwable -> L4f
            r4 = 50
            if (r3 < r4) goto Lc5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = "segment apply failed "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4f
            int r4 = r5.p     // Catch: java.lang.Throwable -> L4f
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = "times, thread_index = "
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f
            int r4 = r5.cw     // Catch: java.lang.Throwable -> L4f
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4f
            com.ss.android.socialbase.downloader.m.j.up(r2, r3)     // Catch: java.lang.Throwable -> L4f
            r5.j = r0     // Catch: java.lang.Throwable -> L37
            goto L7f
        Lb5:
            r2.j(r5, r1)     // Catch: java.lang.Throwable -> L37
        Lb8:
            com.ss.android.socialbase.downloader.qv.i r1 = r5.xt     // Catch: java.lang.Throwable -> Lc2
            r1.xt(r5)     // Catch: java.lang.Throwable -> Lc2
            com.ss.android.socialbase.downloader.qv.m r1 = r5.qv     // Catch: java.lang.Throwable -> Lc2
            r1.xt(r5)     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r5.a = r0
            return
        Lc5:
            int r3 = r3 + 1
            r5.p = r3     // Catch: java.lang.Throwable -> L4f
            r5.j = r0     // Catch: java.lang.Throwable -> L37
        Lcb:
            com.ss.android.socialbase.downloader.qv.m r2 = r5.qv     // Catch: java.lang.Throwable -> L37
            goto L4b
        Lcf:
            r5.j = r0     // Catch: java.lang.Throwable -> L37
            com.ss.android.socialbase.downloader.qv.m r3 = r5.qv     // Catch: java.lang.Throwable -> L37
            r3.j(r5, r1)     // Catch: java.lang.Throwable -> L37
            throw r2     // Catch: java.lang.Throwable -> L37
        Ld7:
            com.bytedance.sdk.component.utils.vl.j(r1)     // Catch: java.lang.Throwable -> Le7
            com.ss.android.socialbase.downloader.qv.i r1 = r5.xt     // Catch: java.lang.Throwable -> Le4
            r1.xt(r5)     // Catch: java.lang.Throwable -> Le4
            com.ss.android.socialbase.downloader.qv.m r1 = r5.qv     // Catch: java.lang.Throwable -> Le4
            r1.xt(r5)     // Catch: java.lang.Throwable -> Le4
        Le4:
            r5.a = r0
            return
        Le7:
            r1 = move-exception
            com.ss.android.socialbase.downloader.qv.i r2 = r5.xt     // Catch: java.lang.Throwable -> Lf2
            r2.xt(r5)     // Catch: java.lang.Throwable -> Lf2
            com.ss.android.socialbase.downloader.qv.m r2 = r5.qv     // Catch: java.lang.Throwable -> Lf2
            r2.xt(r5)     // Catch: java.lang.Throwable -> Lf2
        Lf2:
            r5.a = r0
            throw r1
    }

    long tl() {
            r2 = this;
            long r0 = r2.w
            return r0
    }

    public void up() {
            r3 = this;
            java.lang.String r0 = "SegmentReader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "close: threadIndex = "
            r1.<init>(r2)
            int r2 = r3.cw
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
            monitor-enter(r3)
            r0 = 1
            r3.x = r0     // Catch: java.lang.Throwable -> L2f
            r3.l = r0     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            r3.oq()
            java.util.concurrent.Future r1 = r3.v
            if (r1 == 0) goto L2e
            r2 = 0
            r3.v = r2
            r1.cancel(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L2e:
            return
        L2f:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r0
    }

    public long xt() {
            r5 = this;
            com.ss.android.socialbase.downloader.qv.m r0 = r5.qv
            monitor-enter(r0)
            long r1 = r5.f     // Catch: java.lang.Throwable -> Lc
            long r3 = r5.cw()     // Catch: java.lang.Throwable -> Lc
            long r1 = r1 + r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    void xt(long r7) {
            r6 = this;
            long r0 = r6.tj
            com.ss.android.socialbase.downloader.az.up r2 = r6.gx
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L2d
            if (r2 != 0) goto Ld
            goto L2d
        Ld:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "markProgress: curSegmentReadOffset = "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = ", threadIndex = "
            r3.append(r4)
            int r4 = r6.cw
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "SegmentReader"
            com.bytedance.sdk.component.utils.vl.j(r4, r3)
            r2.j(r0, r7)
        L2d:
            return
    }

    void xt(boolean r1) {
            r0 = this;
            r0.ed = r1
            return
    }
}
