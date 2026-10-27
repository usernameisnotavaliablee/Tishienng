package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nValueClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1563#2:56\n1634#2,3:57\n1563#2:60\n1634#2,3:61\n1563#2:64\n1634#2,3:65\n*S KotlinDebug\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n*L\n26#1:56\n26#1:57,3\n44#1:60\n44#1:61,3\n48#1:64\n48#1:65,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class x0 {
    @org.jetbrains.annotations.NotNull
    public static final kotlin.Pair<java.util.List<kotlin.reflect.jvm.internal.impl.name.f>, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type>> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r7) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r1)
            java.lang.String r1 = "nameResolver"
            kotlin.jvm.internal.g0.p(r6, r1)
            java.lang.String r1 = "typeTable"
            kotlin.jvm.internal.g0.p(r7, r1)
            java.util.List r1 = r5.getMultiFieldValueClassUnderlyingNameList()
            java.lang.String r2 = "getMultiFieldValueClassUnderlyingNameList(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.f0.d0(r1, r3)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L49
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            kotlin.jvm.internal.g0.m(r4)
            int r4 = r4.intValue()
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r6, r4)
            r2.add(r4)
            goto L2e
        L49:
            int r1 = r5.getMultiFieldValueClassUnderlyingTypeIdCount()
            int r4 = r5.getMultiFieldValueClassUnderlyingTypeCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            kotlin.Pair r1 = kotlin.o0.a(r1, r4)
            int r4 = r2.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            kotlin.Pair r4 = kotlin.o0.a(r4, r0)
            boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
            if (r4 == 0) goto La2
            java.util.List r5 = r5.getMultiFieldValueClassUnderlyingTypeIdList()
            java.lang.String r6 = "getMultiFieldValueClassUnderlyingTypeIdList(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            int r0 = kotlin.collections.f0.d0(r5, r3)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L87:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r5.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            kotlin.jvm.internal.g0.m(r0)
            int r0 = r0.intValue()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r0 = r7.a(r0)
            r6.add(r0)
            goto L87
        La2:
            int r7 = r2.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            kotlin.Pair r7 = kotlin.o0.a(r0, r7)
            boolean r7 = kotlin.jvm.internal.g0.g(r1, r7)
            if (r7 == 0) goto Lbd
            java.util.List r6 = r5.getMultiFieldValueClassUnderlyingTypeList()
        Lb8:
            kotlin.Pair r5 = kotlin.o0.a(r2, r6)
            return r5
        Lbd:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "class "
            r0.append(r1)
            int r5 = r5.getFqName()
            kotlin.reflect.jvm.internal.impl.name.f r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r6, r5)
            r0.append(r5)
            java.lang.String r5 = " has illegal multi-field value class representation"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r5 = r5.toString()
            r7.<init>(r5)
            throw r7
    }

    @org.jetbrains.annotations.Nullable
    public static final <T extends d4.h> kotlin.reflect.jvm.internal.impl.descriptors.o1<T> b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type, ? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends T> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "typeDeserializer"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "typeOfPublicProperty"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r1.getMultiFieldValueClassUnderlyingNameCount()
            if (r0 <= 0) goto L5e
            kotlin.Pair r1 = a(r1, r2, r3)
            java.lang.Object r2 = r1.component1()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r1.component2()
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.f0.d0(r1, r5)
            r3.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L42:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L54
            java.lang.Object r5 = r1.next()
            java.lang.Object r5 = r4.invoke(r5)
            r3.add(r5)
            goto L42
        L54:
            java.util.List r1 = kotlin.collections.f0.o6(r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.g0 r2 = new kotlin.reflect.jvm.internal.impl.descriptors.g0
            r2.<init>(r1)
            return r2
        L5e:
            boolean r0 = r1.hasInlineClassUnderlyingPropertyName()
            if (r0 == 0) goto Lb3
            int r0 = r1.getInlineClassUnderlyingPropertyName()
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r2, r0)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.i(r1, r3)
            if (r3 == 0) goto L7a
            java.lang.Object r3 = r4.invoke(r3)
            d4.h r3 = (d4.h) r3
            if (r3 != 0) goto L82
        L7a:
            java.lang.Object r3 = r5.invoke(r0)
            d4.h r3 = (d4.h) r3
            if (r3 == 0) goto L88
        L82:
            kotlin.reflect.jvm.internal.impl.descriptors.z r1 = new kotlin.reflect.jvm.internal.impl.descriptors.z
            r1.<init>(r0, r3)
            return r1
        L88:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "cannot determine underlying type for value class "
            r3.append(r4)
            int r1 = r1.getFqName()
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r2, r1)
            r3.append(r1)
            java.lang.String r1 = " with property "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        Lb3:
            r1 = 0
            return r1
    }
}
