package androidx.core.view.accessibility;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AccessibilityClickableSpanCompat extends android.text.style.ClickableSpan {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final java.lang.String SPAN_ID = "ACCESSIBILITY_CLICKABLE_SPAN_ID";
    private final int mClickableSpanActionId;
    private final androidx.core.view.accessibility.AccessibilityNodeInfoCompat mNodeInfoCompat;
    private final int mOriginalClickableSpanId;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public AccessibilityClickableSpanCompat(int r1, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.mOriginalClickableSpanId = r1
            r0.mNodeInfoCompat = r2
            r0.mClickableSpanActionId = r3
            return
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r1 = r2.mOriginalClickableSpanId
            r3.putInt(r0, r1)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r2.mNodeInfoCompat
            int r1 = r2.mClickableSpanActionId
            r0.performAction(r1, r3)
            return
    }
}
