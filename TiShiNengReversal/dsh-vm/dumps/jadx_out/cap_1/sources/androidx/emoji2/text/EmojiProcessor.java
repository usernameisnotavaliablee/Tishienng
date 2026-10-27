package androidx.emoji2.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.AnyThread
@androidx.annotation.RequiresApi(19)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;

    @androidx.annotation.Nullable
    private final int[] mEmojiAsDefaultStyleExceptions;

    @androidx.annotation.NonNull
    private androidx.emoji2.text.EmojiCompat.GlyphChecker mGlyphChecker;

    @androidx.annotation.NonNull
    private final androidx.emoji2.text.MetadataRepo mMetadataRepo;

    @androidx.annotation.NonNull
    private final androidx.emoji2.text.EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(19)
    private static final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
                r0 = this;
                r0.<init>()
                return
        }

        static int findIndexBackward(java.lang.CharSequence r5, int r6, int r7) {
                int r0 = r5.length()
                r1 = -1
                if (r6 < 0) goto L3c
                if (r0 >= r6) goto La
                goto L3c
            La:
                if (r7 >= 0) goto Ld
                return r1
            Ld:
                r0 = 0
            Le:
                r2 = 0
            Lf:
                if (r7 != 0) goto L12
                return r6
            L12:
                int r6 = r6 + (-1)
                if (r6 >= 0) goto L1a
                if (r2 == 0) goto L19
                return r1
            L19:
                return r0
            L1a:
                char r3 = r5.charAt(r6)
                if (r2 == 0) goto L2a
                boolean r2 = java.lang.Character.isHighSurrogate(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                int r7 = r7 + (-1)
                goto Le
            L2a:
                boolean r4 = java.lang.Character.isSurrogate(r3)
                if (r4 != 0) goto L33
                int r7 = r7 + (-1)
                goto Lf
            L33:
                boolean r2 = java.lang.Character.isHighSurrogate(r3)
                if (r2 == 0) goto L3a
                return r1
            L3a:
                r2 = 1
                goto Lf
            L3c:
                return r1
        }

        static int findIndexForward(java.lang.CharSequence r6, int r7, int r8) {
                int r0 = r6.length()
                r1 = -1
                if (r7 < 0) goto L40
                if (r0 >= r7) goto La
                goto L40
            La:
                if (r8 >= 0) goto Ld
                return r1
            Ld:
                r2 = 0
            Le:
                r3 = 0
            Lf:
                if (r8 != 0) goto L12
                return r7
            L12:
                if (r7 < r0) goto L18
                if (r3 == 0) goto L17
                return r1
            L17:
                return r0
            L18:
                char r4 = r6.charAt(r7)
                if (r3 == 0) goto L2a
                boolean r3 = java.lang.Character.isLowSurrogate(r4)
                if (r3 != 0) goto L25
                return r1
            L25:
                int r8 = r8 + (-1)
                int r7 = r7 + 1
                goto Le
            L2a:
                boolean r5 = java.lang.Character.isSurrogate(r4)
                if (r5 != 0) goto L35
                int r8 = r8 + (-1)
                int r7 = r7 + 1
                goto Lf
            L35:
                boolean r3 = java.lang.Character.isLowSurrogate(r4)
                if (r3 == 0) goto L3c
                return r1
            L3c:
                int r7 = r7 + 1
                r3 = 1
                goto Lf
            L40:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private androidx.emoji2.text.MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private androidx.emoji2.text.MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final androidx.emoji2.text.MetadataRepo.Node mRootNode;
        private int mState;
        private final boolean mUseEmojiAsDefaultStyle;

        ProcessorSm(androidx.emoji2.text.MetadataRepo.Node r2, boolean r3, int[] r4) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.mState = r0
                r1.mRootNode = r2
                r1.mCurrentNode = r2
                r1.mUseEmojiAsDefaultStyle = r3
                r1.mEmojiAsDefaultStyleExceptions = r4
                return
        }

        private static boolean isEmojiStyle(int r1) {
                r0 = 65039(0xfe0f, float:9.1139E-41)
                if (r1 != r0) goto L7
                r1 = 1
                return r1
            L7:
                r1 = 0
                return r1
        }

        private static boolean isTextStyle(int r1) {
                r0 = 65038(0xfe0e, float:9.1138E-41)
                if (r1 != r0) goto L7
                r1 = 1
                return r1
            L7:
                r1 = 0
                return r1
        }

        private int reset() {
                r2 = this;
                r0 = 1
                r2.mState = r0
                androidx.emoji2.text.MetadataRepo$Node r1 = r2.mRootNode
                r2.mCurrentNode = r1
                r1 = 0
                r2.mCurrentDepth = r1
                return r0
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
                r4 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                boolean r0 = r0.isDefaultEmoji()
                r1 = 1
                if (r0 == 0) goto Le
                return r1
            Le:
                int r0 = r4.mLastCodepoint
                boolean r0 = isEmojiStyle(r0)
                if (r0 == 0) goto L17
                return r1
            L17:
                boolean r0 = r4.mUseEmojiAsDefaultStyle
                r2 = 0
                if (r0 == 0) goto L34
                int[] r0 = r4.mEmojiAsDefaultStyleExceptions
                if (r0 != 0) goto L21
                return r1
            L21:
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                int r0 = r0.getCodepointAt(r2)
                int[] r3 = r4.mEmojiAsDefaultStyleExceptions
                int r0 = java.util.Arrays.binarySearch(r3, r0)
                if (r0 >= 0) goto L34
                return r1
            L34:
                return r2
        }

        int check(int r5) {
                r4 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                androidx.emoji2.text.MetadataRepo$Node r0 = r0.get(r5)
                int r1 = r4.mState
                r2 = 1
                r3 = 2
                if (r1 == r3) goto L1a
                if (r0 != 0) goto L13
                int r3 = r4.reset()
                goto L62
            L13:
                r4.mState = r3
                r4.mCurrentNode = r0
                r4.mCurrentDepth = r2
                goto L62
            L1a:
                if (r0 == 0) goto L24
                r4.mCurrentNode = r0
                int r0 = r4.mCurrentDepth
                int r0 = r0 + r2
                r4.mCurrentDepth = r0
                goto L62
            L24:
                boolean r0 = isTextStyle(r5)
                if (r0 == 0) goto L2f
                int r3 = r4.reset()
                goto L62
            L2f:
                boolean r0 = isEmojiStyle(r5)
                if (r0 == 0) goto L36
                goto L62
            L36:
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                if (r0 == 0) goto L5e
                int r0 = r4.mCurrentDepth
                r3 = 3
                if (r0 != r2) goto L56
                boolean r0 = r4.shouldUseEmojiPresentationStyleForSingleCodepoint()
                if (r0 == 0) goto L51
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                r4.mFlushNode = r0
                r4.reset()
                goto L62
            L51:
                int r3 = r4.reset()
                goto L62
            L56:
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                r4.mFlushNode = r0
                r4.reset()
                goto L62
            L5e:
                int r3 = r4.reset()
            L62:
                r4.mLastCodepoint = r5
                return r3
        }

        androidx.emoji2.text.EmojiMetadata getCurrentMetadata() {
                r1 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r1.mCurrentNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                return r0
        }

        androidx.emoji2.text.EmojiMetadata getFlushMetadata() {
                r1 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r1.mFlushNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                return r0
        }

        boolean isInFlushableState() {
                r2 = this;
                int r0 = r2.mState
                r1 = 2
                if (r0 != r1) goto L19
                androidx.emoji2.text.MetadataRepo$Node r0 = r2.mCurrentNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                if (r0 == 0) goto L19
                int r0 = r2.mCurrentDepth
                r1 = 1
                if (r0 > r1) goto L18
                boolean r0 = r2.shouldUseEmojiPresentationStyleForSingleCodepoint()
                if (r0 == 0) goto L19
            L18:
                return r1
            L19:
                r0 = 0
                return r0
        }
    }

    EmojiProcessor(@androidx.annotation.NonNull androidx.emoji2.text.MetadataRepo r1, @androidx.annotation.NonNull androidx.emoji2.text.EmojiCompat.SpanFactory r2, @androidx.annotation.NonNull androidx.emoji2.text.EmojiCompat.GlyphChecker r3, boolean r4, @androidx.annotation.Nullable int[] r5) {
            r0 = this;
            r0.<init>()
            r0.mSpanFactory = r2
            r0.mMetadataRepo = r1
            r0.mGlyphChecker = r3
            r0.mUseEmojiAsDefaultStyle = r4
            r0.mEmojiAsDefaultStyleExceptions = r5
            return
    }

    private void addEmoji(@androidx.annotation.NonNull android.text.Spannable r2, androidx.emoji2.text.EmojiMetadata r3, int r4, int r5) {
            r1 = this;
            androidx.emoji2.text.EmojiCompat$SpanFactory r0 = r1.mSpanFactory
            androidx.emoji2.text.EmojiSpan r3 = r0.createSpan(r3)
            r0 = 33
            r2.setSpan(r3, r4, r5, r0)
            return
    }

    private static boolean delete(@androidx.annotation.NonNull android.text.Editable r6, @androidx.annotation.NonNull android.view.KeyEvent r7, boolean r8) {
            boolean r7 = hasModifiers(r7)
            r0 = 0
            if (r7 == 0) goto L8
            return r0
        L8:
            int r7 = android.text.Selection.getSelectionStart(r6)
            int r1 = android.text.Selection.getSelectionEnd(r6)
            boolean r2 = hasInvalidSelection(r7, r1)
            if (r2 == 0) goto L17
            return r0
        L17:
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r2 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            androidx.emoji2.text.EmojiSpan[] r1 = (androidx.emoji2.text.EmojiSpan[]) r1
            if (r1 == 0) goto L46
            int r2 = r1.length
            if (r2 <= 0) goto L46
            int r2 = r1.length
            r3 = 0
        L26:
            if (r3 >= r2) goto L46
            r4 = r1[r3]
            int r5 = r6.getSpanStart(r4)
            int r4 = r6.getSpanEnd(r4)
            if (r8 == 0) goto L36
            if (r5 == r7) goto L3e
        L36:
            if (r8 != 0) goto L3a
            if (r4 == r7) goto L3e
        L3a:
            if (r7 <= r5) goto L43
            if (r7 >= r4) goto L43
        L3e:
            r6.delete(r5, r4)
            r6 = 1
            return r6
        L43:
            int r3 = r3 + 1
            goto L26
        L46:
            return r0
    }

    static boolean handleDeleteSurroundingText(@androidx.annotation.NonNull android.view.inputmethod.InputConnection r5, @androidx.annotation.NonNull android.text.Editable r6, @androidx.annotation.IntRange(from = 0) int r7, @androidx.annotation.IntRange(from = 0) int r8, boolean r9) {
            r0 = 0
            if (r6 == 0) goto L7e
            if (r5 != 0) goto L7
            goto L7e
        L7:
            if (r7 < 0) goto L7e
            if (r8 >= 0) goto Lc
            goto L7e
        Lc:
            int r1 = android.text.Selection.getSelectionStart(r6)
            int r2 = android.text.Selection.getSelectionEnd(r6)
            boolean r3 = hasInvalidSelection(r1, r2)
            if (r3 == 0) goto L1b
            return r0
        L1b:
            if (r9 == 0) goto L33
            int r7 = java.lang.Math.max(r7, r0)
            int r7 = androidx.emoji2.text.EmojiProcessor.CodepointIndexFinder.findIndexBackward(r6, r1, r7)
            int r8 = java.lang.Math.max(r8, r0)
            int r8 = androidx.emoji2.text.EmojiProcessor.CodepointIndexFinder.findIndexForward(r6, r2, r8)
            r9 = -1
            if (r7 == r9) goto L32
            if (r8 != r9) goto L41
        L32:
            return r0
        L33:
            int r1 = r1 - r7
            int r7 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r8
            int r8 = r6.length()
            int r8 = java.lang.Math.min(r2, r8)
        L41:
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r9 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r9 = r6.getSpans(r7, r8, r9)
            androidx.emoji2.text.EmojiSpan[] r9 = (androidx.emoji2.text.EmojiSpan[]) r9
            if (r9 == 0) goto L7e
            int r1 = r9.length
            if (r1 <= 0) goto L7e
            int r1 = r9.length
            r2 = 0
        L50:
            if (r2 >= r1) goto L67
            r3 = r9[r2]
            int r4 = r6.getSpanStart(r3)
            int r3 = r6.getSpanEnd(r3)
            int r7 = java.lang.Math.min(r4, r7)
            int r8 = java.lang.Math.max(r3, r8)
            int r2 = r2 + 1
            goto L50
        L67:
            int r7 = java.lang.Math.max(r7, r0)
            int r9 = r6.length()
            int r8 = java.lang.Math.min(r8, r9)
            r5.beginBatchEdit()
            r6.delete(r7, r8)
            r5.endBatchEdit()
            r5 = 1
            return r5
        L7e:
            return r0
    }

    static boolean handleOnKeyDown(@androidx.annotation.NonNull android.text.Editable r3, int r4, @androidx.annotation.NonNull android.view.KeyEvent r5) {
            r0 = 67
            r1 = 1
            r2 = 0
            if (r4 == r0) goto L11
            r0 = 112(0x70, float:1.57E-43)
            if (r4 == r0) goto Lc
            r4 = 0
            goto L15
        Lc:
            boolean r4 = delete(r3, r5, r1)
            goto L15
        L11:
            boolean r4 = delete(r3, r5, r2)
        L15:
            if (r4 == 0) goto L1b
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r3)
            return r1
        L1b:
            return r2
    }

    private boolean hasGlyph(java.lang.CharSequence r3, int r4, int r5, androidx.emoji2.text.EmojiMetadata r6) {
            r2 = this;
            int r0 = r6.getHasGlyph()
            if (r0 != 0) goto L13
            androidx.emoji2.text.EmojiCompat$GlyphChecker r0 = r2.mGlyphChecker
            short r1 = r6.getSdkAdded()
            boolean r3 = r0.hasGlyph(r3, r4, r5, r1)
            r6.setHasGlyph(r3)
        L13:
            int r3 = r6.getHasGlyph()
            r4 = 2
            if (r3 != r4) goto L1c
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    private static boolean hasInvalidSelection(int r1, int r2) {
            r0 = -1
            if (r1 == r0) goto La
            if (r2 == r0) goto La
            if (r1 == r2) goto L8
            goto La
        L8:
            r1 = 0
            return r1
        La:
            r1 = 1
            return r1
    }

    private static boolean hasModifiers(@androidx.annotation.NonNull android.view.KeyEvent r0) {
            int r0 = r0.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            r0 = r0 ^ 1
            return r0
    }

    int getEmojiMatch(@androidx.annotation.NonNull java.lang.CharSequence r2) {
            r1 = this;
            androidx.emoji2.text.MetadataRepo r0 = r1.mMetadataRepo
            int r0 = r0.getMetadataVersion()
            int r2 = r1.getEmojiMatch(r2, r0)
            return r2
    }

    int getEmojiMatch(@androidx.annotation.NonNull java.lang.CharSequence r12, int r13) {
            r11 = this;
            androidx.emoji2.text.EmojiProcessor$ProcessorSm r0 = new androidx.emoji2.text.EmojiProcessor$ProcessorSm
            androidx.emoji2.text.MetadataRepo r1 = r11.mMetadataRepo
            androidx.emoji2.text.MetadataRepo$Node r1 = r1.getRootNode()
            boolean r2 = r11.mUseEmojiAsDefaultStyle
            int[] r3 = r11.mEmojiAsDefaultStyleExceptions
            r0.<init>(r1, r2, r3)
            int r1 = r12.length()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L17:
            r6 = 2
            r7 = 1
            if (r3 >= r1) goto L53
            int r8 = java.lang.Character.codePointAt(r12, r3)
            int r9 = r0.check(r8)
            androidx.emoji2.text.EmojiMetadata r10 = r0.getCurrentMetadata()
            if (r9 == r7) goto L42
            if (r9 == r6) goto L3c
            r6 = 3
            if (r9 == r6) goto L2f
            goto L48
        L2f:
            androidx.emoji2.text.EmojiMetadata r10 = r0.getFlushMetadata()
            short r6 = r10.getCompatAdded()
            if (r6 > r13) goto L48
            int r4 = r4 + 1
            goto L48
        L3c:
            int r6 = java.lang.Character.charCount(r8)
            int r3 = r3 + r6
            goto L48
        L42:
            int r5 = java.lang.Character.charCount(r8)
            int r3 = r3 + r5
            r5 = 0
        L48:
            if (r10 == 0) goto L17
            short r6 = r10.getCompatAdded()
            if (r6 > r13) goto L17
            int r5 = r5 + 1
            goto L17
        L53:
            if (r4 == 0) goto L56
            return r6
        L56:
            boolean r12 = r0.isInFlushableState()
            if (r12 == 0) goto L67
            androidx.emoji2.text.EmojiMetadata r12 = r0.getCurrentMetadata()
            short r12 = r12.getCompatAdded()
            if (r12 > r13) goto L67
            return r7
        L67:
            if (r5 != 0) goto L6a
            return r2
        L6a:
            return r6
    }

    java.lang.CharSequence process(@androidx.annotation.NonNull java.lang.CharSequence r11, @androidx.annotation.IntRange(from = 0) int r12, @androidx.annotation.IntRange(from = 0) int r13, @androidx.annotation.IntRange(from = 0) int r14, boolean r15) {
            r10 = this;
            boolean r0 = r11 instanceof androidx.emoji2.text.SpannableBuilder
            if (r0 == 0) goto La
            r1 = r11
            androidx.emoji2.text.SpannableBuilder r1 = (androidx.emoji2.text.SpannableBuilder) r1
            r1.beginBatchEdit()
        La:
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r1 = androidx.emoji2.text.EmojiSpan.class
            if (r0 != 0) goto L2f
            boolean r2 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L13
            goto L2f
        L13:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2d
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L2a
            int r3 = r12 + (-1)
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch: java.lang.Throwable -> L2a
            if (r2 > r13) goto L2d
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r2 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L2a
            goto L37
        L2a:
            r12 = move-exception
            goto L129
        L2d:
            r2 = 0
            goto L37
        L2f:
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r2 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> L2a
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2a
        L37:
            r3 = 0
            if (r2 == 0) goto L63
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r1)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.EmojiSpan[] r4 = (androidx.emoji2.text.EmojiSpan[]) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L63
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            if (r5 <= 0) goto L63
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            r6 = 0
        L47:
            if (r6 >= r5) goto L63
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L2a
            int r8 = r2.getSpanStart(r7)     // Catch: java.lang.Throwable -> L2a
            int r9 = r2.getSpanEnd(r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 == r13) goto L58
            r2.removeSpan(r7)     // Catch: java.lang.Throwable -> L2a
        L58:
            int r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> L2a
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> L2a
            int r6 = r6 + 1
            goto L47
        L63:
            if (r12 == r13) goto L122
            int r4 = r11.length()     // Catch: java.lang.Throwable -> L2a
            if (r12 < r4) goto L6d
            goto L122
        L6d:
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r4) goto L80
            if (r2 == 0) goto L80
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r1 = r2.getSpans(r3, r4, r1)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.EmojiSpan[] r1 = (androidx.emoji2.text.EmojiSpan[]) r1     // Catch: java.lang.Throwable -> L2a
            int r1 = r1.length     // Catch: java.lang.Throwable -> L2a
            int r14 = r14 - r1
        L80:
            androidx.emoji2.text.EmojiProcessor$ProcessorSm r1 = new androidx.emoji2.text.EmojiProcessor$ProcessorSm     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.MetadataRepo r4 = r10.mMetadataRepo     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.MetadataRepo$Node r4 = r4.getRootNode()     // Catch: java.lang.Throwable -> L2a
            boolean r5 = r10.mUseEmojiAsDefaultStyle     // Catch: java.lang.Throwable -> L2a
            int[] r6 = r10.mEmojiAsDefaultStyleExceptions     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L2a
            int r4 = java.lang.Character.codePointAt(r11, r12)     // Catch: java.lang.Throwable -> L2a
            r3 = r2
            r5 = r4
            r4 = 0
        L96:
            r2 = r12
        L97:
            if (r12 >= r13) goto Le9
            if (r4 >= r14) goto Le9
            int r6 = r1.check(r5)     // Catch: java.lang.Throwable -> L2a
            r7 = 1
            if (r6 == r7) goto Ld7
            r7 = 2
            if (r6 == r7) goto Lcb
            r7 = 3
            if (r6 == r7) goto La9
            goto L97
        La9:
            if (r15 != 0) goto Lb5
            androidx.emoji2.text.EmojiMetadata r6 = r1.getFlushMetadata()     // Catch: java.lang.Throwable -> L2a
            boolean r6 = r10.hasGlyph(r11, r2, r12, r6)     // Catch: java.lang.Throwable -> L2a
            if (r6 != 0) goto L96
        Lb5:
            if (r3 != 0) goto Lc1
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r3 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> L2a
            android.text.SpannableString r6 = new android.text.SpannableString     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r11)     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L2a
        Lc1:
            androidx.emoji2.text.EmojiMetadata r6 = r1.getFlushMetadata()     // Catch: java.lang.Throwable -> L2a
            r10.addEmoji(r3, r6, r2, r12)     // Catch: java.lang.Throwable -> L2a
            int r4 = r4 + 1
            goto L96
        Lcb:
            int r6 = java.lang.Character.charCount(r5)     // Catch: java.lang.Throwable -> L2a
            int r12 = r12 + r6
            if (r12 >= r13) goto L97
            int r5 = java.lang.Character.codePointAt(r11, r12)     // Catch: java.lang.Throwable -> L2a
            goto L97
        Ld7:
            int r12 = java.lang.Character.codePointAt(r11, r2)     // Catch: java.lang.Throwable -> L2a
            int r12 = java.lang.Character.charCount(r12)     // Catch: java.lang.Throwable -> L2a
            int r2 = r2 + r12
            if (r2 >= r13) goto Le7
            int r12 = java.lang.Character.codePointAt(r11, r2)     // Catch: java.lang.Throwable -> L2a
            r5 = r12
        Le7:
            r12 = r2
            goto L97
        Le9:
            boolean r13 = r1.isInFlushableState()     // Catch: java.lang.Throwable -> L2a
            if (r13 == 0) goto L10b
            if (r4 >= r14) goto L10b
            if (r15 != 0) goto Lfd
            androidx.emoji2.text.EmojiMetadata r13 = r1.getCurrentMetadata()     // Catch: java.lang.Throwable -> L2a
            boolean r13 = r10.hasGlyph(r11, r2, r12, r13)     // Catch: java.lang.Throwable -> L2a
            if (r13 != 0) goto L10b
        Lfd:
            if (r3 != 0) goto L104
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r3 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L2a
        L104:
            androidx.emoji2.text.EmojiMetadata r13 = r1.getCurrentMetadata()     // Catch: java.lang.Throwable -> L2a
            r10.addEmoji(r3, r13, r2, r12)     // Catch: java.lang.Throwable -> L2a
        L10b:
            if (r3 == 0) goto L119
            android.text.Spannable r12 = r3.getUnwrappedSpannable()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L118
            androidx.emoji2.text.SpannableBuilder r11 = (androidx.emoji2.text.SpannableBuilder) r11
            r11.endBatchEdit()
        L118:
            return r12
        L119:
            if (r0 == 0) goto L121
            r12 = r11
            androidx.emoji2.text.SpannableBuilder r12 = (androidx.emoji2.text.SpannableBuilder) r12
        L11e:
            r12.endBatchEdit()
        L121:
            return r11
        L122:
            if (r0 == 0) goto L128
            r12 = r11
            androidx.emoji2.text.SpannableBuilder r12 = (androidx.emoji2.text.SpannableBuilder) r12
            goto L11e
        L128:
            return r11
        L129:
            if (r0 == 0) goto L130
            androidx.emoji2.text.SpannableBuilder r11 = (androidx.emoji2.text.SpannableBuilder) r11
            r11.endBatchEdit()
        L130:
            throw r12
    }
}
