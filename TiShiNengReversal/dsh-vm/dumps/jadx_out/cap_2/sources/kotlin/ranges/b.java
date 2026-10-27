package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b extends kotlin.collections.e0 {
    private final int a;
    private final int b;
    private boolean c;
    private int d;

    public b(char r3, char r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.a = r5
            r2.b = r4
            r0 = 0
            r1 = 1
            if (r5 <= 0) goto L13
            int r5 = kotlin.jvm.internal.g0.t(r3, r4)
            if (r5 > 0) goto L1a
        L11:
            r0 = 1
            goto L1a
        L13:
            int r5 = kotlin.jvm.internal.g0.t(r3, r4)
            if (r5 < 0) goto L1a
            goto L11
        L1a:
            r2.c = r0
            if (r0 == 0) goto L1f
            goto L20
        L1f:
            r3 = r4
        L20:
            r2.d = r3
            return
    }

    @Override // kotlin.collections.e0
    public char c() {
            r2 = this;
            int r0 = r2.d
            int r1 = r2.b
            if (r0 != r1) goto L14
            boolean r1 = r2.c
            if (r1 == 0) goto Le
            r1 = 0
            r2.c = r1
            goto L19
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L14:
            int r1 = r2.a
            int r1 = r1 + r0
            r2.d = r1
        L19:
            char r0 = (char) r0
            return r0
    }

    public final int e() {
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
}
