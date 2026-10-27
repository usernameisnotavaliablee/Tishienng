package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class p {
    private p() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static boolean a(int r1) {
            int r0 = r1 + (-1)
            r1 = r1 & r0
            if (r1 != 0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    public static int b(int r1) {
            r0 = 1
            int r1 = r1 - r0
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = 32 - r1
            int r1 = r0 << r1
            return r1
    }
}
