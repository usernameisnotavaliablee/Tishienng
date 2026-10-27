package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n0<T> {

    @org.jetbrains.annotations.NotNull
    private volatile java.util.concurrent.atomic.AtomicReferenceArray<T> array;

    public n0(int r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r2)
            r1.array = r0
            return
    }

    public final int a() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<T> r0 = r1.array
            int r0 = r0.length()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final T b(int r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<T> r0 = r2.array
            int r1 = r0.length()
            if (r3 >= r1) goto Ld
            java.lang.Object r3 = r0.get(r3)
            return r3
        Ld:
            r3 = 0
            return r3
    }

    public final void c(int r6, @org.jetbrains.annotations.Nullable T r7) {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<T> r0 = r5.array
            int r1 = r0.length()
            if (r6 >= r1) goto Lc
            r0.set(r6, r7)
            return
        Lc:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r3 = r6 + 1
            int r4 = r1 * 2
            int r3 = kotlin.ranges.t.u(r3, r4)
            r2.<init>(r3)
            r3 = 0
        L1a:
            if (r3 >= r1) goto L26
            java.lang.Object r4 = r0.get(r3)
            r2.set(r3, r4)
            int r3 = r3 + 1
            goto L1a
        L26:
            r2.set(r6, r7)
            r5.array = r2
            return
    }
}
