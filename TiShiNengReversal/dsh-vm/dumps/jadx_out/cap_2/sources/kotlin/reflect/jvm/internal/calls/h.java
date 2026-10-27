package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class h<M extends java.lang.reflect.Member> implements kotlin.reflect.jvm.internal.calls.g<M> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.calls.h.d e = null;

    @org.jetbrains.annotations.NotNull
    private final M a;

    @org.jetbrains.annotations.NotNull
    private final java.lang.reflect.Type b;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Class<?> c;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.reflect.Type> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,281:1\n278#2:282\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor\n*L\n76#1:282\n*E\n"})
    public static final class a extends kotlin.reflect.jvm.internal.calls.h<java.lang.reflect.Constructor<?>> implements kotlin.reflect.jvm.internal.calls.f {

        @org.jetbrains.annotations.Nullable
        private final java.lang.Object f;

        public a(@org.jetbrains.annotations.NotNull java.lang.reflect.Constructor<?> r8, @org.jetbrains.annotations.Nullable java.lang.Object r9) {
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.g0.o(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L1f
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L26
            L1f:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = kotlin.collections.n.l1(r0, r2, r1)
            L26:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r1.f = r9
                return
        }

        @Override // kotlin.reflect.jvm.internal.calls.g
        @org.jetbrains.annotations.Nullable
        public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r4) {
                r3 = this;
                java.lang.String r0 = "args"
                kotlin.jvm.internal.g0.p(r4, r0)
                r3.d(r4)
                java.lang.reflect.Member r0 = r3.c()
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                kotlin.jvm.internal.s0 r1 = new kotlin.jvm.internal.s0
                r2 = 3
                r1.<init>(r2)
                java.lang.Object r2 = r3.f
                r1.a(r2)
                r1.b(r4)
                r4 = 0
                r1.a(r4)
                int r4 = r1.c()
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Object[] r4 = r1.d(r4)
                java.lang.Object r4 = r0.newInstance(r4)
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,281:1\n274#2:282\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor\n*L\n62#1:282\n*E\n"})
    public static final class b extends kotlin.reflect.jvm.internal.calls.h<java.lang.reflect.Constructor<?>> {
        public b(@org.jetbrains.annotations.NotNull java.lang.reflect.Constructor<?> r8) {
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.g0.o(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                int r1 = r0.length
                r2 = 0
                r4 = 1
                if (r1 > r4) goto L1f
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L25
            L1f:
                int r1 = r0.length
                int r1 = r1 - r4
                java.lang.Object[] r0 = kotlin.collections.n.l1(r0, r2, r1)
            L25:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
        }

        @Override // kotlin.reflect.jvm.internal.calls.g
        @org.jetbrains.annotations.Nullable
        public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r4) {
                r3 = this;
                java.lang.String r0 = "args"
                kotlin.jvm.internal.g0.p(r4, r0)
                r3.d(r4)
                java.lang.reflect.Member r0 = r3.c()
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                kotlin.jvm.internal.s0 r1 = new kotlin.jvm.internal.s0
                r2 = 2
                r1.<init>(r2)
                r1.b(r4)
                r4 = 0
                r1.a(r4)
                int r4 = r1.c()
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Object[] r4 = r1.d(r4)
                java.lang.Object r4 = r0.newInstance(r4)
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends kotlin.reflect.jvm.internal.calls.h<java.lang.reflect.Constructor<?>> implements kotlin.reflect.jvm.internal.calls.f {

        @org.jetbrains.annotations.Nullable
        private final java.lang.Object f;

        public c(@org.jetbrains.annotations.NotNull java.lang.reflect.Constructor<?> r8, @org.jetbrains.annotations.Nullable java.lang.Object r9) {
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.g0.o(r3, r0)
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.g0.o(r5, r0)
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r1.f = r9
                return
        }

        @Override // kotlin.reflect.jvm.internal.calls.g
        @org.jetbrains.annotations.Nullable
        public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r4) {
                r3 = this;
                java.lang.String r0 = "args"
                kotlin.jvm.internal.g0.p(r4, r0)
                r3.d(r4)
                java.lang.reflect.Member r0 = r3.c()
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                kotlin.jvm.internal.s0 r1 = new kotlin.jvm.internal.s0
                r2 = 2
                r1.<init>(r2)
                java.lang.Object r2 = r3.f
                r1.a(r2)
                r1.b(r4)
                int r4 = r1.c()
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Object[] r4 = r1.d(r4)
                java.lang.Object r4 = r0.newInstance(r4)
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d {
        private d() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ d(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class e extends kotlin.reflect.jvm.internal.calls.h<java.lang.reflect.Constructor<?>> {
        public e(@org.jetbrains.annotations.NotNull java.lang.reflect.Constructor<?> r8) {
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.g0.o(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L24
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L24
            L22:
                r4 = r1
                goto L26
            L24:
                r1 = 0
                goto L22
            L26:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.g0.o(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
        }

        @Override // kotlin.reflect.jvm.internal.calls.g
        @org.jetbrains.annotations.Nullable
        public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r3) {
                r2 = this;
                java.lang.String r0 = "args"
                kotlin.jvm.internal.g0.p(r3, r0)
                r2.d(r3)
                java.lang.reflect.Member r0 = r2.c()
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                int r1 = r3.length
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
                java.lang.Object r3 = r0.newInstance(r3)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class f extends kotlin.reflect.jvm.internal.calls.h<java.lang.reflect.Field> {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class a extends kotlin.reflect.jvm.internal.calls.h.f implements kotlin.reflect.jvm.internal.calls.f {

            @org.jetbrains.annotations.Nullable
            private final java.lang.Object f;

            public a(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
                    r2 = this;
                    java.lang.String r0 = "field"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r0 = 0
                    r1 = 0
                    r2.<init>(r3, r0, r1)
                    r2.f = r4
                    return
            }

            @Override // kotlin.reflect.jvm.internal.calls.h.f, kotlin.reflect.jvm.internal.calls.g
            @org.jetbrains.annotations.Nullable
            public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r2) {
                    r1 = this;
                    java.lang.String r0 = "args"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    r1.d(r2)
                    java.lang.reflect.Member r2 = r1.c()
                    java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
                    java.lang.Object r0 = r1.f
                    java.lang.Object r2 = r2.get(r0)
                    return r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class b extends kotlin.reflect.jvm.internal.calls.h.f implements kotlin.reflect.jvm.internal.calls.f {
            public b(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r3) {
                    r2 = this;
                    java.lang.String r0 = "field"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r0 = 0
                    r1 = 0
                    r2.<init>(r3, r0, r1)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class c extends kotlin.reflect.jvm.internal.calls.h.f {
            public c(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r3) {
                    r2 = this;
                    java.lang.String r0 = "field"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r0 = 1
                    r1 = 0
                    r2.<init>(r3, r0, r1)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class d extends kotlin.reflect.jvm.internal.calls.h.f {
            public d(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r3) {
                    r2 = this;
                    java.lang.String r0 = "field"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r0 = 1
                    r1 = 0
                    r2.<init>(r3, r0, r1)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.calls.h
            public void d(@org.jetbrains.annotations.NotNull java.lang.Object[] r2) {
                    r1 = this;
                    java.lang.String r0 = "args"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    super.d(r2)
                    java.lang.Object r2 = kotlin.collections.n.Fc(r2)
                    r1.e(r2)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class e extends kotlin.reflect.jvm.internal.calls.h.f {
            public e(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r3) {
                    r2 = this;
                    java.lang.String r0 = "field"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r0 = 0
                    r1 = 0
                    r2.<init>(r3, r0, r1)
                    return
            }
        }

        private f(java.lang.reflect.Field r7, boolean r8) {
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r0 = "getGenericType(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                if (r8 == 0) goto L11
                java.lang.Class r8 = r7.getDeclaringClass()
            Lf:
                r3 = r8
                goto L13
            L11:
                r8 = 0
                goto Lf
            L13:
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public /* synthetic */ f(java.lang.reflect.Field r1, boolean r2, kotlin.jvm.internal.v r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.reflect.jvm.internal.calls.g
        @org.jetbrains.annotations.Nullable
        public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r3) {
                r2 = this;
                java.lang.String r0 = "args"
                kotlin.jvm.internal.g0.p(r3, r0)
                r2.d(r3)
                java.lang.reflect.Member r0 = r2.c()
                java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
                java.lang.Class r1 = r2.h()
                if (r1 == 0) goto L19
                java.lang.Object r3 = kotlin.collections.n.jc(r3)
                goto L1a
            L19:
                r3 = 0
            L1a:
                java.lang.Object r3 = r0.get(r3)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class g extends kotlin.reflect.jvm.internal.calls.h<java.lang.reflect.Field> {
        private final boolean f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class a extends kotlin.reflect.jvm.internal.calls.h.g implements kotlin.reflect.jvm.internal.calls.f {

            @org.jetbrains.annotations.Nullable
            private final java.lang.Object g;

            public a(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r3, boolean r4, @org.jetbrains.annotations.Nullable java.lang.Object r5) {
                    r2 = this;
                    java.lang.String r0 = "field"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r0 = 0
                    r1 = 0
                    r2.<init>(r3, r4, r0, r1)
                    r2.g = r5
                    return
            }

            @Override // kotlin.reflect.jvm.internal.calls.h.g, kotlin.reflect.jvm.internal.calls.g
            @org.jetbrains.annotations.NotNull
            public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r3) {
                    r2 = this;
                    java.lang.String r0 = "args"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r2.d(r3)
                    java.lang.reflect.Member r0 = r2.c()
                    java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
                    java.lang.Object r1 = r2.g
                    java.lang.Object r3 = kotlin.collections.n.jc(r3)
                    r0.set(r1, r3)
                    kotlin.n1 r3 = kotlin.n1.a
                    return r3
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class b extends kotlin.reflect.jvm.internal.calls.h.g implements kotlin.reflect.jvm.internal.calls.f {
            public b(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r3, boolean r4) {
                    r2 = this;
                    java.lang.String r0 = "field"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r0 = 0
                    r1 = 0
                    r2.<init>(r3, r4, r0, r1)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.calls.h.g, kotlin.reflect.jvm.internal.calls.g
            @org.jetbrains.annotations.NotNull
            public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r3) {
                    r2 = this;
                    java.lang.String r0 = "args"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r2.d(r3)
                    java.lang.reflect.Member r0 = r2.c()
                    java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
                    r1 = 0
                    java.lang.Object r3 = kotlin.collections.n.Th(r3)
                    r0.set(r1, r3)
                    kotlin.n1 r3 = kotlin.n1.a
                    return r3
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class c extends kotlin.reflect.jvm.internal.calls.h.g {
            public c(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r3, boolean r4) {
                    r2 = this;
                    java.lang.String r0 = "field"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r0 = 1
                    r1 = 0
                    r2.<init>(r3, r4, r0, r1)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class d extends kotlin.reflect.jvm.internal.calls.h.g {
            public d(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r3, boolean r4) {
                    r2 = this;
                    java.lang.String r0 = "field"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r0 = 1
                    r1 = 0
                    r2.<init>(r3, r4, r0, r1)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.calls.h.g, kotlin.reflect.jvm.internal.calls.h
            public void d(@org.jetbrains.annotations.NotNull java.lang.Object[] r2) {
                    r1 = this;
                    java.lang.String r0 = "args"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    super.d(r2)
                    java.lang.Object r2 = kotlin.collections.n.Fc(r2)
                    r1.e(r2)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class e extends kotlin.reflect.jvm.internal.calls.h.g {
            public e(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r3, boolean r4) {
                    r2 = this;
                    java.lang.String r0 = "field"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r0 = 0
                    r1 = 0
                    r2.<init>(r3, r4, r0, r1)
                    return
            }
        }

        private g(java.lang.reflect.Field r8, boolean r9, boolean r10) {
                r7 = this;
                java.lang.String r0 = "TYPE"
                java.lang.Class r3 = java.lang.Void.TYPE
                kotlin.jvm.internal.g0.o(r3, r0)
                if (r10 == 0) goto Lf
                java.lang.Class r10 = r8.getDeclaringClass()
            Ld:
                r4 = r10
                goto L11
            Lf:
                r10 = 0
                goto Ld
            L11:
                java.lang.reflect.Type r10 = r8.getGenericType()
                r0 = 1
                java.lang.reflect.Type[] r5 = new java.lang.reflect.Type[r0]
                r0 = 0
                r5[r0] = r10
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r1.f = r9
                return
        }

        public /* synthetic */ g(java.lang.reflect.Field r1, boolean r2, boolean r3, kotlin.jvm.internal.v r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // kotlin.reflect.jvm.internal.calls.g
        @org.jetbrains.annotations.Nullable
        public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r3) {
                r2 = this;
                java.lang.String r0 = "args"
                kotlin.jvm.internal.g0.p(r3, r0)
                r2.d(r3)
                java.lang.reflect.Member r0 = r2.c()
                java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
                java.lang.Class r1 = r2.h()
                if (r1 == 0) goto L19
                java.lang.Object r1 = kotlin.collections.n.jc(r3)
                goto L1a
            L19:
                r1 = 0
            L1a:
                java.lang.Object r3 = kotlin.collections.n.Th(r3)
                r0.set(r1, r3)
                kotlin.n1 r3 = kotlin.n1.a
                return r3
        }

        @Override // kotlin.reflect.jvm.internal.calls.h
        public void d(@org.jetbrains.annotations.NotNull java.lang.Object[] r2) {
                r1 = this;
                java.lang.String r0 = "args"
                kotlin.jvm.internal.g0.p(r2, r0)
                super.d(r2)
                boolean r0 = r1.f
                if (r0 == 0) goto L1b
                java.lang.Object r2 = kotlin.collections.n.Th(r2)
                if (r2 == 0) goto L13
                goto L1b
            L13:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "null is not allowed as a value for this property."
                r2.<init>(r0)
                throw r2
            L1b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.jvm.internal.calls.h$h, reason: collision with other inner class name */
    public static abstract class AbstractC0025h extends kotlin.reflect.jvm.internal.calls.h<java.lang.reflect.Method> {
        private final boolean f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.calls.h$h$a */
        public static final class a extends kotlin.reflect.jvm.internal.calls.h.AbstractC0025h implements kotlin.reflect.jvm.internal.calls.f {

            @org.jetbrains.annotations.Nullable
            private final java.lang.Object g;

            public a(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r8, @org.jetbrains.annotations.Nullable java.lang.Object r9) {
                    r7 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.g0.p(r8, r0)
                    r5 = 4
                    r6 = 0
                    r3 = 0
                    r4 = 0
                    r1 = r7
                    r2 = r8
                    r1.<init>(r2, r3, r4, r5, r6)
                    r1.g = r9
                    return
            }

            @Override // kotlin.reflect.jvm.internal.calls.g
            @org.jetbrains.annotations.Nullable
            public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r2) {
                    r1 = this;
                    java.lang.String r0 = "args"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    r1.d(r2)
                    java.lang.Object r0 = r1.g
                    java.lang.Object r2 = r1.i(r0, r2)
                    return r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.calls.h$h$b */
        public static final class b extends kotlin.reflect.jvm.internal.calls.h.AbstractC0025h implements kotlin.reflect.jvm.internal.calls.f {
            public b(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r8) {
                    r7 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.g0.p(r8, r0)
                    r5 = 4
                    r6 = 0
                    r3 = 0
                    r4 = 0
                    r1 = r7
                    r2 = r8
                    r1.<init>(r2, r3, r4, r5, r6)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.calls.g
            @org.jetbrains.annotations.Nullable
            public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r2) {
                    r1 = this;
                    java.lang.String r0 = "args"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    r1.d(r2)
                    r0 = 0
                    java.lang.Object r2 = r1.i(r0, r2)
                    return r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,281:1\n270#2:282\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic\n*L\n142#1:282\n*E\n"})
        /* renamed from: kotlin.reflect.jvm.internal.calls.h$h$c */
        public static final class c extends kotlin.reflect.jvm.internal.calls.h.AbstractC0025h implements kotlin.reflect.jvm.internal.calls.f {
            private final boolean g;

            @org.jetbrains.annotations.Nullable
            private final java.lang.Object h;

            public c(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r5, boolean r6, @org.jetbrains.annotations.Nullable java.lang.Object r7) {
                    r4 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "getGenericParameterTypes(...)"
                    kotlin.jvm.internal.g0.o(r0, r1)
                    int r1 = r0.length
                    r2 = 0
                    r3 = 1
                    if (r1 > r3) goto L16
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                    goto L1b
                L16:
                    int r1 = r0.length
                    java.lang.Object[] r0 = kotlin.collections.n.l1(r0, r3, r1)
                L1b:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r1 = 0
                    r4.<init>(r5, r2, r0, r1)
                    r4.g = r6
                    r4.h = r7
                    return
            }

            @Override // kotlin.reflect.jvm.internal.calls.g
            @org.jetbrains.annotations.Nullable
            public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r3) {
                    r2 = this;
                    java.lang.String r0 = "args"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r2.d(r3)
                    kotlin.jvm.internal.s0 r0 = new kotlin.jvm.internal.s0
                    r1 = 2
                    r0.<init>(r1)
                    java.lang.Object r1 = r2.h
                    r0.a(r1)
                    r0.b(r3)
                    int r3 = r0.c()
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    java.lang.Object[] r3 = r0.d(r3)
                    r0 = 0
                    java.lang.Object r3 = r2.i(r0, r3)
                    return r3
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Object j() {
                    r1 = this;
                    java.lang.Object r0 = r1.h
                    return r0
            }

            public final boolean k() {
                    r1 = this;
                    boolean r0 = r1.g
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,281:1\n37#2:282\n36#2,3:283\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass\n*L\n155#1:282\n155#1:283,3\n*E\n"})
        /* renamed from: kotlin.reflect.jvm.internal.calls.h$h$d */
        public static final class d extends kotlin.reflect.jvm.internal.calls.h.AbstractC0025h implements kotlin.reflect.jvm.internal.calls.f {

            @org.jetbrains.annotations.NotNull
            private final java.lang.Object[] g;

            public d(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r4, @org.jetbrains.annotations.NotNull java.lang.Object[] r5) {
                    r3 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.g0.p(r4, r0)
                    java.lang.String r0 = "boundReceiverComponents"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    java.lang.reflect.Type[] r0 = r4.getGenericParameterTypes()
                    java.lang.String r1 = "getGenericParameterTypes(...)"
                    kotlin.jvm.internal.g0.o(r0, r1)
                    int r1 = r5.length
                    java.util.List r0 = kotlin.collections.n.D9(r0, r1)
                    java.util.Collection r0 = (java.util.Collection) r0
                    r1 = 0
                    java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r1]
                    java.lang.Object[] r0 = r0.toArray(r2)
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r2 = 0
                    r3.<init>(r4, r1, r0, r2)
                    r3.g = r5
                    return
            }

            @Override // kotlin.reflect.jvm.internal.calls.g
            @org.jetbrains.annotations.Nullable
            public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r3) {
                    r2 = this;
                    java.lang.String r0 = "args"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r2.d(r3)
                    kotlin.jvm.internal.s0 r0 = new kotlin.jvm.internal.s0
                    r1 = 2
                    r0.<init>(r1)
                    java.lang.Object[] r1 = r2.g
                    r0.b(r1)
                    r0.b(r3)
                    int r3 = r0.c()
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    java.lang.Object[] r3 = r0.d(r3)
                    r0 = 0
                    java.lang.Object r3 = r2.i(r0, r3)
                    return r3
            }

            @org.jetbrains.annotations.NotNull
            public final java.lang.Object[] j() {
                    r1 = this;
                    java.lang.Object[] r0 = r1.g
                    return r0
            }

            public final int k() {
                    r1 = this;
                    java.lang.Object[] r0 = r1.g
                    int r0 = r0.length
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,281:1\n270#2:282\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance\n*L\n113#1:282\n*E\n"})
        /* renamed from: kotlin.reflect.jvm.internal.calls.h$h$e */
        public static final class e extends kotlin.reflect.jvm.internal.calls.h.AbstractC0025h {
            public e(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r8) {
                    r7 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.g0.p(r8, r0)
                    r5 = 6
                    r6 = 0
                    r3 = 0
                    r4 = 0
                    r1 = r7
                    r2 = r8
                    r1.<init>(r2, r3, r4, r5, r6)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.calls.g
            @org.jetbrains.annotations.Nullable
            public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r5) {
                    r4 = this;
                    java.lang.String r0 = "args"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    r4.d(r5)
                    r0 = 0
                    r1 = r5[r0]
                    int r2 = r5.length
                    r3 = 1
                    if (r2 > r3) goto L12
                    java.lang.Object[] r5 = new java.lang.Object[r0]
                    goto L17
                L12:
                    int r0 = r5.length
                    java.lang.Object[] r5 = kotlin.collections.n.l1(r5, r3, r0)
                L17:
                    java.lang.Object r5 = r4.i(r1, r5)
                    return r5
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,281:1\n270#2:282\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject\n*L\n121#1:282\n*E\n"})
        /* renamed from: kotlin.reflect.jvm.internal.calls.h$h$f */
        public static final class f extends kotlin.reflect.jvm.internal.calls.h.AbstractC0025h {
            public f(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r8) {
                    r7 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.g0.p(r8, r0)
                    r5 = 4
                    r6 = 0
                    r3 = 1
                    r4 = 0
                    r1 = r7
                    r2 = r8
                    r1.<init>(r2, r3, r4, r5, r6)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.calls.g
            @org.jetbrains.annotations.Nullable
            public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r3) {
                    r2 = this;
                    java.lang.String r0 = "args"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r2.d(r3)
                    java.lang.Object r0 = kotlin.collections.n.Fc(r3)
                    r2.e(r0)
                    int r0 = r3.length
                    r1 = 1
                    if (r0 > r1) goto L17
                    r3 = 0
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    goto L1c
                L17:
                    int r0 = r3.length
                    java.lang.Object[] r3 = kotlin.collections.n.l1(r3, r1, r0)
                L1c:
                    r0 = 0
                    java.lang.Object r3 = r2.i(r0, r3)
                    return r3
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.calls.h$h$g */
        public static final class g extends kotlin.reflect.jvm.internal.calls.h.AbstractC0025h {
            public g(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r8) {
                    r7 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.g0.p(r8, r0)
                    r5 = 6
                    r6 = 0
                    r3 = 0
                    r4 = 0
                    r1 = r7
                    r2 = r8
                    r1.<init>(r2, r3, r4, r5, r6)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.calls.g
            @org.jetbrains.annotations.Nullable
            public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r2) {
                    r1 = this;
                    java.lang.String r0 = "args"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    r1.d(r2)
                    r0 = 0
                    java.lang.Object r2 = r1.i(r0, r2)
                    return r2
            }
        }

        private AbstractC0025h(java.lang.reflect.Method r7, boolean r8, java.lang.reflect.Type[] r9) {
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericReturnType()
                java.lang.String r0 = "getGenericReturnType(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                if (r8 == 0) goto L11
                java.lang.Class r8 = r7.getDeclaringClass()
            Lf:
                r3 = r8
                goto L13
            L11:
                r8 = 0
                goto Lf
            L13:
                r5 = 0
                r0 = r6
                r1 = r7
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.reflect.Type r7 = r6.getReturnType()
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r7 = kotlin.jvm.internal.g0.g(r7, r8)
                r0.f = r7
                return
        }

        public /* synthetic */ AbstractC0025h(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, int r4, kotlin.jvm.internal.v r5) {
                r0 = this;
                r5 = r4 & 2
                if (r5 == 0) goto Le
                int r2 = r1.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r2 = r2 ^ 1
            Le:
                r4 = r4 & 4
                if (r4 == 0) goto L1b
                java.lang.reflect.Type[] r3 = r1.getGenericParameterTypes()
                java.lang.String r4 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.g0.o(r3, r4)
            L1b:
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public /* synthetic */ AbstractC0025h(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, kotlin.jvm.internal.v r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @org.jetbrains.annotations.Nullable
        protected final java.lang.Object i(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull java.lang.Object[] r4) {
                r2 = this;
                java.lang.String r0 = "args"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.reflect.Member r0 = r2.c()
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                int r1 = r4.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
                java.lang.Object r3 = r0.invoke(r3, r4)
                boolean r4 = r2.f
                if (r4 == 0) goto L1a
                kotlin.n1 r3 = kotlin.n1.a
            L1a:
                return r3
        }
    }

    static {
            kotlin.reflect.jvm.internal.calls.h$d r0 = new kotlin.reflect.jvm.internal.calls.h$d
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.calls.h.e = r0
            return
    }

    private h(M r1, java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type[] r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            if (r3 == 0) goto L27
            kotlin.jvm.internal.s0 r1 = new kotlin.jvm.internal.s0
            r2 = 2
            r1.<init>(r2)
            r1.a(r3)
            r1.b(r4)
            int r2 = r1.c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.d(r2)
            java.util.List r1 = kotlin.collections.f0.Q(r1)
            if (r1 != 0) goto L2b
        L27:
            java.util.List r1 = kotlin.collections.n.dz(r4)
        L2b:
            r0.d = r1
            return
    }

    public /* synthetic */ h(java.lang.reflect.Member r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type[] r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    public boolean a() {
            r1 = this;
            boolean r0 = r1.g()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.reflect.Type> b() {
            r1 = this;
            java.util.List<java.lang.reflect.Type> r0 = r1.d
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    @org.jetbrains.annotations.NotNull
    public final M c() {
            r1 = this;
            M extends java.lang.reflect.Member r0 = r1.a
            return r0
    }

    public void d(@org.jetbrains.annotations.NotNull java.lang.Object[] r1) {
            r0 = this;
            r0.f(r1)
            return
    }

    protected final void e(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            M extends java.lang.reflect.Member r0 = r1.a
            java.lang.Class r0 = r0.getDeclaringClass()
            boolean r2 = r0.isInstance(r2)
            if (r2 == 0) goto Lf
            return
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "An object member requires the object instance passed as the first argument."
            r2.<init>(r0)
            throw r2
    }

    public void f(java.lang.Object[] r4) {
            r3 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = kotlin.reflect.jvm.internal.calls.i.a(r3)
            int r1 = r4.length
            if (r0 != r1) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Callable expects "
            r1.append(r2)
            int r2 = kotlin.reflect.jvm.internal.calls.i.a(r3)
            r1.append(r2)
            java.lang.String r2 = " arguments, but "
            r1.append(r2)
            int r4 = r4.length
            r1.append(r4)
            java.lang.String r4 = " were provided."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public boolean g() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    @org.jetbrains.annotations.NotNull
    public final java.lang.reflect.Type getReturnType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Class<?> h() {
            r1 = this;
            java.lang.Class<?> r0 = r1.c
            return r0
    }
}
