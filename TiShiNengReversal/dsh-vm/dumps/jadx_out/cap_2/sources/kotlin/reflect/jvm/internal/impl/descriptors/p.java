package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class p extends kotlin.reflect.jvm.internal.impl.descriptors.s {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.v1 a;

    public p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.v1 r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.v1 b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.v1 r0 = r1.a
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
    @org.jetbrains.annotations.NotNull
    public java.lang.String c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.v1 r0 = r1.b()
            java.lang.String r0 = r0.b()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.s f() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.v1 r0 = r2.b()
            kotlin.reflect.jvm.internal.impl.descriptors.v1 r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.j(r0)
            java.lang.String r1 = "toDescriptorVisibility(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }
}
