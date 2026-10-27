package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class e0 implements kotlin.jvm.functions.Function0 {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 a;
    private final boolean b;
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property c;

    public e0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r1, boolean r2, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r3) {
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
            boolean r1 = r3.b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r2 = r3.c
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0.d(r0, r1, r2)
            return r0
    }
}
