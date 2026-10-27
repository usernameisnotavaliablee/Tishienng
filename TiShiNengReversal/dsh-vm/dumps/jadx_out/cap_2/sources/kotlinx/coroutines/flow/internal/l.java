package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l implements kotlin.coroutines.i {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.Throwable a;
    private final /* synthetic */ kotlin.coroutines.i b;

    public l(@org.jetbrains.annotations.NotNull java.lang.Throwable r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // kotlin.coroutines.i
    public <R> R fold(R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.i.b, ? extends R> r3) {
            r1 = this;
            kotlin.coroutines.i r0 = r1.b
            java.lang.Object r2 = r0.fold(r2, r3)
            return r2
    }

    @Override // kotlin.coroutines.i
    @org.jetbrains.annotations.Nullable
    public <E extends kotlin.coroutines.i.b> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r2) {
            r1 = this;
            kotlin.coroutines.i r0 = r1.b
            kotlin.coroutines.i$b r2 = r0.get(r2)
            return r2
    }

    @Override // kotlin.coroutines.i
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r2) {
            r1 = this;
            kotlin.coroutines.i r0 = r1.b
            kotlin.coroutines.i r2 = r0.minusKey(r2)
            return r2
    }

    @Override // kotlin.coroutines.i
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
            r1 = this;
            kotlin.coroutines.i r0 = r1.b
            kotlin.coroutines.i r2 = r0.plus(r2)
            return r2
    }
}
