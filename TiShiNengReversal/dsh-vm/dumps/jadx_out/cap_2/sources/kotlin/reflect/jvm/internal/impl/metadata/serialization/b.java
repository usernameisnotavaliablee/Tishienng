package kotlin.reflect.jvm.internal.impl.metadata.serialization;

import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class b<Element extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<?, Element>, Table extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, TableBuilder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<Table, TableBuilder>> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.serialization.a<kotlin.reflect.jvm.internal.impl.metadata.serialization.e<Element>> a;

    public final int a(@org.jetbrains.annotations.NotNull Element r3) {
            r2 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.metadata.serialization.a<kotlin.reflect.jvm.internal.impl.metadata.serialization.e<Element extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$b<?, Element>>> r0 = r2.a
            kotlin.reflect.jvm.internal.impl.metadata.serialization.e r1 = new kotlin.reflect.jvm.internal.impl.metadata.serialization.e
            r1.<init>(r3)
            int r3 = r0.b(r1)
            return r3
    }
}
