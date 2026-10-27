package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c {
    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final char a(int r3) {
            if (r3 < 0) goto L9
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r0) goto L9
            char r3 = (char) r3
            return r3
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid Char code: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static final int b(char r0) {
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.IntrinsicConstEvaluation
    @kotlin.internal.InlineOnly
    public static /* synthetic */ void c(char r0) {
            return
    }
}
