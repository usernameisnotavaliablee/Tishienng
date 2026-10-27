package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class d0 {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = null;

    @kotlin.jvm.Volatile
    private volatile int _handled;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.Throwable a;

    static {
            java.lang.Class<kotlinx.coroutines.d0> r0 = kotlinx.coroutines.d0.class
            java.lang.String r1 = "_handled"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.d0.b = r0
            return
    }

    public d0(@org.jetbrains.annotations.NotNull java.lang.Throwable r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0._handled = r2
            return
    }

    public /* synthetic */ d0(java.lang.Throwable r1, boolean r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    public final boolean a() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.d0.b
            int r0 = r0.get(r1)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean b() {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.d0.b
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.u0.a(r2)
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            java.lang.Throwable r1 = r2.a
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
