package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class V2MainTabMyFragmentBindingImpl extends com.bxkj.student.databinding.V2MainTabMyFragmentBinding implements com.bxkj.student.generated.callback.a.InterfaceC0073a {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback20;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.V2MainTabMyFragmentBindingImpl.sViewsWithIds = r0
            r1 = 2131299164(0x7f090b5c, float:1.8216322E38)
            r2 = 5
            r0.put(r1, r2)
            r1 = 2131298412(0x7f09086c, float:1.8214796E38)
            r2 = 6
            r0.put(r1, r2)
            r1 = 2131296697(0x7f0901b9, float:1.8211318E38)
            r2 = 7
            r0.put(r1, r2)
            r1 = 2131297148(0x7f09037c, float:1.8212233E38)
            r2 = 8
            r0.put(r1, r2)
            r1 = 2131298431(0x7f09087f, float:1.8214835E38)
            r2 = 9
            r0.put(r1, r2)
            return
    }

    public V2MainTabMyFragmentBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.V2MainTabMyFragmentBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.V2MainTabMyFragmentBindingImpl.sViewsWithIds
            r2 = 10
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private V2MainTabMyFragmentBindingImpl(androidx.databinding.DataBindingComponent r15, android.view.View r16, java.lang.Object[] r17) {
            r14 = this;
            r0 = 4
            r0 = r17[r0]
            r5 = r0
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r0 = 7
            r0 = r17[r0]
            r6 = r0
            androidx.cardview.widget.CardView r6 = (androidx.cardview.widget.CardView) r6
            r0 = 8
            r0 = r17[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 6
            r0 = r17[r0]
            r8 = r0
            androidx.core.widget.NestedScrollView r8 = (androidx.core.widget.NestedScrollView) r8
            r0 = 9
            r0 = r17[r0]
            r9 = r0
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            r0 = 2
            r0 = r17[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 1
            r1 = r17[r0]
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1 = 5
            r1 = r17[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r1 = 3
            r1 = r17[r1]
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            r4 = 0
            r1 = r14
            r2 = r15
            r3 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = -1
            r14.mDirtyFlags = r2
            com.google.android.material.button.MaterialButton r15 = r14.btLogout
            r2 = 0
            r15.setTag(r2)
            r15 = 0
            r15 = r17[r15]
            androidx.constraintlayout.widget.ConstraintLayout r15 = (androidx.constraintlayout.widget.ConstraintLayout) r15
            r14.mboundView0 = r15
            r15.setTag(r2)
            android.widget.TextView r15 = r14.tvName
            r15.setTag(r2)
            android.widget.TextView r15 = r14.tvSchool
            r15.setTag(r2)
            android.widget.TextView r15 = r14.tvUserNumber
            r15.setTag(r2)
            r3 = r16
            r14.setRootTag(r3)
            com.bxkj.student.generated.callback.a r15 = new com.bxkj.student.generated.callback.a
            r15.<init>(r14, r0)
            r14.mCallback20 = r15
            r14.invalidateAll()
            return
    }

    @Override // com.bxkj.student.generated.callback.a.InterfaceC0073a
    public final void _internalCallbackOnClick(int r1, android.view.View r2) {
            r0 = this;
            com.bxkj.student.v2.ui.main.MyFragment r1 = r0.mMyFragment
            if (r1 == 0) goto L7
            r1.i()
        L7:
            return
    }

    protected void executeBindings() {
            r10 = this;
            monitor-enter(r10)
            long r0 = r10.mDirtyFlags     // Catch: java.lang.Throwable -> L43
            r2 = 0
            r10.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L43
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L43
            com.bxkj.base.v2.data.b r4 = r10.mLoggedInUser
            r5 = 6
            long r5 = r5 & r0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 == 0) goto L20
            if (r4 == 0) goto L20
            java.lang.String r5 = r4.U()
            java.lang.String r6 = r4.L()
            java.lang.String r4 = r4.S()
            goto L23
        L20:
            r5 = 0
            r4 = r5
            r6 = r4
        L23:
            r8 = 4
            long r0 = r0 & r8
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 == 0) goto L31
            com.google.android.material.button.MaterialButton r0 = r10.btLogout
            android.view.View$OnClickListener r1 = r10.mCallback20
            r0.setOnClickListener(r1)
        L31:
            if (r7 == 0) goto L42
            android.widget.TextView r0 = r10.tvName
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r5)
            android.widget.TextView r0 = r10.tvSchool
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r6)
            android.widget.TextView r0 = r10.tvUserNumber
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r4)
        L42:
            return
        L43:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L43
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
            r0 = 4
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

    @Override // com.bxkj.student.databinding.V2MainTabMyFragmentBinding
    public void setLoggedInUser(@androidx.annotation.Nullable com.bxkj.base.v2.data.b r5) {
            r4 = this;
            r4.mLoggedInUser = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 2
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 14
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    @Override // com.bxkj.student.databinding.V2MainTabMyFragmentBinding
    public void setMyFragment(@androidx.annotation.Nullable com.bxkj.student.v2.ui.main.MyFragment r5) {
            r4 = this;
            r4.mMyFragment = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 1
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 21
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
            r0 = 21
            r1 = 1
            if (r0 != r3) goto Lb
            com.bxkj.student.v2.ui.main.MyFragment r4 = (com.bxkj.student.v2.ui.main.MyFragment) r4
            r2.setMyFragment(r4)
            return r1
        Lb:
            r0 = 14
            if (r0 != r3) goto L15
            com.bxkj.base.v2.data.b r4 = (com.bxkj.base.v2.data.b) r4
            r2.setLoggedInUser(r4)
            return r1
        L15:
            r3 = 0
            return r3
    }
}
