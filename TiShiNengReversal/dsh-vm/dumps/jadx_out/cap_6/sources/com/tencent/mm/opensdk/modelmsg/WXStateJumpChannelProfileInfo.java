package com.tencent.mm.opensdk.modelmsg;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WXStateJumpChannelProfileInfo implements com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo {
    private static final java.lang.String TAG = "MicroMsg.SDK.WXStateJumpUrlInfo";
    private static final int USERNAME_LENGTH_LIMIT = 1024;
    public java.lang.String username;

    public WXStateJumpChannelProfileInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo
    public boolean checkArgs() {
            r4 = this;
            java.lang.String r0 = r4.username
            r1 = 0
            java.lang.String r2 = "MicroMsg.SDK.WXStateJumpUrlInfo"
            if (r0 == 0) goto L20
            int r0 = r0.length()
            if (r0 > 0) goto Le
            goto L20
        Le:
            java.lang.String r0 = r4.username
            int r0 = r0.length()
            r3 = 1024(0x400, float:1.435E-42)
            if (r0 < r3) goto L1e
            java.lang.String r0 = "checkArgs fail, username length exceed limit"
        L1a:
            com.tencent.mm.opensdk.utils.Log.e(r2, r0)
            return r1
        L1e:
            r0 = 1
            return r0
        L20:
            java.lang.String r0 = "checkArgs fail, username is null"
            goto L1a
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo
    public void serialize(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = r2.username
            java.lang.String r1 = "wx_state_jump_channel_profile_username"
            r3.putString(r1, r0)
            return
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo
    public int type() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo
    public void unserialize(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "wx_state_jump_channel_profile_username"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.getString(r0, r1)
            r2.username = r3
            return
    }
}
