package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LiveDataKt {
    @kotlin.Deprecated(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public static final <T> androidx.lifecycle.Observer<T> observe(@org.jetbrains.annotations.NotNull androidx.lifecycle.LiveData<T> r1, @org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.n1> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "onChanged"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1 r0 = new androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1
            r0.<init>(r3)
            r1.observe(r2, r0)
            return r0
    }
}
