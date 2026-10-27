package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class u0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.g a;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> b;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.descriptors.u0 c;

    public u0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.g r2, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.u0 r4) {
            r1 = this;
            java.lang.String r0 = "classifierDescriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> a() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.g b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.g r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.descriptors.u0 c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.u0 r0 = r1.c
            return r0
    }
}
