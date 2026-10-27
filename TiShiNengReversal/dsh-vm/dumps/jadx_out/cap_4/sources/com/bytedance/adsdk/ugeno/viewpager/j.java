package com.bytedance.adsdk.ugeno.viewpager;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.bytedance.adsdk.ugeno.viewpager.j> CREATOR = null;
    public static final com.bytedance.adsdk.ugeno.viewpager.j j = null;
    private final android.os.Parcelable xt;



    static {
            com.bytedance.adsdk.ugeno.viewpager.j$1 r0 = new com.bytedance.adsdk.ugeno.viewpager.j$1
            r0.<init>()
            com.bytedance.adsdk.ugeno.viewpager.j.j = r0
            com.bytedance.adsdk.ugeno.viewpager.j$2 r0 = new com.bytedance.adsdk.ugeno.viewpager.j$2
            r0.<init>()
            com.bytedance.adsdk.ugeno.viewpager.j.CREATOR = r0
            return
    }

    private j() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.xt = r0
            return
    }

    protected j(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            android.os.Parcelable r1 = r1.readParcelable(r2)
            if (r1 == 0) goto La
            goto Lc
        La:
            com.bytedance.adsdk.ugeno.viewpager.j r1 = com.bytedance.adsdk.ugeno.viewpager.j.j
        Lc:
            r0.xt = r1
            return
    }

    protected j(android.os.Parcelable r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Le
            com.bytedance.adsdk.ugeno.viewpager.j r0 = com.bytedance.adsdk.ugeno.viewpager.j.j
            if (r2 == r0) goto La
            goto Lb
        La:
            r2 = 0
        Lb:
            r1.xt = r2
            return
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "superState must not be null"
            r2.<init>(r0)
            throw r2
    }

    /* synthetic */ j(com.bytedance.adsdk.ugeno.viewpager.j.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final android.os.Parcelable j() {
            r1 = this;
            android.os.Parcelable r0 = r1.xt
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            android.os.Parcelable r0 = r1.xt
            r2.writeParcelable(r0, r3)
            return
    }
}
