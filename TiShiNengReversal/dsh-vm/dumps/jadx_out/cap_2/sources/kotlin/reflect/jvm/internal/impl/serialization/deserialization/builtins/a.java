package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBuiltInSerializerProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInSerializerProtocol.kt\norg/jetbrains/kotlin/serialization/deserialization/builtins/BuiltInSerializerProtocol\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a extends b4.a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a r = null;

    static {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.r = r0
            return
    }

    private a() {
            r18 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.f r1 = kotlin.reflect.jvm.internal.impl.protobuf.f.d()
            y3.b.a(r1)
            java.lang.String r0 = "apply(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r2 = y3.b.a
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.g0.o(r2, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r3 = y3.b.c
            java.lang.String r0 = "constructorAnnotation"
            kotlin.jvm.internal.g0.o(r3, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r4 = y3.b.b
            java.lang.String r0 = "classAnnotation"
            kotlin.jvm.internal.g0.o(r4, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r5 = y3.b.d
            java.lang.String r0 = "functionAnnotation"
            kotlin.jvm.internal.g0.o(r5, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r7 = y3.b.e
            java.lang.String r0 = "propertyAnnotation"
            kotlin.jvm.internal.g0.o(r7, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r8 = y3.b.f
            java.lang.String r0 = "propertyGetterAnnotation"
            kotlin.jvm.internal.g0.o(r8, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r9 = y3.b.g
            java.lang.String r0 = "propertySetterAnnotation"
            kotlin.jvm.internal.g0.o(r9, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r13 = y3.b.i
            java.lang.String r0 = "enumEntryAnnotation"
            kotlin.jvm.internal.g0.o(r13, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r14 = y3.b.h
            java.lang.String r0 = "compileTimeValue"
            kotlin.jvm.internal.g0.o(r14, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r15 = y3.b.j
            java.lang.String r0 = "parameterAnnotation"
            kotlin.jvm.internal.g0.o(r15, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r0 = y3.b.k
            java.lang.String r6 = "typeAnnotation"
            kotlin.jvm.internal.g0.o(r0, r6)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r6 = y3.b.l
            java.lang.String r10 = "typeParameterAnnotation"
            kotlin.jvm.internal.g0.o(r6, r10)
            r17 = r6
            r6 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = r0
            r0 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
    }

    private final java.lang.String s(kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            boolean r0 = r2.c()
            if (r0 == 0) goto L9
            java.lang.String r2 = "default-package"
            return r2
        L9:
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.f()
            java.lang.String r2 = r2.b()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r1.s(r2)
            r0.append(r2)
            java.lang.String r2 = ".kotlin_builtins"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r8) {
            r7 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.a()
            r5 = 4
            r6 = 0
            r2 = 46
            r3 = 47
            r4 = 0
            java.lang.String r1 = kotlin.text.u.w2(r1, r2, r3, r4, r5, r6)
            r0.append(r1)
            r1 = 47
            r0.append(r1)
            java.lang.String r8 = r7.q(r8)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            return r8
    }
}
