package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Edge<T> implements androidx.core.util.Consumer<T> {
    private androidx.core.util.Consumer<T> mListener;

    public Edge() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.core.util.Consumer
    public void accept(@androidx.annotation.NonNull T r3) {
            r2 = this;
            androidx.core.util.Consumer<T> r0 = r2.mListener
            java.lang.String r1 = "Listener is not set."
            kotlin.jvm.internal.g0.n(r0, r1)
            androidx.core.util.Consumer<T> r0 = r2.mListener
            r0.accept(r3)
            return
    }

    public void setListener(@androidx.annotation.NonNull androidx.core.util.Consumer<T> r1) {
            r0 = this;
            r0.mListener = r1
            return
    }
}
