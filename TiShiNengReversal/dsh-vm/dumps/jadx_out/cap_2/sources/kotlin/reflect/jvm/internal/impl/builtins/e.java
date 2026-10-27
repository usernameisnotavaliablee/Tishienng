package kotlin.reflect.jvm.internal.impl.builtins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {
    public static final boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.d r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "classDescriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.i.x(r2)
            if (r0 == 0) goto L28
            java.util.Set r1 = r1.b()
            kotlin.reflect.jvm.internal.impl.name.b r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.n(r2)
            if (r2 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.name.b r2 = r2.e()
            goto L20
        L1f:
            r2 = 0
        L20:
            boolean r1 = kotlin.collections.f0.a2(r1, r2)
            if (r1 == 0) goto L28
            r1 = 1
            return r1
        L28:
            r1 = 0
            return r1
    }
}
