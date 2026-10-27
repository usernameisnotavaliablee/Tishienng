package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class q0 {
    public static final void a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.m0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.l0> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "packageFragments"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.r0
            if (r0 == 0) goto L19
            kotlin.reflect.jvm.internal.impl.descriptors.r0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.r0) r1
            r1.b(r2, r3)
            return
        L19:
            java.util.List r1 = r1.a(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            r3.addAll(r1)
            return
    }

    public static final boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.m0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.r0
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.r0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.r0) r1
            boolean r1 = r1.c(r2)
            return r1
        L15:
            java.util.List r1 = c(r1, r2)
            boolean r1 = r1.isEmpty()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.l0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.m0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            a(r1, r2, r0)
            return r0
    }
}
