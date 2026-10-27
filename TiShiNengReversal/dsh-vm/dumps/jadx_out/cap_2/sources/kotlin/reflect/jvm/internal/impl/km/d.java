package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String a;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.km.e> b;

    public d(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends kotlin.reflect.jvm.internal.impl.km.e> r3) {
            r1 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    static /* synthetic */ java.lang.CharSequence a(kotlin.Pair r0) {
            java.lang.CharSequence r0 = d(r0)
            return r0
    }

    private static final java.lang.CharSequence d(kotlin.Pair r2) {
            java.lang.String r0 = "<destruct>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r0 = r2.component1()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r2.component2()
            kotlin.reflect.jvm.internal.impl.km.e r2 = (kotlin.reflect.jvm.internal.impl.km.e) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.km.e> b() {
            r1 = this;
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.km.e> r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            if (r2 == r3) goto L1f
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.d
            if (r0 == 0) goto L1d
            java.lang.String r0 = r2.a
            kotlin.reflect.jvm.internal.impl.km.d r3 = (kotlin.reflect.jvm.internal.impl.km.d) r3
            java.lang.String r1 = r3.a
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L1d
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.km.e> r0 = r2.b
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.km.e> r3 = r3.b
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
            if (r3 == 0) goto L1d
            goto L1f
        L1d:
            r3 = 0
            return r3
        L1f:
            r3 = 1
            return r3
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.km.e> r1 = r2.b
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r10 = this;
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.km.e> r0 = r10.b
            java.util.List r0 = kotlin.collections.i1.J1(r0)
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.reflect.jvm.internal.impl.km.c r7 = kotlin.reflect.jvm.internal.impl.km.c.a
            r8 = 31
            r9 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r0 = kotlin.collections.f0.r3(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 64
            r1.append(r2)
            java.lang.String r2 = r10.a
            r1.append(r2)
            r2 = 40
            r1.append(r2)
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
