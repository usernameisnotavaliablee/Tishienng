package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@rx.internal.util.SuppressAnimalSniffer
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class h0<E> extends rx.internal.util.unsafe.j0<E> implements rx.internal.util.unsafe.q {
    static final int t = 0;
    private static final long u = 0;
    private static final long v = 0;
    private static final long w = 0;
    private static final int x = 0;
    private static final java.lang.Object y = null;

    static {
            java.lang.String r0 = "jctools.spsc.max.lookahead.step"
            r1 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            rx.internal.util.unsafe.h0.t = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            rx.internal.util.unsafe.h0.y = r0
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            int r2 = r0.arrayIndexScale(r1)
            r3 = 4
            if (r3 != r2) goto L24
            r2 = 2
            rx.internal.util.unsafe.h0.x = r2
            goto L2b
        L24:
            r3 = 8
            if (r3 != r2) goto L63
            r2 = 3
            rx.internal.util.unsafe.h0.x = r2
        L2b:
            int r1 = r0.arrayBaseOffset(r1)
            long r1 = (long) r1
            rx.internal.util.unsafe.h0.w = r1
            java.lang.Class<rx.internal.util.unsafe.m0> r1 = rx.internal.util.unsafe.m0.class
            java.lang.String r2 = "producerIndex"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L59
            long r1 = r0.objectFieldOffset(r1)     // Catch: java.lang.NoSuchFieldException -> L59
            rx.internal.util.unsafe.h0.u = r1     // Catch: java.lang.NoSuchFieldException -> L59
            java.lang.Class<rx.internal.util.unsafe.j0> r1 = rx.internal.util.unsafe.j0.class
            java.lang.String r2 = "consumerIndex"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L4f
            long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.NoSuchFieldException -> L4f
            rx.internal.util.unsafe.h0.v = r0     // Catch: java.lang.NoSuchFieldException -> L4f
            return
        L4f:
            r0 = move-exception
            java.lang.InternalError r1 = new java.lang.InternalError
            r1.<init>()
            r1.initCause(r0)
            throw r1
        L59:
            r0 = move-exception
            java.lang.InternalError r1 = new java.lang.InternalError
            r1.<init>()
            r1.initCause(r0)
            throw r1
        L63:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown pointer size"
            r0.<init>(r1)
            throw r0
    }

    public h0(int r5) {
            r4 = this;
            r4.<init>()
            int r5 = rx.internal.util.unsafe.p.b(r5)
            int r0 = r5 + (-1)
            long r0 = (long) r0
            int r2 = r5 + 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4.d = r2
            r4.c = r0
            r4.a(r5)
            r4.s = r2
            r4.r = r0
            r2 = 1
            long r0 = r0 - r2
            r4.b = r0
            r0 = 0
            r4.t(r0)
            return
    }

    private void a(int r2) {
            r1 = this;
            int r2 = r2 / 4
            int r0 = rx.internal.util.unsafe.h0.t
            int r2 = java.lang.Math.min(r2, r0)
            r1.a = r2
            return
    }

    private static long d(long r3) {
            long r0 = rx.internal.util.unsafe.h0.w
            int r2 = rx.internal.util.unsafe.h0.x
            long r3 = r3 << r2
            long r0 = r0 + r3
            return r0
    }

    private static long e(long r0, long r2) {
            long r0 = r0 & r2
            long r0 = d(r0)
            return r0
    }

    private long f() {
            r3 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            long r1 = rx.internal.util.unsafe.h0.v
            long r0 = r0.getLongVolatile(r3, r1)
            return r0
    }

    private static <E> java.lang.Object g(E[] r1, long r2) {
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            java.lang.Object r1 = r0.getObjectVolatile(r1, r2)
            return r1
    }

    private E[] j(E[] r3) {
            r2 = this;
            int r0 = r3.length
            int r0 = r0 + (-1)
            long r0 = (long) r0
            long r0 = d(r0)
            java.lang.Object r3 = g(r3, r0)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            return r3
    }

    private long m() {
            r3 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            long r1 = rx.internal.util.unsafe.h0.u
            long r0 = r0.getLongVolatile(r3, r1)
            return r0
    }

    private E n(E[] r1, long r2, long r4) {
            r0 = this;
            r0.s = r1
            long r2 = e(r2, r4)
            java.lang.Object r1 = g(r1, r2)
            return r1
    }

    private E o(E[] r3, long r4, long r6) {
            r2 = this;
            r2.s = r3
            long r6 = e(r4, r6)
            java.lang.Object r0 = g(r3, r6)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            r(r3, r6, r1)
            r6 = 1
            long r4 = r4 + r6
            r2.q(r4)
            return r0
    }

    private void p(E[] r4, long r5, long r7, E r9, long r10) {
            r3 = this;
            int r0 = r4.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3.d = r0
            long r10 = r10 + r5
            r1 = 1
            long r10 = r10 - r1
            r3.b = r10
            r(r0, r7, r9)
            r3.s(r4, r0)
            java.lang.Object r9 = rx.internal.util.unsafe.h0.y
            r(r4, r7, r9)
            long r5 = r5 + r1
            r3.t(r5)
            return
    }

    private void q(long r7) {
            r6 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            long r2 = rx.internal.util.unsafe.h0.v
            r1 = r6
            r4 = r7
            r0.putOrderedLong(r1, r2, r4)
            return
    }

    private static void r(java.lang.Object[] r1, long r2, java.lang.Object r4) {
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            r0.putOrderedObject(r1, r2, r4)
            return
    }

    private void s(E[] r3, E[] r4) {
            r2 = this;
            int r0 = r3.length
            int r0 = r0 + (-1)
            long r0 = (long) r0
            long r0 = d(r0)
            r(r3, r0, r4)
            return
    }

    private void t(long r7) {
            r6 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            long r2 = rx.internal.util.unsafe.h0.u
            r1 = r6
            r4 = r7
            r0.putOrderedLong(r1, r2, r4)
            return
    }

    private boolean u(E[] r1, E r2, long r3, long r5) {
            r0 = this;
            r(r1, r5, r2)
            r1 = 1
            long r3 = r3 + r1
            r0.t(r3)
            r1 = 1
            return r1
    }

    @Override // rx.internal.util.unsafe.q
    public long currentConsumerIndex() {
            r2 = this;
            long r0 = r2.f()
            return r0
    }

    @Override // rx.internal.util.unsafe.q
    public long currentProducerIndex() {
            r2 = this;
            long r0 = r2.m()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Queue
    public final boolean offer(E r14) {
            r13 = this;
            if (r14 == 0) goto L4f
            E[] r1 = r13.d
            long r3 = r13.producerIndex
            long r7 = r13.c
            long r5 = e(r3, r7)
            long r9 = r13.b
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 >= 0) goto L19
            r0 = r13
            r2 = r14
            boolean r14 = r0.u(r1, r2, r3, r5)
            return r14
        L19:
            int r2 = r13.a
            long r9 = (long) r2
            long r9 = r9 + r3
            long r11 = e(r9, r7)
            java.lang.Object r2 = g(r1, r11)
            r11 = 1
            if (r2 != 0) goto L33
            long r9 = r9 - r11
            r13.b = r9
            r0 = r13
            r2 = r14
            boolean r14 = r0.u(r1, r2, r3, r5)
            return r14
        L33:
            long r9 = r3 + r11
            long r9 = e(r9, r7)
            java.lang.Object r0 = g(r1, r9)
            if (r0 == 0) goto L46
            r0 = r13
            r2 = r14
            boolean r14 = r0.u(r1, r2, r3, r5)
            return r14
        L46:
            r0 = r13
            r2 = r3
            r4 = r5
            r6 = r14
            r0.p(r1, r2, r4, r6, r7)
            r14 = 1
            return r14
        L4f:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.String r0 = "Null is not a valid element"
            r14.<init>(r0)
            throw r14
    }

    @Override // java.util.Queue
    public final E peek() {
            r7 = this;
            E[] r0 = r7.s
            long r3 = r7.consumerIndex
            long r5 = r7.r
            long r1 = e(r3, r5)
            java.lang.Object r1 = g(r0, r1)
            java.lang.Object r2 = rx.internal.util.unsafe.h0.y
            if (r1 != r2) goto L1c
            java.lang.Object[] r2 = r7.j(r0)
            r1 = r7
            java.lang.Object r0 = r1.n(r2, r3, r5)
            return r0
        L1c:
            return r1
    }

    @Override // java.util.Queue
    public final E poll() {
            r10 = this;
            E[] r0 = r10.s
            long r3 = r10.consumerIndex
            long r5 = r10.r
            long r1 = e(r3, r5)
            java.lang.Object r7 = g(r0, r1)
            java.lang.Object r8 = rx.internal.util.unsafe.h0.y
            if (r7 != r8) goto L14
            r8 = 1
            goto L15
        L14:
            r8 = 0
        L15:
            r9 = 0
            if (r7 == 0) goto L24
            if (r8 != 0) goto L24
            r(r0, r1, r9)
            r0 = 1
            long r3 = r3 + r0
            r10.q(r3)
            return r7
        L24:
            if (r8 == 0) goto L30
            java.lang.Object[] r2 = r10.j(r0)
            r1 = r10
            java.lang.Object r0 = r1.o(r2, r3, r5)
            return r0
        L30:
            return r9
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
            r7 = this;
            long r0 = r7.f()
        L4:
            long r2 = r7.m()
            long r4 = r7.f()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L13
            long r2 = r2 - r4
            int r0 = (int) r2
            return r0
        L13:
            r0 = r4
            goto L4
    }
}
