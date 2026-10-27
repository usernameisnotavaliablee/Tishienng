package com.google.android.material.dialog;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MaterialAlertDialogBuilder extends androidx.appcompat.app.AlertDialog.Builder {

    @androidx.annotation.AttrRes
    private static final int DEF_STYLE_ATTR = 0;

    @androidx.annotation.StyleRes
    private static final int DEF_STYLE_RES = 0;

    @androidx.annotation.AttrRes
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = 0;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable background;

    @androidx.annotation.NonNull
    private final android.graphics.Rect backgroundInsets;

    static {
            int r0 = com.google.android.material.R.attr.alertDialogStyle
            com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_ATTR = r0
            int r0 = com.google.android.material.R.style.MaterialAlertDialog_MaterialComponents
            com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_RES = r0
            int r0 = com.google.android.material.R.attr.materialAlertDialogTheme
            com.google.android.material.dialog.MaterialAlertDialogBuilder.MATERIAL_ALERT_DIALOG_THEME_OVERLAY = r0
            return
    }

    public MaterialAlertDialogBuilder(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialAlertDialogBuilder(@androidx.annotation.NonNull android.content.Context r7, int r8) {
            r6 = this;
            android.content.Context r0 = createMaterialAlertDialogThemedContext(r7)
            int r7 = getOverridingThemeResId(r7, r8)
            r6.<init>(r0, r7)
            android.content.Context r7 = r6.getContext()
            android.content.res.Resources$Theme r8 = r7.getTheme()
            int r0 = com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_ATTR
            int r1 = com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_RES
            android.graphics.Rect r2 = com.google.android.material.dialog.MaterialDialogs.getDialogBackgroundInsets(r7, r0, r1)
            r6.backgroundInsets = r2
            int r2 = com.google.android.material.R.attr.colorSurface
            java.lang.Class r3 = r6.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            int r2 = com.google.android.material.color.MaterialColors.getColor(r7, r2, r3)
            int[] r3 = com.google.android.material.R.styleable.MaterialAlertDialog
            r4 = 0
            android.content.res.TypedArray r3 = r7.obtainStyledAttributes(r4, r3, r0, r1)
            int r5 = com.google.android.material.R.styleable.MaterialAlertDialog_backgroundTint
            int r2 = r3.getColor(r5, r2)
            r3.recycle()
            com.google.android.material.shape.MaterialShapeDrawable r3 = new com.google.android.material.shape.MaterialShapeDrawable
            r3.<init>(r7, r4, r0, r1)
            r3.initializeElevationOverlay(r7)
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r2)
            r3.setFillColor(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r7 < r0) goto L79
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            r0 = 16844145(0x1010571, float:2.3697462E-38)
            r1 = 1
            r8.resolveAttribute(r0, r7, r1)
            android.content.Context r8 = r6.getContext()
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r7.getDimension(r8)
            int r7 = r7.type
            r0 = 5
            if (r7 != r0) goto L79
            r7 = 0
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 < 0) goto L79
            r3.setCornerSize(r8)
        L79:
            r6.background = r3
            return
    }

    private static android.content.Context createMaterialAlertDialogThemedContext(@androidx.annotation.NonNull android.content.Context r4) {
            int r0 = getMaterialAlertDialogThemeOverlay(r4)
            int r1 = com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_ATTR
            int r2 = com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_RES
            r3 = 0
            android.content.Context r4 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r4, r3, r1, r2)
            if (r0 != 0) goto L10
            return r4
        L10:
            androidx.appcompat.view.ContextThemeWrapper r1 = new androidx.appcompat.view.ContextThemeWrapper
            r1.<init>(r4, r0)
            return r1
    }

    private static int getMaterialAlertDialogThemeOverlay(@androidx.annotation.NonNull android.content.Context r1) {
            int r0 = com.google.android.material.dialog.MaterialAlertDialogBuilder.MATERIAL_ALERT_DIALOG_THEME_OVERLAY
            android.util.TypedValue r1 = com.google.android.material.resources.MaterialAttributes.resolve(r1, r0)
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            int r1 = r1.data
            return r1
    }

    private static int getOverridingThemeResId(@androidx.annotation.NonNull android.content.Context r0, int r1) {
            if (r1 != 0) goto L7
            int r0 = getMaterialAlertDialogThemeOverlay(r0)
            return r0
        L7:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.appcompat.app.AlertDialog create() {
            r5 = this;
            androidx.appcompat.app.AlertDialog r0 = super.create()
            android.view.Window r1 = r0.getWindow()
            android.view.View r2 = r1.getDecorView()
            android.graphics.drawable.Drawable r3 = r5.background
            boolean r4 = r3 instanceof com.google.android.material.shape.MaterialShapeDrawable
            if (r4 == 0) goto L1b
            com.google.android.material.shape.MaterialShapeDrawable r3 = (com.google.android.material.shape.MaterialShapeDrawable) r3
            float r4 = androidx.core.view.ViewCompat.getElevation(r2)
            r3.setElevation(r4)
        L1b:
            android.graphics.drawable.Drawable r3 = r5.background
            android.graphics.Rect r4 = r5.backgroundInsets
            android.graphics.drawable.InsetDrawable r3 = com.google.android.material.dialog.MaterialDialogs.insetDrawable(r3, r4)
            r1.setBackgroundDrawable(r3)
            com.google.android.material.dialog.InsetDialogOnTouchListener r1 = new com.google.android.material.dialog.InsetDialogOnTouchListener
            android.graphics.Rect r3 = r5.backgroundInsets
            r1.<init>(r0, r3)
            r2.setOnTouchListener(r1)
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getBackground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.background
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setAdapter(@androidx.annotation.Nullable android.widget.ListAdapter r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m5setAdapter(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setAdapter, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m5setAdapter(@androidx.annotation.Nullable android.widget.ListAdapter r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setAdapter(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setBackground(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.background = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setBackgroundInsetBottom(@androidx.annotation.Px int r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.backgroundInsets
            r0.bottom = r2
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setBackgroundInsetEnd(@androidx.annotation.Px int r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L18
            android.graphics.Rect r0 = r2.backgroundInsets
            r0.left = r3
            return r2
        L18:
            android.graphics.Rect r0 = r2.backgroundInsets
            r0.right = r3
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setBackgroundInsetStart(@androidx.annotation.Px int r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L18
            android.graphics.Rect r0 = r2.backgroundInsets
            r0.right = r3
            return r2
        L18:
            android.graphics.Rect r0 = r2.backgroundInsets
            r0.left = r3
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setBackgroundInsetTop(@androidx.annotation.Px int r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.backgroundInsets
            r0.top = r2
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setCancelable(boolean r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m6setCancelable(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setCancelable, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m6setCancelable(boolean r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setCancelable(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setCursor(@androidx.annotation.Nullable android.database.Cursor r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2, @androidx.annotation.NonNull java.lang.String r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m7setCursor(r1, r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setCursor, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m7setCursor(@androidx.annotation.Nullable android.database.Cursor r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2, @androidx.annotation.NonNull java.lang.String r3) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setCursor(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setCustomTitle(@androidx.annotation.Nullable android.view.View r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m8setCustomTitle(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setCustomTitle, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m8setCustomTitle(@androidx.annotation.Nullable android.view.View r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setCustomTitle(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setIcon(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m9setIcon(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m10setIcon(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setIcon, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m9setIcon(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setIcon(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setIcon, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m10setIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setIcon(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setIconAttribute(@androidx.annotation.AttrRes int r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m11setIconAttribute(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setIconAttribute, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m11setIconAttribute(@androidx.annotation.AttrRes int r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setIconAttribute(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setItems(@androidx.annotation.ArrayRes int r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m12setItems(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setItems(@androidx.annotation.Nullable java.lang.CharSequence[] r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m13setItems(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setItems, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m12setItems(@androidx.annotation.ArrayRes int r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setItems(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setItems, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m13setItems(@androidx.annotation.Nullable java.lang.CharSequence[] r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setItems(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setMessage(@androidx.annotation.StringRes int r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m14setMessage(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setMessage(@androidx.annotation.Nullable java.lang.CharSequence r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m15setMessage(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setMessage, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m14setMessage(@androidx.annotation.StringRes int r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setMessage(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setMessage, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m15setMessage(@androidx.annotation.Nullable java.lang.CharSequence r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setMessage(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setMultiChoiceItems(@androidx.annotation.ArrayRes int r1, @androidx.annotation.Nullable boolean[] r2, @androidx.annotation.Nullable android.content.DialogInterface.OnMultiChoiceClickListener r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m16setMultiChoiceItems(r1, r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setMultiChoiceItems(@androidx.annotation.Nullable android.database.Cursor r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable android.content.DialogInterface.OnMultiChoiceClickListener r4) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m17setMultiChoiceItems(r1, r2, r3, r4)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setMultiChoiceItems(@androidx.annotation.Nullable java.lang.CharSequence[] r1, @androidx.annotation.Nullable boolean[] r2, @androidx.annotation.Nullable android.content.DialogInterface.OnMultiChoiceClickListener r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m18setMultiChoiceItems(r1, r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setMultiChoiceItems, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m16setMultiChoiceItems(@androidx.annotation.ArrayRes int r1, @androidx.annotation.Nullable boolean[] r2, @androidx.annotation.Nullable android.content.DialogInterface.OnMultiChoiceClickListener r3) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setMultiChoiceItems(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setMultiChoiceItems, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m17setMultiChoiceItems(@androidx.annotation.Nullable android.database.Cursor r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable android.content.DialogInterface.OnMultiChoiceClickListener r4) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setMultiChoiceItems(r1, r2, r3, r4)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setMultiChoiceItems, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m18setMultiChoiceItems(@androidx.annotation.Nullable java.lang.CharSequence[] r1, @androidx.annotation.Nullable boolean[] r2, @androidx.annotation.Nullable android.content.DialogInterface.OnMultiChoiceClickListener r3) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setMultiChoiceItems(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setNegativeButton(@androidx.annotation.StringRes int r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m19setNegativeButton(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setNegativeButton(@androidx.annotation.Nullable java.lang.CharSequence r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m20setNegativeButton(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setNegativeButton, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m19setNegativeButton(@androidx.annotation.StringRes int r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setNegativeButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setNegativeButton, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m20setNegativeButton(@androidx.annotation.Nullable java.lang.CharSequence r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setNegativeButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setNegativeButtonIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m21setNegativeButtonIcon(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setNegativeButtonIcon, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m21setNegativeButtonIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setNegativeButtonIcon(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setNeutralButton(@androidx.annotation.StringRes int r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m22setNeutralButton(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setNeutralButton(@androidx.annotation.Nullable java.lang.CharSequence r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m23setNeutralButton(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setNeutralButton, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m22setNeutralButton(@androidx.annotation.StringRes int r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setNeutralButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setNeutralButton, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m23setNeutralButton(@androidx.annotation.Nullable java.lang.CharSequence r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setNeutralButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setNeutralButtonIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m24setNeutralButtonIcon(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setNeutralButtonIcon, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m24setNeutralButtonIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setNeutralButtonIcon(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setOnCancelListener(@androidx.annotation.Nullable android.content.DialogInterface.OnCancelListener r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m25setOnCancelListener(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setOnCancelListener, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m25setOnCancelListener(@androidx.annotation.Nullable android.content.DialogInterface.OnCancelListener r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setOnCancelListener(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setOnDismissListener(@androidx.annotation.Nullable android.content.DialogInterface.OnDismissListener r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m26setOnDismissListener(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setOnDismissListener, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m26setOnDismissListener(@androidx.annotation.Nullable android.content.DialogInterface.OnDismissListener r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setOnDismissListener(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setOnItemSelectedListener(@androidx.annotation.Nullable android.widget.AdapterView.OnItemSelectedListener r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m27setOnItemSelectedListener(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setOnItemSelectedListener, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m27setOnItemSelectedListener(@androidx.annotation.Nullable android.widget.AdapterView.OnItemSelectedListener r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setOnItemSelectedListener(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setOnKeyListener(@androidx.annotation.Nullable android.content.DialogInterface.OnKeyListener r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m28setOnKeyListener(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setOnKeyListener, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m28setOnKeyListener(@androidx.annotation.Nullable android.content.DialogInterface.OnKeyListener r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setOnKeyListener(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setPositiveButton(@androidx.annotation.StringRes int r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m29setPositiveButton(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setPositiveButton(@androidx.annotation.Nullable java.lang.CharSequence r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m30setPositiveButton(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setPositiveButton, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m29setPositiveButton(@androidx.annotation.StringRes int r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setPositiveButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setPositiveButton, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m30setPositiveButton(@androidx.annotation.Nullable java.lang.CharSequence r1, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setPositiveButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setPositiveButtonIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m31setPositiveButtonIcon(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setPositiveButtonIcon, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m31setPositiveButtonIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setPositiveButtonIcon(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(@androidx.annotation.ArrayRes int r1, int r2, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m32setSingleChoiceItems(r1, r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(@androidx.annotation.Nullable android.database.Cursor r1, int r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r4) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m33setSingleChoiceItems(r1, r2, r3, r4)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(@androidx.annotation.Nullable android.widget.ListAdapter r1, int r2, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m34setSingleChoiceItems(r1, r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(@androidx.annotation.Nullable java.lang.CharSequence[] r1, int r2, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m35setSingleChoiceItems(r1, r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setSingleChoiceItems, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m32setSingleChoiceItems(@androidx.annotation.ArrayRes int r1, int r2, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setSingleChoiceItems(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setSingleChoiceItems, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m33setSingleChoiceItems(@androidx.annotation.Nullable android.database.Cursor r1, int r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r4) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setSingleChoiceItems(r1, r2, r3, r4)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setSingleChoiceItems, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m34setSingleChoiceItems(@androidx.annotation.Nullable android.widget.ListAdapter r1, int r2, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setSingleChoiceItems(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setSingleChoiceItems, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m35setSingleChoiceItems(@androidx.annotation.Nullable java.lang.CharSequence[] r1, int r2, @androidx.annotation.Nullable android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setSingleChoiceItems(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setTitle(@androidx.annotation.StringRes int r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m36setTitle(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setTitle(@androidx.annotation.Nullable java.lang.CharSequence r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m37setTitle(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setTitle, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m36setTitle(@androidx.annotation.StringRes int r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setTitle(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setTitle, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m37setTitle(@androidx.annotation.Nullable java.lang.CharSequence r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setTitle(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setView(int r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m38setView(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setView(@androidx.annotation.Nullable android.view.View r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.m39setView(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setView, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m38setView(int r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setView(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: setView, reason: collision with other method in class */
    public com.google.android.material.dialog.MaterialAlertDialogBuilder m39setView(@androidx.annotation.Nullable android.view.View r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setView(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }
}
