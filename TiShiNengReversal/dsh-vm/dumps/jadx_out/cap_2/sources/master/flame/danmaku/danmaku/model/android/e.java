package master.flame.danmaku.danmaku.model.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class e implements master.flame.danmaku.danmaku.model.m {
    public java.util.Collection<master.flame.danmaku.danmaku.model.d> e;
    private master.flame.danmaku.danmaku.model.android.e f;
    private master.flame.danmaku.danmaku.model.d g;
    private master.flame.danmaku.danmaku.model.d h;
    private master.flame.danmaku.danmaku.model.d i;
    private master.flame.danmaku.danmaku.model.d j;
    private volatile java.util.concurrent.atomic.AtomicInteger k;
    private int l;
    private master.flame.danmaku.danmaku.model.m.a m;
    private boolean n;
    private java.lang.Object o;

    public e() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            return
    }

    public e(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public e(int r4, boolean r5) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r3.k = r0
            r3.l = r1
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.o = r0
            if (r4 != 0) goto L1c
            master.flame.danmaku.danmaku.model.m$d r0 = new master.flame.danmaku.danmaku.model.m$d
            r0.<init>(r5)
            goto L2f
        L1c:
            r0 = 1
            if (r4 != r0) goto L25
            master.flame.danmaku.danmaku.model.m$e r0 = new master.flame.danmaku.danmaku.model.m$e
            r0.<init>(r5)
            goto L2f
        L25:
            r0 = 2
            if (r4 != r0) goto L2e
            master.flame.danmaku.danmaku.model.m$f r0 = new master.flame.danmaku.danmaku.model.m$f
            r0.<init>(r5)
            goto L2f
        L2e:
            r0 = 0
        L2f:
            r2 = 4
            if (r4 != r2) goto L3a
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r3.e = r5
            goto L48
        L3a:
            r3.n = r5
            r0.b(r5)
            java.util.TreeSet r5 = new java.util.TreeSet
            r5.<init>(r0)
            r3.e = r5
            r3.m = r0
        L48:
            r3.l = r4
            java.util.concurrent.atomic.AtomicInteger r4 = r3.k
            r4.set(r1)
            return
    }

    public e(java.util.Collection<master.flame.danmaku.danmaku.model.d> r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.k = r0
            r2.l = r1
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.o = r0
            r2.m(r3)
            return
    }

    public e(boolean r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    private master.flame.danmaku.danmaku.model.d k(java.lang.String r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.e r0 = new master.flame.danmaku.danmaku.model.e
            r0.<init>(r2)
            return r0
    }

    private void l(boolean r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.m$a r0 = r1.m
            r0.b(r2)
            r1.n = r2
            return
    }

    private java.util.Collection<master.flame.danmaku.danmaku.model.d> n(long r3, long r5) {
            r2 = this;
            int r0 = r2.l
            r1 = 4
            if (r0 == r1) goto L50
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r2.e
            if (r0 == 0) goto L50
            int r0 = r0.size()
            if (r0 != 0) goto L10
            goto L50
        L10:
            master.flame.danmaku.danmaku.model.android.e r0 = r2.f
            if (r0 != 0) goto L21
            master.flame.danmaku.danmaku.model.android.e r0 = new master.flame.danmaku.danmaku.model.android.e
            boolean r1 = r2.n
            r0.<init>(r1)
            r2.f = r0
            java.lang.Object r1 = r2.o
            r0.o = r1
        L21:
            master.flame.danmaku.danmaku.model.d r0 = r2.j
            if (r0 != 0) goto L2d
            java.lang.String r0 = "start"
            master.flame.danmaku.danmaku.model.d r0 = r2.k(r0)
            r2.j = r0
        L2d:
            master.flame.danmaku.danmaku.model.d r0 = r2.i
            if (r0 != 0) goto L39
            java.lang.String r0 = "end"
            master.flame.danmaku.danmaku.model.d r0 = r2.k(r0)
            r2.i = r0
        L39:
            master.flame.danmaku.danmaku.model.d r0 = r2.j
            r0.D(r3)
            master.flame.danmaku.danmaku.model.d r3 = r2.i
            r3.D(r5)
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r3 = r2.e
            java.util.SortedSet r3 = (java.util.SortedSet) r3
            master.flame.danmaku.danmaku.model.d r4 = r2.j
            master.flame.danmaku.danmaku.model.d r5 = r2.i
            java.util.SortedSet r3 = r3.subSet(r4, r5)
            return r3
        L50:
            r3 = 0
            return r3
    }

    @Override // master.flame.danmaku.danmaku.model.m
    public void a(master.flame.danmaku.danmaku.model.m.b<? super master.flame.danmaku.danmaku.model.d, ?> r2) {
            r1 = this;
            java.lang.Object r0 = r1.o
            monitor-enter(r0)
            r1.f(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    @Override // master.flame.danmaku.danmaku.model.m
    public void b(boolean r3) {
            r2 = this;
            r2.n = r3
            r0 = 0
            r2.h = r0
            r2.g = r0
            master.flame.danmaku.danmaku.model.android.e r0 = r2.f
            if (r0 != 0) goto L16
            master.flame.danmaku.danmaku.model.android.e r0 = new master.flame.danmaku.danmaku.model.android.e
            r0.<init>(r3)
            r2.f = r0
            java.lang.Object r1 = r2.o
            r0.o = r1
        L16:
            master.flame.danmaku.danmaku.model.android.e r0 = r2.f
            r0.l(r3)
            return
    }

    @Override // master.flame.danmaku.danmaku.model.m
    public java.lang.Object c() {
            r1 = this;
            java.lang.Object r0 = r1.o
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.m
    public void clear() {
            r2 = this;
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r2.e
            if (r0 == 0) goto Ld
            r0.clear()
            java.util.concurrent.atomic.AtomicInteger r0 = r2.k
            r1 = 0
            r0.set(r1)
        Ld:
            master.flame.danmaku.danmaku.model.android.e r0 = r2.f
            if (r0 == 0) goto L24
            r0 = 0
            r2.f = r0
            java.lang.String r0 = "start"
            master.flame.danmaku.danmaku.model.d r0 = r2.k(r0)
            r2.g = r0
            java.lang.String r0 = "end"
            master.flame.danmaku.danmaku.model.d r0 = r2.k(r0)
            r2.h = r0
        L24:
            return
    }

    @Override // master.flame.danmaku.danmaku.model.m
    public master.flame.danmaku.danmaku.model.m d(long r6, long r8) {
            r5 = this;
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r5.e
            if (r0 == 0) goto L9f
            int r0 = r0.size()
            if (r0 != 0) goto Lc
            goto L9f
        Lc:
            master.flame.danmaku.danmaku.model.android.e r0 = r5.f
            r1 = 4
            if (r0 != 0) goto L3c
            int r0 = r5.l
            if (r0 != r1) goto L2f
            master.flame.danmaku.danmaku.model.android.e r0 = new master.flame.danmaku.danmaku.model.android.e
            r0.<init>(r1)
            r5.f = r0
            java.lang.Object r2 = r5.o
            r0.o = r2
            java.lang.Object r0 = r5.o
            monitor-enter(r0)
            master.flame.danmaku.danmaku.model.android.e r2 = r5.f     // Catch: java.lang.Throwable -> L2c
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r3 = r5.e     // Catch: java.lang.Throwable -> L2c
            r2.m(r3)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            goto L3c
        L2c:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r6
        L2f:
            master.flame.danmaku.danmaku.model.android.e r0 = new master.flame.danmaku.danmaku.model.android.e
            boolean r2 = r5.n
            r0.<init>(r2)
            r5.f = r0
            java.lang.Object r2 = r5.o
            r0.o = r2
        L3c:
            int r0 = r5.l
            if (r0 != r1) goto L43
            master.flame.danmaku.danmaku.model.android.e r6 = r5.f
            return r6
        L43:
            master.flame.danmaku.danmaku.model.d r0 = r5.g
            if (r0 != 0) goto L4f
            java.lang.String r0 = "start"
            master.flame.danmaku.danmaku.model.d r0 = r5.k(r0)
            r5.g = r0
        L4f:
            master.flame.danmaku.danmaku.model.d r0 = r5.h
            if (r0 != 0) goto L5b
            java.lang.String r0 = "end"
            master.flame.danmaku.danmaku.model.d r0 = r5.k(r0)
            r5.h = r0
        L5b:
            master.flame.danmaku.danmaku.model.android.e r0 = r5.f
            if (r0 == 0) goto L7a
            master.flame.danmaku.danmaku.model.d r0 = r5.g
            long r0 = r0.b()
            long r0 = r6 - r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L7a
            master.flame.danmaku.danmaku.model.d r0 = r5.h
            long r0 = r0.b()
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 > 0) goto L7a
            master.flame.danmaku.danmaku.model.android.e r6 = r5.f
            return r6
        L7a:
            master.flame.danmaku.danmaku.model.d r0 = r5.g
            r0.D(r6)
            master.flame.danmaku.danmaku.model.d r6 = r5.h
            r6.D(r8)
            java.lang.Object r6 = r5.o
            monitor-enter(r6)
            master.flame.danmaku.danmaku.model.android.e r7 = r5.f     // Catch: java.lang.Throwable -> L9c
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r8 = r5.e     // Catch: java.lang.Throwable -> L9c
            java.util.SortedSet r8 = (java.util.SortedSet) r8     // Catch: java.lang.Throwable -> L9c
            master.flame.danmaku.danmaku.model.d r9 = r5.g     // Catch: java.lang.Throwable -> L9c
            master.flame.danmaku.danmaku.model.d r0 = r5.h     // Catch: java.lang.Throwable -> L9c
            java.util.SortedSet r8 = r8.subSet(r9, r0)     // Catch: java.lang.Throwable -> L9c
            r7.m(r8)     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9c
            master.flame.danmaku.danmaku.model.android.e r6 = r5.f
            return r6
        L9c:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9c
            throw r7
        L9f:
            r6 = 0
            return r6
    }

    @Override // master.flame.danmaku.danmaku.model.m
    public boolean e(master.flame.danmaku.danmaku.model.d r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3.s()
            if (r1 == 0) goto Ld
            r3.G(r0)
        Ld:
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r1 = r2.e
            boolean r3 = r1.remove(r3)
            if (r3 == 0) goto L1c
            java.util.concurrent.atomic.AtomicInteger r3 = r2.k
            r3.decrementAndGet()
            r3 = 1
            return r3
        L1c:
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.m
    public void f(master.flame.danmaku.danmaku.model.m.b<? super master.flame.danmaku.danmaku.model.d, ?> r4) {
            r3 = this;
            r4.c()
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r3.e
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
            if (r1 != 0) goto L18
            goto L9
        L18:
            int r1 = r4.a(r1)
            r2 = 1
            if (r1 != r2) goto L20
            goto L37
        L20:
            r2 = 2
            if (r1 != r2) goto L2c
            r0.remove()
            java.util.concurrent.atomic.AtomicInteger r1 = r3.k
            r1.decrementAndGet()
            goto L9
        L2c:
            r2 = 3
            if (r1 != r2) goto L9
            r0.remove()
            java.util.concurrent.atomic.AtomicInteger r0 = r3.k
            r0.decrementAndGet()
        L37:
            r4.b()
            return
    }

    @Override // master.flame.danmaku.danmaku.model.m
    public master.flame.danmaku.danmaku.model.d first() {
            r2 = this;
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r2.e
            if (r0 == 0) goto L25
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            int r0 = r2.l
            r1 = 4
            if (r0 != r1) goto L1a
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r2.e
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.lang.Object r0 = r0.peek()
            master.flame.danmaku.danmaku.model.d r0 = (master.flame.danmaku.danmaku.model.d) r0
            return r0
        L1a:
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r2.e
            java.util.SortedSet r0 = (java.util.SortedSet) r0
            java.lang.Object r0 = r0.first()
            master.flame.danmaku.danmaku.model.d r0 = (master.flame.danmaku.danmaku.model.d) r0
            return r0
        L25:
            r0 = 0
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.m
    public boolean g(master.flame.danmaku.danmaku.model.d r2) {
            r1 = this;
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r1.e
            if (r0 == 0) goto Lc
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // master.flame.danmaku.danmaku.model.m
    public java.util.Collection<master.flame.danmaku.danmaku.model.d> h() {
            r1 = this;
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r1.e
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.m
    public master.flame.danmaku.danmaku.model.m i(long r1, long r3) {
            r0 = this;
            java.util.Collection r1 = r0.n(r1, r3)
            if (r1 == 0) goto L18
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Ld
            goto L18
        Ld:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>(r1)
            master.flame.danmaku.danmaku.model.android.e r1 = new master.flame.danmaku.danmaku.model.android.e
            r1.<init>(r2)
            return r1
        L18:
            r1 = 0
            return r1
    }

    @Override // master.flame.danmaku.danmaku.model.m
    public boolean isEmpty() {
            r1 = this;
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r1.e
            if (r0 == 0) goto Ld
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.m
    public boolean j(master.flame.danmaku.danmaku.model.d r2) {
            r1 = this;
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r1.e
            if (r0 == 0) goto L11
            boolean r2 = r0.add(r2)     // Catch: java.lang.Exception -> L11
            if (r2 == 0) goto L11
            java.util.concurrent.atomic.AtomicInteger r2 = r1.k     // Catch: java.lang.Exception -> L11
            r2.incrementAndGet()     // Catch: java.lang.Exception -> L11
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    @Override // master.flame.danmaku.danmaku.model.m
    public master.flame.danmaku.danmaku.model.d last() {
            r2 = this;
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r2.e
            if (r0 == 0) goto L25
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            int r0 = r2.l
            r1 = 4
            if (r0 != r1) goto L1a
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r2.e
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.lang.Object r0 = r0.peekLast()
            master.flame.danmaku.danmaku.model.d r0 = (master.flame.danmaku.danmaku.model.d) r0
            return r0
        L1a:
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r2.e
            java.util.SortedSet r0 = (java.util.SortedSet) r0
            java.lang.Object r0 = r0.last()
            master.flame.danmaku.danmaku.model.d r0 = (master.flame.danmaku.danmaku.model.d) r0
            return r0
        L25:
            r0 = 0
            return r0
    }

    public void m(java.util.Collection<master.flame.danmaku.danmaku.model.d> r3) {
            r2 = this;
            boolean r0 = r2.n
            r1 = 4
            if (r0 == 0) goto L16
            int r0 = r2.l
            if (r0 == r1) goto L16
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r2.e
            r0.clear()
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r0 = r2.e
            r0.addAll(r3)
            java.util.Collection<master.flame.danmaku.danmaku.model.d> r3 = r2.e
            goto L18
        L16:
            r2.e = r3
        L18:
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L1e
            r2.l = r1
        L1e:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.k
            if (r3 != 0) goto L24
            r3 = 0
            goto L28
        L24:
            int r3 = r3.size()
        L28:
            r0.set(r3)
            return
    }

    @Override // master.flame.danmaku.danmaku.model.m
    public int size() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.k
            int r0 = r0.get()
            return r0
    }
}
