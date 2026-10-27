package com.google.android.material.chip;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Chip extends androidx.appcompat.widget.AppCompatCheckBox implements com.google.android.material.chip.ChipDrawable.Delegate, com.google.android.material.shape.Shapeable, com.google.android.material.internal.MaterialCheckable<com.google.android.material.chip.Chip> {
    private static final java.lang.String BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.Button";
    private static final int[] CHECKABLE_STATE_SET = null;
    private static final int CHIP_BODY_VIRTUAL_ID = 0;
    private static final int CLOSE_ICON_VIRTUAL_ID = 1;
    private static final int DEF_STYLE_RES = 0;
    private static final android.graphics.Rect EMPTY_BOUNDS = null;
    private static final java.lang.String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final java.lang.String NAMESPACE_ANDROID = "http://schemas.android.com/apk/res/android";
    private static final java.lang.String RADIO_BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.RadioButton";
    private static final int[] SELECTED_STATE = null;
    private static final java.lang.String TAG = "Chip";

    @androidx.annotation.Nullable
    private java.lang.CharSequence accessibilityClassName;

    @androidx.annotation.Nullable
    private com.google.android.material.chip.ChipDrawable chipDrawable;
    private boolean closeIconFocused;
    private boolean closeIconHovered;
    private boolean closeIconPressed;
    private boolean deferredCheckedValue;
    private boolean ensureMinTouchTargetSize;
    private final com.google.android.material.resources.TextAppearanceFontCallback fontCallback;

    @androidx.annotation.Nullable
    private android.graphics.drawable.InsetDrawable insetBackgroundDrawable;
    private int lastLayoutDirection;

    @androidx.annotation.Dimension(unit = 1)
    private int minTouchTargetSize;

    @androidx.annotation.Nullable
    private android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener;

    @androidx.annotation.Nullable
    private com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener<com.google.android.material.chip.Chip> onCheckedChangeListenerInternal;

    @androidx.annotation.Nullable
    private android.view.View.OnClickListener onCloseIconClickListener;
    private final android.graphics.Rect rect;
    private final android.graphics.RectF rectF;

    @androidx.annotation.Nullable
    private android.graphics.drawable.RippleDrawable ripple;

    @androidx.annotation.NonNull
    private final com.google.android.material.chip.Chip.ChipTouchHelper touchHelper;
    private boolean touchHelperEnabled;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class ChipTouchHelper extends androidx.customview.widget.ExploreByTouchHelper {
        final /* synthetic */ com.google.android.material.chip.Chip this$0;

        ChipTouchHelper(com.google.android.material.chip.Chip r1, com.google.android.material.chip.Chip r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        protected int getVirtualViewAt(float r2, float r3) {
                r1 = this;
                com.google.android.material.chip.Chip r0 = r1.this$0
                boolean r0 = com.google.android.material.chip.Chip.access$100(r0)
                if (r0 == 0) goto L16
                com.google.android.material.chip.Chip r0 = r1.this$0
                android.graphics.RectF r0 = com.google.android.material.chip.Chip.access$200(r0)
                boolean r2 = r0.contains(r2, r3)
                if (r2 == 0) goto L16
                r2 = 1
                return r2
            L16:
                r2 = 0
                return r2
        }

        protected void getVisibleVirtualViews(@androidx.annotation.NonNull java.util.List<java.lang.Integer> r2) {
                r1 = this;
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.add(r0)
                com.google.android.material.chip.Chip r0 = r1.this$0
                boolean r0 = com.google.android.material.chip.Chip.access$100(r0)
                if (r0 == 0) goto L28
                com.google.android.material.chip.Chip r0 = r1.this$0
                boolean r0 = r0.isCloseIconVisible()
                if (r0 == 0) goto L28
                com.google.android.material.chip.Chip r0 = r1.this$0
                android.view.View$OnClickListener r0 = com.google.android.material.chip.Chip.access$300(r0)
                if (r0 == 0) goto L28
                r0 = 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.add(r0)
            L28:
                return
        }

        protected boolean onPerformActionForVirtualView(int r1, int r2, android.os.Bundle r3) {
                r0 = this;
                r3 = 16
                if (r2 != r3) goto L17
                if (r1 != 0) goto Ld
                com.google.android.material.chip.Chip r1 = r0.this$0
                boolean r1 = r1.performClick()
                return r1
            Ld:
                r2 = 1
                if (r1 != r2) goto L17
                com.google.android.material.chip.Chip r1 = r0.this$0
                boolean r1 = r1.performCloseIconClick()
                return r1
            L17:
                r1 = 0
                return r1
        }

        protected void onPopulateNodeForHost(@androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4) {
                r3 = this;
                com.google.android.material.chip.Chip r0 = r3.this$0
                boolean r0 = r0.isCheckable()
                r4.setCheckable(r0)
                com.google.android.material.chip.Chip r0 = r3.this$0
                boolean r0 = r0.isClickable()
                r4.setClickable(r0)
                com.google.android.material.chip.Chip r0 = r3.this$0
                java.lang.CharSequence r0 = r0.getAccessibilityClassName()
                r4.setClassName(r0)
                com.google.android.material.chip.Chip r0 = r3.this$0
                java.lang.CharSequence r0 = r0.getText()
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 23
                if (r1 < r2) goto L2b
                r4.setText(r0)
                return
            L2b:
                r4.setContentDescription(r0)
                return
        }

        protected void onPopulateNodeForVirtualView(int r6, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r7) {
                r5 = this;
                java.lang.String r0 = ""
                r1 = 1
                if (r6 != r1) goto L4e
                com.google.android.material.chip.Chip r6 = r5.this$0
                java.lang.CharSequence r6 = r6.getCloseIconContentDescription()
                if (r6 == 0) goto L11
                r7.setContentDescription(r6)
                goto L36
            L11:
                com.google.android.material.chip.Chip r6 = r5.this$0
                java.lang.CharSequence r6 = r6.getText()
                com.google.android.material.chip.Chip r2 = r5.this$0
                android.content.Context r2 = r2.getContext()
                int r3 = com.google.android.material.R.string.mtrl_chip_close_icon_content_description
                boolean r4 = android.text.TextUtils.isEmpty(r6)
                if (r4 != 0) goto L26
                r0 = r6
            L26:
                java.lang.Object[] r6 = new java.lang.Object[r1]
                r1 = 0
                r6[r1] = r0
                java.lang.String r6 = r2.getString(r3, r6)
                java.lang.String r6 = r6.trim()
                r7.setContentDescription(r6)
            L36:
                com.google.android.material.chip.Chip r6 = r5.this$0
                android.graphics.Rect r6 = com.google.android.material.chip.Chip.access$500(r6)
                r7.setBoundsInParent(r6)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r6 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK
                r7.addAction(r6)
                com.google.android.material.chip.Chip r6 = r5.this$0
                boolean r6 = r6.isEnabled()
                r7.setEnabled(r6)
                return
            L4e:
                r7.setContentDescription(r0)
                android.graphics.Rect r6 = com.google.android.material.chip.Chip.access$600()
                r7.setBoundsInParent(r6)
                return
        }

        protected void onVirtualViewKeyboardFocusChanged(int r2, boolean r3) {
                r1 = this;
                r0 = 1
                if (r2 != r0) goto Ld
                com.google.android.material.chip.Chip r2 = r1.this$0
                com.google.android.material.chip.Chip.access$402(r2, r3)
                com.google.android.material.chip.Chip r2 = r1.this$0
                r2.refreshDrawableState()
            Ld:
                return
        }
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_Chip_Action
            com.google.android.material.chip.Chip.DEF_STYLE_RES = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.google.android.material.chip.Chip.EMPTY_BOUNDS = r0
            r0 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.chip.Chip.SELECTED_STATE = r0
            r0 = 16842911(0x101009f, float:2.3694004E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.chip.Chip.CHECKABLE_STATE_SET = r0
            return
    }

    public Chip(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Chip(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.chipStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
            r6 = this;
            int r4 = com.google.android.material.chip.Chip.DEF_STYLE_RES
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.rect = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.rectF = r7
            com.google.android.material.chip.Chip$1 r7 = new com.google.android.material.chip.Chip$1
            r7.<init>(r6)
            r6.fontCallback = r7
            android.content.Context r0 = r6.getContext()
            r6.validateAttributes(r8)
            com.google.android.material.chip.ChipDrawable r7 = com.google.android.material.chip.ChipDrawable.createFromAttributes(r0, r8, r9, r4)
            r6.initMinTouchTarget(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = androidx.core.view.ViewCompat.getElevation(r6)
            r7.setElevation(r1)
            int[] r2 = com.google.android.material.R.styleable.Chip
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r9 >= r1) goto L50
            int r9 = com.google.android.material.R.styleable.Chip_android_textColor
            android.content.res.ColorStateList r9 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r8, r9)
            r6.setTextColor(r9)
        L50:
            int r9 = com.google.android.material.R.styleable.Chip_shapeAppearance
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$ChipTouchHelper r8 = new com.google.android.material.chip.Chip$ChipTouchHelper
            r8.<init>(r6, r6)
            r6.touchHelper = r8
            r6.updateAccessibilityDelegate()
            if (r9 != 0) goto L68
            r6.initOutlineProvider()
        L68:
            boolean r8 = r6.deferredCheckedValue
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.getText()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.getEllipsize()
            r6.setEllipsize(r7)
            r6.updateTextPaintDrawState()
            com.google.android.material.chip.ChipDrawable r7 = r6.chipDrawable
            boolean r7 = r7.shouldDrawText()
            if (r7 != 0) goto L8d
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L8d:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.updatePaddingInternal()
            boolean r7 = r6.shouldEnsureMinTouchTargetSize()
            if (r7 == 0) goto La1
            int r7 = r6.minTouchTargetSize
            r6.setMinHeight(r7)
        La1:
            int r7 = androidx.core.view.ViewCompat.getLayoutDirection(r6)
            r6.lastLayoutDirection = r7
            com.google.android.material.chip.b r7 = new com.google.android.material.chip.b
            r7.<init>(r6)
            super/*android.widget.CheckBox*/.setOnCheckedChangeListener(r7)
            return
    }

    public static /* synthetic */ void a(com.google.android.material.chip.Chip r1, android.widget.CompoundButton r2, boolean r3) {
            com.google.android.material.internal.MaterialCheckable$OnCheckedChangeListener<com.google.android.material.chip.Chip> r0 = r1.onCheckedChangeListenerInternal
            if (r0 == 0) goto L7
            r0.onCheckedChanged(r1, r3)
        L7:
            android.widget.CompoundButton$OnCheckedChangeListener r1 = r1.onCheckedChangeListener
            if (r1 == 0) goto Le
            r1.onCheckedChanged(r2, r3)
        Le:
            return
    }

    static /* synthetic */ com.google.android.material.chip.ChipDrawable access$000(com.google.android.material.chip.Chip r0) {
            com.google.android.material.chip.ChipDrawable r0 = r0.chipDrawable
            return r0
    }

    static /* synthetic */ boolean access$100(com.google.android.material.chip.Chip r0) {
            boolean r0 = r0.hasCloseIcon()
            return r0
    }

    static /* synthetic */ android.graphics.RectF access$200(com.google.android.material.chip.Chip r0) {
            android.graphics.RectF r0 = r0.getCloseIconTouchBounds()
            return r0
    }

    static /* synthetic */ android.view.View.OnClickListener access$300(com.google.android.material.chip.Chip r0) {
            android.view.View$OnClickListener r0 = r0.onCloseIconClickListener
            return r0
    }

    static /* synthetic */ boolean access$402(com.google.android.material.chip.Chip r0, boolean r1) {
            r0.closeIconFocused = r1
            return r1
    }

    static /* synthetic */ android.graphics.Rect access$500(com.google.android.material.chip.Chip r0) {
            android.graphics.Rect r0 = r0.getCloseIconTouchBoundsInt()
            return r0
    }

    static /* synthetic */ android.graphics.Rect access$600() {
            android.graphics.Rect r0 = com.google.android.material.chip.Chip.EMPTY_BOUNDS
            return r0
    }

    private void applyChipDrawable(@androidx.annotation.NonNull com.google.android.material.chip.ChipDrawable r1) {
            r0 = this;
            r1.setDelegate(r0)
            return
    }

    @androidx.annotation.NonNull
    private int[] createCloseIconDrawableState() {
            r3 = this;
            boolean r0 = r3.isEnabled()
            boolean r1 = r3.closeIconFocused
            if (r1 == 0) goto La
            int r0 = r0 + 1
        La:
            boolean r1 = r3.closeIconHovered
            if (r1 == 0) goto L10
            int r0 = r0 + 1
        L10:
            boolean r1 = r3.closeIconPressed
            if (r1 == 0) goto L16
            int r0 = r0 + 1
        L16:
            boolean r1 = r3.isChecked()
            if (r1 == 0) goto L1e
            int r0 = r0 + 1
        L1e:
            int[] r0 = new int[r0]
            boolean r1 = r3.isEnabled()
            r2 = 0
            if (r1 == 0) goto L2d
            r1 = 16842910(0x101009e, float:2.3694E-38)
            r0[r2] = r1
            r2 = 1
        L2d:
            boolean r1 = r3.closeIconFocused
            if (r1 == 0) goto L38
            r1 = 16842908(0x101009c, float:2.3693995E-38)
            r0[r2] = r1
            int r2 = r2 + 1
        L38:
            boolean r1 = r3.closeIconHovered
            if (r1 == 0) goto L43
            r1 = 16843623(0x1010367, float:2.3696E-38)
            r0[r2] = r1
            int r2 = r2 + 1
        L43:
            boolean r1 = r3.closeIconPressed
            if (r1 == 0) goto L4e
            r1 = 16842919(0x10100a7, float:2.3694026E-38)
            r0[r2] = r1
            int r2 = r2 + 1
        L4e:
            boolean r1 = r3.isChecked()
            if (r1 == 0) goto L59
            r1 = 16842913(0x10100a1, float:2.369401E-38)
            r0[r2] = r1
        L59:
            return r0
    }

    private void ensureChipDrawableHasCallback() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getBackgroundDrawable()
            android.graphics.drawable.InsetDrawable r1 = r2.insetBackgroundDrawable
            if (r0 != r1) goto L17
            com.google.android.material.chip.ChipDrawable r0 = r2.chipDrawable
            android.graphics.drawable.Drawable$Callback r0 = r0.getCallback()
            if (r0 != 0) goto L17
            com.google.android.material.chip.ChipDrawable r0 = r2.chipDrawable
            android.graphics.drawable.InsetDrawable r1 = r2.insetBackgroundDrawable
            r0.setCallback(r1)
        L17:
            return
    }

    @androidx.annotation.NonNull
    private android.graphics.RectF getCloseIconTouchBounds() {
            r2 = this;
            android.graphics.RectF r0 = r2.rectF
            r0.setEmpty()
            boolean r0 = r2.hasCloseIcon()
            if (r0 == 0) goto L16
            android.view.View$OnClickListener r0 = r2.onCloseIconClickListener
            if (r0 == 0) goto L16
            com.google.android.material.chip.ChipDrawable r0 = r2.chipDrawable
            android.graphics.RectF r1 = r2.rectF
            r0.getCloseIconTouchBounds(r1)
        L16:
            android.graphics.RectF r0 = r2.rectF
            return r0
    }

    @androidx.annotation.NonNull
    private android.graphics.Rect getCloseIconTouchBoundsInt() {
            r5 = this;
            android.graphics.RectF r0 = r5.getCloseIconTouchBounds()
            android.graphics.Rect r1 = r5.rect
            float r2 = r0.left
            int r2 = (int) r2
            float r3 = r0.top
            int r3 = (int) r3
            float r4 = r0.right
            int r4 = (int) r4
            float r0 = r0.bottom
            int r0 = (int) r0
            r1.set(r2, r3, r4, r0)
            android.graphics.Rect r0 = r5.rect
            return r0
    }

    @androidx.annotation.Nullable
    private com.google.android.material.resources.TextAppearance getTextAppearance() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            com.google.android.material.resources.TextAppearance r0 = r0.getTextAppearance()
            return r0
        L9:
            r0 = 0
            return r0
    }

    private boolean hasCloseIcon() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto Lc
            android.graphics.drawable.Drawable r0 = r0.getCloseIcon()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private void initMinTouchTarget(android.content.Context r8, @androidx.annotation.Nullable android.util.AttributeSet r9, int r10) {
            r7 = this;
            int[] r2 = com.google.android.material.R.styleable.Chip
            int r4 = com.google.android.material.chip.Chip.DEF_STYLE_RES
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.Chip_ensureMinTouchTargetSize
            boolean r9 = r8.getBoolean(r9, r6)
            r7.ensureMinTouchTargetSize = r9
            android.content.Context r9 = r7.getContext()
            r10 = 48
            float r9 = com.google.android.material.internal.ViewUtils.dpToPx(r9, r10)
            double r9 = (double) r9
            double r9 = java.lang.Math.ceil(r9)
            float r9 = (float) r9
            int r10 = com.google.android.material.R.styleable.Chip_chipMinTouchTargetSize
            float r9 = r8.getDimension(r10, r9)
            double r9 = (double) r9
            double r9 = java.lang.Math.ceil(r9)
            int r9 = (int) r9
            r7.minTouchTargetSize = r9
            r8.recycle()
            return
    }

    private void initOutlineProvider() {
            r1 = this;
            com.google.android.material.chip.Chip$2 r0 = new com.google.android.material.chip.Chip$2
            r0.<init>(r1)
            r1.setOutlineProvider(r0)
            return
    }

    private void insetChipBackgroundDrawable(int r7, int r8, int r9, int r10) {
            r6 = this;
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            com.google.android.material.chip.ChipDrawable r1 = r6.chipDrawable
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.insetBackgroundDrawable = r0
            return
    }

    private void removeBackgroundInset() {
            r1 = this;
            android.graphics.drawable.InsetDrawable r0 = r1.insetBackgroundDrawable
            if (r0 == 0) goto L16
            r0 = 0
            r1.insetBackgroundDrawable = r0
            r0 = 0
            r1.setMinWidth(r0)
            float r0 = r1.getChipMinHeight()
            int r0 = (int) r0
            r1.setMinHeight(r0)
            r1.updateBackgroundDrawable()
        L16:
            return
    }

    private void setCloseIconHovered(boolean r2) {
            r1 = this;
            boolean r0 = r1.closeIconHovered
            if (r0 == r2) goto L9
            r1.closeIconHovered = r2
            r1.refreshDrawableState()
        L9:
            return
    }

    private void setCloseIconPressed(boolean r2) {
            r1 = this;
            boolean r0 = r1.closeIconPressed
            if (r0 == r2) goto L9
            r1.closeIconPressed = r2
            r1.refreshDrawableState()
        L9:
            return
    }

    private void unapplyChipDrawable(@androidx.annotation.Nullable com.google.android.material.chip.ChipDrawable r2) {
            r1 = this;
            if (r2 == 0) goto L6
            r0 = 0
            r2.setDelegate(r0)
        L6:
            return
    }

    private void updateAccessibilityDelegate() {
            r1 = this;
            boolean r0 = r1.hasCloseIcon()
            if (r0 == 0) goto L19
            boolean r0 = r1.isCloseIconVisible()
            if (r0 == 0) goto L19
            android.view.View$OnClickListener r0 = r1.onCloseIconClickListener
            if (r0 == 0) goto L19
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r1.touchHelper
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r1, r0)
            r0 = 1
            r1.touchHelperEnabled = r0
            return
        L19:
            r0 = 0
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r1, r0)
            r0 = 0
            r1.touchHelperEnabled = r0
            return
    }

    private void updateBackgroundDrawable() {
            r2 = this;
            boolean r0 = com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE
            if (r0 == 0) goto L8
            r2.updateFrameworkRippleBackground()
            return
        L8:
            com.google.android.material.chip.ChipDrawable r0 = r2.chipDrawable
            r1 = 1
            r0.setUseCompatRipple(r1)
            android.graphics.drawable.Drawable r0 = r2.getBackgroundDrawable()
            androidx.core.view.ViewCompat.setBackground(r2, r0)
            r2.updatePaddingInternal()
            r2.ensureChipDrawableHasCallback()
            return
    }

    private void updateFrameworkRippleBackground() {
            r4 = this;
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            com.google.android.material.chip.ChipDrawable r1 = r4.chipDrawable
            android.content.res.ColorStateList r1 = r1.getRippleColor()
            android.content.res.ColorStateList r1 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r1)
            android.graphics.drawable.Drawable r2 = r4.getBackgroundDrawable()
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.ripple = r0
            com.google.android.material.chip.ChipDrawable r0 = r4.chipDrawable
            r1 = 0
            r0.setUseCompatRipple(r1)
            android.graphics.drawable.RippleDrawable r0 = r4.ripple
            androidx.core.view.ViewCompat.setBackground(r4, r0)
            r4.updatePaddingInternal()
            return
    }

    private void updatePaddingInternal() {
            r4 = this;
            java.lang.CharSequence r0 = r4.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L56
            com.google.android.material.chip.ChipDrawable r0 = r4.chipDrawable
            if (r0 != 0) goto Lf
            goto L56
        Lf:
            float r0 = r0.getChipEndPadding()
            com.google.android.material.chip.ChipDrawable r1 = r4.chipDrawable
            float r1 = r1.getTextEndPadding()
            float r0 = r0 + r1
            com.google.android.material.chip.ChipDrawable r1 = r4.chipDrawable
            float r1 = r1.calculateCloseIconWidth()
            float r0 = r0 + r1
            int r0 = (int) r0
            com.google.android.material.chip.ChipDrawable r1 = r4.chipDrawable
            float r1 = r1.getChipStartPadding()
            com.google.android.material.chip.ChipDrawable r2 = r4.chipDrawable
            float r2 = r2.getTextStartPadding()
            float r1 = r1 + r2
            com.google.android.material.chip.ChipDrawable r2 = r4.chipDrawable
            float r2 = r2.calculateChipIconWidth()
            float r1 = r1 + r2
            int r1 = (int) r1
            android.graphics.drawable.InsetDrawable r2 = r4.insetBackgroundDrawable
            if (r2 == 0) goto L4b
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.drawable.InsetDrawable r3 = r4.insetBackgroundDrawable
            r3.getPadding(r2)
            int r3 = r2.left
            int r1 = r1 + r3
            int r2 = r2.right
            int r0 = r0 + r2
        L4b:
            int r2 = r4.getPaddingTop()
            int r3 = r4.getPaddingBottom()
            androidx.core.view.ViewCompat.setPaddingRelative(r4, r1, r2, r0, r3)
        L56:
            return
    }

    private void updateTextPaintDrawState() {
            r4 = this;
            android.text.TextPaint r0 = r4.getPaint()
            com.google.android.material.chip.ChipDrawable r1 = r4.chipDrawable
            if (r1 == 0) goto Le
            int[] r1 = r1.getState()
            r0.drawableState = r1
        Le:
            com.google.android.material.resources.TextAppearance r1 = r4.getTextAppearance()
            if (r1 == 0) goto L1d
            android.content.Context r2 = r4.getContext()
            com.google.android.material.resources.TextAppearanceFontCallback r3 = r4.fontCallback
            r1.updateDrawState(r2, r0, r3)
        L1d:
            return
    }

    private void validateAttributes(@androidx.annotation.Nullable android.util.AttributeSet r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "background"
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            r4.getAttributeValue(r1, r0)
            java.lang.String r0 = "drawableLeft"
            java.lang.String r0 = r4.getAttributeValue(r1, r0)
            if (r0 != 0) goto L72
            java.lang.String r0 = "drawableStart"
            java.lang.String r0 = r4.getAttributeValue(r1, r0)
            if (r0 != 0) goto L6a
            java.lang.String r0 = "drawableEnd"
            java.lang.String r0 = r4.getAttributeValue(r1, r0)
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            if (r0 != 0) goto L64
            java.lang.String r0 = "drawableRight"
            java.lang.String r0 = r4.getAttributeValue(r1, r0)
            if (r0 != 0) goto L5e
            java.lang.String r0 = "singleLine"
            r2 = 1
            boolean r0 = r4.getAttributeBooleanValue(r1, r0, r2)
            if (r0 == 0) goto L56
            java.lang.String r0 = "lines"
            int r0 = r4.getAttributeIntValue(r1, r0, r2)
            if (r0 != r2) goto L56
            java.lang.String r0 = "minLines"
            int r0 = r4.getAttributeIntValue(r1, r0, r2)
            if (r0 != r2) goto L56
            java.lang.String r0 = "maxLines"
            int r0 = r4.getAttributeIntValue(r1, r0, r2)
            if (r0 != r2) goto L56
            java.lang.String r0 = "gravity"
            r2 = 8388627(0x800013, float:1.175497E-38)
            r4.getAttributeIntValue(r1, r0, r2)
            return
        L56:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r4.<init>(r0)
            throw r4
        L5e:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>(r2)
            throw r4
        L64:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>(r2)
            throw r4
        L6a:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Please set start drawable using R.attr#chipIcon."
            r4.<init>(r0)
            throw r4
        L72:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Please set left drawable using R.attr#chipIcon."
            r4.<init>(r0)
            throw r4
    }

    protected boolean dispatchHoverEvent(@androidx.annotation.NonNull android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.touchHelperEnabled
            if (r0 != 0) goto L9
            boolean r2 = super/*android.widget.CheckBox*/.dispatchHoverEvent(r2)
            return r2
        L9:
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r1.touchHelper
            boolean r0 = r0.dispatchHoverEvent(r2)
            if (r0 != 0) goto L1a
            boolean r2 = super/*android.widget.CheckBox*/.dispatchHoverEvent(r2)
            if (r2 == 0) goto L18
            goto L1a
        L18:
            r2 = 0
            return r2
        L1a:
            r2 = 1
            return r2
    }

    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            boolean r0 = r2.touchHelperEnabled
            if (r0 != 0) goto L9
            boolean r3 = super/*android.widget.CheckBox*/.dispatchKeyEvent(r3)
            return r3
        L9:
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r2.touchHelper
            boolean r0 = r0.dispatchKeyEvent(r3)
            if (r0 == 0) goto L1d
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r2.touchHelper
            int r0 = r0.getKeyboardFocusedVirtualViewId()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L1d
            r3 = 1
            return r3
        L1d:
            boolean r3 = super/*android.widget.CheckBox*/.dispatchKeyEvent(r3)
            return r3
    }

    protected void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            com.google.android.material.chip.ChipDrawable r0 = r2.chipDrawable
            if (r0 == 0) goto L18
            boolean r0 = r0.isCloseIconStateful()
            if (r0 == 0) goto L18
            com.google.android.material.chip.ChipDrawable r0 = r2.chipDrawable
            int[] r1 = r2.createCloseIconDrawableState()
            boolean r0 = r0.setCloseIconState(r1)
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L1e
            r2.invalidate()
        L1e:
            return
    }

    public boolean ensureAccessibleTouchTarget(@androidx.annotation.Dimension int r6) {
            r5 = this;
            r5.minTouchTargetSize = r6
            boolean r0 = r5.shouldEnsureMinTouchTargetSize()
            r1 = 0
            if (r0 != 0) goto L15
            android.graphics.drawable.InsetDrawable r6 = r5.insetBackgroundDrawable
            if (r6 == 0) goto L11
            r5.removeBackgroundInset()
            goto L14
        L11:
            r5.updateBackgroundDrawable()
        L14:
            return r1
        L15:
            com.google.android.material.chip.ChipDrawable r0 = r5.chipDrawable
            int r0 = r0.getIntrinsicHeight()
            int r0 = r6 - r0
            int r0 = java.lang.Math.max(r1, r0)
            com.google.android.material.chip.ChipDrawable r2 = r5.chipDrawable
            int r2 = r2.getIntrinsicWidth()
            int r2 = r6 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L3d
            if (r0 > 0) goto L3d
            android.graphics.drawable.InsetDrawable r6 = r5.insetBackgroundDrawable
            if (r6 == 0) goto L39
            r5.removeBackgroundInset()
            goto L3c
        L39:
            r5.updateBackgroundDrawable()
        L3c:
            return r1
        L3d:
            if (r2 <= 0) goto L42
            int r2 = r2 / 2
            goto L43
        L42:
            r2 = 0
        L43:
            if (r0 <= 0) goto L47
            int r1 = r0 / 2
        L47:
            android.graphics.drawable.InsetDrawable r0 = r5.insetBackgroundDrawable
            r3 = 1
            if (r0 == 0) goto L6a
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r4 = r5.insetBackgroundDrawable
            r4.getPadding(r0)
            int r4 = r0.top
            if (r4 != r1) goto L6a
            int r4 = r0.bottom
            if (r4 != r1) goto L6a
            int r4 = r0.left
            if (r4 != r2) goto L6a
            int r0 = r0.right
            if (r0 != r2) goto L6a
            r5.updateBackgroundDrawable()
            return r3
        L6a:
            int r0 = r5.getMinHeight()
            if (r0 == r6) goto L73
            r5.setMinHeight(r6)
        L73:
            int r0 = r5.getMinWidth()
            if (r0 == r6) goto L7c
            r5.setMinWidth(r6)
        L7c:
            r5.insetChipBackgroundDrawable(r2, r1, r2, r1)
            r5.updateBackgroundDrawable()
            return r3
    }

    @androidx.annotation.NonNull
    public java.lang.CharSequence getAccessibilityClassName() {
            r3 = this;
            java.lang.CharSequence r0 = r3.accessibilityClassName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.CharSequence r0 = r3.accessibilityClassName
            return r0
        Lb:
            boolean r0 = r3.isCheckable()
            java.lang.String r1 = "android.widget.Button"
            if (r0 == 0) goto L27
            android.view.ViewParent r0 = r3.getParent()
            boolean r2 = r0 instanceof com.google.android.material.chip.ChipGroup
            if (r2 == 0) goto L26
            com.google.android.material.chip.ChipGroup r0 = (com.google.android.material.chip.ChipGroup) r0
            boolean r0 = r0.isSingleSelection()
            if (r0 == 0) goto L26
            java.lang.String r0 = "android.widget.RadioButton"
            return r0
        L26:
            return r1
        L27:
            boolean r0 = r3.isClickable()
            if (r0 == 0) goto L2e
            return r1
        L2e:
            java.lang.String r0 = "android.view.View"
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getBackgroundDrawable() {
            r1 = this;
            android.graphics.drawable.InsetDrawable r0 = r1.insetBackgroundDrawable
            if (r0 != 0) goto L6
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
        L6:
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getCheckedIcon() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getCheckedIcon()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getCheckedIconTint() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getCheckedIconTint()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getChipBackgroundColor() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getChipBackgroundColor()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public float getChipCornerRadius() {
            r2 = this;
            com.google.android.material.chip.ChipDrawable r0 = r2.chipDrawable
            r1 = 0
            if (r0 == 0) goto Le
            float r0 = r0.getChipCornerRadius()
            float r0 = java.lang.Math.max(r1, r0)
            return r0
        Le:
            return r1
    }

    public android.graphics.drawable.Drawable getChipDrawable() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            return r0
    }

    public float getChipEndPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getChipEndPadding()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getChipIcon() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getChipIcon()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public float getChipIconSize() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getChipIconSize()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getChipIconTint() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getChipIconTint()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public float getChipMinHeight() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getChipMinHeight()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public float getChipStartPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getChipStartPadding()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getChipStrokeColor() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getChipStrokeColor()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public float getChipStrokeWidth() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getChipStrokeWidth()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getChipText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getText()
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getCloseIcon() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getCloseIcon()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getCloseIconContentDescription() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getCloseIconContentDescription()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public float getCloseIconEndPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getCloseIconEndPadding()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public float getCloseIconSize() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getCloseIconSize()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public float getCloseIconStartPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getCloseIconStartPadding()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getCloseIconTint() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getCloseIconTint()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public android.text.TextUtils.TruncateAt getEllipsize() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.text.TextUtils$TruncateAt r0 = r0.getEllipsize()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void getFocusedRect(@androidx.annotation.NonNull android.graphics.Rect r3) {
            r2 = this;
            boolean r0 = r2.touchHelperEnabled
            if (r0 == 0) goto L1d
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r2.touchHelper
            int r0 = r0.getKeyboardFocusedVirtualViewId()
            r1 = 1
            if (r0 == r1) goto L15
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r2.touchHelper
            int r0 = r0.getAccessibilityFocusedVirtualViewId()
            if (r0 != r1) goto L1d
        L15:
            android.graphics.Rect r0 = r2.getCloseIconTouchBoundsInt()
            r3.set(r0)
            return
        L1d:
            super/*android.widget.CheckBox*/.getFocusedRect(r3)
            return
    }

    @androidx.annotation.Nullable
    public com.google.android.material.animation.MotionSpec getHideMotionSpec() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            com.google.android.material.animation.MotionSpec r0 = r0.getHideMotionSpec()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public float getIconEndPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getIconEndPadding()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public float getIconStartPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getIconStartPadding()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getRippleColor()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.google.android.material.shape.Shapeable
    @androidx.annotation.NonNull
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getShapeAppearanceModel()
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.animation.MotionSpec getShowMotionSpec() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            com.google.android.material.animation.MotionSpec r0 = r0.getShowMotionSpec()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public float getTextEndPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getTextEndPadding()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public float getTextStartPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getTextStartPadding()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean isCheckable() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto Lc
            boolean r0 = r0.isCheckable()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public boolean isCheckedIconEnabled() {
            r1 = this;
            boolean r0 = r1.isCheckedIconVisible()
            return r0
    }

    public boolean isCheckedIconVisible() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto Lc
            boolean r0 = r0.isCheckedIconVisible()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public boolean isChipIconEnabled() {
            r1 = this;
            boolean r0 = r1.isChipIconVisible()
            return r0
    }

    public boolean isChipIconVisible() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto Lc
            boolean r0 = r0.isChipIconVisible()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public boolean isCloseIconEnabled() {
            r1 = this;
            boolean r0 = r1.isCloseIconVisible()
            return r0
    }

    public boolean isCloseIconVisible() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto Lc
            boolean r0 = r0.isCloseIconVisible()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    protected void onAttachedToWindow() {
            r1 = this;
            super/*android.widget.CheckBox*/.onAttachedToWindow()
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r1, r0)
            return
    }

    @Override // com.google.android.material.chip.ChipDrawable.Delegate
    public void onChipDrawableSizeChange() {
            r1 = this;
            int r0 = r1.minTouchTargetSize
            r1.ensureAccessibleTouchTarget(r0)
            r1.requestLayout()
            r1.invalidateOutline()
            return
    }

    protected int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 2
            int[] r2 = super/*android.widget.CheckBox*/.onCreateDrawableState(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L11
            int[] r0 = com.google.android.material.chip.Chip.SELECTED_STATE
            android.view.View.mergeDrawableStates(r2, r0)
        L11:
            boolean r0 = r1.isCheckable()
            if (r0 == 0) goto L1c
            int[] r0 = com.google.android.material.chip.Chip.CHECKABLE_STATE_SET
            android.view.View.mergeDrawableStates(r2, r0)
        L1c:
            return r2
    }

    protected void onFocusChanged(boolean r2, int r3, android.graphics.Rect r4) {
            r1 = this;
            super/*android.widget.CheckBox*/.onFocusChanged(r2, r3, r4)
            boolean r0 = r1.touchHelperEnabled
            if (r0 == 0) goto Lc
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r1.touchHelper
            r0.onFocusChanged(r2, r3, r4)
        Lc:
            return
    }

    public boolean onHoverEvent(@androidx.annotation.NonNull android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 7
            if (r0 == r1) goto L11
            r1 = 10
            if (r0 == r1) goto Lc
            goto L24
        Lc:
            r0 = 0
            r3.setCloseIconHovered(r0)
            goto L24
        L11:
            android.graphics.RectF r0 = r3.getCloseIconTouchBounds()
            float r1 = r4.getX()
            float r2 = r4.getY()
            boolean r0 = r0.contains(r1, r2)
            r3.setCloseIconHovered(r0)
        L24:
            boolean r4 = super/*android.widget.CheckBox*/.onHoverEvent(r4)
            return r4
    }

    public void onInitializeAccessibilityNodeInfo(@androidx.annotation.NonNull android.view.accessibility.AccessibilityNodeInfo r9) {
            r8 = this;
            super/*android.widget.CheckBox*/.onInitializeAccessibilityNodeInfo(r9)
            java.lang.CharSequence r0 = r8.getAccessibilityClassName()
            r9.setClassName(r0)
            boolean r0 = r8.isCheckable()
            r9.setCheckable(r0)
            boolean r0 = r8.isClickable()
            r9.setClickable(r0)
            android.view.ViewParent r0 = r8.getParent()
            boolean r0 = r0 instanceof com.google.android.material.chip.ChipGroup
            if (r0 == 0) goto L4a
            android.view.ViewParent r0 = r8.getParent()
            com.google.android.material.chip.ChipGroup r0 = (com.google.android.material.chip.ChipGroup) r0
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r9 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r9)
            boolean r1 = r0.isSingleLine()
            if (r1 == 0) goto L36
            int r1 = r0.getIndexOfChip(r8)
            r4 = r1
            goto L38
        L36:
            r1 = -1
            r4 = -1
        L38:
            int r2 = r0.getRowIndex(r8)
            r6 = 0
            boolean r7 = r8.isChecked()
            r3 = 1
            r5 = 1
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(r2, r3, r4, r5, r6, r7)
            r9.setCollectionItemInfo(r0)
        L4a:
            return
    }

    @androidx.annotation.Nullable
    @android.annotation.TargetApi(24)
    public android.view.PointerIcon onResolvePointerIcon(@androidx.annotation.NonNull android.view.MotionEvent r4, int r5) {
            r3 = this;
            android.graphics.RectF r0 = r3.getCloseIconTouchBounds()
            float r1 = r4.getX()
            float r2 = r4.getY()
            boolean r0 = r0.contains(r1, r2)
            if (r0 == 0) goto L23
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L23
            android.content.Context r4 = r3.getContext()
            r5 = 1002(0x3ea, float:1.404E-42)
            android.view.PointerIcon r4 = com.google.android.material.chip.a.a(r4, r5)
            return r4
        L23:
            android.view.PointerIcon r4 = super/*android.widget.CheckBox*/.onResolvePointerIcon(r4, r5)
            return r4
    }

    @android.annotation.TargetApi(17)
    public void onRtlPropertiesChanged(int r2) {
            r1 = this;
            super/*android.widget.CheckBox*/.onRtlPropertiesChanged(r2)
            int r0 = r1.lastLayoutDirection
            if (r0 == r2) goto Lc
            r1.lastLayoutDirection = r2
            r1.updatePaddingInternal()
        Lc:
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.closeIconPressed
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = 1
            goto L41
        L2c:
            boolean r0 = r5.closeIconPressed
            if (r0 == 0) goto L35
            r5.performCloseIconClick()
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super/*android.widget.CheckBox*/.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            return r3
        L4b:
            return r2
    }

    @androidx.annotation.CallSuper
    public boolean performCloseIconClick() {
            r3 = this;
            r0 = 0
            r3.playSoundEffect(r0)
            android.view.View$OnClickListener r1 = r3.onCloseIconClickListener
            r2 = 1
            if (r1 == 0) goto Ld
            r1.onClick(r3)
            r0 = 1
        Ld:
            boolean r1 = r3.touchHelperEnabled
            if (r1 == 0) goto L16
            com.google.android.material.chip.Chip$ChipTouchHelper r1 = r3.touchHelper
            r1.sendEventForVirtualView(r2, r2)
        L16:
            return r0
    }

    public void setAccessibilityClassName(@androidx.annotation.Nullable java.lang.CharSequence r1) {
            r0 = this;
            r0.accessibilityClassName = r1
            return
    }

    public void setBackground(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackgroundDrawable()
            if (r2 == r0) goto Lb
            android.graphics.drawable.RippleDrawable r0 = r1.ripple
            if (r2 == r0) goto Lb
            return
        Lb:
            super/*android.widget.CheckBox*/.setBackground(r2)
            return
    }

    public void setBackgroundColor(int r1) {
            r0 = this;
            return
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackgroundDrawable()
            if (r2 == r0) goto Lb
            android.graphics.drawable.RippleDrawable r0 = r1.ripple
            if (r2 == r0) goto Lb
            return
        Lb:
            super.setBackgroundDrawable(r2)
            return
    }

    public void setBackgroundResource(int r1) {
            r0 = this;
            return
    }

    public void setBackgroundTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            return
    }

    public void setBackgroundTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            return
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckable(r2)
        L7:
            return
    }

    public void setCheckableResource(@androidx.annotation.BoolRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckableResource(r2)
        L7:
            return
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 != 0) goto L7
            r1.deferredCheckedValue = r2
            return
        L7:
            boolean r0 = r0.isCheckable()
            if (r0 == 0) goto L10
            super/*android.widget.CheckBox*/.setChecked(r2)
        L10:
            return
    }

    public void setCheckedIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckedIcon(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabled(boolean r1) {
            r0 = this;
            r0.setCheckedIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabledResource(@androidx.annotation.BoolRes int r1) {
            r0 = this;
            r0.setCheckedIconVisible(r1)
            return
    }

    public void setCheckedIconResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckedIconResource(r2)
        L7:
            return
    }

    public void setCheckedIconTint(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckedIconTint(r2)
        L7:
            return
    }

    public void setCheckedIconTintResource(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckedIconTintResource(r2)
        L7:
            return
    }

    public void setCheckedIconVisible(@androidx.annotation.BoolRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckedIconVisible(r2)
        L7:
            return
    }

    public void setCheckedIconVisible(boolean r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckedIconVisible(r2)
        L7:
            return
    }

    public void setChipBackgroundColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipBackgroundColor(r2)
        L7:
            return
    }

    public void setChipBackgroundColorResource(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipBackgroundColorResource(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setChipCornerRadius(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipCornerRadius(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setChipCornerRadiusResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipCornerRadiusResource(r2)
        L7:
            return
    }

    public void setChipDrawable(@androidx.annotation.NonNull com.google.android.material.chip.ChipDrawable r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == r2) goto L17
            r1.unapplyChipDrawable(r0)
            r1.chipDrawable = r2
            r0 = 0
            r2.setShouldDrawText(r0)
            com.google.android.material.chip.ChipDrawable r2 = r1.chipDrawable
            r1.applyChipDrawable(r2)
            int r2 = r1.minTouchTargetSize
            r1.ensureAccessibleTouchTarget(r2)
        L17:
            return
    }

    public void setChipEndPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipEndPadding(r2)
        L7:
            return
    }

    public void setChipEndPaddingResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipEndPaddingResource(r2)
        L7:
            return
    }

    public void setChipIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIcon(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setChipIconEnabled(boolean r1) {
            r0 = this;
            r0.setChipIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setChipIconEnabledResource(@androidx.annotation.BoolRes int r1) {
            r0 = this;
            r0.setChipIconVisible(r1)
            return
    }

    public void setChipIconResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIconResource(r2)
        L7:
            return
    }

    public void setChipIconSize(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIconSize(r2)
        L7:
            return
    }

    public void setChipIconSizeResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIconSizeResource(r2)
        L7:
            return
    }

    public void setChipIconTint(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIconTint(r2)
        L7:
            return
    }

    public void setChipIconTintResource(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIconTintResource(r2)
        L7:
            return
    }

    public void setChipIconVisible(@androidx.annotation.BoolRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIconVisible(r2)
        L7:
            return
    }

    public void setChipIconVisible(boolean r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIconVisible(r2)
        L7:
            return
    }

    public void setChipMinHeight(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipMinHeight(r2)
        L7:
            return
    }

    public void setChipMinHeightResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipMinHeightResource(r2)
        L7:
            return
    }

    public void setChipStartPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipStartPadding(r2)
        L7:
            return
    }

    public void setChipStartPaddingResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipStartPaddingResource(r2)
        L7:
            return
    }

    public void setChipStrokeColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipStrokeColor(r2)
        L7:
            return
    }

    public void setChipStrokeColorResource(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipStrokeColorResource(r2)
        L7:
            return
    }

    public void setChipStrokeWidth(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipStrokeWidth(r2)
        L7:
            return
    }

    public void setChipStrokeWidthResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipStrokeWidthResource(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setChipText(@androidx.annotation.Nullable java.lang.CharSequence r1) {
            r0 = this;
            r0.setText(r1)
            return
    }

    @java.lang.Deprecated
    public void setChipTextResource(@androidx.annotation.StringRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.setText(r2)
            return
    }

    public void setCloseIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIcon(r2)
        L7:
            r1.updateAccessibilityDelegate()
            return
    }

    public void setCloseIconContentDescription(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconContentDescription(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setCloseIconEnabled(boolean r1) {
            r0 = this;
            r0.setCloseIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setCloseIconEnabledResource(@androidx.annotation.BoolRes int r1) {
            r0 = this;
            r0.setCloseIconVisible(r1)
            return
    }

    public void setCloseIconEndPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconEndPadding(r2)
        L7:
            return
    }

    public void setCloseIconEndPaddingResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconEndPaddingResource(r2)
        L7:
            return
    }

    public void setCloseIconResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconResource(r2)
        L7:
            r1.updateAccessibilityDelegate()
            return
    }

    public void setCloseIconSize(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconSize(r2)
        L7:
            return
    }

    public void setCloseIconSizeResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconSizeResource(r2)
        L7:
            return
    }

    public void setCloseIconStartPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconStartPadding(r2)
        L7:
            return
    }

    public void setCloseIconStartPaddingResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconStartPaddingResource(r2)
        L7:
            return
    }

    public void setCloseIconTint(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconTint(r2)
        L7:
            return
    }

    public void setCloseIconTintResource(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconTintResource(r2)
        L7:
            return
    }

    public void setCloseIconVisible(@androidx.annotation.BoolRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setCloseIconVisible(r2)
            return
    }

    public void setCloseIconVisible(boolean r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconVisible(r2)
        L7:
            r1.updateAccessibilityDelegate()
            return
    }

    public void setCompoundDrawables(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.graphics.drawable.Drawable r2, @androidx.annotation.Nullable android.graphics.drawable.Drawable r3, @androidx.annotation.Nullable android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawables(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.RequiresApi(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.graphics.drawable.Drawable r2, @androidx.annotation.Nullable android.graphics.drawable.Drawable r3, @androidx.annotation.Nullable android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super/*android.widget.CheckBox*/.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.graphics.drawable.Drawable r2, @androidx.annotation.Nullable android.graphics.drawable.Drawable r3, @androidx.annotation.Nullable android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super/*android.widget.CheckBox*/.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super/*android.widget.CheckBox*/.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    public void setCompoundDrawablesWithIntrinsicBounds(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.graphics.drawable.Drawable r2, @androidx.annotation.Nullable android.graphics.drawable.Drawable r3, @androidx.annotation.Nullable android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super/*android.widget.CheckBox*/.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set right drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.RequiresApi(21)
    public void setElevation(float r2) {
            r1 = this;
            super/*android.widget.CheckBox*/.setElevation(r2)
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto La
            r0.setElevation(r2)
        La:
            return
    }

    public void setEllipsize(android.text.TextUtils.TruncateAt r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 != 0) goto L5
            goto L13
        L5:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MARQUEE
            if (r2 == r0) goto L14
            super/*android.widget.CheckBox*/.setEllipsize(r2)
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L13
            r0.setEllipsize(r2)
        L13:
            return
        L14:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Text within a chip are not allowed to scroll."
            r2.<init>(r0)
            throw r2
    }

    public void setEnsureMinTouchTargetSize(boolean r1) {
            r0 = this;
            r0.ensureMinTouchTargetSize = r1
            int r1 = r0.minTouchTargetSize
            r0.ensureAccessibleTouchTarget(r1)
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            r0 = 8388627(0x800013, float:1.175497E-38)
            if (r2 == r0) goto L6
            return
        L6:
            super/*android.widget.CheckBox*/.setGravity(r2)
            return
    }

    public void setHideMotionSpec(@androidx.annotation.Nullable com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setHideMotionSpec(r2)
        L7:
            return
    }

    public void setHideMotionSpecResource(@androidx.annotation.AnimatorRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setHideMotionSpecResource(r2)
        L7:
            return
    }

    public void setIconEndPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setIconEndPadding(r2)
        L7:
            return
    }

    public void setIconEndPaddingResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setIconEndPaddingResource(r2)
        L7:
            return
    }

    public void setIconStartPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setIconStartPadding(r2)
        L7:
            return
    }

    public void setIconStartPaddingResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setIconStartPaddingResource(r2)
        L7:
            return
    }

    @Override // com.google.android.material.internal.MaterialCheckable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@androidx.annotation.Nullable com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener<com.google.android.material.chip.Chip> r1) {
            r0 = this;
            r0.onCheckedChangeListenerInternal = r1
            return
    }

    public void setLayoutDirection(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 != 0) goto L5
            return
        L5:
            super/*android.widget.CheckBox*/.setLayoutDirection(r2)
            return
    }

    public void setLines(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L7
            super/*android.widget.CheckBox*/.setLines(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    public void setMaxLines(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L7
            super/*android.widget.CheckBox*/.setMaxLines(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    public void setMaxWidth(@androidx.annotation.Px int r2) {
            r1 = this;
            super/*android.widget.CheckBox*/.setMaxWidth(r2)
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto La
            r0.setMaxWidth(r2)
        La:
            return
    }

    public void setMinLines(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L7
            super/*android.widget.CheckBox*/.setMinLines(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    public void setOnCheckedChangeListener(@androidx.annotation.Nullable android.widget.CompoundButton.OnCheckedChangeListener r1) {
            r0 = this;
            r0.onCheckedChangeListener = r1
            return
    }

    public void setOnCloseIconClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.onCloseIconClickListener = r1
            r0.updateAccessibilityDelegate()
            return
    }

    public void setRippleColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setRippleColor(r2)
        L7:
            com.google.android.material.chip.ChipDrawable r2 = r1.chipDrawable
            boolean r2 = r2.getUseCompatRipple()
            if (r2 != 0) goto L12
            r1.updateFrameworkRippleBackground()
        L12:
            return
    }

    public void setRippleColorResource(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L12
            r0.setRippleColorResource(r2)
            com.google.android.material.chip.ChipDrawable r2 = r1.chipDrawable
            boolean r2 = r2.getUseCompatRipple()
            if (r2 != 0) goto L12
            r1.updateFrameworkRippleBackground()
        L12:
            return
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@androidx.annotation.NonNull com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            r0.setShapeAppearanceModel(r2)
            return
    }

    public void setShowMotionSpec(@androidx.annotation.Nullable com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setShowMotionSpec(r2)
        L7:
            return
    }

    public void setShowMotionSpecResource(@androidx.annotation.AnimatorRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setShowMotionSpecResource(r2)
        L7:
            return
    }

    public void setSingleLine(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L6
            super/*android.widget.CheckBox*/.setSingleLine(r2)
            return
        L6:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    public void setText(java.lang.CharSequence r2, android.widget.TextView.BufferType r3) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 != 0) goto L5
            goto L1c
        L5:
            if (r2 != 0) goto L9
            java.lang.String r2 = ""
        L9:
            boolean r0 = r0.shouldDrawText()
            if (r0 == 0) goto L11
            r0 = 0
            goto L12
        L11:
            r0 = r2
        L12:
            super/*android.widget.CheckBox*/.setText(r0, r3)
            com.google.android.material.chip.ChipDrawable r3 = r1.chipDrawable
            if (r3 == 0) goto L1c
            r3.setText(r2)
        L1c:
            return
    }

    public void setTextAppearance(int r2) {
            r1 = this;
            super/*android.widget.CheckBox*/.setTextAppearance(r2)
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto La
            r0.setTextAppearanceResource(r2)
        La:
            r1.updateTextPaintDrawState()
            return
    }

    public void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super/*android.widget.CheckBox*/.setTextAppearance(r1, r2)
            com.google.android.material.chip.ChipDrawable r1 = r0.chipDrawable
            if (r1 == 0) goto La
            r1.setTextAppearanceResource(r2)
        La:
            r0.updateTextPaintDrawState()
            return
    }

    public void setTextAppearance(@androidx.annotation.Nullable com.google.android.material.resources.TextAppearance r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setTextAppearance(r2)
        L7:
            r1.updateTextPaintDrawState()
            return
    }

    public void setTextAppearanceResource(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            r1.setTextAppearance(r0, r2)
            return
    }

    public void setTextEndPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setTextEndPadding(r2)
        L7:
            return
    }

    public void setTextEndPaddingResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setTextEndPaddingResource(r2)
        L7:
            return
    }

    public void setTextSize(int r3, float r4) {
            r2 = this;
            super/*android.widget.CheckBox*/.setTextSize(r3, r4)
            com.google.android.material.chip.ChipDrawable r0 = r2.chipDrawable
            if (r0 == 0) goto L16
            android.content.res.Resources r1 = r2.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r3, r4, r1)
            r0.setTextSize(r3)
        L16:
            r2.updateTextPaintDrawState()
            return
    }

    public void setTextStartPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setTextStartPadding(r2)
        L7:
            return
    }

    public void setTextStartPaddingResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setTextStartPaddingResource(r2)
        L7:
            return
    }

    public boolean shouldEnsureMinTouchTargetSize() {
            r1 = this;
            boolean r0 = r1.ensureMinTouchTargetSize
            return r0
    }
}
