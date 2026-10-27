package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface FrameMetadataListener {
    void frameDTSNotify(int r1, long r2, long r4);

    void onFrameAboutToBeRendered(int r1, long r2, long r4, java.util.Map<java.lang.Integer, java.lang.String> r6);

    void updateFrameTerminatedDTS(int r1, long r2, long r4);
}
