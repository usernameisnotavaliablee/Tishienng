package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKPropertyImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KPropertyImpl.kt\nkotlin/reflect/jvm/internal/KPropertyImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class u2 {
    public static final /* synthetic */ kotlin.reflect.jvm.internal.calls.g a(kotlin.reflect.jvm.internal.p2.a r0, boolean r1) {
            kotlin.reflect.jvm.internal.calls.g r0 = b(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.calls.g<?> b(kotlin.reflect.jvm.internal.p2.a<?, ?> r7, boolean r8) {
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$a r0 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.a
            kotlin.text.Regex r0 = r0.a()
            kotlin.reflect.jvm.internal.p2 r1 = r7.f0()
            java.lang.String r1 = r1.p0()
            boolean r0 = r0.matches(r1)
            if (r0 == 0) goto L17
            kotlin.reflect.jvm.internal.calls.k r7 = kotlin.reflect.jvm.internal.calls.k.a
            return r7
        L17:
            kotlin.reflect.jvm.internal.k3 r0 = kotlin.reflect.jvm.internal.k3.a
            kotlin.reflect.jvm.internal.p2 r1 = r7.f0()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r1.m0()
            kotlin.reflect.jvm.internal.t r0 = r0.f(r1)
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.t.c
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L169
            kotlin.reflect.jvm.internal.t$c r0 = (kotlin.reflect.jvm.internal.t.c) r0
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r1 = r0.f()
            if (r8 == 0) goto L40
            boolean r4 = r1.hasGetter()
            if (r4 == 0) goto L3e
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r1 = r1.getGetter()
            goto L4a
        L3e:
            r1 = r3
            goto L4a
        L40:
            boolean r4 = r1.hasSetter()
            if (r4 == 0) goto L3e
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r1 = r1.getSetter()
        L4a:
            if (r1 == 0) goto L71
            kotlin.reflect.jvm.internal.p2 r4 = r7.f0()
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r4 = r4.X()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r5 = r0.d()
            int r6 = r1.getName()
            java.lang.String r5 = r5.getString(r6)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r0.d()
            int r1 = r1.getDesc()
            java.lang.String r0 = r0.getString(r1)
            java.lang.reflect.Method r0 = r4.K(r5, r0)
            goto L72
        L71:
            r0 = r3
        L72:
            if (r0 != 0) goto L119
            kotlin.reflect.jvm.internal.p2 r0 = r7.f0()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r0.m0()
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.j.e(r0)
            if (r0 == 0) goto Lee
            kotlin.reflect.jvm.internal.p2 r0 = r7.f0()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r0.m0()
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r0.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = kotlin.reflect.jvm.internal.impl.descriptors.r.d
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto Lee
            kotlin.reflect.jvm.internal.p2 r8 = r7.f0()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r8 = r8.m0()
            kotlin.reflect.jvm.internal.impl.descriptors.k r8 = r8.b()
            java.lang.Class r8 = kotlin.reflect.jvm.internal.calls.n.s(r8)
            if (r8 == 0) goto Lce
            kotlin.reflect.jvm.internal.p2 r0 = r7.f0()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r0.m0()
            java.lang.reflect.Method r8 = kotlin.reflect.jvm.internal.calls.n.m(r8, r0)
            if (r8 == 0) goto Lce
            boolean r0 = r7.c0()
            if (r0 == 0) goto Lc7
            kotlin.reflect.jvm.internal.calls.j$a r0 = new kotlin.reflect.jvm.internal.calls.j$a
            java.lang.Object r1 = f(r7)
            r0.<init>(r8, r1)
            goto L1a2
        Lc7:
            kotlin.reflect.jvm.internal.calls.j$b r0 = new kotlin.reflect.jvm.internal.calls.j$b
            r0.<init>(r8)
            goto L1a2
        Lce:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r8 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Underlying property of inline class "
            r0.append(r1)
            kotlin.reflect.jvm.internal.p2 r7 = r7.f0()
            r0.append(r7)
            java.lang.String r7 = " should have a field"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        Lee:
            kotlin.reflect.jvm.internal.p2 r0 = r7.f0()
            java.lang.reflect.Field r0 = r0.o0()
            if (r0 == 0) goto Lfe
            kotlin.reflect.jvm.internal.calls.h r0 = c(r7, r8, r0)
            goto L1a2
        Lfe:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r8 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No accessors or field is found for property "
            r0.append(r1)
            kotlin.reflect.jvm.internal.p2 r7 = r7.f0()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L119:
            int r8 = r0.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto L13b
            boolean r8 = r7.c0()
            if (r8 == 0) goto L135
            kotlin.reflect.jvm.internal.calls.h$h$a r8 = new kotlin.reflect.jvm.internal.calls.h$h$a
            java.lang.Object r1 = f(r7)
            r8.<init>(r0, r1)
        L132:
            r0 = r8
            goto L1a2
        L135:
            kotlin.reflect.jvm.internal.calls.h$h$e r8 = new kotlin.reflect.jvm.internal.calls.h$h$e
            r8.<init>(r0)
            goto L132
        L13b:
            boolean r8 = d(r7)
            if (r8 == 0) goto L153
            boolean r8 = r7.c0()
            if (r8 == 0) goto L14d
            kotlin.reflect.jvm.internal.calls.h$h$b r8 = new kotlin.reflect.jvm.internal.calls.h$h$b
            r8.<init>(r0)
            goto L132
        L14d:
            kotlin.reflect.jvm.internal.calls.h$h$f r8 = new kotlin.reflect.jvm.internal.calls.h$h$f
            r8.<init>(r0)
            goto L132
        L153:
            boolean r8 = r7.c0()
            if (r8 == 0) goto L163
            kotlin.reflect.jvm.internal.calls.h$h$c r8 = new kotlin.reflect.jvm.internal.calls.h$h$c
            java.lang.Object r1 = f(r7)
            r8.<init>(r0, r2, r1)
            goto L132
        L163:
            kotlin.reflect.jvm.internal.calls.h$h$g r8 = new kotlin.reflect.jvm.internal.calls.h$h$g
            r8.<init>(r0)
            goto L132
        L169:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.t.a
            if (r1 == 0) goto L178
            kotlin.reflect.jvm.internal.t$a r0 = (kotlin.reflect.jvm.internal.t.a) r0
            java.lang.reflect.Field r0 = r0.b()
            kotlin.reflect.jvm.internal.calls.h r0 = c(r7, r8, r0)
            goto L1a2
        L178:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.t.b
            if (r1 == 0) goto L1c7
            if (r8 == 0) goto L185
            kotlin.reflect.jvm.internal.t$b r0 = (kotlin.reflect.jvm.internal.t.b) r0
            java.lang.reflect.Method r8 = r0.b()
            goto L18d
        L185:
            kotlin.reflect.jvm.internal.t$b r0 = (kotlin.reflect.jvm.internal.t.b) r0
            java.lang.reflect.Method r8 = r0.c()
            if (r8 == 0) goto L1ac
        L18d:
            boolean r0 = r7.c0()
            if (r0 == 0) goto L19d
            kotlin.reflect.jvm.internal.calls.h$h$a r0 = new kotlin.reflect.jvm.internal.calls.h$h$a
            java.lang.Object r1 = f(r7)
            r0.<init>(r8, r1)
            goto L1a2
        L19d:
            kotlin.reflect.jvm.internal.calls.h$h$e r0 = new kotlin.reflect.jvm.internal.calls.h$h$e
            r0.<init>(r8)
        L1a2:
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r7 = r7.e0()
            r8 = 2
            kotlin.reflect.jvm.internal.calls.g r7 = kotlin.reflect.jvm.internal.calls.n.j(r0, r7, r2, r8, r3)
            return r7
        L1ac:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r7 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "No source found for setter of Java method property: "
            r8.append(r1)
            java.lang.reflect.Method r0 = r0.b()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L1c7:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.t.d
            if (r1 == 0) goto L245
            if (r8 == 0) goto L1d4
            kotlin.reflect.jvm.internal.t$d r0 = (kotlin.reflect.jvm.internal.t.d) r0
            kotlin.reflect.jvm.internal.r$e r8 = r0.b()
            goto L1dc
        L1d4:
            kotlin.reflect.jvm.internal.t$d r0 = (kotlin.reflect.jvm.internal.t.d) r0
            kotlin.reflect.jvm.internal.r$e r8 = r0.c()
            if (r8 == 0) goto L22a
        L1dc:
            kotlin.reflect.jvm.internal.p2 r0 = r7.f0()
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r0.X()
            java.lang.String r1 = r8.c()
            java.lang.String r8 = r8.b()
            java.lang.reflect.Method r8 = r0.K(r1, r8)
            if (r8 == 0) goto L20f
            int r0 = r8.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            boolean r0 = r7.c0()
            if (r0 == 0) goto L209
            kotlin.reflect.jvm.internal.calls.h$h$a r0 = new kotlin.reflect.jvm.internal.calls.h$h$a
            java.lang.Object r7 = f(r7)
            r0.<init>(r8, r7)
            return r0
        L209:
            kotlin.reflect.jvm.internal.calls.h$h$e r7 = new kotlin.reflect.jvm.internal.calls.h$h$e
            r7.<init>(r8)
            return r7
        L20f:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r8 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No accessor found for property "
            r0.append(r1)
            kotlin.reflect.jvm.internal.p2 r7 = r7.f0()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L22a:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r8 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No setter found for property "
            r0.append(r1)
            kotlin.reflect.jvm.internal.p2 r7 = r7.f0()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L245:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
    }

    private static final kotlin.reflect.jvm.internal.calls.h<java.lang.reflect.Field> c(kotlin.reflect.jvm.internal.p2.a<?, ?> r1, boolean r2, java.lang.reflect.Field r3) {
            kotlin.reflect.jvm.internal.p2 r0 = r1.f0()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r0.m0()
            boolean r0 = g(r0)
            if (r0 != 0) goto L5f
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L19
            goto L5f
        L19:
            boolean r0 = d(r1)
            if (r0 == 0) goto L4d
            if (r2 == 0) goto L33
            boolean r1 = r1.c0()
            if (r1 == 0) goto L2d
            kotlin.reflect.jvm.internal.calls.h$f$b r1 = new kotlin.reflect.jvm.internal.calls.h$f$b
            r1.<init>(r3)
            return r1
        L2d:
            kotlin.reflect.jvm.internal.calls.h$f$d r1 = new kotlin.reflect.jvm.internal.calls.h$f$d
            r1.<init>(r3)
            return r1
        L33:
            boolean r2 = r1.c0()
            if (r2 == 0) goto L43
            kotlin.reflect.jvm.internal.calls.h$g$b r2 = new kotlin.reflect.jvm.internal.calls.h$g$b
            boolean r1 = e(r1)
            r2.<init>(r3, r1)
            return r2
        L43:
            kotlin.reflect.jvm.internal.calls.h$g$d r2 = new kotlin.reflect.jvm.internal.calls.h$g$d
            boolean r1 = e(r1)
            r2.<init>(r3, r1)
            return r2
        L4d:
            if (r2 == 0) goto L55
            kotlin.reflect.jvm.internal.calls.h$f$e r1 = new kotlin.reflect.jvm.internal.calls.h$f$e
            r1.<init>(r3)
            return r1
        L55:
            kotlin.reflect.jvm.internal.calls.h$g$e r2 = new kotlin.reflect.jvm.internal.calls.h$g$e
            boolean r1 = e(r1)
            r2.<init>(r3, r1)
            return r2
        L5f:
            if (r2 == 0) goto L77
            boolean r2 = r1.c0()
            if (r2 == 0) goto L71
            kotlin.reflect.jvm.internal.calls.h$f$a r2 = new kotlin.reflect.jvm.internal.calls.h$f$a
            java.lang.Object r1 = f(r1)
            r2.<init>(r3, r1)
            return r2
        L71:
            kotlin.reflect.jvm.internal.calls.h$f$c r1 = new kotlin.reflect.jvm.internal.calls.h$f$c
            r1.<init>(r3)
            return r1
        L77:
            boolean r2 = r1.c0()
            if (r2 == 0) goto L8b
            kotlin.reflect.jvm.internal.calls.h$g$a r2 = new kotlin.reflect.jvm.internal.calls.h$g$a
            boolean r0 = e(r1)
            java.lang.Object r1 = f(r1)
            r2.<init>(r3, r0, r1)
            return r2
        L8b:
            kotlin.reflect.jvm.internal.calls.h$g$c r2 = new kotlin.reflect.jvm.internal.calls.h$g$c
            boolean r1 = e(r1)
            r2.<init>(r3, r1)
            return r2
    }

    private static final boolean d(kotlin.reflect.jvm.internal.p2.a<?, ?> r1) {
            kotlin.reflect.jvm.internal.p2 r1 = r1.f0()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r1.m0()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r1.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.p3.l()
            boolean r1 = r1.l(r0)
            return r1
    }

    private static final boolean e(kotlin.reflect.jvm.internal.p2.a<?, ?> r0) {
            kotlin.reflect.jvm.internal.p2 r0 = r0.f0()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r0.m0()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.j2.l(r0)
            r0 = r0 ^ 1
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.p2.a<?, ?> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.p2 r1 = r1.f0()
            java.lang.Object r1 = r1.k0()
            return r1
    }

    private static final boolean g(kotlin.reflect.jvm.internal.impl.descriptors.w0 r4) {
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r4.b()
            java.lang.String r1 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.i.x(r0)
            r2 = 0
            if (r1 != 0) goto L11
            return r2
        L11:
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.b()
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.i.C(r0)
            r3 = 1
            if (r1 != 0) goto L24
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.i.t(r0)
            if (r0 == 0) goto L23
            goto L24
        L23:
            return r3
        L24:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0
            if (r0 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 r4 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0) r4
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r4 = r4.b1()
            boolean r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.f(r4)
            if (r4 == 0) goto L35
            return r3
        L35:
            return r2
    }
}
