package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class w<E> extends kotlinx.coroutines.channels.g<E> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.e<kotlin.n1> e;

    public w(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.d<E> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.z<? super E>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            kotlin.coroutines.e r2 = kotlin.coroutines.intrinsics.a.c(r4, r1, r1)
            r1.e = r2
            return
    }

    @Override // kotlinx.coroutines.l2
    protected void f1() {
            r1 = this;
            kotlin.coroutines.e<kotlin.n1> r0 = r1.e
            n4.a.c(r0, r1)
            return
    }

    @Override // kotlinx.coroutines.channels.g, kotlinx.coroutines.channels.d
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.b0<E> m() {
            r1 = this;
            kotlinx.coroutines.channels.d r0 = r1.A1()
            kotlinx.coroutines.channels.b0 r0 = r0.m()
            r1.start()
            return r0
    }
}
