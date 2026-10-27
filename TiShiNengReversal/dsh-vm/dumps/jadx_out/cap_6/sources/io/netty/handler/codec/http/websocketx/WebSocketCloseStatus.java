package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class WebSocketCloseStatus implements java.lang.Comparable<io.netty.handler.codec.http.websocketx.WebSocketCloseStatus> {
    public static final io.netty.handler.codec.http.websocketx.WebSocketCloseStatus BAD_GATEWAY = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketCloseStatus ENDPOINT_UNAVAILABLE = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketCloseStatus INTERNAL_SERVER_ERROR = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketCloseStatus INVALID_MESSAGE_TYPE = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketCloseStatus INVALID_PAYLOAD_DATA = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketCloseStatus MANDATORY_EXTENSION = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketCloseStatus MESSAGE_TOO_BIG = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketCloseStatus NORMAL_CLOSURE = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketCloseStatus POLICY_VIOLATION = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketCloseStatus PROTOCOL_ERROR = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketCloseStatus SERVICE_RESTART = null;
    public static final io.netty.handler.codec.http.websocketx.WebSocketCloseStatus TRY_AGAIN_LATER = null;
    private final java.lang.String reasonText;
    private final int statusCode;
    private java.lang.String text;

    static {
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = new io.netty.handler.codec.http.websocketx.WebSocketCloseStatus
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r2 = "Bye"
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.NORMAL_CLOSURE = r0
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = new io.netty.handler.codec.http.websocketx.WebSocketCloseStatus
            r1 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r2 = "Endpoint unavailable"
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.ENDPOINT_UNAVAILABLE = r0
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = new io.netty.handler.codec.http.websocketx.WebSocketCloseStatus
            r1 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r2 = "Protocol error"
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.PROTOCOL_ERROR = r0
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = new io.netty.handler.codec.http.websocketx.WebSocketCloseStatus
            r1 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r2 = "Invalid message type"
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.INVALID_MESSAGE_TYPE = r0
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = new io.netty.handler.codec.http.websocketx.WebSocketCloseStatus
            r1 = 1007(0x3ef, float:1.411E-42)
            java.lang.String r2 = "Invalid payload data"
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.INVALID_PAYLOAD_DATA = r0
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = new io.netty.handler.codec.http.websocketx.WebSocketCloseStatus
            r1 = 1008(0x3f0, float:1.413E-42)
            java.lang.String r2 = "Policy violation"
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.POLICY_VIOLATION = r0
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = new io.netty.handler.codec.http.websocketx.WebSocketCloseStatus
            r1 = 1009(0x3f1, float:1.414E-42)
            java.lang.String r2 = "Message too big"
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.MESSAGE_TOO_BIG = r0
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = new io.netty.handler.codec.http.websocketx.WebSocketCloseStatus
            r1 = 1010(0x3f2, float:1.415E-42)
            java.lang.String r2 = "Mandatory extension"
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.MANDATORY_EXTENSION = r0
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = new io.netty.handler.codec.http.websocketx.WebSocketCloseStatus
            r1 = 1011(0x3f3, float:1.417E-42)
            java.lang.String r2 = "Internal server error"
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.INTERNAL_SERVER_ERROR = r0
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = new io.netty.handler.codec.http.websocketx.WebSocketCloseStatus
            r1 = 1012(0x3f4, float:1.418E-42)
            java.lang.String r2 = "Service Restart"
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.SERVICE_RESTART = r0
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = new io.netty.handler.codec.http.websocketx.WebSocketCloseStatus
            r1 = 1013(0x3f5, float:1.42E-42)
            java.lang.String r2 = "Try Again Later"
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.TRY_AGAIN_LATER = r0
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = new io.netty.handler.codec.http.websocketx.WebSocketCloseStatus
            r1 = 1014(0x3f6, float:1.421E-42)
            java.lang.String r2 = "Bad Gateway"
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.BAD_GATEWAY = r0
            return
    }

    public WebSocketCloseStatus(int r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            boolean r0 = isValidStatusCode(r3)
            if (r0 == 0) goto L16
            r2.statusCode = r3
            java.lang.String r3 = "reasonText"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.reasonText = r3
            return
        L16:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "WebSocket close status code does NOT comply with RFC-6455: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public static boolean isValidStatusCode(int r1) {
            if (r1 < 0) goto L19
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r0 > r1) goto La
            r0 = 1003(0x3eb, float:1.406E-42)
            if (r1 <= r0) goto L19
        La:
            r0 = 1007(0x3ef, float:1.411E-42)
            if (r0 > r1) goto L12
            r0 = 1014(0x3f6, float:1.421E-42)
            if (r1 <= r0) goto L19
        L12:
            r0 = 3000(0xbb8, float:4.204E-42)
            if (r0 > r1) goto L17
            goto L19
        L17:
            r1 = 0
            return r1
        L19:
            r1 = 1
            return r1
    }

    public static io.netty.handler.codec.http.websocketx.WebSocketCloseStatus valueOf(int r3) {
            switch(r3) {
                case 1000: goto L3b;
                case 1001: goto L38;
                case 1002: goto L35;
                case 1003: goto L32;
                case 1004: goto L3;
                case 1005: goto L3;
                case 1006: goto L3;
                case 1007: goto L2f;
                case 1008: goto L2c;
                case 1009: goto L29;
                case 1010: goto L26;
                case 1011: goto L23;
                case 1012: goto L20;
                case 1013: goto L1d;
                case 1014: goto L1a;
                default: goto L3;
            }
        L3:
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r0 = new io.netty.handler.codec.http.websocketx.WebSocketCloseStatus
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Close status #"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r3, r1)
            return r0
        L1a:
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r3 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.BAD_GATEWAY
            return r3
        L1d:
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r3 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.TRY_AGAIN_LATER
            return r3
        L20:
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r3 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.SERVICE_RESTART
            return r3
        L23:
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r3 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.INTERNAL_SERVER_ERROR
            return r3
        L26:
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r3 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.MANDATORY_EXTENSION
            return r3
        L29:
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r3 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.MESSAGE_TOO_BIG
            return r3
        L2c:
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r3 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.POLICY_VIOLATION
            return r3
        L2f:
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r3 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.INVALID_PAYLOAD_DATA
            return r3
        L32:
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r3 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.INVALID_MESSAGE_TYPE
            return r3
        L35:
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r3 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.PROTOCOL_ERROR
            return r3
        L38:
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r3 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.ENDPOINT_UNAVAILABLE
            return r3
        L3b:
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r3 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.NORMAL_CLOSURE
            return r3
    }

    public int code() {
            r1 = this;
            int r0 = r1.statusCode
            return r0
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r2) {
            r1 = this;
            int r0 = r1.code()
            int r2 = r2.code()
            int r0 = r0 - r2
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r1 = (io.netty.handler.codec.http.websocketx.WebSocketCloseStatus) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L19
            java.lang.Class<io.netty.handler.codec.http.websocketx.WebSocketCloseStatus> r2 = io.netty.handler.codec.http.websocketx.WebSocketCloseStatus.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L19
        L10:
            io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r5 = (io.netty.handler.codec.http.websocketx.WebSocketCloseStatus) r5
            int r2 = r4.statusCode
            int r5 = r5.statusCode
            if (r2 != r5) goto L19
            return r0
        L19:
            return r1
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.statusCode
            return r0
    }

    public java.lang.String reasonText() {
            r1 = this;
            java.lang.String r0 = r1.reasonText
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.text
            if (r0 != 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.code()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r2.reasonText()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.text = r0
        L22:
            return r0
    }
}
