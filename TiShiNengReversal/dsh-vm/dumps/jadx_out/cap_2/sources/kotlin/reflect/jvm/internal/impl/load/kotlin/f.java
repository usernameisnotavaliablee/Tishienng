package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f {
    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.a0 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r4, boolean r5, boolean r6, boolean r7) {
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.d
            java.lang.String r1 = "propertySignature"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(r2, r0)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r0
            r1 = 0
            if (r0 != 0) goto L20
            return r1
        L20:
            if (r5 == 0) goto L32
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$a r2 = r5.c(r2, r3, r4, r7)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0$a r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.a0.b
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r2 = r3.b(r2)
            return r2
        L32:
            if (r6 == 0) goto L4a
            boolean r2 = r0.hasSyntheticMethod()
            if (r2 == 0) goto L4a
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0$a r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.a0.b
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r0.getSyntheticMethod()
            java.lang.String r5 = "getSyntheticMethod(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r2 = r2.c(r3, r4)
            return r2
        L4a:
            return r1
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.a0 b(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r1, kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r3, boolean r4, boolean r5, boolean r6, int r7, java.lang.Object r8) {
            r8 = r7 & 8
            r0 = 0
            if (r8 == 0) goto L6
            r4 = 0
        L6:
            r8 = r7 & 16
            if (r8 == 0) goto Lb
            r5 = 0
        Lb:
            r7 = r7 & 32
            if (r7 == 0) goto L10
            r6 = 1
        L10:
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r1 = a(r1, r2, r3, r4, r5, r6)
            return r1
    }
}
