package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectJavaTypeParameter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaTypeParameter.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaTypeParameter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,50:1\n11228#2:51\n11563#2,3:52\n*S KotlinDebug\n*F\n+ 1 ReflectJavaTypeParameter.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaTypeParameter\n*L\n29#1:51\n29#1:52,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f0 extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u implements kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.j, x3.y {

    @org.jetbrains.annotations.NotNull
    private final java.lang.reflect.TypeVariable<?> a;

    public f0(@org.jetbrains.annotations.NotNull java.lang.reflect.TypeVariable<?> r2) {
            r1 = this;
            java.lang.String r0 = "typeVariable"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s> M() {
            r6 = this;
            java.lang.reflect.TypeVariable<?> r0 = r6.a
            java.lang.reflect.Type[] r0 = r0.getBounds()
            java.lang.String r1 = "getBounds(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        L13:
            if (r3 >= r2) goto L22
            r4 = r0[r3]
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s r5 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s
            r5.<init>(r4)
            r1.add(r5)
            int r3 = r3 + 1
            goto L13
        L22:
            java.lang.Object r0 = kotlin.collections.f0.p5(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s r0 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s) r0
            if (r0 == 0) goto L2f
            java.lang.reflect.Type r0 = r0.M()
            goto L30
        L2f:
            r0 = 0
        L30:
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 == 0) goto L3d
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
        L3d:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.j
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g b(kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.reflect.AnnotatedElement r0 = r1.getElement()
            if (r0 == 0) goto L16
            java.lang.annotation.Annotation[] r0 = r0.getDeclaredAnnotations()
            if (r0 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g r2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.k.a(r0, r2)
            return r2
        L16:
            r2 = 0
            return r2
    }

    /* renamed from: b, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ x3.a m23b(kotlin.reflect.jvm.internal.impl.name.c r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g r1 = r0.b(r1)
            return r1
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f0
            if (r0 == 0) goto L12
            java.lang.reflect.TypeVariable<?> r0 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f0) r2
            java.lang.reflect.TypeVariable<?> r2 = r2.a
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public /* bridge */ /* synthetic */ java.util.Collection getAnnotations() {
            r1 = this;
            java.util.List r0 = r1.mo24getAnnotations()
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.j
    @org.jetbrains.annotations.NotNull
    /* renamed from: getAnnotations, reason: collision with other method in class */
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g> mo24getAnnotations() {
            r1 = this;
            java.lang.reflect.AnnotatedElement r0 = r1.getElement()
            if (r0 == 0) goto L14
            java.lang.annotation.Annotation[] r0 = r0.getDeclaredAnnotations()
            if (r0 == 0) goto L14
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.k.b(r0)
            if (r0 != 0) goto L13
            goto L14
        L13:
            return r0
        L14:
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.j
    @org.jetbrains.annotations.Nullable
    public java.lang.reflect.AnnotatedElement getElement() {
            r2 = this;
            java.lang.reflect.TypeVariable<?> r0 = r2.a
            boolean r1 = r0 instanceof java.lang.reflect.AnnotatedElement
            if (r1 == 0) goto L9
            java.lang.reflect.AnnotatedElement r0 = (java.lang.reflect.AnnotatedElement) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
            r2 = this;
            java.lang.reflect.TypeVariable<?> r0 = r2.a
            java.lang.String r0 = r0.getName()
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.h(r0)
            java.lang.String r1 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    public /* bridge */ /* synthetic */ java.util.Collection getUpperBounds() {
            r1 = this;
            java.util.List r0 = r1.M()
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.reflect.TypeVariable<?> r0 = r1.a
            int r0 = r0.hashCode()
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
            java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f0> r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f0.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.reflect.TypeVariable<?> r1 = r2.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
