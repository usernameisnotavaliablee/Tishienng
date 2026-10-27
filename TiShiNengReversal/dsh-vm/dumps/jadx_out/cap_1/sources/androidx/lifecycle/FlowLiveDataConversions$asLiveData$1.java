package androidx.lifecycle;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class FlowLiveDataConversions$asLiveData$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.lifecycle.LiveDataScope<T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.i<T> $this_asLiveData;
    private /* synthetic */ java.lang.Object L$0;
    int label;


    FlowLiveDataConversions$asLiveData$1(kotlinx.coroutines.flow.i<? extends T> r1, kotlin.coroutines.e<? super androidx.lifecycle.FlowLiveDataConversions$asLiveData$1> r2) {
            r0 = this;
            r0.$this_asLiveData = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.lifecycle.FlowLiveDataConversions$asLiveData$1 r0 = new androidx.lifecycle.FlowLiveDataConversions$asLiveData$1
            kotlinx.coroutines.flow.i<T> r1 = r2.$this_asLiveData
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull androidx.lifecycle.LiveDataScope<T> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.lifecycle.FlowLiveDataConversions$asLiveData$1 r1 = (androidx.lifecycle.FlowLiveDataConversions$asLiveData$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            androidx.lifecycle.LiveDataScope r1 = (androidx.lifecycle.LiveDataScope) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.g0.n(r5)
            goto L2e
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.g0.n(r5)
            java.lang.Object r5 = r4.L$0
            androidx.lifecycle.LiveDataScope r5 = (androidx.lifecycle.LiveDataScope) r5
            kotlinx.coroutines.flow.i<T> r1 = r4.$this_asLiveData
            androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$1 r3 = new androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$1
            r3.<init>(r5)
            r4.label = r2
            java.lang.Object r5 = r1.collect(r3, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }
}
