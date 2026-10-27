package androidx.activity.contextaware;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ContextAwareHelper {

    @org.jetbrains.annotations.Nullable
    private volatile android.content.Context context;

    @org.jetbrains.annotations.NotNull
    private final java.util.Set<androidx.activity.contextaware.OnContextAvailableListener> listeners;

    public ContextAwareHelper() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r1.listeners = r0
            return
    }

    public final void addOnContextAvailableListener(@org.jetbrains.annotations.NotNull androidx.activity.contextaware.OnContextAvailableListener r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.g0.p(r2, r0)
            android.content.Context r0 = r1.context
            if (r0 == 0) goto Lc
            r2.onContextAvailable(r0)
        Lc:
            java.util.Set<androidx.activity.contextaware.OnContextAvailableListener> r0 = r1.listeners
            r0.add(r2)
            return
    }

    public final void clearAvailableContext() {
            r1 = this;
            r0 = 0
            r1.context = r0
            return
    }

    public final void dispatchOnContextAvailable(@org.jetbrains.annotations.NotNull android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.context = r3
            java.util.Set<androidx.activity.contextaware.OnContextAvailableListener> r0 = r2.listeners
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            androidx.activity.contextaware.OnContextAvailableListener r1 = (androidx.activity.contextaware.OnContextAvailableListener) r1
            r1.onContextAvailable(r3)
            goto Ld
        L1d:
            return
    }

    @org.jetbrains.annotations.Nullable
    public final android.content.Context peekAvailableContext() {
            r1 = this;
            android.content.Context r0 = r1.context
            return r0
    }

    public final void removeOnContextAvailableListener(@org.jetbrains.annotations.NotNull androidx.activity.contextaware.OnContextAvailableListener r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set<androidx.activity.contextaware.OnContextAvailableListener> r0 = r1.listeners
            r0.remove(r2)
            return
    }
}
