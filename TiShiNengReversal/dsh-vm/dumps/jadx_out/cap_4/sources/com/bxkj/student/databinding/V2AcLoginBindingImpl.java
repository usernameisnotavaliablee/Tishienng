package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class V2AcLoginBindingImpl extends com.bxkj.student.databinding.V2AcLoginBinding implements com.bxkj.student.generated.callback.a.InterfaceC0073a {

    @androidx.annotation.Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;

    @androidx.annotation.Nullable
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private androidx.databinding.InverseBindingListener etAccountandroidTextAttrChanged;
    private androidx.databinding.InverseBindingListener etPasswordandroidTextAttrChanged;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback11;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback12;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback13;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback14;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback15;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback16;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback17;

    @androidx.annotation.Nullable
    private final android.view.View.OnClickListener mCallback18;
    private long mDirtyFlags;

    @androidx.annotation.NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements androidx.databinding.InverseBindingListener {
        final /* synthetic */ com.bxkj.student.databinding.V2AcLoginBindingImpl a;

        a(com.bxkj.student.databinding.V2AcLoginBindingImpl r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onChange() {
                r2 = this;
                com.bxkj.student.databinding.V2AcLoginBindingImpl r0 = r2.a
                android.widget.EditText r0 = r0.etAccount
                java.lang.String r0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(r0)
                com.bxkj.student.databinding.V2AcLoginBindingImpl r1 = r2.a
                com.bxkj.student.v2.vm.LoginViewModel r1 = r1.mLoginViewModel
                if (r1 == 0) goto L17
                androidx.databinding.ObservableField r1 = r1.I()
                if (r1 == 0) goto L17
                r1.set(r0)
            L17:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements androidx.databinding.InverseBindingListener {
        final /* synthetic */ com.bxkj.student.databinding.V2AcLoginBindingImpl a;

        b(com.bxkj.student.databinding.V2AcLoginBindingImpl r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onChange() {
                r2 = this;
                com.bxkj.student.databinding.V2AcLoginBindingImpl r0 = r2.a
                android.widget.EditText r0 = r0.etPassword
                java.lang.String r0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(r0)
                com.bxkj.student.databinding.V2AcLoginBindingImpl r1 = r2.a
                com.bxkj.student.v2.vm.LoginViewModel r1 = r1.mLoginViewModel
                if (r1 == 0) goto L17
                androidx.databinding.ObservableField r1 = r1.G()
                if (r1 == 0) goto L17
                r1.set(r0)
            L17:
                return
        }
    }

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bxkj.student.databinding.V2AcLoginBindingImpl.sViewsWithIds = r0
            r1 = 2131297182(0x7f09039e, float:1.8212302E38)
            r2 = 12
            r0.put(r1, r2)
            r1 = 2131298968(0x7f090a98, float:1.8215924E38)
            r2 = 13
            r0.put(r1, r2)
            r1 = 2131298009(0x7f0906d9, float:1.821398E38)
            r2 = 14
            r0.put(r1, r2)
            r1 = 2131298057(0x7f090709, float:1.8214076E38)
            r2 = 15
            r0.put(r1, r2)
            r1 = 2131298013(0x7f0906dd, float:1.8213987E38)
            r2 = 16
            r0.put(r1, r2)
            r1 = 2131296716(0x7f0901cc, float:1.8211357E38)
            r2 = 17
            r0.put(r1, r2)
            r1 = 2131298774(0x7f0909d6, float:1.821553E38)
            r2 = 18
            r0.put(r1, r2)
            r1 = 2131299007(0x7f090abf, float:1.8216003E38)
            r2 = 19
            r0.put(r1, r2)
            return
    }

    public V2AcLoginBindingImpl(@androidx.annotation.Nullable androidx.databinding.DataBindingComponent r4, @androidx.annotation.NonNull android.view.View r5) {
            r3 = this;
            androidx.databinding.ViewDataBinding$IncludedLayouts r0 = com.bxkj.student.databinding.V2AcLoginBindingImpl.sIncludes
            android.util.SparseIntArray r1 = com.bxkj.student.databinding.V2AcLoginBindingImpl.sViewsWithIds
            r2 = 20
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.mapBindings(r4, r5, r2, r0, r1)
            r3.<init>(r4, r5, r0)
            return
    }

    private V2AcLoginBindingImpl(androidx.databinding.DataBindingComponent r27, android.view.View r28, java.lang.Object[] r29) {
            r26 = this;
            r0 = 5
            r1 = r29[r0]
            r4 = r1
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r1 = 4
            r2 = r29[r1]
            r5 = r2
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r2 = 17
            r2 = r29[r2]
            r6 = r2
            android.widget.CheckBox r6 = (android.widget.CheckBox) r6
            r2 = 2
            r3 = r29[r2]
            r7 = r3
            android.widget.EditText r7 = (android.widget.EditText) r7
            r3 = 3
            r8 = r29[r3]
            android.widget.EditText r8 = (android.widget.EditText) r8
            r9 = 12
            r9 = r29[r9]
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r10 = 11
            r10 = r29[r10]
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r11 = 10
            r11 = r29[r11]
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r12 = 9
            r12 = r29[r12]
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r13 = 14
            r13 = r29[r13]
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r14 = 16
            r14 = r29[r14]
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r15 = 15
            r15 = r29[r15]
            android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
            r16 = 18
            r16 = r29[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r3 = 6
            r18 = r29[r3]
            android.widget.TextView r18 = (android.widget.TextView) r18
            r3 = 7
            r20 = r29[r3]
            android.widget.TextView r20 = (android.widget.TextView) r20
            r21 = 13
            r21 = r29[r21]
            android.widget.TextView r21 = (android.widget.TextView) r21
            r22 = 19
            r22 = r29[r22]
            android.widget.TextView r22 = (android.widget.TextView) r22
            r3 = 1
            r23 = r29[r3]
            android.widget.TextView r23 = (android.widget.TextView) r23
            r3 = 8
            r24 = r29[r3]
            android.widget.TextView r24 = (android.widget.TextView) r24
            r25 = 8
            r3 = 2
            r0 = r26
            r1 = r27
            r2 = r28
            r17 = r18
            r18 = r20
            r19 = r21
            r20 = r22
            r21 = r23
            r22 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            com.bxkj.student.databinding.V2AcLoginBindingImpl$a r1 = new com.bxkj.student.databinding.V2AcLoginBindingImpl$a
            r1.<init>(r0)
            r0.etAccountandroidTextAttrChanged = r1
            com.bxkj.student.databinding.V2AcLoginBindingImpl$b r1 = new com.bxkj.student.databinding.V2AcLoginBindingImpl$b
            r1.<init>(r0)
            r0.etPasswordandroidTextAttrChanged = r1
            r1 = -1
            r0.mDirtyFlags = r1
            com.google.android.material.button.MaterialButton r1 = r0.btAuthCenter
            r2 = 0
            r1.setTag(r2)
            com.google.android.material.button.MaterialButton r1 = r0.btLogin
            r1.setTag(r2)
            android.widget.EditText r1 = r0.etAccount
            r1.setTag(r2)
            android.widget.EditText r1 = r0.etPassword
            r1.setTag(r2)
            android.widget.ImageView r1 = r0.ivPhone
            r1.setTag(r2)
            android.widget.ImageView r1 = r0.ivQq
            r1.setTag(r2)
            android.widget.ImageView r1 = r0.ivWechat
            r1.setTag(r2)
            r1 = 0
            r1 = r29[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r0.mboundView0 = r1
            r1.setTag(r2)
            android.widget.TextView r1 = r0.tvFindPassword
            r1.setTag(r2)
            android.widget.TextView r1 = r0.tvHelp
            r1.setTag(r2)
            android.widget.TextView r1 = r0.tvSchoolName
            r1.setTag(r2)
            android.widget.TextView r1 = r0.tvSwitchSchool
            r1.setTag(r2)
            r2 = r28
            r0.setRootTag(r2)
            com.bxkj.student.generated.callback.a r1 = new com.bxkj.student.generated.callback.a
            r2 = 7
            r1.<init>(r0, r2)
            r0.mCallback17 = r1
            com.bxkj.student.generated.callback.a r1 = new com.bxkj.student.generated.callback.a
            r2 = 5
            r1.<init>(r0, r2)
            r0.mCallback15 = r1
            com.bxkj.student.generated.callback.a r1 = new com.bxkj.student.generated.callback.a
            r2 = 3
            r1.<init>(r0, r2)
            r0.mCallback13 = r1
            com.bxkj.student.generated.callback.a r1 = new com.bxkj.student.generated.callback.a
            r2 = 1
            r1.<init>(r0, r2)
            r0.mCallback11 = r1
            com.bxkj.student.generated.callback.a r1 = new com.bxkj.student.generated.callback.a
            r2 = 6
            r1.<init>(r0, r2)
            r0.mCallback16 = r1
            com.bxkj.student.generated.callback.a r1 = new com.bxkj.student.generated.callback.a
            r2 = 4
            r1.<init>(r0, r2)
            r0.mCallback14 = r1
            com.bxkj.student.generated.callback.a r1 = new com.bxkj.student.generated.callback.a
            r2 = 2
            r1.<init>(r0, r2)
            r0.mCallback12 = r1
            com.bxkj.student.generated.callback.a r1 = new com.bxkj.student.generated.callback.a
            r2 = 8
            r1.<init>(r0, r2)
            r0.mCallback18 = r1
            r0.invalidateAll()
            return
    }

    private boolean onChangeLoginViewModelPassword(androidx.databinding.ObservableField<java.lang.String> r3, int r4) {
            r2 = this;
            if (r4 != 0) goto L10
            monitor-enter(r2)
            long r3 = r2.mDirtyFlags     // Catch: java.lang.Throwable -> Ld
            r0 = 2
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

    private boolean onChangeLoginViewModelUsername(androidx.databinding.ObservableField<java.lang.String> r3, int r4) {
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
            switch(r1) {
                case 1: goto L3c;
                case 2: goto L34;
                case 3: goto L2c;
                case 4: goto L24;
                case 5: goto L1c;
                case 6: goto L14;
                case 7: goto Lc;
                case 8: goto L4;
                default: goto L3;
            }
        L3:
            return
        L4:
            com.bxkj.student.v2.ui.LoginActivity r1 = r0.mActivity
            if (r1 == 0) goto Lb
            r1.U()
        Lb:
            return
        Lc:
            com.bxkj.student.v2.ui.LoginActivity r1 = r0.mActivity
            if (r1 == 0) goto L13
            r1.X()
        L13:
            return
        L14:
            com.bxkj.student.v2.ui.LoginActivity r1 = r0.mActivity
            if (r1 == 0) goto L1b
            r1.a0()
        L1b:
            return
        L1c:
            com.bxkj.student.v2.ui.LoginActivity r1 = r0.mActivity
            if (r1 == 0) goto L23
            r1.e0()
        L23:
            return
        L24:
            com.bxkj.student.v2.ui.LoginActivity r1 = r0.mActivity
            if (r1 == 0) goto L2b
            r1.O()
        L2b:
            return
        L2c:
            com.bxkj.student.v2.ui.LoginActivity r1 = r0.mActivity
            if (r1 == 0) goto L33
            r1.M()
        L33:
            return
        L34:
            com.bxkj.student.v2.ui.LoginActivity r1 = r0.mActivity
            if (r1 == 0) goto L3b
            r1.T()
        L3b:
            return
        L3c:
            com.bxkj.student.v2.ui.LoginActivity r1 = r0.mActivity
            if (r1 == 0) goto L43
            r1.S()
        L43:
            return
    }

    protected void executeBindings() {
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            long r2 = r1.mDirtyFlags     // Catch: java.lang.Throwable -> Le1
            r4 = 0
            r1.mDirtyFlags = r4     // Catch: java.lang.Throwable -> Le1
            monitor-exit(r17)     // Catch: java.lang.Throwable -> Le1
            com.bxkj.base.v2.data.b r0 = r1.mLoginInUser
            com.bxkj.student.v2.vm.LoginViewModel r6 = r1.mLoginViewModel
            r7 = 72
            long r7 = r7 & r2
            r9 = 0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 == 0) goto L30
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.L()
            goto L1e
        L1d:
            r0 = r9
        L1e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = "欢迎您"
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            goto L31
        L30:
            r0 = r9
        L31:
            r7 = 99
            long r7 = r7 & r2
            r11 = 98
            r13 = 97
            int r15 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r15 == 0) goto L75
            long r7 = r2 & r13
            int r15 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r15 == 0) goto L57
            if (r6 == 0) goto L49
            androidx.databinding.ObservableField r7 = r6.I()
            goto L4a
        L49:
            r7 = r9
        L4a:
            r8 = 0
            r1.updateRegistration(r8, r7)
            if (r7 == 0) goto L57
            java.lang.Object r7 = r7.get()
            java.lang.String r7 = (java.lang.String) r7
            goto L58
        L57:
            r7 = r9
        L58:
            long r15 = r2 & r11
            int r8 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r8 == 0) goto L73
            if (r6 == 0) goto L65
            androidx.databinding.ObservableField r6 = r6.G()
            goto L66
        L65:
            r6 = r9
        L66:
            r8 = 1
            r1.updateRegistration(r8, r6)
            if (r6 == 0) goto L73
            java.lang.Object r6 = r6.get()
            java.lang.String r6 = (java.lang.String) r6
            goto L77
        L73:
            r6 = r9
            goto L77
        L75:
            r6 = r9
            r7 = r6
        L77:
            r15 = 64
            long r15 = r15 & r2
            int r8 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r8 == 0) goto Lc4
            com.google.android.material.button.MaterialButton r8 = r1.btAuthCenter
            android.view.View$OnClickListener r15 = r1.mCallback12
            r8.setOnClickListener(r15)
            com.google.android.material.button.MaterialButton r8 = r1.btLogin
            android.view.View$OnClickListener r15 = r1.mCallback11
            r8.setOnClickListener(r15)
            android.widget.EditText r8 = r1.etAccount
            androidx.databinding.InverseBindingListener r15 = r1.etAccountandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r8, r9, r9, r9, r15)
            android.widget.EditText r8 = r1.etPassword
            androidx.databinding.InverseBindingListener r15 = r1.etPasswordandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r8, r9, r9, r9, r15)
            android.widget.ImageView r8 = r1.ivPhone
            android.view.View$OnClickListener r9 = r1.mCallback18
            r8.setOnClickListener(r9)
            android.widget.ImageView r8 = r1.ivQq
            android.view.View$OnClickListener r9 = r1.mCallback17
            r8.setOnClickListener(r9)
            android.widget.ImageView r8 = r1.ivWechat
            android.view.View$OnClickListener r9 = r1.mCallback16
            r8.setOnClickListener(r9)
            android.widget.TextView r8 = r1.tvFindPassword
            android.view.View$OnClickListener r9 = r1.mCallback13
            r8.setOnClickListener(r9)
            android.widget.TextView r8 = r1.tvHelp
            android.view.View$OnClickListener r9 = r1.mCallback14
            r8.setOnClickListener(r9)
            android.widget.TextView r8 = r1.tvSwitchSchool
            android.view.View$OnClickListener r9 = r1.mCallback15
            r8.setOnClickListener(r9)
        Lc4:
            long r8 = r2 & r13
            int r13 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r13 == 0) goto Lcf
            android.widget.EditText r8 = r1.etAccount
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r8, r7)
        Lcf:
            long r2 = r2 & r11
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto Ld9
            android.widget.EditText r2 = r1.etPassword
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r2, r6)
        Ld9:
            if (r10 == 0) goto Le0
            android.widget.TextView r2 = r1.tvSchoolName
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r2, r0)
        Le0:
            return
        Le1:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> Le1
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
            r0 = 64
            r2.mDirtyFlags = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            r2.requestRebind()
            return
        La:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    protected boolean onFieldChange(int r2, java.lang.Object r3, int r4) {
            r1 = this;
            if (r2 == 0) goto Le
            r0 = 1
            if (r2 == r0) goto L7
            r2 = 0
            return r2
        L7:
            androidx.databinding.ObservableField r3 = (androidx.databinding.ObservableField) r3
            boolean r2 = r1.onChangeLoginViewModelPassword(r3, r4)
            return r2
        Le:
            androidx.databinding.ObservableField r3 = (androidx.databinding.ObservableField) r3
            boolean r2 = r1.onChangeLoginViewModelUsername(r3, r4)
            return r2
    }

    @Override // com.bxkj.student.databinding.V2AcLoginBinding
    public void setActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ui.LoginActivity r5) {
            r4 = this;
            r4.mActivity = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L13
            r2 = 16
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

    @Override // com.bxkj.student.databinding.V2AcLoginBinding
    public void setLoginInUser(@androidx.annotation.Nullable com.bxkj.base.v2.data.b r5) {
            r4 = this;
            r4.mLoginInUser = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 8
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 15
            r4.notifyPropertyChanged(r5)
            super.requestRebind()
            return
        L14:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    @Override // com.bxkj.student.databinding.V2AcLoginBinding
    public void setLoginViewModel(@androidx.annotation.Nullable com.bxkj.student.v2.vm.LoginViewModel r5) {
            r4 = this;
            r4.mLoginViewModel = r5
            monitor-enter(r4)
            long r0 = r4.mDirtyFlags     // Catch: java.lang.Throwable -> L14
            r2 = 32
            long r0 = r0 | r2
            r4.mDirtyFlags = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            r5 = 16
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
            r0 = 30
            r1 = 1
            if (r0 != r3) goto Lb
            java.lang.String r4 = (java.lang.String) r4
            r2.setVersion(r4)
            return r1
        Lb:
            r0 = 15
            if (r0 != r3) goto L15
            com.bxkj.base.v2.data.b r4 = (com.bxkj.base.v2.data.b) r4
            r2.setLoginInUser(r4)
            return r1
        L15:
            if (r1 != r3) goto L1d
            com.bxkj.student.v2.ui.LoginActivity r4 = (com.bxkj.student.v2.ui.LoginActivity) r4
            r2.setActivity(r4)
            return r1
        L1d:
            r0 = 16
            if (r0 != r3) goto L27
            com.bxkj.student.v2.vm.LoginViewModel r4 = (com.bxkj.student.v2.vm.LoginViewModel) r4
            r2.setLoginViewModel(r4)
            return r1
        L27:
            r3 = 0
            return r3
    }

    @Override // com.bxkj.student.databinding.V2AcLoginBinding
    public void setVersion(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            r0.mVersion = r1
            return
    }
}
