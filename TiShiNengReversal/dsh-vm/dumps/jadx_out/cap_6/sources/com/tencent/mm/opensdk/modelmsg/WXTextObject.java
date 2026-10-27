package com.tencent.mm.opensdk.modelmsg;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WXTextObject implements com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXTextObject";
    public java.lang.String text;

    public WXTextObject() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public WXTextObject(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.text = r1
            return
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
            r2 = this;
            java.lang.String r0 = r2.text
            if (r0 == 0) goto L17
            int r0 = r0.length()
            if (r0 == 0) goto L17
            java.lang.String r0 = r2.text
            int r0 = r0.length()
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 <= r1) goto L15
            goto L17
        L15:
            r0 = 1
            return r0
        L17:
            java.lang.String r0 = "MicroMsg.SDK.WXTextObject"
            java.lang.String r1 = "checkArgs fail, text is invalid"
            com.tencent.mm.opensdk.utils.Log.e(r0, r1)
            r0 = 0
            return r0
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = r2.text
            java.lang.String r1 = "_wxtextobject_text"
            r3.putString(r1, r0)
            return
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "_wxtextobject_text"
            java.lang.String r2 = r2.getString(r0)
            r1.text = r2
            return
    }
}
