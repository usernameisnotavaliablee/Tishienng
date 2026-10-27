package kotlinx.coroutines.sync;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n371#1,2:398\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n384#1:398,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class g extends kotlinx.coroutines.internal.p0<kotlinx.coroutines.sync.g> {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicReferenceArray e;

    public g(long r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.sync.g r3, int r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = kotlinx.coroutines.sync.f.h()
            r1.<init>(r2)
            r0.e = r1
            return
    }

    @Override // kotlinx.coroutines.internal.p0
    public int p() {
            r1 = this;
            int r0 = kotlinx.coroutines.sync.f.h()
            return r0
    }

    @Override // kotlinx.coroutines.internal.p0
    public void q(int r1, @org.jetbrains.annotations.Nullable java.lang.Throwable r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r3) {
            r0 = this;
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.sync.f.e()
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r0.v()
            r3.set(r1, r2)
            r0.r()
            return
    }

    public final boolean t(int r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.v()
            boolean r2 = com.google.common.util.concurrent.b.a(r0, r2, r3, r4)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SemaphoreSegment[id="
            r0.append(r1)
            long r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", hashCode="
            r0.append(r1)
            int r1 = r3.hashCode()
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object u(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.v()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.atomic.AtomicReferenceArray v() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.e
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object w(int r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.v()
            java.lang.Object r2 = r0.getAndSet(r2, r3)
            return r2
    }

    public final void x(int r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.v()
            r0.set(r2, r3)
            return
    }
}
