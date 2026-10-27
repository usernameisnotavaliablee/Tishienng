package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class PlaybackParams {
    protected static final int DEFAULT_VALUE = -1;
    private int mAudioFallbackMode;
    private int mDescribeContents;
    private float mPitch;
    private float mSpeed;

    public PlaybackParams() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mDescribeContents = r0
            r1.mAudioFallbackMode = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.mPitch = r0
            r1.mSpeed = r0
            return
    }

    public com.bykv.vk.component.ttvideo.player.PlaybackParams allowDefaults() {
            r0 = this;
            return r0
    }

    public int describeContents() {
            r1 = this;
            int r0 = r1.mDescribeContents
            return r0
    }

    public int getAudioFallbackMode() {
            r1 = this;
            int r0 = r1.mAudioFallbackMode
            return r0
    }

    public float getPitch() {
            r1 = this;
            float r0 = r1.mPitch
            return r0
    }

    public float getSpeed() {
            r1 = this;
            float r0 = r1.mSpeed
            return r0
    }

    public com.bykv.vk.component.ttvideo.player.PlaybackParams setAudioFallbackMode(int r1) {
            r0 = this;
            r0.mAudioFallbackMode = r1
            return r0
    }

    public com.bykv.vk.component.ttvideo.player.PlaybackParams setPitch(float r1) {
            r0 = this;
            r0.mPitch = r1
            return r0
    }

    public com.bykv.vk.component.ttvideo.player.PlaybackParams setSpeed(float r1) {
            r0 = this;
            r0.mSpeed = r1
            return r0
    }
}
