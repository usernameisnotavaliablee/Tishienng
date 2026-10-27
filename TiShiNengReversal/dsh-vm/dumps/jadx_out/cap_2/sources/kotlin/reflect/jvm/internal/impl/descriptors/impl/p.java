package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p extends kotlin.reflect.jvm.internal.impl.descriptors.impl.h0 {
    public p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r3) {
            r1 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c E0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c.b
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.k r() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r0 = r1.E0()
            return r0
    }
}
