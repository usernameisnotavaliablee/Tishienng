package okhttp3.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class IsProbablyUtf8Kt {
    public IsProbablyUtf8Kt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final boolean isProbablyUtf8(@org.jetbrains.annotations.NotNull okio.BufferedSource r5, long r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            okio.BufferedSource r5 = r5.peek()     // Catch: java.io.EOFException -> L2e
            r1 = 0
        Lc:
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 >= 0) goto L2c
            boolean r3 = r5.exhausted()     // Catch: java.io.EOFException -> L2e
            if (r3 == 0) goto L17
            goto L2c
        L17:
            int r3 = r5.readUtf8CodePoint()     // Catch: java.io.EOFException -> L2e
            boolean r4 = java.lang.Character.isISOControl(r3)     // Catch: java.io.EOFException -> L2e
            if (r4 == 0) goto L28
            boolean r3 = java.lang.Character.isWhitespace(r3)     // Catch: java.io.EOFException -> L2e
            if (r3 != 0) goto L28
            return r0
        L28:
            r3 = 1
            long r1 = r1 + r3
            goto Lc
        L2c:
            r5 = 1
            return r5
        L2e:
            return r0
    }

    public static /* synthetic */ boolean isProbablyUtf8$default(okio.BufferedSource r0, long r1, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L9
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L9:
            boolean r0 = isProbablyUtf8(r0, r1)
            return r0
    }
}
