package androidx.emoji2.viewsintegration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class EmojiTextViewHelper {
    private final androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal mHelper;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class HelperInternal {
        HelperInternal() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        android.text.InputFilter[] getFilters(@androidx.annotation.NonNull android.text.InputFilter[] r1) {
                r0 = this;
                return r1
        }

        public boolean isEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        void setAllCaps(boolean r1) {
                r0 = this;
                return
        }

        void setEnabled(boolean r1) {
                r0 = this;
                return
        }

        void updateTransformationMethod() {
                r0 = this;
                return
        }

        @androidx.annotation.Nullable
        android.text.method.TransformationMethod wrapTransformationMethod(@androidx.annotation.Nullable android.text.method.TransformationMethod r1) {
                r0 = this;
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(19)
    private static class HelperInternal19 extends androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal {
        private final androidx.emoji2.viewsintegration.EmojiInputFilter mEmojiInputFilter;
        private boolean mEnabled;
        private final android.widget.TextView mTextView;

        HelperInternal19(android.widget.TextView r2) {
                r1 = this;
                r1.<init>()
                r1.mTextView = r2
                r0 = 1
                r1.mEnabled = r0
                androidx.emoji2.viewsintegration.EmojiInputFilter r0 = new androidx.emoji2.viewsintegration.EmojiInputFilter
                r0.<init>(r2)
                r1.mEmojiInputFilter = r0
                return
        }

        @androidx.annotation.NonNull
        private android.text.InputFilter[] addEmojiInputFilterIfMissing(@androidx.annotation.NonNull android.text.InputFilter[] r6) {
                r5 = this;
                int r0 = r6.length
                r1 = 0
                r2 = 0
            L3:
                if (r2 >= r0) goto Lf
                r3 = r6[r2]
                androidx.emoji2.viewsintegration.EmojiInputFilter r4 = r5.mEmojiInputFilter
                if (r3 != r4) goto Lc
                return r6
            Lc:
                int r2 = r2 + 1
                goto L3
            Lf:
                int r2 = r6.length
                int r2 = r2 + 1
                android.text.InputFilter[] r2 = new android.text.InputFilter[r2]
                java.lang.System.arraycopy(r6, r1, r2, r1, r0)
                androidx.emoji2.viewsintegration.EmojiInputFilter r6 = r5.mEmojiInputFilter
                r2[r0] = r6
                return r2
        }

        private android.util.SparseArray<android.text.InputFilter> getEmojiInputFilterPositionArray(@androidx.annotation.NonNull android.text.InputFilter[] r5) {
                r4 = this;
                android.util.SparseArray r0 = new android.util.SparseArray
                r1 = 1
                r0.<init>(r1)
                r1 = 0
            L7:
                int r2 = r5.length
                if (r1 >= r2) goto L16
                r2 = r5[r1]
                boolean r3 = r2 instanceof androidx.emoji2.viewsintegration.EmojiInputFilter
                if (r3 == 0) goto L13
                r0.put(r1, r2)
            L13:
                int r1 = r1 + 1
                goto L7
            L16:
                return r0
        }

        @androidx.annotation.NonNull
        private android.text.InputFilter[] removeEmojiInputFilterIfPresent(@androidx.annotation.NonNull android.text.InputFilter[] r7) {
                r6 = this;
                android.util.SparseArray r0 = r6.getEmojiInputFilterPositionArray(r7)
                int r1 = r0.size()
                if (r1 != 0) goto Lb
                return r7
            Lb:
                int r1 = r7.length
                int r2 = r7.length
                int r3 = r0.size()
                int r2 = r2 - r3
                android.text.InputFilter[] r2 = new android.text.InputFilter[r2]
                r3 = 0
                r4 = 0
            L16:
                if (r3 >= r1) goto L27
                int r5 = r0.indexOfKey(r3)
                if (r5 >= 0) goto L24
                r5 = r7[r3]
                r2[r4] = r5
                int r4 = r4 + 1
            L24:
                int r3 = r3 + 1
                goto L16
            L27:
                return r2
        }

        @androidx.annotation.Nullable
        private android.text.method.TransformationMethod unwrapForDisabled(@androidx.annotation.Nullable android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.emoji2.viewsintegration.EmojiTransformationMethod
                if (r0 == 0) goto La
                androidx.emoji2.viewsintegration.EmojiTransformationMethod r2 = (androidx.emoji2.viewsintegration.EmojiTransformationMethod) r2
                android.text.method.TransformationMethod r2 = r2.getOriginalTransformationMethod()
            La:
                return r2
        }

        private void updateFilters() {
                r2 = this;
                android.widget.TextView r0 = r2.mTextView
                android.text.InputFilter[] r0 = r0.getFilters()
                android.widget.TextView r1 = r2.mTextView
                android.text.InputFilter[] r0 = r2.getFilters(r0)
                r1.setFilters(r0)
                return
        }

        @androidx.annotation.NonNull
        private android.text.method.TransformationMethod wrapForEnabled(@androidx.annotation.Nullable android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.emoji2.viewsintegration.EmojiTransformationMethod
                if (r0 == 0) goto L5
                return r2
            L5:
                boolean r0 = r2 instanceof android.text.method.PasswordTransformationMethod
                if (r0 == 0) goto La
                return r2
            La:
                androidx.emoji2.viewsintegration.EmojiTransformationMethod r0 = new androidx.emoji2.viewsintegration.EmojiTransformationMethod
                r0.<init>(r2)
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @androidx.annotation.NonNull
        android.text.InputFilter[] getFilters(@androidx.annotation.NonNull android.text.InputFilter[] r2) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 != 0) goto L9
                android.text.InputFilter[] r2 = r1.removeEmojiInputFilterIfPresent(r2)
                return r2
            L9:
                android.text.InputFilter[] r2 = r1.addEmojiInputFilterIfMissing(r2)
                return r2
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean isEnabled() {
                r1 = this;
                boolean r0 = r1.mEnabled
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setAllCaps(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L5
                r0.updateTransformationMethod()
            L5:
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setEnabled(boolean r1) {
                r0 = this;
                r0.mEnabled = r1
                r0.updateTransformationMethod()
                r0.updateFilters()
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        void setEnabledUnsafe(boolean r1) {
                r0 = this;
                r0.mEnabled = r1
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void updateTransformationMethod() {
                r2 = this;
                android.widget.TextView r0 = r2.mTextView
                android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
                android.text.method.TransformationMethod r0 = r2.wrapTransformationMethod(r0)
                android.widget.TextView r1 = r2.mTextView
                r1.setTransformationMethod(r0)
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @androidx.annotation.Nullable
        android.text.method.TransformationMethod wrapTransformationMethod(@androidx.annotation.Nullable android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L9
                android.text.method.TransformationMethod r2 = r1.wrapForEnabled(r2)
                return r2
            L9:
                android.text.method.TransformationMethod r2 = r1.unwrapForDisabled(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(19)
    private static class SkippingHelper19 extends androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal {
        private final androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal19 mHelperDelegate;

        SkippingHelper19(android.widget.TextView r2) {
                r1 = this;
                r1.<init>()
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = new androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19
                r0.<init>(r2)
                r1.mHelperDelegate = r0
                return
        }

        private boolean skipBecauseEmojiCompatNotInitialized() {
                r1 = this;
                boolean r0 = androidx.emoji2.text.EmojiCompat.isConfigured()
                r0 = r0 ^ 1
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @androidx.annotation.NonNull
        android.text.InputFilter[] getFilters(@androidx.annotation.NonNull android.text.InputFilter[] r2) {
                r1 = this;
                boolean r0 = r1.skipBecauseEmojiCompatNotInitialized()
                if (r0 == 0) goto L7
                return r2
            L7:
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                android.text.InputFilter[] r2 = r0.getFilters(r2)
                return r2
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean isEnabled() {
                r1 = this;
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                boolean r0 = r0.isEnabled()
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setAllCaps(boolean r2) {
                r1 = this;
                boolean r0 = r1.skipBecauseEmojiCompatNotInitialized()
                if (r0 == 0) goto L7
                return
            L7:
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                r0.setAllCaps(r2)
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setEnabled(boolean r2) {
                r1 = this;
                boolean r0 = r1.skipBecauseEmojiCompatNotInitialized()
                if (r0 == 0) goto Lc
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                r0.setEnabledUnsafe(r2)
                return
            Lc:
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                r0.setEnabled(r2)
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void updateTransformationMethod() {
                r1 = this;
                boolean r0 = r1.skipBecauseEmojiCompatNotInitialized()
                if (r0 == 0) goto L7
                return
            L7:
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                r0.updateTransformationMethod()
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @androidx.annotation.Nullable
        android.text.method.TransformationMethod wrapTransformationMethod(@androidx.annotation.Nullable android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r1.skipBecauseEmojiCompatNotInitialized()
                if (r0 == 0) goto L7
                return r2
            L7:
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                android.text.method.TransformationMethod r2 = r0.wrapTransformationMethod(r2)
                return r2
        }
    }

    public EmojiTextViewHelper(@androidx.annotation.NonNull android.widget.TextView r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public EmojiTextViewHelper(@androidx.annotation.NonNull android.widget.TextView r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "textView cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r2, r0)
            if (r3 != 0) goto L12
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$SkippingHelper19 r3 = new androidx.emoji2.viewsintegration.EmojiTextViewHelper$SkippingHelper19
            r3.<init>(r2)
            r1.mHelper = r3
            return
        L12:
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r3 = new androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19
            r3.<init>(r2)
            r1.mHelper = r3
            return
    }

    @androidx.annotation.NonNull
    public android.text.InputFilter[] getFilters(@androidx.annotation.NonNull android.text.InputFilter[] r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            android.text.InputFilter[] r2 = r0.getFilters(r2)
            return r2
    }

    public boolean isEnabled() {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            boolean r0 = r0.isEnabled()
            return r0
    }

    public void setAllCaps(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            r0.setAllCaps(r2)
            return
    }

    public void setEnabled(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            r0.setEnabled(r2)
            return
    }

    public void updateTransformationMethod() {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            r0.updateTransformationMethod()
            return
    }

    @androidx.annotation.Nullable
    public android.text.method.TransformationMethod wrapTransformationMethod(@androidx.annotation.Nullable android.text.method.TransformationMethod r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            android.text.method.TransformationMethod r2 = r0.wrapTransformationMethod(r2)
            return r2
    }
}
