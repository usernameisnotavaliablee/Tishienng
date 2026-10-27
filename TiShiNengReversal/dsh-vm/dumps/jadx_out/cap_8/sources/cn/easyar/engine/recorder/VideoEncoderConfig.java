package cn.easyar.engine.recorder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class VideoEncoderConfig {
    private int mBitRate;
    private java.lang.String mFormat;
    private int mHeight;
    private int mTexHeiht;
    private int mTexWidth;
    private int mWidth;
    private int zoomMode;

    public VideoEncoderConfig(int r2, int r3, int r4, int r5, int r6, int r7) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "avc"
            r1.mFormat = r0
            r1.mWidth = r2
            r1.mHeight = r3
            r1.mTexWidth = r4
            r1.mTexHeiht = r5
            r1.mBitRate = r6
            r1.zoomMode = r7
            return
    }

    public int getBitRate() {
            r1 = this;
            int r0 = r1.mBitRate
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.mHeight
            return r0
    }

    public int getTextureHeight() {
            r1 = this;
            int r0 = r1.mTexHeiht
            return r0
    }

    public int getTextureWidth() {
            r1 = this;
            int r0 = r1.mTexWidth
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.mWidth
            return r0
    }

    public int getZoomMode() {
            r1 = this;
            int r0 = r1.zoomMode
            return r0
    }

    public void setHeight(int r1) {
            r0 = this;
            r0.mHeight = r1
            return
    }

    public void setTextureHeight(int r1) {
            r0 = this;
            r0.mTexHeiht = r1
            return
    }

    public void setTextureWidth(int r1) {
            r0 = this;
            r0.mTexWidth = r1
            return
    }

    public void setWidth(int r1) {
            r0 = this;
            r0.mWidth = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VideoEncoderConfig{mFormat='"
            r0.append(r1)
            java.lang.String r1 = r2.mFormat
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", mWidth="
            r0.append(r1)
            int r1 = r2.mWidth
            r0.append(r1)
            java.lang.String r1 = ", mHeight="
            r0.append(r1)
            int r1 = r2.mHeight
            r0.append(r1)
            java.lang.String r1 = ", mBitRate="
            r0.append(r1)
            int r1 = r2.mBitRate
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
