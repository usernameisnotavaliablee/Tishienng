package androidx.emoji2.viewsintegration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(19)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class EmojiInputFilter implements android.text.InputFilter {
    private androidx.emoji2.text.EmojiCompat.InitCallback mInitCallback;
    private final android.widget.TextView mTextView;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(19)
    private static class InitCallbackImpl extends androidx.emoji2.text.EmojiCompat.InitCallback {
        private final java.lang.ref.Reference<androidx.emoji2.viewsintegration.EmojiInputFilter> mEmojiInputFilterReference;
        private final java.lang.ref.Reference<android.widget.TextView> mViewRef;

        InitCallbackImpl(android.widget.TextView r2, androidx.emoji2.viewsintegration.EmojiInputFilter r3) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mViewRef = r0
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r3)
                r1.mEmojiInputFilterReference = r2
                return
        }

        private boolean isInputFilterCurrentlyRegisteredOnTextView(@androidx.annotation.Nullable android.widget.TextView r4, @androidx.annotation.Nullable android.text.InputFilter r5) {
                r3 = this;
                r0 = 0
                if (r5 == 0) goto L1a
                if (r4 != 0) goto L6
                goto L1a
            L6:
                android.text.InputFilter[] r4 = r4.getFilters()
                if (r4 != 0) goto Ld
                return r0
            Ld:
                r1 = 0
            Le:
                int r2 = r4.length
                if (r1 >= r2) goto L1a
                r2 = r4[r1]
                if (r2 != r5) goto L17
                r4 = 1
                return r4
            L17:
                int r1 = r1 + 1
                goto Le
            L1a:
                return r0
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
                r4 = this;
                super.onInitialized()
                java.lang.ref.Reference<android.widget.TextView> r0 = r4.mViewRef
                java.lang.Object r0 = r0.get()
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.ref.Reference<androidx.emoji2.viewsintegration.EmojiInputFilter> r1 = r4.mEmojiInputFilterReference
                java.lang.Object r1 = r1.get()
                android.text.InputFilter r1 = (android.text.InputFilter) r1
                boolean r1 = r4.isInputFilterCurrentlyRegisteredOnTextView(r0, r1)
                if (r1 != 0) goto L1a
                goto L43
            L1a:
                boolean r1 = r0.isAttachedToWindow()
                if (r1 == 0) goto L43
                java.lang.CharSequence r1 = r0.getText()
                androidx.emoji2.text.EmojiCompat r2 = androidx.emoji2.text.EmojiCompat.get()
                java.lang.CharSequence r2 = r2.process(r1)
                if (r1 != r2) goto L2f
                goto L43
            L2f:
                int r1 = android.text.Selection.getSelectionStart(r2)
                int r3 = android.text.Selection.getSelectionEnd(r2)
                r0.setText(r2)
                boolean r0 = r2 instanceof android.text.Spannable
                if (r0 == 0) goto L43
                android.text.Spannable r2 = (android.text.Spannable) r2
                androidx.emoji2.viewsintegration.EmojiInputFilter.updateSelection(r2, r1, r3)
            L43:
                return
        }
    }

    EmojiInputFilter(@androidx.annotation.NonNull android.widget.TextView r1) {
            r0 = this;
            r0.<init>()
            r0.mTextView = r1
            return
    }

    private androidx.emoji2.text.EmojiCompat.InitCallback getInitCallback() {
            r2 = this;
            androidx.emoji2.text.EmojiCompat$InitCallback r0 = r2.mInitCallback
            if (r0 != 0) goto Ld
            androidx.emoji2.viewsintegration.EmojiInputFilter$InitCallbackImpl r0 = new androidx.emoji2.viewsintegration.EmojiInputFilter$InitCallbackImpl
            android.widget.TextView r1 = r2.mTextView
            r0.<init>(r1, r2)
            r2.mInitCallback = r0
        Ld:
            androidx.emoji2.text.EmojiCompat$InitCallback r0 = r2.mInitCallback
            return r0
    }

    static void updateSelection(android.text.Spannable r0, int r1, int r2) {
            if (r1 < 0) goto L8
            if (r2 < 0) goto L8
            android.text.Selection.setSelection(r0, r1, r2)
            return
        L8:
            if (r1 < 0) goto Le
            android.text.Selection.setSelection(r0, r1)
            return
        Le:
            if (r2 < 0) goto L13
            android.text.Selection.setSelection(r0, r2)
        L13:
            return
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence r3, int r4, int r5, android.text.Spanned r6, int r7, int r8) {
            r2 = this;
            android.widget.TextView r0 = r2.mTextView
            boolean r0 = r0.isInEditMode()
            if (r0 == 0) goto L9
            goto L49
        L9:
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
            int r0 = r0.getLoadState()
            if (r0 == 0) goto L4a
            r1 = 1
            if (r0 == r1) goto L1a
            r4 = 3
            if (r0 == r4) goto L4a
            goto L49
        L1a:
            if (r8 != 0) goto L2d
            if (r7 != 0) goto L2d
            int r6 = r6.length()
            if (r6 != 0) goto L2d
            android.widget.TextView r6 = r2.mTextView
            java.lang.CharSequence r6 = r6.getText()
            if (r3 != r6) goto L2d
            return r3
        L2d:
            if (r3 == 0) goto L49
            if (r4 != 0) goto L38
            int r6 = r3.length()
            if (r5 != r6) goto L38
            goto L3c
        L38:
            java.lang.CharSequence r3 = r3.subSequence(r4, r5)
        L3c:
            androidx.emoji2.text.EmojiCompat r4 = androidx.emoji2.text.EmojiCompat.get()
            r5 = 0
            int r6 = r3.length()
            java.lang.CharSequence r3 = r4.process(r3, r5, r6)
        L49:
            return r3
        L4a:
            androidx.emoji2.text.EmojiCompat r4 = androidx.emoji2.text.EmojiCompat.get()
            androidx.emoji2.text.EmojiCompat$InitCallback r5 = r2.getInitCallback()
            r4.registerInitCallback(r5)
            return r3
    }
}
