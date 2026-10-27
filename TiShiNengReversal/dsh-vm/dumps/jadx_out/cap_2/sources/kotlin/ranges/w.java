package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.5")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class w implements java.lang.Iterable<kotlin.z0>, l3.a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.w.a d = null;
    private final int a;
    private final int b;
    private final int c;

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
        public final kotlin.ranges.w a(int r3, int r4, int r5) {
                r2 = this;
                kotlin.ranges.w r0 = new kotlin.ranges.w
                r1 = 0
                r0.<init>(r3, r4, r5, r1)
                return r0
        }
    }

    static {
            kotlin.ranges.w$a r0 = new kotlin.ranges.w$a
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.w.d = r0
            return
    }

    private w(int r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r4 == 0) goto L1c
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L14
            r1.a = r2
            int r2 = kotlin.internal.e.d(r2, r3, r4)
            r1.b = r2
            r1.c = r4
            return
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."
            r2.<init>(r3)
            throw r2
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Step must be non-zero."
            r2.<init>(r3)
            throw r2
    }

    public /* synthetic */ w(int r1, int r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public final int e() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.w
            if (r0 == 0) goto L29
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            kotlin.ranges.w r0 = (kotlin.ranges.w) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
        L13:
            int r0 = r2.a
            kotlin.ranges.w r3 = (kotlin.ranges.w) r3
            int r1 = r3.a
            if (r0 != r1) goto L29
            int r0 = r2.b
            int r1 = r3.b
            if (r0 != r1) goto L29
            int r0 = r2.c
            int r3 = r3.c
            if (r0 != r3) goto L29
        L27:
            r3 = 1
            return r3
        L29:
            r3 = 0
            return r3
    }

    public final int f() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public final int g() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            int r0 = r2.a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.c
            int r0 = r0 + r1
            return r0
    }

    public boolean isEmpty() {
            r4 = this;
            int r0 = r4.c
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L12
            int r0 = r4.a
            int r3 = r4.b
            int r0 = kotlin.u0.a(r0, r3)
            if (r0 <= 0) goto L11
            return r2
        L11:
            return r1
        L12:
            int r0 = r4.a
            int r3 = r4.b
            int r0 = kotlin.u0.a(r0, r3)
            if (r0 >= 0) goto L1d
            return r2
        L1d:
            return r1
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public final java.util.Iterator<kotlin.z0> iterator() {
            r5 = this;
            kotlin.ranges.x r0 = new kotlin.ranges.x
            int r1 = r5.a
            int r2 = r5.b
            int r3 = r5.c
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.c
            java.lang.String r1 = " step "
            if (r0 <= 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.a
            java.lang.String r2 = kotlin.z0.l0(r2)
            r0.append(r2)
            java.lang.String r2 = ".."
            r0.append(r2)
            int r2 = r3.b
            java.lang.String r2 = kotlin.z0.l0(r2)
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.c
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L2f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.a
            java.lang.String r2 = kotlin.z0.l0(r2)
            r0.append(r2)
            java.lang.String r2 = " downTo "
            r0.append(r2)
            int r2 = r3.b
            java.lang.String r2 = kotlin.z0.l0(r2)
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.c
            int r1 = -r1
            goto L27
    }
}
