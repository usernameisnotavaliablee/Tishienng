package cn.asus.push;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class b implements android.os.Parcelable.Creator<cn.asus.push.DataBuffer> {
    b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cn.asus.push.DataBuffer createFromParcel(android.os.Parcel r2) {
            r1 = this;
            cn.asus.push.DataBuffer r0 = new cn.asus.push.DataBuffer
            r0.<init>(r2)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ cn.asus.push.DataBuffer[] newArray(int r1) {
            r0 = this;
            cn.asus.push.DataBuffer[] r1 = new cn.asus.push.DataBuffer[r1]
            return r1
    }
}
