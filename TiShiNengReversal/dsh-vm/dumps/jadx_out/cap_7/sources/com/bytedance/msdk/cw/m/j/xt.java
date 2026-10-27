package com.bytedance.msdk.cw.m.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    private com.bytedance.msdk.core.up.xt.r.cw a;
    protected java.util.Map<java.lang.String, com.bytedance.msdk.cw.j.j> ae;
    private com.bytedance.msdk.cw.xt.j.j av;
    private java.lang.String az;
    private boolean ch;
    protected java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> cw;
    private long f;
    protected java.util.Map<java.lang.String, java.lang.Object> g;
    private int h;
    private final java.util.concurrent.atomic.AtomicBoolean i;
    protected java.lang.ref.SoftReference<android.content.Context> j;
    private com.bytedance.msdk.core.oq.xt jy;
    private volatile boolean kt;
    private final java.util.concurrent.atomic.AtomicInteger l;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.msdk.api.xt> la;
    protected com.bytedance.msdk.xt.cw m;
    private final java.util.concurrent.atomic.AtomicBoolean mi;
    protected com.bytedance.msdk.core.oq.g oq;
    private long p;
    private com.bytedance.msdk.api.j.xt qv;
    protected java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r;
    private boolean s;
    private android.os.Handler tj;
    protected long tl;
    protected java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> up;
    private java.util.concurrent.atomic.AtomicBoolean v;
    private com.bytedance.msdk.api.r.qv vl;
    private final java.util.concurrent.atomic.AtomicBoolean w;
    private com.bytedance.msdk.cw.m.j.j ws;
    private boolean x;
    protected java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> xt;









    private xt() {
            r4 = this;
            r4.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.xt = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.cw = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.r = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.up = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r4.i = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r4.w = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r4.mi = r0
            r4.kt = r1
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.ae = r0
            r2 = 0
            r4.tl = r2
            r4.f = r2
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r4.v = r0
            r4.x = r1
            r4.ch = r1
            r4.s = r1
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r4.l = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.g = r0
            com.bytedance.msdk.core.oq.g r0 = new com.bytedance.msdk.core.oq.g
            r0.<init>()
            r4.oq = r0
            r4.h = r1
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.la = r0
            return
    }

    static /* synthetic */ com.bytedance.msdk.core.up.xt.r.cw ae(com.bytedance.msdk.cw.m.j.xt r0) {
            com.bytedance.msdk.core.up.xt.r$cw r0 = r0.a
            return r0
    }

    private boolean c() {
            r3 = this;
            com.bytedance.msdk.core.oq.xt r0 = r3.jy
            boolean r0 = r0.p()
            r1 = 1
            if (r0 != 0) goto La
            return r1
        La:
            com.bytedance.msdk.cw.m.j.j r0 = r3.ws
            r2 = 0
            boolean r0 = r0.up(r2)
            if (r0 != 0) goto L1d
            com.bytedance.msdk.cw.m.j.j r0 = r3.ws
            boolean r0 = r0.ae()
            if (r0 == 0) goto L1c
            goto L1d
        L1c:
            return r2
        L1d:
            return r1
    }

    static /* synthetic */ com.bytedance.msdk.cw.m.j.j cw(com.bytedance.msdk.cw.m.j.xt r0) {
            com.bytedance.msdk.cw.m.j.j r0 = r0.ws
            return r0
    }

    private int gx() {
            r6 = this;
            com.bytedance.msdk.core.oq.xt r0 = r6.jy
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Map r0 = r0.ch()
            if (r0 == 0) goto L49
            int r2 = r0.size()
            if (r2 != 0) goto L13
            goto L49
        L13:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r3 = r0.keySet()
            r2.addAll(r3)
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            com.bytedance.msdk.cw.m.j.j r4 = r6.ws
            int r5 = r3.intValue()
            boolean r4 = r4.cw(r5)
            if (r4 == 0) goto L23
            java.lang.Object r3 = r0.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L23
            int r3 = r3.size()
            int r1 = r1 + r3
            goto L23
        L49:
            return r1
    }

    static /* synthetic */ com.bytedance.msdk.api.r.qv j(com.bytedance.msdk.cw.m.j.xt r0, com.bytedance.msdk.api.r.qv r1) {
            r0.vl = r1
            return r1
    }

    public static com.bytedance.msdk.cw.m.j.xt j(java.lang.ref.SoftReference<android.content.Context> r5, com.bytedance.msdk.api.j.xt r6, com.bytedance.msdk.cw.xt.j.j r7) {
            com.bytedance.msdk.cw.m.j.xt r0 = new com.bytedance.msdk.cw.m.j.xt
            r0.<init>()
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            java.lang.String r2 = r6.v()
            int r3 = r6.f()
            r4 = 100
            com.bytedance.msdk.core.oq.xt r1 = r1.j(r2, r3, r4)
            r6.j(r1)
            r0.qv = r6
            r0.jy = r1
            if (r1 == 0) goto L2f
            java.util.Map<java.lang.String, java.lang.Object> r6 = r0.g
            int r1 = r1.j()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "render_control"
            r6.put(r2, r1)
        L2f:
            com.bytedance.msdk.api.j.xt r6 = r0.qv
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            int r1 = r1.rh()
            r6.r(r1)
            com.bytedance.msdk.api.j.xt r6 = r0.qv
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            java.lang.String r1 = r1.g()
            r6.xt(r1)
            com.bytedance.msdk.api.j.xt r6 = r0.qv
            int r1 = com.bytedance.msdk.core.ae.cw.r()
            r6.j(r1)
            com.bytedance.msdk.api.j.xt r6 = r0.qv
            java.lang.String r1 = com.bytedance.msdk.core.ae.cw.cw()
            r6.j(r1)
            com.bytedance.msdk.api.j.xt r6 = r0.qv
            com.bytedance.msdk.core.up.xt.r r1 = com.bytedance.msdk.core.up.xt.r.j()
            com.bytedance.msdk.api.j.xt r2 = r0.qv
            java.lang.String r2 = r2.v()
            com.bytedance.msdk.core.ws.cw r3 = com.bytedance.msdk.core.xt.xt()
            int r3 = r3.rh()
            int r1 = r1.xt(r2, r3)
            r6.cw(r1)
            com.bytedance.msdk.core.oq.g r6 = r0.oq
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            java.lang.String r1 = r1.g()
            r6.cw = r1
            r0.j = r5
            r0.av = r7
            com.bytedance.msdk.cw.m.j.j r5 = new com.bytedance.msdk.cw.m.j.j
            r5.<init>()
            r0.ws = r5
            return r0
    }

    static /* synthetic */ com.bytedance.msdk.cw.xt.j.j j(com.bytedance.msdk.cw.m.j.xt r0) {
            com.bytedance.msdk.cw.xt.j.j r0 = r0.av
            return r0
    }

    static /* synthetic */ boolean j(com.bytedance.msdk.cw.m.j.xt r0, boolean r1) {
            r0.kt = r1
            return r1
    }

    static /* synthetic */ com.bytedance.msdk.core.oq.xt m(com.bytedance.msdk.cw.m.j.xt r0) {
            com.bytedance.msdk.core.oq.xt r0 = r0.jy
            return r0
    }

    private void n() {
            r3 = this;
            boolean r0 = r3.v()
            if (r0 != 0) goto L3f
            boolean r0 = r3.xt()
            if (r0 != 0) goto L3f
            boolean r0 = r3.cw()
            if (r0 != 0) goto L3f
            boolean r0 = r3.j()
            if (r0 != 0) goto L19
            goto L3f
        L19:
            boolean r0 = r3.nd()
            if (r0 == 0) goto L23
            r3.up()
            return
        L23:
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.api.j.xt r1 = r3.qv
            int r1 = r1.f()
            com.bytedance.msdk.api.j.xt r2 = r3.qv
            java.lang.String r2 = r2.v()
            long r0 = r0.j(r1, r2)
            com.bytedance.msdk.cw.m.j.xt$7 r2 = new com.bytedance.msdk.cw.m.j.xt$7
            r2.<init>(r3, r0)
            com.bytedance.msdk.j.up.m.j(r2, r0)
        L3f:
            return
    }

    private boolean nd() {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.ae()
            r1 = 1
            if (r0 == 0) goto L22
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.ae()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.next()
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            boolean r2 = r2.fp()
            if (r2 == 0) goto Lf
            return r1
        L22:
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.oq()
            if (r0 == 0) goto L43
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.oq()
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r0.next()
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            boolean r2 = r2.fp()
            if (r2 == 0) goto L30
            return r1
        L43:
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.tl()
            if (r0 == 0) goto L64
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.tl()
            java.util.Iterator r0 = r0.iterator()
        L51:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r0.next()
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            boolean r2 = r2.fp()
            if (r2 == 0) goto L51
            return r1
        L64:
            r0 = 0
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean r(com.bytedance.msdk.cw.m.j.xt r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.w
            return r0
    }

    static /* synthetic */ com.bytedance.msdk.api.j.xt tl(com.bytedance.msdk.cw.m.j.xt r0) {
            com.bytedance.msdk.api.j.xt r0 = r0.qv
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean up(com.bytedance.msdk.cw.m.j.xt r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.i
            return r0
    }

    private void up(boolean r2) {
            r1 = this;
            com.bytedance.msdk.cw.m.j.xt$8 r0 = new com.bytedance.msdk.cw.m.j.xt$8
            r0.<init>(r1, r2)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }

    static /* synthetic */ android.os.Handler xt(com.bytedance.msdk.cw.m.j.xt r0) {
            android.os.Handler r0 = r0.tj
            return r0
    }

    public void a() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.l
            r0.incrementAndGet()
            return
    }

    public java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> ae() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r0 = r1.up
            return r0
    }

    public boolean av() {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r0 = r3.up
            int r0 = r0.size()
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r1 = r3.xt
            int r1 = r1.size()
            int r0 = r0 + r1
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r1 = r3.r
            int r1 = r1.size()
            int r0 = r0 + r1
            com.bytedance.msdk.api.j.xt r1 = r3.qv
            r2 = 1
            if (r1 == 0) goto L1e
            int r1 = r1.a()
            goto L1f
        L1e:
            r1 = 1
        L1f:
            if (r0 < r1) goto L22
            return r2
        L22:
            r0 = 0
            return r0
    }

    public boolean az() {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r0 = r3.up
            int r0 = r0.size()
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r1 = r3.xt
            int r1 = r1.size()
            int r0 = r0 + r1
            com.bytedance.msdk.api.j.xt r1 = r3.qv
            r2 = 1
            if (r1 == 0) goto L17
            int r1 = r1.a()
            goto L18
        L17:
            r1 = 1
        L18:
            if (r0 < r1) goto L1b
            return r2
        L1b:
            r0 = 0
            return r0
    }

    public java.util.List<com.bytedance.msdk.api.xt> ch() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r1 = r5.x()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r2 == 0) goto L11
            java.lang.Object r2 = r2.getValue()
            com.bytedance.msdk.api.xt r2 = (com.bytedance.msdk.api.xt) r2
            if (r2 == 0) goto L11
            java.lang.String r3 = "广告加载成功"
            java.lang.String r4 = r2.m()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L11
            java.lang.String r3 = "广告请求中"
            java.lang.String r4 = r2.m()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L11
            r0.add(r2)
            goto L11
        L43:
            return r0
    }

    public void cw(long r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void cw(boolean r1) {
            r0 = this;
            r0.ch = r1
            return
    }

    public boolean cw() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.mi
            boolean r0 = r0.get()
            return r0
    }

    public void ed() {
            r1 = this;
            com.bytedance.msdk.cw.m.j.xt$6 r0 = new com.bytedance.msdk.cw.m.j.xt$6
            r0.<init>(r1)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }

    public boolean f() {
            r1 = this;
            boolean r0 = r1.s
            return r0
    }

    public java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> g() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r0 = r1.cw
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            java.lang.ref.SoftReference<android.content.Context> r0 = r1.j
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            return r0
    }

    public long gq() {
            r2 = this;
            long r0 = r2.f
            return r0
    }

    public com.bytedance.msdk.api.r.qv h() {
            r1 = this;
            com.bytedance.msdk.api.r.qv r0 = r1.vl
            return r0
    }

    public boolean i() {
            r3 = this;
            com.bytedance.msdk.core.oq.xt r0 = r3.jy
            boolean r0 = r0.h()
            r1 = 1
            if (r0 != 0) goto La
            return r1
        La:
            com.bytedance.msdk.cw.m.j.j r0 = r3.ws
            r2 = -100
            boolean r0 = r0.up(r2)
            if (r0 != 0) goto L1f
            com.bytedance.msdk.cw.m.j.j r0 = r3.ws
            boolean r0 = r0.m()
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            return r0
        L1f:
            return r1
    }

    public void j(int r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void j(long r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public void j(android.os.Handler r1) {
            r0 = this;
            r0.tj = r1
            return
    }

    public void j(com.bytedance.msdk.api.j r3) {
            r2 = this;
            if (r3 != 0) goto Ld
            com.bytedance.msdk.api.j r3 = new com.bytedance.msdk.api.j
            r0 = 20005(0x4e25, float:2.8033E-41)
            java.lang.String r1 = com.bytedance.msdk.api.j.j(r0)
            r3.<init>(r0, r1)
        Ld:
            com.bytedance.msdk.core.oq.xt r0 = r2.jy
            boolean r0 = com.bytedance.msdk.tl.xt.j.j(r0)
            if (r0 == 0) goto L1b
            int r0 = r3.j
            r1 = 10003(0x2713, float:1.4017E-41)
            if (r0 == r1) goto L23
        L1b:
            android.os.Handler r0 = r2.tj
            if (r0 == 0) goto L23
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
        L23:
            boolean r0 = r2.j()
            if (r0 != 0) goto L93
            boolean r0 = r2.xt()
            if (r0 == 0) goto L30
            goto L93
        L30:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.w
            r1 = 1
            r0.set(r1)
            com.bytedance.msdk.core.oq.g r0 = r2.wq()
            r0.up = r1
            boolean r0 = r2.f()
            if (r0 != 0) goto L4b
            com.bytedance.msdk.api.j.xt r0 = r2.qv
            com.bytedance.msdk.core.oq.g r1 = r2.oq
            java.lang.String r1 = r1.j
            com.bytedance.msdk.up.m.j(r0, r3, r1)
        L4b:
            boolean r0 = r2.v()
            if (r0 == 0) goto L56
            r3 = 0
            r2.up(r3)
            return
        L56:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bytedance.msdk.core.oq.xt r1 = r2.jy
            java.lang.String r1 = com.bytedance.msdk.j.up.up.j(r1)
            r0.append(r1)
            java.lang.String r1 = "广告加载失败！给外部回调：invokeAdLoadFailCallbackOnMainUI...... error Code = "
            r0.append(r1)
            int r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = " error Message = "
            r0.append(r1)
            java.lang.String r1 = r3.xt
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.r(r1, r0)
            com.bytedance.msdk.api.j.xt r0 = r2.qv
            java.util.List r1 = r2.ch()
            com.bytedance.msdk.api.j r3 = com.bytedance.msdk.tl.ws.j(r0, r3, r1)
            com.bytedance.msdk.cw.m.j.xt$3 r0 = new com.bytedance.msdk.cw.m.j.xt$3
            r0.<init>(r2, r3)
            com.bytedance.msdk.j.up.m.cw(r0)
        L93:
            return
    }

    public void j(com.bytedance.msdk.api.r.qv r1) {
            r0 = this;
            r0.vl = r1
            return
    }

    public void j(com.bytedance.msdk.core.oq.g r1) {
            r0 = this;
            r0.oq = r1
            return
    }

    public void j(com.bytedance.msdk.core.oq.xt r1) {
            r0 = this;
            r0.jy = r1
            return
    }

    public void j(com.bytedance.msdk.core.up.xt.r.cw r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void j(com.bytedance.msdk.xt.cw r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void j(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.cw.m.j.xt$1 r0 = new com.bytedance.msdk.cw.m.j.xt$1
            r0.<init>(r1, r2)
            com.bytedance.msdk.j.up.m.r(r0)
            return
    }

    public void j(java.util.List<com.bytedance.msdk.xt.cw> r3) {
            r2 = this;
            boolean r0 = com.bytedance.msdk.tl.p.j(r3)
            if (r0 != 0) goto L3f
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            com.bytedance.msdk.xt.cw r0 = (com.bytedance.msdk.xt.cw) r0
            if (r0 != 0) goto L10
            goto L3f
        L10:
            boolean r1 = r0.px()
            if (r1 == 0) goto L1c
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r0 = r2.up
            r0.addAll(r3)
            return
        L1c:
            boolean r1 = r0.qe()
            if (r1 == 0) goto L28
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r0 = r2.xt
            r0.addAll(r3)
            return
        L28:
            boolean r1 = r0.qo()
            if (r1 != 0) goto L3a
            boolean r1 = r0.oy()
            if (r1 != 0) goto L3a
            boolean r0 = r0.yl()
            if (r0 == 0) goto L3f
        L3a:
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r0 = r2.r
            r0.addAll(r3)
        L3f:
            return
    }

    public void j(java.util.List<com.bytedance.msdk.xt.cw> r7, com.bytedance.msdk.api.j r8) {
            r6 = this;
            com.bytedance.msdk.core.oq.xt r0 = r6.jy
            if (r0 == 0) goto Ldd
            boolean r0 = r0.vl()
            if (r0 != 0) goto Lc
            goto Ldd
        Lc:
            boolean r0 = r6.m()
            if (r0 == 0) goto L1f
            com.bytedance.msdk.api.j r8 = new com.bytedance.msdk.api.j
            r7 = 41044(0xa054, float:5.7515E-41)
            java.lang.String r0 = com.bytedance.msdk.api.j.j(r7)
            r8.<init>(r7, r0)
            r7 = 0
        L1f:
            boolean r0 = r6.v()
            if (r0 == 0) goto L27
            goto Ldd
        L27:
            boolean r0 = com.bytedance.msdk.tl.p.j(r7)
            java.lang.String r1 = "TTMediationSDK"
            if (r0 != 0) goto Laa
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bytedance.msdk.core.oq.xt r2 = r6.jy
            java.lang.String r2 = com.bytedance.msdk.j.up.up.j(r2)
            r0.append(r2)
            java.lang.String r2 = "单个广告加载完成！给外部回调：invokeSingleAdLoadCallbackUI......"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.r(r1, r0)
            java.util.Iterator r0 = r7.iterator()
        L4d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r0.next()
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.bytedance.msdk.api.j.xt r4 = r6.qv
            java.lang.String r4 = r4.v()
            java.lang.String r5 = "fill"
            java.lang.String r4 = com.bytedance.msdk.j.up.up.j(r4, r5)
            r3.append(r4)
            java.lang.String r4 = "AdNetWorkName["
            r3.append(r4)
            java.lang.String r4 = r2.ff()
            r3.append(r4)
            java.lang.String r4 = "] AdUnitId["
            r3.append(r4)
            java.lang.String r4 = r2.qa()
            r3.append(r4)
            java.lang.String r4 = "]  请求成功 (loadSort="
            r3.append(r4)
            int r4 = r2.wi()
            r3.append(r4)
            java.lang.String r4 = ",showSort="
            r3.append(r4)
            int r2 = r2.d()
            r3.append(r2)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.bytedance.msdk.j.up.cw.xt(r1, r2)
            goto L4d
        Laa:
            if (r8 == 0) goto Ld5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bytedance.msdk.core.oq.xt r2 = r6.jy
            java.lang.String r2 = com.bytedance.msdk.j.up.up.j(r2)
            r0.append(r2)
            java.lang.String r2 = "单个广告加载失败！给外部回调：invokeSingleAdLoadCallbackUI...... errorCode:"
            r0.append(r2)
            int r2 = r8.j
            r0.append(r2)
            java.lang.String r2 = "  errorMsg:"
            r0.append(r2)
            java.lang.String r2 = r8.xt
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.r(r1, r0)
        Ld5:
            com.bytedance.msdk.cw.m.j.xt$5 r0 = new com.bytedance.msdk.cw.m.j.xt$5
            r0.<init>(r6, r7, r8)
            com.bytedance.msdk.j.up.m.cw(r0)
        Ldd:
            return
    }

    public void j(java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.msdk.api.xt> r1) {
            r0 = this;
            r0.la = r1
            return
    }

    public void j(boolean r1) {
            r0 = this;
            r0.s = r1
            return
    }

    public boolean j() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.i
            boolean r0 = r0.get()
            return r0
    }

    public com.bytedance.msdk.cw.m.j.j jy() {
            r1 = this;
            com.bytedance.msdk.cw.m.j.j r0 = r1.ws
            return r0
    }

    public java.util.List<com.bytedance.msdk.xt.cw> kt() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r1 = r3.xt
            boolean r1 = com.bytedance.msdk.tl.p.j(r1)
            if (r1 != 0) goto L12
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r1 = r3.xt
            r0.addAll(r1)
        L12:
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r1 = r3.r
            boolean r1 = com.bytedance.msdk.tl.p.j(r1)
            if (r1 != 0) goto L1f
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r1 = r3.r
            r0.addAll(r1)
        L1f:
            java.util.Comparator r1 = com.bytedance.msdk.core.ae.cw.j()
            com.bytedance.msdk.core.ae.cw.j(r0, r1)
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r1 = r3.up
            boolean r1 = com.bytedance.msdk.tl.p.j(r1)
            if (r1 != 0) goto L3a
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r1 = r3.up
            r2 = 0
            com.bytedance.msdk.core.ae.cw.j(r1, r2)
            r1 = 0
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r2 = r3.up
            r0.addAll(r1, r2)
        L3a:
            return r0
    }

    public long l() {
            r2 = this;
            long r0 = r2.p
            return r0
    }

    public long la() {
            r2 = this;
            long r0 = r2.tl
            return r0
    }

    public boolean m() {
            r1 = this;
            boolean r0 = r1.kt
            return r0
    }

    public com.bytedance.msdk.api.j.xt mi() {
            r1 = this;
            com.bytedance.msdk.api.j.xt r0 = r1.qv
            return r0
    }

    public java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> oq() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r0 = r1.r
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> p() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.g
            return r0
    }

    public com.bytedance.msdk.xt.cw qv() {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.m
            return r0
    }

    public void r() {
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.bytedance.msdk.core.oq.xt r2 = r0.jy
            java.lang.String r2 = com.bytedance.msdk.j.up.up.j(r2)
            r1.append(r2)
            java.lang.String r2 = " v2 load done..........s:"
            r1.append(r2)
            boolean r2 = r0.j()
            r1.append(r2)
            java.lang.String r2 = "  f:"
            r1.append(r2)
            boolean r2 = r0.xt()
            r1.append(r2)
            java.lang.String r2 = "     p.size"
            r1.append(r2)
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.ae()
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r2 = "   bidding.size:"
            r1.append(r2)
            java.util.concurrent.CopyOnWriteArrayList r3 = r0.oq()
            int r3 = r3.size()
            r1.append(r3)
            java.lang.String r3 = "   normal.size:"
            r1.append(r3)
            java.util.concurrent.CopyOnWriteArrayList r4 = r0.tl()
            int r4 = r4.size()
            r1.append(r4)
            java.lang.String r4 = "   underNormal.size:"
            r1.append(r4)
            java.util.concurrent.CopyOnWriteArrayList r4 = r0.g()
            int r4 = r4.size()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.r(r4, r1)
            boolean r1 = r0.j()
            if (r1 != 0) goto L208
            boolean r1 = r0.xt()
            if (r1 == 0) goto L7f
            goto L208
        L7f:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.i
            r5 = 1
            r1.set(r5)
            android.os.Handler r1 = r0.tj
            r6 = 0
            if (r1 == 0) goto L8d
            r1.removeCallbacksAndMessages(r6)
        L8d:
            java.util.List r1 = r0.kt()
            boolean r7 = r0.v()
            r8 = 0
            if (r7 != 0) goto La2
            boolean r7 = r0.v()
            if (r7 != 0) goto L11a
            boolean r7 = r0.ch
            if (r7 != 0) goto L11a
        La2:
            com.bytedance.msdk.core.oq.xt r7 = r0.jy
            if (r7 == 0) goto L11a
            com.bytedance.msdk.api.j.xt r7 = r0.qv
            boolean r7 = r7.sm()
            if (r7 != 0) goto L11a
            com.bytedance.msdk.core.oq.xt r7 = r0.jy
            boolean r7 = r7.p()
            if (r7 != 0) goto Lbe
            com.bytedance.msdk.core.oq.xt r7 = r0.jy
            boolean r7 = r7.h()
            if (r7 == 0) goto L11a
        Lbe:
            int r7 = r1.size()
            if (r7 <= 0) goto Lcb
            java.lang.Object r7 = r1.get(r8)
            com.bytedance.msdk.xt.cw r7 = (com.bytedance.msdk.xt.cw) r7
            goto Lcc
        Lcb:
            r7 = r6
        Lcc:
            com.bytedance.msdk.api.j.xt r9 = r0.qv
            int r9 = r9.a()
            if (r9 <= r5) goto L113
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r11 = 1
        Lda:
            if (r11 >= r9) goto Lec
            int r12 = r1.size()
            if (r11 >= r12) goto Le9
            java.lang.Object r12 = r1.get(r11)
            r10.add(r12)
        Le9:
            int r11 = r11 + 1
            goto Lda
        Lec:
            int r11 = r1.size()
            if (r11 <= r9) goto L111
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        Lf7:
            int r12 = r1.size()
            if (r9 >= r12) goto L115
            java.lang.Object r12 = r1.get(r9)
            com.bytedance.msdk.xt.cw r12 = (com.bytedance.msdk.xt.cw) r12
            if (r12 == 0) goto L10e
            boolean r13 = r12.qo()
            if (r13 == 0) goto L10e
            r11.add(r12)
        L10e:
            int r9 = r9 + 1
            goto Lf7
        L111:
            r11 = r6
            goto L115
        L113:
            r10 = r6
            r11 = r10
        L115:
            com.bytedance.msdk.api.j.xt r9 = r0.qv
            com.bytedance.msdk.up.m.j(r7, r9, r10, r11)
        L11a:
            com.bytedance.msdk.api.j.xt r7 = r0.qv
            boolean r7 = r7.sm()
            if (r7 != 0) goto L14a
            boolean r7 = r0.ch
            if (r7 != 0) goto L14a
            com.bytedance.msdk.core.oq.xt r7 = r0.jy
            boolean r9 = com.bytedance.msdk.tl.p.xt(r1)
            if (r9 != 0) goto L139
            java.lang.Object r8 = r1.get(r8)
            com.bytedance.msdk.xt.cw r8 = (com.bytedance.msdk.xt.cw) r8
            double r8 = r8.t()
            goto L13b
        L139:
            r8 = 0
        L13b:
            com.bytedance.msdk.api.j.xt r10 = r0.qv
            java.lang.String r10 = r10.v()
            com.bytedance.msdk.api.j.xt r11 = r0.qv
            int r11 = r11.f()
            com.bytedance.msdk.core.g.r.j(r7, r8, r10, r11)
        L14a:
            boolean r7 = r0.v()
            if (r7 == 0) goto L154
            r0.up(r5)
            return
        L154:
            int r5 = r1.size()
            com.bytedance.msdk.api.j.xt r7 = r0.qv
            int r7 = r7.a()
            if (r5 <= r7) goto L169
            com.bytedance.msdk.api.j.xt r1 = r0.qv
            int r1 = r1.a()
        L166:
            r16 = r1
            goto L16e
        L169:
            int r1 = r1.size()
            goto L166
        L16e:
            com.bytedance.msdk.core.oq.xt r1 = r0.jy
            if (r1 == 0) goto L187
            java.util.Map r1 = r1.up()
            com.bytedance.msdk.core.oq.xt r5 = r0.jy
            boolean r5 = r5.p()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.String r7 = "has_serverBidding"
            r1.put(r7, r5)
            r7 = r1
            goto L188
        L187:
            r7 = r6
        L188:
            boolean r1 = r0.f()
            if (r1 != 0) goto L1bc
            com.bytedance.msdk.api.j.xt r8 = r0.qv
            com.bytedance.msdk.xt.cw r9 = r0.m
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r12 = r0.tl
            long r10 = r10 - r12
            int r12 = r0.gx()
            com.bytedance.msdk.cw.m.j.j r1 = r0.ws
            int r1 = r1.qv()
            int r13 = r0.xt(r1)
            com.bytedance.msdk.core.oq.xt r1 = r0.jy
            if (r1 == 0) goto L1af
            java.lang.String r6 = r1.hh()
        L1af:
            r15 = r6
            int r1 = r0.h
            com.bytedance.msdk.core.oq.xt r5 = r0.jy
            r14 = 0
            r17 = r1
            r18 = r5
            com.bytedance.msdk.up.m.j(r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18)
        L1bc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.bytedance.msdk.core.oq.xt r5 = r0.jy
            java.lang.String r5 = com.bytedance.msdk.j.up.up.j(r5)
            r1.append(r5)
            java.lang.String r5 = "广告加载成功！给外部回调：invokeAdLoadSuccessOnMainUI........P.size:"
            r1.append(r5)
            java.util.concurrent.CopyOnWriteArrayList r5 = r0.ae()
            int r5 = r5.size()
            r1.append(r5)
            r1.append(r2)
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.oq()
            int r2 = r2.size()
            r1.append(r2)
            r1.append(r3)
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.tl()
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.msdk.j.up.cw.r(r4, r1)
            com.bytedance.msdk.cw.m.j.xt$2 r1 = new com.bytedance.msdk.cw.m.j.xt$2
            r1.<init>(r0)
            com.bytedance.msdk.j.up.m.cw(r1)
            r0.n()
        L208:
            return
    }

    public void r(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.v
            r0.set(r2)
            return
    }

    public boolean rn() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.v
            boolean r0 = r0.get()
            return r0
    }

    public int s() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.l
            int r0 = r0.get()
            return r0
    }

    public java.util.Map<java.lang.String, com.bytedance.msdk.cw.j.j> tj() {
            r1 = this;
            java.util.Map<java.lang.String, com.bytedance.msdk.cw.j.j> r0 = r1.ae
            return r0
    }

    public java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> tl() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r0 = r1.xt
            return r0
    }

    public java.lang.String uf() {
            r1 = this;
            java.lang.String r0 = r1.az
            return r0
    }

    public void up() {
            r6 = this;
            boolean r0 = r6.v()
            if (r0 != 0) goto L74
            boolean r0 = r6.xt()
            if (r0 != 0) goto L74
            boolean r0 = r6.cw()
            if (r0 != 0) goto L74
            boolean r0 = r6.j()
            if (r0 != 0) goto L19
            goto L74
        L19:
            com.bytedance.msdk.api.j.xt r0 = r6.qv
            if (r0 == 0) goto L66
            int r0 = r0.f()
            r1 = 7
            if (r0 == r1) goto L38
            com.bytedance.msdk.api.j.xt r0 = r6.qv
            int r0 = r0.f()
            r1 = 8
            if (r0 == r1) goto L38
            com.bytedance.msdk.api.j.xt r0 = r6.qv
            int r0 = r0.f()
            r1 = 10
            if (r0 != r1) goto L66
        L38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bytedance.msdk.core.oq.xt r1 = r6.jy
            java.lang.String r1 = com.bytedance.msdk.j.up.up.j(r1)
            r0.append(r1)
            java.lang.String r1 = "广告缓存成功！给外部回调：invokeAdVideoCacheOnMainUI........"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.cw(r1, r0)
            com.bytedance.msdk.api.j.xt r0 = r6.qv
            com.bytedance.msdk.xt.cw r1 = r6.qv()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.gq()
            long r2 = r2 - r4
            com.bytedance.msdk.up.m.j(r0, r1, r2)
        L66:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.mi
            r1 = 1
            r0.set(r1)
            com.bytedance.msdk.cw.m.j.xt$4 r0 = new com.bytedance.msdk.cw.m.j.xt$4
            r0.<init>(r6)
            com.bytedance.msdk.j.up.m.cw(r0)
        L74:
            return
    }

    public boolean v() {
            r1 = this;
            boolean r0 = r1.x
            return r0
    }

    public com.bytedance.msdk.core.oq.xt vl() {
            r1 = this;
            com.bytedance.msdk.core.oq.xt r0 = r1.jy
            return r0
    }

    public boolean w() {
            r1 = this;
            boolean r0 = r1.i()
            if (r0 == 0) goto Le
            boolean r0 = r1.c()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public com.bytedance.msdk.core.oq.g wq() {
            r1 = this;
            com.bytedance.msdk.core.oq.g r0 = r1.oq
            return r0
    }

    public boolean ws() {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r0 = r3.up
            int r0 = r0.size()
            com.bytedance.msdk.api.j.xt r1 = r3.qv
            r2 = 1
            if (r1 == 0) goto L10
            int r1 = r1.a()
            goto L11
        L10:
            r1 = 1
        L11:
            if (r0 < r1) goto L14
            return r2
        L14:
            r0 = 0
            return r0
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.msdk.api.xt> x() {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.msdk.api.xt> r0 = r1.la
            return r0
    }

    protected int xt(int r2) {
            r1 = this;
            com.bytedance.msdk.cw.m.j.j r0 = r1.ws
            java.util.List r0 = r0.j()
            if (r0 != 0) goto La
            r2 = -1
            return r2
        La:
            com.bytedance.msdk.cw.m.j.j r0 = r1.ws
            java.util.List r0 = r0.j()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = r0.indexOf(r2)
            int r2 = r2 + 1
            return r2
    }

    public void xt(long r1) {
            r0 = this;
            r0.tl = r1
            return
    }

    public void xt(java.lang.String r1) {
            r0 = this;
            r0.az = r1
            return
    }

    public void xt(boolean r1) {
            r0 = this;
            r0.x = r1
            return
    }

    public boolean xt() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.w
            boolean r0 = r0.get()
            return r0
    }
}
