package okhttp3.internal.ws;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nWebSocketProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketProtocol.kt\nokhttp3/internal/ws/WebSocketProtocol\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class WebSocketProtocol {

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.ws.WebSocketProtocol INSTANCE = null;
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    static {
            okhttp3.internal.ws.WebSocketProtocol r0 = new okhttp3.internal.ws.WebSocketProtocol
            r0.<init>()
            okhttp3.internal.ws.WebSocketProtocol.INSTANCE = r0
            return
    }

    private WebSocketProtocol() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String acceptHeader(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            okio.ByteString r3 = r0.encodeUtf8(r3)
            okio.ByteString r3 = r3.sha1()
            java.lang.String r3 = r3.base64()
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String closeCodeExceptionMessage(int r3) {
            r2 = this;
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r0) goto L33
            r0 = 5000(0x1388, float:7.006E-42)
            if (r3 < r0) goto L9
            goto L33
        L9:
            r0 = 1004(0x3ec, float:1.407E-42)
            if (r0 > r3) goto L12
            r0 = 1007(0x3ef, float:1.411E-42)
            if (r3 >= r0) goto L12
            goto L1a
        L12:
            r0 = 1015(0x3f7, float:1.422E-42)
            if (r0 > r3) goto L31
            r0 = 3000(0xbb8, float:4.204E-42)
            if (r3 >= r0) goto L31
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Code "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " is reserved and may not be used."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L31:
            r3 = 0
            return r3
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Code must be in range [1000,5000): "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public final void toggleMask(@org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r8, @org.jetbrains.annotations.NotNull byte[] r9) {
            r7 = this;
            java.lang.String r0 = "cursor"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r9.length
            r1 = 0
        Lc:
            byte[] r2 = r8.data
            int r3 = r8.start
            int r4 = r8.end
            if (r2 == 0) goto L24
        L14:
            if (r3 >= r4) goto L24
            int r1 = r1 % r0
            r5 = r2[r3]
            r6 = r9[r1]
            r5 = r5 ^ r6
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L14
        L24:
            int r2 = r8.next()
            r3 = -1
            if (r2 != r3) goto Lc
            return
    }

    public final void validateCloseCode(int r2) {
            r1 = this;
            java.lang.String r2 = r1.closeCodeExceptionMessage(r2)
            if (r2 != 0) goto L7
            return
        L7:
            kotlin.jvm.internal.g0.m(r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }
}
