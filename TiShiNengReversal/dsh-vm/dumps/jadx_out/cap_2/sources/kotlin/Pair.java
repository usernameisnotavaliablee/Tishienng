package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Pair<A, B> implements java.io.Serializable {
    private final A first;
    private final B second;

    public Pair(A r1, B r2) {
            r0 = this;
            r0.<init>()
            r0.first = r1
            r0.second = r2
            return
    }

    public static /* synthetic */ kotlin.Pair copy$default(kotlin.Pair r0, java.lang.Object r1, java.lang.Object r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            A r1 = r0.first
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            B r2 = r0.second
        Lc:
            kotlin.Pair r0 = r0.copy(r1, r2)
            return r0
    }

    public final A component1() {
            r1 = this;
            A r0 = r1.first
            return r0
    }

    public final B component2() {
            r1 = this;
            B r0 = r1.second
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.Pair<A, B> copy(A r2, B r3) {
            r1 = this;
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.Pair
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.Pair r5 = (kotlin.Pair) r5
            A r1 = r4.first
            A r3 = r5.first
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            B r1 = r4.second
            B r5 = r5.second
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final A getFirst() {
            r1 = this;
            A r0 = r1.first
            return r0
    }

    public final B getSecond() {
            r1 = this;
            B r0 = r1.second
            return r0
    }

    public int hashCode() {
            r3 = this;
            A r0 = r3.first
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            B r2 = r3.second
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r1 = r2.hashCode()
        L16:
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            A r1 = r2.first
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            B r1 = r2.second
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
