package kotlin.reflect.jvm.internal.impl.km.internal.extensions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface p {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a a = null;

        @org.jetbrains.annotations.NotNull
        private static final kotlin.s<java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.p>> b = null;

        static {
                kotlin.reflect.jvm.internal.impl.km.internal.extensions.p$a r0 = new kotlin.reflect.jvm.internal.impl.km.internal.extensions.p$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a.a = r0
                kotlin.reflect.jvm.internal.impl.km.internal.extensions.o r0 = kotlin.reflect.jvm.internal.impl.km.internal.extensions.o.a
                kotlin.s r0 = kotlin.t.c(r0)
                kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a.b = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        private static final java.util.List a() {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.km.internal.extensions.p> r0 = kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.class
                java.lang.ClassLoader r1 = r0.getClassLoader()
                java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)
                java.lang.String r1 = "load(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                java.util.List r0 = kotlin.collections.f0.a6(r0)
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L1a
                return r0
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager"
                r0.<init>(r1)
                throw r0
        }

        static /* synthetic */ java.util.List b() {
                java.util.List r0 = a()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.p> c() {
                r1 = this;
                kotlin.s<java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.p>> r0 = kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a.b
                java.lang.Object r0 = r0.getValue()
                java.util.List r0 = (java.util.List) r0
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p$a r0 = kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a.a
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a = r0
            return
    }

    @org.jetbrains.annotations.Nullable
    kotlin.reflect.jvm.internal.impl.km.internal.extensions.k a();

    @org.jetbrains.annotations.Nullable
    kotlin.reflect.jvm.internal.impl.km.internal.extensions.d b();

    void c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.y r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.b r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.h r3);

    void d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.w r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r3);

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.km.internal.extensions.b e();

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.km.internal.extensions.c f();

    void g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.s r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r3);

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.km.internal.extensions.l h();

    void i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.w r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.b r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.h r3);

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.km.internal.extensions.m j();

    @org.jetbrains.annotations.Nullable
    kotlin.reflect.jvm.internal.impl.km.internal.extensions.n k();

    void l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.v r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r3);

    void m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.o r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r3);

    void n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.j r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r3);

    void o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.u r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.b r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.h r3);

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.km.internal.extensions.j p();

    void q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.u r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r3);

    void r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.g r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r3);

    void s(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.s r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.b r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.h r3);

    void t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.y r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r3);

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.km.internal.extensions.g u();

    void v(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.q r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r3);
}
