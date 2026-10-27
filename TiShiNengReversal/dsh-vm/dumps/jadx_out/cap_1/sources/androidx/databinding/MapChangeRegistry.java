package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MapChangeRegistry extends androidx.databinding.CallbackRegistry<androidx.databinding.ObservableMap.OnMapChangedCallback, androidx.databinding.ObservableMap, java.lang.Object> {
    private static androidx.databinding.CallbackRegistry.NotifierCallback<androidx.databinding.ObservableMap.OnMapChangedCallback, androidx.databinding.ObservableMap, java.lang.Object> NOTIFIER_CALLBACK;


    static {
            androidx.databinding.MapChangeRegistry$1 r0 = new androidx.databinding.MapChangeRegistry$1
            r0.<init>()
            androidx.databinding.MapChangeRegistry.NOTIFIER_CALLBACK = r0
            return
    }

    public MapChangeRegistry() {
            r1 = this;
            androidx.databinding.CallbackRegistry$NotifierCallback<androidx.databinding.ObservableMap$OnMapChangedCallback, androidx.databinding.ObservableMap, java.lang.Object> r0 = androidx.databinding.MapChangeRegistry.NOTIFIER_CALLBACK
            r1.<init>(r0)
            return
    }

    public void notifyChange(@androidx.annotation.NonNull androidx.databinding.ObservableMap r2, @androidx.annotation.Nullable java.lang.Object r3) {
            r1 = this;
            r0 = 0
            r1.notifyCallbacks(r2, r0, r3)
            return
    }
}
