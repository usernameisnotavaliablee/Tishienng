package com.umeng.socialize.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class BaseMediaObject implements com.umeng.socialize.media.UMediaObject {
    protected java.lang.String a;
    protected java.lang.String b;
    protected java.util.Map<java.lang.String, java.lang.Object> c;
    protected java.lang.String d;
    protected com.umeng.socialize.media.UMImage e;
    public java.lang.String mText;

    public BaseMediaObject() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mText = r0
            java.lang.String r0 = ""
            r2.a = r0
            r2.b = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.c = r1
            r2.d = r0
            return
    }

    protected BaseMediaObject(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mText = r0
            java.lang.String r0 = ""
            r2.a = r0
            r2.b = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.c = r1
            r2.d = r0
            if (r3 == 0) goto L23
            java.lang.String r0 = r3.readString()
            r2.a = r0
            java.lang.String r3 = r3.readString()
            r2.b = r3
        L23:
            return
    }

    public BaseMediaObject(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mText = r0
            java.lang.String r0 = ""
            r2.a = r0
            r2.b = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.c = r1
            r2.d = r0
            r2.a = r3
            return
    }

    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public com.umeng.socialize.media.UMImage getThumbImage() {
            r1 = this;
            com.umeng.socialize.media.UMImage r0 = r1.e
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> getmExtra() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.c
            return r0
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public boolean isUrlMedia() {
            r1 = this;
            java.lang.String r0 = r1.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            r0 = 1
            return r0
    }

    public void setDescription(java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void setThumb(com.umeng.socialize.media.UMImage r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void setTitle(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void setmExtra(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.c
            r0.put(r2, r3)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BaseMediaObject [media_url="
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
    public java.lang.String toUrl() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }
}
