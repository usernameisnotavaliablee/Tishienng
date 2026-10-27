package io.netty.handler.codec.rtsp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class RtspObjectDecoder extends io.netty.handler.codec.http.HttpObjectDecoder {
    protected RtspObjectDecoder() {
            r2 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r0, r1, r1)
            return
    }

    protected RtspObjectDecoder(int r2, int r3, int r4) {
            r1 = this;
            int r4 = r4 * 2
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    protected RtspObjectDecoder(int r7, int r8, int r9, boolean r10) {
            r6 = this;
            int r3 = r9 * 2
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    protected boolean isContentAlwaysEmpty(io.netty.handler.codec.http.HttpMessage r4) {
            r3 = this;
            boolean r0 = super.isContentAlwaysEmpty(r4)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            io.netty.handler.codec.http.HttpHeaders r4 = r4.headers()
            io.netty.util.AsciiString r2 = io.netty.handler.codec.rtsp.RtspHeaderNames.CONTENT_LENGTH
            boolean r4 = r4.contains(r2)
            if (r4 != 0) goto L15
            return r1
        L15:
            return r0
    }
}
