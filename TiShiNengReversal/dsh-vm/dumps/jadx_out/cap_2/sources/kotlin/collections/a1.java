package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a1<T> {
    private final int a;
    private final T b;

    public a1(int r1, T r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static /* synthetic */ kotlin.collections.a1 d(kotlin.collections.a1 r0, int r1, java.lang.Object r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            int r1 = r0.a
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            T r2 = r0.b
        Lc:
            kotlin.collections.a1 r0 = r0.c(r1, r2)
            return r0
    }

    public final int a() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public final T b() {
            r1 = this;
            T r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.collections.a1<T> c(int r2, T r3) {
            r1 = this;
            kotlin.collections.a1 r0 = new kotlin.collections.a1
            r0.<init>(r2, r3)
            return r0
    }

    public final int e() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.collections.a1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.collections.a1 r5 = (kotlin.collections.a1) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            T r1 = r4.b
            T r5 = r5.b
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final T f() {
            r1 = this;
            T r0 = r1.b
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 31
            T r1 = r2.b
            if (r1 != 0) goto La
            r1 = 0
            goto Le
        La:
            int r1 = r1.hashCode()
        Le:
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "IndexedValue(index="
            r0.append(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            T r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
