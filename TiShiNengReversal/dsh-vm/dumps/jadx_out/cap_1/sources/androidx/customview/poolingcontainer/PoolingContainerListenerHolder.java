package androidx.customview.poolingcontainer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class PoolingContainerListenerHolder {

    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<androidx.customview.poolingcontainer.PoolingContainerListener> listeners;

    public PoolingContainerListenerHolder() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.listeners = r0
            return
    }

    public final void addListener(@org.jetbrains.annotations.NotNull androidx.customview.poolingcontainer.PoolingContainerListener r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.ArrayList<androidx.customview.poolingcontainer.PoolingContainerListener> r0 = r1.listeners
            r0.add(r2)
            return
    }

    public final void onRelease() {
            r2 = this;
            java.util.ArrayList<androidx.customview.poolingcontainer.PoolingContainerListener> r0 = r2.listeners
            int r0 = kotlin.collections.f0.L(r0)
        L6:
            r1 = -1
            if (r1 >= r0) goto L17
            java.util.ArrayList<androidx.customview.poolingcontainer.PoolingContainerListener> r1 = r2.listeners
            java.lang.Object r1 = r1.get(r0)
            androidx.customview.poolingcontainer.PoolingContainerListener r1 = (androidx.customview.poolingcontainer.PoolingContainerListener) r1
            r1.onRelease()
            int r0 = r0 + (-1)
            goto L6
        L17:
            return
    }

    public final void removeListener(@org.jetbrains.annotations.NotNull androidx.customview.poolingcontainer.PoolingContainerListener r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.ArrayList<androidx.customview.poolingcontainer.PoolingContainerListener> r0 = r1.listeners
            r0.remove(r2)
            return
    }
}
