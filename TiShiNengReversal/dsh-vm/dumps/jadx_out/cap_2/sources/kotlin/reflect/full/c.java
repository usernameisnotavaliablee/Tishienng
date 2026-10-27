package kotlin.reflect.full;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "KCallables")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKCallables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallables.kt\nkotlin/reflect/full/KCallables\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n669#2,11:83\n669#2,11:94\n774#2:105\n865#2,2:106\n669#2,11:108\n1#3:119\n*S KotlinDebug\n*F\n+ 1 KCallables.kt\nkotlin/reflect/full/KCallables\n*L\n23#1:83,11\n31#1:94,11\n38#1:105\n38#1:106,2\n45#1:108,11\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        /* synthetic */ java.lang.Object c;
        int d;

        a(kotlin.coroutines.e<? super kotlin.reflect.full.c.a> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.c = r2
                int r2 = r1.d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.d = r2
                r2 = 0
                java.lang.Object r2 = kotlin.reflect.full.c.a(r2, r2, r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        /* synthetic */ java.lang.Object d;
        int e;

        b(kotlin.coroutines.e<? super kotlin.reflect.full.c.b> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.d = r2
                int r2 = r1.e
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.e = r2
                r2 = 0
                java.lang.Object r2 = kotlin.reflect.full.c.b(r2, r2, r1)
                return r2
        }
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.reflect.c<? extends R> r4, @org.jetbrains.annotations.NotNull java.lang.Object[] r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r6) {
            boolean r0 = r6 instanceof kotlin.reflect.full.c.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.reflect.full.c$a r0 = (kotlin.reflect.full.c.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kotlin.reflect.full.c$a r0 = new kotlin.reflect.full.c$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r4 = r0.a
            kotlin.reflect.c r4 = (kotlin.reflect.c) r4
            kotlin.g0.n(r6)
            goto L7c
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.g0.n(r6)
            boolean r6 = r4.isSuspend()
            if (r6 != 0) goto L4c
            int r6 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            java.lang.Object r4 = r4.call(r5)
            return r4
        L4c:
            boolean r6 = r4 instanceof kotlin.reflect.i
            if (r6 == 0) goto La0
            r0.a = r4
            r0.b = r5
            r0.d = r3
            kotlin.jvm.internal.s0 r6 = new kotlin.jvm.internal.s0
            r2 = 2
            r6.<init>(r2)
            r6.b(r5)
            r6.a(r0)
            int r5 = r6.c()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object[] r5 = r6.d(r5)
            java.lang.Object r6 = r4.call(r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r6 != r5) goto L79
            kotlin.coroutines.jvm.internal.e.c(r0)
        L79:
            if (r6 != r1) goto L7c
            return r1
        L7c:
            kotlin.reflect.i r4 = (kotlin.reflect.i) r4
            kotlin.reflect.r r5 = r4.getReturnType()
            kotlin.reflect.g r5 = r5.n()
            java.lang.Class<kotlin.n1> r0 = kotlin.n1.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r0)
            if (r5 == 0) goto L9f
            kotlin.reflect.r r4 = r4.getReturnType()
            boolean r4 = r4.q()
            if (r4 != 0) goto L9f
            kotlin.n1 r4 = kotlin.n1.a
            return r4
        L9f:
            return r6
        La0:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Cannot callSuspend on a property "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = ": suspend properties are not supported yet"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.reflect.c<? extends R> r4, @org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r6) {
            boolean r0 = r6 instanceof kotlin.reflect.full.c.b
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.reflect.full.c$b r0 = (kotlin.reflect.full.c.b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kotlin.reflect.full.c$b r0 = new kotlin.reflect.full.c$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r4 = r0.c
            kotlin.reflect.jvm.internal.e0 r4 = (kotlin.reflect.jvm.internal.e0) r4
            java.lang.Object r4 = r0.b
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r4 = r0.a
            kotlin.reflect.c r4 = (kotlin.reflect.c) r4
            kotlin.g0.n(r6)
            goto L6d
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.g0.n(r6)
            boolean r6 = r4.isSuspend()
            if (r6 != 0) goto L4b
            java.lang.Object r4 = r4.callBy(r5)
            return r4
        L4b:
            boolean r6 = r4 instanceof kotlin.reflect.i
            if (r6 == 0) goto La8
            kotlin.reflect.jvm.internal.e0 r6 = kotlin.reflect.jvm.internal.p3.b(r4)
            if (r6 == 0) goto L91
            r0.a = r4
            r0.b = r5
            r0.c = r6
            r0.e = r3
            java.lang.Object r6 = r6.S(r5, r0)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r6 != r5) goto L6a
            kotlin.coroutines.jvm.internal.e.c(r0)
        L6a:
            if (r6 != r1) goto L6d
            return r1
        L6d:
            kotlin.reflect.i r4 = (kotlin.reflect.i) r4
            kotlin.reflect.r r5 = r4.getReturnType()
            kotlin.reflect.g r5 = r5.n()
            java.lang.Class<kotlin.n1> r0 = kotlin.n1.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r0)
            if (r5 == 0) goto L90
            kotlin.reflect.r r4 = r4.getReturnType()
            boolean r4 = r4.q()
            if (r4 != 0) goto L90
            kotlin.n1 r4 = kotlin.n1.a
            return r4
        L90:
            return r6
        L91:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r5 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "This callable does not support a default call: "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        La8:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Cannot callSuspendBy on a property "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = ": suspend properties are not supported yet"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.KParameter c(@org.jetbrains.annotations.NotNull kotlin.reflect.c<?> r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.List r5 = r5.getParameters()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = 0
            r2 = r0
        L17:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r3 = r5.next()
            r4 = r3
            kotlin.reflect.KParameter r4 = (kotlin.reflect.KParameter) r4
            java.lang.String r4 = r4.getName()
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r6)
            if (r4 == 0) goto L17
            if (r1 == 0) goto L31
            goto L38
        L31:
            r1 = 1
            r2 = r3
            goto L17
        L34:
            if (r1 != 0) goto L37
            goto L38
        L37:
            r0 = r2
        L38:
            kotlin.reflect.KParameter r0 = (kotlin.reflect.KParameter) r0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.KParameter d(@org.jetbrains.annotations.NotNull kotlin.reflect.c<?> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.List r6 = r6.getParameters()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
            r1 = 0
            r2 = r0
        L12:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r6.next()
            r4 = r3
            kotlin.reflect.KParameter r4 = (kotlin.reflect.KParameter) r4
            kotlin.reflect.KParameter$Kind r4 = r4.h()
            kotlin.reflect.KParameter$Kind r5 = kotlin.reflect.KParameter.Kind.EXTENSION_RECEIVER
            if (r4 != r5) goto L12
            if (r1 == 0) goto L2a
            goto L31
        L2a:
            r1 = 1
            r2 = r3
            goto L12
        L2d:
            if (r1 != 0) goto L30
            goto L31
        L30:
            r0 = r2
        L31:
            kotlin.reflect.KParameter r0 = (kotlin.reflect.KParameter) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void e(kotlin.reflect.c r0) {
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.KParameter f(@org.jetbrains.annotations.NotNull kotlin.reflect.c<?> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.List r6 = r6.getParameters()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
            r1 = 0
            r2 = r0
        L12:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r6.next()
            r4 = r3
            kotlin.reflect.KParameter r4 = (kotlin.reflect.KParameter) r4
            kotlin.reflect.KParameter$Kind r4 = r4.h()
            kotlin.reflect.KParameter$Kind r5 = kotlin.reflect.KParameter.Kind.INSTANCE
            if (r4 != r5) goto L12
            if (r1 == 0) goto L2a
            goto L31
        L2a:
            r1 = 1
            r2 = r3
            goto L12
        L2d:
            if (r1 != 0) goto L30
            goto L31
        L30:
            r0 = r2
        L31:
            kotlin.reflect.KParameter r0 = (kotlin.reflect.KParameter) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void g(kotlin.reflect.c r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.KParameter> h(@org.jetbrains.annotations.NotNull kotlin.reflect.c<?> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.List r4 = r4.getParameters()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r4.next()
            r2 = r1
            kotlin.reflect.KParameter r2 = (kotlin.reflect.KParameter) r2
            kotlin.reflect.KParameter$Kind r2 = r2.h()
            kotlin.reflect.KParameter$Kind r3 = kotlin.reflect.KParameter.Kind.VALUE
            if (r2 != r3) goto L14
            r0.add(r1)
            goto L14
        L2d:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void i(kotlin.reflect.c r0) {
            return
    }
}
