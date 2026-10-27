package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class Lambda<R> implements kotlin.jvm.internal.c0<R>, java.io.Serializable {
    private final int arity;

    public Lambda(int r1) {
            r0 = this;
            r0.<init>()
            r0.arity = r1
            return
    }

    @Override // kotlin.jvm.internal.c0
    public int getArity() {
            r1 = this;
            int r0 = r1.arity
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = kotlin.jvm.internal.o0.x(r2)
            java.lang.String r1 = "renderLambdaToString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }
}
