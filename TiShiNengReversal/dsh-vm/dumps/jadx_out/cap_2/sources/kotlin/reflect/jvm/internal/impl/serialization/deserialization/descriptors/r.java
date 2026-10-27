package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class r implements kotlin.jvm.functions.Function0 {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n a;
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry b;

    public r(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r1, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = r2.a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry r1 = r2.b
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.c.c(r0, r1)
            return r0
    }
}
