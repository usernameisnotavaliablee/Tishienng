package com.tencent.mm.opensdk.modelmsg;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WXEnterpriseCardObject implements com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXEnterpriseCardObject";
    public java.lang.String cardInfo;
    public int msgType;

    public WXEnterpriseCardObject() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
            r2 = this;
            java.lang.String r0 = r2.cardInfo
            if (r0 == 0) goto Ld
            int r0 = r0.length()
            if (r0 != 0) goto Lb
            goto Ld
        Lb:
            r0 = 1
            return r0
        Ld:
            java.lang.String r0 = "MicroMsg.SDK.WXEnterpriseCardObject"
            java.lang.String r1 = "checkArgs fail, cardInfo is invalid"
            com.tencent.mm.opensdk.utils.Log.e(r0, r1)
            r0 = 0
            return r0
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(android.os.Bundle r3) {
            r2 = this;
            int r0 = r2.msgType
            java.lang.String r1 = "_wxenterprisecard_msgtype"
            r3.putInt(r1, r0)
            java.lang.String r0 = r2.cardInfo
            java.lang.String r1 = "_wxenterprisecard_cardinfo"
            r3.putString(r1, r0)
            return
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
            r1 = this;
            r0 = 45
            return r0
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "_wxenterprisecard_msgtype"
            int r0 = r2.getInt(r0)
            r1.msgType = r0
            java.lang.String r0 = "_wxenterprisecard_cardinfo"
            java.lang.String r2 = r2.getString(r0)
            r1.cardInfo = r2
            return
    }
}
