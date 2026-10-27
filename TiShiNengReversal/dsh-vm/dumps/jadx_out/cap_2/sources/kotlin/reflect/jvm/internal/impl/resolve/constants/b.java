package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class b extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.f0, kotlin.reflect.jvm.internal.impl.types.t0> b;

    public b(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.f0, ? extends kotlin.reflect.jvm.internal.impl.types.t0> r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "computeType"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2)
            r1.b = r3
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getType(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2) {
            r1 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.f0, kotlin.reflect.jvm.internal.impl.types.t0> r0 = r1.b
            java.lang.Object r2 = r0.invoke(r2)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.d0(r2)
            if (r0 != 0) goto L1c
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.r0(r2)
            if (r0 != 0) goto L1c
            kotlin.reflect.jvm.internal.impl.builtins.j.E0(r2)
        L1c:
            return r2
    }
}
