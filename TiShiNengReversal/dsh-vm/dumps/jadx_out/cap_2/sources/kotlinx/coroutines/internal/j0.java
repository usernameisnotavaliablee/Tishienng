package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nOnUndeliveredElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnUndeliveredElement.kt\nkotlinx/coroutines/internal/OnUndeliveredElementKt\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,44:1\n75#2:45\n*S KotlinDebug\n*F\n+ 1 OnUndeliveredElement.kt\nkotlinx/coroutines/internal/OnUndeliveredElementKt\n*L\n22#1:45\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
        final /* synthetic */ kotlin.jvm.functions.Function1<E, kotlin.n1> a;
        final /* synthetic */ E b;
        final /* synthetic */ kotlin.coroutines.i c;

        a(kotlin.jvm.functions.Function1<? super E, kotlin.n1> r1, E r2, kotlin.coroutines.i r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke2(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
                r2 = this;
                kotlin.jvm.functions.Function1<E, kotlin.n1> r3 = r2.a
                E r0 = r2.b
                kotlin.coroutines.i r1 = r2.c
                kotlinx.coroutines.internal.j0.b(r3, r0, r1)
                return
        }
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.n1> r1, E r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r3) {
            kotlinx.coroutines.internal.j0$a r0 = new kotlinx.coroutines.internal.j0$a
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static final <E> void b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.n1> r1, E r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r3) {
            r0 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r1 = c(r1, r2, r0)
            if (r1 == 0) goto La
            kotlinx.coroutines.o0.b(r3, r1)
        La:
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <E> kotlinx.coroutines.internal.UndeliveredElementException c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.n1> r2, E r3, @org.jetbrains.annotations.Nullable kotlinx.coroutines.internal.UndeliveredElementException r4) {
            r2.invoke(r3)     // Catch: java.lang.Throwable -> L4
            return r4
        L4:
            r2 = move-exception
            if (r4 == 0) goto L11
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == r2) goto L11
            kotlin.l.a(r4, r2)
            return r4
        L11:
            kotlinx.coroutines.internal.UndeliveredElementException r4 = new kotlinx.coroutines.internal.UndeliveredElementException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Exception in undelivered element handler for "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3, r2)
            return r4
    }

    public static /* synthetic */ kotlinx.coroutines.internal.UndeliveredElementException d(kotlin.jvm.functions.Function1 r0, java.lang.Object r1, kotlinx.coroutines.internal.UndeliveredElementException r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlinx.coroutines.internal.UndeliveredElementException r0 = c(r0, r1, r2)
            return r0
    }
}
