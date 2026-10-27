package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.5")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class z implements java.lang.Iterable<kotlin.d1>, l3.a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.z.a d = null;
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
        public final kotlin.ranges.z a(long r9, long r11, long r13) {
                r8 = this;
                kotlin.ranges.z r0 = new kotlin.ranges.z
                r7 = 0
                r1 = r9
                r3 = r11
                r5 = r13
                r0.<init>(r1, r3, r5, r7)
                return r0
        }
    }

    static {
            kotlin.ranges.z$a r0 = new kotlin.ranges.z$a
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.z.d = r0
            return
    }

    private z(long r4, long r6, long r8) {
            r3 = this;
            r3.<init>()
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L22
            r0 = -9223372036854775808
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L1a
            r3.a = r4
            long r4 = kotlin.internal.e.c(r4, r6, r8)
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

    public /* synthetic */ z(long r1, long r3, long r5, kotlin.jvm.internal.v r7) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            return
    }

    public final long e() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof kotlin.ranges.z
            if (r0 == 0) goto L2f
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.ranges.z r0 = (kotlin.ranges.z) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L13:
            long r0 = r5.a
            kotlin.ranges.z r6 = (kotlin.ranges.z) r6
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
            r7 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            long r0 = r7.a
            r2 = 32
            long r3 = r0 >>> r2
            long r3 = kotlin.d1.k(r3)
            long r0 = r0 ^ r3
            long r0 = kotlin.d1.k(r0)
            int r1 = (int) r0
            int r1 = r1 * 31
            long r3 = r7.b
            long r5 = r3 >>> r2
            long r5 = kotlin.d1.k(r5)
            long r3 = r3 ^ r5
            long r3 = kotlin.d1.k(r3)
            int r0 = (int) r3
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r3 = r7.c
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r0 = (int) r3
            int r1 = r1 + r0
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
            int r0 = androidx.collection.a.a(r0, r2)
            if (r6 <= 0) goto L16
            if (r0 <= 0) goto L15
            return r5
        L15:
            return r4
        L16:
            if (r0 >= 0) goto L19
            return r5
        L19:
            return r4
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public final java.util.Iterator<kotlin.d1> iterator() {
            r8 = this;
            kotlin.ranges.a0 r0 = new kotlin.ranges.a0
            long r1 = r8.a
            long r3 = r8.b
            long r5 = r8.c
            r7 = 0
            r0.<init>(r1, r3, r5, r7)
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
            if (r5 <= 0) goto L33
            r0.<init>()
            long r1 = r6.a
            java.lang.String r1 = kotlin.d1.l0(r1)
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            long r1 = r6.b
            java.lang.String r1 = kotlin.d1.l0(r1)
            r0.append(r1)
            r0.append(r4)
            long r1 = r6.c
        L2b:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L33:
            r0.<init>()
            long r1 = r6.a
            java.lang.String r1 = kotlin.d1.l0(r1)
            r0.append(r1)
            java.lang.String r1 = " downTo "
            r0.append(r1)
            long r1 = r6.b
            java.lang.String r1 = kotlin.d1.l0(r1)
            r0.append(r1)
            r0.append(r4)
            long r1 = r6.c
            long r1 = -r1
            goto L2b
    }
}
