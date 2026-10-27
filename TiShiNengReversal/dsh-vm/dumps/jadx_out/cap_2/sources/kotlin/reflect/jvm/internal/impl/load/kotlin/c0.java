package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nmethodSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 methodSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/MethodSignatureMappingKt\n+ 2 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n*L\n1#1,200:1\n13#2:201\n*S KotlinDebug\n*F\n+ 1 methodSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/MethodSignatureMappingKt\n*L\n81#1:201\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c0 {
    private static final void a(java.lang.StringBuilder r0, kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.s r1 = g(r1)
            r0.append(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r3, boolean r4, boolean r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r5 == 0) goto L23
            boolean r5 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j
            if (r5 == 0) goto L13
            java.lang.String r5 = "<init>"
            goto L20
        L13:
            kotlin.reflect.jvm.internal.impl.name.f r5 = r3.getName()
            java.lang.String r5 = r5.b()
            java.lang.String r1 = "asString(...)"
            kotlin.jvm.internal.g0.o(r5, r1)
        L20:
            r0.append(r5)
        L23:
            java.lang.String r5 = "("
            r0.append(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r5 = r3.f0()
            java.lang.String r1 = "getType(...)"
            if (r5 == 0) goto L3a
            kotlin.reflect.jvm.internal.impl.types.t0 r5 = r5.getType()
            kotlin.jvm.internal.g0.o(r5, r1)
            a(r0, r5)
        L3a:
            java.util.List r5 = r3.g()
            java.util.Iterator r5 = r5.iterator()
        L42:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r2
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            kotlin.jvm.internal.g0.o(r2, r1)
            a(r0, r2)
            goto L42
        L59:
            java.lang.String r5 = ")"
            r0.append(r5)
            if (r4 == 0) goto L76
            boolean r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.j.c(r3)
            if (r4 == 0) goto L6c
            java.lang.String r3 = "V"
            r0.append(r3)
            goto L76
        L6c:
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.getReturnType()
            kotlin.jvm.internal.g0.m(r3)
            a(r0, r3)
        L76:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static /* synthetic */ java.lang.String c(kotlin.reflect.jvm.internal.impl.descriptors.y r1, boolean r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            r0 = 1
            if (r5 == 0) goto L6
            r2 = 1
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lb
            r3 = 1
        Lb:
            java.lang.String r1 = b(r1, r2, r3)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.f0 r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.f0.a
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.i.E(r5)
            r2 = 0
            if (r1 == 0) goto Lf
            return r2
        Lf:
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r5.b()
            boolean r3 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r3 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            goto L1b
        L1a:
            r1 = r2
        L1b:
            if (r1 != 0) goto L1e
            return r2
        L1e:
            kotlin.reflect.jvm.internal.impl.name.f r3 = r1.getName()
            boolean r3 = r3.i()
            if (r3 == 0) goto L29
            return r2
        L29:
            kotlin.reflect.jvm.internal.impl.descriptors.a r5 = r5.a()
            boolean r3 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d1
            if (r3 == 0) goto L34
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r5
            goto L35
        L34:
            r5 = r2
        L35:
            if (r5 != 0) goto L38
            return r2
        L38:
            r3 = 3
            r4 = 0
            java.lang.String r5 = c(r5, r4, r4, r3, r2)
            java.lang.String r5 = kotlin.reflect.jvm.internal.impl.load.kotlin.b0.a(r0, r1, r5)
            return r5
    }

    public static final boolean e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r7) {
            java.lang.String r0 = "f"
            kotlin.jvm.internal.g0.p(r7, r0)
            boolean r0 = r7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            r0 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r0
            kotlin.reflect.jvm.internal.impl.name.f r2 = r0.getName()
            java.lang.String r2 = r2.b()
            java.lang.String r3 = "remove"
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto Lb6
            java.util.List r2 = r0.g()
            int r2 = r2.size()
            r3 = 1
            if (r2 != r3) goto Lb6
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r7 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r7
            boolean r7 = kotlin.reflect.jvm.internal.impl.load.java.r0.n(r7)
            if (r7 == 0) goto L33
            goto Lb6
        L33:
            kotlin.reflect.jvm.internal.impl.descriptors.y r7 = r0.a()
            java.util.List r7 = r7.g()
            java.lang.String r2 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r7, r2)
            java.lang.Object r7 = kotlin.collections.f0.m5(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r7 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r7
            kotlin.reflect.jvm.internal.impl.types.t0 r7 = r7.getType()
            java.lang.String r4 = "getType(...)"
            kotlin.jvm.internal.g0.o(r7, r4)
            kotlin.reflect.jvm.internal.impl.load.kotlin.s r7 = g(r7)
            boolean r5 = r7 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.s.d
            r6 = 0
            if (r5 == 0) goto L5b
            kotlin.reflect.jvm.internal.impl.load.kotlin.s$d r7 = (kotlin.reflect.jvm.internal.impl.load.kotlin.s.d) r7
            goto L5c
        L5b:
            r7 = r6
        L5c:
            if (r7 == 0) goto L62
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r6 = r7.i()
        L62:
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r7 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT
            if (r6 == r7) goto L67
            return r1
        L67:
            kotlin.reflect.jvm.internal.impl.descriptors.y r7 = kotlin.reflect.jvm.internal.impl.load.java.h.l(r0)
            if (r7 != 0) goto L6e
            return r1
        L6e:
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r7.a()
            java.util.List r0 = r0.g()
            kotlin.jvm.internal.g0.o(r0, r2)
            java.lang.Object r0 = kotlin.collections.f0.m5(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r0
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            kotlin.jvm.internal.g0.o(r0, r4)
            kotlin.reflect.jvm.internal.impl.load.kotlin.s r0 = g(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.k r7 = r7.b()
            java.lang.String r2 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r7, r2)
            kotlin.reflect.jvm.internal.impl.name.d r7 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.p(r7)
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.builtins.o.a.f0
            kotlin.reflect.jvm.internal.impl.name.d r2 = r2.i()
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r2)
            if (r7 == 0) goto Lb6
            boolean r7 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.s.c
            if (r7 == 0) goto Lb6
            kotlin.reflect.jvm.internal.impl.load.kotlin.s$c r0 = (kotlin.reflect.jvm.internal.impl.load.kotlin.s.c) r0
            java.lang.String r7 = r0.i()
            java.lang.String r0 = "java/lang/Object"
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r0)
            if (r7 == 0) goto Lb6
            return r3
        Lb6:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.o(r2)
            kotlin.reflect.jvm.internal.impl.name.d r1 = r1.i()
            kotlin.reflect.jvm.internal.impl.name.b r0 = r0.n(r1)
            if (r0 == 0) goto L1f
            java.lang.String r2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.h(r0)
            java.lang.String r0 = "internalNameByClassId(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
        L1f:
            r0 = 2
            r1 = 0
            java.lang.String r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.j.b(r2, r1, r0, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.s g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.u r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.u.a
            kotlin.reflect.jvm.internal.impl.load.kotlin.i0 r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.i0.o
            kotlin.reflect.jvm.internal.impl.load.kotlin.h0 r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.h0.a
            r7 = 32
            r8 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            java.lang.Object r9 = kotlin.reflect.jvm.internal.impl.load.kotlin.j.e(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.load.kotlin.s r9 = (kotlin.reflect.jvm.internal.impl.load.kotlin.s) r9
            return r9
    }
}
