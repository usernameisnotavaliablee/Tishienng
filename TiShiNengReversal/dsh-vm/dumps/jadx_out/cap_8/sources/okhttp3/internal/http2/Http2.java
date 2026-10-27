package okhttp3.internal.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Http2 {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] BINARY = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString CONNECTION_PREFACE = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] FLAGS = null;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] FRAME_NAMES = null;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Http2 INSTANCE = null;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;

    static {
            okhttp3.internal.http2.Http2 r0 = new okhttp3.internal.http2.Http2
            r0.<init>()
            okhttp3.internal.http2.Http2.INSTANCE = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Http2.CONNECTION_PREFACE = r0
            java.lang.String r9 = "WINDOW_UPDATE"
            java.lang.String r10 = "CONTINUATION"
            java.lang.String r1 = "DATA"
            java.lang.String r2 = "HEADERS"
            java.lang.String r3 = "PRIORITY"
            java.lang.String r4 = "RST_STREAM"
            java.lang.String r5 = "SETTINGS"
            java.lang.String r6 = "PUSH_PROMISE"
            java.lang.String r7 = "PING"
            java.lang.String r8 = "GOAWAY"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            okhttp3.internal.http2.Http2.FRAME_NAMES = r0
            r0 = 64
            java.lang.String[] r0 = new java.lang.String[r0]
            okhttp3.internal.http2.Http2.FLAGS = r0
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r3 = 0
        L37:
            r4 = 1
            if (r3 >= r0) goto L5d
            java.lang.String r5 = java.lang.Integer.toBinaryString(r3)
            java.lang.String r6 = "toBinaryString(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r5
            java.lang.String r5 = "%8s"
            java.lang.String r6 = okhttp3.internal._UtilJvmKt.format(r5, r4)
            r10 = 4
            r11 = 0
            r7 = 32
            r8 = 48
            r9 = 0
            java.lang.String r4 = kotlin.text.u.w2(r6, r7, r8, r9, r10, r11)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L37
        L5d:
            okhttp3.internal.http2.Http2.BINARY = r1
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            java.lang.String r1 = ""
            r0[r2] = r1
            java.lang.String r1 = "END_STREAM"
            r0[r4] = r1
            int[] r1 = new int[]{r4}
            java.lang.String r3 = "PADDED"
            r4 = 8
            r0[r4] = r3
            r3 = r1[r2]
            r5 = r3 | 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r3 = r0[r3]
            r6.append(r3)
            java.lang.String r3 = "|PADDED"
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            r0[r5] = r6
            java.lang.String r5 = "END_HEADERS"
            r6 = 4
            r0[r6] = r5
            java.lang.String r5 = "PRIORITY"
            r7 = 32
            r0[r7] = r5
            java.lang.String r5 = "END_HEADERS|PRIORITY"
            r8 = 36
            r0[r8] = r5
            int[] r0 = new int[]{r6, r7, r8}
            r5 = 0
        La3:
            r6 = 3
            if (r5 >= r6) goto Le7
            r6 = r0[r5]
            r7 = r1[r2]
            java.lang.String[] r8 = okhttp3.internal.http2.Http2.FLAGS
            r9 = r7 | r6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = r8[r7]
            r10.append(r11)
            r11 = 124(0x7c, float:1.74E-43)
            r10.append(r11)
            r12 = r8[r6]
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r8[r9] = r10
            r9 = r9 | r4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r7 = r8[r7]
            r10.append(r7)
            r10.append(r11)
            r6 = r8[r6]
            r10.append(r6)
            r10.append(r3)
            java.lang.String r6 = r10.toString()
            r8[r9] = r6
            int r5 = r5 + 1
            goto La3
        Le7:
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            int r0 = r0.length
        Lea:
            if (r2 >= r0) goto Lfb
            java.lang.String[] r1 = okhttp3.internal.http2.Http2.FLAGS
            r3 = r1[r2]
            if (r3 != 0) goto Lf8
            java.lang.String[] r3 = okhttp3.internal.http2.Http2.BINARY
            r3 = r3[r2]
            r1[r2] = r3
        Lf8:
            int r2 = r2 + 1
            goto Lea
        Lfb:
            return
    }

    private Http2() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatFlags(int r8, int r9) {
            r7 = this;
            if (r9 != 0) goto L5
            java.lang.String r8 = ""
            return r8
        L5:
            r0 = 2
            if (r8 == r0) goto L5a
            r0 = 3
            if (r8 == r0) goto L5a
            r0 = 4
            if (r8 == r0) goto L4f
            r0 = 6
            if (r8 == r0) goto L4f
            r0 = 7
            if (r8 == r0) goto L5a
            r0 = 8
            if (r8 == r0) goto L5a
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            int r1 = r0.length
            if (r9 >= r1) goto L24
            r0 = r0[r9]
            kotlin.jvm.internal.g0.m(r0)
        L22:
            r1 = r0
            goto L29
        L24:
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.BINARY
            r0 = r0[r9]
            goto L22
        L29:
            r0 = 5
            if (r8 != r0) goto L3c
            r0 = r9 & 4
            if (r0 == 0) goto L3c
            r5 = 4
            r6 = 0
            java.lang.String r2 = "HEADERS"
            java.lang.String r3 = "PUSH_PROMISE"
            r4 = 0
            java.lang.String r8 = kotlin.text.u.x2(r1, r2, r3, r4, r5, r6)
            return r8
        L3c:
            if (r8 != 0) goto L4e
            r8 = r9 & 32
            if (r8 == 0) goto L4e
            r5 = 4
            r6 = 0
            java.lang.String r2 = "PRIORITY"
            java.lang.String r3 = "COMPRESSED"
            r4 = 0
            java.lang.String r8 = kotlin.text.u.x2(r1, r2, r3, r4, r5, r6)
            return r8
        L4e:
            return r1
        L4f:
            r8 = 1
            if (r9 != r8) goto L55
            java.lang.String r8 = "ACK"
            return r8
        L55:
            java.lang.String[] r8 = okhttp3.internal.http2.Http2.BINARY
            r8 = r8[r9]
            return r8
        L5a:
            java.lang.String[] r8 = okhttp3.internal.http2.Http2.BINARY
            r8 = r8[r9]
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String formattedType$okhttp(int r3) {
            r2 = this;
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FRAME_NAMES
            int r1 = r0.length
            if (r3 >= r1) goto L8
            r3 = r0[r3]
            return r3
        L8:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "0x%02x"
            java.lang.String r3 = okhttp3.internal._UtilJvmKt.format(r3, r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String frameLog(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            java.lang.String r0 = r2.formattedType$okhttp(r6)
            java.lang.String r6 = r2.formatFlags(r6, r7)
            if (r3 == 0) goto Ld
            java.lang.String r3 = "<<"
            goto Lf
        Ld:
            java.lang.String r3 = ">>"
        Lf:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r1 = 0
            r7[r1] = r3
            r3 = 1
            r7[r3] = r4
            r3 = 2
            r7[r3] = r5
            r3 = 3
            r7[r3] = r0
            r3 = 4
            r7[r3] = r6
            java.lang.String r3 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r3 = okhttp3.internal._UtilJvmKt.format(r3, r7)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String frameLogWindowUpdate(boolean r3, int r4, int r5, long r6) {
            r2 = this;
            r0 = 8
            java.lang.String r0 = r2.formattedType$okhttp(r0)
            if (r3 == 0) goto Lb
            java.lang.String r3 = "<<"
            goto Ld
        Lb:
            java.lang.String r3 = ">>"
        Ld:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r1 = 0
            r7[r1] = r3
            r3 = 1
            r7[r3] = r4
            r3 = 2
            r7[r3] = r5
            r3 = 3
            r7[r3] = r0
            r3 = 4
            r7[r3] = r6
            java.lang.String r3 = "%s 0x%08x %5d %-13s %d"
            java.lang.String r3 = okhttp3.internal._UtilJvmKt.format(r3, r7)
            return r3
    }
}
