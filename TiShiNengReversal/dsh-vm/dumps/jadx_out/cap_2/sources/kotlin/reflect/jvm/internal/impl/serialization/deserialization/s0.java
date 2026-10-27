package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class s0 implements kotlin.jvm.functions.Function0 {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 a;
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type b;

    public s0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r1, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r0 = r2.a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r2.b
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0.c(r0, r1)
            return r0
    }
}
