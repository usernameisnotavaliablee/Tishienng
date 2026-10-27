package androidx.databinding;

import android.os.Parcelable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ObservableParcelable<T extends android.os.Parcelable> extends androidx.databinding.ObservableField<T> implements android.os.Parcelable, java.io.Serializable {
    public static final android.os.Parcelable.Creator<androidx.databinding.ObservableParcelable> CREATOR = null;
    static final long serialVersionUID = 1;


    static {
            androidx.databinding.ObservableParcelable$1 r0 = new androidx.databinding.ObservableParcelable$1
            r0.<init>()
            androidx.databinding.ObservableParcelable.CREATOR = r0
            return
    }

    public ObservableParcelable() {
            r0 = this;
            r0.<init>()
            return
    }

    public ObservableParcelable(T r1) {
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

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.Object r3 = r1.get()
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            r0 = 0
            r2.writeParcelable(r3, r0)
            return
    }
}
