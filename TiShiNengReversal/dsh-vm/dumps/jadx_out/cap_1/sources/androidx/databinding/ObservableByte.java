package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ObservableByte extends androidx.databinding.BaseObservableField implements android.os.Parcelable, java.io.Serializable {
    public static final android.os.Parcelable.Creator<androidx.databinding.ObservableByte> CREATOR = null;
    static final long serialVersionUID = 1;
    private byte mValue;


    static {
            androidx.databinding.ObservableByte$1 r0 = new androidx.databinding.ObservableByte$1
            r0.<init>()
            androidx.databinding.ObservableByte.CREATOR = r0
            return
    }

    public ObservableByte() {
            r0 = this;
            r0.<init>()
            return
    }

    public ObservableByte(byte r1) {
            r0 = this;
            r0.<init>()
            r0.mValue = r1
            return
    }

    public ObservableByte(androidx.databinding.Observable... r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public byte get() {
            r1 = this;
            byte r0 = r1.mValue
            return r0
    }

    public void set(byte r2) {
            r1 = this;
            byte r0 = r1.mValue
            if (r2 == r0) goto L9
            r1.mValue = r2
            r1.notifyChange()
        L9:
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            byte r2 = r0.mValue
            r1.writeByte(r2)
            return
    }
}
