package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nprotoTypeTableUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 protoTypeTableUtil.kt\norg/jetbrains/kotlin/metadata/deserialization/ProtoTypeTableUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1#2:126\n1563#3:127\n1634#3,3:128\n1563#3:131\n1634#3,3:132\n1563#3:135\n1634#3,3:136\n1563#3:139\n1634#3,3:140\n1563#3:143\n1634#3,3:144\n*S KotlinDebug\n*F\n+ 1 protoTypeTableUtil.kt\norg/jetbrains/kotlin/metadata/deserialization/ProtoTypeTableUtilKt\n*L\n24#1:127\n24#1:128,3\n45#1:131\n45#1:132,3\n118#1:135\n118#1:136,3\n121#1:139\n121#1:140,3\n124#1:143\n124#1:144,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g {
    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasAbbreviatedType()
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r1.getAbbreviatedType()
            return r1
        L15:
            boolean r0 = r1.hasAbbreviatedTypeId()
            if (r0 == 0) goto L24
            int r1 = r1.getAbbreviatedTypeId()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r2.a(r1)
            return r1
        L24:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List r0 = r2.getContextReceiverTypeList()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 != 0) goto L50
            java.util.List r2 = r2.getContextReceiverTypeIdList()
            java.lang.String r0 = "getContextReceiverTypeIdList(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r2.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            kotlin.jvm.internal.g0.m(r1)
            int r1 = r1.intValue()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r3.a(r1)
            r0.add(r1)
            goto L35
        L50:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List r0 = r2.getContextReceiverTypeList()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 != 0) goto L50
            java.util.List r2 = r2.getContextReceiverTypeIdList()
            java.lang.String r0 = "getContextReceiverTypeIdList(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r2.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            kotlin.jvm.internal.g0.m(r1)
            int r1 = r1.intValue()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r3.a(r1)
            r0.add(r1)
            goto L35
        L50:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List r0 = r2.getContextReceiverTypeList()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 != 0) goto L50
            java.util.List r2 = r2.getContextReceiverTypeIdList()
            java.lang.String r0 = "getContextReceiverTypeIdList(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r2.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            kotlin.jvm.internal.g0.m(r1)
            int r1 = r1.intValue()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r3.a(r1)
            r0.add(r1)
            goto L35
        L50:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasExpandedType()
            if (r0 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r1.getExpandedType()
            java.lang.String r2 = "getExpandedType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
        L1a:
            boolean r0 = r1.hasExpandedTypeId()
            if (r0 == 0) goto L29
            int r1 = r1.getExpandedTypeId()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r2.a(r1)
            return r1
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No expandedType in ProtoBuf.TypeAlias"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasFlexibleUpperBound()
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r1.getFlexibleUpperBound()
            return r1
        L15:
            boolean r0 = r1.hasFlexibleUpperBoundId()
            if (r0 == 0) goto L24
            int r1 = r1.getFlexibleUpperBoundId()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r2.a(r1)
            return r1
        L24:
            r1 = 0
            return r1
    }

    public static final boolean g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.hasReceiverType()
            if (r0 != 0) goto L14
            boolean r1 = r1.hasReceiverTypeId()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }

    public static final boolean h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.hasReceiverType()
            if (r0 != 0) goto L14
            boolean r1 = r1.hasReceiverTypeId()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasInlineClassUnderlyingType()
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r1.getInlineClassUnderlyingType()
            return r1
        L15:
            boolean r0 = r1.hasInlineClassUnderlyingTypeId()
            if (r0 == 0) goto L24
            int r1 = r1.getInlineClassUnderlyingTypeId()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r2.a(r1)
            return r1
        L24:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasIsInstanceType()
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r1.getIsInstanceType()
            return r1
        L15:
            boolean r0 = r1.hasIsInstanceTypeId()
            if (r0 == 0) goto L24
            int r1 = r1.getIsInstanceTypeId()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r2.a(r1)
            return r1
        L24:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasOuterType()
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r1.getOuterType()
            return r1
        L15:
            boolean r0 = r1.hasOuterTypeId()
            if (r0 == 0) goto L24
            int r1 = r1.getOuterTypeId()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r2.a(r1)
            return r1
        L24:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasReceiverType()
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r1.getReceiverType()
            return r1
        L15:
            boolean r0 = r1.hasReceiverTypeId()
            if (r0 == 0) goto L24
            int r1 = r1.getReceiverTypeId()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r2.a(r1)
            return r1
        L24:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasReceiverType()
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r1.getReceiverType()
            return r1
        L15:
            boolean r0 = r1.hasReceiverTypeId()
            if (r0 == 0) goto L24
            int r1 = r1.getReceiverTypeId()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r2.a(r1)
            return r1
        L24:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasReturnType()
            if (r0 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r1.getReturnType()
            java.lang.String r2 = "getReturnType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
        L1a:
            boolean r0 = r1.hasReturnTypeId()
            if (r0 == 0) goto L29
            int r1 = r1.getReturnTypeId()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r2.a(r1)
            return r1
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No returnType in ProtoBuf.Function"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasReturnType()
            if (r0 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r1.getReturnType()
            java.lang.String r2 = "getReturnType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
        L1a:
            boolean r0 = r1.hasReturnTypeId()
            if (r0 == 0) goto L29
            int r1 = r1.getReturnTypeId()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r2.a(r1)
            return r1
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No returnType in ProtoBuf.Property"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List r0 = r2.getSupertypeList()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 != 0) goto L50
            java.util.List r2 = r2.getSupertypeIdList()
            java.lang.String r0 = "getSupertypeIdList(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r2.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            kotlin.jvm.internal.g0.m(r1)
            int r1 = r1.intValue()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r3.a(r1)
            r0.add(r1)
            goto L35
        L50:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasType()
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r1.getType()
            return r1
        L15:
            boolean r0 = r1.hasTypeId()
            if (r0 == 0) goto L24
            int r1 = r1.getTypeId()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r2.a(r1)
            return r1
        L24:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasType()
            if (r0 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r1.getType()
            java.lang.String r2 = "getType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
        L1a:
            boolean r0 = r1.hasTypeId()
            if (r0 == 0) goto L29
            int r1 = r1.getTypeId()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r2.a(r1)
            return r1
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No type in ProtoBuf.ValueParameter"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type s(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasUnderlyingType()
            if (r0 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r1.getUnderlyingType()
            java.lang.String r2 = "getUnderlyingType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
        L1a:
            boolean r0 = r1.hasUnderlyingTypeId()
            if (r0 == 0) goto L29
            int r1 = r1.getUnderlyingTypeId()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r2.a(r1)
            return r1
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No underlyingType in ProtoBuf.TypeAlias"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List r0 = r2.getUpperBoundList()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 != 0) goto L50
            java.util.List r2 = r2.getUpperBoundIdList()
            java.lang.String r0 = "getUpperBoundIdList(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r2.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            kotlin.jvm.internal.g0.m(r1)
            int r1 = r1.intValue()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r3.a(r1)
            r0.add(r1)
            goto L35
        L50:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type u(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.hasVarargElementType()
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r1.getVarargElementType()
            return r1
        L15:
            boolean r0 = r1.hasVarargElementTypeId()
            if (r0 == 0) goto L24
            int r1 = r1.getVarargElementTypeId()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r2.a(r1)
            return r1
        L24:
            r1 = 0
            return r1
    }
}
