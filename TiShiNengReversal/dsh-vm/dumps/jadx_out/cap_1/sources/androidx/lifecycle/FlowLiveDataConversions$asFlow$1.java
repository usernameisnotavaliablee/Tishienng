package androidx.lifecycle;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 0}, l = {110, 114}, m = "invokeSuspend", n = {"$this$callbackFlow", "observer"}, s = {"L$0", "L$1"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class FlowLiveDataConversions$asFlow$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ androidx.lifecycle.LiveData<T> $this_asFlow;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        final /* synthetic */ androidx.lifecycle.Observer<T> $observer;
        final /* synthetic */ androidx.lifecycle.LiveData<T> $this_asFlow;
        int label;

        AnonymousClass1(androidx.lifecycle.LiveData<T> r1, androidx.lifecycle.Observer<T> r2, kotlin.coroutines.e<? super androidx.lifecycle.FlowLiveDataConversions$asFlow$1.AnonymousClass1> r3) {
                r0 = this;
                r0.$this_asFlow = r1
                r0.$observer = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                r2 = this;
                androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 r3 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1
                androidx.lifecycle.LiveData<T> r0 = r2.$this_asFlow
                androidx.lifecycle.Observer<T> r1 = r2.$observer
                r3.<init>(r0, r1, r4)
                return r3
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 r1 = (androidx.lifecycle.FlowLiveDataConversions$asFlow$1.AnonymousClass1) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r1.label
                if (r0 != 0) goto L14
                kotlin.g0.n(r2)
                androidx.lifecycle.LiveData<T> r2 = r1.$this_asFlow
                androidx.lifecycle.Observer<T> r0 = r1.$observer
                r2.observeForever(r0)
                kotlin.n1 r2 = kotlin.n1.a
                return r2
            L14:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }


    FlowLiveDataConversions$asFlow$1(androidx.lifecycle.LiveData<T> r1, kotlin.coroutines.e<? super androidx.lifecycle.FlowLiveDataConversions$asFlow$1> r2) {
            r0 = this;
            r0.$this_asFlow = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    public static /* synthetic */ void f(kotlinx.coroutines.channels.z r0, java.lang.Object r1) {
            invokeSuspend$lambda$0(r0, r1)
            return
    }

    private static final void invokeSuspend$lambda$0(kotlinx.coroutines.channels.z r0, java.lang.Object r1) {
            r0.r(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1 r0 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1
            androidx.lifecycle.LiveData<T> r1 = r2.$this_asFlow
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.channels.z r1 = (kotlinx.coroutines.channels.z) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<? super T> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1 r1 = (androidx.lifecycle.FlowLiveDataConversions$asFlow$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.g0.n(r9)
            goto L64
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            java.lang.Object r1 = r8.L$1
            androidx.lifecycle.Observer r1 = (androidx.lifecycle.Observer) r1
            java.lang.Object r3 = r8.L$0
            kotlinx.coroutines.channels.z r3 = (kotlinx.coroutines.channels.z) r3
            kotlin.g0.n(r9)
            goto L50
        L27:
            kotlin.g0.n(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.channels.z r9 = (kotlinx.coroutines.channels.z) r9
            androidx.lifecycle.e r1 = new androidx.lifecycle.e
            r1.<init>(r9)
            kotlinx.coroutines.p2 r5 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r5 = r5.t()
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 r6 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1
            androidx.lifecycle.LiveData<T> r7 = r8.$this_asFlow
            r6.<init>(r7, r1, r4)
            r8.L$0 = r9
            r8.L$1 = r1
            r8.label = r3
            java.lang.Object r3 = kotlinx.coroutines.i.h(r5, r6, r8)
            if (r3 != r0) goto L4f
            goto L63
        L4f:
            r3 = r9
        L50:
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 r9 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2
            androidx.lifecycle.LiveData<T> r5 = r8.$this_asFlow
            r9.<init>(r5, r1)
            r8.L$0 = r4
            r8.L$1 = r4
            r8.label = r2
            java.lang.Object r9 = kotlinx.coroutines.channels.x.a(r3, r9, r8)
            if (r9 != r0) goto L64
        L63:
            return r0
        L64:
            kotlin.n1 r9 = kotlin.n1.a
            return r9
    }
}
