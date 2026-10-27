package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ObservableList<T> extends java.util.List<T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class OnListChangedCallback<T extends androidx.databinding.ObservableList> {
        public OnListChangedCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void onChanged(T r1);

        public abstract void onItemRangeChanged(T r1, int r2, int r3);

        public abstract void onItemRangeInserted(T r1, int r2, int r3);

        public abstract void onItemRangeMoved(T r1, int r2, int r3, int r4);

        public abstract void onItemRangeRemoved(T r1, int r2, int r3);
    }

    void addOnListChangedCallback(androidx.databinding.ObservableList.OnListChangedCallback<? extends androidx.databinding.ObservableList<T>> r1);

    void removeOnListChangedCallback(androidx.databinding.ObservableList.OnListChangedCallback<? extends androidx.databinding.ObservableList<T>> r1);
}
