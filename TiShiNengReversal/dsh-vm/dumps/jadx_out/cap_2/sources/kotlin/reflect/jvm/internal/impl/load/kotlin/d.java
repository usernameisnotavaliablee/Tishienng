package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class d<A, C> extends kotlin.reflect.jvm.internal.impl.load.kotlin.e<A, kotlin.reflect.jvm.internal.impl.load.kotlin.g<? extends A, ? extends C>> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.d<A, C> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.load.kotlin.x, kotlin.reflect.jvm.internal.impl.load.kotlin.g<A, C>> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements kotlin.reflect.jvm.internal.impl.load.kotlin.x.d {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.d<A, C> a;
        final /* synthetic */ java.util.HashMap<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, java.util.List<A>> b;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.x c;
        final /* synthetic */ java.util.HashMap<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, C> d;
        final /* synthetic */ java.util.HashMap<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, C> e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.d$a$a, reason: collision with other inner class name */
        public final class C0044a extends kotlin.reflect.jvm.internal.impl.load.kotlin.d.a.b implements kotlin.reflect.jvm.internal.impl.load.kotlin.x.e {
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.d.a d;

            public C0044a(kotlin.reflect.jvm.internal.impl.load.kotlin.d.a r2, kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r3) {
                    r1 = this;
                    java.lang.String r0 = "signature"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r1.d = r2
                    r1.<init>(r2, r3)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.e
            public kotlin.reflect.jvm.internal.impl.load.kotlin.x.a a(int r3, kotlin.reflect.jvm.internal.impl.name.b r4, kotlin.reflect.jvm.internal.impl.descriptors.e1 r5) {
                    r2 = this;
                    java.lang.String r0 = "classId"
                    kotlin.jvm.internal.g0.p(r4, r0)
                    java.lang.String r0 = "source"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    kotlin.reflect.jvm.internal.impl.load.kotlin.a0$a r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.a0.b
                    kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r1 = r2.c()
                    kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r3 = r0.e(r1, r3)
                    kotlin.reflect.jvm.internal.impl.load.kotlin.d$a r0 = r2.d
                    java.util.HashMap<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, java.util.List<A>> r0 = r0.b
                    java.lang.Object r0 = r0.get(r3)
                    java.util.List r0 = (java.util.List) r0
                    if (r0 != 0) goto L2c
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    kotlin.reflect.jvm.internal.impl.load.kotlin.d$a r1 = r2.d
                    java.util.HashMap<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, java.util.List<A>> r1 = r1.b
                    r1.put(r3, r0)
                L2c:
                    kotlin.reflect.jvm.internal.impl.load.kotlin.d$a r3 = r2.d
                    kotlin.reflect.jvm.internal.impl.load.kotlin.d<A, C> r3 = r3.a
                    kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r3 = r3.y(r4, r5, r0)
                    return r3
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class b implements kotlin.reflect.jvm.internal.impl.load.kotlin.x.c {
            private final kotlin.reflect.jvm.internal.impl.load.kotlin.a0 a;
            private final java.util.ArrayList<A> b;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.d.a c;

            public b(kotlin.reflect.jvm.internal.impl.load.kotlin.d.a r2, kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r3) {
                    r1 = this;
                    java.lang.String r0 = "signature"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r1.c = r2
                    r1.<init>()
                    r1.a = r3
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    r1.b = r2
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.c
            public kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b(kotlin.reflect.jvm.internal.impl.name.b r3, kotlin.reflect.jvm.internal.impl.descriptors.e1 r4) {
                    r2 = this;
                    java.lang.String r0 = "classId"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    java.lang.String r0 = "source"
                    kotlin.jvm.internal.g0.p(r4, r0)
                    kotlin.reflect.jvm.internal.impl.load.kotlin.d$a r0 = r2.c
                    kotlin.reflect.jvm.internal.impl.load.kotlin.d<A, C> r0 = r0.a
                    java.util.ArrayList<A> r1 = r2.b
                    kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r3 = r0.y(r3, r4, r1)
                    return r3
            }

            protected final kotlin.reflect.jvm.internal.impl.load.kotlin.a0 c() {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r0 = r1.a
                    return r0
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.c
            public void visitEnd() {
                    r3 = this;
                    java.util.ArrayList<A> r0 = r3.b
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L13
                    kotlin.reflect.jvm.internal.impl.load.kotlin.d$a r0 = r3.c
                    java.util.HashMap<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, java.util.List<A>> r0 = r0.b
                    kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r1 = r3.a
                    java.util.ArrayList<A> r2 = r3.b
                    r0.put(r1, r2)
                L13:
                    return
            }
        }

        a(kotlin.reflect.jvm.internal.impl.load.kotlin.d<A, C> r1, java.util.HashMap<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, java.util.List<A>> r2, kotlin.reflect.jvm.internal.impl.load.kotlin.x r3, java.util.HashMap<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, C> r4, java.util.HashMap<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, C> r5) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.d
        public kotlin.reflect.jvm.internal.impl.load.kotlin.x.e a(kotlin.reflect.jvm.internal.impl.name.f r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "desc"
                kotlin.jvm.internal.g0.p(r5, r0)
                kotlin.reflect.jvm.internal.impl.load.kotlin.d$a$a r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.d$a$a
                kotlin.reflect.jvm.internal.impl.load.kotlin.a0$a r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.a0.b
                java.lang.String r4 = r4.b()
                java.lang.String r2 = "asString(...)"
                kotlin.jvm.internal.g0.o(r4, r2)
                kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r4 = r1.d(r4, r5)
                r0.<init>(r3, r4)
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.d
        public kotlin.reflect.jvm.internal.impl.load.kotlin.x.c b(kotlin.reflect.jvm.internal.impl.name.f r3, java.lang.String r4, java.lang.Object r5) {
                r2 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "desc"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.reflect.jvm.internal.impl.load.kotlin.a0$a r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.a0.b
                java.lang.String r3 = r3.b()
                java.lang.String r1 = "asString(...)"
                kotlin.jvm.internal.g0.o(r3, r1)
                kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r3 = r0.a(r3, r4)
                if (r5 == 0) goto L28
                kotlin.reflect.jvm.internal.impl.load.kotlin.d<A, C> r0 = r2.a
                java.lang.Object r4 = r0.I(r4, r5)
                if (r4 == 0) goto L28
                java.util.HashMap<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, C> r5 = r2.e
                r5.put(r3, r4)
            L28:
                kotlin.reflect.jvm.internal.impl.load.kotlin.d$a$b r4 = new kotlin.reflect.jvm.internal.impl.load.kotlin.d$a$b
                r4.<init>(r2, r3)
                return r4
        }
    }

    public d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.v r3) {
            r1 = this;
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "kotlinClassFinder"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r3)
            kotlin.reflect.jvm.internal.impl.load.kotlin.a r3 = new kotlin.reflect.jvm.internal.impl.load.kotlin.a
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.g r2 = r2.i(r3)
            r1.c = r2
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.g B(kotlin.reflect.jvm.internal.impl.load.kotlin.d r0, kotlin.reflect.jvm.internal.impl.load.kotlin.x r1) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.g r0 = L(r0, r1)
            return r0
    }

    static /* synthetic */ java.lang.Object C(kotlin.reflect.jvm.internal.impl.load.kotlin.g r0, kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r1) {
            java.lang.Object r0 = G(r0, r1)
            return r0
    }

    static /* synthetic */ java.lang.Object D(kotlin.reflect.jvm.internal.impl.load.kotlin.g r0, kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r1) {
            java.lang.Object r0 = K(r0, r1)
            return r0
    }

    private static final java.lang.Object G(kotlin.reflect.jvm.internal.impl.load.kotlin.g r1, kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r2) {
            java.lang.String r0 = "$this$loadConstantFromProperty"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map r1 = r1.b()
            java.lang.Object r1 = r1.get(r2)
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.load.kotlin.g<A, C> H(kotlin.reflect.jvm.internal.impl.load.kotlin.x r7) {
            r6 = this;
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            kotlin.reflect.jvm.internal.impl.load.kotlin.d$a r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.d$a
            r1 = r6
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            byte[] r7 = r6.r(r3)
            r3.d(r0, r7)
            kotlin.reflect.jvm.internal.impl.load.kotlin.g r7 = new kotlin.reflect.jvm.internal.impl.load.kotlin.g
            r7.<init>(r2, r5, r4)
            return r7
    }

    private final C J(kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r11, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r12, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r13, kotlin.reflect.jvm.internal.impl.types.t0 r14, kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.load.kotlin.g<? extends A, ? extends C>, ? super kotlin.reflect.jvm.internal.impl.load.kotlin.a0, ? extends C> r15) {
            r10 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.e$b r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.e.b
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.B
            int r2 = r12.getFlags()
            java.lang.Boolean r4 = r1.g(r2)
            boolean r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.f(r12)
            kotlin.reflect.jvm.internal.impl.load.kotlin.v r6 = r10.u()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r7 = r10.v()
            r2 = 1
            r3 = 1
            r1 = r11
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r11 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r11 = r10.p(r1, r11)
            r0 = 0
            if (r11 != 0) goto L27
            return r0
        L27:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r2 = r11.e()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r2 = r2.d()
            kotlin.reflect.jvm.internal.impl.load.kotlin.n$a r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.n.b
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r3 = r3.a()
            boolean r9 = r2.d(r3)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r6 = r1.b()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r7 = r1.d()
            r4 = r10
            r5 = r12
            r8 = r13
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r12 = r4.s(r5, r6, r7, r8, r9)
            if (r12 != 0) goto L4b
            return r0
        L4b:
            kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.load.kotlin.x, kotlin.reflect.jvm.internal.impl.load.kotlin.g<A, C>> r13 = r4.c
            java.lang.Object r11 = r13.invoke(r11)
            java.lang.Object r11 = r15.invoke(r11, r12)
            if (r11 != 0) goto L58
            return r0
        L58:
            boolean r12 = kotlin.reflect.jvm.internal.impl.builtins.q.d(r14)
            if (r12 == 0) goto L62
            java.lang.Object r11 = r10.M(r11)
        L62:
            return r11
    }

    private static final java.lang.Object K(kotlin.reflect.jvm.internal.impl.load.kotlin.g r1, kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r2) {
            java.lang.String r0 = "$this$loadConstantFromProperty"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map r1 = r1.c()
            java.lang.Object r1 = r1.get(r2)
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.load.kotlin.g L(kotlin.reflect.jvm.internal.impl.load.kotlin.d r1, kotlin.reflect.jvm.internal.impl.load.kotlin.x r2) {
            java.lang.String r0 = "kotlinClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.g r1 = r1.H(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.load.kotlin.g<A, C> E(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.x r2) {
            r1 = this;
            java.lang.String r0 = "binaryClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.load.kotlin.x, kotlin.reflect.jvm.internal.impl.load.kotlin.g<A, C>> r0 = r1.c
            java.lang.Object r2 = r0.invoke(r2)
            kotlin.reflect.jvm.internal.impl.load.kotlin.g r2 = (kotlin.reflect.jvm.internal.impl.load.kotlin.g) r2
            return r2
    }

    protected final boolean F(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r3, @org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r4) {
            r2 = this;
            java.lang.String r0 = "annotationClassId"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.a r0 = kotlin.reflect.jvm.internal.impl.a.a
            kotlin.reflect.jvm.internal.impl.name.b r0 = r0.a()
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            r0 = 0
            if (r3 != 0) goto L18
            return r0
        L18:
            java.lang.String r3 = "value"
            kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.name.f.h(r3)
            java.lang.Object r3 = r4.get(r3)
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.t
            r1 = 0
            if (r4 == 0) goto L2a
            kotlin.reflect.jvm.internal.impl.resolve.constants.t r3 = (kotlin.reflect.jvm.internal.impl.resolve.constants.t) r3
            goto L2b
        L2a:
            r3 = r1
        L2b:
            if (r3 != 0) goto L2e
            return r0
        L2e:
            java.lang.Object r3 = r3.a()
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.t.b.C0066b
            if (r4 == 0) goto L39
            r1 = r3
            kotlin.reflect.jvm.internal.impl.resolve.constants.t$b$b r1 = (kotlin.reflect.jvm.internal.impl.resolve.constants.t.b.C0066b) r1
        L39:
            if (r1 != 0) goto L3c
            return r0
        L3c:
            kotlin.reflect.jvm.internal.impl.name.b r3 = r1.b()
            boolean r3 = r2.w(r3)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    protected abstract C I(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.Object r2);

    @org.jetbrains.annotations.Nullable
    protected abstract C M(@org.jetbrains.annotations.NotNull C r1);

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @org.jetbrains.annotations.Nullable
    public C e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r10) {
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "expectedType"
            kotlin.jvm.internal.g0.p(r10, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY
            kotlin.reflect.jvm.internal.impl.load.kotlin.c r6 = kotlin.reflect.jvm.internal.impl.load.kotlin.c.a
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            java.lang.Object r8 = r1.J(r2, r3, r4, r5, r6)
            return r8
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @org.jetbrains.annotations.Nullable
    public C j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r10) {
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "expectedType"
            kotlin.jvm.internal.g0.p(r10, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER
            kotlin.reflect.jvm.internal.impl.load.kotlin.b r6 = kotlin.reflect.jvm.internal.impl.load.kotlin.b.a
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            java.lang.Object r8 = r1.J(r2, r3, r4, r5, r6)
            return r8
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.e
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.e.a q(kotlin.reflect.jvm.internal.impl.load.kotlin.x r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.g r1 = r0.E(r1)
            return r1
    }
}
