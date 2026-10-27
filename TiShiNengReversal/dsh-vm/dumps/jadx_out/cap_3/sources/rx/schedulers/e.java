package rx.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class e<T> {
    private final long a;
    private final T b;

    public e(long r1, T r3) {
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
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            rx.schedulers.e r8 = (rx.schedulers.e) r8
            long r2 = r7.a
            long r4 = r8.a
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L1e
            return r1
        L1e:
            T r2 = r7.b
            if (r2 != 0) goto L27
            T r8 = r8.b
            if (r8 == 0) goto L30
            return r1
        L27:
            T r8 = r8.b
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L30
            return r1
        L30:
            return r0
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
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TimeInterval [intervalInMilliseconds="
            r0.append(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            T r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
