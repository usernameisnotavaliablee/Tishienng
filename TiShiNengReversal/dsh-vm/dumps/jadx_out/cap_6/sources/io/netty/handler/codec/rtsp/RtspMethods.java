package io.netty.handler.codec.rtsp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class RtspMethods {
    public static final io.netty.handler.codec.http.HttpMethod ANNOUNCE = null;
    public static final io.netty.handler.codec.http.HttpMethod DESCRIBE = null;
    public static final io.netty.handler.codec.http.HttpMethod GET_PARAMETER = null;
    public static final io.netty.handler.codec.http.HttpMethod OPTIONS = null;
    public static final io.netty.handler.codec.http.HttpMethod PAUSE = null;
    public static final io.netty.handler.codec.http.HttpMethod PLAY = null;
    public static final io.netty.handler.codec.http.HttpMethod RECORD = null;
    public static final io.netty.handler.codec.http.HttpMethod REDIRECT = null;
    public static final io.netty.handler.codec.http.HttpMethod SETUP = null;
    public static final io.netty.handler.codec.http.HttpMethod SET_PARAMETER = null;
    public static final io.netty.handler.codec.http.HttpMethod TEARDOWN = null;
    private static final java.util.Map<java.lang.String, io.netty.handler.codec.http.HttpMethod> methodMap = null;

    static {
            io.netty.handler.codec.http.HttpMethod r0 = io.netty.handler.codec.http.HttpMethod.OPTIONS
            io.netty.handler.codec.rtsp.RtspMethods.OPTIONS = r0
            java.lang.String r1 = "DESCRIBE"
            io.netty.handler.codec.http.HttpMethod r1 = io.netty.handler.codec.http.HttpMethod.valueOf(r1)
            io.netty.handler.codec.rtsp.RtspMethods.DESCRIBE = r1
            java.lang.String r2 = "ANNOUNCE"
            io.netty.handler.codec.http.HttpMethod r2 = io.netty.handler.codec.http.HttpMethod.valueOf(r2)
            io.netty.handler.codec.rtsp.RtspMethods.ANNOUNCE = r2
            java.lang.String r3 = "SETUP"
            io.netty.handler.codec.http.HttpMethod r3 = io.netty.handler.codec.http.HttpMethod.valueOf(r3)
            io.netty.handler.codec.rtsp.RtspMethods.SETUP = r3
            java.lang.String r4 = "PLAY"
            io.netty.handler.codec.http.HttpMethod r4 = io.netty.handler.codec.http.HttpMethod.valueOf(r4)
            io.netty.handler.codec.rtsp.RtspMethods.PLAY = r4
            java.lang.String r5 = "PAUSE"
            io.netty.handler.codec.http.HttpMethod r5 = io.netty.handler.codec.http.HttpMethod.valueOf(r5)
            io.netty.handler.codec.rtsp.RtspMethods.PAUSE = r5
            java.lang.String r6 = "TEARDOWN"
            io.netty.handler.codec.http.HttpMethod r6 = io.netty.handler.codec.http.HttpMethod.valueOf(r6)
            io.netty.handler.codec.rtsp.RtspMethods.TEARDOWN = r6
            java.lang.String r7 = "GET_PARAMETER"
            io.netty.handler.codec.http.HttpMethod r7 = io.netty.handler.codec.http.HttpMethod.valueOf(r7)
            io.netty.handler.codec.rtsp.RtspMethods.GET_PARAMETER = r7
            java.lang.String r8 = "SET_PARAMETER"
            io.netty.handler.codec.http.HttpMethod r8 = io.netty.handler.codec.http.HttpMethod.valueOf(r8)
            io.netty.handler.codec.rtsp.RtspMethods.SET_PARAMETER = r8
            java.lang.String r9 = "REDIRECT"
            io.netty.handler.codec.http.HttpMethod r9 = io.netty.handler.codec.http.HttpMethod.valueOf(r9)
            io.netty.handler.codec.rtsp.RtspMethods.REDIRECT = r9
            java.lang.String r10 = "RECORD"
            io.netty.handler.codec.http.HttpMethod r10 = io.netty.handler.codec.http.HttpMethod.valueOf(r10)
            io.netty.handler.codec.rtsp.RtspMethods.RECORD = r10
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            io.netty.handler.codec.rtsp.RtspMethods.methodMap = r11
            java.lang.String r12 = r1.toString()
            r11.put(r12, r1)
            java.lang.String r1 = r2.toString()
            r11.put(r1, r2)
            java.lang.String r1 = r7.toString()
            r11.put(r1, r7)
            java.lang.String r1 = r0.toString()
            r11.put(r1, r0)
            java.lang.String r0 = r5.toString()
            r11.put(r0, r5)
            java.lang.String r0 = r4.toString()
            r11.put(r0, r4)
            java.lang.String r0 = r10.toString()
            r11.put(r0, r10)
            java.lang.String r0 = r9.toString()
            r11.put(r0, r9)
            java.lang.String r0 = r3.toString()
            r11.put(r0, r3)
            java.lang.String r0 = r8.toString()
            r11.put(r0, r8)
            java.lang.String r0 = r6.toString()
            r11.put(r0, r6)
            return
    }

    private RtspMethods() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.netty.handler.codec.http.HttpMethod valueOf(java.lang.String r1) {
            if (r1 == 0) goto L28
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = r1.toUpperCase()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L20
            java.util.Map<java.lang.String, io.netty.handler.codec.http.HttpMethod> r0 = io.netty.handler.codec.rtsp.RtspMethods.methodMap
            java.lang.Object r0 = r0.get(r1)
            io.netty.handler.codec.http.HttpMethod r0 = (io.netty.handler.codec.http.HttpMethod) r0
            if (r0 == 0) goto L1b
            return r0
        L1b:
            io.netty.handler.codec.http.HttpMethod r1 = io.netty.handler.codec.http.HttpMethod.valueOf(r1)
            return r1
        L20:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "empty name"
            r1.<init>(r0)
            throw r1
        L28:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "name"
            r1.<init>(r0)
            throw r1
    }
}
