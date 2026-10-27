package com.bytedance.msdk.cw.m.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    private final java.util.concurrent.atomic.AtomicInteger ae;
    private java.util.concurrent.atomic.AtomicInteger cw;
    private final java.util.List<java.lang.String> g;
    public final java.util.Map<java.lang.Integer, java.lang.Boolean> j;
    private final java.util.concurrent.atomic.AtomicInteger m;
    private final java.util.concurrent.atomic.AtomicInteger oq;
    private java.util.List<java.lang.Integer> qv;
    private java.util.concurrent.atomic.AtomicBoolean r;
    private final java.util.concurrent.atomic.AtomicInteger tl;
    private final java.util.Map<java.lang.Integer, java.util.concurrent.atomic.AtomicInteger> up;
    public final java.util.Map<java.lang.Integer, java.lang.Boolean> xt;

    public j() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = -1
            r0.<init>(r1)
            r2.cw = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.r = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.j = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.xt = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.up = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.m = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.ae = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.tl = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.g = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = -1000(0xfffffffffffffc18, float:NaN)
            r0.<init>(r1)
            r2.oq = r0
            return
    }

    public synchronized void ae(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.m     // Catch: java.lang.Throwable -> L8
            r0.set(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public synchronized boolean ae() {
            r3 = this;
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, java.util.concurrent.atomic.AtomicInteger> r0 = r3.up     // Catch: java.lang.Throwable -> L19
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            int r0 = r0.get()     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L17
            goto L1b
        L17:
            monitor-exit(r3)
            return r1
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            monitor-exit(r3)
            r0 = 1
            return r0
        L1e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    public synchronized boolean cw() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.xt()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public synchronized boolean cw(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = r1.j     // Catch: java.lang.Throwable -> L18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L1a
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L1a
            monitor-exit(r1)
            r2 = 1
            return r2
        L18:
            r2 = move-exception
            goto L1d
        L1a:
            monitor-exit(r1)
            r2 = 0
            return r2
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            throw r2
    }

    public synchronized void g(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.tl     // Catch: java.lang.Throwable -> L8
            r0.set(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public synchronized boolean g() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.ae     // Catch: java.lang.Throwable -> Le
            int r0 = r0.get()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public java.util.List<java.lang.Integer> j() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.qv
            return r0
    }

    public synchronized void j(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.cw     // Catch: java.lang.Throwable -> L8
            r0.set(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public synchronized void j(int r3, int r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.Integer, java.util.concurrent.atomic.AtomicInteger> r0 = r2.up     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger     // Catch: java.lang.Throwable -> L11
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L11
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r2)
            return
        L11:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    public synchronized void j(int r3, java.lang.String r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.Integer, java.util.concurrent.atomic.AtomicInteger> r0 = r2.up     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            int r1 = r0.get()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            r0.decrementAndGet()     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r3 = move-exception
            goto L60
        L1b:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L23
            monitor-exit(r2)
            return
        L23:
            java.util.List<java.lang.String> r0 = r2.g     // Catch: java.lang.Throwable -> L19
            r0.add(r4)     // Catch: java.lang.Throwable -> L19
            r4 = -100
            if (r3 >= r4) goto L39
            java.util.concurrent.atomic.AtomicInteger r4 = r2.ae     // Catch: java.lang.Throwable -> L19
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L19
            if (r4 == 0) goto L39
            java.util.concurrent.atomic.AtomicInteger r4 = r2.ae     // Catch: java.lang.Throwable -> L19
            r4.decrementAndGet()     // Catch: java.lang.Throwable -> L19
        L39:
            if (r3 <= 0) goto L48
            java.util.concurrent.atomic.AtomicInteger r3 = r2.tl     // Catch: java.lang.Throwable -> L19
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L48
            java.util.concurrent.atomic.AtomicInteger r3 = r2.tl     // Catch: java.lang.Throwable -> L19
            r3.decrementAndGet()     // Catch: java.lang.Throwable -> L19
        L48:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.m     // Catch: java.lang.Throwable -> L19
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L57
            java.util.concurrent.atomic.AtomicInteger r3 = r2.m     // Catch: java.lang.Throwable -> L19
            r3.decrementAndGet()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return
        L57:
            java.lang.String r3 = "TTMediationSDK"
            java.lang.String r4 = "decrementTotalWaterFall--waterfall数量减少一个 ---不用再减了不然就变成-1了"
            com.bytedance.msdk.j.up.cw.r(r3, r4)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return
        L60:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    public void j(java.util.List<java.lang.Integer> r1) {
            r0 = this;
            r0.qv = r1
            return
    }

    public synchronized void j(java.util.List<com.bytedance.msdk.core.oq.oq> r8, java.util.List<com.bytedance.msdk.core.oq.oq> r9, java.util.List<com.bytedance.msdk.core.oq.oq> r10) {
            r7 = this;
            monitor-enter(r7)
            if (r8 == 0) goto L12d
            int r0 = r8.size()     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto Lb
            goto L12d
        Lb:
            java.util.List r0 = com.bytedance.msdk.cw.tl.m.xt(r8)     // Catch: java.lang.Throwable -> L51
            boolean r1 = com.bytedance.msdk.tl.p.j(r0)     // Catch: java.lang.Throwable -> L51
            r2 = 0
            if (r1 != 0) goto L54
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L51
        L1e:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L55
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L51
            com.bytedance.msdk.core.oq.oq r3 = (com.bytedance.msdk.core.oq.oq) r3     // Catch: java.lang.Throwable -> L51
            java.util.List<java.lang.String> r4 = r7.g     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L51
        L30:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L1e
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L51
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L51
            if (r6 != 0) goto L30
            if (r3 == 0) goto L30
            java.lang.String r6 = r3.w()     // Catch: java.lang.Throwable -> L51
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L30
            int r1 = r1 + (-1)
            goto L1e
        L51:
            r8 = move-exception
            goto L12b
        L54:
            r1 = 0
        L55:
            if (r1 >= 0) goto L58
            r1 = 0
        L58:
            java.util.concurrent.atomic.AtomicInteger r0 = r7.tl     // Catch: java.lang.Throwable -> L51
            r0.set(r1)     // Catch: java.lang.Throwable -> L51
            int r0 = r8.size()     // Catch: java.lang.Throwable -> L51
            if (r9 == 0) goto L68
            int r1 = r9.size()     // Catch: java.lang.Throwable -> L51
            int r0 = r0 + r1
        L68:
            if (r10 == 0) goto L6f
            int r1 = r10.size()     // Catch: java.lang.Throwable -> L51
            int r0 = r0 + r1
        L6f:
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L51
        L73:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto La6
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L51
            com.bytedance.msdk.core.oq.oq r1 = (com.bytedance.msdk.core.oq.oq) r1     // Catch: java.lang.Throwable -> L51
            java.util.List<java.lang.String> r3 = r7.g     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L51
        L85:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L73
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L51
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L51
            if (r5 != 0) goto L85
            if (r1 == 0) goto L85
            java.lang.String r5 = r1.w()     // Catch: java.lang.Throwable -> L51
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L85
            int r0 = r0 + (-1)
            goto L73
        La6:
            boolean r8 = com.bytedance.msdk.tl.p.j(r9)     // Catch: java.lang.Throwable -> L51
            if (r8 != 0) goto Le3
            java.util.Iterator r8 = r9.iterator()     // Catch: java.lang.Throwable -> L51
        Lb0:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r9 == 0) goto Le3
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L51
            com.bytedance.msdk.core.oq.oq r9 = (com.bytedance.msdk.core.oq.oq) r9     // Catch: java.lang.Throwable -> L51
            java.util.List<java.lang.String> r1 = r7.g     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L51
        Lc2:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto Lb0
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L51
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L51
            if (r4 != 0) goto Lc2
            if (r9 == 0) goto Lc2
            java.lang.String r4 = r9.w()     // Catch: java.lang.Throwable -> L51
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto Lc2
            int r0 = r0 + (-1)
            goto Lb0
        Le3:
            boolean r8 = com.bytedance.msdk.tl.p.j(r10)     // Catch: java.lang.Throwable -> L51
            if (r8 != 0) goto L120
            java.util.Iterator r8 = r10.iterator()     // Catch: java.lang.Throwable -> L51
        Led:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r9 == 0) goto L120
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L51
            com.bytedance.msdk.core.oq.oq r9 = (com.bytedance.msdk.core.oq.oq) r9     // Catch: java.lang.Throwable -> L51
            java.util.List<java.lang.String> r10 = r7.g     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L51
        Lff:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto Led
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L51
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L51
            if (r3 != 0) goto Lff
            if (r9 == 0) goto Lff
            java.lang.String r3 = r9.w()     // Catch: java.lang.Throwable -> L51
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto Lff
            int r0 = r0 + (-1)
            goto Led
        L120:
            if (r0 >= 0) goto L123
            goto L124
        L123:
            r2 = r0
        L124:
            java.util.concurrent.atomic.AtomicInteger r8 = r7.m     // Catch: java.lang.Throwable -> L51
            r8.set(r2)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r7)
            return
        L12b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L51
            throw r8
        L12d:
            monitor-exit(r7)
            return
    }

    public synchronized int m(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, java.util.concurrent.atomic.AtomicInteger> r0 = r1.up     // Catch: java.lang.Throwable -> L15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L17
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return r2
        L15:
            r2 = move-exception
            goto L1a
        L17:
            monitor-exit(r1)
            r2 = 0
            return r2
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    public synchronized boolean m() {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.Integer, java.util.concurrent.atomic.AtomicInteger> r0 = r2.up     // Catch: java.lang.Throwable -> L1b
            r1 = -100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            int r0 = r0.get()     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L18
            goto L1d
        L18:
            monitor-exit(r2)
            r0 = 0
            return r0
        L1b:
            r0 = move-exception
            goto L20
        L1d:
            monitor-exit(r2)
            r0 = 1
            return r0
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r0
    }

    public synchronized boolean oq() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.tl     // Catch: java.lang.Throwable -> Le
            int r0 = r0.get()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public synchronized int qv() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.oq     // Catch: java.lang.Throwable -> L9
            int r0 = r0.get()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized void r() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.r     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r0.set(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized void r(int r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = r2.xt     // Catch: java.lang.Throwable -> Le
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Le
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Le
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        Le:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    public synchronized void tl(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.ae     // Catch: java.lang.Throwable -> L8
            r0.set(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public synchronized boolean tl() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.m     // Catch: java.lang.Throwable -> Le
            int r0 = r0.get()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public synchronized boolean up() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.r     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized boolean up(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = r1.xt     // Catch: java.lang.Throwable -> L18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L1a
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L1a
            monitor-exit(r1)
            r2 = 1
            return r2
        L18:
            r2 = move-exception
            goto L1d
        L1a:
            monitor-exit(r1)
            r2 = 0
            return r2
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            throw r2
    }

    public synchronized void vl() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.cw     // Catch: java.lang.Throwable -> L2f
            r1 = -1
            r0.set(r1)     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.r     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            r0.set(r1)     // Catch: java.lang.Throwable -> L2f
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = r2.j     // Catch: java.lang.Throwable -> L2f
            r0.clear()     // Catch: java.lang.Throwable -> L2f
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = r2.xt     // Catch: java.lang.Throwable -> L2f
            r0.clear()     // Catch: java.lang.Throwable -> L2f
            java.util.Map<java.lang.Integer, java.util.concurrent.atomic.AtomicInteger> r0 = r2.up     // Catch: java.lang.Throwable -> L2f
            r0.clear()     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.atomic.AtomicInteger r0 = r2.m     // Catch: java.lang.Throwable -> L2f
            r0.set(r1)     // Catch: java.lang.Throwable -> L2f
            java.util.List<java.lang.String> r0 = r2.g     // Catch: java.lang.Throwable -> L2f
            r0.clear()     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.atomic.AtomicInteger r0 = r2.oq     // Catch: java.lang.Throwable -> L2f
            r1 = -1000(0xfffffffffffffc18, float:NaN)
            r0.set(r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)
            return
        L2f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r0
    }

    public synchronized int xt() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.cw     // Catch: java.lang.Throwable -> L9
            int r0 = r0.get()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized void xt(int r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.oq     // Catch: java.lang.Throwable -> Lf
            int r0 = r0.get()     // Catch: java.lang.Throwable -> Lf
            if (r0 >= r3) goto L11
            java.util.concurrent.atomic.AtomicInteger r0 = r2.oq     // Catch: java.lang.Throwable -> Lf
            r0.set(r3)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r3 = move-exception
            goto L1e
        L11:
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = r2.j     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lf
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return
        L1e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }
}
