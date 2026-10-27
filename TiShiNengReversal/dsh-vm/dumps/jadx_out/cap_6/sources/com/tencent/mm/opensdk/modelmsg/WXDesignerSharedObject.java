package com.tencent.mm.opensdk.modelmsg;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WXDesignerSharedObject implements com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject {
    private static final java.lang.String TAG = "MicroMsg.SDK.WXEmojiSharedObject";
    public java.lang.String designerName;
    public java.lang.String designerRediretctUrl;
    public int designerUIN;
    public java.lang.String thumburl;
    public java.lang.String url;

    public WXDesignerSharedObject() {
            r0 = this;
            r0.<init>()
            return
    }

    public WXDesignerSharedObject(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.url = r3
            r0.thumburl = r1
            r0.designerUIN = r2
            r0.designerName = r4
            return
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
            r2 = this;
            int r0 = r2.designerUIN
            if (r0 == 0) goto L17
            java.lang.String r0 = r2.thumburl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L17
            java.lang.String r0 = r2.url
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 1
            return r0
        L17:
            java.lang.String r0 = "MicroMsg.SDK.WXEmojiSharedObject"
            java.lang.String r1 = "checkArgs fail, packageid or thumburl is invalid"
            com.tencent.mm.opensdk.utils.Log.e(r0, r1)
            r0 = 0
            return r0
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = r2.thumburl
            java.lang.String r1 = "_wxemojisharedobject_thumburl"
            r3.putString(r1, r0)
            int r0 = r2.designerUIN
            java.lang.String r1 = "_wxemojisharedobject_designer_uin"
            r3.putInt(r1, r0)
            java.lang.String r0 = r2.designerName
            java.lang.String r1 = "_wxemojisharedobject_designer_name"
            r3.putString(r1, r0)
            java.lang.String r0 = r2.designerRediretctUrl
            java.lang.String r1 = "_wxemojisharedobject_designer_rediretcturl"
            r3.putString(r1, r0)
            java.lang.String r0 = r2.url
            java.lang.String r1 = "_wxemojisharedobject_url"
            r3.putString(r1, r0)
            return
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
            r1 = this;
            r0 = 25
            return r0
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "_wxwebpageobject_thumburl"
            java.lang.String r0 = r2.getString(r0)
            r1.thumburl = r0
            java.lang.String r0 = "_wxemojisharedobject_designer_uin"
            int r0 = r2.getInt(r0)
            r1.designerUIN = r0
            java.lang.String r0 = "_wxemojisharedobject_designer_name"
            java.lang.String r0 = r2.getString(r0)
            r1.designerName = r0
            java.lang.String r0 = "_wxemojisharedobject_designer_rediretcturl"
            java.lang.String r0 = r2.getString(r0)
            r1.designerRediretctUrl = r0
            java.lang.String r0 = "_wxwebpageobject_url"
            java.lang.String r2 = r2.getString(r0)
            r1.url = r2
            return
    }
}
