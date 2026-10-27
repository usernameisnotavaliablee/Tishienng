package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectJavaWildcardType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaWildcardType.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaWildcardType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h0 extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 implements x3.c0 {

    @org.jetbrains.annotations.NotNull
    private final java.lang.reflect.WildcardType b;

    @org.jetbrains.annotations.NotNull
    private final java.util.Collection<x3.a> c;
    private final boolean d;

    public h0(@org.jetbrains.annotations.NotNull java.lang.reflect.WildcardType r2) {
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

    public boolean J() {
            r2 = this;
            java.lang.reflect.WildcardType r0 = r2.O()
            java.lang.reflect.Type[] r0 = r0.getUpperBounds()
            java.lang.String r1 = "getUpperBounds(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Object r0 = kotlin.collections.n.Fc(r0)
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            r0 = r0 ^ 1
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0
    public /* bridge */ /* synthetic */ java.lang.reflect.Type M() {
            r1 = this;
            java.lang.reflect.WildcardType r0 = r1.O()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 N() {
            r4 = this;
            java.lang.reflect.WildcardType r0 = r4.O()
            java.lang.reflect.Type[] r0 = r0.getUpperBounds()
            java.lang.reflect.WildcardType r1 = r4.O()
            java.lang.reflect.Type[] r1 = r1.getLowerBounds()
            int r2 = r0.length
            r3 = 1
            if (r2 > r3) goto L4f
            int r2 = r1.length
            if (r2 > r3) goto L4f
            int r2 = r1.length
            if (r2 != r3) goto L2f
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0.a
            kotlin.jvm.internal.g0.m(r1)
            java.lang.Object r1 = kotlin.collections.n.At(r1)
            java.lang.String r2 = "single(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r0 = r0.a(r1)
            return r0
        L2f:
            int r1 = r0.length
            r2 = 0
            if (r1 != r3) goto L4e
            kotlin.jvm.internal.g0.m(r0)
            java.lang.Object r0 = kotlin.collections.n.At(r0)
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r1 != 0) goto L4e
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0.a
            kotlin.jvm.internal.g0.m(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r0 = r1.a(r0)
            return r0
        L4e:
            return r2
        L4f:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wildcard types with many bounds are not yet supported: "
            r1.append(r2)
            java.lang.reflect.WildcardType r2 = r4.O()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    protected java.lang.reflect.WildcardType O() {
            r1 = this;
            java.lang.reflect.WildcardType r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<x3.a> getAnnotations() {
            r1 = this;
            java.util.Collection<x3.a> r0 = r1.c
            return r0
    }

    public /* bridge */ /* synthetic */ x3.x getBound() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r0 = r1.N()
            return r0
    }

    public boolean s() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }
}
