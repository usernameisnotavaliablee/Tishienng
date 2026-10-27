package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectJavaClassifierType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaClassifierType.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClassifierType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n1#2:65\n1563#3:66\n1634#3,3:67\n*S KotlinDebug\n*F\n+ 1 ReflectJavaClassifierType.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClassifierType\n*L\n50#1:66\n50#1:67,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class s extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 implements x3.j {

    @org.jetbrains.annotations.NotNull
    private final java.lang.reflect.Type b;

    @org.jetbrains.annotations.NotNull
    private final x3.i c;

    public s(@org.jetbrains.annotations.NotNull java.lang.reflect.Type r4) {
            r3 = this;
            java.lang.String r0 = "reflectType"
            kotlin.jvm.internal.g0.p(r4, r0)
            r3.<init>()
            r3.b = r4
            java.lang.reflect.Type r4 = r3.M()
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q
            java.lang.Class r4 = (java.lang.Class) r4
            r0.<init>(r4)
            goto L3c
        L1a:
            boolean r0 = r4 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L26
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f0 r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f0
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            r0.<init>(r4)
            goto L3c
        L26:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L3f
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r4 = r4.getRawType()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<*>"
            kotlin.jvm.internal.g0.n(r4, r1)
            java.lang.Class r4 = (java.lang.Class) r4
            r0.<init>(r4)
        L3c:
            r3.c = r0
            return
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not a classifier type ("
            r1.append(r2)
            java.lang.Class r2 = r4.getClass()
            r1.append(r2)
            java.lang.String r2 = "): "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public boolean C() {
            r3 = this;
            java.lang.reflect.Type r0 = r3.M()
            boolean r1 = r0 instanceof java.lang.Class
            r2 = 0
            if (r1 == 0) goto L1e
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            java.lang.String r1 = "getTypeParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r0 = r0.length
            r1 = 1
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L1e
            return r1
        L1e:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Type M() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.b
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0
    @org.jetbrains.annotations.Nullable
    public x3.a b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<x3.a> getAnnotations() {
            r1 = this;
            java.util.List r0 = kotlin.collections.f0.J()
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public x3.i n() {
            r1 = this;
            x3.i r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<x3.x> p() {
            r4 = this;
            java.lang.reflect.Type r0 = r4.M()
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.h(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0.a
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r3 = r1.a(r3)
            r2.add(r3)
            goto L1b
        L2f:
            return r2
    }

    public boolean s() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String t() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.M()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String v() {
            r3 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type not found: "
            r1.append(r2)
            java.lang.reflect.Type r2 = r3.M()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
