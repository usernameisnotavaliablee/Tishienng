package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface t<T> extends kotlinx.coroutines.flow.h0<T>, kotlinx.coroutines.flow.s<T> {
    boolean compareAndSet(T r1, T r2);

    @Override // kotlinx.coroutines.flow.h0
    T getValue();

    void setValue(T r1);
}
