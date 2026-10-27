package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 implements x3.f {

    @org.jetbrains.annotations.NotNull
    private final java.lang.reflect.Type b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 c;

    @org.jetbrains.annotations.NotNull
    private final java.util.Collection<x3.a> d;
    private final boolean e;

    public m(@org.jetbrains.annotations.NotNull java.lang.reflect.Type r3) {
            r2 = this;
            java.lang.String r0 = "reflectType"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.<init>()
            r2.b = r3
            java.lang.reflect.Type r3 = r2.M()
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L24
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0.a
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            java.lang.String r1 = "getGenericComponentType(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r3 = r0.a(r3)
            goto L3f
        L24:
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L4a
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L4a
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0.a
            java.lang.Class r3 = r3.getComponentType()
            java.lang.String r1 = "getComponentType(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r3 = r0.a(r3)
        L3f:
            r2.c = r3
            java.util.List r3 = kotlin.collections.f0.J()
            java.util.Collection r3 = (java.util.Collection) r3
            r2.d = r3
            return
        L4a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Not an array type ("
            r0.append(r1)
            java.lang.reflect.Type r1 = r2.M()
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r1 = "): "
            r0.append(r1)
            java.lang.reflect.Type r1 = r2.M()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0
    @org.jetbrains.annotations.NotNull
    protected java.lang.reflect.Type M() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 N() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<x3.a> getAnnotations() {
            r1 = this;
            java.util.Collection<x3.a> r0 = r1.d
            return r0
    }

    public /* bridge */ /* synthetic */ x3.x j() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r0 = r1.N()
            return r0
    }

    public boolean s() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }
}
