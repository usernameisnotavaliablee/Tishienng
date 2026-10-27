package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class AppCompatHintHelper {
    private AppCompatHintHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.InputConnection r1, android.view.inputmethod.EditorInfo r2, android.view.View r3) {
            if (r1 == 0) goto L20
            java.lang.CharSequence r0 = r2.hintText
            if (r0 != 0) goto L20
            android.view.ViewParent r3 = r3.getParent()
        La:
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L20
            boolean r0 = r3 instanceof androidx.appcompat.widget.WithHint
            if (r0 == 0) goto L1b
            androidx.appcompat.widget.WithHint r3 = (androidx.appcompat.widget.WithHint) r3
            java.lang.CharSequence r3 = r3.getHint()
            r2.hintText = r3
            return r1
        L1b:
            android.view.ViewParent r3 = r3.getParent()
            goto La
        L20:
            return r1
    }
}
