package com.ss.android.socialbase.downloader.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j extends java.lang.Exception implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.ss.android.socialbase.downloader.up.j> CREATOR = null;
    private java.lang.String cw;
    private int j;
    private java.lang.String xt;


    static {
            com.ss.android.socialbase.downloader.up.j$1 r0 = new com.ss.android.socialbase.downloader.up.j$1
            r0.<init>()
            com.ss.android.socialbase.downloader.up.j.CREATOR = r0
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.cw = r0
            return
    }

    public j(int r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "[d-ex]:"
            java.lang.String r0 = r1.concat(r0)
            r2.<init>(r0)
            java.lang.String r0 = ""
            r2.cw = r0
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r1.concat(r4)
            r2.xt = r4
            r2.j = r3
            return
    }

    public j(int r1, java.lang.Throwable r2) {
            r0 = this;
            java.lang.String r2 = com.ss.android.socialbase.downloader.az.m.oq(r2)
            r0.<init>(r1, r2)
            return
    }

    protected j(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.cw = r0
            r1.j(r2)
            return
    }

    public java.lang.String cw() {
            r1 = this;
            java.lang.String r0 = r1.cw
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int j() {
            r1 = this;
            int r0 = r1.j
            return r0
    }

    public void j(android.os.Parcel r2) {
            r1 = this;
            int r0 = r2.readInt()
            r1.j = r0
            java.lang.String r0 = r2.readString()
            r1.xt = r0
            java.lang.String r2 = r2.readString()
            r1.cw = r2
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BaseException{errorCode="
            r0.<init>(r1)
            int r1 = r2.j
            r0.append(r1)
            java.lang.String r1 = ", errorMsg='"
            r0.append(r1)
            java.lang.String r1 = r2.xt
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.j
            r1.writeInt(r2)
            java.lang.String r2 = r0.xt
            r1.writeString(r2)
            java.lang.String r2 = r0.cw
            r1.writeString(r2)
            return
    }

    public java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = r1.xt
            return r0
    }

    public void xt(java.lang.String r1) {
            r0 = this;
            r0.cw = r1
            return
    }
}
