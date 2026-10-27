package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c0 extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 implements x3.v {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<?> b;

    @org.jetbrains.annotations.NotNull
    private final java.util.Collection<x3.a> c;
    private final boolean d;

    public c0(@org.jetbrains.annotations.NotNull java.lang.Class<?> r2) {
            r1 = this;
            java.lang.String r0 = "reflectType"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.b = r2
            java.util.List r2 = kotlin.collections.f0.J()
            java.util.Collection r2 = (java.util.Collection) r2
            r1.c = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0
    public /* bridge */ /* synthetic */ java.lang.reflect.Type M() {
            r1 = this;
            java.lang.Class r0 = r1.N()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected java.lang.Class<?> N() {
            r1 = this;
            java.lang.Class<?> r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<x3.a> getAnnotations() {
            r1 = this;
            java.util.Collection<x3.a> r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getType() {
            r2 = this;
            java.lang.Class r0 = r2.N()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto Le
            r0 = 0
            return r0
        Le:
            java.lang.Class r0 = r2.N()
            java.lang.String r0 = r0.getName()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r0 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.get(r0)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = r0.getPrimitiveType()
            return r0
    }

    public boolean s() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }
}
