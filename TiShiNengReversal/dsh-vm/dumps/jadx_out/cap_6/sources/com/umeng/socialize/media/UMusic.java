package com.umeng.socialize.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMusic extends com.umeng.socialize.media.BaseMediaObject {
    private java.lang.String f;
    private java.lang.String g;
    private java.lang.String h;
    private java.lang.String i;
    private int j;
    private java.lang.String k;

    protected UMusic(android.os.Parcel r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public UMusic(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public int getDuration() {
            r1 = this;
            int r0 = r1.j
            return r0
    }

    public java.lang.String getH5Url() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    public java.lang.String getHighBandDataUrl() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }

    public java.lang.String getLowBandDataUrl() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public java.lang.String getLowBandUrl() {
            r1 = this;
            java.lang.String r0 = r1.i
            return r0
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public com.umeng.socialize.media.UMediaObject.MediaType getMediaType() {
            r1 = this;
            com.umeng.socialize.media.UMediaObject$MediaType r0 = com.umeng.socialize.media.UMediaObject.MediaType.MUSIC
            return r0
    }

    @Override // com.umeng.socialize.media.BaseMediaObject
    public com.umeng.socialize.media.UMImage getThumbImage() {
            r1 = this;
            com.umeng.socialize.media.UMImage r0 = r1.e
            return r0
    }

    public java.lang.String getmTargetUrl() {
            r1 = this;
            java.lang.String r0 = r1.k
            return r0
    }

    public void setDuration(int r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void setH5Url(java.lang.String r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void setHighBandDataUrl(java.lang.String r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void setLowBandDataUrl(java.lang.String r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void setLowBandUrl(java.lang.String r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void setmTargetUrl(java.lang.String r1) {
            r0 = this;
            r0.k = r1
            return
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
            java.lang.String r1 = "UMusic [title="
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = "media_url="
            r0.append(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", qzone_title="
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", qzone_thumb=]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public final java.util.Map<java.lang.String, java.lang.Object> toUrlExtraParams() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = r3.isUrlMedia()
            if (r1 == 0) goto L22
            java.lang.String r1 = com.umeng.socialize.net.utils.SocializeProtocolConstants.PROTOCOL_KEY_FURL
            java.lang.String r2 = r3.a
            r0.put(r1, r2)
            java.lang.String r1 = com.umeng.socialize.net.utils.SocializeProtocolConstants.PROTOCOL_KEY_FTYPE
            com.umeng.socialize.media.UMediaObject$MediaType r2 = r3.getMediaType()
            r0.put(r1, r2)
            java.lang.String r1 = com.umeng.socialize.net.utils.SocializeProtocolConstants.PROTOCOL_KEY_TITLE
            java.lang.String r2 = r3.b
            r0.put(r1, r2)
        L22:
            return r0
    }
}
