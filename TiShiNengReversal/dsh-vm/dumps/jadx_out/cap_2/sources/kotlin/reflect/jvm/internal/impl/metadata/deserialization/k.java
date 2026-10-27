package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k {
    public static final boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r3) {
            java.lang.String r0 = "version"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.a()
            r1 = 1
            if (r0 != r1) goto L13
            int r0 = r3.b()
            r2 = 4
            if (r0 >= r2) goto L19
        L13:
            int r3 = r3.a()
            if (r3 <= r1) goto L1a
        L19:
            return r1
        L1a:
            r3 = 0
            return r3
    }

    public static final boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r1) {
            java.lang.String r0 = "version"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = a(r1)
            return r1
    }
}
