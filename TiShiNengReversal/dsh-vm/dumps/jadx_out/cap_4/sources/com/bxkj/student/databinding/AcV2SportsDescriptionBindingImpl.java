package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AcV2SportsDescriptionBindingImpl extends com.bxkj.student.databinding.AcV2SportsDescriptionBinding implements com.bxkj.student.generated.callback.a.InterfaceC0073a {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback37;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;

    static {
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = new androidx.databinding.ViewDataBinding$IncludedLayouts
            r1 = 5
            r0.<init>(r1)
            com.bxkj.student.databinding.AcV2SportsDescriptionBindingImpl.sIncludes = r0
            java.lang.String r1 = "new_pub_title"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 3
            int[] r2 = new int[]{r2}
            r3 = 2131493609(0x7f0c02e9, float:1.8610703E38)
            int[] r3 = new int[]{r3}
            r4 = 0
            r0.setIncludes(r4, r1, r2, r3)
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.AcV2SportsDescriptionBindingImpl.sViewsWithIds = r0
            r1 = 2131298609(0x7f090931, float:1.8215196E38)
            r2 = 4
            r0.put(r1, r2)
            return
    }

    public AcV2SportsDescriptionBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.AcV2SportsDescriptionBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.AcV2SportsDescriptionBindingImpl.sViewsWithIds
            r2 = 5
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private AcV2SportsDescriptionBindingImpl(androidx.databinding.DataBindingComponent r10, android.view.View r11, java.lang.Object[] r12) {
            r9 = this;
            r0 = 2
            r0 = r12[r0]
            r5 = r0
            android.widget.Button r5 = (android.widget.Button) r5
            r0 = 1
            r1 = r12[r0]
            r6 = r1
            android.widget.CheckBox r6 = (android.widget.CheckBox) r6
            r1 = 4
            r1 = r12[r1]
            r7 = r1
            cn.bluemobi.dylan.smartwebview.SmartWebView r7 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r7
            r1 = 3
            r1 = r12[r1]
            r8 = r1
            com.bxkj.base.databinding.NewPubTitleBinding r8 = (com.bxkj.base.databinding.NewPubTitleBinding) r8
            r4 = 1
            r1 = r9
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r10 = -1
            r1.mDirtyFlags = r10
            android.widget.Button r10 = r1.btStart
            r11 = 0
            r10.setTag(r11)
            android.widget.CheckBox r10 = r1.cbIgnore
            r10.setTag(r11)
            r10 = 0
            r10 = r12[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r1.mboundView0 = r10
            r10.setTag(r11)
            com.bxkj.base.databinding.NewPubTitleBinding r10 = r1.titleLayout
            r9.setContainedBinding(r10)
            r9.setRootTag(r3)
            com.bxkj.student.generated.callback.a r10 = new com.bxkj.student.generated.callback.a
            r10.<init>(r9, r0)
            r1.mCallback37 = r10
            r9.invalidateAll()
            return
    }

    private boolean onChangeTitleLayout(com.bxkj.base.databinding.NewPubTitleBinding r3, int r4) {
            r2 = this;
            if (r4 != 0) goto L10
            monitor-enter(r2)
            long r3 = r2.mDirtyFlags     // Catch: java.lang.Throwable -> Ld
            r0 = 1
            long r3 = r3 | r0
            r2.mDirtyFlags = r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            r3 = 1
            return r3
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
        L10:
            r3 = 0
            return r3
    }

    @Override // com.bxkj.student.generated.callback.a.InterfaceC0073a
    public final void _internalCallbackOnClick(int r1, android.view.View r2) {
            r0 = this;
            com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity r1 = r0.mMActivity
            if (r1 == 0) goto L7
            r1.L()
        L7:
            return
    }

    protected void executeBindings() {
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.mDirtyFlags     // Catch: java.lang.Throwable -> L79
            r2 = 0
            r15.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L79
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L79
            java.lang.Boolean r4 = r15.mStartButtonEnable
            java.lang.Boolean r5 = r15.mShowBottom
            com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity r6 = r15.mMActivity
            r7 = 18
            long r9 = r0 & r7
            r11 = 0
            int r12 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r12 == 0) goto L1c
            boolean r4 = androidx.databinding.ViewDataBinding.safeUnbox(r4)
            goto L1d
        L1c:
            r4 = 0
        L1d:
            r9 = 20
            long r12 = r0 & r9
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 == 0) goto L39
            boolean r5 = androidx.databinding.ViewDataBinding.safeUnbox(r5)
            if (r14 == 0) goto L34
            if (r5 == 0) goto L31
            r12 = 64
        L2f:
            long r0 = r0 | r12
            goto L34
        L31:
            r12 = 32
            goto L2f
        L34:
            if (r5 == 0) goto L37
            goto L39
        L37:
            r11 = 8
        L39:
            r12 = 24
            long r12 = r12 & r0
            int r5 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            long r9 = r9 & r0
            int r12 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r12 == 0) goto L4d
            android.widget.Button r9 = r15.btStart
            r9.setVisibility(r11)
            android.widget.CheckBox r9 = r15.cbIgnore
            r9.setVisibility(r11)
        L4d:
            r9 = 16
            long r9 = r9 & r0
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 == 0) goto L62
            android.widget.Button r9 = r15.btStart
            android.view.View$OnClickListener r10 = r15.mCallback37
            r9.setOnClickListener(r10)
            com.bxkj.base.databinding.NewPubTitleBinding r9 = r15.titleLayout
            java.lang.String r10 = "锻炼说明"
            r9.setTitle(r10)
        L62:
            long r0 = r0 & r7
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L6c
            android.widget.Button r0 = r15.btStart
            r0.setEnabled(r4)
        L6c:
            if (r5 == 0) goto L73
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r15.titleLayout
            r0.setActivity(r6)
        L73:
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r15.titleLayout
            androidx.databinding.ViewDataBinding.executeBindingsOn(r0)
            return
        L79:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L79
            throw r0
    }

    public boolean hasPendingBindings() {
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.mDirtyFlags     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto Le
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            return r4
        Lc:
            r0 = move-exception
            goto L1a
        Le:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r6.titleLayout
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L18
            return r4
        L18:
            r0 = 0
            return r0
        L1a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public void invalidateAll() {
            r2 = this;
            monitor-enter(r2)
            r0 = 16
            r2.mDirtyFlags = r0     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r2.titleLayout
            r0.invalidateAll()
            r2.requestRebind()
            return
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    protected boolean onFieldChange(int r1, java.lang.Object r2, int r3) {
            r0 = this;
            if (r1 == 0) goto L4
            r1 = 0
            return r1
        L4:
            com.bxkj.base.databinding.NewPubTitleBinding r2 = (com.bxkj.base.databinding.NewPubTitleBinding) r2
            boolean r1 = r0.onChangeTitleLayout(r2, r3)
            return r1
    }

    public void setLifecycleOwner(@androidx.annotation.Nullable androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            super.setLifecycleOwner(r2)
            com.bxkj.base.databinding.NewPubTitleBinding r0 = r1.titleLayout
            r0.setLifecycleOwner(r2)
            return
    }

    @Override // com.bxkj.student.databinding.AcV2SportsDescriptionBinding
    public void setMActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity r5) {
            r4 = this;
            r4.mMActivity = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 8
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 17
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    @Override // com.bxkj.student.databinding.AcV2SportsDescriptionBinding
    public void setShowBottom(@androidx.annotation.Nullable java.lang.Boolean r5) {
            r4 = this;
            r4.mShowBottom = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 4
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 24
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    @Override // com.bxkj.student.databinding.AcV2SportsDescriptionBinding
    public void setStartButtonEnable(@androidx.annotation.Nullable java.lang.Boolean r5) {
            r4 = this;
            r4.mStartButtonEnable = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 2
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 27
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
            r0 = 27
            r1 = 1
            if (r0 != r3) goto Lb
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r2.setStartButtonEnable(r4)
            return r1
        Lb:
            r0 = 24
            if (r0 != r3) goto L15
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r2.setShowBottom(r4)
            return r1
        L15:
            r0 = 17
            if (r0 != r3) goto L1f
            com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity r4 = (com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity) r4
            r2.setMActivity(r4)
            return r1
        L1f:
            r3 = 0
            return r3
    }
}
