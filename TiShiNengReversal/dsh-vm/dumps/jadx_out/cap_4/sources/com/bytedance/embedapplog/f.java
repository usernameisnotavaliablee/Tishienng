package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f implements android.os.Handler.Callback, java.util.Comparator<com.bytedance.embedapplog.ya> {
    private static long jy;
    private static com.bytedance.embedapplog.f xt;
    private com.bytedance.embedapplog.wq ae;
    private com.bytedance.embedapplog.mi cw;
    private com.bytedance.embedapplog.ch g;
    public android.app.Application j;

    /* renamed from: m, reason: collision with root package name */
    private com.bytedance.embedapplog.sm f2077m;
    private com.bytedance.embedapplog.util.j oq;
    private android.os.Handler qv;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.embedapplog.rn f2078r;
    private android.os.Handler tl;
    private final java.util.ArrayList<com.bytedance.embedapplog.ya> up;
    private com.bytedance.embedapplog.x vl;

    private f() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 32
            r0.<init>(r1)
            r2.up = r0
            return
    }

    public static void j() {
            com.bytedance.embedapplog.f r0 = com.bytedance.embedapplog.f.xt
            if (r0 == 0) goto L1f
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = com.bytedance.embedapplog.f.jy
            long r2 = r0 - r2
            long r2 = java.lang.Math.abs(r2)
            r4 = 10000(0x2710, double:4.9407E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1f
            com.bytedance.embedapplog.f.jy = r0
            com.bytedance.embedapplog.f r0 = com.bytedance.embedapplog.f.xt
            r1 = 0
            r2 = 1
            r0.j(r1, r2)
        L1f:
            return
    }

    public static void j(com.bytedance.embedapplog.ya r7) {
            com.bytedance.embedapplog.f r0 = com.bytedance.embedapplog.f.xt
            r1 = 0
            if (r0 != 0) goto Le
            java.lang.String r0 = "Init comes First!"
            com.bytedance.embedapplog.uc.xt(r0, r1)
            com.bytedance.embedapplog.a.j(r7)
            return
        Le:
            long r2 = r7.xt
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L19
            com.bytedance.embedapplog.uc.xt(r1)
        L19:
            java.util.ArrayList<com.bytedance.embedapplog.ya> r1 = r0.up
            monitor-enter(r1)
            java.util.ArrayList<com.bytedance.embedapplog.ya> r2 = r0.up     // Catch: java.lang.Throwable -> L41
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList<com.bytedance.embedapplog.ya> r3 = r0.up     // Catch: java.lang.Throwable -> L41
            r3.add(r7)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            int r7 = r2 % 10
            if (r7 != 0) goto L40
            android.os.Handler r7 = r0.qv
            if (r7 == 0) goto L40
            r1 = 4
            r7.removeMessages(r1)
            android.os.Handler r7 = r0.qv
            if (r2 != 0) goto L3b
            r2 = 500(0x1f4, double:2.47E-321)
            goto L3d
        L3b:
            r2 = 250(0xfa, double:1.235E-321)
        L3d:
            r7.sendEmptyMessageDelayed(r1, r2)
        L40:
            return
        L41:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            throw r7
    }

    public static void j(java.lang.String[] r3) {
            com.bytedance.embedapplog.f r0 = com.bytedance.embedapplog.f.xt
            if (r0 != 0) goto Lf
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Init comes First!"
            r3.<init>(r0)
            com.bytedance.embedapplog.uc.xt(r3)
            return
        Lf:
            android.os.Handler r1 = r0.qv
            if (r1 == 0) goto L21
            r2 = 4
            r1.removeMessages(r2)
            android.os.Handler r0 = r0.qv
            r1 = 5
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r3.sendToTarget()
        L21:
            return
    }

    private void j(java.lang.String[] r7, boolean r8) {
            r6 = this;
            java.util.ArrayList<com.bytedance.embedapplog.ya> r0 = r6.up
            monitor-enter(r0)
            java.util.ArrayList<com.bytedance.embedapplog.ya> r1 = r6.up     // Catch: java.lang.Throwable -> Lfc
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.Throwable -> Lfc
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> Lfc
            java.util.ArrayList<com.bytedance.embedapplog.ya> r2 = r6.up     // Catch: java.lang.Throwable -> Lfc
            r2.clear()     // Catch: java.lang.Throwable -> Lfc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lfc
            r0 = 0
            if (r7 == 0) goto L2d
            int r2 = r1.size()
            int r3 = r7.length
            int r2 = r2 + r3
            r1.ensureCapacity(r2)
            int r2 = r7.length
            r3 = 0
        L1f:
            if (r3 >= r2) goto L2d
            r4 = r7[r3]
            com.bytedance.embedapplog.ya r4 = com.bytedance.embedapplog.ya.j(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto L1f
        L2d:
            com.bytedance.embedapplog.rn r7 = r6.f2078r
            boolean r7 = r7.j(r1)
            int r2 = r1.size()
            if (r2 <= 0) goto Lfb
            com.bytedance.embedapplog.rn r2 = r6.f2078r
            boolean r2 = r2.i()
            if (r2 == 0) goto Lb9
            if (r7 != 0) goto L59
            int r7 = r1.size()
            r2 = 100
            if (r7 <= r2) goto L4c
            goto L59
        L4c:
            java.util.ArrayList<com.bytedance.embedapplog.ya> r7 = r6.up
            monitor-enter(r7)
            java.util.ArrayList<com.bytedance.embedapplog.ya> r8 = r6.up     // Catch: java.lang.Throwable -> L56
            r8.addAll(r1)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L56
            return
        L56:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L56
            throw r8
        L59:
            java.util.Collections.sort(r1, r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r2 = r1.size()
            r7.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        L6b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r1.next()
            com.bytedance.embedapplog.ya r4 = (com.bytedance.embedapplog.ya) r4
            com.bytedance.embedapplog.ch r5 = r6.g
            boolean r5 = r5.j(r4, r7)
            r2 = r2 | r5
            boolean r5 = r4 instanceof com.bytedance.embedapplog.kc
            if (r5 == 0) goto L6b
            boolean r0 = com.bytedance.embedapplog.ch.j(r4)
            r3 = 1
            r3 = r0
            r0 = 1
            goto L6b
        L8a:
            com.bytedance.embedapplog.sm r1 = r6.f2077m
            r1.j(r7)
            if (r0 == 0) goto Lb1
            r7 = 7
            if (r3 == 0) goto L9a
            android.os.Handler r0 = r6.qv
            r0.removeMessages(r7)
            goto Lb1
        L9a:
            boolean r0 = com.bytedance.embedapplog.ri.xt()
            if (r0 != 0) goto Lb1
            boolean r0 = com.bytedance.embedapplog.ri.j()
            if (r0 == 0) goto Lb1
            android.os.Handler r0 = r6.qv
            com.bytedance.embedapplog.rn r1 = r6.f2078r
            long r3 = r1.v()
            r0.sendEmptyMessageDelayed(r7, r3)
        Lb1:
            if (r2 != 0) goto Lb5
            if (r8 == 0) goto Lfb
        Lb5:
            r6.qv()
            return
        Lb9:
            android.content.Intent r7 = new android.content.Intent
            android.app.Application r8 = r6.j
            java.lang.Class<com.bytedance.embedapplog.collector.Collector> r2 = com.bytedance.embedapplog.collector.Collector.class
            r7.<init>(r8, r2)
            int r8 = r1.size()
            java.lang.String[] r2 = new java.lang.String[r8]
            r3 = 0
        Lc9:
            if (r0 >= r8) goto Le3
            java.lang.Object r4 = r1.get(r0)
            com.bytedance.embedapplog.ya r4 = (com.bytedance.embedapplog.ya) r4
            org.json.JSONObject r4 = r4.up()
            java.lang.String r4 = r4.toString()
            r2[r0] = r4
            int r4 = r4.length()
            int r3 = r3 + r4
            int r0 = r0 + 1
            goto Lc9
        Le3:
            r8 = 307200(0x4b000, float:4.30479E-40)
            if (r3 < r8) goto Lec
            r8 = 0
            com.bytedance.embedapplog.uc.xt(r8)
        Lec:
            java.lang.String r8 = "EMBED_K_DATA"
            r7.putExtra(r8, r2)
            android.app.Application r8 = r6.j     // Catch: java.lang.Exception -> Lf7
            r8.sendBroadcast(r7)     // Catch: java.lang.Exception -> Lf7
            return
        Lf7:
            r7 = move-exception
            com.bytedance.embedapplog.uc.xt(r7)
        Lfb:
            return
        Lfc:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lfc
            throw r7
    }

    public static com.bytedance.embedapplog.f m() {
            com.bytedance.embedapplog.f r0 = com.bytedance.embedapplog.f.xt
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.embedapplog.f> r0 = com.bytedance.embedapplog.f.class
            monitor-enter(r0)
            com.bytedance.embedapplog.f r1 = com.bytedance.embedapplog.f.xt     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.embedapplog.f r1 = new com.bytedance.embedapplog.f     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.embedapplog.f.xt = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.embedapplog.f r0 = com.bytedance.embedapplog.f.xt
            return r0
    }

    private void oq() {
            r3 = this;
            com.bytedance.embedapplog.rn r0 = r3.f2078r
            boolean r0 = r0.tj()
            if (r0 == 0) goto L1e
            com.bytedance.embedapplog.mi r0 = r3.cw
            if (r0 != 0) goto L28
            com.bytedance.embedapplog.mi r0 = new com.bytedance.embedapplog.mi
            r0.<init>(r3)
            r3.cw = r0
            android.os.Handler r1 = r3.tl
            r2 = 6
            android.os.Message r0 = r1.obtainMessage(r2, r0)
            r0.sendToTarget()
            return
        L1e:
            com.bytedance.embedapplog.mi r0 = r3.cw
            if (r0 == 0) goto L28
            r0.up()
            r0 = 0
            r3.cw = r0
        L28:
            return
    }

    private void qv() {
            r4 = this;
            boolean r0 = com.bytedance.embedapplog.uc.xt
            if (r0 == 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "packAndSend once, "
            r0.<init>(r1)
            com.bytedance.embedapplog.ch r1 = r4.g
            java.lang.String r1 = r1.j()
            r0.append(r1)
            java.lang.String r1 = ", hadUI:"
            r0.append(r1)
            com.bytedance.embedapplog.ch r1 = r4.g
            boolean r1 = r1.xt()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.bytedance.embedapplog.uc.j(r0, r1)
        L2a:
            com.bytedance.embedapplog.x r0 = r4.vl
            if (r0 == 0) goto L31
            r0.tl()
        L31:
            android.os.Handler r0 = r4.tl
            if (r0 == 0) goto L4c
            com.bytedance.embedapplog.x r0 = r4.vl
            boolean r1 = com.bytedance.embedapplog.ri.j()
            r0.j(r1)
            android.os.Handler r0 = r4.tl
            android.os.Handler r1 = r4.qv
            r2 = 6
            com.bytedance.embedapplog.x r3 = r4.vl
            android.os.Message r1 = r1.obtainMessage(r2, r3)
            r0.sendMessage(r1)
        L4c:
            return
    }

    public com.bytedance.embedapplog.ch ae() {
            r1 = this;
            com.bytedance.embedapplog.ch r0 = r1.g
            return r0
    }

    @Override // java.util.Comparator
    public /* synthetic */ int compare(com.bytedance.embedapplog.ya r1, com.bytedance.embedapplog.ya r2) {
            r0 = this;
            com.bytedance.embedapplog.ya r1 = (com.bytedance.embedapplog.ya) r1
            com.bytedance.embedapplog.ya r2 = (com.bytedance.embedapplog.ya) r2
            int r1 = r0.j(r1, r2)
            return r1
    }

    public com.bytedance.embedapplog.sm cw() {
            r1 = this;
            com.bytedance.embedapplog.sm r0 = r1.f2077m
            return r0
    }

    public void g() {
            r2 = this;
            android.os.Handler r0 = r2.qv
            if (r0 == 0) goto L11
            r1 = 89
            boolean r0 = r0.hasMessages(r1)
            if (r0 != 0) goto L11
            android.os.Handler r0 = r2.qv
            r0.sendEmptyMessage(r1)
        L11:
            return
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r10) {
            r9 = this;
            r0 = 1
            int r1 = r10.what     // Catch: java.lang.Throwable -> L22
            r2 = 2
            r3 = 0
            r4 = 4
            if (r1 == r0) goto Ld2
            r5 = 864000000(0x337f9800, double:4.26872718E-315)
            r7 = 6
            if (r1 == r2) goto L78
            r2 = 0
            if (r1 == r4) goto L73
            r4 = 5
            if (r1 == r4) goto L6a
            if (r1 == r7) goto L43
            r10 = 7
            if (r1 == r10) goto L2e
            r10 = 89
            if (r1 == r10) goto L25
            com.bytedance.embedapplog.uc.xt(r3)     // Catch: java.lang.Throwable -> L22
            goto L147
        L22:
            r10 = move-exception
            goto L132
        L25:
            com.bytedance.embedapplog.wq r10 = r9.ae     // Catch: java.lang.Throwable -> L22
            if (r10 == 0) goto L147
            r10.up()     // Catch: java.lang.Throwable -> L22
            goto L147
        L2e:
            java.util.ArrayList<com.bytedance.embedapplog.ya> r10 = r9.up     // Catch: java.lang.Throwable -> L22
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L22
            java.util.ArrayList<com.bytedance.embedapplog.ya> r1 = r9.up     // Catch: java.lang.Throwable -> L40
            com.bytedance.embedapplog.ch$j r4 = com.bytedance.embedapplog.ch.up()     // Catch: java.lang.Throwable -> L40
            r1.add(r4)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L40
            r9.j(r3, r2)     // Catch: java.lang.Throwable -> L22
            goto L147
        L40:
            r1 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L40
            throw r1     // Catch: java.lang.Throwable -> L22
        L43:
            java.lang.Object r10 = r10.obj     // Catch: java.lang.Throwable -> L22
            com.bytedance.embedapplog.kt r10 = (com.bytedance.embedapplog.kt) r10     // Catch: java.lang.Throwable -> L22
            boolean r1 = r10.m()     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L63
            long r1 = r10.ae()     // Catch: java.lang.Throwable -> L22
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L60
            android.os.Handler r3 = r9.tl     // Catch: java.lang.Throwable -> L22
            android.os.Handler r4 = r9.qv     // Catch: java.lang.Throwable -> L22
            android.os.Message r10 = r4.obtainMessage(r7, r10)     // Catch: java.lang.Throwable -> L22
            r3.sendMessageDelayed(r10, r1)     // Catch: java.lang.Throwable -> L22
        L60:
            r9.oq()     // Catch: java.lang.Throwable -> L22
        L63:
            com.bytedance.embedapplog.x r10 = r9.vl     // Catch: java.lang.Throwable -> L22
            r10.j(r0)     // Catch: java.lang.Throwable -> L22
            goto L147
        L6a:
            java.lang.Object r10 = r10.obj     // Catch: java.lang.Throwable -> L22
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch: java.lang.Throwable -> L22
            r9.j(r10, r2)     // Catch: java.lang.Throwable -> L22
            goto L147
        L73:
            r9.j(r3, r2)     // Catch: java.lang.Throwable -> L22
            goto L147
        L78:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22
            r10.<init>(r4)     // Catch: java.lang.Throwable -> L22
            com.bytedance.embedapplog.v r1 = new com.bytedance.embedapplog.v     // Catch: java.lang.Throwable -> L22
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L22
            r10.add(r1)     // Catch: java.lang.Throwable -> L22
            com.bytedance.embedapplog.tj r1 = new com.bytedance.embedapplog.tj     // Catch: java.lang.Throwable -> L22
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L22
            r10.add(r1)     // Catch: java.lang.Throwable -> L22
            com.bytedance.embedapplog.x r1 = new com.bytedance.embedapplog.x     // Catch: java.lang.Throwable -> L22
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L22
            r9.vl = r1     // Catch: java.lang.Throwable -> L22
            r10.add(r1)     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L22
        L9b:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto Lc8
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Throwable -> L22
            com.bytedance.embedapplog.kt r1 = (com.bytedance.embedapplog.kt) r1     // Catch: java.lang.Throwable -> L22
            boolean r2 = r1 instanceof com.bytedance.embedapplog.x     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto Lb4
            com.bytedance.embedapplog.x r2 = r9.vl     // Catch: java.lang.Throwable -> L22
            boolean r3 = com.bytedance.embedapplog.ri.j()     // Catch: java.lang.Throwable -> L22
            r2.j(r3)     // Catch: java.lang.Throwable -> L22
        Lb4:
            long r2 = r1.ae()     // Catch: java.lang.Throwable -> L22
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 >= 0) goto L9b
            android.os.Handler r4 = r9.tl     // Catch: java.lang.Throwable -> L22
            android.os.Handler r8 = r9.qv     // Catch: java.lang.Throwable -> L22
            android.os.Message r1 = r8.obtainMessage(r7, r1)     // Catch: java.lang.Throwable -> L22
            r4.sendMessageDelayed(r1, r2)     // Catch: java.lang.Throwable -> L22
            goto L9b
        Lc8:
            com.bytedance.embedapplog.x r10 = r9.vl     // Catch: java.lang.Throwable -> L22
            r10.j(r0)     // Catch: java.lang.Throwable -> L22
            r9.oq()     // Catch: java.lang.Throwable -> L22
            goto L147
        Ld2:
            com.bytedance.embedapplog.rn r10 = r9.f2078r     // Catch: java.lang.Throwable -> L22
            boolean r10 = r10.f()     // Catch: java.lang.Throwable -> L22
            com.bytedance.embedapplog.uc.j = r10     // Catch: java.lang.Throwable -> L22
            com.bytedance.embedapplog.wq r10 = r9.ae     // Catch: java.lang.Throwable -> L22
            boolean r10 = r10.m()     // Catch: java.lang.Throwable -> L22
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r10 == 0) goto L124
            com.bytedance.embedapplog.rn r10 = r9.f2078r     // Catch: java.lang.Throwable -> L22
            boolean r10 = r10.i()     // Catch: java.lang.Throwable -> L22
            if (r10 == 0) goto L12e
            com.bytedance.embedapplog.rn r10 = r9.f2078r     // Catch: java.lang.Throwable -> L22
            android.os.Looper r10 = com.bytedance.embedapplog.ri.xt(r10)     // Catch: java.lang.Throwable -> L22
            if (r10 != 0) goto L102
            android.os.HandlerThread r10 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "bd_tracker_n"
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L22
            r10.start()     // Catch: java.lang.Throwable -> L22
            android.os.Looper r10 = r10.getLooper()     // Catch: java.lang.Throwable -> L22
        L102:
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L22
            r1.<init>(r10, r9)     // Catch: java.lang.Throwable -> L22
            r9.tl = r1     // Catch: java.lang.Throwable -> L22
            r1.sendEmptyMessage(r2)     // Catch: java.lang.Throwable -> L22
            java.util.ArrayList<com.bytedance.embedapplog.ya> r10 = r9.up     // Catch: java.lang.Throwable -> L22
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L22
            if (r10 <= 0) goto L11e
            android.os.Handler r10 = r9.qv     // Catch: java.lang.Throwable -> L22
            r10.removeMessages(r4)     // Catch: java.lang.Throwable -> L22
            android.os.Handler r10 = r9.qv     // Catch: java.lang.Throwable -> L22
            r10.sendEmptyMessageDelayed(r4, r5)     // Catch: java.lang.Throwable -> L22
        L11e:
            java.lang.String r10 = "net|worker start"
            com.bytedance.embedapplog.uc.r(r10, r3)     // Catch: java.lang.Throwable -> L22
            goto L12e
        L124:
            android.os.Handler r10 = r9.qv     // Catch: java.lang.Throwable -> L22
            r10.removeMessages(r0)     // Catch: java.lang.Throwable -> L22
            android.os.Handler r10 = r9.qv     // Catch: java.lang.Throwable -> L22
            r10.sendEmptyMessageDelayed(r0, r5)     // Catch: java.lang.Throwable -> L22
        L12e:
            com.bytedance.embedapplog.a.j()     // Catch: java.lang.Throwable -> L22
            goto L147
        L132:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "engine:"
            r1.<init>(r2)
            java.lang.String r10 = r10.getMessage()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            com.bytedance.embedapplog.uc.j(r10)
        L147:
            return r0
    }

    public int j(com.bytedance.embedapplog.ya r4, com.bytedance.embedapplog.ya r5) {
            r3 = this;
            long r0 = r4.xt
            long r4 = r5.xt
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto Ld
            r4 = -1
            return r4
        Ld:
            if (r2 <= 0) goto L11
            r4 = 1
            return r4
        L11:
            r4 = 0
            return r4
    }

    public void j(android.app.Application r2, com.bytedance.embedapplog.rn r3, com.bytedance.embedapplog.wq r4, com.bytedance.embedapplog.w r5) {
            r1 = this;
            r1.j = r2
            com.bytedance.embedapplog.sm r2 = new com.bytedance.embedapplog.sm
            r2.<init>(r1)
            r1.f2077m = r2
            r1.f2078r = r3
            r1.ae = r4
            com.bytedance.embedapplog.ch r2 = new com.bytedance.embedapplog.ch
            com.bytedance.embedapplog.wq r4 = r1.ae
            com.bytedance.embedapplog.rn r0 = r1.f2078r
            r2.<init>(r4, r0)
            r1.g = r2
            android.app.Application r2 = r1.j
            r2.registerActivityLifecycleCallbacks(r5)
            android.os.Looper r2 = com.bytedance.embedapplog.ri.j(r3)
            if (r2 != 0) goto L31
            android.os.HandlerThread r2 = new android.os.HandlerThread
            java.lang.String r4 = "bd_tracker_w"
            r2.<init>(r4)
            r2.start()
            android.os.Looper r2 = r2.getLooper()
        L31:
            android.os.Handler r4 = new android.os.Handler
            r4.<init>(r2, r1)
            r1.qv = r4
            r2 = 1
            r4.sendEmptyMessage(r2)
            int r3 = r3.tl()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r2 = 0
        L44:
            com.bytedance.embedapplog.im.j(r2)
            return
    }

    public com.bytedance.embedapplog.rn r() {
            r1 = this;
            com.bytedance.embedapplog.rn r0 = r1.f2078r
            return r0
    }

    public com.bytedance.embedapplog.util.j tl() {
            r1 = this;
            com.bytedance.embedapplog.util.j r0 = r1.oq
            if (r0 != 0) goto L19
            com.bytedance.embedapplog.rn r0 = r1.f2078r
            com.bytedance.embedapplog.tl r0 = r0.hh()
            com.bytedance.embedapplog.util.j r0 = r0.qv()
            r1.oq = r0
            if (r0 != 0) goto L19
            r0 = 0
            com.bytedance.embedapplog.util.j r0 = com.bytedance.embedapplog.util.xt.j(r0)
            r1.oq = r0
        L19:
            com.bytedance.embedapplog.util.j r0 = r1.oq
            return r0
    }

    public com.bytedance.embedapplog.wq up() {
            r1 = this;
            com.bytedance.embedapplog.wq r0 = r1.ae
            return r0
    }

    public android.content.Context xt() {
            r1 = this;
            android.app.Application r0 = r1.j
            return r0
    }
}
