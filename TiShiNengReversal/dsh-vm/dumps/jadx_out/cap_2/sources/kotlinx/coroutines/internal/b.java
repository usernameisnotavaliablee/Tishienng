package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlinx.coroutines.InternalCoroutinesApi
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAtomic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Atomic.kt\nkotlinx/coroutines/internal/AtomicOp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class b<T> extends kotlinx.coroutines.internal.k0 {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = null;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _consensus;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_consensus"
            java.lang.Class<kotlinx.coroutines.internal.b> r2 = kotlinx.coroutines.internal.b.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.b.a = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = kotlinx.coroutines.internal.a.a
            r1._consensus = r0
            return
    }

    private final java.lang.Object d(java.lang.Object r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.b.a
            java.lang.Object r1 = r0.get(r3)
            java.lang.Object r2 = kotlinx.coroutines.internal.a.a
            if (r1 == r2) goto Lb
            return r1
        Lb:
            boolean r1 = androidx.concurrent.futures.a.a(r0, r3, r2, r4)
            if (r1 == 0) goto L12
            return r4
        L12:
            java.lang.Object r4 = r0.get(r3)
            return r4
    }

    @Override // kotlinx.coroutines.internal.k0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.internal.b<?> a() {
            r0 = this;
            return r0
    }

    @Override // kotlinx.coroutines.internal.k0
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object b(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.b.a
            java.lang.Object r0 = r0.get(r2)
            java.lang.Object r1 = kotlinx.coroutines.internal.a.a
            if (r0 != r1) goto L12
            java.lang.Object r0 = r2.e(r3)
            java.lang.Object r0 = r2.d(r0)
        L12:
            r2.c(r3, r0)
            return r0
    }

    public abstract void c(T r1, @org.jetbrains.annotations.Nullable java.lang.Object r2);

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object e(T r1);
}
