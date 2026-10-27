package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\ndescriptorBasedTypeSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 descriptorBasedTypeSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/DescriptorBasedTypeSignatureMappingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.g0<?> r9) {
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "typeMappingConfiguration"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = r9.d(r8)
            if (r0 == 0) goto L11
            return r0
        L11:
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r8.b()
            java.lang.String r1 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.name.f r1 = r8.getName()
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.name.h.b(r1)
            java.lang.String r1 = r1.getIdentifier()
            java.lang.String r2 = "getIdentifier(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r2 == 0) goto L60
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r0
            kotlin.reflect.jvm.internal.impl.name.c r8 = r0.d()
            boolean r9 = r8.c()
            if (r9 == 0) goto L3c
            return r1
        L3c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = r8.a()
            r6 = 4
            r7 = 0
            r3 = 46
            r4 = 47
            r5 = 0
            java.lang.String r8 = kotlin.text.u.w2(r2, r3, r4, r5, r6, r7)
            r9.append(r8)
            r8 = 47
            r9.append(r8)
            r9.append(r1)
            java.lang.String r8 = r9.toString()
            return r8
        L60:
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r2 == 0) goto L68
            r2 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r2
            goto L69
        L68:
            r2 = 0
        L69:
            if (r2 == 0) goto L8a
            java.lang.String r8 = r9.b(r2)
            if (r8 != 0) goto L75
            java.lang.String r8 = a(r2, r9)
        L75:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r8 = 36
            r9.append(r8)
            r9.append(r1)
            java.lang.String r8 = r9.toString()
            return r8
        L8a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected container: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r9.<init>(r8)
            throw r9
    }

    public static /* synthetic */ java.lang.String b(kotlin.reflect.jvm.internal.impl.descriptors.d r0, kotlin.reflect.jvm.internal.impl.load.kotlin.g0 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 2
            if (r2 == 0) goto L6
            kotlin.reflect.jvm.internal.impl.load.kotlin.h0 r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.h0.a
        L6:
            java.lang.String r0 = a(r0, r1)
            return r0
    }

    public static final boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r2) {
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j
            r1 = 1
            if (r0 == 0) goto Lb
            return r1
        Lb:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.getReturnType()
            kotlin.jvm.internal.g0.m(r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.D0(r0)
            if (r0 == 0) goto L2a
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.getReturnType()
            kotlin.jvm.internal.g0.m(r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.j2.l(r0)
            if (r0 != 0) goto L2a
            boolean r2 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.x0
            if (r2 != 0) goto L2a
            return r1
        L2a:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> T d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.t<T> r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.i0 r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.g0<? extends T> r10, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.kotlin.q<T> r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlin.reflect.jvm.internal.impl.types.t0, ? super T, ? super kotlin.reflect.jvm.internal.impl.load.kotlin.i0, kotlin.n1> r12) {
            java.lang.String r0 = "kotlinType"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "typeMappingConfiguration"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "writeGenericType"
            kotlin.jvm.internal.g0.p(r12, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r10.c(r7)
            if (r1 == 0) goto L29
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.Object r7 = d(r1, r2, r3, r4, r5, r6)
            return r7
        L29:
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            boolean r8 = kotlin.reflect.jvm.internal.impl.builtins.i.r(r7)
            if (r8 == 0) goto L3d
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.builtins.p.a(r7)
            java.lang.Object r7 = d(r0, r1, r2, r3, r4, r5)
            return r7
        L3d:
            kotlin.reflect.jvm.internal.impl.types.checker.u r8 = kotlin.reflect.jvm.internal.impl.types.checker.u.a
            java.lang.Object r9 = kotlin.reflect.jvm.internal.impl.load.kotlin.j0.b(r8, r7, r1, r2)
            if (r9 == 0) goto L51
            boolean r8 = r2.d()
            java.lang.Object r8 = kotlin.reflect.jvm.internal.impl.load.kotlin.j0.a(r1, r9, r8)
            r5.invoke(r7, r8, r2)
            return r8
        L51:
            kotlin.reflect.jvm.internal.impl.types.w1 r9 = r7.I0()
            boolean r10 = r9 instanceof kotlin.reflect.jvm.internal.impl.types.s0
            if (r10 == 0) goto L72
            kotlin.reflect.jvm.internal.impl.types.s0 r9 = (kotlin.reflect.jvm.internal.impl.types.s0) r9
            kotlin.reflect.jvm.internal.impl.types.t0 r7 = r9.l()
            if (r7 != 0) goto L69
            java.util.Collection r7 = r9.i()
            kotlin.reflect.jvm.internal.impl.types.t0 r7 = r3.f(r7)
        L69:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.E(r7)
            java.lang.Object r7 = d(r0, r1, r2, r3, r4, r5)
            return r7
        L72:
            kotlin.reflect.jvm.internal.impl.descriptors.f r9 = r9.c()
            if (r9 == 0) goto L1da
            boolean r10 = kotlin.reflect.jvm.internal.impl.types.error.i.m(r9)
            if (r10 == 0) goto L8f
            java.lang.String r8 = "error/NonExistentClass"
            java.lang.Object r8 = r1.f(r8)
            kotlin.reflect.jvm.internal.impl.descriptors.d r9 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r9
            r3.e(r7, r9)
            if (r4 == 0) goto L8e
            r4.c(r8)
        L8e:
            return r8
        L8f:
            boolean r10 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r10 == 0) goto L10f
            boolean r11 = kotlin.reflect.jvm.internal.impl.builtins.j.d0(r7)
            if (r11 == 0) goto L10f
            java.util.List r8 = r7.G0()
            int r8 = r8.size()
            r9 = 1
            if (r8 != r9) goto L107
            java.util.List r7 = r7.G0()
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            kotlin.reflect.jvm.internal.impl.types.c2 r7 = (kotlin.reflect.jvm.internal.impl.types.c2) r7
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r7.getType()
            java.lang.String r8 = "getType(...)"
            kotlin.jvm.internal.g0.o(r0, r8)
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = r7.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r10 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r8 != r10) goto Ld2
            java.lang.String r7 = "java/lang/Object"
            java.lang.Object r7 = r1.f(r7)
            if (r4 == 0) goto Led
            r4.b()
            r4.c(r7)
            r4.a()
            goto Led
        Ld2:
            if (r4 == 0) goto Ld7
            r4.b()
        Ld7:
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = r7.c()
            java.lang.String r8 = "getProjectionKind(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            kotlin.reflect.jvm.internal.impl.load.kotlin.i0 r2 = r2.f(r7, r9)
            java.lang.Object r7 = d(r0, r1, r2, r3, r4, r5)
            if (r4 == 0) goto Led
            r4.a()
        Led:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 91
            r8.append(r9)
            java.lang.String r7 = r1.e(r7)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.Object r7 = r1.a(r7)
            return r7
        L107:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "arrays must have one type argument"
            r7.<init>(r8)
            throw r7
        L10f:
            if (r10 == 0) goto L17b
            boolean r10 = kotlin.reflect.jvm.internal.impl.resolve.j.b(r9)
            if (r10 == 0) goto L12f
            boolean r10 = r2.c()
            if (r10 != 0) goto L12f
            d4.g r8 = kotlin.reflect.jvm.internal.impl.types.j0.a(r8, r7)
            r0 = r8
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            if (r0 == 0) goto L12f
            kotlin.reflect.jvm.internal.impl.load.kotlin.i0 r2 = r2.g()
            java.lang.Object r7 = d(r0, r1, r2, r3, r4, r5)
            return r7
        L12f:
            boolean r8 = r2.e()
            if (r8 == 0) goto L143
            r8 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.d r8 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r8
            boolean r8 = kotlin.reflect.jvm.internal.impl.builtins.j.m0(r8)
            if (r8 == 0) goto L143
            java.lang.Object r8 = r1.b()
            goto L177
        L143:
            kotlin.reflect.jvm.internal.impl.descriptors.d r9 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r9
            kotlin.reflect.jvm.internal.impl.descriptors.d r8 = r9.a()
            java.lang.String r10 = "getOriginal(...)"
            kotlin.jvm.internal.g0.o(r8, r10)
            java.lang.Object r8 = r3.a(r8)
            if (r8 != 0) goto L177
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r8 = r9.h()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r11 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY
            if (r8 != r11) goto L168
            kotlin.reflect.jvm.internal.impl.descriptors.k r8 = r9.b()
            java.lang.String r9 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.g0.n(r8, r9)
            r9 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.d r9 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r9
        L168:
            kotlin.reflect.jvm.internal.impl.descriptors.d r8 = r9.a()
            kotlin.jvm.internal.g0.o(r8, r10)
            java.lang.String r8 = a(r8, r3)
            java.lang.Object r8 = r1.f(r8)
        L177:
            r5.invoke(r7, r8, r2)
            return r8
        L17b:
            r8 = r4
            boolean r10 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r10 == 0) goto L1aa
            r10 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r10 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r10
            kotlin.reflect.jvm.internal.impl.types.t0 r10 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.p(r10)
            boolean r7 = r7.J0()
            if (r7 == 0) goto L191
            kotlin.reflect.jvm.internal.impl.types.t0 r10 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.C(r10)
        L191:
            r0 = r10
            kotlin.jvm.functions.Function3 r5 = kotlin.reflect.jvm.internal.impl.utils.i.l()
            r4 = 0
            java.lang.Object r7 = d(r0, r1, r2, r3, r4, r5)
            if (r8 == 0) goto L1a9
            kotlin.reflect.jvm.internal.impl.name.f r9 = r9.getName()
            java.lang.String r10 = "getName(...)"
            kotlin.jvm.internal.g0.o(r9, r10)
            r8.e(r9, r7)
        L1a9:
            return r7
        L1aa:
            boolean r10 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
            if (r10 == 0) goto L1c3
            boolean r10 = r2.b()
            if (r10 == 0) goto L1c3
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r9 = (kotlin.reflect.jvm.internal.impl.descriptors.i1) r9
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r9.Z()
            r4 = r8
            java.lang.Object r7 = d(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1c0
            return r7
        L1c0:
            r0 = move-exception
            r7 = r0
            throw r7
        L1c3:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unknown type "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.<init>(r7)
            throw r8
        L1da:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "no descriptor for type constructor of "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.<init>(r7)
            throw r8
    }

    public static /* synthetic */ java.lang.Object e(kotlin.reflect.jvm.internal.impl.types.t0 r6, kotlin.reflect.jvm.internal.impl.load.kotlin.t r7, kotlin.reflect.jvm.internal.impl.load.kotlin.i0 r8, kotlin.reflect.jvm.internal.impl.load.kotlin.g0 r9, kotlin.reflect.jvm.internal.impl.load.kotlin.q r10, kotlin.jvm.functions.Function3 r11, int r12, java.lang.Object r13) {
            r12 = r12 & 32
            if (r12 == 0) goto L8
            kotlin.jvm.functions.Function3 r11 = kotlin.reflect.jvm.internal.impl.utils.i.l()
        L8:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r6 = d(r0, r1, r2, r3, r4, r5)
            return r6
    }
}
