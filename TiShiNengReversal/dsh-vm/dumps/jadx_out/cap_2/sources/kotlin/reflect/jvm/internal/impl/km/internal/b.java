package kotlin.reflect.jvm.internal.impl.km.internal;

import java.lang.Enum;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b<Node, E extends java.lang.Enum<E>> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.l<Node, java.lang.Integer> a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d<? extends kotlin.reflect.jvm.internal.impl.protobuf.h.a> b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.enums.a<E> c;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.d> d;

    public b(@org.jetbrains.annotations.NotNull kotlin.reflect.l<Node, java.lang.Integer> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d<? extends kotlin.reflect.jvm.internal.impl.protobuf.h.a> r3, @org.jetbrains.annotations.NotNull kotlin.enums.a<E> r4, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.d> r5) {
            r1 = this;
            java.lang.String r0 = "flags"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "protoSet"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "entries"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "flagValues"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            return
    }

    @org.jetbrains.annotations.NotNull
    public final E a(Node r3, @org.jetbrains.annotations.NotNull kotlin.reflect.n<?> r4) {
            r2 = this;
            java.lang.String r0 = "property"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.enums.a<E extends java.lang.Enum<E>> r4 = r2.c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<? extends kotlin.reflect.jvm.internal.impl.protobuf.h$a> r0 = r2.b
            kotlin.reflect.l<Node, java.lang.Integer> r1 = r2.a
            java.lang.Object r3 = r1.get(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r3 = r0.d(r3)
            kotlin.reflect.jvm.internal.impl.protobuf.h$a r3 = (kotlin.reflect.jvm.internal.impl.protobuf.h.a) r3
            int r3 = r3.getNumber()
            java.lang.Object r3 = r4.get(r3)
            java.lang.Enum r3 = (java.lang.Enum) r3
            return r3
    }
}
