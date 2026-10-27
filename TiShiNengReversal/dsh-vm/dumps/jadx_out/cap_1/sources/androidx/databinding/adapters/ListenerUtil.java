package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ListenerUtil {
    private static final android.util.SparseArray<java.util.WeakHashMap<android.view.View, java.lang.ref.WeakReference<?>>> sListeners = null;

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.databinding.adapters.ListenerUtil.sListeners = r0
            return
    }

    public ListenerUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> T getListener(android.view.View r0, int r1) {
            java.lang.Object r0 = r0.getTag(r1)
            return r0
    }

    public static <T> T trackListener(android.view.View r1, T r2, int r3) {
            java.lang.Object r0 = r1.getTag(r3)
            r1.setTag(r3, r2)
            return r0
    }
}
