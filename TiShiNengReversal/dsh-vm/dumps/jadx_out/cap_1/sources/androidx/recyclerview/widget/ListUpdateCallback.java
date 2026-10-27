package androidx.recyclerview.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ListUpdateCallback {
    void onChanged(int r1, int r2, @androidx.annotation.Nullable java.lang.Object r3);

    void onInserted(int r1, int r2);

    void onMoved(int r1, int r2);

    void onRemoved(int r1, int r2);
}
