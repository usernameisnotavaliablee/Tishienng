package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class j implements kotlin.reflect.jvm.internal.impl.util.f {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.util.j a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String b = null;

    static {
            kotlin.reflect.jvm.internal.impl.util.j r0 = new kotlin.reflect.jvm.internal.impl.util.j
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.util.j.a = r0
            java.lang.String r0 = "second parameter must be of type KProperty<*> or its supertype"
            kotlin.reflect.jvm.internal.impl.util.j.b = r0
            return
    }

    private j() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @org.jetbrains.annotations.Nullable
    public java.lang.String a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r1) {
            r0 = this;
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.util.f.a.a(r0, r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    public boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r3) {
            r2 = this;
            java.lang.String r0 = "functionDescriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List r3 = r3.g()
            r0 = 1
            java.lang.Object r3 = r3.get(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r3
            kotlin.reflect.jvm.internal.impl.builtins.n$b r0 = kotlin.reflect.jvm.internal.impl.builtins.n.k
            kotlin.jvm.internal.g0.m(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.s(r3)
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.a(r1)
            if (r0 == 0) goto L31
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.getType()
            java.lang.String r1 = "getType(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.B(r3)
            boolean r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.x(r0, r3)
            return r3
        L31:
            r3 = 0
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @org.jetbrains.annotations.NotNull
    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.util.j.b
            return r0
    }
}
