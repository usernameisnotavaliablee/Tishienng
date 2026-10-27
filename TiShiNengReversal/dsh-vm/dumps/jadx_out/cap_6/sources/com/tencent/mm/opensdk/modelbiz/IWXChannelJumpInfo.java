package com.tencent.mm.opensdk.modelbiz;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface IWXChannelJumpInfo {
    public static final int WX_CHANNEL_JUMP_TYPE_MINI_PROGRAM = 1;
    public static final int WX_CHANNEL_JUMP_TYPE_UNKNOWN = 0;
    public static final int WX_CHANNEL_JUMP_TYPE_URL = 2;

    boolean checkArgs();

    void serialize(android.os.Bundle r1);

    int type();

    void unserialize(android.os.Bundle r1);
}
