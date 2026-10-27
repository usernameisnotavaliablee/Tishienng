package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class i0 implements kotlin.jvm.functions.Function0 {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 a;
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property b;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 c;

    public i0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r1, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r0 = r3.a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r1 = r3.b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 r2 = r3.c
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0.h(r0, r1, r2)
            return r0
    }
}
