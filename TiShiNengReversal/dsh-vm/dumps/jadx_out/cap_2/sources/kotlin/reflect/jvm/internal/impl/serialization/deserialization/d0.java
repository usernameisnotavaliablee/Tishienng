package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class d0 implements kotlin.jvm.functions.Function0 {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 a;
    private final kotlin.reflect.jvm.internal.impl.protobuf.n b;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind c;

    public d0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r1, kotlin.reflect.jvm.internal.impl.protobuf.n r2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r3) {
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
            kotlin.reflect.jvm.internal.impl.protobuf.n r1 = r3.b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r2 = r3.c
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0.c(r0, r1, r2)
            return r0
    }
}
