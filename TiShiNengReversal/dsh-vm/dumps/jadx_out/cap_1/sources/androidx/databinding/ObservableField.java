package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ObservableField<T> extends androidx.databinding.BaseObservableField implements java.io.Serializable {
    static final long serialVersionUID = 1;
    private T mValue;

    public ObservableField() {
            r0 = this;
            r0.<init>()
            return
    }

    public ObservableField(T r1) {
            r0 = this;
            r0.<init>()
            r0.mValue = r1
            return
    }

    public ObservableField(androidx.databinding.Observable... r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.Nullable
    public T get() {
            r1 = this;
            T r0 = r1.mValue
            return r0
    }

    public void set(T r2) {
            r1 = this;
            T r0 = r1.mValue
            if (r2 == r0) goto L9
            r1.mValue = r2
            r1.notifyChange()
        L9:
            return
    }
}
