package com.bykv.vk.component.ttvideo.playerwrapper;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class PlayerSetting {
    private final android.content.Context mContext;
    private float mCurrentPlayerVolume;
    private float mLastVolume;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer mPlayer;

    public PlayerSetting(android.content.Context r2, com.bykv.vk.component.ttvideo.player.MediaPlayer r3) {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.mCurrentPlayerVolume = r0
            r1.mPlayer = r3
            r1.mContext = r2
            return
    }

    public float getMaxVolume() {
            r3 = this;
            android.content.Context r0 = r3.mContext
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r1 = 0
            if (r0 == 0) goto L17
            r2 = 3
            int r0 = r0.getStreamMaxVolume(r2)
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 >= 0) goto L1b
            goto L1c
        L1b:
            r1 = r0
        L1c:
            float r0 = (float) r1
            return r0
    }

    public float getPlayerVolume() {
            r1 = this;
            float r0 = r1.mCurrentPlayerVolume
            return r0
    }

    public float getVolume() {
            r3 = this;
            android.content.Context r0 = r3.mContext
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r1 = 0
            if (r0 == 0) goto L17
            r2 = 3
            int r0 = r0.getStreamVolume(r2)
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 >= 0) goto L1b
            goto L1c
        L1b:
            r1 = r0
        L1c:
            float r0 = (float) r1
            return r0
    }

    public boolean isMute() {
            r3 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.mPlayer
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.isOSPlayer()
            if (r0 == 0) goto L1a
            float r0 = r3.getVolume()
            r2 = 981668463(0x3a83126f, float:0.001)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L19
            r0 = 1
            return r0
        L19:
            return r1
        L1a:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.mPlayer
            boolean r0 = r0.isMute()
            return r0
    }

    public void setMute(boolean r4) {
            r3 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.mPlayer
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r0.isOSPlayer()
            if (r0 == 0) goto L2b
            float r0 = r3.getMaxVolume()
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L1b
            float r2 = r3.getVolume()
            float r2 = r2 / r0
            r3.mLastVolume = r2
        L1b:
            if (r4 == 0) goto L23
            com.bykv.vk.component.ttvideo.player.MediaPlayer r4 = r3.mPlayer
            r4.setVolume(r1, r1)
            return
        L23:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r4 = r3.mPlayer
            float r0 = r3.mLastVolume
            r4.setVolume(r0, r0)
            return
        L2b:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.mPlayer
            r0.setIsMute(r4)
            return
    }

    public void setPlayer(com.bykv.vk.component.ttvideo.player.MediaPlayer r1) {
            r0 = this;
            r0.mPlayer = r1
            return
    }

    public void setPlayerVolume(float r4) {
            r3 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.mPlayer
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 >= 0) goto Lc
            r4 = 0
            goto L14
        Lc:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 <= 0) goto L14
            r4 = 1065353216(0x3f800000, float:1.0)
        L14:
            r3.mCurrentPlayerVolume = r4
            r0.setVolume(r4, r4)
            return
    }

    public void setVolume(float r4) {
            r3 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.mPlayer
            if (r0 != 0) goto L5
            goto L17
        L5:
            android.content.Context r0 = r3.mContext
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            if (r0 == 0) goto L17
            int r4 = (int) r4
            r1 = 0
            r2 = 3
            r0.setStreamVolume(r2, r4, r1)
        L17:
            return
    }
}
