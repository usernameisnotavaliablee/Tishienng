package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ObservableFloat extends androidx.databinding.BaseObservableField implements android.os.Parcelable, java.io.Serializable {
    public static final android.os.Parcelable.Creator<androidx.databinding.ObservableFloat> CREATOR = null;
    static final long serialVersionUID = 1;
    private float mValue;


    static {
            androidx.databinding.ObservableFloat$1 r0 = new androidx.databinding.ObservableFloat$1
            r0.<init>()
            androidx.databinding.ObservableFloat.CREATOR = r0
            return
    }

    public ObservableFloat() {
            r0 = this;
            r0.<init>()
            return
    }

    public ObservableFloat(float r1) {
            r0 = this;
            r0.<init>()
            r0.mValue = r1
            return
    }

    public ObservableFloat(androidx.databinding.Observable... r1) {
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

    public float get() {
            r1 = this;
            float r0 = r1.mValue
            return r0
    }

    public void set(float r2) {
            r1 = this;
            float r0 = r1.mValue
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mValue = r2
            r1.notifyChange()
        Lb:
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            float r2 = r0.mValue
            r1.writeFloat(r2)
            return
    }
}
