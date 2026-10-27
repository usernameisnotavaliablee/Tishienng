package kotlinx.coroutines.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,255:1\n93#2:256\n93#2:257\n93#2:258\n93#2:261\n93#2:262\n1#3:259\n25#4:260\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n95#1:256\n162#1:257\n185#1:258\n205#1:261\n249#1:262\n205#1:260\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater b = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater c = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater d = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater e = null;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.j> a;

    @kotlin.jvm.Volatile
    private volatile int blockingTasksInBuffer;

    @kotlin.jvm.Volatile
    private volatile int consumerIndex;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object lastScheduledTask;

    @kotlin.jvm.Volatile
    private volatile int producerIndex;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "lastScheduledTask"
            java.lang.Class<kotlinx.coroutines.scheduling.p> r2 = kotlinx.coroutines.scheduling.p.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.scheduling.p.b = r0
            java.lang.String r0 = "producerIndex"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.scheduling.p.c = r0
            java.lang.String r0 = "consumerIndex"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.scheduling.p.d = r0
            java.lang.String r0 = "blockingTasksInBuffer"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.scheduling.p.e = r0
            return
    }

    public p() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.a = r0
            return
    }

    public static /* synthetic */ kotlinx.coroutines.scheduling.j b(kotlinx.coroutines.scheduling.p r0, kotlinx.coroutines.scheduling.j r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlinx.coroutines.scheduling.j r0 = r0.a(r1, r2)
            return r0
    }

    private final kotlinx.coroutines.scheduling.j c(kotlinx.coroutines.scheduling.j r4) {
            r3 = this;
            int r0 = r3.e()
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 != r1) goto L9
            return r4
        L9:
            kotlinx.coroutines.scheduling.k r0 = r4.b
            int r0 = r0.q()
            r2 = 1
            if (r0 != r2) goto L17
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.p.e
            r0.incrementAndGet(r3)
        L17:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.p.c
            int r0 = r0.get(r3)
            r0 = r0 & r1
        L1e:
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.j> r1 = r3.a
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L2a
            java.lang.Thread.yield()
            goto L1e
        L2a:
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.j> r1 = r3.a
            r1.lazySet(r0, r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = kotlinx.coroutines.scheduling.p.c
            r4.incrementAndGet(r3)
            r4 = 0
            return r4
    }

    private final void d(kotlinx.coroutines.scheduling.j r2) {
            r1 = this;
            if (r2 == 0) goto L10
            kotlinx.coroutines.scheduling.k r2 = r2.b
            int r2 = r2.q()
            r0 = 1
            if (r2 != r0) goto L10
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.scheduling.p.e
            r2.decrementAndGet(r1)
        L10:
            return
    }

    private final int e() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.p.c
            int r0 = r0.get(r2)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.scheduling.p.d
            int r1 = r1.get(r2)
            int r0 = r0 - r1
            return r0
    }

    private final kotlinx.coroutines.scheduling.j j() {
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.p.d
            int r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.scheduling.p.c
            int r2 = r2.get(r5)
            int r2 = r1 - r2
            r3 = 0
            if (r2 != 0) goto L12
            return r3
        L12:
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r1 + 1
            boolean r0 = r0.compareAndSet(r5, r1, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.j> r0 = r5.a
            java.lang.Object r0 = r0.getAndSet(r2, r3)
            kotlinx.coroutines.scheduling.j r0 = (kotlinx.coroutines.scheduling.j) r0
            if (r0 != 0) goto L27
            goto L0
        L27:
            r5.d(r0)
            return r0
    }

    private final boolean l(kotlinx.coroutines.scheduling.e r2) {
            r1 = this;
            kotlinx.coroutines.scheduling.j r0 = r1.j()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r2.a(r0)
            r2 = 1
            return r2
    }

    private final kotlinx.coroutines.scheduling.j m(boolean r6) {
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.p.b
            java.lang.Object r1 = r0.get(r5)
            kotlinx.coroutines.scheduling.j r1 = (kotlinx.coroutines.scheduling.j) r1
            r2 = 0
            if (r1 != 0) goto Lc
            goto L20
        Lc:
            kotlinx.coroutines.scheduling.k r3 = r1.b
            int r3 = r3.q()
            r4 = 1
            if (r3 != r4) goto L16
            goto L17
        L16:
            r4 = 0
        L17:
            if (r4 != r6) goto L20
            boolean r0 = androidx.concurrent.futures.a.a(r0, r5, r1, r2)
            if (r0 == 0) goto L0
            return r1
        L20:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.p.d
            int r0 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.scheduling.p.c
            int r1 = r1.get(r5)
        L2c:
            if (r0 == r1) goto L42
            if (r6 == 0) goto L39
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.scheduling.p.e
            int r3 = r3.get(r5)
            if (r3 != 0) goto L39
            return r2
        L39:
            int r1 = r1 + (-1)
            kotlinx.coroutines.scheduling.j r3 = r5.o(r1, r6)
            if (r3 == 0) goto L2c
            return r3
        L42:
            return r2
    }

    private final kotlinx.coroutines.scheduling.j n(int r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.p.d
            int r0 = r0.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.scheduling.p.c
            int r1 = r1.get(r4)
            r2 = 1
            if (r5 != r2) goto L10
            goto L11
        L10:
            r2 = 0
        L11:
            r5 = 0
            if (r0 == r1) goto L2a
            if (r2 == 0) goto L1f
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.scheduling.p.e
            int r3 = r3.get(r4)
            if (r3 != 0) goto L1f
            return r5
        L1f:
            int r5 = r0 + 1
            kotlinx.coroutines.scheduling.j r0 = r4.o(r0, r2)
            if (r0 != 0) goto L29
            r0 = r5
            goto L11
        L29:
            return r0
        L2a:
            return r5
    }

    private final kotlinx.coroutines.scheduling.j o(int r5, boolean r6) {
            r4 = this;
            r5 = r5 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.j> r0 = r4.a
            java.lang.Object r0 = r0.get(r5)
            kotlinx.coroutines.scheduling.j r0 = (kotlinx.coroutines.scheduling.j) r0
            r1 = 0
            if (r0 == 0) goto L2a
            kotlinx.coroutines.scheduling.k r2 = r0.b
            int r2 = r2.q()
            r3 = 1
            if (r2 != r3) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            if (r3 != r6) goto L2a
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.j> r2 = r4.a
            boolean r5 = com.google.common.util.concurrent.b.a(r2, r5, r0, r1)
            if (r5 == 0) goto L2a
            if (r6 == 0) goto L29
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = kotlinx.coroutines.scheduling.p.e
            r5.decrementAndGet(r4)
        L29:
            return r0
        L2a:
            return r1
    }

    private final long q(int r8, kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.scheduling.j> r9) {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.p.b
            java.lang.Object r1 = r0.get(r7)
            kotlinx.coroutines.scheduling.j r1 = (kotlinx.coroutines.scheduling.j) r1
            r2 = -2
            if (r1 != 0) goto Ld
            return r2
        Ld:
            kotlinx.coroutines.scheduling.k r4 = r1.b
            int r4 = r4.q()
            r5 = 1
            if (r4 != r5) goto L17
            goto L18
        L17:
            r5 = 2
        L18:
            r4 = r5 & r8
            if (r4 != 0) goto L1d
            return r2
        L1d:
            kotlinx.coroutines.scheduling.i r2 = kotlinx.coroutines.scheduling.n.f
            long r2 = r2.a()
            long r4 = r1.a
            long r2 = r2 - r4
            long r4 = kotlinx.coroutines.scheduling.n.b
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L2e
            long r4 = r4 - r2
            return r4
        L2e:
            r2 = 0
            boolean r0 = androidx.concurrent.futures.a.a(r0, r7, r1, r2)
            if (r0 == 0) goto L0
            r9.element = r1
            r8 = -1
            return r8
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.scheduling.j a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.j r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            kotlinx.coroutines.scheduling.j r1 = r0.c(r1)
            return r1
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.scheduling.p.b
            java.lang.Object r1 = r2.getAndSet(r0, r1)
            kotlinx.coroutines.scheduling.j r1 = (kotlinx.coroutines.scheduling.j) r1
            if (r1 != 0) goto L13
            r1 = 0
            return r1
        L13:
            kotlinx.coroutines.scheduling.j r1 = r0.c(r1)
            return r1
    }

    public final int f() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.p.b
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Lf
            int r0 = r1.e()
            int r0 = r0 + 1
            return r0
        Lf:
            int r0 = r1.e()
            return r0
    }

    public final void g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.e r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.p.b
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            kotlinx.coroutines.scheduling.j r0 = (kotlinx.coroutines.scheduling.j) r0
            if (r0 == 0) goto Le
            r3.a(r0)
        Le:
            boolean r0 = r2.l(r3)
            if (r0 != 0) goto Le
            return
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.scheduling.j h() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.p.b
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            kotlinx.coroutines.scheduling.j r0 = (kotlinx.coroutines.scheduling.j) r0
            if (r0 != 0) goto Lf
            kotlinx.coroutines.scheduling.j r0 = r2.j()
        Lf:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.scheduling.j i() {
            r1 = this;
            r0 = 1
            kotlinx.coroutines.scheduling.j r0 = r1.m(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.scheduling.j k() {
            r1 = this;
            r0 = 0
            kotlinx.coroutines.scheduling.j r0 = r1.m(r0)
            return r0
    }

    public final long p(int r2, @org.jetbrains.annotations.NotNull kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.scheduling.j> r3) {
            r1 = this;
            r0 = 3
            if (r2 != r0) goto L8
            kotlinx.coroutines.scheduling.j r0 = r1.j()
            goto Lc
        L8:
            kotlinx.coroutines.scheduling.j r0 = r1.n(r2)
        Lc:
            if (r0 == 0) goto L13
            r3.element = r0
            r2 = -1
            return r2
        L13:
            long r2 = r1.q(r2, r3)
            return r2
    }
}
