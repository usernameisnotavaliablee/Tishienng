package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class c {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c a = null;

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c.a = r0
            return
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.f a(java.lang.Class<?> r4) {
            r3 = this;
            r0 = 0
        L1:
            boolean r1 = r4.isArray()
            if (r1 == 0) goto L13
            int r0 = r0 + 1
            java.lang.Class r4 = r4.getComponentType()
            java.lang.String r1 = "getComponentType(...)"
            kotlin.jvm.internal.g0.o(r4, r1)
            goto L1
        L13:
            boolean r1 = r4.isPrimitive()
            if (r1 == 0) goto L68
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r1 = kotlin.jvm.internal.g0.g(r4, r1)
            if (r1 == 0) goto L33
            kotlin.reflect.jvm.internal.impl.resolve.constants.f r4 = new kotlin.reflect.jvm.internal.impl.resolve.constants.f
            kotlin.reflect.jvm.internal.impl.name.b$a r1 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.d r2 = kotlin.reflect.jvm.internal.impl.builtins.o.a.f
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.m()
            kotlin.reflect.jvm.internal.impl.name.b r1 = r1.c(r2)
            r4.<init>(r1, r0)
            return r4
        L33:
            java.lang.String r4 = r4.getName()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r4 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.get(r4)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r4 = r4.getPrimitiveType()
            java.lang.String r1 = "getPrimitiveType(...)"
            kotlin.jvm.internal.g0.o(r4, r1)
            if (r0 <= 0) goto L58
            kotlin.reflect.jvm.internal.impl.resolve.constants.f r1 = new kotlin.reflect.jvm.internal.impl.resolve.constants.f
            kotlin.reflect.jvm.internal.impl.name.b$a r2 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.c r4 = r4.getArrayTypeFqName()
            kotlin.reflect.jvm.internal.impl.name.b r4 = r2.c(r4)
            int r0 = r0 + (-1)
            r1.<init>(r4, r0)
            return r1
        L58:
            kotlin.reflect.jvm.internal.impl.resolve.constants.f r1 = new kotlin.reflect.jvm.internal.impl.resolve.constants.f
            kotlin.reflect.jvm.internal.impl.name.b$a r2 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.c r4 = r4.getTypeFqName()
            kotlin.reflect.jvm.internal.impl.name.b r4 = r2.c(r4)
            r1.<init>(r4, r0)
            return r1
        L68:
            kotlin.reflect.jvm.internal.impl.name.b r4 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.e(r4)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c r1 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a
            kotlin.reflect.jvm.internal.impl.name.c r2 = r4.a()
            kotlin.reflect.jvm.internal.impl.name.b r1 = r1.m(r2)
            if (r1 != 0) goto L79
            goto L7a
        L79:
            r4 = r1
        L7a:
            kotlin.reflect.jvm.internal.impl.resolve.constants.f r1 = new kotlin.reflect.jvm.internal.impl.resolve.constants.f
            r1.<init>(r4, r0)
            return r1
    }

    private final void c(java.lang.Class<?> r12, kotlin.reflect.jvm.internal.impl.load.kotlin.x.d r13) {
            r11 = this;
            java.lang.reflect.Constructor[] r12 = r12.getDeclaredConstructors()
            java.util.Iterator r12 = kotlin.jvm.internal.h.a(r12)
        L8:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r12.next()
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.name.h.j
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.m r2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.m.a
            kotlin.jvm.internal.g0.m(r0)
            java.lang.String r2 = r2.a(r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.x$e r1 = r13.a(r1, r2)
            if (r1 != 0) goto L26
            goto L8
        L26:
            java.lang.annotation.Annotation[] r2 = r0.getDeclaredAnnotations()
            java.util.Iterator r2 = kotlin.jvm.internal.h.a(r2)
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r2.next()
            java.lang.annotation.Annotation r3 = (java.lang.annotation.Annotation) r3
            kotlin.jvm.internal.g0.m(r3)
            r11.f(r1, r3)
            goto L2e
        L41:
            java.lang.annotation.Annotation[][] r2 = r0.getParameterAnnotations()
            kotlin.jvm.internal.g0.m(r2)
            int r3 = r2.length
            r4 = 0
            if (r3 != 0) goto L4e
            r3 = 1
            goto L4f
        L4e:
            r3 = 0
        L4f:
            if (r3 != 0) goto L92
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            int r3 = r2.length
            int r0 = r0 - r3
            int r3 = r2.length
        L59:
            if (r4 >= r3) goto L92
            r5 = r2[r4]
            java.util.Iterator r5 = kotlin.jvm.internal.h.a(r5)
        L61:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8f
            java.lang.Object r6 = r5.next()
            java.lang.annotation.Annotation r6 = (java.lang.annotation.Annotation) r6
            kotlin.reflect.d r7 = k3.a.a(r6)
            java.lang.Class r7 = k3.a.e(r7)
            int r8 = r4 + r0
            kotlin.reflect.jvm.internal.impl.name.b r9 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.e(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b r10 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b
            kotlin.jvm.internal.g0.m(r6)
            r10.<init>(r6)
            kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r8 = r1.a(r8, r9, r10)
            if (r8 == 0) goto L61
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c r9 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c.a
            r9.h(r8, r6, r7)
            goto L61
        L8f:
            int r4 = r4 + 1
            goto L59
        L92:
            r1.visitEnd()
            goto L8
        L97:
            return
    }

    private final void d(java.lang.Class<?> r5, kotlin.reflect.jvm.internal.impl.load.kotlin.x.d r6) {
            r4 = this;
            java.lang.reflect.Field[] r5 = r5.getDeclaredFields()
            java.util.Iterator r5 = kotlin.jvm.internal.h.a(r5)
        L8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r5.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.String r1 = r0.getName()
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.name.f.h(r1)
            java.lang.String r2 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.m r2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.m.a
            kotlin.jvm.internal.g0.m(r0)
            java.lang.String r2 = r2.b(r0)
            r3 = 0
            kotlin.reflect.jvm.internal.impl.load.kotlin.x$c r1 = r6.b(r1, r2, r3)
            if (r1 != 0) goto L32
            goto L8
        L32:
            java.lang.annotation.Annotation[] r0 = r0.getDeclaredAnnotations()
            java.util.Iterator r0 = kotlin.jvm.internal.h.a(r0)
        L3a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r0.next()
            java.lang.annotation.Annotation r2 = (java.lang.annotation.Annotation) r2
            kotlin.jvm.internal.g0.m(r2)
            r4.f(r1, r2)
            goto L3a
        L4d:
            r1.visitEnd()
            goto L8
        L51:
            return
    }

    private final void e(java.lang.Class<?> r10, kotlin.reflect.jvm.internal.impl.load.kotlin.x.d r11) {
            r9 = this;
            java.lang.reflect.Method[] r10 = r10.getDeclaredMethods()
            java.util.Iterator r10 = kotlin.jvm.internal.h.a(r10)
        L8:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r10.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.String r1 = r0.getName()
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.name.f.h(r1)
            java.lang.String r2 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.m r2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.m.a
            kotlin.jvm.internal.g0.m(r0)
            java.lang.String r2 = r2.c(r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.x$e r1 = r11.a(r1, r2)
            if (r1 != 0) goto L31
            goto L8
        L31:
            java.lang.annotation.Annotation[] r2 = r0.getDeclaredAnnotations()
            java.util.Iterator r2 = kotlin.jvm.internal.h.a(r2)
        L39:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r2.next()
            java.lang.annotation.Annotation r3 = (java.lang.annotation.Annotation) r3
            kotlin.jvm.internal.g0.m(r3)
            r9.f(r1, r3)
            goto L39
        L4c:
            java.lang.annotation.Annotation[][] r0 = r0.getParameterAnnotations()
            java.lang.String r2 = "getParameterAnnotations(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            java.lang.annotation.Annotation[][] r0 = (java.lang.annotation.Annotation[][]) r0
            int r2 = r0.length
            r3 = 0
        L59:
            if (r3 >= r2) goto L90
            r4 = r0[r3]
            java.util.Iterator r4 = kotlin.jvm.internal.h.a(r4)
        L61:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8d
            java.lang.Object r5 = r4.next()
            java.lang.annotation.Annotation r5 = (java.lang.annotation.Annotation) r5
            kotlin.reflect.d r6 = k3.a.a(r5)
            java.lang.Class r6 = k3.a.e(r6)
            kotlin.reflect.jvm.internal.impl.name.b r7 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.e(r6)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b r8 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b
            kotlin.jvm.internal.g0.m(r5)
            r8.<init>(r5)
            kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r7 = r1.a(r3, r7, r8)
            if (r7 == 0) goto L61
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c r8 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c.a
            r8.h(r7, r5, r6)
            goto L61
        L8d:
            int r3 = r3 + 1
            goto L59
        L90:
            r1.visitEnd()
            goto L8
        L95:
            return
    }

    private final void f(kotlin.reflect.jvm.internal.impl.load.kotlin.x.c r4, java.lang.annotation.Annotation r5) {
            r3 = this;
            kotlin.reflect.d r0 = k3.a.a(r5)
            java.lang.Class r0 = k3.a.e(r0)
            kotlin.reflect.jvm.internal.impl.name.b r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.e(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b r2 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b
            r2.<init>(r5)
            kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r4 = r4.b(r1, r2)
            if (r4 == 0) goto L1c
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c.a
            r1.h(r4, r5, r0)
        L1c:
            return
    }

    private final void g(kotlin.reflect.jvm.internal.impl.load.kotlin.x.a r10, kotlin.reflect.jvm.internal.impl.name.f r11, java.lang.Object r12) {
            r9 = this;
            java.lang.Class r0 = r12.getClass()
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r1)
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.Class<*>"
            if (r2 == 0) goto L1b
            kotlin.jvm.internal.g0.n(r12, r3)
            java.lang.Class r12 = (java.lang.Class) r12
            kotlin.reflect.jvm.internal.impl.resolve.constants.f r12 = r9.a(r12)
            r10.c(r11, r12)
            return
        L1b:
            java.util.Set r2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.i.a()
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L29
            r10.d(r11, r12)
            return
        L29:
            boolean r2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.l(r0)
            java.lang.String r4 = "identifier(...)"
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Enum<*>"
            if (r2 == 0) goto L59
            boolean r1 = r0.isEnum()
            if (r1 == 0) goto L3a
            goto L3e
        L3a:
            java.lang.Class r0 = r0.getEnclosingClass()
        L3e:
            kotlin.jvm.internal.g0.m(r0)
            kotlin.reflect.jvm.internal.impl.name.b r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.e(r0)
            kotlin.jvm.internal.g0.n(r12, r5)
            java.lang.Enum r12 = (java.lang.Enum) r12
            java.lang.String r12 = r12.name()
            kotlin.reflect.jvm.internal.impl.name.f r12 = kotlin.reflect.jvm.internal.impl.name.f.h(r12)
            kotlin.jvm.internal.g0.o(r12, r4)
            r10.a(r11, r0, r12)
            return
        L59:
            java.lang.Class<java.lang.annotation.Annotation> r2 = java.lang.annotation.Annotation.class
            boolean r6 = r2.isAssignableFrom(r0)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Annotation"
            if (r6 == 0) goto L89
            java.lang.Class[] r0 = r0.getInterfaces()
            java.lang.String r1 = "getInterfaces(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Object r0 = kotlin.collections.n.At(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            kotlin.jvm.internal.g0.m(r0)
            kotlin.reflect.jvm.internal.impl.name.b r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.e(r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r10 = r10.b(r11, r1)
            if (r10 != 0) goto L80
            goto L95
        L80:
            kotlin.jvm.internal.g0.n(r12, r7)
            java.lang.annotation.Annotation r12 = (java.lang.annotation.Annotation) r12
            r9.h(r10, r12, r0)
            return
        L89:
            boolean r6 = r0.isArray()
            if (r6 == 0) goto L126
            kotlin.reflect.jvm.internal.impl.load.kotlin.x$b r10 = r10.e(r11)
            if (r10 != 0) goto L96
        L95:
            return
        L96:
            java.lang.Class r11 = r0.getComponentType()
            boolean r0 = r11.isEnum()
            r6 = 0
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<*>"
            if (r0 == 0) goto Lca
            kotlin.jvm.internal.g0.m(r11)
            kotlin.reflect.jvm.internal.impl.name.b r11 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.e(r11)
            kotlin.jvm.internal.g0.n(r12, r8)
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            int r0 = r12.length
        Lb0:
            if (r6 >= r0) goto L122
            r1 = r12[r6]
            kotlin.jvm.internal.g0.n(r1, r5)
            java.lang.Enum r1 = (java.lang.Enum) r1
            java.lang.String r1 = r1.name()
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.name.f.h(r1)
            kotlin.jvm.internal.g0.o(r1, r4)
            r10.c(r11, r1)
            int r6 = r6 + 1
            goto Lb0
        Lca:
            boolean r0 = kotlin.jvm.internal.g0.g(r11, r1)
            if (r0 == 0) goto Le9
            kotlin.jvm.internal.g0.n(r12, r8)
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            int r11 = r12.length
        Ld6:
            if (r6 >= r11) goto L122
            r0 = r12[r6]
            kotlin.jvm.internal.g0.n(r0, r3)
            java.lang.Class r0 = (java.lang.Class) r0
            kotlin.reflect.jvm.internal.impl.resolve.constants.f r0 = r9.a(r0)
            r10.d(r0)
            int r6 = r6 + 1
            goto Ld6
        Le9:
            boolean r0 = r2.isAssignableFrom(r11)
            if (r0 == 0) goto L112
            kotlin.jvm.internal.g0.n(r12, r8)
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            int r0 = r12.length
        Lf5:
            if (r6 >= r0) goto L122
            r1 = r12[r6]
            kotlin.jvm.internal.g0.m(r11)
            kotlin.reflect.jvm.internal.impl.name.b r2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.e(r11)
            kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r2 = r10.b(r2)
            if (r2 != 0) goto L107
            goto L10f
        L107:
            kotlin.jvm.internal.g0.n(r1, r7)
            java.lang.annotation.Annotation r1 = (java.lang.annotation.Annotation) r1
            r9.h(r2, r1, r11)
        L10f:
            int r6 = r6 + 1
            goto Lf5
        L112:
            kotlin.jvm.internal.g0.n(r12, r8)
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            int r11 = r12.length
        L118:
            if (r6 >= r11) goto L122
            r0 = r12[r6]
            r10.a(r0)
            int r6 = r6 + 1
            goto L118
        L122:
            r10.visitEnd()
            return
        L126:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "Unsupported annotation argument value ("
            r11.append(r1)
            r11.append(r0)
            java.lang.String r0 = "): "
            r11.append(r0)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    private final void h(kotlin.reflect.jvm.internal.impl.load.kotlin.x.a r4, java.lang.annotation.Annotation r5, java.lang.Class<?> r6) {
            r3 = this;
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            java.util.Iterator r6 = kotlin.jvm.internal.h.a(r6)
        L8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r6.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r1 = 0
            java.lang.Object r1 = r0.invoke(r5, r1)     // Catch: java.lang.IllegalAccessException -> L2d
            kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.IllegalAccessException -> L2d
            java.lang.String r0 = r0.getName()
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.h(r0)
            java.lang.String r2 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            r3.g(r4, r0, r1)
            goto L8
        L2d:
            goto L8
        L2f:
            r4.visitEnd()
            return
    }

    public final void b(@org.jetbrains.annotations.NotNull java.lang.Class<?> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.x.c r3) {
            r1 = this;
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "visitor"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.annotation.Annotation[] r2 = r2.getDeclaredAnnotations()
            java.util.Iterator r2 = kotlin.jvm.internal.h.a(r2)
        L12:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            java.lang.annotation.Annotation r0 = (java.lang.annotation.Annotation) r0
            kotlin.jvm.internal.g0.m(r0)
            r1.f(r3, r0)
            goto L12
        L25:
            r3.visitEnd()
            return
    }

    public final void i(@org.jetbrains.annotations.NotNull java.lang.Class<?> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.x.d r3) {
            r1 = this;
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "memberVisitor"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.e(r2, r3)
            r1.c(r2, r3)
            r1.d(r2, r3)
            return
    }
}
