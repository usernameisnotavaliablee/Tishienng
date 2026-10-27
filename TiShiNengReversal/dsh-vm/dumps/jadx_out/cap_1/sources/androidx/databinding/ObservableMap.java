package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ObservableMap<K, V> extends java.util.Map<K, V> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class OnMapChangedCallback<T extends androidx.databinding.ObservableMap<K, V>, K, V> {
        public OnMapChangedCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void onMapChanged(T r1, K r2);
    }

    void addOnMapChangedCallback(androidx.databinding.ObservableMap.OnMapChangedCallback<? extends androidx.databinding.ObservableMap<K, V>, K, V> r1);

    void removeOnMapChangedCallback(androidx.databinding.ObservableMap.OnMapChangedCallback<? extends androidx.databinding.ObservableMap<K, V>, K, V> r1);
}
