package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "KotlinExtensions")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class m {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
        final /* synthetic */ retrofit2.b a;

        a(retrofit2.b r1) {
                r0 = this;
                r0.a = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        public final void invoke(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
                r0 = this;
                retrofit2.b r1 = r0.a
                r1.cancel()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
        final /* synthetic */ retrofit2.b a;

        b(retrofit2.b r1) {
                r0 = this;
                r0.a = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        public final void invoke(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
                r0 = this;
                retrofit2.b r1 = r0.a
                r1.cancel()
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c<T> implements retrofit2.d<T> {
        final /* synthetic */ kotlinx.coroutines.p a;

        c(kotlinx.coroutines.p r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // retrofit2.d
        public void a(@org.jetbrains.annotations.NotNull retrofit2.b<T> r2, @org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
                r1 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.q(r2, r0)
                java.lang.String r2 = "t"
                kotlin.jvm.internal.g0.q(r3, r2)
                kotlinx.coroutines.p r2 = r1.a
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r3 = kotlin.g0.a(r3)
                java.lang.Object r3 = kotlin.Result.constructor-impl(r3)
                r2.resumeWith(r3)
                return
        }

        @Override // retrofit2.d
        public void b(@org.jetbrains.annotations.NotNull retrofit2.b<T> r4, @org.jetbrains.annotations.NotNull retrofit2.c0<T> r5) {
                r3 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.q(r4, r0)
                java.lang.String r0 = "response"
                kotlin.jvm.internal.g0.q(r5, r0)
                boolean r0 = r5.g()
                if (r0 == 0) goto L85
                java.lang.Object r5 = r5.a()
                if (r5 != 0) goto L79
                okhttp3.Request r4 = r4.request()
                java.lang.Class<retrofit2.l> r5 = retrofit2.l.class
                java.lang.Object r4 = r4.tag(r5)
                if (r4 != 0) goto L25
                kotlin.jvm.internal.g0.L()
            L25:
                java.lang.String r5 = "call.request().tag(Invocation::class.java)!!"
                kotlin.jvm.internal.g0.h(r4, r5)
                retrofit2.l r4 = (retrofit2.l) r4
                java.lang.reflect.Method r4 = r4.b()
                kotlin.KotlinNullPointerException r5 = new kotlin.KotlinNullPointerException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Response from "
                r0.append(r1)
                java.lang.String r1 = "method"
                kotlin.jvm.internal.g0.h(r4, r1)
                java.lang.Class r1 = r4.getDeclaringClass()
                java.lang.String r2 = "method.declaringClass"
                kotlin.jvm.internal.g0.h(r1, r2)
                java.lang.String r1 = r1.getName()
                r0.append(r1)
                r1 = 46
                r0.append(r1)
                java.lang.String r4 = r4.getName()
                r0.append(r4)
                java.lang.String r4 = " was null but response body type was declared as non-null"
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                kotlinx.coroutines.p r4 = r3.a
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r5 = kotlin.g0.a(r5)
                java.lang.Object r5 = kotlin.Result.constructor-impl(r5)
                r4.resumeWith(r5)
                return
            L79:
                kotlinx.coroutines.p r4 = r3.a
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r5 = kotlin.Result.constructor-impl(r5)
                r4.resumeWith(r5)
                return
            L85:
                kotlinx.coroutines.p r4 = r3.a
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r5)
                kotlin.Result$a r5 = kotlin.Result.Companion
                java.lang.Object r5 = kotlin.g0.a(r0)
                java.lang.Object r5 = kotlin.Result.constructor-impl(r5)
                r4.resumeWith(r5)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d<T> implements retrofit2.d<T> {
        final /* synthetic */ kotlinx.coroutines.p a;

        d(kotlinx.coroutines.p r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // retrofit2.d
        public void a(@org.jetbrains.annotations.NotNull retrofit2.b<T> r2, @org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
                r1 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.q(r2, r0)
                java.lang.String r2 = "t"
                kotlin.jvm.internal.g0.q(r3, r2)
                kotlinx.coroutines.p r2 = r1.a
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r3 = kotlin.g0.a(r3)
                java.lang.Object r3 = kotlin.Result.constructor-impl(r3)
                r2.resumeWith(r3)
                return
        }

        @Override // retrofit2.d
        public void b(@org.jetbrains.annotations.NotNull retrofit2.b<T> r2, @org.jetbrains.annotations.NotNull retrofit2.c0<T> r3) {
                r1 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.q(r2, r0)
                java.lang.String r2 = "response"
                kotlin.jvm.internal.g0.q(r3, r2)
                boolean r2 = r3.g()
                if (r2 == 0) goto L20
                kotlinx.coroutines.p r2 = r1.a
                java.lang.Object r3 = r3.a()
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r3 = kotlin.Result.constructor-impl(r3)
                r2.resumeWith(r3)
                return
            L20:
                kotlinx.coroutines.p r2 = r1.a
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r3)
                kotlin.Result$a r3 = kotlin.Result.Companion
                java.lang.Object r3 = kotlin.g0.a(r0)
                java.lang.Object r3 = kotlin.Result.constructor-impl(r3)
                r2.resumeWith(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
        final /* synthetic */ retrofit2.b a;

        e(retrofit2.b r1) {
                r0 = this;
                r0.a = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        public final void invoke(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
                r0 = this;
                retrofit2.b r1 = r0.a
                r1.cancel()
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class f<T> implements retrofit2.d<T> {
        final /* synthetic */ kotlinx.coroutines.p a;

        f(kotlinx.coroutines.p r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // retrofit2.d
        public void a(@org.jetbrains.annotations.NotNull retrofit2.b<T> r2, @org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
                r1 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.q(r2, r0)
                java.lang.String r2 = "t"
                kotlin.jvm.internal.g0.q(r3, r2)
                kotlinx.coroutines.p r2 = r1.a
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r3 = kotlin.g0.a(r3)
                java.lang.Object r3 = kotlin.Result.constructor-impl(r3)
                r2.resumeWith(r3)
                return
        }

        @Override // retrofit2.d
        public void b(@org.jetbrains.annotations.NotNull retrofit2.b<T> r2, @org.jetbrains.annotations.NotNull retrofit2.c0<T> r3) {
                r1 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.g0.q(r2, r0)
                java.lang.String r2 = "response"
                kotlin.jvm.internal.g0.q(r3, r2)
                kotlinx.coroutines.p r2 = r1.a
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r3 = kotlin.Result.constructor-impl(r3)
                r2.resumeWith(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class g implements java.lang.Runnable {
        final /* synthetic */ kotlin.coroutines.e a;
        final /* synthetic */ java.lang.Exception b;

        g(kotlin.coroutines.e r1, java.lang.Exception r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                kotlin.coroutines.e r0 = r3.a
                kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.a.e(r0)
                java.lang.Exception r1 = r3.b
                kotlin.Result$a r2 = kotlin.Result.Companion
                java.lang.Object r1 = kotlin.g0.a(r1)
                java.lang.Object r1 = kotlin.Result.constructor-impl(r1)
                r0.resumeWith(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {113}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
    static final class h extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        /* synthetic */ java.lang.Object a;
        int b;
        java.lang.Object c;

        h(kotlin.coroutines.e r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.a = r2
                int r2 = r1.b
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.b = r2
                r2 = 0
                java.lang.Object r2 = retrofit2.m.e(r2, r1)
                return r2
        }
    }

    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object a(@org.jetbrains.annotations.NotNull retrofit2.b<T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r4) {
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r4)
            r2 = 1
            r0.<init>(r1, r2)
            retrofit2.m$a r1 = new retrofit2.m$a
            r1.<init>(r3)
            r0.I(r1)
            retrofit2.m$c r1 = new retrofit2.m$c
            r1.<init>(r0)
            r3.j(r1)
            java.lang.Object r3 = r0.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r0) goto L27
            kotlin.coroutines.jvm.internal.e.c(r4)
        L27:
            return r3
    }

    @kotlin.jvm.JvmName(name = "awaitNullable")
    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull retrofit2.b<T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r4) {
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r4)
            r2 = 1
            r0.<init>(r1, r2)
            retrofit2.m$b r1 = new retrofit2.m$b
            r1.<init>(r3)
            r0.I(r1)
            retrofit2.m$d r1 = new retrofit2.m$d
            r1.<init>(r0)
            r3.j(r1)
            java.lang.Object r3 = r0.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r0) goto L27
            kotlin.coroutines.jvm.internal.e.c(r4)
        L27:
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object c(@org.jetbrains.annotations.NotNull retrofit2.b<T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super retrofit2.c0<T>> r4) {
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r4)
            r2 = 1
            r0.<init>(r1, r2)
            retrofit2.m$e r1 = new retrofit2.m$e
            r1.<init>(r3)
            r0.I(r1)
            retrofit2.m$f r1 = new retrofit2.m$f
            r1.<init>(r0)
            r3.j(r1)
            java.lang.Object r3 = r0.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r0) goto L27
            kotlin.coroutines.jvm.internal.e.c(r4)
        L27:
            return r3
    }

    public static final /* synthetic */ <T> T d(@org.jetbrains.annotations.NotNull retrofit2.d0 r2) {
            java.lang.String r0 = "$this$create"
            kotlin.jvm.internal.g0.q(r2, r0)
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r2 = r2.g(r0)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object e(@org.jetbrains.annotations.NotNull java.lang.Exception r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r5) {
            boolean r0 = r5 instanceof retrofit2.m.h
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.m$h r0 = (retrofit2.m.h) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            retrofit2.m$h r0 = new retrofit2.m$h
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.c
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlin.g0.n(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.g0.n(r5)
            r0.c = r4
            r0.b = r3
            kotlinx.coroutines.m0 r5 = kotlinx.coroutines.g1.a()
            kotlin.coroutines.i r2 = r0.getContext()
            retrofit2.m$g r3 = new retrofit2.m$g
            r3.<init>(r0, r4)
            r5.dispatch(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L59
            kotlin.coroutines.jvm.internal.e.c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }
}
