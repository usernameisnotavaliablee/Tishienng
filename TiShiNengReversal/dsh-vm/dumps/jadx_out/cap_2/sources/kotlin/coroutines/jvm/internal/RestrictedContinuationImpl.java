package kotlin.coroutines.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class RestrictedContinuationImpl extends kotlin.coroutines.jvm.internal.BaseContinuationImpl {
    public RestrictedContinuationImpl(@org.jetbrains.annotations.Nullable kotlin.coroutines.e<java.lang.Object> r2) {
            r1 = this;
            r1.<init>(r2)
            if (r2 == 0) goto L16
            kotlin.coroutines.i r2 = r2.getContext()
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r2 != r0) goto Le
            return
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Coroutines with restricted suspension must have EmptyCoroutineContext"
            r2.<init>(r0)
            throw r2
        L16:
            return
    }

    @Override // kotlin.coroutines.e
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i getContext() {
            r1 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            return r0
    }
}
