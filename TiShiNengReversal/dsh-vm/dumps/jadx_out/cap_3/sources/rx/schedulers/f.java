package rx.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class f<T> {
    private final long a;
    private final T b;

    public f(long r1, T r3) {
            r0 = this;
            r0.<init>()
            r0.b = r3
            r0.a = r1
            return
    }

    public long a() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    public T b() {
            r1 = this;
            T r0 = r1.b
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 != 0) goto L8
            return r1
        L8:
            boolean r2 = r8 instanceof rx.schedulers.f
            if (r2 != 0) goto Ld
            return r1
        Ld:
            rx.schedulers.f r8 = (rx.schedulers.f) r8
            long r2 = r7.a
            long r4 = r8.a
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L26
            T r2 = r7.b
            T r8 = r8.b
            if (r2 == r8) goto L25
            if (r2 == 0) goto L26
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L26
        L25:
            return r0
        L26:
            return r1
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.a
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            r0 = 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            T r0 = r4.b
            if (r0 != 0) goto L13
            r0 = 0
            goto L17
        L13:
            int r0 = r0.hashCode()
        L17:
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r4 = this;
            long r0 = r4.a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            T r1 = r4.b
            java.lang.String r1 = r1.toString()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "Timestamped(timestampMillis = %d, value = %s)"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            return r0
    }
}
