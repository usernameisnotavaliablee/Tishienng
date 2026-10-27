package com.tencent.mm.opensdk.modelbiz;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class WXChannelBaseJumpInfo implements com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo {
    private static final java.lang.String TAG = "MicroMsg.SDK.WXChannelBaseJumpInfo";
    private static final int WORDING_LENGTH_LIMIT = 1024;
    public java.lang.String extra;
    public java.lang.String wording;

    public WXChannelBaseJumpInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo
    public boolean checkArgs() {
            r2 = this;
            java.lang.String r0 = r2.wording
            if (r0 == 0) goto L15
            int r0 = r0.length()
            r1 = 1024(0x400, float:1.435E-42)
            if (r0 < r1) goto L15
            java.lang.String r0 = "MicroMsg.SDK.WXChannelBaseJumpInfo"
            java.lang.String r1 = "checkArgs fail, wording is invalid"
            com.tencent.mm.opensdk.utils.Log.e(r0, r1)
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    @Override // com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo
    public void serialize(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = r2.wording
            java.lang.String r1 = "wx_channel_jump_base_wording"
            r3.putString(r1, r0)
            java.lang.String r0 = r2.extra
            java.lang.String r1 = "wx_channel_jump_base_extra"
            r3.putString(r1, r0)
            return
    }

    @Override // com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo
    public void unserialize(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "wx_channel_jump_base_wording"
            java.lang.String r0 = r2.getString(r0)
            r1.wording = r0
            java.lang.String r0 = "wx_channel_jump_base_extra"
            java.lang.String r2 = r2.getString(r0)
            r1.extra = r2
            return
    }
}
