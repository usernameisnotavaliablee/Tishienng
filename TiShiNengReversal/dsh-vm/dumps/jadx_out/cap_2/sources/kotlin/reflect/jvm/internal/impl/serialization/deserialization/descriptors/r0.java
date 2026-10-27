package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDeserializedTypeParameterDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedTypeParameterDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedTypeParameterDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1563#2:59\n1634#2,3:60\n*S KotlinDebug\n*F\n+ 1 DeserializedTypeParameterDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedTypeParameterDescriptor\n*L\n51#1:59\n51#1:60,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class r0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.b {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.o k;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter l;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b m;

    public r0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter r13, int r14) {
            r11 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r13, r0)
            kotlin.reflect.jvm.internal.impl.storage.n r2 = r12.h()
            kotlin.reflect.jvm.internal.impl.descriptors.k r3 = r12.e()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r0.b()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r12.g()
            int r1 = r13.getName()
            kotlin.reflect.jvm.internal.impl.name.f r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r0, r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0 r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0.a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance r1 = r13.getVariance()
            java.lang.String r6 = "getVariance(...)"
            kotlin.jvm.internal.g0.o(r1, r6)
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = r0.d(r1)
            boolean r7 = r13.getReified()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r9 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            kotlin.reflect.jvm.internal.impl.descriptors.h1$a r10 = kotlin.reflect.jvm.internal.impl.descriptors.h1.a.a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1.k = r12
            r1.l = r13
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b r13 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b
            kotlin.reflect.jvm.internal.impl.storage.n r12 = r12.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.q0 r14 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.q0
            r14.<init>(r11)
            r13.<init>(r12, r14)
            r1.m = r13
            return
    }

    static /* synthetic */ java.util.List H0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.r0 r0) {
            java.util.List r0 = I0(r0)
            return r0
    }

    private static final java.util.List I0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.r0 r2) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r2.k
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r1 = r2.l
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r2.k
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2 = r2.g()
            java.util.List r2 = r0.d(r1, r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.f0.a6(r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h
    public /* bridge */ /* synthetic */ void F0(kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            r0 = this;
            r0.K0(r1)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h
    @org.jetbrains.annotations.NotNull
    protected java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> G0() {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r0 = r4.l
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r4.k
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r1 = r1.j()
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.t(r0, r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r4)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.z()
            java.util.List r0 = kotlin.collections.f0.l(r0)
            return r0
        L1f:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r4.k
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r1 = r1.i()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r3
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r1.u(r3)
            r2.add(r3)
            goto L36
        L4a:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b J0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b r0 = r1.m
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected java.lang.Void K0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            r2 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "There should be no cycles for deserialized type parameters, but found for: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b r0 = r1.J0()
            return r0
    }
}
