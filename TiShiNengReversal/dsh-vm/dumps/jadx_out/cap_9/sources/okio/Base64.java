package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "-Base64")
/* renamed from: okio.-Base64, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Base64 {

    @org.jetbrains.annotations.NotNull
    private static final byte[] BASE64 = null;

    @org.jetbrains.annotations.NotNull
    private static final byte[] BASE64_URL_SAFE = null;

    static {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            byte[] r1 = r1.getData$okio()
            okio.Base64.BASE64 = r1
            java.lang.String r1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            byte[] r0 = r0.getData$okio()
            okio.Base64.BASE64_URL_SAFE = r0
            return
    }

    public Base64() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final byte[] decodeBase64ToArray(@org.jetbrains.annotations.NotNull java.lang.String r14) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r14, r0)
            int r0 = r14.length()
        L9:
            r1 = 9
            r2 = 32
            r3 = 13
            r4 = 10
            if (r0 <= 0) goto L29
            int r5 = r0 + (-1)
            char r5 = r14.charAt(r5)
            r6 = 61
            if (r5 == r6) goto L26
            if (r5 == r4) goto L26
            if (r5 == r3) goto L26
            if (r5 == r2) goto L26
            if (r5 == r1) goto L26
            goto L29
        L26:
            int r0 = r0 + (-1)
            goto L9
        L29:
            long r5 = (long) r0
            r7 = 6
            long r5 = r5 * r7
            r7 = 8
            long r5 = r5 / r7
            int r6 = (int) r5
            byte[] r5 = new byte[r6]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L38:
            r11 = 0
            if (r7 >= r0) goto La0
            char r12 = r14.charAt(r7)
            r13 = 65
            if (r13 > r12) goto L4a
            r13 = 91
            if (r12 >= r13) goto L4a
            int r12 = r12 + (-65)
            goto L81
        L4a:
            r13 = 97
            if (r13 > r12) goto L55
            r13 = 123(0x7b, float:1.72E-43)
            if (r12 >= r13) goto L55
            int r12 = r12 + (-71)
            goto L81
        L55:
            r13 = 48
            if (r13 > r12) goto L60
            r13 = 58
            if (r12 >= r13) goto L60
            int r12 = r12 + 4
            goto L81
        L60:
            r13 = 43
            if (r12 == r13) goto L7f
            r13 = 45
            if (r12 != r13) goto L69
            goto L7f
        L69:
            r13 = 47
            if (r12 == r13) goto L7c
            r13 = 95
            if (r12 != r13) goto L72
            goto L7c
        L72:
            if (r12 == r4) goto L9d
            if (r12 == r3) goto L9d
            if (r12 == r2) goto L9d
            if (r12 != r1) goto L7b
            goto L9d
        L7b:
            return r11
        L7c:
            r12 = 63
            goto L81
        L7f:
            r12 = 62
        L81:
            int r9 = r9 << 6
            r9 = r9 | r12
            int r8 = r8 + 1
            int r11 = r8 % 4
            if (r11 != 0) goto L9d
            int r11 = r10 + 1
            int r12 = r9 >> 16
            byte r12 = (byte) r12
            r5[r10] = r12
            int r12 = r10 + 2
            int r13 = r9 >> 8
            byte r13 = (byte) r13
            r5[r11] = r13
            int r10 = r10 + 3
            byte r11 = (byte) r9
            r5[r12] = r11
        L9d:
            int r7 = r7 + 1
            goto L38
        La0:
            int r8 = r8 % 4
            r14 = 1
            if (r8 == r14) goto Ld4
            r14 = 2
            if (r8 == r14) goto Lbd
            r14 = 3
            if (r8 == r14) goto Lac
            goto Lc7
        Lac:
            int r14 = r9 << 6
            int r0 = r10 + 1
            int r1 = r14 >> 16
            byte r1 = (byte) r1
            r5[r10] = r1
            int r10 = r10 + 2
            int r14 = r14 >> 8
            byte r14 = (byte) r14
            r5[r0] = r14
            goto Lc7
        Lbd:
            int r14 = r9 << 12
            int r0 = r10 + 1
            int r14 = r14 >> 16
            byte r14 = (byte) r14
            r5[r10] = r14
            r10 = r0
        Lc7:
            if (r10 != r6) goto Lca
            return r5
        Lca:
            byte[] r14 = java.util.Arrays.copyOf(r5, r10)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r14, r0)
            return r14
        Ld4:
            return r11
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String encodeBase64(@org.jetbrains.annotations.NotNull byte[] r11, @org.jetbrains.annotations.NotNull byte[] r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r12, r0)
            int r0 = r11.length
            r1 = 2
            int r0 = r0 + r1
            int r0 = r0 / 3
            int r0 = r0 * 4
            byte[] r0 = new byte[r0]
            int r2 = r11.length
            int r3 = r11.length
            int r3 = r3 % 3
            int r2 = r2 - r3
            r3 = 0
            r4 = 0
        L1a:
            if (r3 >= r2) goto L57
            int r5 = r3 + 1
            r6 = r11[r3]
            int r7 = r3 + 2
            r5 = r11[r5]
            int r3 = r3 + 3
            r7 = r11[r7]
            int r8 = r4 + 1
            r9 = r6 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> r1
            r9 = r12[r9]
            r0[r4] = r9
            int r9 = r4 + 2
            r6 = r6 & 3
            int r6 = r6 << 4
            r10 = r5 & 255(0xff, float:3.57E-43)
            int r10 = r10 >> 4
            r6 = r6 | r10
            r6 = r12[r6]
            r0[r8] = r6
            int r6 = r4 + 3
            r5 = r5 & 15
            int r5 = r5 << r1
            r8 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r8 >> 6
            r5 = r5 | r8
            r5 = r12[r5]
            r0[r9] = r5
            int r4 = r4 + 4
            r5 = r7 & 63
            r5 = r12[r5]
            r0[r6] = r5
            goto L1a
        L57:
            int r5 = r11.length
            int r5 = r5 - r2
            r2 = 61
            r6 = 1
            if (r5 == r6) goto L8b
            if (r5 == r1) goto L61
            goto La7
        L61:
            int r5 = r3 + 1
            r3 = r11[r3]
            r11 = r11[r5]
            int r5 = r4 + 1
            r6 = r3 & 255(0xff, float:3.57E-43)
            int r6 = r6 >> r1
            r6 = r12[r6]
            r0[r4] = r6
            int r6 = r4 + 2
            r3 = r3 & 3
            int r3 = r3 << 4
            r7 = r11 & 255(0xff, float:3.57E-43)
            int r7 = r7 >> 4
            r3 = r3 | r7
            r3 = r12[r3]
            r0[r5] = r3
            int r4 = r4 + 3
            r11 = r11 & 15
            int r11 = r11 << r1
            r11 = r12[r11]
            r0[r6] = r11
            r0[r4] = r2
            goto La7
        L8b:
            r11 = r11[r3]
            int r3 = r4 + 1
            r5 = r11 & 255(0xff, float:3.57E-43)
            int r1 = r5 >> 2
            r1 = r12[r1]
            r0[r4] = r1
            int r1 = r4 + 2
            r11 = r11 & 3
            int r11 = r11 << 4
            r11 = r12[r11]
            r0[r3] = r11
            int r4 = r4 + 3
            r0[r1] = r2
            r0[r4] = r2
        La7:
            java.lang.String r11 = okio._JvmPlatformKt.toUtf8String(r0)
            return r11
    }

    public static /* synthetic */ java.lang.String encodeBase64$default(byte[] r0, byte[] r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            byte[] r1 = okio.Base64.BASE64
        L6:
            java.lang.String r0 = encodeBase64(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] getBASE64() {
            byte[] r0 = okio.Base64.BASE64
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] getBASE64_URL_SAFE() {
            byte[] r0 = okio.Base64.BASE64_URL_SAFE
            return r0
    }
}
