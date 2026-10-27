package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class x0 {
    public static final boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r1.L0()
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.error.g
            if (r0 != 0) goto L1e
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.k0
            if (r0 == 0) goto L1c
            kotlin.reflect.jvm.internal.impl.types.k0 r1 = (kotlin.reflect.jvm.internal.impl.types.k0) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.P0()
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.error.g
            if (r1 == 0) goto L1c
            goto L1e
        L1c:
            r1 = 0
            return r1
        L1e:
            r1 = 1
            return r1
    }

    public static final boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.j2.l(r1)
            return r1
    }
}
