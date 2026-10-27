package io.netty.handler.codec.rtsp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class RtspVersions {
    public static final io.netty.handler.codec.http.HttpVersion RTSP_1_0 = null;

    static {
            io.netty.handler.codec.http.HttpVersion r0 = new io.netty.handler.codec.http.HttpVersion
            r1 = 1
            r2 = 0
            java.lang.String r3 = "RTSP"
            r0.<init>(r3, r1, r2, r1)
            io.netty.handler.codec.rtsp.RtspVersions.RTSP_1_0 = r0
            return
    }

    private RtspVersions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.netty.handler.codec.http.HttpVersion valueOf(java.lang.String r2) {
            if (r2 == 0) goto L1c
            java.lang.String r2 = r2.trim()
            java.lang.String r2 = r2.toUpperCase()
            java.lang.String r0 = "RTSP/1.0"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L15
            io.netty.handler.codec.http.HttpVersion r2 = io.netty.handler.codec.rtsp.RtspVersions.RTSP_1_0
            return r2
        L15:
            io.netty.handler.codec.http.HttpVersion r0 = new io.netty.handler.codec.http.HttpVersion
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        L1c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "text"
            r2.<init>(r0)
            throw r2
    }
}
