package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class v extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<java.lang.Void> {
    public v() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 getType(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2) {
            r1 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.builtins.j r2 = r2.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.K()
            java.lang.String r0 = "getNullableNothingType(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 getType(kotlin.reflect.jvm.internal.impl.descriptors.f0 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.getType(r1)
            return r1
    }
}
