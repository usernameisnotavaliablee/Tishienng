package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class a0 implements java.util.Iterator<kotlin.d1>, l3.a {
    private final long a;
    private boolean b;
    private final long c;
    private long d;

    private a0(long r6, long r8, long r10) {
            r5 = this;
            r5.<init>()
            r5.a = r8
            r0 = 0
            r2 = 0
            r3 = 1
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            int r0 = androidx.collection.a.a(r6, r8)
            if (r4 <= 0) goto L15
            if (r0 > 0) goto L18
        L13:
            r2 = 1
            goto L18
        L15:
            if (r0 < 0) goto L18
            goto L13
        L18:
            r5.b = r2
            long r10 = kotlin.d1.k(r10)
            r5.c = r10
            boolean r10 = r5.b
            if (r10 == 0) goto L25
            goto L26
        L25:
            r6 = r8
        L26:
            r5.d = r6
            return
    }

    public /* synthetic */ a0(long r1, long r3, long r5, kotlin.jvm.internal.v r7) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            return
    }

    public long a() {
            r5 = this;
            long r0 = r5.d
            long r2 = r5.a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
            boolean r2 = r5.b
            if (r2 == 0) goto L10
            r2 = 0
            r5.b = r2
            return r0
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L16:
            long r2 = r5.c
            long r2 = r2 + r0
            long r2 = kotlin.d1.k(r2)
            r5.d = r2
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ kotlin.d1 next() {
            r2 = this;
            long r0 = r2.a()
            kotlin.d1 r0 = kotlin.d1.b(r0)
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
