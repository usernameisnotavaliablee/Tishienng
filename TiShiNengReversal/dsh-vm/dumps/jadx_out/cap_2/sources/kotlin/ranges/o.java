package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o extends kotlin.collections.e1 {
    private final long a;
    private final long b;
    private boolean c;
    private long d;

    public o(long r6, long r8, long r10) {
            r5 = this;
            r5.<init>()
            r5.a = r10
            r5.b = r8
            r0 = 0
            r2 = 0
            r3 = 1
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L15
            if (r10 > 0) goto L18
        L13:
            r2 = 1
            goto L18
        L15:
            if (r10 < 0) goto L18
            goto L13
        L18:
            r5.c = r2
            if (r2 == 0) goto L1d
            goto L1e
        L1d:
            r6 = r8
        L1e:
            r5.d = r6
            return
    }

    public final long a() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    @Override // kotlin.collections.e1
    public long nextLong() {
            r5 = this;
            long r0 = r5.d
            long r2 = r5.b
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
            boolean r2 = r5.c
            if (r2 == 0) goto L10
            r2 = 0
            r5.c = r2
            return r0
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L16:
            long r2 = r5.a
            long r2 = r2 + r0
            r5.d = r2
            return r0
    }
}
