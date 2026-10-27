package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c {
    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.e0 a(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0, kotlin.reflect.jvm.internal.impl.descriptors.e r1) {
            kotlin.reflect.jvm.internal.impl.load.java.e0 r0 = g(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.e0 b(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1) {
            kotlin.reflect.jvm.internal.impl.load.java.e0 r0 = l(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.k c(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2, kotlin.reflect.jvm.internal.impl.descriptors.k r3, x3.z r4, int r5, kotlin.s<kotlin.reflect.jvm.internal.impl.load.java.e0> r6) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r2.a()
            if (r4 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.load.java.lazy.m r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.m
            r1.<init>(r2, r3, r4, r5)
            goto L10
        Lc:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.p r1 = r2.f()
        L10:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.k
            r2.<init>(r0, r1, r6)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.k d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.p r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "typeParameterResolver"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.k
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r1 = r2.a()
            kotlin.s r2 = r2.c()
            r0.<init>(r1, r3, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.k e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e r3, @org.jetbrains.annotations.Nullable x3.z r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.LazyThreadSafetyMode r0 = kotlin.LazyThreadSafetyMode.NONE
            kotlin.reflect.jvm.internal.impl.load.java.lazy.a r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.a
            r1.<init>(r2, r3)
            kotlin.s r0 = kotlin.t.b(r0, r1)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = c(r2, r3, r4, r5, r0)
            return r2
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.k f(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0, kotlin.reflect.jvm.internal.impl.descriptors.e r1, x3.z r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            r3 = 0
        La:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = e(r0, r1, r2, r3)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.e0 g(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0, kotlin.reflect.jvm.internal.impl.descriptors.e r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r1.getAnnotations()
            kotlin.reflect.jvm.internal.impl.load.java.e0 r0 = j(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.k h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2, @org.jetbrains.annotations.NotNull x3.z r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "typeParameterOwner"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.s r0 = r1.c()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = c(r1, r2, r3, r4, r0)
            return r1
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.k i(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0, kotlin.reflect.jvm.internal.impl.descriptors.k r1, x3.z r2, int r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = h(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.load.java.e0 j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "additionalAnnotations"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r1.a()
            kotlin.reflect.jvm.internal.impl.load.java.c r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.load.java.e0 r1 = r1.b()
            kotlin.reflect.jvm.internal.impl.load.java.e0 r1 = r0.d(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.k k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "additionalAnnotations"
            kotlin.jvm.internal.g0.p(r6, r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L11
            return r5
        L11:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.k
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r1 = r5.a()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.p r2 = r5.f()
            kotlin.LazyThreadSafetyMode r3 = kotlin.LazyThreadSafetyMode.NONE
            kotlin.reflect.jvm.internal.impl.load.java.lazy.b r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.b
            r4.<init>(r5, r6)
            kotlin.s r5 = kotlin.t.b(r3, r4)
            r0.<init>(r1, r2, r5)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.e0 l(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1) {
            kotlin.reflect.jvm.internal.impl.load.java.e0 r0 = j(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.k m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.d r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "components"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.k
            kotlin.reflect.jvm.internal.impl.load.java.lazy.p r1 = r2.f()
            kotlin.s r2 = r2.c()
            r0.<init>(r3, r1, r2)
            return r0
    }
}
