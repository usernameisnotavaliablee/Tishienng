package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nspecialBuiltinMembers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 specialBuiltinMembers.kt\norg/jetbrains/kotlin/load/java/BuiltinMethodsWithSpecialGenericSignature\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h extends kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.h o = null;

    static {
            kotlin.reflect.jvm.internal.impl.load.java.h r0 = new kotlin.reflect.jvm.internal.impl.load.java.h
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.h.o = r0
            return
    }

    private h() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ boolean i(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0) {
            boolean r0 = m(r0)
            return r0
    }

    static /* synthetic */ boolean j(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0) {
            boolean r0 = p(r0)
            return r0
    }

    private final boolean k(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a
            java.util.Set r0 = r0.e()
            java.lang.String r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.d(r2)
            boolean r2 = kotlin.collections.f0.a2(r0, r2)
            return r2
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.descriptors.y l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r4) {
            java.lang.String r0 = "functionDescriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.load.java.h r0 = kotlin.reflect.jvm.internal.impl.load.java.h.o
            kotlin.reflect.jvm.internal.impl.name.f r1 = r4.getName()
            java.lang.String r2 = "getName(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            boolean r0 = r0.n(r1)
            r1 = 0
            if (r0 != 0) goto L18
            return r1
        L18:
            kotlin.reflect.jvm.internal.impl.load.java.f r0 = kotlin.reflect.jvm.internal.impl.load.java.f.a
            r2 = 1
            r3 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.i(r4, r3, r0, r2, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.y r4 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r4
            return r4
    }

    private static final boolean m(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.load.java.h r0 = kotlin.reflect.jvm.internal.impl.load.java.h.o
            boolean r1 = r0.k(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a
            java.util.Set r1 = r0.d()
            kotlin.reflect.jvm.internal.impl.name.f r2 = r5.getName()
            boolean r1 = r1.contains(r2)
            r2 = 0
            if (r1 != 0) goto L17
            return r2
        L17:
            kotlin.reflect.jvm.internal.impl.load.java.g r1 = kotlin.reflect.jvm.internal.impl.load.java.g.a
            r3 = 1
            r4 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.i(r5, r4, r1, r3, r2)
            if (r5 == 0) goto L2d
            java.lang.String r5 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.d(r5)
            if (r5 != 0) goto L28
            goto L2d
        L28:
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r5 = r0.l(r5)
            return r5
        L2d:
            return r2
    }

    private static final boolean p(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            if (r0 == 0) goto L13
            kotlin.reflect.jvm.internal.impl.load.java.h r0 = kotlin.reflect.jvm.internal.impl.load.java.h.o
            boolean r1 = r0.k(r1)
            if (r1 == 0) goto L13
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    public final boolean n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a
            java.util.Set r0 = r0.d()
            boolean r2 = r0.contains(r2)
            return r2
    }
}
