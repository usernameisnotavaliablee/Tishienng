package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Class<?> a(@org.jetbrains.annotations.NotNull java.lang.ClassLoader r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r1)     // Catch: java.lang.ClassNotFoundException -> L10
            return r1
        L10:
            r1 = 0
            return r1
    }
}
