package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e extends kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.e o = null;

    static {
            kotlin.reflect.jvm.internal.impl.load.java.e r0 = new kotlin.reflect.jvm.internal.impl.load.java.e
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.e.o = r0
            return
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ boolean i(kotlin.reflect.jvm.internal.impl.descriptors.d1 r0, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            boolean r0 = l(r0, r1)
            return r0
    }

    private static final boolean l(kotlin.reflect.jvm.internal.impl.descriptors.d1 r1, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r2 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a
            java.util.Map r2 = r2.j()
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.d(r1)
            boolean r1 = r2.containsKey(r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.name.f j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d1 r2) {
            r1 = this;
            java.lang.String r0 = "functionDescriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a
            java.util.Map r0 = r0.j()
            java.lang.String r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.d(r2)
            if (r2 != 0) goto L13
            r2 = 0
            return r2
        L13:
            java.lang.Object r2 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.name.f r2 = (kotlin.reflect.jvm.internal.impl.name.f) r2
            return r2
    }

    public final boolean k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d1 r5) {
            r4 = this;
            java.lang.String r0 = "functionDescriptor"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.h0(r5)
            r1 = 0
            if (r0 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.load.java.d r0 = new kotlin.reflect.jvm.internal.impl.load.java.d
            r0.<init>(r5)
            r2 = 0
            r3 = 1
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.i(r5, r1, r0, r3, r2)
            if (r5 == 0) goto L1a
            return r3
        L1a:
            return r1
    }

    public final boolean m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d1 r3) {
            r2 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.name.f r0 = r3.getName()
            java.lang.String r0 = r0.b()
            java.lang.String r1 = "removeAt"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L2b
            java.lang.String r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.d(r3)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r0 = r0.h()
            java.lang.String r0 = r0.d()
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 == 0) goto L2b
            r3 = 1
            return r3
        L2b:
            r3 = 0
            return r3
    }
}
