package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.w {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.p a = null;

    static {
            kotlin.reflect.jvm.internal.impl.load.kotlin.p r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.p
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.kotlin.p.a = r0
            return
    }

    private p() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.w
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r5) {
            r1 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "flexibleId"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "lowerBound"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "upperBound"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "kotlin.jvm.PlatformType"
            boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r0 != 0) goto L2f
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r2 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.ERROR_FLEXIBLE_TYPE
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = r5.toString()
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}
            kotlin.reflect.jvm.internal.impl.types.error.g r2 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r2, r3)
            return r2
        L2f:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type, java.lang.Boolean> r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.g
            boolean r2 = r2.hasExtension(r3)
            if (r2 == 0) goto L3d
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j r2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j
            r2.<init>(r4, r5)
            return r2
        L3d:
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = kotlin.reflect.jvm.internal.impl.types.w0.e(r4, r5)
            return r2
    }
}
