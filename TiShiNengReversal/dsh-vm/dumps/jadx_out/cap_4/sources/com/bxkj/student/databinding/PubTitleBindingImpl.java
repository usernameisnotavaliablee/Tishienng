package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class PubTitleBindingImpl extends com.bxkj.student.databinding.PubTitleBinding implements com.bxkj.student.generated.callback.a.InterfaceC0073a {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback45;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback46;
    private long mDirtyFlags;

    static {
            return
    }

    public PubTitleBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.PubTitleBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.PubTitleBindingImpl.sViewsWithIds
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private PubTitleBindingImpl(androidx.databinding.DataBindingComponent r11, android.view.View r12, java.lang.Object[] r13) {
            r10 = this;
            r0 = 2
            r1 = r13[r0]
            r6 = r1
            androidx.appcompat.widget.AppCompatImageButton r6 = (androidx.appcompat.widget.AppCompatImageButton) r6
            r1 = 3
            r1 = r13[r1]
            r7 = r1
            androidx.appcompat.widget.AppCompatImageButton r7 = (androidx.appcompat.widget.AppCompatImageButton) r7
            r1 = 0
            r1 = r13[r1]
            r8 = r1
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r1 = 1
            r13 = r13[r1]
            r9 = r13
            com.bxkj.base.view.MarqueeTextView r9 = (com.bxkj.base.view.MarqueeTextView) r9
            r5 = 0
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11 = -1
            r2.mDirtyFlags = r11
            androidx.appcompat.widget.AppCompatImageButton r11 = r2.ibBack
            r12 = 0
            r11.setTag(r12)
            androidx.appcompat.widget.AppCompatImageButton r11 = r2.ibRight
            r11.setTag(r12)
            androidx.constraintlayout.widget.ConstraintLayout r11 = r2.llTitle
            r11.setTag(r12)
            com.bxkj.base.view.MarqueeTextView r11 = r2.tvTitle
            r11.setTag(r12)
            r10.setRootTag(r4)
            com.bxkj.student.generated.callback.a r11 = new com.bxkj.student.generated.callback.a
            r11.<init>(r10, r1)
            r2.mCallback45 = r11
            com.bxkj.student.generated.callback.a r11 = new com.bxkj.student.generated.callback.a
            r11.<init>(r10, r0)
            r2.mCallback46 = r11
            r10.invalidateAll()
            return
    }

    @Override // com.bxkj.student.generated.callback.a.InterfaceC0073a
    public final void _internalCallbackOnClick(int r1, android.view.View r2) {
            r0 = this;
            r2 = 1
            if (r1 == r2) goto Lf
            r2 = 2
            if (r1 == r2) goto L7
            return
        L7:
            androidx.appcompat.app.AppCompatActivity r1 = r0.mActivity
            if (r1 == 0) goto Le
            r1.finish()
        Le:
            return
        Lf:
            androidx.appcompat.app.AppCompatActivity r1 = r0.mActivity
            if (r1 == 0) goto L16
            r1.finish()
        L16:
            return
    }

    protected void executeBindings() {
            r12 = this;
            monitor-enter(r12)
            long r0 = r12.mDirtyFlags     // Catch: java.lang.Throwable -> L53
            r2 = 0
            r12.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L53
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = r12.mTitle
            java.lang.Boolean r5 = r12.mIsHideBack
            r6 = 10
            long r8 = r0 & r6
            r10 = 0
            int r11 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r11 == 0) goto L27
            boolean r5 = androidx.databinding.ViewDataBinding.safeUnbox(r5)
            if (r11 == 0) goto L24
            if (r5 == 0) goto L21
            r8 = 32
        L1f:
            long r0 = r0 | r8
            goto L24
        L21:
            r8 = 16
            goto L1f
        L24:
            if (r5 == 0) goto L27
            r10 = 4
        L27:
            r8 = 8
            long r8 = r8 & r0
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 == 0) goto L3c
            androidx.appcompat.widget.AppCompatImageButton r5 = r12.ibBack
            android.view.View$OnClickListener r8 = r12.mCallback45
            r5.setOnClickListener(r8)
            androidx.appcompat.widget.AppCompatImageButton r5 = r12.ibRight
            android.view.View$OnClickListener r8 = r12.mCallback46
            r5.setOnClickListener(r8)
        L3c:
            long r6 = r6 & r0
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 == 0) goto L46
            androidx.appcompat.widget.AppCompatImageButton r5 = r12.ibBack
            r5.setVisibility(r10)
        L46:
            r5 = 9
            long r0 = r0 & r5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L52
            com.bxkj.base.view.MarqueeTextView r0 = r12.tvTitle
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r4)
        L52:
            return
        L53:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L53
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
            r0 = 8
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

    @Override // com.bxkj.student.databinding.PubTitleBinding
    public void setActivity(@androidx.annotation.Nullable androidx.appcompat.app.AppCompatActivity r5) {
            r4 = this;
            r4.mActivity = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L13
            r2 = 4
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L13
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            r5 = 1
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L13:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            throw r5
    }

    @Override // com.bxkj.student.databinding.PubTitleBinding
    public void setIsHideBack(@androidx.annotation.Nullable java.lang.Boolean r5) {
            r4 = this;
            r4.mIsHideBack = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 2
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 12
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    @Override // com.bxkj.student.databinding.PubTitleBinding
    public void setTitle(@androidx.annotation.Nullable java.lang.String r5) {
            r4 = this;
            r4.mTitle = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 1
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 29
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    public boolean setVariable(int r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r2 = this;
            r0 = 29
            r1 = 1
            if (r0 != r3) goto Lb
            java.lang.String r4 = (java.lang.String) r4
            r2.setTitle(r4)
            return r1
        Lb:
            r0 = 12
            if (r0 != r3) goto L15
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r2.setIsHideBack(r4)
            return r1
        L15:
            if (r1 != r3) goto L1d
            androidx.appcompat.app.AppCompatActivity r4 = (androidx.appcompat.app.AppCompatActivity) r4
            r2.setActivity(r4)
            return r1
        L1d:
            r3 = 0
            return r3
    }
}
