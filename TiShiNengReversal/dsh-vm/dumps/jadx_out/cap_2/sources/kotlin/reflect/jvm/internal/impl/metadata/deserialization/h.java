package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeTable.kt\norg/jetbrains/kotlin/metadata/deserialization/TypeTable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1573#2:37\n1604#2,4:38\n*S KotlinDebug\n*F\n+ 1 TypeTable.kt\norg/jetbrains/kotlin/metadata/deserialization/TypeTable\n*L\n26#1:37\n26#1:38,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> a;

    public h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable r6) {
            r5 = this;
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r6, r0)
            r5.<init>()
            java.util.List r0 = r6.getTypeList()
            boolean r1 = r6.hasFirstNullable()
            if (r1 == 0) goto L59
            int r0 = r6.getFirstNullable()
            java.util.List r6 = r6.getTypeList()
            java.lang.String r1 = "getTypeList(...)"
            kotlin.jvm.internal.g0.o(r6, r1)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r6, r2)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
            r2 = 0
        L31:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r6.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L42
            kotlin.collections.f0.b0()
        L42:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r3
            if (r2 < r0) goto L53
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r2 = r3.toBuilder()
            r3 = 1
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r2 = r2.Z(r3)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = r2.y()
        L53:
            r1.add(r3)
            r2 = r4
            goto L31
        L58:
            r0 = r1
        L59:
            java.lang.String r6 = "run(...)"
            kotlin.jvm.internal.g0.o(r0, r6)
            r5.a = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type a(int r2) {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r2
            return r2
    }
}
