package com.ss.android.socialbase.downloader.impls;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class j implements com.ss.android.socialbase.downloader.ws.tl.j {
    private final android.util.SparseArray<android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r>> ae;
    private final android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> cw;
    private final android.util.SparseArray<java.lang.Long> g;
    protected final com.ss.android.socialbase.downloader.ws.tl j;
    private final android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> m;
    private final java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.ae.r> oq;
    private final com.ss.android.socialbase.downloader.downloader.vl qv;
    private final android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r;
    private final com.ss.android.socialbase.downloader.az.tl<java.lang.Integer, com.ss.android.socialbase.downloader.ae.r> tl;
    private final android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> up;
    private final android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> xt;







    protected j() {
            r2 = this;
            r2.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.xt = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.cw = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.r = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.up = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.m = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.ae = r0
            com.ss.android.socialbase.downloader.az.tl r0 = new com.ss.android.socialbase.downloader.az.tl
            r0.<init>()
            r2.tl = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.g = r0
            java.util.concurrent.LinkedBlockingDeque r0 = new java.util.concurrent.LinkedBlockingDeque
            r0.<init>()
            r2.oq = r0
            com.ss.android.socialbase.downloader.ws.tl r0 = new com.ss.android.socialbase.downloader.ws.tl
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1, r2)
            r2.j = r0
            com.ss.android.socialbase.downloader.downloader.vl r0 = com.ss.android.socialbase.downloader.downloader.cw.x()
            r2.qv = r0
            return
    }

    private void av(int r2) {
            r1 = this;
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.ae.r> r0 = r1.oq
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto L35
        L9:
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.ae.r> r0 = r1.oq
            java.lang.Object r0 = r0.getFirst()
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0
            if (r0 == 0) goto L1e
            int r0 = r0.i()
            if (r0 != r2) goto L1e
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.ae.r> r2 = r1.oq
            r2.poll()
        L1e:
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.ae.r> r2 = r1.oq
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L27
            goto L35
        L27:
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.ae.r> r2 = r1.oq
            java.lang.Object r2 = r2.getFirst()
            com.ss.android.socialbase.downloader.ae.r r2 = (com.ss.android.socialbase.downloader.ae.r) r2
            if (r2 == 0) goto L35
            r0 = 1
            r1.j(r2, r0)
        L35:
            return
    }

    private com.ss.android.socialbase.downloader.ae.r az(int r2) {
            r1 = this;
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.xt
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0
            if (r0 != 0) goto L31
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.r
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0
            if (r0 != 0) goto L31
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.cw
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0
            if (r0 != 0) goto L31
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.up
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0
            if (r0 != 0) goto L31
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.m
            java.lang.Object r2 = r0.get(r2)
            com.ss.android.socialbase.downloader.ae.r r2 = (com.ss.android.socialbase.downloader.ae.r) r2
            return r2
        L31:
            return r0
    }

    private void cw(com.ss.android.socialbase.downloader.ae.r r5) {
            r4 = this;
            if (r5 != 0) goto L4
            goto Laa
        L4:
            com.ss.android.socialbase.downloader.ae.cw r0 = r5.j()
            if (r0 != 0) goto Lc
            goto Laa
        Lc:
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.ae.r> r1 = r4.oq     // Catch: java.lang.InterruptedException -> Laa
            boolean r1 = r1.isEmpty()     // Catch: java.lang.InterruptedException -> Laa
            r2 = 1
            if (r1 == 0) goto L1e
            r4.j(r5, r2)     // Catch: java.lang.InterruptedException -> Laa
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.ae.r> r0 = r4.oq     // Catch: java.lang.InterruptedException -> Laa
            r0.put(r5)     // Catch: java.lang.InterruptedException -> Laa
            return
        L1e:
            com.ss.android.socialbase.downloader.xt.ae r0 = r0.w()     // Catch: java.lang.InterruptedException -> Laa
            com.ss.android.socialbase.downloader.xt.ae r1 = com.ss.android.socialbase.downloader.xt.ae.cw     // Catch: java.lang.InterruptedException -> Laa
            if (r0 != r1) goto L74
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.ae.r> r0 = r4.oq     // Catch: java.lang.InterruptedException -> Laa
            java.lang.Object r0 = r0.getFirst()     // Catch: java.lang.InterruptedException -> Laa
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.InterruptedException -> Laa
            int r0 = r0.i()     // Catch: java.lang.InterruptedException -> Laa
            int r1 = r5.i()     // Catch: java.lang.InterruptedException -> Laa
            if (r0 != r1) goto L43
            int r0 = r5.i()     // Catch: java.lang.InterruptedException -> Laa
            boolean r0 = r4.j(r0)     // Catch: java.lang.InterruptedException -> Laa
            if (r0 == 0) goto L43
            goto Laa
        L43:
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.ae.r> r0 = r4.oq     // Catch: java.lang.InterruptedException -> Laa
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.InterruptedException -> Laa
        L49:
            boolean r1 = r0.hasNext()     // Catch: java.lang.InterruptedException -> Laa
            if (r1 == 0) goto L64
            java.lang.Object r1 = r0.next()     // Catch: java.lang.InterruptedException -> Laa
            com.ss.android.socialbase.downloader.ae.r r1 = (com.ss.android.socialbase.downloader.ae.r) r1     // Catch: java.lang.InterruptedException -> Laa
            if (r1 == 0) goto L49
            int r1 = r1.i()     // Catch: java.lang.InterruptedException -> Laa
            int r2 = r5.i()     // Catch: java.lang.InterruptedException -> Laa
            if (r1 != r2) goto L49
            r0.remove()     // Catch: java.lang.InterruptedException -> Laa
        L64:
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.ae.r> r0 = r4.oq     // Catch: java.lang.InterruptedException -> Laa
            r0.put(r5)     // Catch: java.lang.InterruptedException -> Laa
            com.ss.android.socialbase.downloader.downloader.m r0 = new com.ss.android.socialbase.downloader.downloader.m     // Catch: java.lang.InterruptedException -> Laa
            com.ss.android.socialbase.downloader.ws.tl r1 = r4.j     // Catch: java.lang.InterruptedException -> Laa
            r0.<init>(r5, r1)     // Catch: java.lang.InterruptedException -> Laa
            r0.j()     // Catch: java.lang.InterruptedException -> Laa
            return
        L74:
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.ae.r> r0 = r4.oq     // Catch: java.lang.InterruptedException -> Laa
            java.lang.Object r0 = r0.getFirst()     // Catch: java.lang.InterruptedException -> Laa
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.InterruptedException -> Laa
            int r1 = r0.i()     // Catch: java.lang.InterruptedException -> Laa
            int r3 = r5.i()     // Catch: java.lang.InterruptedException -> Laa
            if (r1 != r3) goto L91
            int r1 = r5.i()     // Catch: java.lang.InterruptedException -> Laa
            boolean r1 = r4.j(r1)     // Catch: java.lang.InterruptedException -> Laa
            if (r1 == 0) goto L91
            goto Laa
        L91:
            int r1 = r0.i()     // Catch: java.lang.InterruptedException -> Laa
            r4.up(r1)     // Catch: java.lang.InterruptedException -> Laa
            r4.j(r5, r2)     // Catch: java.lang.InterruptedException -> Laa
            int r0 = r0.i()     // Catch: java.lang.InterruptedException -> Laa
            int r1 = r5.i()     // Catch: java.lang.InterruptedException -> Laa
            if (r0 == r1) goto Laa
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.ae.r> r0 = r4.oq     // Catch: java.lang.InterruptedException -> Laa
            r0.putFirst(r5)     // Catch: java.lang.InterruptedException -> Laa
        Laa:
            return
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.ae.r j(com.ss.android.socialbase.downloader.impls.j r0, int r1) {
            com.ss.android.socialbase.downloader.ae.r r0 = r0.az(r1)
            return r0
    }

    private void j(int r4, int r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "removeTask id: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " listener hasCode: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AbsDownloadEngine"
            com.ss.android.socialbase.downloader.m.j.xt(r1, r0)
            if (r5 != 0) goto L28
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r5 = r3.xt
            r5.remove(r4)
            android.util.SparseArray<android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r>> r5 = r3.ae
            r5.remove(r4)
            return
        L28:
            android.util.SparseArray<android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r>> r0 = r3.ae
            java.lang.Object r0 = r0.get(r4)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            if (r0 == 0) goto L5b
            r0.remove(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "after downloadTaskWithListenerMap removeTask taskArray.size: "
            r5.<init>(r2)
            int r2 = r0.size()
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r1, r5)
            int r5 = r0.size()
            if (r5 != 0) goto L5a
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r5 = r3.xt
            r5.remove(r4)
            android.util.SparseArray<android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r>> r5 = r3.ae
            r5.remove(r4)
        L5a:
            return
        L5b:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r5 = r3.xt
            r5.remove(r4)
            return
    }

    private void j(int r5, com.ss.android.socialbase.downloader.up.j r6, com.ss.android.socialbase.downloader.ae.r r7) {
            r4 = this;
            if (r7 == 0) goto L29
            com.ss.android.socialbase.downloader.ae.cw r0 = r7.j()
            com.ss.android.socialbase.downloader.xt.tl r1 = com.ss.android.socialbase.downloader.xt.tl.j
            android.util.SparseArray r1 = r7.j(r1)
            com.ss.android.socialbase.downloader.xt.tl r2 = com.ss.android.socialbase.downloader.xt.tl.cw
            android.util.SparseArray r2 = r7.j(r2)
            boolean r7 = r7.az()
            r3 = 1
            if (r7 != 0) goto L22
            boolean r7 = r0.qe()
            if (r7 == 0) goto L20
            goto L22
        L20:
            r7 = 0
            goto L23
        L22:
            r7 = 1
        L23:
            com.ss.android.socialbase.downloader.az.cw.j(r5, r1, r3, r0, r6)
            com.ss.android.socialbase.downloader.az.cw.j(r5, r2, r7, r0, r6)
        L29:
            return
    }

    private void j(com.ss.android.socialbase.downloader.ae.cw r3) {
            r2 = this;
            if (r3 == 0) goto L28
            int r0 = r3.i()     // Catch: java.lang.Throwable -> L12
            r1 = 7
            if (r0 == r1) goto L14
            com.ss.android.socialbase.downloader.xt.g r0 = r3.rs()     // Catch: java.lang.Throwable -> L12
            com.ss.android.socialbase.downloader.xt.g r1 = com.ss.android.socialbase.downloader.xt.g.j     // Catch: java.lang.Throwable -> L12
            if (r0 == r1) goto L28
            goto L14
        L12:
            r3 = move-exception
            goto L25
        L14:
            r0 = 5
            r3.r(r0)     // Catch: java.lang.Throwable -> L12
            com.ss.android.socialbase.downloader.xt.g r0 = com.ss.android.socialbase.downloader.xt.g.j     // Catch: java.lang.Throwable -> L12
            r3.j(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = "AbsDownloadEngine"
            java.lang.String r0 = "cancelAlarm"
            com.ss.android.socialbase.downloader.m.j.xt(r3, r0)     // Catch: java.lang.Throwable -> L12
            return
        L25:
            com.bytedance.sdk.component.utils.vl.j(r3)
        L28:
            return
    }

    private void j(com.ss.android.socialbase.downloader.ae.r r9, boolean r10) {
            r8 = this;
            if (r9 != 0) goto L3
            goto L9
        L3:
            com.ss.android.socialbase.downloader.ae.cw r0 = r9.j()
            if (r0 != 0) goto La
        L9:
            return
        La:
            boolean r1 = r0.yu()
            r2 = 1003(0x3eb, float:1.406E-42)
            if (r1 == 0) goto L4d
            com.ss.android.socialbase.downloader.r.l r9 = r9.up()
            com.ss.android.socialbase.downloader.up.j r10 = new com.ss.android.socialbase.downloader.up.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "downloadInfo is Invalid, url is "
            r1.<init>(r3)
            java.lang.String r3 = r0.oq()
            r1.append(r3)
            java.lang.String r3 = " name is "
            r1.append(r3)
            java.lang.String r3 = r0.tl()
            r1.append(r3)
            java.lang.String r3 = " savePath is "
            r1.append(r3)
            java.lang.String r3 = r0.qv()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r10.<init>(r2, r1)
            int r1 = r0.i()
            com.ss.android.socialbase.downloader.tl.j.j(r9, r0, r10, r1)
            return
        L4d:
            int r1 = r0.ae()
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r1)
            java.lang.String r3 = "no_net_opt"
            r4 = 0
            int r1 = r1.j(r3, r4)
            r3 = 1
            if (r1 != r3) goto L83
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            boolean r1 = com.ss.android.socialbase.downloader.az.m.cw(r1)
            if (r1 != 0) goto L83
            boolean r1 = r0.fz()
            if (r1 != 0) goto L83
            com.ss.android.socialbase.downloader.downloader.m r10 = new com.ss.android.socialbase.downloader.downloader.m
            com.ss.android.socialbase.downloader.ws.tl r0 = r8.j
            r10.<init>(r9, r0)
            com.ss.android.socialbase.downloader.up.j r9 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1049(0x419, float:1.47E-42)
            java.lang.String r1 = "network_not_available"
            r9.<init>(r0, r1)
            r10.j(r9)
            return
        L83:
            int r1 = r0.ae()
            if (r10 == 0) goto L8c
            r8.j(r0)
        L8c:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r10 = r8.r
            java.lang.Object r10 = r10.get(r1)
            if (r10 == 0) goto L99
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r10 = r8.r
            r10.remove(r1)
        L99:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r10 = r8.cw
            java.lang.Object r10 = r10.get(r1)
            if (r10 == 0) goto La6
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r10 = r8.cw
            r10.remove(r1)
        La6:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r10 = r8.up
            java.lang.Object r10 = r10.get(r1)
            if (r10 == 0) goto Lb3
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r10 = r8.up
            r10.remove(r1)
        Lb3:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r10 = r8.m
            java.lang.Object r10 = r10.get(r1)
            if (r10 == 0) goto Lc0
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r10 = r8.m
            r10.remove(r1)
        Lc0:
            boolean r10 = r8.j(r1)
            java.lang.String r5 = "AbsDownloadEngine"
            if (r10 == 0) goto Le9
            boolean r10 = r0.el()
            if (r10 != 0) goto Le9
            java.lang.String r10 = "another task with same id is downloading when tryDownload"
            com.ss.android.socialbase.downloader.m.j.xt(r5, r10)
            r9.w()
            com.ss.android.socialbase.downloader.r.l r9 = r9.up()
            com.ss.android.socialbase.downloader.up.j r10 = new com.ss.android.socialbase.downloader.up.j
            java.lang.String r1 = "downloadInfo is isDownloading and addListenerToSameTask is false"
            r10.<init>(r2, r1)
            int r1 = r0.i()
            com.ss.android.socialbase.downloader.tl.j.j(r9, r0, r10, r1)
            return
        Le9:
            java.lang.String r10 = "no downloading task :"
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r10 = r10.concat(r2)
            com.ss.android.socialbase.downloader.m.j.xt(r5, r10)
            boolean r10 = r0.el()
            if (r10 == 0) goto L101
            com.ss.android.socialbase.downloader.xt.j r10 = com.ss.android.socialbase.downloader.xt.j.cw
            r0.j(r10)
        L101:
            r10 = 32768(0x8000, float:4.5918E-41)
            boolean r10 = com.ss.android.socialbase.downloader.az.j.j(r10)
            if (r10 == 0) goto L11b
            com.ss.android.socialbase.downloader.az.tl<java.lang.Integer, com.ss.android.socialbase.downloader.ae.r> r10 = r8.tl
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r10 = r10.remove(r0)
            com.ss.android.socialbase.downloader.ae.r r10 = (com.ss.android.socialbase.downloader.ae.r) r10
            if (r10 == 0) goto L11b
            r9.j(r10)
        L11b:
            long r6 = android.os.SystemClock.uptimeMillis()
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r10 = r8.xt
            java.lang.Object r10 = r10.get(r1)
            com.ss.android.socialbase.downloader.ae.r r10 = (com.ss.android.socialbase.downloader.ae.r) r10
            if (r10 == 0) goto L13b
            com.ss.android.socialbase.downloader.ae.cw r10 = r10.j()
            if (r10 == 0) goto L13b
            int r10 = r10.i()
            boolean r0 = com.ss.android.socialbase.downloader.xt.m.xt(r10)
            if (r0 == 0) goto L13c
            r4 = 1
            goto L13c
        L13b:
            r10 = 0
        L13c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "can add listener "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r2 = " , oldTaskStatus is :"
            r0.append(r2)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r5, r10)
            if (r4 == 0) goto L15b
            r9.w()
            return
        L15b:
            r8.xt(r9)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r10 = r8.xt
            r10.put(r1, r9)
            android.util.SparseArray<java.lang.Long> r10 = r8.g
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r10.put(r1, r0)
            r8.j(r1, r9)
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.impls.j r0, int r1, boolean r2) {
            r0.r(r1, r2)
            return
    }

    private synchronized void r(int r4, boolean r5) {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "AbsDownloadEngine"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = "clearDownloadDataInSubThread::id="
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L76
            r1.append(r4)     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = " deleteTargetFile="
            r1.append(r2)     // Catch: java.lang.Throwable -> L76
            r1.append(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L76
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)     // Catch: java.lang.Throwable -> L76
            com.ss.android.socialbase.downloader.downloader.vl r0 = r3.qv     // Catch: java.lang.Throwable -> L2a
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.xt(r4)     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L3a
            if (r5 == 0) goto L2c
            com.ss.android.socialbase.downloader.az.m.j(r0)     // Catch: java.lang.Throwable -> L2a
            goto L37
        L2a:
            r4 = move-exception
            goto L71
        L2c:
            java.lang.String r5 = r0.vl()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = r0.jy()     // Catch: java.lang.Throwable -> L2a
            com.ss.android.socialbase.downloader.az.m.cw(r5, r1)     // Catch: java.lang.Throwable -> L2a
        L37:
            r0.ot()     // Catch: java.lang.Throwable -> L2a
        L3a:
            com.ss.android.socialbase.downloader.downloader.vl r5 = r3.qv     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L40
            r5.m(r4)     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L40
            goto L44
        L40:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)     // Catch: java.lang.Throwable -> L2a
        L44:
            r5 = 0
            r0 = -4
            r3.j(r4, r5, r0)     // Catch: java.lang.Throwable -> L2a
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r5 = r3.r     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L56
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r5 = r3.r     // Catch: java.lang.Throwable -> L2a
            r5.remove(r4)     // Catch: java.lang.Throwable -> L2a
        L56:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r5 = r3.cw     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L63
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r5 = r3.cw     // Catch: java.lang.Throwable -> L2a
            r5.remove(r4)     // Catch: java.lang.Throwable -> L2a
        L63:
            com.ss.android.socialbase.downloader.az.tl<java.lang.Integer, com.ss.android.socialbase.downloader.ae.r> r5 = r3.tl     // Catch: java.lang.Throwable -> L2a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L2a
            r5.remove(r0)     // Catch: java.lang.Throwable -> L2a
            com.ss.android.socialbase.downloader.jy.j.xt(r4)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)
            return
        L71:
            com.bytedance.sdk.component.utils.vl.j(r4)     // Catch: java.lang.Throwable -> L76
            monitor-exit(r3)
            return
        L76:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L76
            throw r4
    }

    private void up(int r2, boolean r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.qv     // Catch: java.lang.Throwable -> Lf
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.xt(r2)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            com.ss.android.socialbase.downloader.az.m.j(r0, r3)     // Catch: java.lang.Throwable -> Lf
            r0.ot()     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L47
        L11:
            com.ss.android.socialbase.downloader.downloader.vl r3 = r1.qv     // Catch: java.lang.Throwable -> Lf android.database.sqlite.SQLiteException -> L1c
            r3.r(r2)     // Catch: java.lang.Throwable -> Lf android.database.sqlite.SQLiteException -> L1c
            com.ss.android.socialbase.downloader.downloader.vl r3 = r1.qv     // Catch: java.lang.Throwable -> Lf android.database.sqlite.SQLiteException -> L1c
            r3.j(r0)     // Catch: java.lang.Throwable -> Lf android.database.sqlite.SQLiteException -> L1c
            goto L20
        L1c:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> Lf
        L20:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r3 = r1.r     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L2d
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r3 = r1.r     // Catch: java.lang.Throwable -> Lf
            r3.remove(r2)     // Catch: java.lang.Throwable -> Lf
        L2d:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r3 = r1.cw     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L3a
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r3 = r1.cw     // Catch: java.lang.Throwable -> Lf
            r3.remove(r2)     // Catch: java.lang.Throwable -> Lf
        L3a:
            com.ss.android.socialbase.downloader.az.tl<java.lang.Integer, com.ss.android.socialbase.downloader.ae.r> r3 = r1.tl     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lf
            r3.remove(r0)     // Catch: java.lang.Throwable -> Lf
            com.ss.android.socialbase.downloader.jy.j.xt(r2)     // Catch: java.lang.Throwable -> Lf
            return
        L47:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    private void xt(com.ss.android.socialbase.downloader.ae.r r5) {
            r4 = this;
            int r0 = r5.vl()
            if (r0 != 0) goto L10
            boolean r1 = r5.jy()
            if (r1 == 0) goto L10
            int r0 = r5.mi()
        L10:
            if (r0 != 0) goto L13
            return
        L13:
            android.util.SparseArray<android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r>> r1 = r4.ae
            int r2 = r5.i()
            java.lang.Object r1 = r1.get(r2)
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            if (r1 != 0) goto L2f
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            android.util.SparseArray<android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r>> r2 = r4.ae
            int r3 = r5.i()
            r2.put(r3, r1)
        L2f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "tryCacheSameTaskWithListenerHashCode id:"
            r2.<init>(r3)
            int r3 = r5.i()
            r2.append(r3)
            java.lang.String r3 = " listener hasCode:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "AbsDownloadEngine"
            com.ss.android.socialbase.downloader.m.j.xt(r3, r2)
            r1.put(r0, r5)
            return
    }

    static /* synthetic */ void xt(com.ss.android.socialbase.downloader.impls.j r0, int r1, boolean r2) {
            r0.up(r1, r2)
            return
    }

    private boolean xt(com.ss.android.socialbase.downloader.ae.cw r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3.sm()
            if (r1 == 0) goto Lf
            boolean r3 = r3.qb()
            return r3
        Lf:
            return r0
    }

    public synchronized boolean ae(int r3) {
            r2 = this;
            monitor-enter(r2)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r2.r     // Catch: java.lang.Throwable -> L15
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L15
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L17
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r2.up     // Catch: java.lang.Throwable -> L15
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L15
            r0 = r3
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r3 = move-exception
            goto L2b
        L17:
            r3 = 0
            if (r0 == 0) goto L29
            com.ss.android.socialbase.downloader.ae.cw r1 = r0.j()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L23
            r1.up(r3)     // Catch: java.lang.Throwable -> L15
        L23:
            r2.j(r0)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            r3 = 1
            return r3
        L29:
            monitor-exit(r2)
            return r3
        L2b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    protected abstract com.ss.android.socialbase.downloader.ws.cw cw(int r1);

    public void cw(int r3, boolean r4) {
            r2 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r2.qv
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.xt(r3)
            if (r0 == 0) goto Lb
            r2.j(r0)
        Lb:
            com.ss.android.socialbase.downloader.ws.tl r0 = r2.j
            com.ss.android.socialbase.downloader.impls.j$4 r1 = new com.ss.android.socialbase.downloader.impls.j$4
            r1.<init>(r2, r3)
            r0.post(r1)
            com.ss.android.socialbase.downloader.impls.j$5 r0 = new com.ss.android.socialbase.downloader.impls.j$5
            r0.<init>(r2, r3, r4)
            r3 = 0
            com.ss.android.socialbase.downloader.downloader.cw.j(r0, r3)
            return
    }

    public synchronized com.ss.android.socialbase.downloader.r.h g(int r2) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.xt     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            com.ss.android.socialbase.downloader.r.h r2 = r0.oq()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L11:
            r2 = move-exception
            goto L56
        L13:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.cw     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L23
            com.ss.android.socialbase.downloader.r.h r2 = r0.oq()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L23:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.r     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L33
            com.ss.android.socialbase.downloader.r.h r2 = r0.oq()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L33:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.up     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L43
            com.ss.android.socialbase.downloader.r.h r2 = r0.oq()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L43:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.m     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.r r2 = (com.ss.android.socialbase.downloader.ae.r) r2     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L53
            com.ss.android.socialbase.downloader.r.h r2 = r2.oq()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L53:
            monitor-exit(r1)
            r2 = 0
            return r2
        L56:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    protected abstract java.util.List<java.lang.Integer> j();

    public synchronized java.util.List<com.ss.android.socialbase.downloader.ae.cw> j(java.lang.String r6) {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto La
            monitor-exit(r5)
            r6 = 0
            return r6
        La:
            com.ss.android.socialbase.downloader.downloader.vl r0 = r5.qv     // Catch: java.lang.Throwable -> L1b
            java.util.List r0 = r0.j(r6)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L19
            goto L1d
        L19:
            monitor-exit(r5)
            return r0
        L1b:
            r6 = move-exception
            goto L55
        L1d:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r1 = r5.xt     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1b
            r2 = 0
        L29:
            if (r2 >= r1) goto L53
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r3 = r5.xt     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r3 = r3.valueAt(r2)     // Catch: java.lang.Throwable -> L1b
            com.ss.android.socialbase.downloader.ae.r r3 = (com.ss.android.socialbase.downloader.ae.r) r3     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L50
            com.ss.android.socialbase.downloader.ae.cw r4 = r3.j()     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L50
            com.ss.android.socialbase.downloader.ae.cw r4 = r3.j()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = r4.oq()     // Catch: java.lang.Throwable -> L1b
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L50
            com.ss.android.socialbase.downloader.ae.cw r3 = r3.j()     // Catch: java.lang.Throwable -> L1b
            r0.add(r3)     // Catch: java.lang.Throwable -> L1b
        L50:
            int r2 = r2 + 1
            goto L29
        L53:
            monitor-exit(r5)
            return r0
        L55:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1b
            throw r6
    }

    public synchronized void j(int r2, int r3, int r4) {
            r1 = this;
            monitor-enter(r1)
            r0 = -7
            if (r4 == r0) goto L7c
            r0 = -6
            if (r4 == r0) goto L6a
            r0 = -4
            if (r4 == r0) goto L62
            r0 = -3
            if (r4 == r0) goto L51
            r0 = -1
            if (r4 == r0) goto L7c
            r0 = 7
            if (r4 == r0) goto L32
            r3 = 8
            if (r4 == r3) goto L18
            goto L68
        L18:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r3 = r1.xt     // Catch: java.lang.Throwable -> L30
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L30
            com.ss.android.socialbase.downloader.ae.r r3 = (com.ss.android.socialbase.downloader.ae.r) r3     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L65
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r4 = r1.m     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L65
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r4 = r1.m     // Catch: java.lang.Throwable -> L30
            r4.put(r2, r3)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r2 = move-exception
            goto L9b
        L32:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r4 = r1.xt     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L30
            com.ss.android.socialbase.downloader.ae.r r4 = (com.ss.android.socialbase.downloader.ae.r) r4     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L4c
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.up     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L49
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.up     // Catch: java.lang.Throwable -> L30
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> L30
        L49:
            r1.j(r2, r3)     // Catch: java.lang.Throwable -> L30
        L4c:
            r1.av(r2)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)
            return
        L51:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r4 = r1.xt     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L30
            com.ss.android.socialbase.downloader.ae.r r4 = (com.ss.android.socialbase.downloader.ae.r) r4     // Catch: java.lang.Throwable -> L30
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.cw     // Catch: java.lang.Throwable -> L30
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> L30
            r1.j(r2, r3)     // Catch: java.lang.Throwable -> L30
            goto L65
        L62:
            r1.j(r2, r3)     // Catch: java.lang.Throwable -> L30
        L65:
            r1.av(r2)     // Catch: java.lang.Throwable -> L30
        L68:
            monitor-exit(r1)
            return
        L6a:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r4 = r1.xt     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L30
            com.ss.android.socialbase.downloader.ae.r r4 = (com.ss.android.socialbase.downloader.ae.r) r4     // Catch: java.lang.Throwable -> L30
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.cw     // Catch: java.lang.Throwable -> L30
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> L30
            r1.j(r2, r3)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)
            return
        L7c:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r4 = r1.xt     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L30
            com.ss.android.socialbase.downloader.ae.r r4 = (com.ss.android.socialbase.downloader.ae.r) r4     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L96
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.r     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L93
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.r     // Catch: java.lang.Throwable -> L30
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> L30
        L93:
            r1.j(r2, r3)     // Catch: java.lang.Throwable -> L30
        L96:
            r1.av(r2)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)
            return
        L9b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r2
    }

    public synchronized void j(int r2, int r3, com.ss.android.socialbase.downloader.r.a r4, com.ss.android.socialbase.downloader.xt.tl r5, boolean r6) {
            r1 = this;
            monitor-enter(r1)
            com.ss.android.socialbase.downloader.ae.r r0 = r1.az(r2)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L17
            com.ss.android.socialbase.downloader.az.tl<java.lang.Integer, com.ss.android.socialbase.downloader.ae.r> r0 = r1.tl     // Catch: java.lang.Throwable -> L15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L15
            r0 = r2
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r2 = move-exception
            goto L1e
        L17:
            if (r0 == 0) goto L1c
            r0.j(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L15
        L1c:
            monitor-exit(r1)
            return
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    public synchronized void j(int r3, int r4, com.ss.android.socialbase.downloader.r.a r5, com.ss.android.socialbase.downloader.xt.tl r6, boolean r7, boolean r8) {
            r2 = this;
            monitor-enter(r2)
            com.ss.android.socialbase.downloader.ae.r r0 = r2.az(r3)     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L3a
            r0.xt(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L21
            com.ss.android.socialbase.downloader.ae.cw r4 = r0.j()     // Catch: java.lang.Throwable -> L21
            if (r8 == 0) goto L38
            if (r4 == 0) goto L38
            boolean r3 = r2.j(r3)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L38
            com.ss.android.socialbase.downloader.xt.tl r3 = com.ss.android.socialbase.downloader.xt.tl.j     // Catch: java.lang.Throwable -> L21
            if (r6 == r3) goto L23
            com.ss.android.socialbase.downloader.xt.tl r3 = com.ss.android.socialbase.downloader.xt.tl.cw     // Catch: java.lang.Throwable -> L21
            if (r6 != r3) goto L38
            goto L23
        L21:
            r3 = move-exception
            goto L73
        L23:
            com.ss.android.socialbase.downloader.xt.tl r3 = com.ss.android.socialbase.downloader.xt.tl.cw     // Catch: java.lang.Throwable -> L21
            if (r6 != r3) goto L2e
            boolean r3 = r4.oy()     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L2e
            goto L38
        L2e:
            com.ss.android.socialbase.downloader.ws.tl r3 = r2.j     // Catch: java.lang.Throwable -> L21
            com.ss.android.socialbase.downloader.impls.j$6 r6 = new com.ss.android.socialbase.downloader.impls.j$6     // Catch: java.lang.Throwable -> L21
            r6.<init>(r2, r5, r4)     // Catch: java.lang.Throwable -> L21
            r3.post(r6)     // Catch: java.lang.Throwable -> L21
        L38:
            monitor-exit(r2)
            return
        L3a:
            r8 = 32768(0x8000, float:4.5918E-41)
            boolean r8 = com.ss.android.socialbase.downloader.az.j.j(r8)     // Catch: java.lang.Throwable -> L21
            if (r8 == 0) goto L71
            com.ss.android.socialbase.downloader.downloader.vl r8 = r2.qv     // Catch: java.lang.Throwable -> L21
            com.ss.android.socialbase.downloader.ae.cw r8 = r8.xt(r3)     // Catch: java.lang.Throwable -> L21
            if (r8 == 0) goto L71
            int r0 = r8.i()     // Catch: java.lang.Throwable -> L21
            r1 = -3
            if (r0 == r1) goto L71
            com.ss.android.socialbase.downloader.az.tl<java.lang.Integer, com.ss.android.socialbase.downloader.ae.r> r0 = r2.tl     // Catch: java.lang.Throwable -> L21
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L21
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L6e
            com.ss.android.socialbase.downloader.ae.r r0 = new com.ss.android.socialbase.downloader.ae.r     // Catch: java.lang.Throwable -> L21
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L21
            com.ss.android.socialbase.downloader.az.tl<java.lang.Integer, com.ss.android.socialbase.downloader.ae.r> r8 = r2.tl     // Catch: java.lang.Throwable -> L21
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L21
            r8.put(r3, r0)     // Catch: java.lang.Throwable -> L21
        L6e:
            r0.xt(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L21
        L71:
            monitor-exit(r2)
            return
        L73:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r3
    }

    public abstract void j(int r1, long r2);

    protected abstract void j(int r1, com.ss.android.socialbase.downloader.ae.r r2);

    public synchronized void j(int r2, com.ss.android.socialbase.downloader.r.h r3) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.xt     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lf
            com.ss.android.socialbase.downloader.ae.r r2 = (com.ss.android.socialbase.downloader.ae.r) r2     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            r2.xt(r3)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L13
        L11:
            monitor-exit(r1)
            return
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    @Override // com.ss.android.socialbase.downloader.ws.tl.j
    public void j(android.os.Message r6) {
            r5 = this;
            int r0 = r6.arg1
            int r1 = r6.arg2
            java.lang.String r2 = "AbsDownloadEngine"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "handleMsg id: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " listener hasCode: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r2, r3)
            java.lang.Object r2 = r6.obj
            boolean r3 = r2 instanceof java.lang.Exception
            r4 = 0
            if (r3 == 0) goto L29
            com.ss.android.socialbase.downloader.up.j r2 = (com.ss.android.socialbase.downloader.up.j) r2
            goto L2a
        L29:
            r2 = r4
        L2a:
            monitor-enter(r5)
            if (r1 != 0) goto L39
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r3 = r5.xt     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L37
            r4 = r3
            com.ss.android.socialbase.downloader.ae.r r4 = (com.ss.android.socialbase.downloader.ae.r) r4     // Catch: java.lang.Throwable -> L37
            goto L4a
        L37:
            r6 = move-exception
            goto L5a
        L39:
            android.util.SparseArray<android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r>> r3 = r5.ae     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L37
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L37
            r4 = r3
            com.ss.android.socialbase.downloader.ae.r r4 = (com.ss.android.socialbase.downloader.ae.r) r4     // Catch: java.lang.Throwable -> L37
        L4a:
            if (r4 != 0) goto L4e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L37
            return
        L4e:
            int r3 = r6.what     // Catch: java.lang.Throwable -> L37
            r5.j(r3, r2, r4)     // Catch: java.lang.Throwable -> L37
            int r6 = r6.what     // Catch: java.lang.Throwable -> L37
            r5.j(r0, r1, r6)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L37
            return
        L5a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L37
            throw r6
    }

    public synchronized void j(com.ss.android.socialbase.downloader.ae.r r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L5
            monitor-exit(r2)
            return
        L5:
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.j()     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto Ld
            monitor-exit(r2)
            return
        Ld:
            r1 = 0
            r0.up(r1)     // Catch: java.lang.Throwable -> L1e
            com.ss.android.socialbase.downloader.xt.ae r0 = r0.w()     // Catch: java.lang.Throwable -> L1e
            com.ss.android.socialbase.downloader.xt.ae r1 = com.ss.android.socialbase.downloader.xt.ae.j     // Catch: java.lang.Throwable -> L1e
            if (r0 == r1) goto L20
            r2.cw(r3)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)
            return
        L1e:
            r3 = move-exception
            goto L26
        L20:
            r0 = 1
            r2.j(r3, r0)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)
            return
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r3
    }

    public abstract void j(com.ss.android.socialbase.downloader.ws.cw r1);

    public synchronized void j(java.util.List<java.lang.String> r7) {
            r6 = this;
            monitor-enter(r6)
            r0 = 1048576(0x100000, float:1.469368E-39)
            boolean r0 = com.ss.android.socialbase.downloader.az.j.j(r0)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            r1 = 1
            if (r0 == 0) goto L17
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt(r0)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            goto L18
        L13:
            r7 = move-exception
            goto L62
        L15:
            r7 = move-exception
            goto L5d
        L17:
            r0 = 1
        L18:
            r2 = 0
        L19:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r3 = r6.r     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            if (r2 >= r3) goto L5b
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r3 = r6.r     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            int r3 = r3.keyAt(r2)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r4 = r6.r     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            com.ss.android.socialbase.downloader.ae.r r3 = (com.ss.android.socialbase.downloader.ae.r) r3     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            if (r3 == 0) goto L58
            com.ss.android.socialbase.downloader.ae.cw r4 = r3.j()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            if (r4 == 0) goto L58
            java.lang.String r5 = r4.xw()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            if (r5 == 0) goto L58
            java.lang.String r5 = r4.xw()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            boolean r5 = r7.contains(r5)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            if (r5 == 0) goto L58
            boolean r5 = r4.x()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            if (r5 == 0) goto L4f
            if (r0 == 0) goto L58
        L4f:
            r4.xt(r1)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            r4.cw(r1)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            r6.j(r3)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        L58:
            int r2 = r2 + 1
            goto L19
        L5b:
            monitor-exit(r6)
            return
        L5d:
            com.bytedance.sdk.component.utils.vl.j(r7)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r6)
            return
        L62:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L13
            throw r7
    }

    public abstract boolean j(int r1);

    public synchronized boolean j(int r8, boolean r9) {
            r7 = this;
            monitor-enter(r7)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r7.xt     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L18
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L18
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 != 0) goto L1a
            boolean r2 = com.ss.android.socialbase.downloader.az.j.j(r1)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L1a
            com.ss.android.socialbase.downloader.ae.r r0 = r7.az(r8)     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r8 = move-exception
            goto L74
        L1a:
            r2 = 1
            if (r0 == 0) goto L4d
            com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r8)     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "fix_on_cancel_call_twice"
            boolean r3 = r3.xt(r4, r2)     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L33
            com.ss.android.socialbase.downloader.downloader.m r3 = new com.ss.android.socialbase.downloader.downloader.m     // Catch: java.lang.Throwable -> L18
            com.ss.android.socialbase.downloader.ws.tl r4 = r7.j     // Catch: java.lang.Throwable -> L18
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> L18
            r3.cw()     // Catch: java.lang.Throwable -> L18
        L33:
            com.ss.android.socialbase.downloader.ae.cw r3 = r0.j()     // Catch: java.lang.Throwable -> L18
            com.ss.android.socialbase.downloader.xt.tl r4 = com.ss.android.socialbase.downloader.xt.tl.j     // Catch: java.lang.Throwable -> L18
            android.util.SparseArray r4 = r0.j(r4)     // Catch: java.lang.Throwable -> L18
            com.ss.android.socialbase.downloader.xt.tl r5 = com.ss.android.socialbase.downloader.xt.tl.cw     // Catch: java.lang.Throwable -> L18
            android.util.SparseArray r0 = r0.j(r5)     // Catch: java.lang.Throwable -> L18
            com.ss.android.socialbase.downloader.ws.tl r5 = r7.j     // Catch: java.lang.Throwable -> L18
            com.ss.android.socialbase.downloader.impls.j$1 r6 = new com.ss.android.socialbase.downloader.impls.j$1     // Catch: java.lang.Throwable -> L18
            r6.<init>(r7, r4, r3, r0)     // Catch: java.lang.Throwable -> L18
            r5.post(r6)     // Catch: java.lang.Throwable -> L18
        L4d:
            com.ss.android.socialbase.downloader.downloader.vl r0 = r7.qv     // Catch: java.lang.Throwable -> L18
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.xt(r8)     // Catch: java.lang.Throwable -> L18
            boolean r1 = com.ss.android.socialbase.downloader.az.j.j(r1)     // Catch: java.lang.Throwable -> L18
            r3 = -4
            if (r1 == 0) goto L60
            if (r0 == 0) goto L6f
            r0.r(r3)     // Catch: java.lang.Throwable -> L18
            goto L6f
        L60:
            if (r0 == 0) goto L6f
            int r1 = r0.i()     // Catch: java.lang.Throwable -> L18
            boolean r1 = com.ss.android.socialbase.downloader.xt.m.xt(r1)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L6f
            r0.r(r3)     // Catch: java.lang.Throwable -> L18
        L6f:
            r7.xt(r8, r9)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r7)
            return r2
        L74:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L18
            throw r8
    }

    public synchronized void jy(int r3) {
            r2 = this;
            monitor-enter(r2)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r2.xt     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L19
            com.ss.android.socialbase.downloader.ae.r r3 = (com.ss.android.socialbase.downloader.ae.r) r3     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L1b
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.j()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            r1 = 1
            r0.vl(r1)     // Catch: java.lang.Throwable -> L19
            r2.j(r3)     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r3 = move-exception
            goto L1d
        L1b:
            monitor-exit(r2)
            return
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    public synchronized boolean m(int r3) {
            r2 = this;
            monitor-enter(r2)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r2.xt     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L16
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1c
            com.ss.android.socialbase.downloader.ae.cw r3 = r0.j()     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L18
            r1 = 0
            r3.up(r1)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L22
        L18:
            r2.j(r0)     // Catch: java.lang.Throwable -> L16
            goto L1f
        L1c:
            r2.ae(r3)     // Catch: java.lang.Throwable -> L16
        L1f:
            monitor-exit(r2)
            r3 = 1
            return r3
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    public synchronized com.ss.android.socialbase.downloader.r.tj oq(int r2) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.xt     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            com.ss.android.socialbase.downloader.r.tj r2 = r0.ws()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L11:
            r2 = move-exception
            goto L56
        L13:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.cw     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L23
            com.ss.android.socialbase.downloader.r.tj r2 = r0.ws()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L23:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.r     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L33
            com.ss.android.socialbase.downloader.r.tj r2 = r0.ws()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L33:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.up     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L43
            com.ss.android.socialbase.downloader.r.tj r2 = r0.ws()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L43:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.m     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.r r2 = (com.ss.android.socialbase.downloader.ae.r) r2     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L53
            com.ss.android.socialbase.downloader.r.tj r2 = r2.ws()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L53:
            monitor-exit(r1)
            r2 = 0
            return r2
        L56:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public synchronized boolean qv(int r4) {
            r3 = this;
            monitor-enter(r3)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r3.up     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L1c
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            if (r0 == 0) goto L21
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.j()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L21
            boolean r4 = r2.o()     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L1e
            r3.j(r0, r1)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r4 = move-exception
            goto L39
        L1e:
            monitor-exit(r3)
            r4 = 1
            return r4
        L21:
            com.ss.android.socialbase.downloader.downloader.vl r0 = r3.qv     // Catch: java.lang.Throwable -> L1c
            com.ss.android.socialbase.downloader.ae.cw r4 = r0.xt(r4)     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L37
            boolean r0 = r4.o()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L37
            com.ss.android.socialbase.downloader.ae.r r0 = new com.ss.android.socialbase.downloader.ae.r     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L1c
            r3.j(r0, r1)     // Catch: java.lang.Throwable -> L1c
        L37:
            monitor-exit(r3)
            return r1
        L39:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1c
            throw r4
    }

    public synchronized com.ss.android.socialbase.downloader.ae.cw r(int r3) {
            r2 = this;
            monitor-enter(r2)
            com.ss.android.socialbase.downloader.downloader.vl r0 = r2.qv     // Catch: java.lang.Throwable -> L18
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.xt(r3)     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1a
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r1 = r2.xt     // Catch: java.lang.Throwable -> L18
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L18
            com.ss.android.socialbase.downloader.ae.r r3 = (com.ss.android.socialbase.downloader.ae.r) r3     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1a
            com.ss.android.socialbase.downloader.ae.cw r0 = r3.j()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r3 = move-exception
            goto L1c
        L1a:
            monitor-exit(r2)
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    public synchronized com.ss.android.socialbase.downloader.r.wq tl(int r2) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.xt     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            com.ss.android.socialbase.downloader.r.wq r2 = r0.qv()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L11:
            r2 = move-exception
            goto L56
        L13:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.cw     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L23
            com.ss.android.socialbase.downloader.r.wq r2 = r0.qv()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L23:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.r     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L33
            com.ss.android.socialbase.downloader.r.wq r2 = r0.qv()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L33:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.up     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.r r0 = (com.ss.android.socialbase.downloader.ae.r) r0     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L43
            com.ss.android.socialbase.downloader.r.wq r2 = r0.qv()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L43:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.m     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.ss.android.socialbase.downloader.ae.r r2 = (com.ss.android.socialbase.downloader.ae.r) r2     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L53
            com.ss.android.socialbase.downloader.r.wq r2 = r2.qv()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L53:
            monitor-exit(r1)
            r2 = 0
            return r2
        L56:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public synchronized boolean up(int r5) {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "AbsDownloadEngine"
            java.lang.String r1 = "pause id="
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L23
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)     // Catch: java.lang.Throwable -> L23
            com.ss.android.socialbase.downloader.downloader.vl r0 = r4.qv     // Catch: java.lang.Throwable -> L23
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.xt(r5)     // Catch: java.lang.Throwable -> L23
            r1 = 0
            if (r0 == 0) goto L25
            int r2 = r0.i()     // Catch: java.lang.Throwable -> L23
            r3 = 11
            if (r2 != r3) goto L25
            monitor-exit(r4)
            return r1
        L23:
            r5 = move-exception
            goto L79
        L25:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r2 = r4.xt     // Catch: java.lang.Throwable -> L23
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L23
            r4.xt(r5)     // Catch: java.lang.Throwable -> L76
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            r2 = 1
            if (r0 != 0) goto L45
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r4.xt     // Catch: java.lang.Throwable -> L23
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L23
            com.ss.android.socialbase.downloader.ae.r r5 = (com.ss.android.socialbase.downloader.ae.r) r5     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L74
            com.ss.android.socialbase.downloader.downloader.m r0 = new com.ss.android.socialbase.downloader.downloader.m     // Catch: java.lang.Throwable -> L23
            com.ss.android.socialbase.downloader.ws.tl r1 = r4.j     // Catch: java.lang.Throwable -> L23
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L23
            r0.r()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r4)
            return r2
        L45:
            r4.j(r0)     // Catch: java.lang.Throwable -> L23
            int r3 = r0.i()     // Catch: java.lang.Throwable -> L23
            if (r3 != r2) goto L64
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r4.xt     // Catch: java.lang.Throwable -> L23
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L23
            com.ss.android.socialbase.downloader.ae.r r5 = (com.ss.android.socialbase.downloader.ae.r) r5     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L74
            com.ss.android.socialbase.downloader.downloader.m r0 = new com.ss.android.socialbase.downloader.downloader.m     // Catch: java.lang.Throwable -> L23
            com.ss.android.socialbase.downloader.ws.tl r1 = r4.j     // Catch: java.lang.Throwable -> L23
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L23
            r0.r()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r4)
            return r2
        L64:
            int r5 = r0.i()     // Catch: java.lang.Throwable -> L23
            boolean r5 = com.ss.android.socialbase.downloader.xt.m.xt(r5)     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L74
            r5 = -2
            r0.r(r5)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r4)
            return r2
        L74:
            monitor-exit(r4)
            return r1
        L76:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            throw r5     // Catch: java.lang.Throwable -> L23
        L79:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L23
            throw r5
    }

    public synchronized boolean vl(int r2) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.m     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L1b
            com.ss.android.socialbase.downloader.ae.r r2 = (com.ss.android.socialbase.downloader.ae.r) r2     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L20
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.j()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L20
            boolean r0 = r0.el()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            r1.j(r2)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r2 = move-exception
            goto L23
        L1d:
            monitor-exit(r1)
            r2 = 1
            return r2
        L20:
            monitor-exit(r1)
            r2 = 0
            return r2
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }

    public synchronized boolean ws(int r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L1b
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.xt     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r0 = r1.r     // Catch: java.lang.Throwable -> L14
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L1b
            goto L16
        L14:
            r2 = move-exception
            goto L19
        L16:
            monitor-exit(r1)
            r2 = 1
            return r2
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2
        L1b:
            monitor-exit(r1)
            r2 = 0
            return r2
    }

    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L8
            r5 = 0
            return r5
        L8:
            java.util.List r0 = r4.j()
            java.util.Iterator r0 = r0.iterator()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.ss.android.socialbase.downloader.ae.cw r2 = r4.r(r2)
            if (r2 == 0) goto L15
            java.lang.String r3 = r2.xw()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L15
            r1.add(r2)
            goto L15
        L39:
            return r1
    }

    public void xt() {
            r2 = this;
            java.util.List r0 = r2.j()
            if (r0 != 0) goto L7
            goto L1f
        L7:
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.up(r1)
            goto Lb
        L1f:
            return
    }

    protected abstract void xt(int r1);

    public synchronized void xt(int r9, int r10, com.ss.android.socialbase.downloader.r.a r11, com.ss.android.socialbase.downloader.xt.tl r12, boolean r13) {
            r8 = this;
            monitor-enter(r8)
            r7 = 1
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.j(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r8)
            return
        Ld:
            r0 = move-exception
            r9 = r0
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld
            throw r9
    }

    public void xt(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.qv
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.xt(r2)
            if (r0 == 0) goto Lb
            r0.qv(r3)
        Lb:
            r1.j(r2, r3)
            return
    }

    public void xt(int r3, boolean r4) {
            r2 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r2.qv
            com.ss.android.socialbase.downloader.ae.cw r0 = r0.xt(r3)
            if (r0 == 0) goto Lb
            r2.j(r0)
        Lb:
            com.ss.android.socialbase.downloader.ws.tl r0 = r2.j
            com.ss.android.socialbase.downloader.impls.j$2 r1 = new com.ss.android.socialbase.downloader.impls.j$2
            r1.<init>(r2, r3)
            r0.post(r1)
            com.ss.android.socialbase.downloader.impls.j$3 r0 = new com.ss.android.socialbase.downloader.impls.j$3
            r0.<init>(r2, r3, r4)
            r3 = 0
            com.ss.android.socialbase.downloader.downloader.cw.j(r0, r3)
            return
    }

    public synchronized void xt(java.util.List<java.lang.String> r6) {
            r5 = this;
            monitor-enter(r5)
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt(r0)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r0 != 0) goto Ld
            monitor-exit(r5)
            return
        Ld:
            r0 = 0
        Le:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r1 = r5.xt     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r0 >= r1) goto L6a
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r1 = r5.xt     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            int r1 = r1.keyAt(r0)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.r> r2 = r5.xt     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            com.ss.android.socialbase.downloader.ae.r r1 = (com.ss.android.socialbase.downloader.ae.r) r1     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r1 == 0) goto L67
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.j()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r2 == 0) goto L67
            java.lang.String r3 = r2.xw()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r3 == 0) goto L67
            java.lang.String r3 = r2.xw()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            boolean r3 = r6.contains(r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r3 == 0) goto L67
            boolean r3 = r5.xt(r2)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r3 == 0) goto L67
            r3 = 1
            r2.xt(r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r2.cw(r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r5.j(r1)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r2.up(r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r1)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            com.ss.android.socialbase.downloader.downloader.mi r1 = r1.xt()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r1 == 0) goto L67
            r3 = 5
            r4 = 2
            r1.j(r2, r3, r4)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            goto L67
        L63:
            r6 = move-exception
            goto L71
        L65:
            r6 = move-exception
            goto L6c
        L67:
            int r0 = r0 + 1
            goto Le
        L6a:
            monitor-exit(r5)
            return
        L6c:
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r5)
            return
        L71:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L63
            throw r6
    }
}
