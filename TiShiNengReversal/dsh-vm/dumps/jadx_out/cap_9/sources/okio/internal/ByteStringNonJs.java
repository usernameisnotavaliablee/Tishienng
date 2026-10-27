package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "-ByteStringNonJs")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nByteStringNonJs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteStringNonJs.kt\nokio/internal/-ByteStringNonJs\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
/* renamed from: okio.internal.-ByteStringNonJs, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ByteStringNonJs {
    public ByteStringNonJs() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final /* synthetic */ int access$decodeHexDigit(char r0) {
            int r0 = decodeHexDigit(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonDecodeHex(@org.jetbrains.annotations.NotNull java.lang.String r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.length()
            int r0 = r0 % 2
            if (r0 != 0) goto L3b
            int r0 = r5.length()
            int r0 = r0 / 2
            byte[] r1 = new byte[r0]
            r2 = 0
        L16:
            if (r2 >= r0) goto L35
            int r3 = r2 * 2
            char r4 = r5.charAt(r3)
            int r4 = access$decodeHexDigit(r4)
            int r4 = r4 << 4
            int r3 = r3 + 1
            char r3 = r5.charAt(r3)
            int r3 = access$decodeHexDigit(r3)
            int r4 = r4 + r3
            byte r3 = (byte) r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L16
        L35:
            okio.ByteString r5 = new okio.ByteString
            r5.<init>(r1)
            return r5
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected hex string: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    private static final int decodeHexDigit(char r3) {
            r0 = 48
            if (r0 > r3) goto La
            r1 = 58
            if (r3 >= r1) goto La
            int r3 = r3 - r0
            return r3
        La:
            r0 = 97
            if (r0 > r3) goto L15
            r0 = 103(0x67, float:1.44E-43)
            if (r3 >= r0) goto L15
            int r3 = r3 + (-87)
            return r3
        L15:
            r0 = 65
            if (r0 > r3) goto L20
            r0 = 71
            if (r3 >= r0) goto L20
            int r3 = r3 + (-55)
            return r3
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected hex digit: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
