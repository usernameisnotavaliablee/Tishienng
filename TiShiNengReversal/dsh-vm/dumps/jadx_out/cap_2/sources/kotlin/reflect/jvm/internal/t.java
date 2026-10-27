package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class t {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.t {

        @org.jetbrains.annotations.NotNull
        private final java.lang.reflect.Field a;

        public a(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r2) {
                r1 = this;
                java.lang.String r0 = "field"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.t
        @org.jetbrains.annotations.NotNull
        public java.lang.String a() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.reflect.Field r1 = r3.a
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "getName(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                java.lang.String r1 = kotlin.reflect.jvm.internal.impl.load.java.h0.b(r1)
                r0.append(r1)
                java.lang.String r1 = "()"
                r0.append(r1)
                java.lang.reflect.Field r1 = r3.a
                java.lang.Class r1 = r1.getType()
                java.lang.String r2 = "getType(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                java.lang.String r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.f(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.reflect.Field b() {
                r1 = this;
                java.lang.reflect.Field r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.reflect.jvm.internal.t {

        @org.jetbrains.annotations.NotNull
        private final java.lang.reflect.Method a;

        @org.jetbrains.annotations.Nullable
        private final java.lang.reflect.Method b;

        public b(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r2, @org.jetbrains.annotations.Nullable java.lang.reflect.Method r3) {
                r1 = this;
                java.lang.String r0 = "getterMethod"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                r1.b = r3
                return
        }

        @Override // kotlin.reflect.jvm.internal.t
        @org.jetbrains.annotations.NotNull
        public java.lang.String a() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.a
                java.lang.String r0 = kotlin.reflect.jvm.internal.m3.b(r0)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.reflect.Method b() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.a
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.reflect.Method c() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
    public static final class c extends kotlin.reflect.jvm.internal.t {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.descriptors.w0 a;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property b;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature c;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d d;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h e;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String f;

        public c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r12) {
                r7 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.String r0 = "proto"
                kotlin.jvm.internal.g0.p(r9, r0)
                java.lang.String r0 = "signature"
                kotlin.jvm.internal.g0.p(r10, r0)
                java.lang.String r0 = "nameResolver"
                kotlin.jvm.internal.g0.p(r11, r0)
                java.lang.String r0 = "typeTable"
                kotlin.jvm.internal.g0.p(r12, r0)
                r0 = 0
                r7.<init>(r0)
                r7.a = r8
                r7.b = r9
                r7.c = r10
                r7.d = r11
                r7.e = r12
                boolean r0 = r10.hasGetter()
                if (r0 == 0) goto L55
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r9 = r10.getGetter()
                int r9 = r9.getName()
                java.lang.String r9 = r11.getString(r9)
                r8.append(r9)
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r9 = r10.getGetter()
                int r9 = r9.getDesc()
                java.lang.String r9 = r11.getString(r9)
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                goto L8b
            L55:
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a
                r5 = 8
                r6 = 0
                r4 = 0
                r1 = r9
                r2 = r11
                r3 = r12
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$a r9 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.d(r0, r1, r2, r3, r4, r5, r6)
                if (r9 == 0) goto L8e
                java.lang.String r8 = r9.b()
                java.lang.String r9 = r9.c()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r8 = kotlin.reflect.jvm.internal.impl.load.java.h0.b(r8)
                r10.append(r8)
                java.lang.String r8 = r7.c()
                r10.append(r8)
                java.lang.String r8 = "()"
                r10.append(r8)
                r10.append(r9)
                java.lang.String r8 = r10.toString()
            L8b:
                r7.f = r8
                return
            L8e:
                kotlin.reflect.jvm.internal.KotlinReflectionInternalError r9 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "No field signature for property: "
                r10.append(r11)
                r10.append(r8)
                java.lang.String r8 = r10.toString()
                r9.<init>(r8)
                throw r9
        }

        private final java.lang.String c() {
                r4 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r4.a
                kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.b()
                java.lang.String r1 = "getContainingDeclaration(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r4.a
                kotlin.reflect.jvm.internal.impl.descriptors.s r1 = r1.getVisibility()
                kotlin.reflect.jvm.internal.impl.descriptors.s r2 = kotlin.reflect.jvm.internal.impl.descriptors.r.d
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
                r2 = 36
                if (r1 == 0) goto L56
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n
                if (r1 == 0) goto L56
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n) r0
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r0.Z0()
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, java.lang.Integer> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.i
                java.lang.String r3 = "classModuleName"
                kotlin.jvm.internal.g0.o(r1, r3)
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(r0, r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L40
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1 = r4.d
                int r0 = r0.intValue()
                java.lang.String r0 = r1.getString(r0)
                if (r0 != 0) goto L42
            L40:
                java.lang.String r0 = "main"
            L42:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r0 = kotlin.reflect.jvm.internal.impl.name.g.b(r0)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            L56:
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r4.a
                kotlin.reflect.jvm.internal.impl.descriptors.s r1 = r1.getVisibility()
                kotlin.reflect.jvm.internal.impl.descriptors.s r3 = kotlin.reflect.jvm.internal.impl.descriptors.r.a
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 == 0) goto L99
                boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
                if (r0 == 0) goto L99
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r4.a
                java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor"
                kotlin.jvm.internal.g0.n(r0, r1)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0) r0
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r0 = r0.b0()
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.r
                if (r1 == 0) goto L99
                kotlin.reflect.jvm.internal.impl.load.kotlin.r r0 = (kotlin.reflect.jvm.internal.impl.load.kotlin.r) r0
                kotlin.reflect.jvm.internal.impl.resolve.jvm.d r1 = r0.f()
                if (r1 == 0) goto L99
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                kotlin.reflect.jvm.internal.impl.name.f r0 = r0.h()
                java.lang.String r0 = r0.b()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            L99:
                java.lang.String r0 = ""
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.t
        @org.jetbrains.annotations.NotNull
        public java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.f
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.descriptors.w0 b() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r1.a
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d d() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r1.d
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property e() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature f() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r0 = r1.c
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h g() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r0 = r1.e
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d extends kotlin.reflect.jvm.internal.t {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.r.e a;

        @org.jetbrains.annotations.Nullable
        private final kotlin.reflect.jvm.internal.r.e b;

        public d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.r.e r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.r.e r3) {
                r1 = this;
                java.lang.String r0 = "getterSignature"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                r1.b = r3
                return
        }

        @Override // kotlin.reflect.jvm.internal.t
        @org.jetbrains.annotations.NotNull
        public java.lang.String a() {
                r1 = this;
                kotlin.reflect.jvm.internal.r$e r0 = r1.a
                java.lang.String r0 = r0.a()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.r.e b() {
                r1 = this;
                kotlin.reflect.jvm.internal.r$e r0 = r1.a
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.r.e c() {
                r1 = this;
                kotlin.reflect.jvm.internal.r$e r0 = r1.b
                return r0
        }
    }

    private t() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ t(kotlin.jvm.internal.v r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String a();
}
