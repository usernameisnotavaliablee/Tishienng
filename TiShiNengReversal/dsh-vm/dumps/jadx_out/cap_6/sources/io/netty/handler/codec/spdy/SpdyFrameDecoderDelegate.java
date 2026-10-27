package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface SpdyFrameDecoderDelegate {
    void readDataFrame(int r1, boolean r2, io.netty.buffer.ByteBuf r3);

    void readFrameError(java.lang.String r1);

    void readGoAwayFrame(int r1, int r2);

    void readHeaderBlock(io.netty.buffer.ByteBuf r1);

    void readHeaderBlockEnd();

    void readHeadersFrame(int r1, boolean r2);

    void readPingFrame(int r1);

    void readRstStreamFrame(int r1, int r2);

    void readSetting(int r1, int r2, boolean r3, boolean r4);

    void readSettingsEnd();

    void readSettingsFrame(boolean r1);

    void readSynReplyFrame(int r1, boolean r2);

    void readSynStreamFrame(int r1, int r2, byte r3, boolean r4, boolean r5);

    void readWindowUpdateFrame(int r1, int r2);
}
