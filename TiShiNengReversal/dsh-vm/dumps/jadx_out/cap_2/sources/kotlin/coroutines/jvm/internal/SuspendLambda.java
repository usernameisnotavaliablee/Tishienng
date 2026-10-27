package kotlin.coroutines.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class SuspendLambda extends kotlin.coroutines.jvm.internal.ContinuationImpl implements kotlin.jvm.internal.c0<java.lang.Object>, kotlin.coroutines.jvm.internal.k {
    private final int arity;

    public SuspendLambda(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SuspendLambda(int r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<java.lang.Object> r2) {
            r0 = this;
            r0.<init>(r2)
            r0.arity = r1
            return
    }

    @Override // kotlin.jvm.internal.c0
    public int getArity() {
            r1 = this;
            int r0 = r1.arity
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            kotlin.coroutines.e r0 = r2.getCompletion()
            if (r0 != 0) goto L10
            java.lang.String r0 = kotlin.jvm.internal.o0.w(r2)
            java.lang.String r1 = "renderLambdaToString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
        L10:
            java.lang.String r0 = super.toString()
            return r0
    }
}
