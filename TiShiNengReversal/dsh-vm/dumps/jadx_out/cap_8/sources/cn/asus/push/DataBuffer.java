package cn.asus.push;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DataBuffer implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<cn.asus.push.DataBuffer> CREATOR = null;
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.Bundle f3b;

    static {
            cn.asus.push.b r0 = new cn.asus.push.b
            r0.<init>()
            cn.asus.push.DataBuffer.CREATOR = r0
            return
    }

    protected DataBuffer(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            android.os.Bundle r2 = r2.readBundle()
            r1.f3b = r2
            return
    }

    public DataBuffer(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f3b = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            android.os.Bundle r2 = r0.f3b
            r1.writeBundle(r2)
            return
    }
}
