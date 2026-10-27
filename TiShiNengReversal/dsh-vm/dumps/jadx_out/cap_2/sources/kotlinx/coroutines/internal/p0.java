package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.p0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n1#1,269:1\n252#2,4:270\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n*L\n225#1:270,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class p0<S extends kotlinx.coroutines.internal.p0<S>> extends kotlinx.coroutines.internal.g<S> implements kotlinx.coroutines.t2 {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater d = null;

    @kotlin.jvm.JvmField
    public final long c;

    @kotlin.jvm.Volatile
    private volatile int cleanedAndPointers;

    static {
            java.lang.Class<kotlinx.coroutines.internal.p0> r0 = kotlinx.coroutines.internal.p0.class
            java.lang.String r1 = "cleanedAndPointers"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.internal.p0.d = r0
            return
    }

    public p0(long r1, @org.jetbrains.annotations.Nullable S r3, int r4) {
            r0 = this;
            r0.<init>(r3)
            r0.c = r1
            int r1 = r4 << 16
            r0.cleanedAndPointers = r1
            return
    }

    @Override // kotlinx.coroutines.internal.g
    public boolean h() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.p0.d
            int r0 = r0.get(r2)
            int r1 = r2.p()
            if (r0 != r1) goto L14
            boolean r0 = r2.i()
            if (r0 != 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public final boolean o() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.p0.d
            r1 = -65536(0xffffffffffff0000, float:NaN)
            int r0 = r0.addAndGet(r2, r1)
            int r1 = r2.p()
            if (r0 != r1) goto L16
            boolean r0 = r2.i()
            if (r0 != 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public abstract int p();

    public abstract void q(int r1, @org.jetbrains.annotations.Nullable java.lang.Throwable r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r3);

    public final void r() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.p0.d
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.p()
            if (r0 != r1) goto Lf
            r2.l()
        Lf:
            return
    }

    public final boolean s() {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.p0.d
        L2:
            int r1 = r0.get(r3)
            int r2 = r3.p()
            if (r1 != r2) goto L15
            boolean r2 = r3.i()
            if (r2 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r2 = 65536(0x10000, float:9.1835E-41)
            int r2 = r2 + r1
            boolean r1 = r0.compareAndSet(r3, r1, r2)
            if (r1 == 0) goto L2
            r0 = 1
            return r0
    }
}
