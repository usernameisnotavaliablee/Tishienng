package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.contracts.ExperimentalContracts
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m {

    @org.jetbrains.annotations.NotNull
    private kotlin.reflect.jvm.internal.impl.km.KmEffectType a;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind b;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.n> c;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.n d;

    public m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.KmEffectType r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind r3) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 1
            r2.<init>(r3)
            r1.c = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.n> a() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.n> r0 = r1.c
            return r0
    }

    public final void b(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.n r1) {
            r0 = this;
            r0.d = r1
            return
    }
}
