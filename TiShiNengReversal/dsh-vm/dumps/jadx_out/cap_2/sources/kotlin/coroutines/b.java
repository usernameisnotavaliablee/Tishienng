package kotlin.coroutines;

import kotlin.coroutines.i.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.ExperimentalStdlibApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class b<B extends kotlin.coroutines.i.b, E extends B> implements kotlin.coroutines.i.c<E> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.i.b, E> a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.i.c<?> b;

    public b(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<B> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.i.b, ? extends E> r3) {
            r1 = this;
            java.lang.String r0 = "baseKey"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "safeCast"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r3
            boolean r3 = r2 instanceof kotlin.coroutines.b
            if (r3 == 0) goto L17
            kotlin.coroutines.b r2 = (kotlin.coroutines.b) r2
            kotlin.coroutines.i$c<?> r2 = r2.b
        L17:
            r1.b = r2
            return
    }

    public final boolean a(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r2 == r1) goto Le
            kotlin.coroutines.i$c<?> r0 = r1.b
            if (r0 != r2) goto Lc
            goto Le
        Lc:
            r2 = 0
            return r2
        Le:
            r2 = 1
            return r2
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/i$b;)TE; */
    @org.jetbrains.annotations.Nullable
    public final kotlin.coroutines.i.b b(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r2) {
            r1 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.jvm.functions.Function1<kotlin.coroutines.i$b, E extends B> r0 = r1.a
            java.lang.Object r2 = r0.invoke(r2)
            kotlin.coroutines.i$b r2 = (kotlin.coroutines.i.b) r2
            return r2
    }
}
