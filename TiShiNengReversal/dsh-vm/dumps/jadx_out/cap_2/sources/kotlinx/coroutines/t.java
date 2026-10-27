package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t extends kotlinx.coroutines.d0 {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater c = null;

    @kotlin.jvm.Volatile
    private volatile int _resumed;

    static {
            java.lang.Class<kotlinx.coroutines.t> r0 = kotlinx.coroutines.t.class
            java.lang.String r1 = "_resumed"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.t.c = r0
            return
    }

    public t(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r3, @org.jetbrains.annotations.Nullable java.lang.Throwable r4, boolean r5) {
            r2 = this;
            if (r4 != 0) goto L1d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
    }

    public final boolean c() {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.t.c
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            return r0
    }
}
