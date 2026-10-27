package kotlin.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class EmptyCoroutineContext implements kotlin.coroutines.i, java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.coroutines.EmptyCoroutineContext INSTANCE = null;
    private static final long serialVersionUID = 0;

    static {
            kotlin.coroutines.EmptyCoroutineContext r0 = new kotlin.coroutines.EmptyCoroutineContext
            r0.<init>()
            kotlin.coroutines.EmptyCoroutineContext.INSTANCE = r0
            return
    }

    private EmptyCoroutineContext() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.Object readResolve() {
            r1 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            return r0
    }

    @Override // kotlin.coroutines.i
    public <R> R fold(R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.i.b, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r3, r0)
            return r2
    }

    @Override // kotlin.coroutines.i
    @org.jetbrains.annotations.Nullable
    public <E extends kotlin.coroutines.i.b> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.coroutines.i
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            return r1
    }

    @Override // kotlin.coroutines.i
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "EmptyCoroutineContext"
            return r0
    }
}
