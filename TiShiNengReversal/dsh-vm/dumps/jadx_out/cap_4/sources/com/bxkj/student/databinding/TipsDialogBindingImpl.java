package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TipsDialogBindingImpl extends com.bxkj.student.databinding.TipsDialogBinding implements com.bxkj.student.generated.callback.a.InterfaceC0073a {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback68;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;

    @androidx.annotation.NonNull
    private final com.google.android.material.imageview.ShapeableImageView mboundView1;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.TipsDialogBindingImpl.sViewsWithIds = r0
            r1 = 2131298408(0x7f090868, float:1.8214788E38)
            r2 = 2
            r0.put(r1, r2)
            r1 = 2131298982(0x7f090aa6, float:1.8215953E38)
            r2 = 3
            r0.put(r1, r2)
            return
    }

    public TipsDialogBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.TipsDialogBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.TipsDialogBindingImpl.sViewsWithIds
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private TipsDialogBindingImpl(androidx.databinding.DataBindingComponent r8, android.view.View r9, java.lang.Object[] r10) {
            r7 = this;
            r0 = 2
            r0 = r10[r0]
            r5 = r0
            androidx.cardview.widget.CardView r5 = (androidx.cardview.widget.CardView) r5
            r0 = 3
            r0 = r10[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = -1
            r1.mDirtyFlags = r8
            r8 = 0
            r8 = r10[r8]
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r1.mboundView0 = r8
            r9 = 0
            r8.setTag(r9)
            r8 = 1
            r10 = r10[r8]
            com.google.android.material.imageview.ShapeableImageView r10 = (com.google.android.material.imageview.ShapeableImageView) r10
            r1.mboundView1 = r10
            r10.setTag(r9)
            r7.setRootTag(r3)
            com.bxkj.student.generated.callback.a r9 = new com.bxkj.student.generated.callback.a
            r9.<init>(r7, r8)
            r1.mCallback68 = r9
            r7.invalidateAll()
            return
    }

    @Override // com.bxkj.student.generated.callback.a.InterfaceC0073a
    public final void _internalCallbackOnClick(int r1, android.view.View r2) {
            r0 = this;
            com.bxkj.student.v2.ui.dialog.TipsDialog r1 = r0.mDialog
            if (r1 == 0) goto L7
            r1.dismiss()
        L7:
            return
    }

    protected void executeBindings() {
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.mDirtyFlags     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r6.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L17
            r4 = 2
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            com.google.android.material.imageview.ShapeableImageView r0 = r6.mboundView1
            android.view.View$OnClickListener r1 = r6.mCallback68
            r0.setOnClickListener(r1)
        L16:
            return
        L17:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    public boolean hasPendingBindings() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.mDirtyFlags     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Le
            r0 = 1
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            r0 = move-exception
            goto L11
        Le:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
            r0 = 0
            return r0
        L11:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public void invalidateAll() {
            r2 = this;
            monitor-enter(r2)
            r0 = 2
            r2.mDirtyFlags = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            r2.requestRebind()
            return
        La:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    protected boolean onFieldChange(int r1, java.lang.Object r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.bxkj.student.databinding.TipsDialogBinding
    public void setDialog(@androidx.annotation.Nullable com.bxkj.student.v2.ui.dialog.TipsDialog r5) {
            r4 = this;
            r4.mDialog = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 1
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 9
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    public boolean setVariable(int r2, @androidx.annotation.Nullable java.lang.Object r3) {
            r1 = this;
            r0 = 9
            if (r0 != r2) goto Lb
            com.bxkj.student.v2.ui.dialog.TipsDialog r3 = (com.bxkj.student.v2.ui.dialog.TipsDialog) r3
            r1.setDialog(r3)
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }
}
