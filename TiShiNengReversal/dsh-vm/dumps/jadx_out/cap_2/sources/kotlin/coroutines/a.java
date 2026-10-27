package kotlin.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a implements kotlin.coroutines.i.b {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.i.c<?> key;

    public a(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.key = r2
            return
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    public /* bridge */ <R> R fold(R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.i.b, ? extends R> r2) {
            r0 = this;
            java.lang.Object r1 = kotlin.coroutines.i.b.a.a(r0, r1, r2)
            return r1
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @org.jetbrains.annotations.Nullable
    public /* bridge */ <E extends kotlin.coroutines.i.b> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r1) {
            r0 = this;
            kotlin.coroutines.i$b r1 = kotlin.coroutines.i.b.a.b(r0, r1)
            return r1
    }

    @Override // kotlin.coroutines.i.b
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i.c<?> getKey() {
            r1 = this;
            kotlin.coroutines.i$c<?> r0 = r1.key
            return r0
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @org.jetbrains.annotations.NotNull
    public /* bridge */ kotlin.coroutines.i minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r1) {
            r0 = this;
            kotlin.coroutines.i r1 = kotlin.coroutines.i.b.a.c(r0, r1)
            return r1
    }

    @Override // kotlin.coroutines.i
    @org.jetbrains.annotations.NotNull
    public /* bridge */ kotlin.coroutines.i plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            r0 = this;
            kotlin.coroutines.i r1 = kotlin.coroutines.i.b.a.d(r0, r1)
            return r1
    }
}
