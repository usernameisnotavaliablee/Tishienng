package com.bytedance.pangle.servermanager;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.bytedance.pangle.servermanager.j> CREATOR = null;
    private final android.os.IBinder j;


    static {
            com.bytedance.pangle.servermanager.j$1 r0 = new com.bytedance.pangle.servermanager.j$1
            r0.<init>()
            com.bytedance.pangle.servermanager.j.CREATOR = r0
            return
    }

    j(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    j(android.os.Parcel r1) {
            r0 = this;
            r0.<init>()
            android.os.IBinder r1 = r1.readStrongBinder()
            r0.j = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.os.IBinder j() {
            r1 = this;
            android.os.IBinder r0 = r1.j
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            android.os.IBinder r2 = r0.j
            r1.writeStrongBinder(r2)
            return
    }
}
