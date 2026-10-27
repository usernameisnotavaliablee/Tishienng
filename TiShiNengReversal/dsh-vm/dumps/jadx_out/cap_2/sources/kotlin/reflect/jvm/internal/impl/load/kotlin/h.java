package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h extends kotlin.reflect.jvm.internal.impl.load.kotlin.d<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.f0 d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.k0 e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.f f;

    @org.jetbrains.annotations.NotNull
    private kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private abstract class a implements kotlin.reflect.jvm.internal.impl.load.kotlin.x.a {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.h a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.h$a$a, reason: collision with other inner class name */
        public static final class C0046a implements kotlin.reflect.jvm.internal.impl.load.kotlin.x.a {
            private final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.x.a a;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.h.a c;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f d;
            final /* synthetic */ java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> e;

            C0046a(kotlin.reflect.jvm.internal.impl.load.kotlin.x.a r1, kotlin.reflect.jvm.internal.impl.load.kotlin.h.a r2, kotlin.reflect.jvm.internal.impl.name.f r3, java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r4) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r0.d = r3
                    r0.e = r4
                    r0.<init>()
                    r0.a = r1
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
            public void a(kotlin.reflect.jvm.internal.impl.name.f r2, kotlin.reflect.jvm.internal.impl.name.b r3, kotlin.reflect.jvm.internal.impl.name.f r4) {
                    r1 = this;
                    java.lang.String r0 = "enumClassId"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    java.lang.String r0 = "enumEntryName"
                    kotlin.jvm.internal.g0.p(r4, r0)
                    kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r0 = r1.a
                    r0.a(r2, r3, r4)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
            public kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b(kotlin.reflect.jvm.internal.impl.name.f r2, kotlin.reflect.jvm.internal.impl.name.b r3) {
                    r1 = this;
                    java.lang.String r0 = "classId"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r0 = r1.a
                    kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r2 = r0.b(r2, r3)
                    return r2
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
            public void c(kotlin.reflect.jvm.internal.impl.name.f r2, kotlin.reflect.jvm.internal.impl.resolve.constants.f r3) {
                    r1 = this;
                    java.lang.String r0 = "value"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r0 = r1.a
                    r0.c(r2, r3)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
            public void d(kotlin.reflect.jvm.internal.impl.name.f r2, java.lang.Object r3) {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r0 = r1.a
                    r0.d(r2, r3)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
            public kotlin.reflect.jvm.internal.impl.load.kotlin.x.b e(kotlin.reflect.jvm.internal.impl.name.f r2) {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r0 = r1.a
                    kotlin.reflect.jvm.internal.impl.load.kotlin.x$b r2 = r0.e(r2)
                    return r2
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
            public void visitEnd() {
                    r4 = this;
                    kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r0 = r4.b
                    r0.visitEnd()
                    kotlin.reflect.jvm.internal.impl.load.kotlin.h$a r0 = r4.c
                    kotlin.reflect.jvm.internal.impl.name.f r1 = r4.d
                    kotlin.reflect.jvm.internal.impl.resolve.constants.a r2 = new kotlin.reflect.jvm.internal.impl.resolve.constants.a
                    java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r3 = r4.e
                    java.lang.Object r3 = kotlin.collections.f0.m5(r3)
                    kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r3 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r3
                    r2.<init>(r3)
                    r0.g(r1, r2)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class b implements kotlin.reflect.jvm.internal.impl.load.kotlin.x.b {
            private final java.util.ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.h b;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f c;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.h.a d;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.h$a$b$a, reason: collision with other inner class name */
            public static final class C0047a implements kotlin.reflect.jvm.internal.impl.load.kotlin.x.a {
                private final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.x.a a;
                final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b;
                final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.h.a.b c;
                final /* synthetic */ java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> d;

                C0047a(kotlin.reflect.jvm.internal.impl.load.kotlin.x.a r1, kotlin.reflect.jvm.internal.impl.load.kotlin.h.a.b r2, java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r3) {
                        r0 = this;
                        r0.b = r1
                        r0.c = r2
                        r0.d = r3
                        r0.<init>()
                        r0.a = r1
                        return
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
                public void a(kotlin.reflect.jvm.internal.impl.name.f r2, kotlin.reflect.jvm.internal.impl.name.b r3, kotlin.reflect.jvm.internal.impl.name.f r4) {
                        r1 = this;
                        java.lang.String r0 = "enumClassId"
                        kotlin.jvm.internal.g0.p(r3, r0)
                        java.lang.String r0 = "enumEntryName"
                        kotlin.jvm.internal.g0.p(r4, r0)
                        kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r0 = r1.a
                        r0.a(r2, r3, r4)
                        return
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
                public kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b(kotlin.reflect.jvm.internal.impl.name.f r2, kotlin.reflect.jvm.internal.impl.name.b r3) {
                        r1 = this;
                        java.lang.String r0 = "classId"
                        kotlin.jvm.internal.g0.p(r3, r0)
                        kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r0 = r1.a
                        kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r2 = r0.b(r2, r3)
                        return r2
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
                public void c(kotlin.reflect.jvm.internal.impl.name.f r2, kotlin.reflect.jvm.internal.impl.resolve.constants.f r3) {
                        r1 = this;
                        java.lang.String r0 = "value"
                        kotlin.jvm.internal.g0.p(r3, r0)
                        kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r0 = r1.a
                        r0.c(r2, r3)
                        return
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
                public void d(kotlin.reflect.jvm.internal.impl.name.f r2, java.lang.Object r3) {
                        r1 = this;
                        kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r0 = r1.a
                        r0.d(r2, r3)
                        return
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
                public kotlin.reflect.jvm.internal.impl.load.kotlin.x.b e(kotlin.reflect.jvm.internal.impl.name.f r2) {
                        r1 = this;
                        kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r0 = r1.a
                        kotlin.reflect.jvm.internal.impl.load.kotlin.x$b r2 = r0.e(r2)
                        return r2
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
                public void visitEnd() {
                        r3 = this;
                        kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r0 = r3.b
                        r0.visitEnd()
                        kotlin.reflect.jvm.internal.impl.load.kotlin.h$a$b r0 = r3.c
                        java.util.ArrayList r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.h.a.b.e(r0)
                        kotlin.reflect.jvm.internal.impl.resolve.constants.a r1 = new kotlin.reflect.jvm.internal.impl.resolve.constants.a
                        java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r2 = r3.d
                        java.lang.Object r2 = kotlin.collections.f0.m5(r2)
                        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r2
                        r1.<init>(r2)
                        r0.add(r1)
                        return
                }
            }

            b(kotlin.reflect.jvm.internal.impl.load.kotlin.h r1, kotlin.reflect.jvm.internal.impl.name.f r2, kotlin.reflect.jvm.internal.impl.load.kotlin.h.a r3) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r0.d = r3
                    r0.<init>()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    r0.a = r1
                    return
            }

            public static final /* synthetic */ java.util.ArrayList e(kotlin.reflect.jvm.internal.impl.load.kotlin.h.a.b r0) {
                    java.util.ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r0 = r0.a
                    return r0
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.b
            public void a(java.lang.Object r4) {
                    r3 = this;
                    java.util.ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r0 = r3.a
                    kotlin.reflect.jvm.internal.impl.load.kotlin.h r1 = r3.b
                    kotlin.reflect.jvm.internal.impl.name.f r2 = r3.c
                    kotlin.reflect.jvm.internal.impl.resolve.constants.g r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.h.N(r1, r2, r4)
                    r0.add(r4)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.b
            public kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b(kotlin.reflect.jvm.internal.impl.name.b r5) {
                    r4 = this;
                    java.lang.String r0 = "classId"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    kotlin.reflect.jvm.internal.impl.load.kotlin.h r1 = r4.b
                    kotlin.reflect.jvm.internal.impl.descriptors.e1 r2 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
                    java.lang.String r3 = "NO_SOURCE"
                    kotlin.jvm.internal.g0.o(r2, r3)
                    kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r5 = r1.x(r5, r2, r0)
                    kotlin.jvm.internal.g0.m(r5)
                    kotlin.reflect.jvm.internal.impl.load.kotlin.h$a$b$a r1 = new kotlin.reflect.jvm.internal.impl.load.kotlin.h$a$b$a
                    r1.<init>(r5, r4, r0)
                    return r1
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.b
            public void c(kotlin.reflect.jvm.internal.impl.name.b r3, kotlin.reflect.jvm.internal.impl.name.f r4) {
                    r2 = this;
                    java.lang.String r0 = "enumClassId"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    java.lang.String r0 = "enumEntryName"
                    kotlin.jvm.internal.g0.p(r4, r0)
                    java.util.ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r0 = r2.a
                    kotlin.reflect.jvm.internal.impl.resolve.constants.k r1 = new kotlin.reflect.jvm.internal.impl.resolve.constants.k
                    r1.<init>(r3, r4)
                    r0.add(r1)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.b
            public void d(kotlin.reflect.jvm.internal.impl.resolve.constants.f r3) {
                    r2 = this;
                    java.lang.String r0 = "value"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    java.util.ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r0 = r2.a
                    kotlin.reflect.jvm.internal.impl.resolve.constants.t r1 = new kotlin.reflect.jvm.internal.impl.resolve.constants.t
                    r1.<init>(r3)
                    r0.add(r1)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.b
            public void visitEnd() {
                    r3 = this;
                    kotlin.reflect.jvm.internal.impl.load.kotlin.h$a r0 = r3.d
                    kotlin.reflect.jvm.internal.impl.name.f r1 = r3.c
                    java.util.ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r2 = r3.a
                    r0.f(r1, r2)
                    return
            }
        }

        public a(kotlin.reflect.jvm.internal.impl.load.kotlin.h r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void a(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4) {
                r1 = this;
                java.lang.String r0 = "enumClassId"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "enumEntryName"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.reflect.jvm.internal.impl.resolve.constants.k r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.k
                r0.<init>(r3, r4)
                r1.g(r2, r0)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r6) {
                r4 = this;
                java.lang.String r0 = "classId"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.load.kotlin.h r1 = r4.a
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r2 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
                java.lang.String r3 = "NO_SOURCE"
                kotlin.jvm.internal.g0.o(r2, r3)
                kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r6 = r1.x(r6, r2, r0)
                kotlin.jvm.internal.g0.m(r6)
                kotlin.reflect.jvm.internal.impl.load.kotlin.h$a$a r1 = new kotlin.reflect.jvm.internal.impl.load.kotlin.h$a$a
                r1.<init>(r6, r4, r5, r0)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void c(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.constants.f r3) {
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.resolve.constants.t r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.t
                r0.<init>(r3)
                r1.g(r2, r0)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void d(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.load.kotlin.h r0 = r1.a
                kotlin.reflect.jvm.internal.impl.resolve.constants.g r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.h.N(r0, r2, r3)
                r1.g(r2, r3)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.load.kotlin.x.b e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r3) {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.load.kotlin.h$a$b r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.h$a$b
                kotlin.reflect.jvm.internal.impl.load.kotlin.h r1 = r2.a
                r0.<init>(r1, r3, r2)
                return r0
        }

        public abstract void f(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull java.util.ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r2);

        public abstract void g(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBinaryClassAnnotationAndConstantLoaderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryClassAnnotationAndConstantLoaderImpl.kt\norg/jetbrains/kotlin/load/kotlin/BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n808#2,11:246\n1634#2,3:257\n*S KotlinDebug\n*F\n+ 1 BinaryClassAnnotationAndConstantLoaderImpl.kt\norg/jetbrains/kotlin/load/kotlin/BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1\n*L\n93#1:246,11\n93#1:257,3\n*E\n"})
    public static final class b extends kotlin.reflect.jvm.internal.impl.load.kotlin.h.a {
        private final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.h c;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d d;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.b e;
        final /* synthetic */ java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e1 g;

        b(kotlin.reflect.jvm.internal.impl.load.kotlin.h r1, kotlin.reflect.jvm.internal.impl.descriptors.d r2, kotlin.reflect.jvm.internal.impl.name.b r3, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r4, kotlin.reflect.jvm.internal.impl.descriptors.e1 r5) {
                r0 = this;
                r0.c = r1
                r0.d = r2
                r0.e = r3
                r0.f = r4
                r0.g = r5
                r0.<init>(r1)
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.b = r1
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public void f(kotlin.reflect.jvm.internal.impl.name.f r5, java.util.ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r6) {
                r4 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r6, r0)
                if (r5 != 0) goto L8
                goto L78
            L8:
                kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r4.d
                kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(r5, r0)
                if (r0 == 0) goto L29
                java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r1 = r4.b
                kotlin.reflect.jvm.internal.impl.resolve.constants.i r2 = kotlin.reflect.jvm.internal.impl.resolve.constants.i.a
                java.util.List r6 = kotlin.reflect.jvm.internal.impl.utils.a.c(r6)
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
                java.lang.String r3 = "getType(...)"
                kotlin.jvm.internal.g0.o(r0, r3)
                kotlin.reflect.jvm.internal.impl.resolve.constants.b r6 = r2.c(r6, r0)
                r1.put(r5, r6)
                return
            L29:
                kotlin.reflect.jvm.internal.impl.load.kotlin.h r0 = r4.c
                kotlin.reflect.jvm.internal.impl.name.b r1 = r4.e
                boolean r0 = r0.w(r1)
                if (r0 == 0) goto L78
                java.lang.String r5 = r5.b()
                java.lang.String r0 = "value"
                boolean r5 = kotlin.jvm.internal.g0.g(r5, r0)
                if (r5 == 0) goto L78
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r6 = r6.iterator()
            L48:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L5a
                java.lang.Object r0 = r6.next()
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.a
                if (r1 == 0) goto L48
                r5.add(r0)
                goto L48
            L5a:
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r6 = r4.f
                java.util.Collection r6 = (java.util.Collection) r6
                java.util.Iterator r5 = r5.iterator()
            L62:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L78
                java.lang.Object r0 = r5.next()
                kotlin.reflect.jvm.internal.impl.resolve.constants.a r0 = (kotlin.reflect.jvm.internal.impl.resolve.constants.a) r0
                java.lang.Object r0 = r0.a()
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r0 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r0
                r6.add(r0)
                goto L62
            L78:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public void g(kotlin.reflect.jvm.internal.impl.name.f r2, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> r3) {
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r3, r0)
                if (r2 == 0) goto Lc
                java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r0 = r1.b
                r0.put(r2, r3)
            Lc:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.a
        public void visitEnd() {
                r5 = this;
                kotlin.reflect.jvm.internal.impl.load.kotlin.h r0 = r5.c
                kotlin.reflect.jvm.internal.impl.name.b r1 = r5.e
                java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r2 = r5.b
                boolean r0 = r0.F(r1, r2)
                if (r0 == 0) goto Ld
                goto L17
            Ld:
                kotlin.reflect.jvm.internal.impl.load.kotlin.h r0 = r5.c
                kotlin.reflect.jvm.internal.impl.name.b r1 = r5.e
                boolean r0 = r0.w(r1)
                if (r0 == 0) goto L18
            L17:
                return
            L18:
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r0 = r5.f
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.d r1 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d
                kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r5.d
                kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.s()
                java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r3 = r5.b
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r4 = r5.g
                r1.<init>(r2, r3, r4)
                r0.add(r1)
                return
        }
    }

    public h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.v r5) {
            r1 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "notFoundClasses"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "kotlinClassFinder"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>(r4, r5)
            r1.d = r2
            r1.e = r3
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.f r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
            r4.<init>(r2, r3)
            r1.f = r4
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.c.i
            r1.g = r2
            return
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.g N(kotlin.reflect.jvm.internal.impl.load.kotlin.h r0, kotlin.reflect.jvm.internal.impl.name.f r1, java.lang.Object r2) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r0 = r0.O(r1, r2)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> O(kotlin.reflect.jvm.internal.impl.name.f r3, java.lang.Object r4) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.resolve.constants.i r0 = kotlin.reflect.jvm.internal.impl.resolve.constants.i.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = r2.d
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r4 = r0.e(r4, r1)
            if (r4 != 0) goto L22
            kotlin.reflect.jvm.internal.impl.resolve.constants.l$a r4 = kotlin.reflect.jvm.internal.impl.resolve.constants.l.b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported annotation argument: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            kotlin.reflect.jvm.internal.impl.resolve.constants.l r3 = r4.a(r3)
            return r3
        L22:
            return r4
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d R(kotlin.reflect.jvm.internal.impl.name.b r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r2.d
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r1 = r2.e
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = kotlin.reflect.jvm.internal.impl.descriptors.x.d(r0, r3, r1)
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.d
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> I(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r1 = r0.Q(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.d
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> M(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r1 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r1
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r1 = r0.T(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c P(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3) {
            r1 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.f r0 = r1.f
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2 = r0.a(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    protected kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> Q(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.Object r6) {
            r4 = this;
            java.lang.String r0 = "desc"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 2
            r1 = 0
            java.lang.String r2 = "ZBCS"
            r3 = 0
            boolean r0 = kotlin.text.u.l3(r2, r5, r3, r0, r1)
            if (r0 == 0) goto L6f
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r0 = r5.hashCode()
            r1 = 66
            if (r0 == r1) goto L5b
            r1 = 67
            if (r0 == r1) goto L4d
            r1 = 83
            if (r0 == r1) goto L3f
            r1 = 90
            if (r0 != r1) goto L69
            java.lang.String r0 = "Z"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L69
            if (r6 == 0) goto L3a
            r3 = 1
        L3a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            goto L6f
        L3f:
            java.lang.String r0 = "S"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L69
            short r5 = (short) r6
            java.lang.Short r6 = java.lang.Short.valueOf(r5)
            goto L6f
        L4d:
            java.lang.String r0 = "C"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L69
            char r5 = (char) r6
            java.lang.Character r6 = java.lang.Character.valueOf(r5)
            goto L6f
        L5b:
            java.lang.String r0 = "B"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L69
            byte r5 = (byte) r6
            java.lang.Byte r6 = java.lang.Byte.valueOf(r5)
            goto L6f
        L69:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>(r5)
            throw r6
        L6f:
            kotlin.reflect.jvm.internal.impl.resolve.constants.i r5 = kotlin.reflect.jvm.internal.impl.resolve.constants.i.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r4.d
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r5 = r5.e(r6, r0)
            return r5
    }

    public void S(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.g = r2
            return
    }

    @org.jetbrains.annotations.Nullable
    protected kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> T(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> r4) {
            r3 = this;
            java.lang.String r0 = "constant"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.d
            if (r0 == 0) goto L1b
            kotlin.reflect.jvm.internal.impl.resolve.constants.b0 r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.b0
            kotlin.reflect.jvm.internal.impl.resolve.constants.d r4 = (kotlin.reflect.jvm.internal.impl.resolve.constants.d) r4
            java.lang.Object r4 = r4.a()
            java.lang.Number r4 = (java.lang.Number) r4
            byte r4 = r4.byteValue()
            r0.<init>(r4)
            return r0
        L1b:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.x
            if (r0 == 0) goto L31
            kotlin.reflect.jvm.internal.impl.resolve.constants.e0 r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.e0
            kotlin.reflect.jvm.internal.impl.resolve.constants.x r4 = (kotlin.reflect.jvm.internal.impl.resolve.constants.x) r4
            java.lang.Object r4 = r4.a()
            java.lang.Number r4 = (java.lang.Number) r4
            short r4 = r4.shortValue()
            r0.<init>(r4)
            return r0
        L31:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.n
            if (r0 == 0) goto L47
            kotlin.reflect.jvm.internal.impl.resolve.constants.c0 r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.c0
            kotlin.reflect.jvm.internal.impl.resolve.constants.n r4 = (kotlin.reflect.jvm.internal.impl.resolve.constants.n) r4
            java.lang.Object r4 = r4.a()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r0.<init>(r4)
            return r0
        L47:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.u
            if (r0 == 0) goto L5d
            kotlin.reflect.jvm.internal.impl.resolve.constants.d0 r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.d0
            kotlin.reflect.jvm.internal.impl.resolve.constants.u r4 = (kotlin.reflect.jvm.internal.impl.resolve.constants.u) r4
            java.lang.Object r4 = r4.a()
            java.lang.Number r4 = (java.lang.Number) r4
            long r1 = r4.longValue()
            r0.<init>(r1)
            return r0
        L5d:
            return r4
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.e, kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    public /* bridge */ /* synthetic */ java.lang.Object k(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation r1, kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = r0.P(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.e
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.c v() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r0 = r1.g
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.e
    @org.jetbrains.annotations.Nullable
    protected kotlin.reflect.jvm.internal.impl.load.kotlin.x.a x(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r9, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r10) {
            r7 = this;
            java.lang.String r0 = "annotationClassId"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r10, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = r7.R(r8)
            kotlin.reflect.jvm.internal.impl.load.kotlin.h$b r1 = new kotlin.reflect.jvm.internal.impl.load.kotlin.h$b
            r2 = r7
            r4 = r8
            r6 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }
}
