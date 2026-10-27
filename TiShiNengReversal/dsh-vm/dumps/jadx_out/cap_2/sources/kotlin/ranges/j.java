package kotlin.ranges;

import java.lang.Comparable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class j<T extends java.lang.Comparable<? super T>> implements kotlin.ranges.h<T> {

    @org.jetbrains.annotations.NotNull
    private final T a;

    @org.jetbrains.annotations.NotNull
    private final T b;

    public j(@org.jetbrains.annotations.NotNull T r2, @org.jetbrains.annotations.NotNull T r3) {
            r1 = this;
            java.lang.String r0 = "start"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "endInclusive"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    @Override // kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ boolean contains(@org.jetbrains.annotations.NotNull T r1) {
            r0 = this;
            boolean r1 = kotlin.ranges.h.a.a(r0, r1)
            return r1
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.j
            if (r0 == 0) goto L33
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            kotlin.ranges.j r0 = (kotlin.ranges.j) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L31
        L13:
            java.lang.Comparable r0 = r2.getStart()
            kotlin.ranges.j r3 = (kotlin.ranges.j) r3
            java.lang.Comparable r1 = r3.getStart()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L33
            java.lang.Comparable r0 = r2.getEndInclusive()
            java.lang.Comparable r3 = r3.getEndInclusive()
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
            if (r3 == 0) goto L33
        L31:
            r3 = 1
            return r3
        L33:
            r3 = 0
            return r3
    }

    @Override // kotlin.ranges.h
    @org.jetbrains.annotations.NotNull
    public T getEndInclusive() {
            r1 = this;
            T extends java.lang.Comparable<? super T> r0 = r1.b
            return r0
    }

    @Override // kotlin.ranges.h, kotlin.ranges.s
    @org.jetbrains.annotations.NotNull
    public T getStart() {
            r1 = this;
            T extends java.lang.Comparable<? super T> r0 = r1.a
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            java.lang.Comparable r0 = r2.getStart()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Comparable r1 = r2.getEndInclusive()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ boolean isEmpty() {
            r1 = this;
            boolean r0 = kotlin.ranges.h.a.b(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Comparable r1 = r2.getStart()
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            java.lang.Comparable r1 = r2.getEndInclusive()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
