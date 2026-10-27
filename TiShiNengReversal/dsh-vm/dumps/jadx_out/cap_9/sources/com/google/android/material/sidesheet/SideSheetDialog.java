package com.google.android.material.sidesheet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class SideSheetDialog extends com.google.android.material.sidesheet.SheetDialog<com.google.android.material.sidesheet.SideSheetCallback> {
    private static final int SIDE_SHEET_DIALOG_DEFAULT_THEME_RES = 0;
    private static final int SIDE_SHEET_DIALOG_THEME_ATTR = 0;


    static {
            int r0 = com.google.android.material.R.attr.sideSheetDialogTheme
            com.google.android.material.sidesheet.SideSheetDialog.SIDE_SHEET_DIALOG_THEME_ATTR = r0
            int r0 = com.google.android.material.R.style.Theme_Material3_Light_SideSheetDialog
            com.google.android.material.sidesheet.SideSheetDialog.SIDE_SHEET_DIALOG_DEFAULT_THEME_RES = r0
            return
    }

    public SideSheetDialog(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SideSheetDialog(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.StyleRes int r4) {
            r2 = this;
            int r0 = com.google.android.material.sidesheet.SideSheetDialog.SIDE_SHEET_DIALOG_THEME_ATTR
            int r1 = com.google.android.material.sidesheet.SideSheetDialog.SIDE_SHEET_DIALOG_DEFAULT_THEME_RES
            r2.<init>(r3, r4, r0, r1)
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    void addSheetCancelOnHideCallback(com.google.android.material.sidesheet.Sheet<com.google.android.material.sidesheet.SideSheetCallback> r2) {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetDialog$1 r0 = new com.google.android.material.sidesheet.SideSheetDialog$1
            r0.<init>(r1)
            r2.addCallback(r0)
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void cancel() {
            r0 = this;
            super.cancel()
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.google.android.material.sidesheet.Sheet<com.google.android.material.sidesheet.SideSheetCallback> getBehavior() {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r1.getBehavior2()
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @androidx.annotation.NonNull
    /* renamed from: getBehavior, reason: avoid collision after fix types in other method */
    public com.google.android.material.sidesheet.Sheet<com.google.android.material.sidesheet.SideSheetCallback> getBehavior2() {
            r2 = this;
            com.google.android.material.sidesheet.Sheet r0 = super.getBehavior()
            boolean r1 = r0 instanceof com.google.android.material.sidesheet.SideSheetBehavior
            if (r1 == 0) goto Lb
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The view is not associated with SideSheetBehavior"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @androidx.annotation.NonNull
    com.google.android.material.sidesheet.Sheet<com.google.android.material.sidesheet.SideSheetCallback> getBehaviorFromSheet(@androidx.annotation.NonNull android.widget.FrameLayout r1) {
            r0 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r1 = com.google.android.material.sidesheet.SideSheetBehavior.from(r1)
            return r1
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @androidx.annotation.IdRes
    int getDialogId() {
            r1 = this;
            int r0 = com.google.android.material.R.id.m3_side_sheet
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @androidx.annotation.LayoutRes
    int getLayoutResId() {
            r1 = this;
            int r0 = com.google.android.material.R.layout.m3_side_sheet_dialog
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    int getStateOnStart() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ boolean isDismissWithSheetAnimationEnabled() {
            r1 = this;
            boolean r0 = super.isDismissWithSheetAnimationEnabled()
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean r1) {
            r0 = this;
            super.setCancelable(r1)
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean r1) {
            r0 = this;
            super.setCanceledOnTouchOutside(r1)
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setContentView(@androidx.annotation.LayoutRes int r1) {
            r0 = this;
            super.setContentView(r1)
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setContentView(@androidx.annotation.Nullable android.view.View r1) {
            r0 = this;
            super.setContentView(r1)
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setContentView(@androidx.annotation.Nullable android.view.View r1, @androidx.annotation.Nullable android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            super.setContentView(r1, r2)
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setDismissWithSheetAnimationEnabled(boolean r1) {
            r0 = this;
            super.setDismissWithSheetAnimationEnabled(r1)
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setSheetEdge(@androidx.annotation.GravityInt int r1) {
            r0 = this;
            super.setSheetEdge(r1)
            return
    }
}
