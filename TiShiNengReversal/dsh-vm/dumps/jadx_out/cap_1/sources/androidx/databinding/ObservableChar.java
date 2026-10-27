package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ObservableChar extends androidx.databinding.BaseObservableField implements android.os.Parcelable, java.io.Serializable {
    public static final android.os.Parcelable.Creator<androidx.databinding.ObservableChar> CREATOR = null;
    static final long serialVersionUID = 1;
    private char mValue;


    static {
            androidx.databinding.ObservableChar$1 r0 = new androidx.databinding.ObservableChar$1
            r0.<init>()
            androidx.databinding.ObservableChar.CREATOR = r0
            return
    }

    public ObservableChar() {
            r0 = this;
            r0.<init>()
            return
    }

    public ObservableChar(char r1) {
            r0 = this;
            r0.<init>()
            r0.mValue = r1
            return
    }

    public ObservableChar(androidx.databinding.Observable... r1) {
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

    public char get() {
            r1 = this;
            char r0 = r1.mValue
            return r0
    }

    public void set(char r2) {
            r1 = this;
            char r0 = r1.mValue
            if (r2 == r0) goto L9
            r1.mValue = r2
            r1.notifyChange()
        L9:
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            char r2 = r0.mValue
            r1.writeInt(r2)
            return
    }
}
