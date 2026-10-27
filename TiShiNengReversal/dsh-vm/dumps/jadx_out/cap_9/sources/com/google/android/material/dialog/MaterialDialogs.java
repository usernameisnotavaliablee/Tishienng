package com.google.android.material.dialog;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MaterialDialogs {
    private MaterialDialogs() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.graphics.Rect getDialogBackgroundInsets(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.AttrRes int r8, int r9) {
            int[] r2 = com.google.android.material.R.styleable.MaterialAlertDialog
            r0 = 0
            int[] r5 = new int[r0]
            r1 = 0
            r0 = r7
            r3 = r8
            r4 = r9
            android.content.res.TypedArray r7 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r8 = com.google.android.material.R.styleable.MaterialAlertDialog_backgroundInsetStart
            android.content.res.Resources r9 = r0.getResources()
            int r1 = com.google.android.material.R.dimen.mtrl_alert_dialog_background_inset_start
            int r9 = r9.getDimensionPixelSize(r1)
            int r8 = r7.getDimensionPixelSize(r8, r9)
            int r9 = com.google.android.material.R.styleable.MaterialAlertDialog_backgroundInsetTop
            android.content.res.Resources r1 = r0.getResources()
            int r2 = com.google.android.material.R.dimen.mtrl_alert_dialog_background_inset_top
            int r1 = r1.getDimensionPixelSize(r2)
            int r9 = r7.getDimensionPixelSize(r9, r1)
            int r1 = com.google.android.material.R.styleable.MaterialAlertDialog_backgroundInsetEnd
            android.content.res.Resources r2 = r0.getResources()
            int r3 = com.google.android.material.R.dimen.mtrl_alert_dialog_background_inset_end
            int r2 = r2.getDimensionPixelSize(r3)
            int r1 = r7.getDimensionPixelSize(r1, r2)
            int r2 = com.google.android.material.R.styleable.MaterialAlertDialog_backgroundInsetBottom
            android.content.res.Resources r3 = r0.getResources()
            int r4 = com.google.android.material.R.dimen.mtrl_alert_dialog_background_inset_bottom
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r7.getDimensionPixelSize(r2, r3)
            r7.recycle()
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.getLayoutDirection()
            r0 = 1
            if (r7 != r0) goto L62
            r6 = r1
            r1 = r8
            r8 = r6
        L62:
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r8, r9, r1, r2)
            return r7
    }

    @androidx.annotation.NonNull
    public static android.graphics.drawable.InsetDrawable insetDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r6, @androidx.annotation.NonNull android.graphics.Rect r7) {
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            int r2 = r7.left
            int r3 = r7.top
            int r4 = r7.right
            int r5 = r7.bottom
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
