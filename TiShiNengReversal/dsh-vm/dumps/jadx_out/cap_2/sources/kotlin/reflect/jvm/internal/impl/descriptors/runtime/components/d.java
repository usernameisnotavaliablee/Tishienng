package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d implements kotlin.reflect.jvm.internal.impl.load.java.t {

    @org.jetbrains.annotations.NotNull
    private final java.lang.ClassLoader a;

    public d(@org.jetbrains.annotations.NotNull java.lang.ClassLoader r2) {
            r1 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.t
    @org.jetbrains.annotations.Nullable
    public java.util.Set<java.lang.String> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.t
    @org.jetbrains.annotations.Nullable
    public x3.g b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.t.a r8) {
            r7 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlin.reflect.jvm.internal.impl.name.b r8 = r8.a()
            kotlin.reflect.jvm.internal.impl.name.c r0 = r8.f()
            kotlin.reflect.jvm.internal.impl.name.c r8 = r8.g()
            java.lang.String r1 = r8.a()
            r5 = 4
            r6 = 0
            r2 = 46
            r3 = 36
            r4 = 0
            java.lang.String r8 = kotlin.text.u.w2(r1, r2, r3, r4, r5, r6)
            boolean r1 = r0.c()
            if (r1 == 0) goto L27
            goto L3f
        L27:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.a()
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
        L3f:
            java.lang.ClassLoader r0 = r7.a
            java.lang.Class r8 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.e.a(r0, r8)
            if (r8 == 0) goto L4d
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q
            r0.<init>(r8)
            return r0
        L4d:
            r8 = 0
            return r8
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.t
    @org.jetbrains.annotations.Nullable
    public x3.u c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = "fqName"
            kotlin.jvm.internal.g0.p(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b0 r2 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b0
            r2.<init>(r1)
            return r2
    }
}
