package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class r {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,302:1\n6482#2:303\n*S KotlinDebug\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n*L\n88#1:303\n*E\n"})
    public static final class a extends kotlin.reflect.jvm.internal.r {

        @org.jetbrains.annotations.NotNull
        private final java.lang.Class<?> a;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.reflect.Method> b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n*L\n1#1,328:1\n88#2:329\n*E\n"})
        /* renamed from: kotlin.reflect.jvm.internal.r$a$a, reason: collision with other inner class name */
        public static final class C0079a<T> implements java.util.Comparator {
            public C0079a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.util.Comparator
            public final int compare(T r1, T r2) {
                    r0 = this;
                    java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                    java.lang.String r1 = r1.getName()
                    java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
                    java.lang.String r2 = r2.getName()
                    int r1 = kotlin.comparisons.a.l(r1, r2)
                    return r1
            }
        }

        public a(@org.jetbrains.annotations.NotNull java.lang.Class<?> r2) {
                r1 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                java.lang.reflect.Method[] r2 = r2.getDeclaredMethods()
                java.lang.String r0 = "getDeclaredMethods(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                kotlin.reflect.jvm.internal.r$a$a r0 = new kotlin.reflect.jvm.internal.r$a$a
                r0.<init>()
                java.util.List r2 = kotlin.collections.n.fw(r2, r0)
                r1.b = r2
                return
        }

        static /* synthetic */ java.lang.CharSequence b(java.lang.reflect.Method r0) {
                java.lang.CharSequence r0 = c(r0)
                return r0
        }

        private static final java.lang.CharSequence c(java.lang.reflect.Method r1) {
                java.lang.Class r1 = r1.getReturnType()
                java.lang.String r0 = "getReturnType(...)"
                kotlin.jvm.internal.g0.o(r1, r0)
                java.lang.String r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.f(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.r
        @org.jetbrains.annotations.NotNull
        public java.lang.String a() {
                r10 = this;
                java.util.List<java.lang.reflect.Method> r0 = r10.b
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                kotlin.reflect.jvm.internal.q r7 = kotlin.reflect.jvm.internal.q.a
                r8 = 24
                r9 = 0
                java.lang.String r2 = ""
                java.lang.String r3 = "<init>("
                java.lang.String r4 = ")V"
                r5 = 0
                r6 = 0
                java.lang.String r0 = kotlin.collections.f0.r3(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.reflect.Method> d() {
                r1 = this;
                java.util.List<java.lang.reflect.Method> r0 = r1.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.reflect.jvm.internal.r {

        @org.jetbrains.annotations.NotNull
        private final java.lang.reflect.Constructor<?> a;

        public b(@org.jetbrains.annotations.NotNull java.lang.reflect.Constructor<?> r2) {
                r1 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        static /* synthetic */ java.lang.CharSequence b(java.lang.Class r0) {
                java.lang.CharSequence r0 = c(r0)
                return r0
        }

        private static final java.lang.CharSequence c(java.lang.Class r0) {
                kotlin.jvm.internal.g0.m(r0)
                java.lang.String r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.f(r0)
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.r
        @org.jetbrains.annotations.NotNull
        public java.lang.String a() {
                r10 = this;
                java.lang.reflect.Constructor<?> r0 = r10.a
                java.lang.Class[] r1 = r0.getParameterTypes()
                java.lang.String r0 = "getParameterTypes(...)"
                kotlin.jvm.internal.g0.o(r1, r0)
                kotlin.reflect.jvm.internal.s r7 = kotlin.reflect.jvm.internal.s.a
                r8 = 24
                r9 = 0
                java.lang.String r2 = ""
                java.lang.String r3 = "<init>("
                java.lang.String r4 = ")V"
                r5 = 0
                r6 = 0
                java.lang.String r0 = kotlin.collections.n.Eh(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.reflect.Constructor<?> d() {
                r1 = this;
                java.lang.reflect.Constructor<?> r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends kotlin.reflect.jvm.internal.r {

        @org.jetbrains.annotations.NotNull
        private final java.lang.reflect.Method a;

        public c(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r2) {
                r1 = this;
                java.lang.String r0 = "method"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.r
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
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d extends kotlin.reflect.jvm.internal.r {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b a;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String b;

        public d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b r2) {
                r1 = this;
                java.lang.String r0 = "signature"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                java.lang.String r2 = r2.a()
                r1.b = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.r
        @org.jetbrains.annotations.NotNull
        public java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String b() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r0 = r1.a
                java.lang.String r0 = r0.d()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class e extends kotlin.reflect.jvm.internal.r {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b a;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String b;

        public e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b r2) {
                r1 = this;
                java.lang.String r0 = "signature"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                java.lang.String r2 = r2.a()
                r1.b = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.r
        @org.jetbrains.annotations.NotNull
        public java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String b() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r0 = r1.a
                java.lang.String r0 = r0.d()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String c() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r0 = r1.a
                java.lang.String r0 = r0.e()
                return r0
        }
    }

    private r() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ r(kotlin.jvm.internal.v r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String a();
}
