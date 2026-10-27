package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class b<T> extends kotlinx.coroutines.flow.f<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {334}, m = "collectTo", n = {"scope"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlinx.coroutines.flow.b<T> c;
        int d;

        a(kotlinx.coroutines.flow.b<T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.b.a> r2) {
                r0 = this;
                r0.c = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.b = r2
                int r2 = r1.d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.d = r2
                kotlinx.coroutines.flow.b<T> r2 = r1.c
                r0 = 0
                java.lang.Object r2 = r2.h(r0, r1)
                return r2
        }
    }

    public b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.z<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.e = r1
            return
    }

    public /* synthetic */ b(kotlin.jvm.functions.Function2 r1, kotlin.coroutines.i r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4, int r5, kotlin.jvm.internal.v r6) {
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r6 = r5 & 4
            if (r6 == 0) goto Lb
            r3 = -2
        Lb:
            r5 = r5 & 8
            if (r5 == 0) goto L11
            kotlinx.coroutines.channels.BufferOverflow r4 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L11:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.Nullable
    protected java.lang.Object h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<? super T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.b.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.b$a r0 = (kotlinx.coroutines.flow.b.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.b$a r0 = new kotlinx.coroutines.flow.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.a
            kotlinx.coroutines.channels.z r5 = (kotlinx.coroutines.channels.z) r5
            kotlin.g0.n(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.g0.n(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = super.h(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.z()
            if (r5 == 0) goto L4c
            kotlin.n1 r5 = kotlin.n1.a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
    }

    @Override // kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    protected kotlinx.coroutines.flow.internal.d<T> i(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, int r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r5) {
            r2 = this;
            kotlinx.coroutines.flow.b r0 = new kotlinx.coroutines.flow.b
            kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r1 = r2.e
            r0.<init>(r1, r3, r4, r5)
            return r0
    }
}
