package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1#2:117\n11335#3:118\n11670#3,3:119\n12904#3,3:136\n1963#4,14:122\n*S KotlinDebug\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n*L\n45#1:118\n45#1:119,3\n82#1:136,3\n63#1:122,14\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n {
    private static final int a = 0;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.k b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> {
        final /* synthetic */ java.lang.reflect.Constructor<?> a;

        a(java.lang.reflect.Constructor<?> r1) {
                r0 = this;
                r0.a = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.Throwable a(@org.jetbrains.annotations.NotNull java.lang.Throwable r5) {
                r4 = this;
                java.lang.reflect.Constructor<?> r0 = r4.a
                java.lang.String r1 = r5.getMessage()
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r1
                r1 = 1
                r2[r1] = r5
                java.lang.Object r5 = r0.newInstance(r2)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Throwable"
                kotlin.jvm.internal.g0.n(r5, r0)
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                return r5
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Throwable invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Throwable r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt$createConstructor$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> {
        final /* synthetic */ java.lang.reflect.Constructor<?> a;

        b(java.lang.reflect.Constructor<?> r1) {
                r0 = this;
                r0.a = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.Throwable a(@org.jetbrains.annotations.NotNull java.lang.Throwable r5) {
                r4 = this;
                java.lang.reflect.Constructor<?> r0 = r4.a
                java.lang.String r1 = r5.getMessage()
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r1
                java.lang.Object r0 = r0.newInstance(r2)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Throwable"
                kotlin.jvm.internal.g0.n(r0, r1)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                r0.initCause(r5)
                return r0
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Throwable invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Throwable r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> {
        final /* synthetic */ java.lang.reflect.Constructor<?> a;

        c(java.lang.reflect.Constructor<?> r1) {
                r0 = this;
                r0.a = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.Throwable a(@org.jetbrains.annotations.NotNull java.lang.Throwable r4) {
                r3 = this;
                java.lang.reflect.Constructor<?> r0 = r3.a
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                java.lang.Object r4 = r0.newInstance(r1)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Throwable"
                kotlin.jvm.internal.g0.n(r4, r0)
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                return r4
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Throwable invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Throwable r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt$createConstructor$1$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> {
        final /* synthetic */ java.lang.reflect.Constructor<?> a;

        d(java.lang.reflect.Constructor<?> r1) {
                r0 = this;
                r0.a = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.Throwable a(@org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
                r2 = this;
                java.lang.reflect.Constructor<?> r0 = r2.a
                r1 = 0
                java.lang.Object r0 = r0.newInstance(r1)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Throwable"
                kotlin.jvm.internal.g0.n(r0, r1)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                r0.initCause(r3)
                return r0
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Throwable invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Throwable r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {
        public static final kotlinx.coroutines.internal.n.e a = null;

        static {
                kotlinx.coroutines.internal.n$e r0 = new kotlinx.coroutines.internal.n$e
                r0.<init>()
                kotlinx.coroutines.internal.n.e.a = r0
                return
        }

        e() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Void a(@org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Void r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class f extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> {
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> a;

        f(kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> r1) {
                r0 = this;
                r0.a = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Throwable a(@org.jetbrains.annotations.NotNull java.lang.Throwable r5) {
                r4 = this;
                kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> r0 = r4.a
                r1 = 0
                kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L29
                java.lang.Object r0 = r0.invoke(r5)     // Catch: java.lang.Throwable -> L29
                java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L29
                java.lang.String r2 = r5.getMessage()     // Catch: java.lang.Throwable -> L29
                java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L29
                boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)     // Catch: java.lang.Throwable -> L29
                if (r2 != 0) goto L2b
                java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L29
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L29
                boolean r5 = kotlin.jvm.internal.g0.g(r2, r5)     // Catch: java.lang.Throwable -> L29
                if (r5 != 0) goto L2b
                r0 = r1
                goto L2b
            L29:
                r5 = move-exception
                goto L30
            L2b:
                java.lang.Object r5 = kotlin.Result.m11constructorimpl(r0)     // Catch: java.lang.Throwable -> L29
                goto L3a
            L30:
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r5 = kotlin.g0.a(r5)
                java.lang.Object r5 = kotlin.Result.m11constructorimpl(r5)
            L3a:
                boolean r0 = kotlin.Result.m17isFailureimpl(r5)
                if (r0 == 0) goto L41
                goto L42
            L41:
                r1 = r5
            L42:
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                return r1
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Throwable invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Throwable r1 = r0.a(r1)
                return r1
        }
    }

    static {
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r1 = -1
            int r0 = e(r0, r1)
            kotlinx.coroutines.internal.n.a = r0
            boolean r0 = kotlinx.coroutines.internal.p.a()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L12
            kotlinx.coroutines.internal.f1 r0 = kotlinx.coroutines.internal.f1.a     // Catch: java.lang.Throwable -> L15
            goto L17
        L12:
            kotlinx.coroutines.internal.d r0 = kotlinx.coroutines.internal.d.a     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            kotlinx.coroutines.internal.f1 r0 = kotlinx.coroutines.internal.f1.a
        L17:
            kotlinx.coroutines.internal.n.b = r0
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 a(java.lang.Class r0) {
            kotlin.jvm.functions.Function1 r0 = b(r0)
            return r0
    }

    private static final <E extends java.lang.Throwable> kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> b(java.lang.Class<E> r14) {
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlinx.coroutines.internal.n$e r1 = kotlinx.coroutines.internal.n.e.a
            int r2 = kotlinx.coroutines.internal.n.a
            r3 = 0
            int r4 = e(r14, r3)
            if (r2 == r4) goto L12
            goto Lfd
        L12:
            java.lang.reflect.Constructor[] r14 = r14.getConstructors()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r14.length
            r2.<init>(r4)
            int r4 = r14.length
            r5 = 0
        L1e:
            r6 = 0
            if (r5 >= r4) goto Lb1
            r7 = r14[r5]
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r9 = r8.length
            if (r9 == 0) goto L99
            java.lang.Class<java.lang.Throwable> r10 = java.lang.Throwable.class
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r12 = 2
            r13 = 1
            if (r9 == r13) goto L62
            if (r9 == r12) goto L3a
            kotlin.Pair r6 = kotlin.o0.a(r6, r0)
            goto Laa
        L3a:
            r9 = r8[r3]
            boolean r9 = kotlin.jvm.internal.g0.g(r9, r11)
            if (r9 == 0) goto L5d
            r8 = r8[r13]
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r10)
            if (r8 == 0) goto L5d
            kotlinx.coroutines.internal.n$a r6 = new kotlinx.coroutines.internal.n$a
            r6.<init>(r7)
            kotlin.jvm.functions.Function1 r6 = f(r6)
            r7 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            kotlin.Pair r6 = kotlin.o0.a(r6, r7)
            goto Laa
        L5d:
            kotlin.Pair r6 = kotlin.o0.a(r6, r0)
            goto Laa
        L62:
            r8 = r8[r3]
            boolean r9 = kotlin.jvm.internal.g0.g(r8, r11)
            if (r9 == 0) goto L7c
            kotlinx.coroutines.internal.n$b r6 = new kotlinx.coroutines.internal.n$b
            r6.<init>(r7)
            kotlin.jvm.functions.Function1 r6 = f(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            kotlin.Pair r6 = kotlin.o0.a(r6, r7)
            goto Laa
        L7c:
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r10)
            if (r8 == 0) goto L94
            kotlinx.coroutines.internal.n$c r6 = new kotlinx.coroutines.internal.n$c
            r6.<init>(r7)
            kotlin.jvm.functions.Function1 r6 = f(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            kotlin.Pair r6 = kotlin.o0.a(r6, r7)
            goto Laa
        L94:
            kotlin.Pair r6 = kotlin.o0.a(r6, r0)
            goto Laa
        L99:
            kotlinx.coroutines.internal.n$d r6 = new kotlinx.coroutines.internal.n$d
            r6.<init>(r7)
            kotlin.jvm.functions.Function1 r6 = f(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            kotlin.Pair r6 = kotlin.o0.a(r6, r7)
        Laa:
            r2.add(r6)
            int r5 = r5 + 1
            goto L1e
        Lb1:
            java.util.Iterator r14 = r2.iterator()
            boolean r0 = r14.hasNext()
            if (r0 != 0) goto Lbc
            goto Lef
        Lbc:
            java.lang.Object r6 = r14.next()
            boolean r0 = r14.hasNext()
            if (r0 != 0) goto Lc7
            goto Lef
        Lc7:
            r0 = r6
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        Ld4:
            java.lang.Object r2 = r14.next()
            r3 = r2
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r3 = r3.getSecond()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r0 >= r3) goto Le9
            r6 = r2
            r0 = r3
        Le9:
            boolean r2 = r14.hasNext()
            if (r2 != 0) goto Ld4
        Lef:
            kotlin.Pair r6 = (kotlin.Pair) r6
            if (r6 == 0) goto Lfd
            java.lang.Object r14 = r6.getFirst()
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            if (r14 != 0) goto Lfc
            goto Lfd
        Lfc:
            return r14
        Lfd:
            return r1
    }

    private static final int c(java.lang.Class<?> r5, int r6) {
        L0:
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r1) goto L1a
            r4 = r0[r2]
            int r4 = r4.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L17
            int r3 = r3 + 1
        L17:
            int r2 = r2 + 1
            goto L7
        L1a:
            int r6 = r6 + r3
            java.lang.Class r5 = r5.getSuperclass()
            if (r5 != 0) goto L0
            return r6
    }

    static /* synthetic */ int d(java.lang.Class r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            int r0 = c(r0, r1)
            return r0
    }

    private static final int e(java.lang.Class<?> r3, int r4) {
            k3.a.i(r3)
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L15
            r0 = 1
            r1 = 0
            r2 = 0
            int r3 = d(r3, r2, r0, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r3 = kotlin.Result.m11constructorimpl(r3)     // Catch: java.lang.Throwable -> L15
            goto L20
        L15:
            r3 = move-exception
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.g0.a(r3)
            java.lang.Object r3 = kotlin.Result.m11constructorimpl(r3)
        L20:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r0 = kotlin.Result.m17isFailureimpl(r3)
            if (r0 == 0) goto L2b
            r3 = r4
        L2b:
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            return r3
    }

    private static final kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> f(kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> r1) {
            kotlinx.coroutines.internal.n$f r0 = new kotlinx.coroutines.internal.n$f
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <E extends java.lang.Throwable> E g(@org.jetbrains.annotations.NotNull E r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.k0
            if (r0 == 0) goto L26
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L11
            kotlinx.coroutines.k0 r2 = (kotlinx.coroutines.k0) r2     // Catch: java.lang.Throwable -> L11
            java.lang.Throwable r2 = r2.createCopy()     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = kotlin.Result.m11constructorimpl(r2)     // Catch: java.lang.Throwable -> L11
            goto L1c
        L11:
            r2 = move-exception
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.g0.a(r2)
            java.lang.Object r2 = kotlin.Result.m11constructorimpl(r2)
        L1c:
            boolean r0 = kotlin.Result.m17isFailureimpl(r2)
            if (r0 == 0) goto L23
            r2 = 0
        L23:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            return r2
        L26:
            kotlinx.coroutines.internal.k r0 = kotlinx.coroutines.internal.n.b
            java.lang.Class r1 = r2.getClass()
            kotlin.jvm.functions.Function1 r0 = r0.a(r1)
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            return r2
    }
}
