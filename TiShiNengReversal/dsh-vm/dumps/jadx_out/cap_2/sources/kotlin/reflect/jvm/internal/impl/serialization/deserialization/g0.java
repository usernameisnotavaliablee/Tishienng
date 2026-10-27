package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class g0 implements kotlin.jvm.functions.Function0 {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 a;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 b;
    private final kotlin.reflect.jvm.internal.impl.protobuf.n c;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind d;
    private final int e;
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter f;

    public g0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r1, kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r2, kotlin.reflect.jvm.internal.impl.protobuf.n r3, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r4, int r5, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
            r6 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r0 = r6.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r1 = r6.b
            kotlin.reflect.jvm.internal.impl.protobuf.n r2 = r6.c
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r3 = r6.d
            int r4 = r6.e
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r5 = r6.f
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0.f(r0, r1, r2, r3, r4, r5)
            return r0
    }
}
