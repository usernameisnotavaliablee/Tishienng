package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class n implements java.lang.Iterable<java.lang.Long>, l3.a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.n.a d = null;
    private final long a;
    private final long b;
    private final long c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.ranges.n a(long r8, long r10, long r12) {
                r7 = this;
                kotlin.ranges.n r0 = new kotlin.ranges.n
                r1 = r8
                r3 = r10
                r5 = r12
                r0.<init>(r1, r3, r5)
                return r0
        }
    }

    static {
            kotlin.ranges.n$a r0 = new kotlin.ranges.n$a
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.n.d = r0
            return
    }

    public n(long r4, long r6, long r8) {
            r3 = this;
            r3.<init>()
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L22
            r0 = -9223372036854775808
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L1a
            r3.a = r4
            long r4 = kotlin.internal.c.d(r4, r6, r8)
            r3.b = r4
            r3.c = r8
            return
        L1a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Step must be greater than Long.MIN_VALUE to avoid overflow on negation."
            r4.<init>(r5)
            throw r4
        L22:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Step must be non-zero."
            r4.<init>(r5)
            throw r4
    }

    public final long e() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof kotlin.ranges.n
            if (r0 == 0) goto L2f
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.ranges.n r0 = (kotlin.ranges.n) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L13:
            long r0 = r5.a
            kotlin.ranges.n r6 = (kotlin.ranges.n) r6
            long r2 = r6.a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2f
            long r0 = r5.b
            long r2 = r6.b
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2f
            long r0 = r5.c
            long r2 = r6.c
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L2f
        L2d:
            r6 = 1
            return r6
        L2f:
            r6 = 0
            return r6
    }

    public final long f() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public final long g() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    public int hashCode() {
            r9 = this;
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            r0 = 31
            long r0 = (long) r0
            long r2 = r9.a
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            long r2 = r2 * r0
            long r5 = r9.b
            long r7 = r5 >>> r4
            long r5 = r5 ^ r7
            long r2 = r2 + r5
            long r0 = r0 * r2
            long r2 = r9.c
            long r4 = r2 >>> r4
            long r2 = r2 ^ r4
            long r0 = r0 + r2
            int r1 = (int) r0
            return r1
    }

    public boolean isEmpty() {
            r7 = this;
            long r0 = r7.c
            r2 = 0
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            long r0 = r7.a
            long r2 = r7.b
            if (r6 <= 0) goto L14
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L13
            return r5
        L13:
            return r4
        L14:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L19
            return r5
        L19:
            return r4
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Long> iterator() {
            r1 = this;
            kotlin.collections.e1 r0 = r1.j()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.collections.e1 j() {
            r7 = this;
            kotlin.ranges.o r0 = new kotlin.ranges.o
            long r1 = r7.a
            long r3 = r7.b
            long r5 = r7.c
            r0.<init>(r1, r3, r5)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r6 = this;
            long r0 = r6.c
            r2 = 0
            java.lang.String r4 = " step "
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r5 <= 0) goto L2b
            r0.<init>()
            long r1 = r6.a
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            long r1 = r6.b
            r0.append(r1)
            r0.append(r4)
            long r1 = r6.c
        L23:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L2b:
            r0.<init>()
            long r1 = r6.a
            r0.append(r1)
            java.lang.String r1 = " downTo "
            r0.append(r1)
            long r1 = r6.b
            r0.append(r1)
            r0.append(r4)
            long r1 = r6.c
            long r1 = -r1
            goto L23
    }
}
