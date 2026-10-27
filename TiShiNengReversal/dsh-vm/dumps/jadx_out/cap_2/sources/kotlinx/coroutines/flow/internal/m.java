package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class m<T> extends kotlinx.coroutines.internal.o0<T> {
    public m(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlinx.coroutines.l2
    public boolean n0(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.flow.internal.ChildCancelledException
            if (r0 == 0) goto L6
            r2 = 1
            return r2
        L6:
            boolean r2 = r1.i0(r2)
            return r2
    }
}
