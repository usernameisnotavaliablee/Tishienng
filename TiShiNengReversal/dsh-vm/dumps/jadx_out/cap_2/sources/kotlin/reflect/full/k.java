package kotlin.reflect.full;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "KTypes")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k {
    @kotlin.SinceKotlin(version = "1.1")
    public static final boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.r r1, @org.jetbrains.annotations.NotNull kotlin.reflect.r r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.z2 r1 = (kotlin.reflect.jvm.internal.z2) r1
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
            kotlin.reflect.jvm.internal.z2 r2 = (kotlin.reflect.jvm.internal.z2) r2
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.x(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static final boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.r r1, @org.jetbrains.annotations.NotNull kotlin.reflect.r r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r1 = a(r2, r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.r c(@org.jetbrains.annotations.NotNull kotlin.reflect.r r1, boolean r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.z2 r1 = (kotlin.reflect.jvm.internal.z2) r1
            kotlin.reflect.jvm.internal.z2 r1 = r1.F(r2)
            return r1
    }
}
