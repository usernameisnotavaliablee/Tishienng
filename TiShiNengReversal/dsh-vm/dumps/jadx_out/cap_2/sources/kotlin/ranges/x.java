package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class x implements java.util.Iterator<kotlin.z0>, l3.a {
    private final int a;
    private boolean b;
    private final int c;
    private int d;

    private x(int r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            r3.a = r5
            r0 = 0
            r1 = 1
            int r2 = kotlin.u0.a(r4, r5)
            if (r6 <= 0) goto L11
            if (r2 > 0) goto L14
        Lf:
            r0 = 1
            goto L14
        L11:
            if (r2 < 0) goto L14
            goto Lf
        L14:
            r3.b = r0
            int r6 = kotlin.z0.k(r6)
            r3.c = r6
            boolean r6 = r3.b
            if (r6 == 0) goto L21
            goto L22
        L21:
            r4 = r5
        L22:
            r3.d = r4
            return
    }

    public /* synthetic */ x(int r1, int r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public int a() {
            r2 = this;
            int r0 = r2.d
            int r1 = r2.a
            if (r0 != r1) goto L14
            boolean r1 = r2.b
            if (r1 == 0) goto Le
            r1 = 0
            r2.b = r1
            return r0
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L14:
            int r1 = r2.c
            int r1 = r1 + r0
            int r1 = kotlin.z0.k(r1)
            r2.d = r1
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ kotlin.z0 next() {
            r1 = this;
            int r0 = r1.a()
            kotlin.z0 r0 = kotlin.z0.b(r0)
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
