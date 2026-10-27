package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/RuntimeTypeMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k3 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.k3 a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.b b = null;

    static {
            kotlin.reflect.jvm.internal.k3 r0 = new kotlin.reflect.jvm.internal.k3
            r0.<init>()
            kotlin.reflect.jvm.internal.k3.a = r0
            kotlin.reflect.jvm.internal.impl.name.b$a r0 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.c r1 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r2 = "java.lang.Void"
            r1.<init>(r2)
            kotlin.reflect.jvm.internal.impl.name.b r0 = r0.c(r1)
            kotlin.reflect.jvm.internal.k3.b = r0
            return
    }

    private k3() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType a(java.lang.Class<?> r2) {
            r1 = this;
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L13
            java.lang.String r2 = r2.getSimpleName()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.get(r2)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r2 = r2.getPrimitiveType()
            return r2
        L13:
            r2 = 0
            return r2
    }

    private final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.y r4) {
            r3 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.h.p(r4)
            r1 = 1
            if (r0 != 0) goto L2b
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.h.q(r4)
            if (r0 == 0) goto Le
            goto L2b
        Le:
            kotlin.reflect.jvm.internal.impl.name.f r0 = r4.getName()
            kotlin.reflect.jvm.internal.impl.builtins.jvm.a$a r2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.a.e
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.a()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 == 0) goto L29
            java.util.List r4 = r4.g()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L29
            return r1
        L29:
            r4 = 0
            return r4
        L2b:
            return r1
    }

    private final kotlin.reflect.jvm.internal.r.e d(kotlin.reflect.jvm.internal.impl.descriptors.y r7) {
            r6 = this;
            kotlin.reflect.jvm.internal.r$e r0 = new kotlin.reflect.jvm.internal.r$e
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r1 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b
            java.lang.String r2 = r6.e(r7)
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.String r7 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.c(r7, r5, r5, r3, r4)
            r1.<init>(r2, r7)
            r0.<init>(r1)
            return r0
    }

    private final java.lang.String e(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3) {
            r2 = this;
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.load.java.r0.e(r3)
            if (r0 != 0) goto L44
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.x0
            java.lang.String r1 = "asString(...)"
            if (r0 == 0) goto L20
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.w(r3)
            kotlin.reflect.jvm.internal.impl.name.f r3 = r3.getName()
            java.lang.String r3 = r3.b()
            kotlin.jvm.internal.g0.o(r3, r1)
            java.lang.String r3 = kotlin.reflect.jvm.internal.impl.load.java.h0.b(r3)
            return r3
        L20:
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y0
            if (r0 == 0) goto L38
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.w(r3)
            kotlin.reflect.jvm.internal.impl.name.f r3 = r3.getName()
            java.lang.String r3 = r3.b()
            kotlin.jvm.internal.g0.o(r3, r1)
            java.lang.String r3 = kotlin.reflect.jvm.internal.impl.load.java.h0.e(r3)
            return r3
        L38:
            kotlin.reflect.jvm.internal.impl.name.f r3 = r3.getName()
            java.lang.String r3 = r3.b()
            kotlin.jvm.internal.g0.o(r3, r1)
            return r3
        L44:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.b c(@org.jetbrains.annotations.NotNull java.lang.Class<?> r3) {
            r2 = this;
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L33
            java.lang.Class r3 = r3.getComponentType()
            java.lang.String r0 = "getComponentType(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r3 = r2.a(r3)
            if (r3 == 0) goto L26
            kotlin.reflect.jvm.internal.impl.name.b r0 = new kotlin.reflect.jvm.internal.impl.name.b
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.builtins.o.B
            kotlin.reflect.jvm.internal.impl.name.f r3 = r3.getArrayTypeName()
            r0.<init>(r1, r3)
            return r0
        L26:
            kotlin.reflect.jvm.internal.impl.name.b$a r3 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.i
            kotlin.reflect.jvm.internal.impl.name.c r0 = r0.m()
            kotlin.reflect.jvm.internal.impl.name.b r3 = r3.c(r0)
            return r3
        L33:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r0 == 0) goto L3e
            kotlin.reflect.jvm.internal.impl.name.b r3 = kotlin.reflect.jvm.internal.k3.b
            return r3
        L3e:
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = r2.a(r3)
            if (r0 == 0) goto L50
            kotlin.reflect.jvm.internal.impl.name.b r3 = new kotlin.reflect.jvm.internal.impl.name.b
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.builtins.o.B
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.getTypeName()
            r3.<init>(r1, r0)
            return r3
        L50:
            kotlin.reflect.jvm.internal.impl.name.b r3 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.e(r3)
            boolean r0 = r3.i()
            if (r0 != 0) goto L67
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a
            kotlin.reflect.jvm.internal.impl.name.c r1 = r3.a()
            kotlin.reflect.jvm.internal.impl.name.b r0 = r0.m(r1)
            if (r0 == 0) goto L67
            return r0
        L67:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.t f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r7) {
            r6 = this;
            java.lang.String r0 = "possiblyOverriddenProperty"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r7 = kotlin.reflect.jvm.internal.impl.resolve.i.L(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r7 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r7
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r7.a()
            java.lang.String r7 = "getOriginal(...)"
            kotlin.jvm.internal.g0.o(r1, r7)
            boolean r7 = r1 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0
            r0 = 0
            if (r7 == 0) goto L3d
            r7 = r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 r7 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0) r7
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r2 = r7.b1()
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.d
            java.lang.String r4 = "propertySignature"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.Object r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(r2, r3)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r3
            if (r3 == 0) goto Lc6
            kotlin.reflect.jvm.internal.t$c r0 = new kotlin.reflect.jvm.internal.t$c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4 = r7.a0()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r5 = r7.A()
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L3d:
            boolean r7 = r1 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.f
            if (r7 == 0) goto Lc6
            r7 = r1
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.f r7 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.f) r7
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r2 = r7.getSource()
            boolean r3 = r2 instanceof w3.a
            if (r3 == 0) goto L4f
            w3.a r2 = (w3.a) r2
            goto L50
        L4f:
            r2 = r0
        L50:
            if (r2 == 0) goto L57
            x3.l r2 = r2.c()
            goto L58
        L57:
            r2 = r0
        L58:
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.w
            if (r3 == 0) goto L68
            kotlin.reflect.jvm.internal.t$a r7 = new kotlin.reflect.jvm.internal.t$a
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.w r2 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.w) r2
            java.lang.reflect.Field r0 = r2.P()
            r7.<init>(r0)
            return r7
        L68:
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z
            if (r3 == 0) goto La2
            kotlin.reflect.jvm.internal.t$b r1 = new kotlin.reflect.jvm.internal.t$b
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z r2 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z) r2
            java.lang.reflect.Method r2 = r2.P()
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r7 = r7.getSetter()
            if (r7 == 0) goto L7f
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r7 = r7.getSource()
            goto L80
        L7f:
            r7 = r0
        L80:
            boolean r3 = r7 instanceof w3.a
            if (r3 == 0) goto L87
            w3.a r7 = (w3.a) r7
            goto L88
        L87:
            r7 = r0
        L88:
            if (r7 == 0) goto L8f
            x3.l r7 = r7.c()
            goto L90
        L8f:
            r7 = r0
        L90:
            boolean r3 = r7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z
            if (r3 == 0) goto L97
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z r7 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z) r7
            goto L98
        L97:
            r7 = r0
        L98:
            if (r7 == 0) goto L9e
            java.lang.reflect.Method r0 = r7.P()
        L9e:
            r1.<init>(r2, r0)
            return r1
        La2:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r7 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Incorrect resolution sequence for Java field "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = " (source = "
            r0.append(r1)
            r0.append(r2)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        Lc6:
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r7 = r1.getGetter()
            kotlin.jvm.internal.g0.m(r7)
            kotlin.reflect.jvm.internal.r$e r7 = r6.d(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r1 = r1.getSetter()
            if (r1 == 0) goto Ldb
            kotlin.reflect.jvm.internal.r$e r0 = r6.d(r1)
        Ldb:
            kotlin.reflect.jvm.internal.t$d r1 = new kotlin.reflect.jvm.internal.t$d
            r1.<init>(r7, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.r g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r9) {
            r8 = this;
            java.lang.String r0 = "possiblySubstitutedFunction"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = kotlin.reflect.jvm.internal.impl.resolve.i.L(r9)
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r0
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r0.a()
            java.lang.String r1 = "getOriginal(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c
            r2 = 0
            if (r1 == 0) goto L140
            r1 = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t r1 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t) r1
            kotlin.reflect.jvm.internal.impl.protobuf.n r3 = r1.K()
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function
            if (r4 == 0) goto L3d
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a
            r5 = r3
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r5
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r6 = r1.a0()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r7 = r1.A()
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r4 = r4.e(r5, r6, r7)
            if (r4 == 0) goto L3d
            kotlin.reflect.jvm.internal.r$e r9 = new kotlin.reflect.jvm.internal.r$e
            r9.<init>(r4)
            return r9
        L3d:
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor
            if (r4 == 0) goto L13b
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r3
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r5 = r1.a0()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r1 = r1.A()
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r1 = r4.b(r3, r5, r1)
            if (r1 == 0) goto L13b
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r9.b()
            java.lang.String r3 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.j.b(r0)
            if (r0 == 0) goto L68
            kotlin.reflect.jvm.internal.r$e r9 = new kotlin.reflect.jvm.internal.r$e
            r9.<init>(r1)
            return r9
        L68:
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r9.b()
            kotlin.jvm.internal.g0.o(r0, r3)
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.j.d(r0)
            if (r0 == 0) goto L135
            kotlin.reflect.jvm.internal.impl.descriptors.j r9 = (kotlin.reflect.jvm.internal.impl.descriptors.j) r9
            boolean r0 = r9.m0()
            java.lang.String r3 = ")V"
            java.lang.String r4 = "constructor-impl"
            java.lang.String r5 = "Invalid signature: "
            r6 = 2
            r7 = 0
            if (r0 == 0) goto Lb3
            java.lang.String r9 = r1.e()
            boolean r9 = kotlin.jvm.internal.g0.g(r9, r4)
            if (r9 == 0) goto L9a
            java.lang.String r9 = r1.d()
            boolean r9 = kotlin.text.u.Z1(r9, r3, r7, r6, r2)
            if (r9 == 0) goto L9a
            goto Lfd
        L9a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        Lb3:
            java.lang.String r0 = r1.e()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r4)
            if (r0 == 0) goto L11c
            kotlin.reflect.jvm.internal.impl.descriptors.d r9 = r9.J()
            java.lang.String r0 = "getConstructedClass(...)"
            kotlin.jvm.internal.g0.o(r9, r0)
            java.lang.String r9 = kotlin.reflect.jvm.internal.calls.n.u(r9)
            java.lang.String r0 = r1.d()
            boolean r0 = kotlin.text.u.Z1(r0, r3, r7, r6, r2)
            if (r0 == 0) goto Lf3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r1.d()
            java.lang.String r4 = "V"
            java.lang.String r3 = kotlin.text.u.B4(r3, r4)
            r0.append(r3)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r0 = 1
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b.c(r1, r2, r9, r0, r2)
            goto Lfd
        Lf3:
            java.lang.String r0 = r1.d()
            boolean r9 = kotlin.text.u.Z1(r0, r9, r7, r6, r2)
            if (r9 == 0) goto L103
        Lfd:
            kotlin.reflect.jvm.internal.r$e r9 = new kotlin.reflect.jvm.internal.r$e
            r9.<init>(r1)
            return r9
        L103:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L11c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L135:
            kotlin.reflect.jvm.internal.r$d r9 = new kotlin.reflect.jvm.internal.r$d
            r9.<init>(r1)
            return r9
        L13b:
            kotlin.reflect.jvm.internal.r$e r9 = r8.d(r0)
            return r9
        L140:
            boolean r9 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e
            if (r9 == 0) goto L187
            r9 = r0
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e r9 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) r9
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r9 = r9.getSource()
            boolean r1 = r9 instanceof w3.a
            if (r1 == 0) goto L152
            w3.a r9 = (w3.a) r9
            goto L153
        L152:
            r9 = r2
        L153:
            if (r9 == 0) goto L15a
            x3.l r9 = r9.c()
            goto L15b
        L15a:
            r9 = r2
        L15b:
            boolean r1 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z
            if (r1 == 0) goto L162
            r2 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z r2 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z) r2
        L162:
            if (r2 == 0) goto L170
            java.lang.reflect.Method r9 = r2.P()
            if (r9 == 0) goto L170
            kotlin.reflect.jvm.internal.r$c r0 = new kotlin.reflect.jvm.internal.r$c
            r0.<init>(r9)
            return r0
        L170:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r9 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incorrect resolution sequence for Java method "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L187:
            boolean r9 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.b
            r1 = 41
            java.lang.String r3 = " ("
            if (r9 == 0) goto L1eb
            r9 = r0
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.b r9 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.b) r9
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r9 = r9.getSource()
            boolean r4 = r9 instanceof w3.a
            if (r4 == 0) goto L19d
            w3.a r9 = (w3.a) r9
            goto L19e
        L19d:
            r9 = r2
        L19e:
            if (r9 == 0) goto L1a4
            x3.l r2 = r9.c()
        L1a4:
            boolean r9 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t
            if (r9 == 0) goto L1b4
            kotlin.reflect.jvm.internal.r$b r9 = new kotlin.reflect.jvm.internal.r$b
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t r2 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t) r2
            java.lang.reflect.Constructor r0 = r2.P()
            r9.<init>(r0)
            return r9
        L1b4:
            boolean r9 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q
            if (r9 == 0) goto L1cb
            r9 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q r9 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q) r9
            boolean r4 = r9.k()
            if (r4 == 0) goto L1cb
            kotlin.reflect.jvm.internal.r$a r0 = new kotlin.reflect.jvm.internal.r$a
            java.lang.Class r9 = r9.T()
            r0.<init>(r9)
            return r0
        L1cb:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r9 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Incorrect resolution sequence for Java constructor "
            r4.append(r5)
            r4.append(r0)
            r4.append(r3)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            r9.<init>(r0)
            throw r9
        L1eb:
            boolean r9 = r8.b(r0)
            if (r9 == 0) goto L1f6
            kotlin.reflect.jvm.internal.r$e r9 = r8.d(r0)
            return r9
        L1f6:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r9 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unknown origin of "
            r2.append(r4)
            r2.append(r0)
            r2.append(r3)
            java.lang.Class r0 = r0.getClass()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r9.<init>(r0)
            throw r9
    }
}
