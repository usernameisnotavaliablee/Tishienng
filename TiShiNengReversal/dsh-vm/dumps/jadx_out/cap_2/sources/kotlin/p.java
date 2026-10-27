package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.1")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p implements java.lang.Comparable<kotlin.p> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.p.a e = null;
    public static final int f = 255;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.p g = null;
    private final int a;
    private final int b;
    private final int c;
    private final int d;

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
    }

    static {
            kotlin.p$a r0 = new kotlin.p$a
            r1 = 0
            r0.<init>(r1)
            kotlin.p.e = r0
            kotlin.p r0 = kotlin.q.a()
            kotlin.p.g = r0
            return
    }

    public p(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public p(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            int r1 = r0.j(r1, r2, r3)
            r0.d = r1
            return
    }

    private final int j(int r3, int r4, int r5) {
            r2 = this;
            if (r3 < 0) goto L15
            r0 = 256(0x100, float:3.59E-43)
            if (r3 >= r0) goto L15
            if (r4 < 0) goto L15
            if (r4 >= r0) goto L15
            if (r5 < 0) goto L15
            if (r5 >= r0) goto L15
            int r3 = r3 << 16
            int r4 = r4 << 8
            int r3 = r3 + r4
            int r3 = r3 + r5
            return r3
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Version components are out of range: "
            r0.append(r1)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            r0.append(r4)
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public int a(@org.jetbrains.annotations.NotNull kotlin.p r2) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1.d
            int r2 = r2.d
            int r0 = r0 - r2
            return r0
    }

    public final int b() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public final int c() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.p r1) {
            r0 = this;
            kotlin.p r1 = (kotlin.p) r1
            int r1 = r0.a(r1)
            return r1
    }

    public final int d() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof kotlin.p
            if (r1 == 0) goto Lb
            kotlin.p r4 = (kotlin.p) r4
            goto Lc
        Lb:
            r4 = 0
        Lc:
            r1 = 0
            if (r4 != 0) goto L10
            return r1
        L10:
            int r2 = r3.d
            int r4 = r4.d
            if (r2 != r4) goto L17
            return r0
        L17:
            return r1
    }

    public final boolean h(int r2, int r3) {
            r1 = this;
            int r0 = r1.a
            if (r0 > r2) goto Ld
            if (r0 != r2) goto Lb
            int r2 = r1.b
            if (r2 < r3) goto Lb
            goto Ld
        Lb:
            r2 = 0
            return r2
        Ld:
            r2 = 1
            return r2
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public final boolean i(int r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.a
            if (r0 > r2) goto L13
            if (r0 != r2) goto L11
            int r2 = r1.b
            if (r2 > r3) goto L13
            if (r2 != r3) goto L11
            int r2 = r1.c
            if (r2 < r4) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.a
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            int r2 = r3.b
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
