package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum Http2Error extends java.lang.Enum<io.netty.handler.codec.http2.Http2Error> {
    private static final /* synthetic */ io.netty.handler.codec.http2.Http2Error[] $VALUES = null;
    public static final io.netty.handler.codec.http2.Http2Error CANCEL = null;
    public static final io.netty.handler.codec.http2.Http2Error COMPRESSION_ERROR = null;
    public static final io.netty.handler.codec.http2.Http2Error CONNECT_ERROR = null;
    public static final io.netty.handler.codec.http2.Http2Error ENHANCE_YOUR_CALM = null;
    public static final io.netty.handler.codec.http2.Http2Error FLOW_CONTROL_ERROR = null;
    public static final io.netty.handler.codec.http2.Http2Error FRAME_SIZE_ERROR = null;
    public static final io.netty.handler.codec.http2.Http2Error HTTP_1_1_REQUIRED = null;
    public static final io.netty.handler.codec.http2.Http2Error INADEQUATE_SECURITY = null;
    public static final io.netty.handler.codec.http2.Http2Error INTERNAL_ERROR = null;
    private static final io.netty.handler.codec.http2.Http2Error[] INT_TO_ENUM_MAP = null;
    public static final io.netty.handler.codec.http2.Http2Error NO_ERROR = null;
    public static final io.netty.handler.codec.http2.Http2Error PROTOCOL_ERROR = null;
    public static final io.netty.handler.codec.http2.Http2Error REFUSED_STREAM = null;
    public static final io.netty.handler.codec.http2.Http2Error SETTINGS_TIMEOUT = null;
    public static final io.netty.handler.codec.http2.Http2Error STREAM_CLOSED = null;
    private final long code;

    static {
            io.netty.handler.codec.http2.Http2Error r0 = new io.netty.handler.codec.http2.Http2Error
            r1 = 0
            java.lang.String r3 = "NO_ERROR"
            r4 = 0
            r0.<init>(r3, r4, r1)
            io.netty.handler.codec.http2.Http2Error.NO_ERROR = r0
            io.netty.handler.codec.http2.Http2Error r1 = new io.netty.handler.codec.http2.Http2Error
            r2 = 1
            java.lang.String r5 = "PROTOCOL_ERROR"
            r6 = 1
            r1.<init>(r5, r6, r2)
            io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR = r1
            io.netty.handler.codec.http2.Http2Error r2 = new io.netty.handler.codec.http2.Http2Error
            r7 = 2
            java.lang.String r3 = "INTERNAL_ERROR"
            r5 = 2
            r2.<init>(r3, r5, r7)
            io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR = r2
            io.netty.handler.codec.http2.Http2Error r3 = new io.netty.handler.codec.http2.Http2Error
            r7 = 3
            java.lang.String r9 = "FLOW_CONTROL_ERROR"
            r10 = 3
            r3.<init>(r9, r10, r7)
            io.netty.handler.codec.http2.Http2Error.FLOW_CONTROL_ERROR = r3
            io.netty.handler.codec.http2.Http2Error r7 = new io.netty.handler.codec.http2.Http2Error
            r8 = 4
            java.lang.String r11 = "SETTINGS_TIMEOUT"
            r12 = 4
            r7.<init>(r11, r12, r8)
            io.netty.handler.codec.http2.Http2Error.SETTINGS_TIMEOUT = r7
            io.netty.handler.codec.http2.Http2Error r8 = new io.netty.handler.codec.http2.Http2Error
            r13 = 5
            java.lang.String r9 = "STREAM_CLOSED"
            r11 = 5
            r8.<init>(r9, r11, r13)
            io.netty.handler.codec.http2.Http2Error.STREAM_CLOSED = r8
            io.netty.handler.codec.http2.Http2Error r9 = new io.netty.handler.codec.http2.Http2Error
            r13 = 6
            java.lang.String r15 = "FRAME_SIZE_ERROR"
            r16 = 0
            r4 = 6
            r9.<init>(r15, r4, r13)
            io.netty.handler.codec.http2.Http2Error.FRAME_SIZE_ERROR = r9
            io.netty.handler.codec.http2.Http2Error r13 = new io.netty.handler.codec.http2.Http2Error
            r14 = 7
            r17 = 6
            java.lang.String r4 = "REFUSED_STREAM"
            r18 = 2
            r5 = 7
            r13.<init>(r4, r5, r14)
            io.netty.handler.codec.http2.Http2Error.REFUSED_STREAM = r13
            io.netty.handler.codec.http2.Http2Error r4 = new io.netty.handler.codec.http2.Http2Error
            r14 = 8
            r19 = 7
            java.lang.String r5 = "CANCEL"
            r20 = 1
            r6 = 8
            r4.<init>(r5, r6, r14)
            io.netty.handler.codec.http2.Http2Error.CANCEL = r4
            io.netty.handler.codec.http2.Http2Error r5 = new io.netty.handler.codec.http2.Http2Error
            r14 = 9
            r21 = 8
            java.lang.String r6 = "COMPRESSION_ERROR"
            r22 = 3
            r10 = 9
            r5.<init>(r6, r10, r14)
            io.netty.handler.codec.http2.Http2Error.COMPRESSION_ERROR = r5
            io.netty.handler.codec.http2.Http2Error r6 = new io.netty.handler.codec.http2.Http2Error
            r14 = 10
            r23 = 9
            java.lang.String r10 = "CONNECT_ERROR"
            r24 = 5
            r11 = 10
            r6.<init>(r10, r11, r14)
            io.netty.handler.codec.http2.Http2Error.CONNECT_ERROR = r6
            io.netty.handler.codec.http2.Http2Error r10 = new io.netty.handler.codec.http2.Http2Error
            r14 = 11
            r25 = 10
            java.lang.String r11 = "ENHANCE_YOUR_CALM"
            r26 = 4
            r12 = 11
            r10.<init>(r11, r12, r14)
            io.netty.handler.codec.http2.Http2Error.ENHANCE_YOUR_CALM = r10
            io.netty.handler.codec.http2.Http2Error r11 = new io.netty.handler.codec.http2.Http2Error
            r14 = 12
            r27 = 11
            java.lang.String r12 = "INADEQUATE_SECURITY"
            r28 = r0
            r0 = 12
            r11.<init>(r12, r0, r14)
            io.netty.handler.codec.http2.Http2Error.INADEQUATE_SECURITY = r11
            io.netty.handler.codec.http2.Http2Error r12 = new io.netty.handler.codec.http2.Http2Error
            r14 = 13
            r29 = 12
            java.lang.String r0 = "HTTP_1_1_REQUIRED"
            r30 = r1
            r1 = 13
            r12.<init>(r0, r1, r14)
            io.netty.handler.codec.http2.Http2Error.HTTP_1_1_REQUIRED = r12
            r0 = 14
            io.netty.handler.codec.http2.Http2Error[] r0 = new io.netty.handler.codec.http2.Http2Error[r0]
            r0[r16] = r28
            r0[r20] = r30
            r0[r18] = r2
            r0[r22] = r3
            r0[r26] = r7
            r0[r24] = r8
            r0[r17] = r9
            r0[r19] = r13
            r0[r21] = r4
            r0[r23] = r5
            r0[r25] = r6
            r0[r27] = r10
            r0[r29] = r11
            r0[r1] = r12
            io.netty.handler.codec.http2.Http2Error.$VALUES = r0
            io.netty.handler.codec.http2.Http2Error[] r0 = values()
            int r1 = r0.length
            io.netty.handler.codec.http2.Http2Error[] r1 = new io.netty.handler.codec.http2.Http2Error[r1]
            int r2 = r0.length
            r4 = 0
        Lf7:
            if (r4 >= r2) goto L105
            r3 = r0[r4]
            long r5 = r3.code()
            int r6 = (int) r5
            r1[r6] = r3
            int r4 = r4 + 1
            goto Lf7
        L105:
            io.netty.handler.codec.http2.Http2Error.INT_TO_ENUM_MAP = r1
            return
    }

    Http2Error(java.lang.String r1, int r2, long r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.code = r3
            return
    }

    public static io.netty.handler.codec.http2.Http2Error valueOf(long r4) {
            io.netty.handler.codec.http2.Http2Error[] r0 = io.netty.handler.codec.http2.Http2Error.INT_TO_ENUM_MAP
            int r1 = r0.length
            long r1 = (long) r1
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L13
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto Lf
            goto L13
        Lf:
            int r5 = (int) r4
            r4 = r0[r5]
            return r4
        L13:
            r4 = 0
            return r4
    }

    public static io.netty.handler.codec.http2.Http2Error valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.http2.Http2Error> r0 = io.netty.handler.codec.http2.Http2Error.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.http2.Http2Error r1 = (io.netty.handler.codec.http2.Http2Error) r1
            return r1
    }

    public static io.netty.handler.codec.http2.Http2Error[] values() {
            io.netty.handler.codec.http2.Http2Error[] r0 = io.netty.handler.codec.http2.Http2Error.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.http2.Http2Error[] r0 = (io.netty.handler.codec.http2.Http2Error[]) r0
            return r0
    }

    public long code() {
            r2 = this;
            long r0 = r2.code
            return r0
    }
}
