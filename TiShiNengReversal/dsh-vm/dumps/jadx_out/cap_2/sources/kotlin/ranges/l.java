package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l extends kotlin.collections.d1 {
    private final int a;
    private final int b;
    private boolean c;
    private int d;

    public l(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.a = r5
            r2.b = r4
            r0 = 0
            r1 = 1
            if (r5 <= 0) goto Lf
            if (r3 > r4) goto L12
        Ld:
            r0 = 1
            goto L12
        Lf:
            if (r3 < r4) goto L12
            goto Ld
        L12:
            r2.c = r0
            if (r0 == 0) goto L17
            goto L18
        L17:
            r3 = r4
        L18:
            r2.d = r3
            return
    }

    public final int a() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    @Override // kotlin.collections.d1
    public int nextInt() {
            r2 = this;
            int r0 = r2.d
            int r1 = r2.b
            if (r0 != r1) goto L14
            boolean r1 = r2.c
            if (r1 == 0) goto Le
            r1 = 0
            r2.c = r1
            return r0
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L14:
            int r1 = r2.a
            int r1 = r1 + r0
            r2.d = r1
            return r0
    }
}
