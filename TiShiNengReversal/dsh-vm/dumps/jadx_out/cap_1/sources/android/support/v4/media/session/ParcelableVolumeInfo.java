package android.support.v4.media.session;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ParcelableVolumeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.ParcelableVolumeInfo> CREATOR = null;
    public int audioStream;
    public int controlType;
    public int currentVolume;
    public int maxVolume;
    public int volumeType;


    static {
            android.support.v4.media.session.ParcelableVolumeInfo$1 r0 = new android.support.v4.media.session.ParcelableVolumeInfo$1
            r0.<init>()
            android.support.v4.media.session.ParcelableVolumeInfo.CREATOR = r0
            return
    }

    public ParcelableVolumeInfo(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.volumeType = r1
            r0.audioStream = r2
            r0.controlType = r3
            r0.maxVolume = r4
            r0.currentVolume = r5
            return
    }

    public ParcelableVolumeInfo(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.volumeType = r0
            int r0 = r2.readInt()
            r1.controlType = r0
            int r0 = r2.readInt()
            r1.maxVolume = r0
            int r0 = r2.readInt()
            r1.currentVolume = r0
            int r2 = r2.readInt()
            r1.audioStream = r2
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
            int r2 = r0.volumeType
            r1.writeInt(r2)
            int r2 = r0.controlType
            r1.writeInt(r2)
            int r2 = r0.maxVolume
            r1.writeInt(r2)
            int r2 = r0.currentVolume
            r1.writeInt(r2)
            int r2 = r0.audioStream
            r1.writeInt(r2)
            return
    }
}
