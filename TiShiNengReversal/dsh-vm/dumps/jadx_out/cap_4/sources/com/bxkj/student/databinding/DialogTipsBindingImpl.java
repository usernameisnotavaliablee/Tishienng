package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class DialogTipsBindingImpl extends com.bxkj.student.databinding.DialogTipsBinding implements com.bxkj.student.generated.callback.a.InterfaceC0073a {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback34;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback35;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback36;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;

    @androidx.annotation.NonNull
    private final com.google.android.material.imageview.ShapeableImageView mboundView1;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.DialogTipsBindingImpl.sViewsWithIds = r0
            r1 = 2131298054(0x7f090706, float:1.821407E38)
            r2 = 4
            r0.put(r1, r2)
            r1 = 2131299164(0x7f090b5c, float:1.8216322E38)
            r2 = 5
            r0.put(r1, r2)
            r1 = 2131296881(0x7f090271, float:1.8211691E38)
            r2 = 6
            r0.put(r1, r2)
            r1 = 2131298844(0x7f090a1c, float:1.8215673E38)
            r2 = 7
            r0.put(r1, r2)
            return
    }

    public DialogTipsBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.DialogTipsBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.DialogTipsBindingImpl.sViewsWithIds
            r2 = 8
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private DialogTipsBindingImpl(androidx.databinding.DataBindingComponent r13, android.view.View r14, java.lang.Object[] r15) {
            r12 = this;
            r0 = 3
            r1 = r15[r0]
            r6 = r1
            androidx.appcompat.widget.AppCompatButton r6 = (androidx.appcompat.widget.AppCompatButton) r6
            r1 = 6
            r1 = r15[r1]
            r7 = r1
            android.view.View r7 = (android.view.View) r7
            r1 = 2
            r2 = r15[r1]
            r8 = r2
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r2 = 4
            r2 = r15[r2]
            r9 = r2
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r2 = 7
            r2 = r15[r2]
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            r2 = 5
            r2 = r15[r2]
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            r5 = 0
            r2 = r12
            r3 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = -1
            r2.mDirtyFlags = r13
            androidx.appcompat.widget.AppCompatButton r13 = r2.bt
            r14 = 0
            r13.setTag(r14)
            android.widget.ImageView r13 = r2.iv
            r13.setTag(r14)
            r13 = 0
            r13 = r15[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r2.mboundView0 = r13
            r13.setTag(r14)
            r13 = 1
            r15 = r15[r13]
            com.google.android.material.imageview.ShapeableImageView r15 = (com.google.android.material.imageview.ShapeableImageView) r15
            r2.mboundView1 = r15
            r15.setTag(r14)
            r12.setRootTag(r4)
            com.bxkj.student.generated.callback.a r14 = new com.bxkj.student.generated.callback.a
            r14.<init>(r12, r0)
            r2.mCallback36 = r14
            com.bxkj.student.generated.callback.a r14 = new com.bxkj.student.generated.callback.a
            r14.<init>(r12, r13)
            r2.mCallback34 = r14
            com.bxkj.student.generated.callback.a r13 = new com.bxkj.student.generated.callback.a
            r13.<init>(r12, r1)
            r2.mCallback35 = r13
            r12.invalidateAll()
            return
    }

    @Override // com.bxkj.student.generated.callback.a.InterfaceC0073a
    public final void _internalCallbackOnClick(int r1, android.view.View r2) {
            r0 = this;
            r2 = 1
            if (r1 == r2) goto L1a
            r2 = 2
            if (r1 == r2) goto L12
            r2 = 3
            if (r1 == r2) goto La
            return
        La:
            com.bxkj.student.v2.ui.dialog.NoticeDialog r1 = r0.mDialog
            if (r1 == 0) goto L11
            r1.O()
        L11:
            return
        L12:
            com.bxkj.student.v2.ui.dialog.NoticeDialog r1 = r0.mDialog
            if (r1 == 0) goto L19
            r1.O()
        L19:
            return
        L1a:
            com.bxkj.student.v2.ui.dialog.NoticeDialog r1 = r0.mDialog
            if (r1 == 0) goto L21
            r1.dismiss()
        L21:
            return
    }

    protected void executeBindings() {
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.mDirtyFlags     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r6.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L25
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L25
            r4 = 2
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L24
            androidx.appcompat.widget.AppCompatButton r0 = r6.bt
            android.view.View$OnClickListener r1 = r6.mCallback36
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r6.iv
            android.view.View$OnClickListener r1 = r6.mCallback35
            r0.setOnClickListener(r1)
            com.google.android.material.imageview.ShapeableImageView r0 = r6.mboundView1
            android.view.View$OnClickListener r1 = r6.mCallback34
            r0.setOnClickListener(r1)
        L24:
            return
        L25:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L25
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

    @Override // com.bxkj.student.databinding.DialogTipsBinding
    public void setDialog(@androidx.annotation.Nullable com.bxkj.student.v2.ui.dialog.NoticeDialog r5) {
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
            com.bxkj.student.v2.ui.dialog.NoticeDialog r3 = (com.bxkj.student.v2.ui.dialog.NoticeDialog) r3
            r1.setDialog(r3)
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }
}
