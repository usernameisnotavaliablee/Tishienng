package cn.easyar.engine.recorder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AVRecorderConfig {
    private final java.lang.String TAG;
    private cn.easyar.engine.recorder.AudioEncorderConfig mAudioEncorderConfig;
    private cn.easyar.engine.recorder.Muxer mMuxer;
    private final java.io.File mOutputFile;
    private java.lang.String mPath;
    private boolean mRotationClip;
    private cn.easyar.engine.recorder.VideoEncoderConfig mVideoEncoderConfig;

    public AVRecorderConfig(cn.easyar.engine.recorder.AudioEncorderConfig r2, cn.easyar.engine.recorder.VideoEncoderConfig r3, boolean r4, java.lang.String r5, cn.easyar.engine.recorder.RecordListener r6) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.TAG = r0
            r1.mAudioEncorderConfig = r2
            r1.mVideoEncoderConfig = r3
            r1.mRotationClip = r4
            java.io.File r2 = new java.io.File
            r2.<init>(r5)
            r1.mOutputFile = r2
            cn.easyar.engine.recorder.Muxer r3 = new cn.easyar.engine.recorder.Muxer
            java.lang.String r2 = r2.toString()
            r4 = 0
            r3.<init>(r2, r4)
            r1.mMuxer = r3
            r3.setListener(r6)
            return
    }

    public int getAudioBitrate() {
            r1 = this;
            cn.easyar.engine.recorder.AudioEncorderConfig r0 = r1.mAudioEncorderConfig
            int r0 = r0.getBitRate()
            return r0
    }

    public int getAudioSamplerate() {
            r1 = this;
            cn.easyar.engine.recorder.AudioEncorderConfig r0 = r1.mAudioEncorderConfig
            int r0 = r0.getSampleRate()
            return r0
    }

    public int getHeight() {
            r1 = this;
            cn.easyar.engine.recorder.VideoEncoderConfig r0 = r1.mVideoEncoderConfig
            int r0 = r0.getHeight()
            return r0
    }

    public cn.easyar.engine.recorder.Muxer getMuxer() {
            r1 = this;
            cn.easyar.engine.recorder.Muxer r0 = r1.mMuxer
            return r0
    }

    public int getNumAudioChannels() {
            r1 = this;
            cn.easyar.engine.recorder.AudioEncorderConfig r0 = r1.mAudioEncorderConfig
            int r0 = r0.getChannel()
            return r0
    }

    public java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.mPath
            return r0
    }

    public boolean getRotationClip() {
            r1 = this;
            boolean r0 = r1.mRotationClip
            return r0
    }

    public int getTextureHeight() {
            r1 = this;
            cn.easyar.engine.recorder.VideoEncoderConfig r0 = r1.mVideoEncoderConfig
            int r0 = r0.getTextureHeight()
            return r0
    }

    public int getTextureWidth() {
            r1 = this;
            cn.easyar.engine.recorder.VideoEncoderConfig r0 = r1.mVideoEncoderConfig
            int r0 = r0.getTextureWidth()
            return r0
    }

    public int getVideoBitRate() {
            r1 = this;
            cn.easyar.engine.recorder.VideoEncoderConfig r0 = r1.mVideoEncoderConfig
            int r0 = r0.getBitRate()
            return r0
    }

    public int getWidth() {
            r1 = this;
            cn.easyar.engine.recorder.VideoEncoderConfig r0 = r1.mVideoEncoderConfig
            int r0 = r0.getWidth()
            return r0
    }

    public int getZoomMode() {
            r1 = this;
            cn.easyar.engine.recorder.VideoEncoderConfig r0 = r1.mVideoEncoderConfig
            int r0 = r0.getZoomMode()
            return r0
    }

    public void setHeight(int r2) {
            r1 = this;
            cn.easyar.engine.recorder.VideoEncoderConfig r0 = r1.mVideoEncoderConfig
            r0.setHeight(r2)
            return
    }

    public void setTextureHeight(int r2) {
            r1 = this;
            cn.easyar.engine.recorder.VideoEncoderConfig r0 = r1.mVideoEncoderConfig
            r0.setTextureHeight(r2)
            return
    }

    public void setTextureWidth(int r2) {
            r1 = this;
            cn.easyar.engine.recorder.VideoEncoderConfig r0 = r1.mVideoEncoderConfig
            r0.setTextureWidth(r2)
            return
    }

    public void setWidth(int r2) {
            r1 = this;
            cn.easyar.engine.recorder.VideoEncoderConfig r0 = r1.mVideoEncoderConfig
            r0.setWidth(r2)
            return
    }
}
