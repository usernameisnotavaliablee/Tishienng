package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class l3 implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater d = null;

    @kotlin.jvm.Volatile
    private volatile int _state;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.e2 a;
    private final java.lang.Thread b;

    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.j1 c;

    static {
            java.lang.Class<kotlinx.coroutines.l3> r0 = kotlinx.coroutines.l3.class
            java.lang.String r1 = "_state"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.l3.d = r0
            return
    }

    public l3(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r0.b = r1
            return
    }

    private final java.lang.Void b(int r4) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal state "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private final void d(java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.n1> r3, java.lang.Object r4) {
            r1 = this;
        L0:
            int r0 = r2.get(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r0)
            goto L0
    }

    public final void a() {
            r4 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.l3.d
        L2:
            int r1 = r0.get(r4)
            if (r1 == 0) goto L1b
            r2 = 2
            if (r1 == r2) goto L2
            r0 = 3
            if (r1 != r0) goto L12
            java.lang.Thread.interrupted()
            return
        L12:
            r4.b(r1)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L1b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.l3.d
            r3 = 1
            boolean r1 = r2.compareAndSet(r4, r1, r3)
            if (r1 == 0) goto L2
            kotlinx.coroutines.j1 r0 = r4.c
            if (r0 == 0) goto L2b
            r0.dispose()
        L2b:
            return
    }

    public void c(@org.jetbrains.annotations.Nullable java.lang.Throwable r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = kotlinx.coroutines.l3.d
        L2:
            int r0 = r5.get(r4)
            r1 = 3
            r2 = 2
            if (r0 == 0) goto L1c
            r5 = 1
            if (r0 == r5) goto L1b
            if (r0 == r2) goto L1b
            if (r0 != r1) goto L12
            goto L1b
        L12:
            r4.b(r0)
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        L1b:
            return
        L1c:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.l3.d
            boolean r0 = r3.compareAndSet(r4, r0, r2)
            if (r0 == 0) goto L2
            java.lang.Thread r5 = r4.b
            r5.interrupt()
            r3.set(r4, r1)
            return
    }

    public final void f() {
            r4 = this;
            kotlinx.coroutines.e2 r0 = r4.a
            r1 = 1
            kotlinx.coroutines.j1 r0 = r0.G(r1, r1, r4)
            r4.c = r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.l3.d
        Lb:
            int r1 = r0.get(r4)
            if (r1 == 0) goto L21
            r0 = 2
            if (r1 == r0) goto L2a
            r0 = 3
            if (r1 != r0) goto L18
            goto L2a
        L18:
            r4.b(r1)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L21:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.l3.d
            r3 = 0
            boolean r1 = r2.compareAndSet(r4, r1, r3)
            if (r1 == 0) goto Lb
        L2a:
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.c(r1)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }
}
