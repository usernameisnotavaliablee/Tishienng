package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final /* synthetic */ class s0 {
    public static /* synthetic */ long a(long r7, long r9) {
            r0 = -9223372036854775808
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 >= 0) goto L12
            long r2 = r7 ^ r0
            long r0 = r0 ^ r9
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L10
            return r7
        L10:
            long r7 = r7 - r9
            return r7
        L12:
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L18
            long r7 = r7 % r9
            return r7
        L18:
            r4 = 1
            long r5 = r7 >>> r4
            long r5 = r5 / r9
            long r4 = r5 << r4
            long r4 = r4 * r9
            long r7 = r7 - r4
            long r4 = r7 ^ r0
            long r0 = r0 ^ r9
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 < 0) goto L29
            goto L2a
        L29:
            r9 = r2
        L2a:
            long r7 = r7 - r9
            return r7
    }
}
