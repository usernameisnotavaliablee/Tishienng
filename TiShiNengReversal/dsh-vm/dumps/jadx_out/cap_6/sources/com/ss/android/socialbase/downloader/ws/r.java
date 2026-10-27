package com.ss.android.socialbase.downloader.ws;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class r {
    private static java.util.concurrent.ExecutorService j;
    private int cw;
    private volatile android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> xt;

    static {
            com.bytedance.sdk.component.oq.r.r r0 = new com.bytedance.sdk.component.oq.r.r
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            com.ss.android.socialbase.downloader.ws.j r7 = new com.ss.android.socialbase.downloader.ws.j
            java.lang.String r1 = "Download_OP_Thread"
            r7.<init>(r1)
            r1 = 2
            r2 = 2
            r3 = 60
            r0.<init>(r1, r2, r3, r5, r6, r7)
            com.ss.android.socialbase.downloader.ws.r.j = r0
            return
    }

    public r() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.cw = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.xt = r0
            return
    }

    private void cw(com.ss.android.socialbase.downloader.ws.cw r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L53
        L3:
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.az()     // Catch: java.lang.Exception -> L27
            com.ss.android.socialbase.downloader.ae.r r1 = r4.cw()     // Catch: java.lang.Exception -> L27
            if (r1 == 0) goto L2d
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.j()     // Catch: java.lang.Exception -> L27
            if (r2 == 0) goto L2d
            com.ss.android.socialbase.downloader.ae.cw r1 = r1.j()     // Catch: java.lang.Exception -> L27
            int r1 = r1.mp()     // Catch: java.lang.Exception -> L27
            r2 = 3
            if (r1 == r2) goto L29
            r2 = 4
            if (r1 == r2) goto L22
            goto L2d
        L22:
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.ws()     // Catch: java.lang.Exception -> L27
            goto L2d
        L27:
            r4 = move-exception
            goto L54
        L29:
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.jy()     // Catch: java.lang.Exception -> L27
        L2d:
            if (r0 == 0) goto L53
            boolean r1 = r0 instanceof java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Exception -> L27
            if (r1 == 0) goto L53
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0     // Catch: java.lang.Exception -> L27
            r0.remove(r4)     // Catch: java.lang.Exception -> L27
            int r0 = r4.up()     // Catch: java.lang.Exception -> L27
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = "pause_with_interrupt"
            r2 = 0
            boolean r0 = r0.xt(r1, r2)     // Catch: java.lang.Exception -> L27
            if (r0 == 0) goto L53
            java.util.concurrent.Future r4 = r4.ae()     // Catch: java.lang.Exception -> L27
            if (r4 == 0) goto L53
            r0 = 1
            r4.cancel(r0)     // Catch: java.lang.Exception -> L27
        L53:
            return
        L54:
            com.bytedance.sdk.component.utils.vl.j(r4)
            return
    }

    private void xt() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            r2 = 0
        L7:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r3 = r5.xt     // Catch: java.lang.Throwable -> L2b
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L2b
            if (r2 >= r3) goto L30
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r3 = r5.xt     // Catch: java.lang.Throwable -> L2b
            int r3 = r3.keyAt(r2)     // Catch: java.lang.Throwable -> L2b
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r4 = r5.xt     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L2b
            com.ss.android.socialbase.downloader.ws.cw r4 = (com.ss.android.socialbase.downloader.ws.cw) r4     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r4.r()     // Catch: java.lang.Throwable -> L2b
            if (r4 != 0) goto L2d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L2b
            r0.add(r3)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r0 = move-exception
            goto L50
        L2d:
            int r2 = r2 + 1
            goto L7
        L30:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L2b
            if (r1 >= r2) goto L4f
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L4c
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L48
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r3 = r5.xt     // Catch: java.lang.Throwable -> L48
            r3.remove(r2)     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> L2b
        L4c:
            int r1 = r1 + 1
            goto L30
        L4f:
            return
        L50:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    public void cw(int r3) {
            r2 = this;
            java.lang.Class<com.ss.android.socialbase.downloader.ws.r> r0 = com.ss.android.socialbase.downloader.ws.r.class
            monitor-enter(r0)
            r2.xt()     // Catch: java.lang.Throwable -> L1c
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r1 = r2.xt     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L1c
            com.ss.android.socialbase.downloader.ws.cw r1 = (com.ss.android.socialbase.downloader.ws.cw) r1     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            r1.j()     // Catch: java.lang.Throwable -> L1c
            r2.cw(r1)     // Catch: java.lang.Throwable -> L1c
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r1 = r2.xt     // Catch: java.lang.Throwable -> L1c
            r1.remove(r3)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r3 = move-exception
            goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    public java.util.List<java.lang.Integer> j() {
            r5 = this;
            java.lang.Class<com.ss.android.socialbase.downloader.ws.r> r0 = com.ss.android.socialbase.downloader.ws.r.class
            monitor-enter(r0)
            r5.xt()     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r1.<init>()     // Catch: java.lang.Throwable -> L30
            r2 = 0
        Lc:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r3 = r5.xt     // Catch: java.lang.Throwable -> L30
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L30
            if (r2 >= r3) goto L35
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r3 = r5.xt     // Catch: java.lang.Throwable -> L30
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r4 = r5.xt     // Catch: java.lang.Throwable -> L30
            int r4 = r4.keyAt(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L30
            com.ss.android.socialbase.downloader.ws.cw r3 = (com.ss.android.socialbase.downloader.ws.cw) r3     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L32
            int r3 = r3.up()     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L30
            r1.add(r3)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r1 = move-exception
            goto L37
        L32:
            int r2 = r2 + 1
            goto Lc
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return r1
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r1
    }

    public void j(int r1, long r2) {
            r0 = this;
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r2 = r0.xt
            r2.get(r1)
            return
    }

    public void j(com.ss.android.socialbase.downloader.ws.cw r9) {
            r8 = this;
            r9.m()
            java.lang.Class<com.ss.android.socialbase.downloader.ws.r> r0 = com.ss.android.socialbase.downloader.ws.r.class
            monitor-enter(r0)
            int r1 = r8.cw     // Catch: java.lang.Throwable -> L14
            r2 = 500(0x1f4, float:7.0E-43)
            r3 = 1
            r4 = 0
            if (r1 < r2) goto L17
            r8.xt()     // Catch: java.lang.Throwable -> L14
            r8.cw = r4     // Catch: java.lang.Throwable -> L14
            goto L1a
        L14:
            r9 = move-exception
            goto L10e
        L17:
            int r1 = r1 + r3
            r8.cw = r1     // Catch: java.lang.Throwable -> L14
        L1a:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r1 = r8.xt     // Catch: java.lang.Throwable -> L14
            int r2 = r9.up()     // Catch: java.lang.Throwable -> L14
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            com.ss.android.socialbase.downloader.ae.r r0 = r9.cw()
            r1 = 1003(0x3eb, float:1.406E-42)
            java.util.concurrent.ExecutorService r2 = com.ss.android.socialbase.downloader.downloader.cw.az()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            if (r0 == 0) goto L7d
            com.ss.android.socialbase.downloader.ae.cw r5 = r0.j()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            if (r5 == 0) goto L7d
            java.lang.String r5 = "mime_type_plg"
            com.ss.android.socialbase.downloader.ae.cw r6 = r0.j()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            java.lang.String r6 = r6.xw()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            boolean r5 = r5.equals(r6)     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            r6 = 3
            if (r5 == 0) goto L66
            com.ss.android.socialbase.downloader.jy.j r5 = com.ss.android.socialbase.downloader.jy.j.cw()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            java.lang.String r7 = "divide_plugin"
            int r5 = r5.j(r7, r3)     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            if (r5 != r3) goto L66
            com.ss.android.socialbase.downloader.ae.cw r3 = r0.j()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            java.lang.String r5 = "executor_group"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            r3.j(r5, r7)     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            goto L66
        L61:
            r9 = move-exception
            goto Lbe
        L63:
            r9 = move-exception
            goto Le4
        L66:
            com.ss.android.socialbase.downloader.ae.cw r3 = r0.j()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            int r3 = r3.mp()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            if (r3 == r6) goto L79
            r5 = 4
            if (r3 == r5) goto L74
            goto L7d
        L74:
            java.util.concurrent.ExecutorService r2 = com.ss.android.socialbase.downloader.downloader.cw.ws()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            goto L7d
        L79:
            java.util.concurrent.ExecutorService r2 = com.ss.android.socialbase.downloader.downloader.cw.jy()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
        L7d:
            if (r2 == 0) goto L9b
            int r3 = r9.up()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            java.lang.String r5 = "pause_with_interrupt"
            boolean r3 = r3.xt(r5, r4)     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            if (r3 == 0) goto L97
            java.util.concurrent.Future r2 = r2.submit(r9)     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            r9.j(r2)     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            return
        L97:
            r2.execute(r9)     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            return
        L9b:
            com.ss.android.socialbase.downloader.r.l r9 = r0.up()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.j()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            com.ss.android.socialbase.downloader.up.j r3 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            java.lang.String r5 = "execute failed cpu thread executor service is null"
            r3.<init>(r1, r5)     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            com.ss.android.socialbase.downloader.ae.cw r5 = r0.j()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            if (r5 == 0) goto Lb9
            com.ss.android.socialbase.downloader.ae.cw r5 = r0.j()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            int r5 = r5.i()     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            goto Lba
        Lb9:
            r5 = 0
        Lba:
            com.ss.android.socialbase.downloader.tl.j.j(r9, r2, r3, r5)     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L63
            return
        Lbe:
            if (r0 == 0) goto Le0
            com.ss.android.socialbase.downloader.r.l r2 = r0.up()
            com.ss.android.socialbase.downloader.ae.cw r3 = r0.j()
            com.ss.android.socialbase.downloader.up.j r5 = new com.ss.android.socialbase.downloader.up.j
            java.lang.String r6 = "execute OOM"
            r5.<init>(r1, r6)
            com.ss.android.socialbase.downloader.ae.cw r1 = r0.j()
            if (r1 == 0) goto Ldd
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.j()
            int r4 = r0.i()
        Ldd:
            com.ss.android.socialbase.downloader.tl.j.j(r2, r3, r5, r4)
        Le0:
            com.bytedance.sdk.component.utils.vl.j(r9)
            return
        Le4:
            if (r0 == 0) goto L10a
            com.ss.android.socialbase.downloader.r.l r2 = r0.up()
            com.ss.android.socialbase.downloader.ae.cw r3 = r0.j()
            com.ss.android.socialbase.downloader.up.j r5 = new com.ss.android.socialbase.downloader.up.j
            java.lang.String r6 = "DownloadThreadPoolExecute"
            java.lang.String r6 = com.ss.android.socialbase.downloader.az.m.xt(r9, r6)
            r5.<init>(r1, r6)
            com.ss.android.socialbase.downloader.ae.cw r1 = r0.j()
            if (r1 == 0) goto L107
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.j()
            int r4 = r0.i()
        L107:
            com.ss.android.socialbase.downloader.tl.j.j(r2, r3, r5, r4)
        L10a:
            com.bytedance.sdk.component.utils.vl.j(r9)
            return
        L10e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r9
    }

    public boolean j(int r4) {
            r3 = this;
            java.lang.Class<com.ss.android.socialbase.downloader.ws.r> r0 = com.ss.android.socialbase.downloader.ws.r.class
            monitor-enter(r0)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r1 = r3.xt     // Catch: java.lang.Throwable -> L23
            r2 = 0
            if (r1 == 0) goto L27
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r1 = r3.xt     // Catch: java.lang.Throwable -> L23
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L23
            if (r1 > 0) goto L11
            goto L27
        L11:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r1 = r3.xt     // Catch: java.lang.Throwable -> L23
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L23
            com.ss.android.socialbase.downloader.ws.cw r4 = (com.ss.android.socialbase.downloader.ws.cw) r4     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L25
            boolean r4 = r4.r()     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L25
            r2 = 1
            goto L25
        L23:
            r4 = move-exception
            goto L29
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r2
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r2
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r4
    }

    public com.ss.android.socialbase.downloader.ws.cw xt(int r4) {
            r3 = this;
            java.lang.Class<com.ss.android.socialbase.downloader.ws.r> r0 = com.ss.android.socialbase.downloader.ws.r.class
            monitor-enter(r0)
            r3.xt()     // Catch: java.lang.Throwable -> L1d
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r1 = r3.xt     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L1d
            com.ss.android.socialbase.downloader.ws.cw r1 = (com.ss.android.socialbase.downloader.ws.cw) r1     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            r1.xt()     // Catch: java.lang.Throwable -> L1d
            r3.cw(r1)     // Catch: java.lang.Throwable -> L1d
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r2 = r3.xt     // Catch: java.lang.Throwable -> L1d
            r2.remove(r4)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r1
        L1d:
            r4 = move-exception
            goto L22
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            r4 = 0
            return r4
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    public void xt(com.ss.android.socialbase.downloader.ws.cw r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L2c
        L3:
            java.lang.Class<com.ss.android.socialbase.downloader.ws.r> r0 = com.ss.android.socialbase.downloader.ws.r.class
            monitor-enter(r0)
            r1 = 524288(0x80000, float:7.34684E-40)
            boolean r1 = com.ss.android.socialbase.downloader.az.j.j(r1)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r1 = r2.xt     // Catch: java.lang.Throwable -> L1c
            int r3 = r1.indexOfValue(r3)     // Catch: java.lang.Throwable -> L1c
            if (r3 < 0) goto L2b
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r1 = r2.xt     // Catch: java.lang.Throwable -> L1c
            r1.removeAt(r3)     // Catch: java.lang.Throwable -> L1c
            goto L2b
        L1c:
            r3 = move-exception
            goto L28
        L1e:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ws.cw> r1 = r2.xt     // Catch: java.lang.Throwable -> L1c
            int r3 = r3.up()     // Catch: java.lang.Throwable -> L1c
            r1.remove(r3)     // Catch: java.lang.Throwable -> L1c
            goto L2b
        L28:
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> L2d
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
        L2c:
            return
        L2d:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r3
    }
}
