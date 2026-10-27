package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJvmProtoBufUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmProtoBufUtil.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmProtoBufUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1563#2:142\n1634#2,3:143\n1563#2:146\n1634#2,3:147\n1563#2:150\n1634#2,3:151\n1#3:154\n*S KotlinDebug\n*F\n+ 1 JvmProtoBufUtil.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmProtoBufUtil\n*L\n79#1:142\n79#1:143,3\n81#1:146\n81#1:147,3\n103#1:150\n103#1:151,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.protobuf.f b = null;

    static {
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r0 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a = r0
            kotlin.reflect.jvm.internal.impl.protobuf.f r0 = kotlin.reflect.jvm.internal.impl.protobuf.f.d()
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.a(r0)
            java.lang.String r1 = "apply(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.b = r0
            return
    }

    private h() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.a d(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r0, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r1, kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r3, boolean r4, int r5, java.lang.Object r6) {
            r5 = r5 & 8
            if (r5 == 0) goto L5
            r4 = 1
        L5:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$a r0 = r0.c(r1, r2, r3, r4)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final boolean f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r2) {
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.c r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.c.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, java.lang.Integer> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.e
            java.lang.Object r2 = r2.getExtension(r1)
            java.lang.String r1 = "getExtension(...)"
            kotlin.jvm.internal.g0.o(r2, r1)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Boolean r2 = r0.g(r2)
            java.lang.String r0 = "get(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            boolean r2 = r2.booleanValue()
            return r2
    }

    private final java.lang.String g(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r2, kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3) {
            r1 = this;
            boolean r0 = r2.hasClassName()
            if (r0 == 0) goto L13
            int r2 = r2.getClassName()
            java.lang.String r2 = r3.a(r2)
            java.lang.String r2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> h(@org.jetbrains.annotations.NotNull byte[] r2, @org.jetbrains.annotations.NotNull java.lang.String[] r3) {
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            kotlin.Pair r2 = new kotlin.Pair
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e r3 = r1.k(r0, r3)
            kotlin.reflect.jvm.internal.impl.protobuf.f r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.parseFrom(r0, r1)
            r2.<init>(r3, r0)
            return r2
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> i(@org.jetbrains.annotations.NotNull java.lang.String[] r1, @org.jetbrains.annotations.NotNull java.lang.String[] r2) {
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r2, r0)
            byte[] r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.a.e(r1)
            java.lang.String r0 = "decodeBytes(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            kotlin.Pair r1 = h(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> j(@org.jetbrains.annotations.NotNull java.lang.String[] r2, @org.jetbrains.annotations.NotNull java.lang.String[] r3) {
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.a.e(r2)
            r0.<init>(r2)
            kotlin.Pair r2 = new kotlin.Pair
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e r3 = r1.k(r0, r3)
            kotlin.reflect.jvm.internal.impl.protobuf.f r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.parseFrom(r0, r1)
            r2.<init>(r3, r0)
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e k(java.io.InputStream r3, java.lang.String[] r4) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e r0 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e
            kotlin.reflect.jvm.internal.impl.protobuf.f r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.b
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.parseDelimitedFrom(r3, r1)
            java.lang.String r1 = "parseDelimitedFrom(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            r0.<init>(r3, r4)
            return r0
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> l(@org.jetbrains.annotations.NotNull byte[] r2, @org.jetbrains.annotations.NotNull java.lang.String[] r3) {
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            kotlin.Pair r2 = new kotlin.Pair
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e r3 = r1.k(r0, r3)
            kotlin.reflect.jvm.internal.impl.protobuf.f r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.parseFrom(r0, r1)
            r2.<init>(r3, r0)
            return r2
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> m(@org.jetbrains.annotations.NotNull java.lang.String[] r1, @org.jetbrains.annotations.NotNull java.lang.String[] r2) {
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r2, r0)
            byte[] r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.a.e(r1)
            java.lang.String r0 = "decodeBytes(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            kotlin.Pair r1 = l(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.protobuf.f a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.f r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.b
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r14) {
            r11 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r14, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.a
            java.lang.String r1 = "constructorSignature"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(r12, r0)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r0
            if (r0 == 0) goto L2d
            boolean r1 = r0.hasName()
            if (r1 == 0) goto L2d
            int r1 = r0.getName()
            java.lang.String r1 = r13.getString(r1)
            goto L2f
        L2d:
            java.lang.String r1 = "<init>"
        L2f:
            if (r0 == 0) goto L40
            boolean r2 = r0.hasDesc()
            if (r2 == 0) goto L40
            int r12 = r0.getDesc()
            java.lang.String r12 = r13.getString(r12)
            goto L8b
        L40:
            java.util.List r12 = r12.getValueParameterList()
            java.lang.String r0 = "getValueParameterList(...)"
            kotlin.jvm.internal.g0.o(r12, r0)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.f0.d0(r12, r0)
            r2.<init>(r0)
            java.util.Iterator r12 = r12.iterator()
        L5a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r12.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r0
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a
            kotlin.jvm.internal.g0.m(r0)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.r(r0, r14)
            java.lang.String r0 = r3.g(r0, r13)
            if (r0 != 0) goto L77
            r12 = 0
            return r12
        L77:
            r2.add(r0)
            goto L5a
        L7b:
            r9 = 56
            r10 = 0
            java.lang.String r3 = ""
            java.lang.String r4 = "("
            java.lang.String r5 = ")V"
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r12 = kotlin.collections.f0.r3(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L8b:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r13 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b
            r13.<init>(r1, r12)
            return r13
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.a c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r6, boolean r7) {
            r3 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.d
            java.lang.String r1 = "propertySignature"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(r4, r0)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r0
            r1 = 0
            if (r0 != 0) goto L20
            return r1
        L20:
            boolean r2 = r0.hasField()
            if (r2 == 0) goto L2b
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r0 = r0.getField()
            goto L2c
        L2b:
            r0 = r1
        L2c:
            if (r0 != 0) goto L31
            if (r7 == 0) goto L31
            return r1
        L31:
            if (r0 == 0) goto L3e
            boolean r7 = r0.hasName()
            if (r7 == 0) goto L3e
            int r7 = r0.getName()
            goto L42
        L3e:
            int r7 = r4.getName()
        L42:
            if (r0 == 0) goto L53
            boolean r2 = r0.hasDesc()
            if (r2 == 0) goto L53
            int r4 = r0.getDesc()
            java.lang.String r4 = r5.getString(r4)
            goto L5e
        L53:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.o(r4, r6)
            java.lang.String r4 = r3.g(r4, r5)
            if (r4 != 0) goto L5e
            return r1
        L5e:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$a r6 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$a
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r20) {
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "proto"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.String r3 = "nameResolver"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r3 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r3)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.b
            java.lang.String r4 = "methodSignature"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.Object r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(r0, r3)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r3
            if (r3 == 0) goto L2f
            boolean r4 = r3.hasName()
            if (r4 == 0) goto L2f
            int r4 = r3.getName()
            goto L33
        L2f:
            int r4 = r0.getName()
        L33:
            if (r3 == 0) goto L47
            boolean r5 = r3.hasDesc()
            if (r5 == 0) goto L47
            int r0 = r3.getDesc()
            java.lang.String r0 = r1.getString(r0)
            r2 = r17
            goto Ldc
        L47:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.l(r0, r2)
            java.util.List r3 = kotlin.collections.f0.R(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List r5 = r0.getValueParameterList()
            java.lang.String r6 = "getValueParameterList(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r8 = kotlin.collections.f0.d0(r5, r7)
            r6.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L6b:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L82
            java.lang.Object r8 = r5.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r8
            kotlin.jvm.internal.g0.m(r8)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.r(r8, r2)
            r6.add(r8)
            goto L6b
        L82:
            java.util.List r3 = kotlin.collections.f0.I4(r3, r6)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r8 = new java.util.ArrayList
            int r5 = kotlin.collections.f0.d0(r3, r7)
            r8.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L95:
            boolean r5 = r3.hasNext()
            r6 = 0
            if (r5 == 0) goto Laf
            java.lang.Object r5 = r3.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r5
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r7 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a
            java.lang.String r5 = r7.g(r5, r1)
            if (r5 != 0) goto Lab
            return r6
        Lab:
            r8.add(r5)
            goto L95
        Laf:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.n(r0, r2)
            r2 = r17
            java.lang.String r0 = r2.g(r0, r1)
            if (r0 != 0) goto Lbc
            return r6
        Lbc:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r15 = 56
            r16 = 0
            java.lang.String r9 = ""
            java.lang.String r10 = "("
            java.lang.String r11 = ")"
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r5 = kotlin.collections.f0.r3(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        Ldc:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r3 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b
            java.lang.String r1 = r1.getString(r4)
            r3.<init>(r1, r0)
            return r3
    }
}
