package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.JNINamespace("PLAYER")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class MediaTransport extends com.bykv.vk.component.ttvideo.player.NativeObject {
    public static final int FILTER_AUDIO = 2;
    public static final int FILTER_VIDEO = 1;

    @com.bykv.vk.component.ttvideo.player.Keep
    public static class MediaPacket {
        public static final int CODEC_ID_AAC = 2;
        public static final int CODEC_ID_BYTE_VC1 = 1;
        public static final int CODEC_ID_H264 = 0;
        public static final int FLAG_CONFIG_FRAME = 1;
        public static final int FLAG_IS_DECODED_ONLY = 3;
        public static final int FLAG_KEY_FRAME = 2;
        public java.nio.ByteBuffer mBuffer;
        public int mCodecId;
        public int mFlags;
        public boolean mIsAccessUnit;
        public boolean mIsVideo;
        public int mOffset;
        public long mPresentationTimeMs;
        public int mSize;

        @com.bykv.vk.component.ttvideo.player.CalledByNative("MediaPacket")
        public MediaPacket() {
                r0 = this;
                r0.<init>()
                return
        }

        @com.bykv.vk.component.ttvideo.player.CalledByNative("MediaPacket")
        public void set(java.nio.ByteBuffer r1, boolean r2, boolean r3, int r4, int r5, long r6, int r8, int r9) {
                r0 = this;
                r0.mBuffer = r1
                r0.mOffset = r4
                r0.mSize = r5
                r0.mPresentationTimeMs = r6
                r0.mFlags = r8
                r0.mIsVideo = r2
                r0.mCodecId = r9
                r0.mIsAccessUnit = r3
                return
        }
    }

    public MediaTransport() {
            r0 = this;
            r0.<init>()
            return
    }

    private native void nativeSetFilterType(int r1);

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    protected abstract void sendPacket(com.bykv.vk.component.ttvideo.player.MediaTransport.MediaPacket r1);

    public void setFilterType(int r1) {
            r0 = this;
            r0.nativeSetFilterType(r1)
            return
    }
}
