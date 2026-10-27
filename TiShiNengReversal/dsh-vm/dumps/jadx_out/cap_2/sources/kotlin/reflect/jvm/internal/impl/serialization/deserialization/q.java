package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class q extends kotlin.reflect.jvm.internal.impl.descriptors.impl.h0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.n g;

    public q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r4) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>(r4, r2)
            r1.g = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.serialization.deserialization.i E0();

    public boolean F0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r2.r()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
            if (r1 == 0) goto L1b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w) r0
            java.util.Set r0 = r0.u()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L1b
            r3 = 1
            return r3
        L1b:
            r3 = 0
            return r3
    }

    public abstract void G0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1);
}
