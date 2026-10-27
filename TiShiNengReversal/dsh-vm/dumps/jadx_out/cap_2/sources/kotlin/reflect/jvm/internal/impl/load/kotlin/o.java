package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.i {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.v a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.n b;

    public o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.v r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.n r3) {
            r1 = this;
            java.lang.String r0 = "kotlinClassFinder"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "deserializedDescriptorResolver"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.i
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.h a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r3) {
            r2 = this;
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.v r0 = r2.a
            kotlin.reflect.jvm.internal.impl.load.kotlin.n r1 = r2.b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1 = r1.f()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n r1 = r1.g()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r1 = r1.f()
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.w.a(r0, r3, r1)
            if (r0 != 0) goto L1d
            r3 = 0
            return r3
        L1d:
            kotlin.reflect.jvm.internal.impl.name.b r1 = r0.c()
            kotlin.jvm.internal.g0.g(r1, r3)
            kotlin.reflect.jvm.internal.impl.load.kotlin.n r3 = r2.b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.h r3 = r3.l(r0)
            return r3
    }
}
