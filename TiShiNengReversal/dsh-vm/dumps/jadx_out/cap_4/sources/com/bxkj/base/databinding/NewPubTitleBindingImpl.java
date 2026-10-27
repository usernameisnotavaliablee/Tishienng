package com.bxkj.base.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class NewPubTitleBindingImpl extends com.bxkj.base.databinding.NewPubTitleBinding implements com.bxkj.base.generated.callback.a.InterfaceC0052a {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback1;
    private long mDirtyFlags;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.base.databinding.NewPubTitleBindingImpl.sViewsWithIds = r0
            int r1 = com.bxkj.base.R.id.toolbar
            r2 = 3
            r0.put(r1, r2)
            return
    }

    public NewPubTitleBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.base.databinding.NewPubTitleBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.base.databinding.NewPubTitleBindingImpl.sViewsWithIds
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private NewPubTitleBindingImpl(androidx.databinding.DataBindingComponent r11, android.view.View r12, java.lang.Object[] r13) {
            r10 = this;
            r0 = 1
            r1 = r13[r0]
            r6 = r1
            androidx.appcompat.widget.AppCompatImageButton r6 = (androidx.appcompat.widget.AppCompatImageButton) r6
            r1 = 0
            r1 = r13[r1]
            r7 = r1
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r1 = 3
            r1 = r13[r1]
            r8 = r1
            androidx.appcompat.widget.Toolbar r8 = (androidx.appcompat.widget.Toolbar) r8
            r1 = 2
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
            androidx.constraintlayout.widget.ConstraintLayout r11 = r2.llTitle
            r11.setTag(r12)
            com.bxkj.base.view.MarqueeTextView r11 = r2.tvTitle
            r11.setTag(r12)
            r10.setRootTag(r4)
            com.bxkj.base.generated.callback.a r11 = new com.bxkj.base.generated.callback.a
            r11.<init>(r10, r0)
            r2.mCallback1 = r11
            r10.invalidateAll()
            return
    }

    @Override // com.bxkj.base.generated.callback.a.InterfaceC0052a
    public final void _internalCallbackOnClick(int r1, android.view.View r2) {
            r0 = this;
            com.bxkj.base.v2.common.view.b r1 = r0.mActivity
            if (r1 == 0) goto L7
            r1.onBackPressed()
        L7:
            return
    }

    protected void executeBindings() {
            r12 = this;
            monitor-enter(r12)
            long r0 = r12.mDirtyFlags     // Catch: java.lang.Throwable -> L4c
            r2 = 0
            r12.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L4c
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
            if (r5 == 0) goto L35
            androidx.appcompat.widget.AppCompatImageButton r5 = r12.ibBack
            android.view.View$OnClickListener r8 = r12.mCallback1
            r5.setOnClickListener(r8)
        L35:
            long r6 = r6 & r0
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 == 0) goto L3f
            androidx.appcompat.widget.AppCompatImageButton r5 = r12.ibBack
            r5.setVisibility(r10)
        L3f:
            r5 = 9
            long r0 = r0 & r5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L4b
            com.bxkj.base.view.MarqueeTextView r0 = r12.tvTitle
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r4)
        L4b:
            return
        L4c:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L4c
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

    @Override // com.bxkj.base.databinding.NewPubTitleBinding
    public void setActivity(@androidx.annotation.Nullable com.bxkj.base.v2.common.view.b r5) {
            r4 = this;
            r4.mActivity = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 4
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            int r5 = com.bxkj.base.a.b
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    @Override // com.bxkj.base.databinding.NewPubTitleBinding
    public void setIsHideBack(@androidx.annotation.Nullable java.lang.Boolean r5) {
            r4 = this;
            r4.mIsHideBack = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 2
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            int r5 = com.bxkj.base.a.f546m
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    @Override // com.bxkj.base.databinding.NewPubTitleBinding
    public void setTitle(@androidx.annotation.Nullable java.lang.String r5) {
            r4 = this;
            r4.mTitle = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 1
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            int r5 = com.bxkj.base.a.D
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
            int r0 = com.bxkj.base.a.D
            r1 = 1
            if (r0 != r3) goto Lb
            java.lang.String r4 = (java.lang.String) r4
            r2.setTitle(r4)
            return r1
        Lb:
            int r0 = com.bxkj.base.a.f546m
            if (r0 != r3) goto L15
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r2.setIsHideBack(r4)
            return r1
        L15:
            int r0 = com.bxkj.base.a.b
            if (r0 != r3) goto L1f
            com.bxkj.base.v2.common.view.b r4 = (com.bxkj.base.v2.common.view.b) r4
            r2.setActivity(r4)
            return r1
        L1f:
            r3 = 0
            return r3
    }
}
