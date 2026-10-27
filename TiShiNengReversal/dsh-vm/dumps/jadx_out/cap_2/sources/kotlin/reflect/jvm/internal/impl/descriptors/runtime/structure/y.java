package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectJavaMember.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaMember.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaMember\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class y extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u implements kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.j, kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a0, x3.q {
    public y() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean L() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q M() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q
            java.lang.reflect.Member r1 = r3.N()
            java.lang.Class r1 = r1.getDeclaringClass()
            java.lang.String r2 = "getDeclaringClass(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.reflect.Member N();

    @org.jetbrains.annotations.NotNull
    protected final java.util.List<x3.b0> O(@org.jetbrains.annotations.NotNull java.lang.reflect.Type[] r12, @org.jetbrains.annotations.NotNull java.lang.annotation.Annotation[][] r13, boolean r14) {
            r11 = this;
            java.lang.String r0 = "parameterTypes"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "parameterAnnotations"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.length
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c.a
            java.lang.reflect.Member r2 = r11.N()
            java.util.List r1 = r1.b(r2)
            r2 = 0
            if (r1 == 0) goto L24
            int r3 = r1.size()
            int r4 = r12.length
            int r3 = r3 - r4
            goto L25
        L24:
            r3 = 0
        L25:
            int r4 = r12.length
            r5 = 0
        L27:
            if (r5 >= r4) goto L96
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0$a r6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0.a
            r7 = r12[r5]
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r6 = r6.a(r7)
            if (r1 == 0) goto L7d
            int r7 = r5 + r3
            java.lang.Object r7 = kotlin.collections.f0.b3(r1, r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L3e
            goto L7e
        L3e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "No parameter with index "
            r13.append(r14)
            r13.append(r5)
            r14 = 43
            r13.append(r14)
            r13.append(r3)
            java.lang.String r14 = " (name="
            r13.append(r14)
            kotlin.reflect.jvm.internal.impl.name.f r14 = r11.getName()
            r13.append(r14)
            java.lang.String r14 = " type="
            r13.append(r14)
            r13.append(r6)
            java.lang.String r14 = ") in "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L7d:
            r7 = 0
        L7e:
            if (r14 == 0) goto L88
            int r8 = kotlin.collections.n.Oe(r12)
            if (r5 != r8) goto L88
            r8 = 1
            goto L89
        L88:
            r8 = 0
        L89:
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g0 r9 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g0
            r10 = r13[r5]
            r9.<init>(r6, r10, r7, r8)
            r0.add(r9)
            int r5 = r5 + 1
            goto L27
        L96:
            return r0
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
    public /* bridge */ /* synthetic */ x3.a m30b(kotlin.reflect.jvm.internal.impl.name.c r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g r1 = r0.b(r1)
            return r1
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.y
            if (r0 == 0) goto L16
            java.lang.reflect.Member r0 = r1.N()
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.y r2 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.y) r2
            java.lang.reflect.Member r2 = r2.N()
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
            java.util.List r0 = r1.mo24getAnnotations()
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.j
    @org.jetbrains.annotations.NotNull
    /* renamed from: getAnnotations */
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
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.AnnotatedElement getElement() {
            r2 = this;
            java.lang.reflect.Member r0 = r2.N()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement"
            kotlin.jvm.internal.g0.n(r0, r1)
            java.lang.reflect.AnnotatedElement r0 = (java.lang.reflect.AnnotatedElement) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a0
    public int getModifiers() {
            r1 = this;
            java.lang.reflect.Member r0 = r1.N()
            int r0 = r0.getModifiers()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
            r1 = this;
            java.lang.reflect.Member r0 = r1.N()
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L12
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.h(r0)
            if (r0 != 0) goto L11
            goto L12
        L11:
            return r0
        L12:
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.h.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.v1 getVisibility() {
            r2 = this;
            int r0 = r2.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r0)
            if (r1 == 0) goto Ld
            kotlin.reflect.jvm.internal.impl.descriptors.u1$h r0 = kotlin.reflect.jvm.internal.impl.descriptors.u1.h.c
            return r0
        Ld:
            boolean r1 = java.lang.reflect.Modifier.isPrivate(r0)
            if (r1 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.descriptors.u1$e r0 = kotlin.reflect.jvm.internal.impl.descriptors.u1.e.c
            return r0
        L16:
            boolean r1 = java.lang.reflect.Modifier.isProtected(r0)
            if (r1 == 0) goto L28
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L25
            r3.a$c r0 = r3.a.c.c
            return r0
        L25:
            r3.a$b r0 = r3.a.b.c
            return r0
        L28:
            r3.a$a r0 = r3.a.a.c
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.reflect.Member r0 = r1.N()
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isAbstract() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            return r0
    }

    public boolean isFinal() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
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
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.reflect.Member r1 = r2.N()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public /* bridge */ /* synthetic */ x3.g y() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q r0 = r1.M()
            return r0
    }
}
