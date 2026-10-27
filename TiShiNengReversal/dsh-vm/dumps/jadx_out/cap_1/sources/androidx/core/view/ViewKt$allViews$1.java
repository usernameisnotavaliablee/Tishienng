package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {409, 411}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ViewKt$allViews$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super android.view.View>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ android.view.View $this_allViews;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    ViewKt$allViews$1(android.view.View r1, kotlin.coroutines.e<? super androidx.core.view.ViewKt$allViews$1> r2) {
            r0 = this;
            r0.$this_allViews = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.core.view.ViewKt$allViews$1 r0 = new androidx.core.view.ViewKt$allViews$1
            android.view.View r1 = r2.$this_allViews
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlin.sequences.o r1 = (kotlin.sequences.o) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.sequences.o<? super android.view.View> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.core.view.ViewKt$allViews$1 r1 = (androidx.core.view.ViewKt$allViews$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.g0.n(r5)
            goto L4f
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            java.lang.Object r1 = r4.L$0
            kotlin.sequences.o r1 = (kotlin.sequences.o) r1
            kotlin.g0.n(r5)
            goto L37
        L22:
            kotlin.g0.n(r5)
            java.lang.Object r5 = r4.L$0
            r1 = r5
            kotlin.sequences.o r1 = (kotlin.sequences.o) r1
            android.view.View r5 = r4.$this_allViews
            r4.L$0 = r1
            r4.label = r3
            java.lang.Object r5 = r1.c(r5, r4)
            if (r5 != r0) goto L37
            goto L4e
        L37:
            android.view.View r5 = r4.$this_allViews
            boolean r3 = r5 instanceof android.view.ViewGroup
            if (r3 == 0) goto L4f
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            kotlin.sequences.m r5 = androidx.core.view.ViewGroupKt.getDescendants(r5)
            r3 = 0
            r4.L$0 = r3
            r4.label = r2
            java.lang.Object r5 = r1.g(r5, r4)
            if (r5 != r0) goto L4f
        L4e:
            return r0
        L4f:
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }
}
