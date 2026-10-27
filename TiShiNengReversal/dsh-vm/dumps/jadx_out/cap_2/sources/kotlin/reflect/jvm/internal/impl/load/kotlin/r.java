package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJvmPackagePartSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmPackagePartSource.kt\norg/jetbrains/kotlin/load/kotlin/JvmPackagePartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class r implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.d b;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.d c;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.x<kotlin.reflect.jvm.internal.impl.metadata.deserialization.c> d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0 e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability f;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.x g;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String h;

    public r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.x r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r13, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.x<kotlin.reflect.jvm.internal.impl.metadata.deserialization.c> r14, boolean r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r16) {
            r10 = this;
            java.lang.String r0 = "kotlinClass"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "packageProto"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "abiStability"
            r8 = r16
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlin.reflect.jvm.internal.impl.name.b r0 = r11.c()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.b(r0)
            java.lang.String r0 = "byClassId(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r11.e()
            java.lang.String r0 = r0.e()
            r1 = 0
            if (r0 == 0) goto L3c
            int r3 = r0.length()
            if (r3 <= 0) goto L39
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r0 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(r0)
            goto L3a
        L39:
            r0 = r1
        L3a:
            r3 = r0
            goto L3d
        L3c:
            r3 = r1
        L3d:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0 r7 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0
            r0 = 2
            r7.<init>(r15, r1, r0, r1)
            r1 = r10
            r9 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.jvm.d r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.jvm.d r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r5, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.x<kotlin.reflect.jvm.internal.impl.metadata.deserialization.c> r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0 r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r8, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.kotlin.x r9) {
            r1 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "packageProto"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "preReleaseInfo"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "abiStability"
            kotlin.jvm.internal.g0.p(r8, r0)
            r1.<init>()
            r1.b = r2
            r1.c = r3
            r1.d = r6
            r1.e = r7
            r1.f = r8
            r1.g = r9
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, java.lang.Integer> r2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.m
            java.lang.String r3 = "packageModuleName"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.lang.Object r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(r4, r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L41
            int r2 = r2.intValue()
            java.lang.String r2 = r5.getString(r2)
            if (r2 != 0) goto L43
        L41:
            java.lang.String r2 = "main"
        L43:
            r1.h = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s
    @org.jetbrains.annotations.NotNull
    public java.lang.String a() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Class '"
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.b r1 = r2.d()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.a()
            java.lang.String r1 = r1.a()
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.f1 b() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.f1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.f1.a
            java.lang.String r1 = "NO_SOURCE_FILE"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.b d() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.name.b r0 = new kotlin.reflect.jvm.internal.impl.name.b
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r1 = r3.e()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.g()
            java.lang.String r2 = "getPackageFqName(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.name.f r2 = r3.h()
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.jvm.d e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.resolve.jvm.d f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.x g() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r0 = r1.g
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f h() {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r0 = r4.e()
            java.lang.String r0 = r0.f()
            java.lang.String r1 = "getInternalName(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r1 = 0
            r2 = 2
            r3 = 47
            java.lang.String r0 = kotlin.text.u.N5(r0, r3, r1, r2, r1)
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.h(r0)
            java.lang.String r1 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.kotlin.r> r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.r.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r1 = r2.e()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
