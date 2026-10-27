package androidx.emoji2.viewsintegration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(19)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class EmojiKeyListener implements android.text.method.KeyListener {
    private final androidx.emoji2.viewsintegration.EmojiKeyListener.EmojiCompatHandleKeyDownHelper mEmojiCompatHandleKeyDownHelper;
    private final android.text.method.KeyListener mKeyListener;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class EmojiCompatHandleKeyDownHelper {
        public EmojiCompatHandleKeyDownHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean handleKeyDown(@androidx.annotation.NonNull android.text.Editable r1, int r2, @androidx.annotation.NonNull android.view.KeyEvent r3) {
                r0 = this;
                boolean r1 = androidx.emoji2.text.EmojiCompat.handleOnKeyDown(r1, r2, r3)
                return r1
        }
    }

    EmojiKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiKeyListener$EmojiCompatHandleKeyDownHelper r0 = new androidx.emoji2.viewsintegration.EmojiKeyListener$EmojiCompatHandleKeyDownHelper
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    EmojiKeyListener(android.text.method.KeyListener r1, androidx.emoji2.viewsintegration.EmojiKeyListener.EmojiCompatHandleKeyDownHelper r2) {
            r0 = this;
            r0.<init>()
            r0.mKeyListener = r1
            r0.mEmojiCompatHandleKeyDownHelper = r2
            return
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(android.view.View r2, android.text.Editable r3, int r4) {
            r1 = this;
            android.text.method.KeyListener r0 = r1.mKeyListener
            r0.clearMetaKeyState(r2, r3, r4)
            return
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
            r1 = this;
            android.text.method.KeyListener r0 = r1.mKeyListener
            int r0 = r0.getInputType()
            return r0
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(android.view.View r2, android.text.Editable r3, int r4, android.view.KeyEvent r5) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiKeyListener$EmojiCompatHandleKeyDownHelper r0 = r1.mEmojiCompatHandleKeyDownHelper
            boolean r0 = r0.handleKeyDown(r3, r4, r5)
            if (r0 != 0) goto L13
            android.text.method.KeyListener r0 = r1.mKeyListener
            boolean r2 = r0.onKeyDown(r2, r3, r4, r5)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(android.view.View r2, android.text.Editable r3, android.view.KeyEvent r4) {
            r1 = this;
            android.text.method.KeyListener r0 = r1.mKeyListener
            boolean r2 = r0.onKeyOther(r2, r3, r4)
            return r2
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(android.view.View r2, android.text.Editable r3, int r4, android.view.KeyEvent r5) {
            r1 = this;
            android.text.method.KeyListener r0 = r1.mKeyListener
            boolean r2 = r0.onKeyUp(r2, r3, r4, r5)
            return r2
    }
}
