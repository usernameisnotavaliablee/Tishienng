package kotlinx.coroutines.future;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class g<T> implements java.util.function.BiFunction<T, java.lang.Throwable, kotlin.n1> {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public volatile kotlin.coroutines.e<? super T> cont;

    public g(@org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.cont = r1
            return
    }

    public void a(@org.jetbrains.annotations.Nullable T r2, @org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
            r1 = this;
            kotlin.coroutines.e<? super T> r0 = r1.cont
            if (r0 != 0) goto L5
            return
        L5:
            if (r3 != 0) goto L11
            kotlin.Result$a r3 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.Result.m11constructorimpl(r2)
            r0.resumeWith(r2)
            return
        L11:
            boolean r2 = kotlinx.coroutines.future.d.a(r3)
            if (r2 == 0) goto L1c
            java.util.concurrent.CompletionException r2 = kotlinx.coroutines.future.e.a(r3)
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto L27
            java.lang.Throwable r2 = kotlinx.coroutines.future.f.a(r2)
            if (r2 != 0) goto L26
            goto L27
        L26:
            r3 = r2
        L27:
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.g0.a(r3)
            java.lang.Object r2 = kotlin.Result.m11constructorimpl(r2)
            r0.resumeWith(r2)
            return
    }

    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ kotlin.n1 apply(java.lang.Object r1, java.lang.Throwable r2) {
            r0 = this;
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r0.a(r1, r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }
}
