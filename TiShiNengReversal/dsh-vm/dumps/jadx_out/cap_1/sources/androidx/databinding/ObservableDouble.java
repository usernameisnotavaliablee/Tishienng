package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ObservableDouble extends androidx.databinding.BaseObservableField implements android.os.Parcelable, java.io.Serializable {
    public static final android.os.Parcelable.Creator<androidx.databinding.ObservableDouble> CREATOR = null;
    static final long serialVersionUID = 1;
    private double mValue;


    static {
            androidx.databinding.ObservableDouble$1 r0 = new androidx.databinding.ObservableDouble$1
            r0.<init>()
            androidx.databinding.ObservableDouble.CREATOR = r0
            return
    }

    public ObservableDouble() {
            r0 = this;
            r0.<init>()
            return
    }

    public ObservableDouble(double r1) {
            r0 = this;
            r0.<init>()
            r0.mValue = r1
            return
    }

    public ObservableDouble(androidx.databinding.Observable... r1) {
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

    public double get() {
            r2 = this;
            double r0 = r2.mValue
            return r0
    }

    public void set(double r4) {
            r3 = this;
            double r0 = r3.mValue
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto Lb
            r3.mValue = r4
            r3.notifyChange()
        Lb:
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            double r0 = r2.mValue
            r3.writeDouble(r0)
            return
    }
}
