package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class u<T> implements kotlinx.coroutines.flow.x<T>, kotlinx.coroutines.flow.c<T>, kotlinx.coroutines.flow.internal.p<T> {

    @org.jetbrains.annotations.Nullable
    private final kotlinx.coroutines.e2 a;
    private final /* synthetic */ kotlinx.coroutines.flow.x<T> b;

    public u(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.x<? extends T> r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.e2 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r1
            return
    }

    @Override // kotlinx.coroutines.flow.x
    @org.jetbrains.annotations.NotNull
    public java.util.List<T> a() {
            r1 = this;
            kotlinx.coroutines.flow.x<T> r0 = r1.b
            java.util.List r0 = r0.a()
            return r0
    }

    @Override // kotlinx.coroutines.flow.x, kotlinx.coroutines.flow.i
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r3) {
            r1 = this;
            kotlinx.coroutines.flow.x<T> r0 = r1.b
            java.lang.Object r2 = r0.collect(r2, r3)
            return r2
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.i<T> e(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3) {
            r0 = this;
            kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.flow.z.e(r0, r1, r2, r3)
            return r1
    }
}
