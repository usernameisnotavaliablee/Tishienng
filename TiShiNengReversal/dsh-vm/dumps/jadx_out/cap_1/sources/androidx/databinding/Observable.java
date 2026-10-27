package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface Observable {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class OnPropertyChangedCallback {
        public OnPropertyChangedCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void onPropertyChanged(androidx.databinding.Observable r1, int r2);
    }

    void addOnPropertyChangedCallback(androidx.databinding.Observable.OnPropertyChangedCallback r1);

    void removeOnPropertyChangedCallback(androidx.databinding.Observable.OnPropertyChangedCallback r1);
}
