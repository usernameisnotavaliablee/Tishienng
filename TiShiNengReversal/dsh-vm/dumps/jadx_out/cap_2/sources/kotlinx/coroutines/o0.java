package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,110:1\n75#2:111\n*S KotlinDebug\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n38#1:111\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n*L\n1#1,110:1\n*E\n"})
    public static final class a extends kotlin.coroutines.a implements kotlinx.coroutines.n0 {
        final /* synthetic */ kotlin.jvm.functions.Function2<kotlin.coroutines.i, java.lang.Throwable, kotlin.n1> a;

        public a(kotlin.jvm.functions.Function2<? super kotlin.coroutines.i, ? super java.lang.Throwable, kotlin.n1> r1, kotlinx.coroutines.n0.b r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlinx.coroutines.n0
        public void s(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
                r1 = this;
                kotlin.jvm.functions.Function2<kotlin.coroutines.i, java.lang.Throwable, kotlin.n1> r0 = r1.a
                r0.invoke(r2, r3)
                return
        }
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.n0 a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlin.coroutines.i, ? super java.lang.Throwable, kotlin.n1> r2) {
            kotlinx.coroutines.n0$b r0 = kotlinx.coroutines.n0.r0
            kotlinx.coroutines.o0$a r1 = new kotlinx.coroutines.o0$a
            r1.<init>(r2, r0)
            return r1
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    public static final void b(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            kotlinx.coroutines.n0$b r0 = kotlinx.coroutines.n0.r0     // Catch: java.lang.Throwable -> Le
            kotlin.coroutines.i$b r0 = r1.get(r0)     // Catch: java.lang.Throwable -> Le
            kotlinx.coroutines.n0 r0 = (kotlinx.coroutines.n0) r0     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            r0.s(r1, r2)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r0 = move-exception
            goto L14
        L10:
            kotlinx.coroutines.internal.j.a(r1, r2)
            return
        L14:
            java.lang.Throwable r2 = c(r2, r0)
            kotlinx.coroutines.internal.j.a(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Throwable c(@org.jetbrains.annotations.NotNull java.lang.Throwable r2, @org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            if (r2 != r3) goto L3
            return r2
        L3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Exception while trying to handle coroutine exception"
            r0.<init>(r1, r3)
            kotlin.l.a(r0, r2)
            return r0
    }
}
