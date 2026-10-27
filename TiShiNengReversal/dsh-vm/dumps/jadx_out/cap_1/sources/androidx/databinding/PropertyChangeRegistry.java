package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class PropertyChangeRegistry extends androidx.databinding.CallbackRegistry<androidx.databinding.Observable.OnPropertyChangedCallback, androidx.databinding.Observable, java.lang.Void> {
    private static final androidx.databinding.CallbackRegistry.NotifierCallback<androidx.databinding.Observable.OnPropertyChangedCallback, androidx.databinding.Observable, java.lang.Void> NOTIFIER_CALLBACK = null;


    static {
            androidx.databinding.PropertyChangeRegistry$1 r0 = new androidx.databinding.PropertyChangeRegistry$1
            r0.<init>()
            androidx.databinding.PropertyChangeRegistry.NOTIFIER_CALLBACK = r0
            return
    }

    public PropertyChangeRegistry() {
            r1 = this;
            androidx.databinding.CallbackRegistry$NotifierCallback<androidx.databinding.Observable$OnPropertyChangedCallback, androidx.databinding.Observable, java.lang.Void> r0 = androidx.databinding.PropertyChangeRegistry.NOTIFIER_CALLBACK
            r1.<init>(r0)
            return
    }

    public void notifyChange(@androidx.annotation.NonNull androidx.databinding.Observable r2, int r3) {
            r1 = this;
            r0 = 0
            r1.notifyCallbacks(r2, r3, r0)
            return
    }
}
