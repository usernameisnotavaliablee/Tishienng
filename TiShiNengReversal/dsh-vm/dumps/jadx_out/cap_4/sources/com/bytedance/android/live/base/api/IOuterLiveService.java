package com.bytedance.android.live.base.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface IOuterLiveService extends com.bytedance.android.live.base.api.IOuterLiveRoomService {
    boolean canHandleScheme(android.net.Uri r1);

    void enterLiveRoom(android.content.Context r1, long r2, android.os.Bundle r4);

    boolean handleSchema(android.content.Context r1, android.net.Uri r2);

    com.bytedance.android.live.base.api.ILiveOuterPreviewCoverView makePreviewCoverView(android.content.Context r1, android.os.Bundle r2);
}
