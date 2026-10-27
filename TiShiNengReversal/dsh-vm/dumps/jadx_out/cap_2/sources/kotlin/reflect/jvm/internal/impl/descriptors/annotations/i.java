package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i {
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4) {
            java.lang.String r0 = "first"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "second"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L11
            return r4
        L11:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L18
            return r3
        L18:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.n r0 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.n
            r1 = 2
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g[] r1 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.g[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r0.<init>(r1)
            return r0
    }
}
