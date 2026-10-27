package androidx.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ListPopupWindowCompat {
    private ListPopupWindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.view.View.OnTouchListener createDragToOpenListener(@androidx.annotation.NonNull android.widget.ListPopupWindow r0, @androidx.annotation.NonNull android.view.View r1) {
            android.view.View$OnTouchListener r0 = r0.createDragToOpenListener(r1)
            return r0
    }

    @java.lang.Deprecated
    public static android.view.View.OnTouchListener createDragToOpenListener(java.lang.Object r0, android.view.View r1) {
            android.widget.ListPopupWindow r0 = (android.widget.ListPopupWindow) r0
            android.view.View$OnTouchListener r0 = createDragToOpenListener(r0, r1)
            return r0
    }
}
