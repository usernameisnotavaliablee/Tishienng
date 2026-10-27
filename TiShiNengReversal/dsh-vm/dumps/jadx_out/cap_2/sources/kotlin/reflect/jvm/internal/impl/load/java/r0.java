package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "SpecialBuiltinMembers")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nspecialBuiltinMembers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 specialBuiltinMembers.kt\norg/jetbrains/kotlin/load/java/SpecialBuiltinMembers\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class r0 {
    static /* synthetic */ boolean a(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0) {
            boolean r0 = h(r0)
            return r0
    }

    static /* synthetic */ boolean b(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0) {
            boolean r0 = i(r0)
            return r0
    }

    static /* synthetic */ boolean c(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0) {
            boolean r0 = k(r0)
            return r0
    }

    public static final boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = g(r1)
            if (r1 == 0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
            java.lang.String r0 = "callableMemberDescriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = f(r2)
            r0 = 0
            if (r2 == 0) goto L31
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.w(r2)
            if (r2 != 0) goto L13
            goto L31
        L13:
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w0
            if (r1 == 0) goto L1e
            kotlin.reflect.jvm.internal.impl.load.java.l r0 = kotlin.reflect.jvm.internal.impl.load.java.l.a
            java.lang.String r2 = r0.b(r2)
            return r2
        L1e:
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d1
            if (r1 == 0) goto L31
            kotlin.reflect.jvm.internal.impl.load.java.e r1 = kotlin.reflect.jvm.internal.impl.load.java.e.o
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r2
            kotlin.reflect.jvm.internal.impl.name.f r2 = r1.j(r2)
            if (r2 == 0) goto L31
            java.lang.String r2 = r2.b()
            return r2
        L31:
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor f(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.h0(r1)
            if (r0 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = g(r1)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final <T extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> T g(@org.jetbrains.annotations.NotNull T r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a
            java.util.Set r0 = r0.g()
            kotlin.reflect.jvm.internal.impl.name.f r1 = r4.getName()
            boolean r0 = r0.contains(r1)
            r1 = 0
            if (r0 != 0) goto L2b
            kotlin.reflect.jvm.internal.impl.load.java.i r0 = kotlin.reflect.jvm.internal.impl.load.java.i.a
            java.util.Set r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.w(r4)
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L2b
            return r1
        L2b:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L42
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.v0
            if (r0 == 0) goto L36
            goto L42
        L36:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d1
            if (r0 == 0) goto L41
            kotlin.reflect.jvm.internal.impl.load.java.p0 r0 = kotlin.reflect.jvm.internal.impl.load.java.p0.a
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.i(r4, r3, r0, r2, r1)
            return r4
        L41:
            return r1
        L42:
            kotlin.reflect.jvm.internal.impl.load.java.o0 r0 = kotlin.reflect.jvm.internal.impl.load.java.o0.a
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.i(r4, r3, r0, r2, r1)
            return r4
    }

    private static final boolean h(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.load.java.l r0 = kotlin.reflect.jvm.internal.impl.load.java.l.a
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.w(r1)
            boolean r1 = r0.d(r1)
            return r1
    }

    private static final boolean i(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.load.java.e r0 = kotlin.reflect.jvm.internal.impl.load.java.e.o
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r1
            boolean r1 = r0.k(r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final <T extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> T j(@org.jetbrains.annotations.NotNull T r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = g(r4)
            if (r0 == 0) goto Lc
            return r0
        Lc:
            kotlin.reflect.jvm.internal.impl.load.java.h r0 = kotlin.reflect.jvm.internal.impl.load.java.h.o
            kotlin.reflect.jvm.internal.impl.name.f r1 = r4.getName()
            java.lang.String r2 = "getName(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            boolean r0 = r0.n(r1)
            r1 = 0
            if (r0 != 0) goto L1f
            return r1
        L1f:
            kotlin.reflect.jvm.internal.impl.load.java.q0 r0 = kotlin.reflect.jvm.internal.impl.load.java.q0.a
            r2 = 1
            r3 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.i(r4, r3, r0, r2, r1)
            return r4
    }

    private static final boolean k(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.h0(r1)
            if (r0 == 0) goto L13
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r1 = kotlin.reflect.jvm.internal.impl.load.java.h.o(r1)
            if (r1 == 0) goto L13
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    public static final boolean l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "specialCallableDescriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r2.b()
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.g0.n(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r2
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.s()
            java.lang.String r0 = "getDefaultType(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = kotlin.reflect.jvm.internal.impl.resolve.i.s(r1)
        L22:
            if (r1 == 0) goto L3e
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c
            if (r0 != 0) goto L39
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.s()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = kotlin.reflect.jvm.internal.impl.types.checker.y.b(r0, r2)
            if (r0 == 0) goto L39
            boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.j.h0(r1)
            r1 = r1 ^ 1
            return r1
        L39:
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = kotlin.reflect.jvm.internal.impl.resolve.i.s(r1)
            goto L22
        L3e:
            r1 = 0
            return r1
    }

    public static final boolean m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.w(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r1.b()
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c
            return r1
    }

    public static final boolean n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = m(r1)
            if (r0 != 0) goto L14
            boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.j.h0(r1)
            if (r1 == 0) goto L12
            goto L14
        L12:
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }
}
