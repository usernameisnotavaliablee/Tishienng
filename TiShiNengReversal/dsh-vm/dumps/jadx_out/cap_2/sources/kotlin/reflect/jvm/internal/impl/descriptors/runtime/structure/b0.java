package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b0 extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u implements x3.u {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.c a;

    public b0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<x3.g> G(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r2) {
            r1 = this;
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r2 = kotlin.collections.f0.J()
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public x3.a b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.c d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.a
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b0
            if (r0 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.d()
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b0) r2
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.d()
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public /* bridge */ /* synthetic */ java.util.Collection getAnnotations() {
            r1 = this;
            java.util.List r0 = r1.m22getAnnotations()
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: getAnnotations, reason: collision with other method in class */
    public java.util.List<x3.a> m22getAnnotations() {
            r1 = this;
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
    }

    public int hashCode() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.d()
            int r0 = r0.hashCode()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<x3.u> o() {
            r1 = this;
            java.util.List r0 = kotlin.collections.f0.J()
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    public boolean s() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b0> r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b0.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.c r1 = r2.d()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
