package com.google.android.material.datepicker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP, androidx.annotation.RestrictTo.Scope.TESTS})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MaterialStyledDatePickerDialog extends android.app.DatePickerDialog {

    @androidx.annotation.AttrRes
    private static final int DEF_STYLE_ATTR = 16843612;

    @androidx.annotation.StyleRes
    private static final int DEF_STYLE_RES = 0;

    @androidx.annotation.NonNull
    private final android.graphics.drawable.Drawable background;

    @androidx.annotation.NonNull
    private final android.graphics.Rect backgroundInsets;

    static {
            int r0 = com.google.android.material.R.style.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner
            com.google.android.material.datepicker.MaterialStyledDatePickerDialog.DEF_STYLE_RES = r0
            return
    }

    public MaterialStyledDatePickerDialog(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialStyledDatePickerDialog(@androidx.annotation.NonNull android.content.Context r8, int r9) {
            r7 = this;
            r5 = -1
            r6 = -1
            r3 = 0
            r4 = -1
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public MaterialStyledDatePickerDialog(@androidx.annotation.NonNull android.content.Context r2, int r3, @androidx.annotation.Nullable android.app.DatePickerDialog.OnDateSetListener r4, int r5, int r6, int r7) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r2 = r1
            android.content.Context r3 = r1.getContext()
            android.content.Context r4 = r1.getContext()
            int r5 = com.google.android.material.R.attr.colorSurface
            java.lang.Class r6 = r1.getClass()
            java.lang.String r6 = r6.getCanonicalName()
            int r4 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r4, r5, r6)
            com.google.android.material.shape.MaterialShapeDrawable r5 = new com.google.android.material.shape.MaterialShapeDrawable
            int r6 = com.google.android.material.datepicker.MaterialStyledDatePickerDialog.DEF_STYLE_RES
            r7 = 0
            r0 = 16843612(0x101035c, float:2.3695968E-38)
            r5.<init>(r3, r7, r0, r6)
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
            r5.setFillColor(r4)
            android.graphics.Rect r3 = com.google.android.material.dialog.MaterialDialogs.getDialogBackgroundInsets(r3, r0, r6)
            r2.backgroundInsets = r3
            android.graphics.drawable.InsetDrawable r3 = com.google.android.material.dialog.MaterialDialogs.insetDrawable(r5, r3)
            r2.background = r3
            return
    }

    public MaterialStyledDatePickerDialog(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.Nullable android.app.DatePickerDialog.OnDateSetListener r9, int r10, int r11, int r12) {
            r7 = this;
            r2 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            android.view.Window r3 = r2.getWindow()
            android.graphics.drawable.Drawable r0 = r2.background
            r3.setBackgroundDrawable(r0)
            android.view.Window r3 = r2.getWindow()
            android.view.View r3 = r3.getDecorView()
            com.google.android.material.dialog.InsetDialogOnTouchListener r0 = new com.google.android.material.dialog.InsetDialogOnTouchListener
            android.graphics.Rect r1 = r2.backgroundInsets
            r0.<init>(r2, r1)
            r3.setOnTouchListener(r0)
            return
    }
}
