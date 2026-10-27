package com.tencent.mm.opensdk.modelmsg;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WXWeWorkObject implements com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject {
    public static final int SUB_TYPE_MSG_RECORD = 1;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXWeWorkObject";
    public byte[] data;
    public java.lang.String extInfo;
    public int subType;

    public WXWeWorkObject() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(android.os.Bundle r3) {
            r2 = this;
            byte[] r0 = r2.data
            java.lang.String r1 = "_wxenterprise_object_data"
            r3.putByteArray(r1, r0)
            java.lang.String r0 = r2.extInfo
            java.lang.String r1 = "_wxenterprise_object_extinfo"
            r3.putString(r1, r0)
            int r0 = r2.subType
            java.lang.String r1 = "_wxenterprise_object_subType"
            r3.putInt(r1, r0)
            return
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
            r1 = this;
            r0 = 49
            return r0
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "_wxenterprise_object_data"
            byte[] r0 = r2.getByteArray(r0)
            r1.data = r0
            java.lang.String r0 = "_wxenterprise_object_extinfo"
            java.lang.String r0 = r2.getString(r0)
            r1.extInfo = r0
            java.lang.String r0 = "_wxenterprise_object_subType"
            int r2 = r2.getInt(r0)
            r1.subType = r2
            return
    }
}
