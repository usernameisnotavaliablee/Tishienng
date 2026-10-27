package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class CoroutineLiveDataKt$addDisposableSource$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super androidx.lifecycle.EmittedSource>, java.lang.Object> {
    final /* synthetic */ androidx.lifecycle.LiveData<T> $source;
    final /* synthetic */ androidx.lifecycle.MediatorLiveData<T> $this_addDisposableSource;
    int label;


    CoroutineLiveDataKt$addDisposableSource$2(androidx.lifecycle.MediatorLiveData<T> r1, androidx.lifecycle.LiveData<T> r2, kotlin.coroutines.e<? super androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2> r3) {
            r0 = this;
            r0.$this_addDisposableSource = r1
            r0.$source = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2 r3 = new androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2
            androidx.lifecycle.MediatorLiveData<T> r0 = r2.$this_addDisposableSource
            androidx.lifecycle.LiveData<T> r1 = r2.$source
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
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super androidx.lifecycle.EmittedSource> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2 r1 = (androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            r3 = this;
            kotlin.coroutines.intrinsics.a.l()
            int r0 = r3.label
            if (r0 != 0) goto L25
            kotlin.g0.n(r4)
            androidx.lifecycle.MediatorLiveData<T> r4 = r3.$this_addDisposableSource
            androidx.lifecycle.LiveData<T> r0 = r3.$source
            androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2$1 r1 = new androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2$1
            r1.<init>(r4)
            androidx.lifecycle.CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0 r2 = new androidx.lifecycle.CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0
            r2.<init>(r1)
            r4.addSource(r0, r2)
            androidx.lifecycle.EmittedSource r4 = new androidx.lifecycle.EmittedSource
            androidx.lifecycle.LiveData<T> r0 = r3.$source
            androidx.lifecycle.MediatorLiveData<T> r1 = r3.$this_addDisposableSource
            r4.<init>(r0, r1)
            return r4
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
    }
}
