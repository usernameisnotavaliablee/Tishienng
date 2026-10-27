package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a0 extends kotlin.reflect.jvm.internal.impl.resolve.constants.b {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.t0 c;

    public a0(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.constants.z r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.z
            r0.<init>(r3)
            r1.<init>(r2, r0)
            r1.c = r3
            return
    }

    private static final kotlin.reflect.jvm.internal.impl.types.t0 b(kotlin.reflect.jvm.internal.impl.types.t0 r1, kotlin.reflect.jvm.internal.impl.descriptors.f0 r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            return r1
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 c(kotlin.reflect.jvm.internal.impl.types.t0 r0, kotlin.reflect.jvm.internal.impl.descriptors.f0 r1) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = b(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t0 getType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.c
            return r0
    }
}
