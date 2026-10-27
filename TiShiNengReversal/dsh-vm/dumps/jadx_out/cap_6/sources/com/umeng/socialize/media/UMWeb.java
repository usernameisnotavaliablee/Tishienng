package com.umeng.socialize.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMWeb extends com.umeng.socialize.media.BaseMediaObject {
    public UMWeb(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public UMWeb(java.lang.String r1, java.lang.String r2, java.lang.String r3, com.umeng.socialize.media.UMImage r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.setThumb(r4)
            r0.d = r3
            r0.setTitle(r2)
            return
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public com.umeng.socialize.media.UMediaObject.MediaType getMediaType() {
            r1 = this;
            com.umeng.socialize.media.UMediaObject$MediaType r0 = com.umeng.socialize.media.UMediaObject.MediaType.WEBPAGE
            return r0
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public byte[] toByte() {
            r1 = this;
            com.umeng.socialize.media.UMImage r0 = r1.e
            if (r0 == 0) goto L9
            byte[] r0 = r0.toByte()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.umeng.socialize.media.BaseMediaObject
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UMWEB [media_url="
            r0.append(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = "media_url="
            r0.append(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", des="
            r0.append(r1)
            java.lang.String r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", qzone_thumb=]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public java.util.Map<java.lang.String, java.lang.Object> toUrlExtraParams() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = r3.isUrlMedia()
            if (r1 == 0) goto L1b
            java.lang.String r1 = com.umeng.socialize.net.utils.SocializeProtocolConstants.PROTOCOL_KEY_FURL
            java.lang.String r2 = r3.a
            r0.put(r1, r2)
            java.lang.String r1 = com.umeng.socialize.net.utils.SocializeProtocolConstants.PROTOCOL_KEY_FTYPE
            com.umeng.socialize.media.UMediaObject$MediaType r2 = r3.getMediaType()
            r0.put(r1, r2)
        L1b:
            return r0
    }
}
