package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final /* synthetic */ class t0 {
    public static /* synthetic */ long a(long r7, long r9) {
            r0 = -9223372036854775808
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 >= 0) goto L12
            long r7 = r7 ^ r0
            long r9 = r9 ^ r0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto Lf
            return r2
        Lf:
            r7 = 1
            return r7
        L12:
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L18
            long r7 = r7 / r9
            return r7
        L18:
            r2 = 1
            long r3 = r7 >>> r2
            long r3 = r3 / r9
            long r3 = r3 << r2
            long r5 = r3 * r9
            long r7 = r7 - r5
            long r7 = r7 ^ r0
            long r9 = r9 ^ r0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L27
            goto L28
        L27:
            r2 = 0
        L28:
            long r7 = (long) r2
            long r3 = r3 + r7
            return r3
    }
}
