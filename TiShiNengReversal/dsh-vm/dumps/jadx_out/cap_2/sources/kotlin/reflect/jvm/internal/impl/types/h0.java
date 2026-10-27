package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class h0 {
    public h0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.c2 b(kotlin.reflect.jvm.internal.impl.types.h0 r0, kotlin.reflect.jvm.internal.impl.descriptors.j1 r1, kotlin.reflect.jvm.internal.impl.types.i0 r2, kotlin.reflect.jvm.internal.impl.types.b2 r3, kotlin.reflect.jvm.internal.impl.types.t0 r4, int r5, java.lang.Object r6) {
            if (r6 != 0) goto Lf
            r5 = r5 & 8
            if (r5 == 0) goto La
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r3.e(r1, r2)
        La:
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = r0.a(r1, r2, r3, r4)
            return r0
        Lf:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: computeProjection"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.c2 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.i0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.b2 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r5) {
            r1 = this;
            java.lang.String r0 = "parameter"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "typeAttr"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "typeParameterUpperBoundEraser"
            kotlin.jvm.internal.g0.p(r4, r2)
            java.lang.String r2 = "erasedUpperBound"
            kotlin.jvm.internal.g0.p(r5, r2)
            kotlin.reflect.jvm.internal.impl.types.e2 r2 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            r2.<init>(r3, r5)
            return r2
    }
}
