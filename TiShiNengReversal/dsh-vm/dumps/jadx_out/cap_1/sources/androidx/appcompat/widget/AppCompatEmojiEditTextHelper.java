package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class AppCompatEmojiEditTextHelper {

    @androidx.annotation.NonNull
    private final androidx.emoji2.viewsintegration.EmojiEditTextHelper mEmojiEditTextHelper;

    @androidx.annotation.NonNull
    private final android.widget.EditText mView;

    AppCompatEmojiEditTextHelper(@androidx.annotation.NonNull android.widget.EditText r3) {
            r2 = this;
            r2.<init>()
            r2.mView = r3
            androidx.emoji2.viewsintegration.EmojiEditTextHelper r0 = new androidx.emoji2.viewsintegration.EmojiEditTextHelper
            r1 = 0
            r0.<init>(r3, r1)
            r2.mEmojiEditTextHelper = r0
            return
    }

    @androidx.annotation.Nullable
    android.text.method.KeyListener getKeyListener(@androidx.annotation.Nullable android.text.method.KeyListener r2) {
            r1 = this;
            boolean r0 = r1.isEmojiCapableKeyListener(r2)
            if (r0 == 0) goto Lc
            androidx.emoji2.viewsintegration.EmojiEditTextHelper r0 = r1.mEmojiEditTextHelper
            android.text.method.KeyListener r2 = r0.getKeyListener(r2)
        Lc:
            return r2
    }

    boolean isEmojiCapableKeyListener(android.text.method.KeyListener r1) {
            r0 = this;
            boolean r1 = r1 instanceof android.text.method.NumberKeyListener
            r1 = r1 ^ 1
            return r1
    }

    boolean isEnabled() {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiEditTextHelper r0 = r1.mEmojiEditTextHelper
            boolean r0 = r0.isEnabled()
            return r0
    }

    void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.EditText r0 = r3.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.R.styleable.AppCompatTextView
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = androidx.appcompat.R.styleable.AppCompatTextView_emojiCompatEnabled     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            if (r0 == 0) goto L1d
            boolean r1 = r4.getBoolean(r5, r1)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r5 = move-exception
            goto L24
        L1d:
            r4.recycle()
            r3.setEnabled(r1)
            return
        L24:
            r4.recycle()
            throw r5
    }

    @androidx.annotation.Nullable
    android.view.inputmethod.InputConnection onCreateInputConnection(@androidx.annotation.Nullable android.view.inputmethod.InputConnection r2, @androidx.annotation.NonNull android.view.inputmethod.EditorInfo r3) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiEditTextHelper r0 = r1.mEmojiEditTextHelper
            android.view.inputmethod.InputConnection r2 = r0.onCreateInputConnection(r2, r3)
            return r2
    }

    void setEnabled(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiEditTextHelper r0 = r1.mEmojiEditTextHelper
            r0.setEnabled(r2)
            return
    }
}
