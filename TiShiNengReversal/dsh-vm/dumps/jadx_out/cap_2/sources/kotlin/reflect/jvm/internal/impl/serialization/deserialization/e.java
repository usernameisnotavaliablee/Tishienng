package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.d<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.f b;

    public e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k0 r3, @org.jetbrains.annotations.NotNull b4.a r4) {
            r1 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "notFoundClasses"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "protocol"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>(r4)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.f r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
            r4.<init>(r2, r3)
            r1.b = r4
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> e(kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r1, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r2, kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r1 = r0.p(r1, r2, r3)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> j(kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r1, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r2, kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r1 = r0.o(r1, r2, r3)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    public /* bridge */ /* synthetic */ java.lang.Object k(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation r1, kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = r0.n(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3) {
            r1 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.f r0 = r1.b
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2 = r0.a(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r4) {
            r1 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "proto"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "expectedType"
            kotlin.jvm.internal.g0.p(r4, r2)
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r4) {
            r1 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "expectedType"
            kotlin.jvm.internal.g0.p(r4, r0)
            b4.a r0 = r1.m()
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r0 = r0.b()
            java.lang.Object r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(r3, r0)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r3
            if (r3 != 0) goto L21
            r2 = 0
            return r2
        L21:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.f r0 = r1.b
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2 = r2.b()
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r2 = r0.f(r4, r3, r2)
            return r2
    }
}
