package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class m0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h b;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.descriptors.e1 c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class d;

        @org.jetbrains.annotations.Nullable
        private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a e;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.name.b f;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind g;
        private final boolean h;
        private final boolean i;

        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r4, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.e1 r5, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a r6) {
                r1 = this;
                java.lang.String r0 = "classProto"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "nameResolver"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "typeTable"
                kotlin.jvm.internal.g0.p(r4, r0)
                r0 = 0
                r1.<init>(r3, r4, r5, r0)
                r1.d = r2
                r1.e = r6
                int r4 = r2.getFqName()
                kotlin.reflect.jvm.internal.impl.name.b r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.a(r3, r4)
                r1.f = r3
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind> r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f
                int r4 = r2.getFlags()
                java.lang.Object r3 = r3.d(r4)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind) r3
                if (r3 != 0) goto L31
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r3 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.CLASS
            L31:
                r1.g = r3
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.g
                int r4 = r2.getFlags()
                java.lang.Boolean r3 = r3.g(r4)
                java.lang.String r4 = "get(...)"
                kotlin.jvm.internal.g0.o(r3, r4)
                boolean r3 = r3.booleanValue()
                r1.h = r3
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.h
                int r2 = r2.getFlags()
                java.lang.Boolean r2 = r3.g(r2)
                kotlin.jvm.internal.g0.o(r2, r4)
                boolean r2 = r2.booleanValue()
                r1.i = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.name.c a() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.name.b r0 = r1.f
                kotlin.reflect.jvm.internal.impl.name.c r0 = r0.a()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.name.b e() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.name.b r0 = r1.f
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class f() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r1.d
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind g() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r0 = r1.g
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a h() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$a r0 = r1.e
                return r0
        }

        public final boolean i() {
                r1 = this;
                boolean r0 = r1.h
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.name.c d;

        public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r4, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.e1 r5) {
                r1 = this;
                java.lang.String r0 = "fqName"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "nameResolver"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "typeTable"
                kotlin.jvm.internal.g0.p(r4, r0)
                r0 = 0
                r1.<init>(r3, r4, r5, r0)
                r1.d = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.name.c a() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.name.c r0 = r1.d
                return r0
        }
    }

    private m0(kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2, kotlin.reflect.jvm.internal.impl.descriptors.e1 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public /* synthetic */ m0(kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2, kotlin.reflect.jvm.internal.impl.descriptors.e1 r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.name.c a();

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.descriptors.e1 c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.c r1 = r2.a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
