package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nProtoBasedClassDataFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoBasedClassDataFinder.kt\norg/jetbrains/kotlin/serialization/deserialization/ProtoBasedClassDataFinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1208#2,2:44\n1236#2,4:46\n*S KotlinDebug\n*F\n+ 1 ProtoBasedClassDataFinder.kt\norg/jetbrains/kotlin/serialization/deserialization/ProtoBasedClassDataFinder\n*L\n32#1:44,2\n32#1:46,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l0 implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.i {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.descriptors.e1> c;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> d;

    public l0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.b, ? extends kotlin.reflect.jvm.internal.impl.descriptors.e1> r5) {
            r1 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "metadataVersion"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "classSource"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.a = r3
            r1.b = r4
            r1.c = r5
            java.util.List r2 = r2.getClass_List()
            java.lang.String r3 = "getClass_List(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r2, r3)
            int r3 = kotlin.collections.i1.j(r3)
            r4 = 16
            int r3 = kotlin.ranges.t.u(r3, r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r2.next()
            r5 = r3
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) r5
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r1.a
            int r5 = r5.getFqName()
            kotlin.reflect.jvm.internal.impl.name.b r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.a(r0, r5)
            r4.put(r5, r3)
            goto L41
        L5c:
            r1.d = r4
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.i
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.h a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r6) {
            r5 = this;
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r0 = r5.d
            java.lang.Object r0 = r0.get(r6)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) r0
            if (r0 != 0) goto L11
            r6 = 0
            return r6
        L11:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.h r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.h
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2 = r5.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r3 = r5.b
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.descriptors.e1> r4 = r5.c
            java.lang.Object r6 = r4.invoke(r6)
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.e1) r6
            r1.<init>(r2, r0, r3, r6)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.name.b> b() {
            r1 = this;
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r0 = r1.d
            java.util.Set r0 = r0.keySet()
            return r0
    }
}
