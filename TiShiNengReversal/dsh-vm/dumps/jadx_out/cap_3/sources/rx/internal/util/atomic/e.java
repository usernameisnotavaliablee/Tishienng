package rx.internal.util.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class e<T> implements java.util.Queue<T> {
    static final int i = 0;
    private static final java.lang.Object j = null;
    final java.util.concurrent.atomic.AtomicLong a;
    int b;
    long c;
    int d;
    java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> e;
    int f;
    java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> g;
    final java.util.concurrent.atomic.AtomicLong h;

    static {
            java.lang.String r0 = "jctools.spsc.max.lookahead.step"
            r1 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            rx.internal.util.atomic.e.i = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            rx.internal.util.atomic.e.j = r0
            return
    }

    public e(int r4) {
            r3 = this;
            r3.<init>()
            int r4 = rx.internal.util.unsafe.p.b(r4)
            int r0 = r4 + (-1)
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = r4 + 1
            r1.<init>(r2)
            r3.e = r1
            r3.d = r0
            r3.a(r4)
            r3.g = r1
            r3.f = r0
            int r4 = r4 + (-2)
            long r0 = (long) r4
            r3.c = r0
            java.util.concurrent.atomic.AtomicLong r4 = new java.util.concurrent.atomic.AtomicLong
            r4.<init>()
            r3.a = r4
            java.util.concurrent.atomic.AtomicLong r4 = new java.util.concurrent.atomic.AtomicLong
            r4.<init>()
            r3.h = r4
            return
    }

    private void a(int r2) {
            r1 = this;
            int r2 = r2 / 4
            int r0 = rx.internal.util.atomic.e.i
            int r2 = java.lang.Math.min(r2, r0)
            r1.b = r2
            return
    }

    private static int d(int r0) {
            return r0
    }

    private static int e(long r0, int r2) {
            int r1 = (int) r0
            r0 = r1 & r2
            int r0 = d(r0)
            return r0
    }

    private long f() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.h
            long r0 = r0.get()
            return r0
    }

    private long g() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.a
            long r0 = r0.get()
            return r0
    }

    private long j() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.h
            long r0 = r0.get()
            return r0
    }

    private static <E> java.lang.Object m(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0, int r1) {
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    private java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> n(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r2) {
            r1 = this;
            int r0 = r2.length()
            int r0 = r0 + (-1)
            int r0 = d(r0)
            java.lang.Object r2 = m(r2, r0)
            java.util.concurrent.atomic.AtomicReferenceArray r2 = (java.util.concurrent.atomic.AtomicReferenceArray) r2
            return r2
    }

    private long o() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.a
            long r0 = r0.get()
            return r0
    }

    private T p(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r1, long r2, int r4) {
            r0 = this;
            r0.g = r1
            int r2 = e(r2, r4)
            java.lang.Object r1 = m(r1, r2)
            return r1
    }

    private T q(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r4, long r5, int r7) {
            r3 = this;
            r3.g = r4
            int r7 = e(r5, r7)
            java.lang.Object r0 = m(r4, r7)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            u(r4, r7, r1)
            r1 = 1
            long r5 = r5 + r1
            r3.t(r5)
            return r0
    }

    private void s(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r5, long r6, int r8, T r9, long r10) {
            r4 = this;
            int r0 = r5.length()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            r1.<init>(r0)
            r4.e = r1
            long r10 = r10 + r6
            r2 = 1
            long r10 = r10 - r2
            r4.c = r10
            u(r1, r8, r9)
            r4.v(r5, r1)
            java.lang.Object r9 = rx.internal.util.atomic.e.j
            u(r5, r8, r9)
            long r6 = r6 + r2
            r4.w(r6)
            return
    }

    private void t(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.h
            r0.lazySet(r2)
            return
    }

    private static void u(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0, int r1, java.lang.Object r2) {
            r0.lazySet(r1, r2)
            return
    }

    private void v(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r2, java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r3) {
            r1 = this;
            int r0 = r2.length()
            int r0 = r0 + (-1)
            int r0 = d(r0)
            u(r2, r0, r3)
            return
    }

    private void w(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.a
            r0.lazySet(r2)
            return
    }

    private boolean x(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r1, T r2, long r3, int r5) {
            r0 = this;
            u(r1, r5, r2)
            r1 = 1
            long r3 = r3 + r1
            r0.w(r3)
            r1 = 1
            return r1
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(T r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends T> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public void clear() {
            r1 = this;
        L0:
            java.lang.Object r0 = r1.poll()
            if (r0 != 0) goto L0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Ld
            goto L0
        Ld:
            return
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Queue
    public T element() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r5 = this;
            long r0 = r5.o()
            long r2 = r5.j()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Queue
    public boolean offer(T r12) {
            r11 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r1 = r11.e
            long r3 = r11.g()
            int r6 = r11.d
            int r5 = e(r3, r6)
            long r7 = r11.c
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L19
            r0 = r11
            r2 = r12
            boolean r12 = r0.x(r1, r2, r3, r5)
            return r12
        L19:
            r0 = r11
            r2 = r12
            int r12 = r0.b
            long r7 = (long) r12
            long r7 = r7 + r3
            int r12 = e(r7, r6)
            java.lang.Object r12 = m(r1, r12)
            r9 = 1
            if (r12 != 0) goto L33
            long r7 = r7 - r9
            r0.c = r7
            boolean r12 = r0.x(r1, r2, r3, r5)
            return r12
        L33:
            long r7 = r3 + r9
            int r12 = e(r7, r6)
            java.lang.Object r12 = m(r1, r12)
            if (r12 != 0) goto L45
            r0 = r11
            boolean r12 = r0.x(r1, r2, r3, r5)
            return r12
        L45:
            long r6 = (long) r6
            r0 = r5
            r5 = r2
            r2 = r3
            r4 = r0
            r0 = r11
            r0.s(r1, r2, r4, r5, r6)
            r12 = 1
            return r12
    }

    @Override // java.util.Queue
    public T peek() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r6.g
            long r1 = r6.f()
            int r3 = r6.f
            int r4 = e(r1, r3)
            java.lang.Object r4 = m(r0, r4)
            java.lang.Object r5 = rx.internal.util.atomic.e.j
            if (r4 != r5) goto L1d
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.n(r0)
            java.lang.Object r0 = r6.p(r0, r1, r3)
            return r0
        L1d:
            return r4
    }

    @Override // java.util.Queue
    public T poll() {
            r8 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r8.g
            long r1 = r8.f()
            int r3 = r8.f
            int r4 = e(r1, r3)
            java.lang.Object r5 = m(r0, r4)
            java.lang.Object r6 = rx.internal.util.atomic.e.j
            if (r5 != r6) goto L16
            r6 = 1
            goto L17
        L16:
            r6 = 0
        L17:
            r7 = 0
            if (r5 == 0) goto L26
            if (r6 != 0) goto L26
            u(r0, r4, r7)
            r3 = 1
            long r1 = r1 + r3
            r8.t(r1)
            return r5
        L26:
            if (r6 == 0) goto L31
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r8.n(r0)
            java.lang.Object r0 = r8.q(r0, r1, r3)
            return r0
        L31:
            return r7
    }

    public boolean r(T r9, T r10) {
            r8 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r8.e
            long r1 = r8.o()
            int r3 = r8.d
            r4 = 2
            long r4 = r4 + r1
            int r6 = e(r4, r3)
            java.lang.Object r6 = m(r0, r6)
            if (r6 != 0) goto L25
            int r1 = e(r1, r3)
            int r2 = r1 + 1
            u(r0, r2, r10)
            u(r0, r1, r9)
            r8.w(r4)
            goto L47
        L25:
            int r6 = r0.length()
            java.util.concurrent.atomic.AtomicReferenceArray r7 = new java.util.concurrent.atomic.AtomicReferenceArray
            r7.<init>(r6)
            r8.e = r7
            int r1 = e(r1, r3)
            int r2 = r1 + 1
            u(r7, r2, r10)
            u(r7, r1, r9)
            r8.v(r0, r7)
            java.lang.Object r9 = rx.internal.util.atomic.e.j
            u(r0, r1, r9)
            r8.w(r4)
        L47:
            r9 = 1
            return r9
    }

    @Override // java.util.Queue
    public T remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public int size() {
            r7 = this;
            long r0 = r7.j()
        L4:
            long r2 = r7.o()
            long r4 = r7.j()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L13
            long r2 = r2 - r4
            int r0 = (int) r2
            return r0
        L13:
            r0 = r4
            goto L4
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection
    public <E> E[] toArray(E[] r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
