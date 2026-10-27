package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class g1 extends kotlin.reflect.jvm.internal.impl.types.c0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.t1 c;

    public g1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r3) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2)
            r1.c = r3
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0, kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t1 H0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r1.c
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.b0 T0(kotlin.reflect.jvm.internal.impl.types.e1 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.g1 r1 = r0.U0(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.g1 U0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r3) {
            r2 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.g1 r0 = new kotlin.reflect.jvm.internal.impl.types.g1
            kotlin.reflect.jvm.internal.impl.types.t1 r1 = r2.H0()
            r0.<init>(r3, r1)
            return r0
    }
}
