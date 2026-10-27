package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,202:1\n48#2,4:203\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n51#1:203,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n1#1,110:1\n51#2:111\n*E\n"})
    public static final class a extends kotlin.coroutines.a implements kotlinx.coroutines.n0 {
        public a(kotlinx.coroutines.n0.b r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlinx.coroutines.n0
        public void s(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
        final /* synthetic */ kotlinx.coroutines.channels.b0<E> a;

        b(kotlinx.coroutines.channels.b0<? extends E> r1) {
                r0 = this;
                r0.a = r1
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
        public final void invoke2(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
                r1 = this;
                kotlinx.coroutines.channels.b0<E> r0 = r1.a
                kotlinx.coroutines.channels.p.b(r0, r2)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {56, 57}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
    static final class c<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super E>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        int b;
        private /* synthetic */ java.lang.Object c;
        final /* synthetic */ kotlinx.coroutines.channels.b0<E> d;

        c(kotlinx.coroutines.channels.b0<? extends E> r1, kotlin.coroutines.e<? super kotlinx.coroutines.channels.h.c> r2) {
                r0 = this;
                r0.d = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                r2 = this;
                kotlinx.coroutines.channels.h$c r0 = new kotlinx.coroutines.channels.h$c
                kotlinx.coroutines.channels.b0<E> r1 = r2.d
                r0.<init>(r1, r4)
                r0.c = r3
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlinx.coroutines.channels.z r1 = (kotlinx.coroutines.channels.z) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<? super E> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.h$c r1 = (kotlinx.coroutines.channels.h.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r6.b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r6.a
                kotlinx.coroutines.channels.l r1 = (kotlinx.coroutines.channels.l) r1
                java.lang.Object r4 = r6.c
                kotlinx.coroutines.channels.z r4 = (kotlinx.coroutines.channels.z) r4
                kotlin.g0.n(r7)
            L19:
                r7 = r4
                goto L3c
            L1b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L23:
                java.lang.Object r1 = r6.a
                kotlinx.coroutines.channels.l r1 = (kotlinx.coroutines.channels.l) r1
                java.lang.Object r4 = r6.c
                kotlinx.coroutines.channels.z r4 = (kotlinx.coroutines.channels.z) r4
                kotlin.g0.n(r7)
                goto L4c
            L2f:
                kotlin.g0.n(r7)
                java.lang.Object r7 = r6.c
                kotlinx.coroutines.channels.z r7 = (kotlinx.coroutines.channels.z) r7
                kotlinx.coroutines.channels.b0<E> r1 = r6.d
                kotlinx.coroutines.channels.l r1 = r1.iterator()
            L3c:
                r6.c = r7
                r6.a = r1
                r6.b = r3
                java.lang.Object r4 = r1.c(r6)
                if (r4 != r0) goto L49
                goto L64
            L49:
                r5 = r4
                r4 = r7
                r7 = r5
            L4c:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L65
                java.lang.Object r7 = r1.next()
                r6.c = r4
                r6.a = r1
                r6.b = r2
                java.lang.Object r7 = r4.T(r7, r6)
                if (r7 != r0) goto L19
            L64:
                return r0
            L65:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @kotlinx.coroutines.ObsoleteCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.d<E> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineStart r4, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r5, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.z<? super E>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r6) {
            kotlin.coroutines.i r1 = kotlinx.coroutines.l0.e(r1, r2)
            kotlinx.coroutines.channels.d r2 = kotlinx.coroutines.channels.f.a(r3)
            boolean r3 = r4.isLazy()
            if (r3 == 0) goto L14
            kotlinx.coroutines.channels.w r3 = new kotlinx.coroutines.channels.w
            r3.<init>(r1, r2, r6)
            goto L1a
        L14:
            kotlinx.coroutines.channels.g r3 = new kotlinx.coroutines.channels.g
            r0 = 1
            r3.<init>(r1, r2, r0)
        L1a:
            if (r5 == 0) goto L1f
            r3.k(r5)
        L1f:
            r3.z1(r4, r3, r6)
            return r3
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @kotlinx.coroutines.ObsoleteCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.d<E> b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.b0<? extends E> r11, int r12, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineStart r13) {
            kotlinx.coroutines.w1 r0 = kotlinx.coroutines.w1.a
            kotlinx.coroutines.m0 r1 = kotlinx.coroutines.g1.g()
            kotlinx.coroutines.r0 r0 = kotlinx.coroutines.s0.m(r0, r1)
            kotlinx.coroutines.n0$b r1 = kotlinx.coroutines.n0.r0
            kotlinx.coroutines.channels.h$a r2 = new kotlinx.coroutines.channels.h$a
            r2.<init>(r1)
            kotlinx.coroutines.r0 r3 = kotlinx.coroutines.s0.m(r0, r2)
            kotlinx.coroutines.channels.h$b r7 = new kotlinx.coroutines.channels.h$b
            r7.<init>(r11)
            kotlinx.coroutines.channels.h$c r8 = new kotlinx.coroutines.channels.h$c
            r0 = 0
            r8.<init>(r11, r0)
            r9 = 1
            r10 = 0
            r4 = 0
            r5 = r12
            r6 = r13
            kotlinx.coroutines.channels.d r11 = c(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
    }

    public static /* synthetic */ kotlinx.coroutines.channels.d c(kotlinx.coroutines.r0 r0, kotlin.coroutines.i r1, int r2, kotlinx.coroutines.CoroutineStart r3, kotlin.jvm.functions.Function1 r4, kotlin.jvm.functions.Function2 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lb
            r2 = 1
        Lb:
            r7 = r6 & 4
            if (r7 == 0) goto L11
            kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.LAZY
        L11:
            r6 = r6 & 8
            if (r6 == 0) goto L16
            r4 = 0
        L16:
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r2 = r0
            r3 = r1
            kotlinx.coroutines.channels.d r0 = a(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.d d(kotlinx.coroutines.channels.b0 r0, int r1, kotlinx.coroutines.CoroutineStart r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 1
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.LAZY
        Lb:
            kotlinx.coroutines.channels.d r0 = b(r0, r1, r2)
            return r0
    }
}
