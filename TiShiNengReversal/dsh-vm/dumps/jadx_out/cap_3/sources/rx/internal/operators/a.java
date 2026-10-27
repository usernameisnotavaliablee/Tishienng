package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class a {
    static final long a = Long.MIN_VALUE;
    static final long b = Long.MAX_VALUE;

    private a() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static long a(long r1, long r3) {
            long r1 = r1 + r3
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto Lc
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lc:
            return r1
    }

    public static long b(java.util.concurrent.atomic.AtomicLong r4, long r5) {
        L0:
            long r0 = r4.get()
            long r2 = a(r0, r5)
            boolean r2 = r4.compareAndSet(r0, r2)
            if (r2 == 0) goto L0
            return r0
    }

    public static long c(long r7, long r9) {
            long r0 = r7 * r9
            long r2 = r7 | r9
            r4 = 31
            long r2 = r2 >>> r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L1d
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 == 0) goto L1d
            long r9 = r0 / r9
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 == 0) goto L1d
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r7
        L1d:
            return r0
    }

    public static <T> void d(java.util.concurrent.atomic.AtomicLong r1, java.util.Queue<T> r2, rx.l<? super T> r3) {
            rx.functions.p r0 = rx.internal.util.n.c()
            e(r1, r2, r3, r0)
            return
    }

    public static <T, R> void e(java.util.concurrent.atomic.AtomicLong r9, java.util.Queue<T> r10, rx.l<? super R> r11, rx.functions.p<? super T, ? extends R> r12) {
        L0:
            long r0 = r9.get()
            r2 = -9223372036854775808
            long r4 = r0 & r2
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto Lf
            goto L1d
        Lf:
            long r2 = r2 | r0
            boolean r2 = r9.compareAndSet(r0, r2)
            if (r2 == 0) goto L0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L1d
            f(r9, r10, r11, r12)
        L1d:
            return
    }

    static <T, R> void f(java.util.concurrent.atomic.AtomicLong r10, java.util.Queue<T> r11, rx.l<? super R> r12, rx.functions.p<? super T, ? extends R> r13) {
            long r0 = r10.get()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L26
        Ld:
            boolean r10 = r12.isUnsubscribed()
            if (r10 == 0) goto L14
            goto L6f
        L14:
            java.lang.Object r10 = r11.poll()
            if (r10 != 0) goto L1e
            r12.onCompleted()
            return
        L1e:
            java.lang.Object r10 = r13.call(r10)
            r12.onNext(r10)
            goto Ld
        L26:
            r4 = -9223372036854775808
        L28:
            r6 = r4
        L29:
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 == 0) goto L49
            boolean r8 = r12.isUnsubscribed()
            if (r8 == 0) goto L34
            goto L6f
        L34:
            java.lang.Object r8 = r11.poll()
            if (r8 != 0) goto L3e
            r12.onCompleted()
            return
        L3e:
            java.lang.Object r8 = r13.call(r8)
            r12.onNext(r8)
            r8 = 1
            long r6 = r6 + r8
            goto L29
        L49:
            if (r8 != 0) goto L5c
            boolean r0 = r12.isUnsubscribed()
            if (r0 == 0) goto L52
            goto L6f
        L52:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L5c
            r12.onCompleted()
            return
        L5c:
            long r0 = r10.get()
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 != 0) goto L29
            long r0 = r6 & r2
            long r0 = -r0
            long r0 = r10.addAndGet(r0)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L28
        L6f:
            return
    }

    public static <T> boolean g(java.util.concurrent.atomic.AtomicLong r6, long r7, java.util.Queue<T> r9, rx.l<? super T> r10) {
            rx.functions.p r5 = rx.internal.util.n.c()
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            boolean r6 = h(r0, r1, r3, r4, r5)
            return r6
    }

    public static <T, R> boolean h(java.util.concurrent.atomic.AtomicLong r16, long r17, java.util.Queue<T> r19, rx.l<? super R> r20, rx.functions.p<? super T, ? extends R> r21) {
            r0 = r16
            r1 = r17
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L4d
            r6 = 1
            r7 = 0
            r8 = -9223372036854775808
            if (r5 != 0) goto L1b
            long r0 = r0.get()
            long r0 = r0 & r8
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L1a
            return r6
        L1a:
            return r7
        L1b:
            long r10 = r0.get()
            long r12 = r10 & r8
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r14 = r14 & r10
            long r14 = a(r14, r1)
            long r14 = r14 | r12
            boolean r5 = r0.compareAndSet(r10, r14)
            if (r5 == 0) goto L46
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L40
            r5 = r19
            r10 = r20
            r11 = r21
            f(r0, r5, r10, r11)
            return r7
        L40:
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 != 0) goto L45
            return r6
        L45:
            return r7
        L46:
            r5 = r19
            r10 = r20
            r11 = r21
            goto L1b
        L4d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "n >= 0 required but it was "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
    }

    public static long i(java.util.concurrent.atomic.AtomicLong r7, long r8) {
        L0:
            long r0 = r7.get()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            return r2
        Le:
            long r2 = r0 - r8
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L1d
            boolean r0 = r7.compareAndSet(r0, r2)
            if (r0 == 0) goto L0
            return r2
        L1d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "More produced than requested: "
            r8.append(r9)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    public static boolean j(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto Lc
            if (r2 == 0) goto La
            r3 = 1
            return r3
        La:
            r3 = 0
            return r3
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "n >= 0 required but it was "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
