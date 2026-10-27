package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ExceptionCode {
    public static final int CANCEL = 10000100;
    public static final int CONNECTION_ABORT = 10000402;
    public static final int CONNECTION_REFUSED = 10000404;
    public static final int CONNECTION_RESET = 10000401;
    public static final int CONNECT_FAILED = 10000403;
    public static final int CRASH_EXCEPTION = 10000000;
    public static final int INTERRUPT_CONNECT_CLOSE = 10000405;
    public static final int INTERRUPT_EXCEPTION = 10000804;
    public static final int NETWORK_CHANGED = 10000201;
    public static final int NETWORK_IO_EXCEPTION = 10000802;
    public static final int NETWORK_TIMEOUT = 10000101;
    public static final int NETWORK_UNREACHABLE = 10000200;
    public static final int NETWORK_UNSUPPORTED = 10000102;
    public static final int PROTOCOL_ERROR = 10000801;
    public static final int READ_ERROR = 10000601;
    public static final int ROUTE_FAILED = 10000301;
    public static final int SHUTDOWN_EXCEPTION = 10000202;
    public static final int SOCKET_CLOSE = 10000406;
    public static final int SOCKET_CONNECT_TIMEOUT = 10000400;
    public static final int SOCKET_READ_TIMEOUT = 10000600;
    public static final int SOCKET_TIMEOUT = 10000803;
    public static final int SOCKET_WRITE_TIMEOUT = 10000700;
    public static final int SSL_HANDSHAKE_EXCEPTION = 10000501;
    public static final int SSL_PEERUNVERIFIED_EXCEPTION = 10000502;
    public static final int SSL_PROTOCOL_EXCEPTION = 10000500;
    public static final int UNABLE_TO_RESOLVE_HOST = 10000300;
    public static final int UNEXPECTED_EOF = 10000800;
    private static final java.lang.String a = "connect";
    private static final java.lang.String b = "read";
    private static final java.lang.String c = "write";

    public ExceptionCode() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.Exception r0, java.lang.String... r1) {
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.toLowerCase(r0)
            java.lang.String r0 = b(r0, r1)
            return r0
    }

    private static java.lang.String b(java.lang.String r5, java.lang.String... r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            int r0 = r6.length
            r2 = 0
        Lb:
            if (r2 >= r0) goto L19
            r3 = r6[r2]
            boolean r4 = r5.contains(r3)
            if (r4 == 0) goto L16
            return r3
        L16:
            int r2 = r2 + 1
            goto Lb
        L19:
            return r1
    }

    private static int c(java.lang.String r1) {
            java.lang.String r0 = "unexpected end of stream"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lc
            r1 = 10000800(0x9899a0, float:1.4014106E-38)
            return r1
        Lc:
            java.lang.String r0 = "unable to resolve host"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L18
            r1 = 10000300(0x9897ac, float:1.4013405E-38)
            return r1
        L18:
            java.lang.String r0 = "read error"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L24
            r1 = 10000601(0x9898d9, float:1.4013827E-38)
            return r1
        L24:
            java.lang.String r0 = "connection reset"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L30
            r1 = 10000401(0x989811, float:1.4013547E-38)
            return r1
        L30:
            java.lang.String r0 = "software caused connection abort"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L3c
            r1 = 10000402(0x989812, float:1.4013548E-38)
            return r1
        L3c:
            java.lang.String r0 = "failed to connect to"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L48
            r1 = 10000403(0x989813, float:1.401355E-38)
            return r1
        L48:
            java.lang.String r0 = "connection refused"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L54
            r1 = 10000404(0x989814, float:1.4013551E-38)
            return r1
        L54:
            java.lang.String r0 = "connection timed out"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L60
            r1 = 10000400(0x989810, float:1.4013545E-38)
            return r1
        L60:
            java.lang.String r0 = "no route to host"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L6c
            r1 = 10000301(0x9897ad, float:1.4013406E-38)
            return r1
        L6c:
            java.lang.String r0 = "network is unreachable"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L78
            r1 = 10000200(0x989748, float:1.4013265E-38)
            return r1
        L78:
            java.lang.String r0 = "socket closed"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L84
            r1 = 10000406(0x989816, float:1.4013554E-38)
            return r1
        L84:
            r1 = 10000802(0x9899a2, float:1.4014108E-38)
            return r1
    }

    private static int d(java.lang.Exception r5) {
            java.lang.String r0 = "connect"
            java.lang.String r1 = "read"
            java.lang.String r2 = "write"
            java.lang.String[] r3 = new java.lang.String[]{r0, r1, r2}
            java.lang.String r5 = a(r5, r3)
            r5.getClass()
            int r3 = r5.hashCode()
            r4 = -1
            switch(r3) {
                case 3496342: goto L2c;
                case 113399775: goto L23;
                case 951351530: goto L1a;
                default: goto L19;
            }
        L19:
            goto L34
        L1a:
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L21
            goto L34
        L21:
            r4 = 2
            goto L34
        L23:
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L2a
            goto L34
        L2a:
            r4 = 1
            goto L34
        L2c:
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L33
            goto L34
        L33:
            r4 = 0
        L34:
            switch(r4) {
                case 0: goto L43;
                case 1: goto L3f;
                case 2: goto L3b;
                default: goto L37;
            }
        L37:
            r5 = 10000803(0x9899a3, float:1.401411E-38)
            return r5
        L3b:
            r5 = 10000400(0x989810, float:1.4013545E-38)
            return r5
        L3f:
            r5 = 10000700(0x98993c, float:1.4013966E-38)
            return r5
        L43:
            r5 = 10000600(0x9898d8, float:1.4013825E-38)
            return r5
    }

    public static int getErrorCodeFromException(java.lang.Exception r3) {
            r0 = 10000802(0x9899a2, float:1.4014108E-38)
            if (r3 != 0) goto L6
            return r0
        L6:
            boolean r1 = r3 instanceof java.io.IOException
            if (r1 != 0) goto Le
            r3 = 10000000(0x989680, float:1.4012985E-38)
            return r3
        Le:
            java.lang.String r1 = r3.getMessage()
            if (r1 != 0) goto L15
            return r0
        L15:
            java.lang.String r1 = com.huawei.hms.framework.common.StringUtils.toLowerCase(r1)
            int r2 = c(r1)
            if (r2 == r0) goto L20
            goto L75
        L20:
            boolean r0 = r3 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L29
            int r3 = d(r3)
            return r3
        L29:
            boolean r0 = r3 instanceof java.net.ConnectException
            if (r0 == 0) goto L31
            r3 = 10000403(0x989813, float:1.401355E-38)
            return r3
        L31:
            boolean r0 = r3 instanceof java.net.NoRouteToHostException
            if (r0 == 0) goto L39
            r3 = 10000301(0x9897ad, float:1.4013406E-38)
            return r3
        L39:
            boolean r0 = r3 instanceof javax.net.ssl.SSLProtocolException
            if (r0 == 0) goto L41
            r3 = 10000500(0x989874, float:1.4013685E-38)
            return r3
        L41:
            boolean r0 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L49
            r3 = 10000501(0x989875, float:1.4013687E-38)
            return r3
        L49:
            boolean r0 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r0 == 0) goto L51
            r3 = 10000502(0x989876, float:1.4013688E-38)
            return r3
        L51:
            boolean r0 = r3 instanceof java.net.UnknownHostException
            if (r0 == 0) goto L59
            r3 = 10000300(0x9897ac, float:1.4013405E-38)
            return r3
        L59:
            boolean r0 = r3 instanceof java.io.InterruptedIOException
            if (r0 == 0) goto L6d
            java.lang.String r3 = "connection has been shut down"
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L69
            r3 = 10000405(0x989815, float:1.4013552E-38)
            return r3
        L69:
            r3 = 10000804(0x9899a4, float:1.4014111E-38)
            return r3
        L6d:
            boolean r3 = r3 instanceof java.net.ProtocolException
            if (r3 == 0) goto L75
            r3 = 10000801(0x9899a1, float:1.4014107E-38)
            return r3
        L75:
            return r2
    }
}
