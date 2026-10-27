package com.ss.android.socialbase.downloader.impls;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class qv implements com.ss.android.socialbase.downloader.downloader.vl {
    private final android.util.SparseArray<java.util.Map<java.lang.Long, com.ss.android.socialbase.downloader.qv.g>> cw;
    private final android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> j;
    private final android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.xt>> xt;

    public qv() {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.j = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.xt = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.cw = r0
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw ae(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.xt(r2)
            if (r2 == 0) goto La
            r0 = 2
            r2.r(r0)
        La:
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw cw(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.xt(r2)
            if (r2 == 0) goto L14
            r0 = 0
            r2.j(r3, r0)
            r3 = -3
            r2.r(r3)
            r2.g(r0)
            r2.oq(r0)
        L14:
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized java.util.List<com.ss.android.socialbase.downloader.ae.xt> cw(int r2) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.xt>> r0 = r1.xt     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized java.util.List<com.ss.android.socialbase.downloader.ae.cw> cw(java.lang.String r6) {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L51
            r1 = 0
            if (r0 == 0) goto La
            monitor-exit(r5)
            return r1
        La:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r0 = r5.j     // Catch: java.lang.Throwable -> L51
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L14
            monitor-exit(r5)
            return r1
        L14:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51
            r0.<init>()     // Catch: java.lang.Throwable -> L51
            r1 = 0
        L1a:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r2 = r5.j     // Catch: java.lang.Throwable -> L51
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L51
            if (r1 >= r2) goto L56
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r2 = r5.j     // Catch: java.lang.Throwable -> L51
            int r2 = r2.keyAt(r1)     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r3 = r5.j     // Catch: java.lang.Throwable -> L51
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L51
            com.ss.android.socialbase.downloader.ae.cw r2 = (com.ss.android.socialbase.downloader.ae.cw) r2     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L53
            java.lang.String r3 = r2.xw()     // Catch: java.lang.Throwable -> L51
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L51
            if (r3 != 0) goto L53
            java.lang.String r3 = r2.xw()     // Catch: java.lang.Throwable -> L51
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L53
            int r3 = r2.i()     // Catch: java.lang.Throwable -> L51
            r4 = -3
            if (r3 != r4) goto L53
            r0.add(r2)     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r6 = move-exception
            goto L58
        L53:
            int r1 = r1 + 1
            goto L1a
        L56:
            monitor-exit(r5)
            return r0
        L58:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L51
            throw r6
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized void cw() {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r0 = r1.j     // Catch: java.lang.Throwable -> Ld
            r0.clear()     // Catch: java.lang.Throwable -> Ld
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.xt>> r0 = r1.xt     // Catch: java.lang.Throwable -> Ld
            r0.clear()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw g(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.xt(r2)
            if (r2 == 0) goto La
            r0 = 1
            r2.r(r0)
        La:
            return r2
    }

    public android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> j() {
            r1 = this;
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r0 = r1.j
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized com.ss.android.socialbase.downloader.ae.cw j(int r1, int r2) {
            r0 = this;
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.ae.cw r1 = r0.xt(r1)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            r1.up(r2)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto Lf
        Ld:
            monitor-exit(r0)
            return r1
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw j(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.xt(r2)
            if (r2 == 0) goto L2d
            r0 = 0
            r2.j(r3, r0)
            int r3 = r2.i()
            r4 = -3
            if (r3 == r4) goto L2d
            int r3 = r2.i()
            r4 = -2
            if (r3 == r4) goto L2d
            int r3 = r2.i()
            boolean r3 = com.ss.android.socialbase.downloader.xt.m.ae(r3)
            if (r3 != 0) goto L2d
            int r3 = r2.i()
            r4 = -4
            if (r3 == r4) goto L2d
            r3 = 4
            r2.r(r3)
        L2d:
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw j(int r1, long r2, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            com.ss.android.socialbase.downloader.ae.cw r1 = r0.xt(r1)
            if (r1 == 0) goto L23
            r1.ae(r2)
            r1.up(r4)
            java.lang.String r2 = r1.tl()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L1f
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L1f
            r1.m(r5)
        L1f:
            r2 = 3
            r1.r(r2)
        L23:
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized java.util.List<com.ss.android.socialbase.downloader.ae.cw> j(java.lang.String r6) {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
            r0.<init>()     // Catch: java.lang.Throwable -> L27
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r1 = r5.j     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            r2 = 0
        Ld:
            if (r2 >= r1) goto L31
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r3 = r5.j     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            java.lang.Object r3 = r3.valueAt(r2)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            com.ss.android.socialbase.downloader.ae.cw r3 = (com.ss.android.socialbase.downloader.ae.cw) r3     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            if (r6 == 0) goto L2b
            java.lang.String r4 = r3.oq()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            if (r4 == 0) goto L2b
            r0.add(r3)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            goto L2b
        L27:
            r6 = move-exception
            goto L33
        L29:
            r6 = move-exception
            goto L2e
        L2b:
            int r2 = r2 + 1
            goto Ld
        L2e:
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L27
        L31:
            monitor-exit(r5)
            return r0
        L33:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L27
            throw r6
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void j(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized void j(int r3, int r4, int r5, long r6) {
            r2 = this;
            monitor-enter(r2)
            java.util.List r3 = r2.cw(r3)     // Catch: java.lang.Throwable -> L4e
            if (r3 != 0) goto L9
            monitor-exit(r2)
            return
        L9:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L4e
        Ld:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L52
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L4e
            com.ss.android.socialbase.downloader.ae.xt r0 = (com.ss.android.socialbase.downloader.ae.xt) r0     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto Ld
            int r1 = r0.mi()     // Catch: java.lang.Throwable -> L4e
            if (r1 != r5) goto Ld
            boolean r1 = r0.m()     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto Ld
            java.util.List r3 = r0.ae()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L52
            java.util.List r3 = r0.ae()     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L4e
        L35:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L50
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L4e
            com.ss.android.socialbase.downloader.ae.xt r5 = (com.ss.android.socialbase.downloader.ae.xt) r5     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L35
            int r0 = r5.mi()     // Catch: java.lang.Throwable -> L4e
            if (r0 != r4) goto L35
            r5.xt(r6)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r2)
            return
        L4e:
            r3 = move-exception
            goto L54
        L50:
            monitor-exit(r2)
            return
        L52:
            monitor-exit(r2)
            return
        L54:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e
            throw r3
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized void j(int r3, int r4, long r5) {
            r2 = this;
            monitor-enter(r2)
            java.util.List r3 = r2.cw(r3)     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L9
            monitor-exit(r2)
            return
        L9:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L26
        Ld:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L28
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L26
            com.ss.android.socialbase.downloader.ae.xt r0 = (com.ss.android.socialbase.downloader.ae.xt) r0     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto Ld
            int r1 = r0.mi()     // Catch: java.lang.Throwable -> L26
            if (r1 != r4) goto Ld
            r0.xt(r5)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r2)
            return
        L26:
            r3 = move-exception
            goto L2a
        L28:
            monitor-exit(r2)
            return
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            throw r3
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized void j(int r2, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r3) {
            r1 = this;
            monitor-enter(r1)
            if (r3 != 0) goto L5
            monitor-exit(r1)
            return
        L5:
            r1.r(r2)     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> L3b
        Lc:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3b
            com.ss.android.socialbase.downloader.ae.xt r3 = (com.ss.android.socialbase.downloader.ae.xt) r3     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto Lc
            r1.j(r3)     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r3.m()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto Lc
            java.util.List r3 = r3.ae()     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3b
        L2b:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L3b
            com.ss.android.socialbase.downloader.ae.xt r0 = (com.ss.android.socialbase.downloader.ae.xt) r0     // Catch: java.lang.Throwable -> L3b
            r1.j(r0)     // Catch: java.lang.Throwable -> L3b
            goto L2b
        L3b:
            r2 = move-exception
            goto L3f
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3b
            throw r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void j(com.ss.android.socialbase.downloader.ae.xt r4) {
            r3 = this;
            int r0 = r4.qv()
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.xt>> r1 = r3.xt
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L18
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.xt>> r2 = r3.xt
            r2.put(r0, r1)
        L18:
            r1.add(r4)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized boolean j(int r2, java.util.Map<java.lang.Long, com.ss.android.socialbase.downloader.qv.g> r3) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<java.util.Map<java.lang.Long, com.ss.android.socialbase.downloader.qv.g>> r0 = r1.cw     // Catch: java.lang.Throwable -> L9
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            r2 = 0
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized boolean j(com.ss.android.socialbase.downloader.ae.cw r4) {
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            if (r4 != 0) goto L6
            monitor-exit(r3)
            return r0
        L6:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r1 = r3.j     // Catch: java.lang.Throwable -> L1f
            int r2 = r4.ae()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L13
            goto L14
        L13:
            r0 = 0
        L14:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r1 = r3.j     // Catch: java.lang.Throwable -> L1f
            int r2 = r4.ae()     // Catch: java.lang.Throwable -> L1f
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r3)
            return r0
        L1f:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
            throw r4
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized void jy(int r2) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<java.util.Map<java.lang.Long, com.ss.android.socialbase.downloader.qv.g>> r0 = r1.cw     // Catch: java.lang.Throwable -> L8
            r0.remove(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.xt>> m() {
            r1 = this;
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.xt>> r0 = r1.xt
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean m(int r1) {
            r0 = this;
            r0.up(r1)
            r0.r(r1)
            r0.jy(r1)
            r1 = 1
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw oq(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.xt(r2)
            if (r2 == 0) goto La
            r0 = -7
            r2.r(r0)
        La:
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw r(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.xt(r2)
            if (r2 == 0) goto Le
            r0 = 0
            r2.j(r3, r0)
            r3 = -2
            r2.r(r3)
        Le:
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized java.util.List<com.ss.android.socialbase.downloader.ae.cw> r(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L54
            r1 = 0
            if (r0 == 0) goto La
            monitor-exit(r4)
            return r1
        La:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r0 = r4.j     // Catch: java.lang.Throwable -> L54
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L14
            monitor-exit(r4)
            return r1
        L14:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r1 = 0
        L1a:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r2 = r4.j     // Catch: java.lang.Throwable -> L54
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L54
            if (r1 >= r2) goto L59
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r2 = r4.j     // Catch: java.lang.Throwable -> L54
            int r2 = r2.keyAt(r1)     // Catch: java.lang.Throwable -> L54
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r3 = r4.j     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L54
            com.ss.android.socialbase.downloader.ae.cw r2 = (com.ss.android.socialbase.downloader.ae.cw) r2     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L56
            java.lang.String r3 = r2.xw()     // Catch: java.lang.Throwable -> L54
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto L56
            java.lang.String r3 = r2.xw()     // Catch: java.lang.Throwable -> L54
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L56
            int r3 = r2.i()     // Catch: java.lang.Throwable -> L54
            boolean r3 = com.ss.android.socialbase.downloader.xt.m.m(r3)     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L56
            r0.add(r2)     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r5 = move-exception
            goto L5b
        L56:
            int r1 = r1 + 1
            goto L1a
        L59:
            monitor-exit(r4)
            return r0
        L5b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L54
            throw r5
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized void r(int r2) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.xt>> r0 = r1.xt     // Catch: java.lang.Throwable -> L8
            r0.remove(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean r() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw tl(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.xt(r2)
            if (r2 == 0) goto Le
            r0 = 5
            r2.r(r0)
            r0 = 0
            r2.g(r0)
        Le:
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean up() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized boolean up(int r2) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r0 = r1.j     // Catch: java.lang.Throwable -> L9
            r0.remove(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            r2 = 1
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized java.util.Map<java.lang.Long, com.ss.android.socialbase.downloader.qv.g> vl(int r2) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<java.util.Map<java.lang.Long, com.ss.android.socialbase.downloader.qv.g>> r0 = r1.cw     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized java.util.List<com.ss.android.socialbase.downloader.qv.g> ws(int r2) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<java.util.Map<java.lang.Long, com.ss.android.socialbase.downloader.qv.g>> r0 = r1.cw     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L1d
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L12
            goto L1f
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1d
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)
            return r0
        L1d:
            r2 = move-exception
            goto L22
        L1f:
            monitor-exit(r1)
            r2 = 0
            return r2
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            throw r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized com.ss.android.socialbase.downloader.ae.cw xt(int r2) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r0 = r1.j     // Catch: java.lang.Throwable -> La java.lang.Exception -> Lc
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Lc
            com.ss.android.socialbase.downloader.ae.cw r2 = (com.ss.android.socialbase.downloader.ae.cw) r2     // Catch: java.lang.Throwable -> La java.lang.Exception -> Lc
            goto L11
        La:
            r2 = move-exception
            goto L13
        Lc:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> La
            r2 = 0
        L11:
            monitor-exit(r1)
            return r2
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw xt(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.xt(r2)
            if (r2 == 0) goto L11
            r0 = 0
            r2.j(r3, r0)
            r3 = -1
            r2.r(r3)
            r2.g(r0)
        L11:
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt() {
            r3 = this;
            monitor-enter(r3)
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r0 = r3.j     // Catch: java.lang.Throwable -> L2e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto Lc
            monitor-exit(r3)
            r0 = 0
            return r0
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r1 = r3.j     // Catch: java.lang.Throwable -> L2e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            r1 = 0
        L18:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r2 = r3.j     // Catch: java.lang.Throwable -> L2e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L2e
            if (r1 >= r2) goto L33
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r2 = r3.j     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r2.valueAt(r1)     // Catch: java.lang.Throwable -> L2e
            com.ss.android.socialbase.downloader.ae.cw r2 = (com.ss.android.socialbase.downloader.ae.cw) r2     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L30
            r0.add(r2)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r0 = move-exception
            goto L35
        L30:
            int r1 = r1 + 1
            goto L18
        L33:
            monitor-exit(r3)
            return r0
        L35:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            throw r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public synchronized java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L54
            r1 = 0
            if (r0 == 0) goto La
            monitor-exit(r4)
            return r1
        La:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r0 = r4.j     // Catch: java.lang.Throwable -> L54
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L14
            monitor-exit(r4)
            return r1
        L14:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r1 = 0
        L1a:
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r2 = r4.j     // Catch: java.lang.Throwable -> L54
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L54
            if (r1 >= r2) goto L59
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r2 = r4.j     // Catch: java.lang.Throwable -> L54
            int r2 = r2.keyAt(r1)     // Catch: java.lang.Throwable -> L54
            android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r3 = r4.j     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L54
            com.ss.android.socialbase.downloader.ae.cw r2 = (com.ss.android.socialbase.downloader.ae.cw) r2     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L56
            java.lang.String r3 = r2.xw()     // Catch: java.lang.Throwable -> L54
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto L56
            java.lang.String r3 = r2.xw()     // Catch: java.lang.Throwable -> L54
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L56
            int r3 = r2.i()     // Catch: java.lang.Throwable -> L54
            boolean r3 = com.ss.android.socialbase.downloader.xt.m.ae(r3)     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L56
            r0.add(r2)     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r5 = move-exception
            goto L5b
        L56:
            int r1 = r1 + 1
            goto L1a
        L59:
            monitor-exit(r4)
            return r0
        L5b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L54
            throw r5
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void xt(int r1, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r2) {
            r0 = this;
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void xt(com.ss.android.socialbase.downloader.ae.cw r1) {
            r0 = this;
            r0.j(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void xt(com.ss.android.socialbase.downloader.ae.xt r1) {
            r0 = this;
            return
    }
}
