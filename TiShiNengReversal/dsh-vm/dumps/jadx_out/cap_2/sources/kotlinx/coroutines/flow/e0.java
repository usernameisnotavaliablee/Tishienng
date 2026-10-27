package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class e0 implements kotlinx.coroutines.flow.c0 {
    public e0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.c0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.i<kotlinx.coroutines.flow.SharingCommand> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.h0<java.lang.Integer> r1) {
            r0 = this;
            kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.START
            kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.flow.k.M0(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "SharingStarted.Eagerly"
            return r0
    }
}
