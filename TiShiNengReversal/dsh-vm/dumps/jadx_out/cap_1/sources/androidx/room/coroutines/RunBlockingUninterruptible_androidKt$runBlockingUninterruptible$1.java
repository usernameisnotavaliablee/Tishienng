package androidx.room.coroutines;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super T>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super T>, java.lang.Object> $block;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRunBlockingUninterruptible.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunBlockingUninterruptible.android.kt\nandroidx/room/coroutines/RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
    /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super T>, java.lang.Object> $block;
        final /* synthetic */ kotlinx.coroutines.y<T> $deferred;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        AnonymousClass1(kotlinx.coroutines.y<T> r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r2, kotlin.coroutines.e<? super androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.AnonymousClass1> r3) {
                r0 = this;
                r0.$deferred = r1
                r0.$block = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r4, kotlin.coroutines.e<?> r5) {
                r3 = this;
                androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1 r0 = new androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1
                kotlinx.coroutines.y<T> r1 = r3.$deferred
                kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super T>, java.lang.Object> r2 = r3.$block
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1 r1 = (androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.AnonymousClass1) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r5.L$0
                kotlinx.coroutines.y r0 = (kotlinx.coroutines.y) r0
                kotlin.g0.n(r6)     // Catch: java.lang.Throwable -> L13
                goto L36
            L13:
                r6 = move-exception
                goto L3d
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                kotlin.g0.n(r6)
                java.lang.Object r6 = r5.L$0
                kotlinx.coroutines.r0 r6 = (kotlinx.coroutines.r0) r6
                kotlinx.coroutines.y<T> r1 = r5.$deferred
                kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super T>, java.lang.Object> r3 = r5.$block
                kotlin.Result$a r4 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3b
                r5.L$0 = r1     // Catch: java.lang.Throwable -> L3b
                r5.label = r2     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r6 = r3.invoke(r6, r5)     // Catch: java.lang.Throwable -> L3b
                if (r6 != r0) goto L35
                return r0
            L35:
                r0 = r1
            L36:
                java.lang.Object r6 = kotlin.Result.constructor-impl(r6)     // Catch: java.lang.Throwable -> L13
                goto L47
            L3b:
                r6 = move-exception
                r0 = r1
            L3d:
                kotlin.Result$a r1 = kotlin.Result.Companion
                java.lang.Object r6 = kotlin.g0.a(r6)
                java.lang.Object r6 = kotlin.Result.constructor-impl(r6)
            L47:
                kotlinx.coroutines.a0.d(r0, r6)
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super T>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.y<T> $deferred;
        int label;

        AnonymousClass2(kotlinx.coroutines.y<T> r1, kotlin.coroutines.e<? super androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.AnonymousClass2> r2) {
                r0 = this;
                r0.$deferred = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2 r2 = new androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2
                kotlinx.coroutines.y<T> r0 = r1.$deferred
                r2.<init>(r0, r3)
                return r2
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super T> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2 r1 = (androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.AnonymousClass2) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r4)
                return r4
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.g0.n(r4)
                kotlinx.coroutines.y<T> r4 = r3.$deferred
                r3.label = r2
                java.lang.Object r4 = r4.f(r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                return r4
        }
    }

    RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, kotlin.coroutines.e<? super androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1> r2) {
            r0 = this;
            r0.$block = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 r0 = new androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1
            kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super T>, java.lang.Object> r1 = r2.$block
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super T> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 r1 = (androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            kotlin.coroutines.intrinsics.a.l()
            int r0 = r6.label
            if (r0 != 0) goto L48
            kotlin.g0.n(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.r0 r7 = (kotlinx.coroutines.r0) r7
            kotlin.coroutines.i r7 = r7.getCoroutineContext()
            kotlin.coroutines.f$b r0 = kotlin.coroutines.f.o0
            kotlin.coroutines.i$b r7 = r7.get(r0)
            kotlin.jvm.internal.g0.m(r7)
            kotlin.coroutines.f r7 = (kotlin.coroutines.f) r7
            r0 = 1
            r1 = 0
            kotlinx.coroutines.y r0 = kotlinx.coroutines.a0.c(r1, r0, r1)
            kotlinx.coroutines.w1 r2 = kotlinx.coroutines.w1.a
            kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1 r4 = new androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1
            kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super T>, java.lang.Object> r5 = r6.$block
            r4.<init>(r0, r5, r1)
            kotlinx.coroutines.i.d(r2, r7, r3, r4)
        L31:
            boolean r2 = r0.isCompleted()
            if (r2 != 0) goto L43
            androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2 r2 = new androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2     // Catch: java.lang.InterruptedException -> L41
            r2.<init>(r0, r1)     // Catch: java.lang.InterruptedException -> L41
            java.lang.Object r7 = kotlinx.coroutines.i.f(r7, r2)     // Catch: java.lang.InterruptedException -> L41
            return r7
        L41:
            goto L31
        L43:
            java.lang.Object r7 = r0.d()
            return r7
        L48:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
    }
}
