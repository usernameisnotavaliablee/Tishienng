package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class a0<E> implements kotlinx.coroutines.r3 {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.q<kotlinx.coroutines.channels.n<? extends E>> a;

    public a0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.q<? super kotlinx.coroutines.channels.n<? extends E>> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlinx.coroutines.r3
    public void b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.p0<?> r2, int r3) {
            r1 = this;
            kotlinx.coroutines.q<kotlinx.coroutines.channels.n<? extends E>> r0 = r1.a
            r0.b(r2, r3)
            return
    }
}
