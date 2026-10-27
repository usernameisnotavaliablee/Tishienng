package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class FragmentManagerViewModel extends androidx.lifecycle.ViewModel {
    private static final androidx.lifecycle.ViewModelProvider.Factory FACTORY = null;
    private static final java.lang.String TAG = "FragmentManager";
    private final java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> mChildNonConfigs;
    private boolean mHasBeenCleared;
    private boolean mHasSavedSnapshot;
    private boolean mIsStateSaved;
    private final java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> mRetainedFragments;
    private final boolean mStateAutomaticallySaved;
    private final java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> mViewModelStores;


    static {
            androidx.fragment.app.FragmentManagerViewModel$1 r0 = new androidx.fragment.app.FragmentManagerViewModel$1
            r0.<init>()
            androidx.fragment.app.FragmentManagerViewModel.FACTORY = r0
            return
    }

    FragmentManagerViewModel(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mRetainedFragments = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mChildNonConfigs = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mViewModelStores = r0
            r0 = 0
            r1.mHasBeenCleared = r0
            r1.mHasSavedSnapshot = r0
            r1.mIsStateSaved = r0
            r1.mStateAutomaticallySaved = r2
            return
    }

    @androidx.annotation.NonNull
    static androidx.fragment.app.FragmentManagerViewModel getInstance(androidx.lifecycle.ViewModelStore r2) {
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            androidx.lifecycle.ViewModelProvider$Factory r1 = androidx.fragment.app.FragmentManagerViewModel.FACTORY
            r0.<init>(r2, r1)
            java.lang.Class<androidx.fragment.app.FragmentManagerViewModel> r2 = androidx.fragment.app.FragmentManagerViewModel.class
            androidx.lifecycle.ViewModel r2 = r0.get(r2)
            androidx.fragment.app.FragmentManagerViewModel r2 = (androidx.fragment.app.FragmentManagerViewModel) r2
            return r2
    }

    void addRetainedFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            boolean r0 = r3.mIsStateSaved
            r1 = 2
            if (r0 == 0) goto L9
            androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            return
        L9:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r3.mRetainedFragments
            java.lang.String r2 = r4.mWho
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L14
            goto L24
        L14:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r3.mRetainedFragments
            java.lang.String r2 = r4.mWho
            r0.put(r2, r4)
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            if (r0 == 0) goto L24
            r4.toString()
        L24:
            return
    }

    void clearNonConfigState(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto La
            java.util.Objects.toString(r3)
        La:
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r0 = r2.mChildNonConfigs
            java.lang.String r1 = r3.mWho
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.FragmentManagerViewModel r0 = (androidx.fragment.app.FragmentManagerViewModel) r0
            if (r0 == 0) goto L20
            r0.onCleared()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r0 = r2.mChildNonConfigs
            java.lang.String r1 = r3.mWho
            r0.remove(r1)
        L20:
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r2.mViewModelStores
            java.lang.String r1 = r3.mWho
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.ViewModelStore r0 = (androidx.lifecycle.ViewModelStore) r0
            if (r0 == 0) goto L36
            r0.clear()
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r2.mViewModelStores
            java.lang.String r3 = r3.mWho
            r0.remove(r3)
        L36:
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L31
            java.lang.Class<androidx.fragment.app.FragmentManagerViewModel> r2 = androidx.fragment.app.FragmentManagerViewModel.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L31
        L10:
            androidx.fragment.app.FragmentManagerViewModel r5 = (androidx.fragment.app.FragmentManagerViewModel) r5
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r2 = r4.mRetainedFragments
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r3 = r5.mRetainedFragments
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r2 = r4.mChildNonConfigs
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r3 = r5.mChildNonConfigs
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r2 = r4.mViewModelStores
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r5 = r5.mViewModelStores
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L31
            return r0
        L31:
            return r1
    }

    @androidx.annotation.Nullable
    androidx.fragment.app.Fragment findRetainedFragmentByWho(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r1.mRetainedFragments
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            return r2
    }

    @androidx.annotation.NonNull
    androidx.fragment.app.FragmentManagerViewModel getChildNonConfig(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r0 = r2.mChildNonConfigs
            java.lang.String r1 = r3.mWho
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.FragmentManagerViewModel r0 = (androidx.fragment.app.FragmentManagerViewModel) r0
            if (r0 != 0) goto L1a
            androidx.fragment.app.FragmentManagerViewModel r0 = new androidx.fragment.app.FragmentManagerViewModel
            boolean r1 = r2.mStateAutomaticallySaved
            r0.<init>(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r1 = r2.mChildNonConfigs
            java.lang.String r3 = r3.mWho
            r1.put(r3, r0)
        L1a:
            return r0
    }

    @androidx.annotation.NonNull
    java.util.Collection<androidx.fragment.app.Fragment> getRetainedFragments() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r2.mRetainedFragments
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    androidx.fragment.app.FragmentManagerNonConfig getSnapshot() {
            r5 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r5.mRetainedFragments
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L1a
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r0 = r5.mChildNonConfigs
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r5.mViewModelStores
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            return r1
        L1a:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r2 = r5.mChildNonConfigs
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            androidx.fragment.app.FragmentManagerViewModel r4 = (androidx.fragment.app.FragmentManagerViewModel) r4
            androidx.fragment.app.FragmentManagerNonConfig r4 = r4.getSnapshot()
            if (r4 == 0) goto L29
            java.lang.Object r3 = r3.getKey()
            r0.put(r3, r4)
            goto L29
        L49:
            r2 = 1
            r5.mHasSavedSnapshot = r2
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r2 = r5.mRetainedFragments
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L63
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L63
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r2 = r5.mViewModelStores
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L63
            return r1
        L63:
            androidx.fragment.app.FragmentManagerNonConfig r1 = new androidx.fragment.app.FragmentManagerNonConfig
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r3 = r5.mRetainedFragments
            java.util.Collection r3 = r3.values()
            r2.<init>(r3)
            java.util.HashMap r3 = new java.util.HashMap
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r4 = r5.mViewModelStores
            r3.<init>(r4)
            r1.<init>(r2, r0, r3)
            return r1
    }

    @androidx.annotation.NonNull
    androidx.lifecycle.ViewModelStore getViewModelStore(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r2.mViewModelStores
            java.lang.String r1 = r3.mWho
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.ViewModelStore r0 = (androidx.lifecycle.ViewModelStore) r0
            if (r0 != 0) goto L18
            androidx.lifecycle.ViewModelStore r0 = new androidx.lifecycle.ViewModelStore
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r1 = r2.mViewModelStores
            java.lang.String r3 = r3.mWho
            r1.put(r3, r0)
        L18:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r2.mRetainedFragments
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r1 = r2.mChildNonConfigs
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r1 = r2.mViewModelStores
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    boolean isCleared() {
            r1 = this;
            boolean r0 = r1.mHasBeenCleared
            return r0
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
            r1 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto La
            r1.toString()
        La:
            r0 = 1
            r1.mHasBeenCleared = r0
            return
    }

    void removeRetainedFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            boolean r0 = r3.mIsStateSaved
            r1 = 2
            if (r0 == 0) goto L9
            androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            return
        L9:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r3.mRetainedFragments
            java.lang.String r2 = r4.mWho
            java.lang.Object r0 = r0.remove(r2)
            if (r0 == 0) goto L1c
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            if (r0 == 0) goto L1c
            r4.toString()
        L1c:
            return
    }

    @java.lang.Deprecated
    void restoreFromSnapshot(@androidx.annotation.Nullable androidx.fragment.app.FragmentManagerNonConfig r5) {
            r4 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r4.mRetainedFragments
            r0.clear()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r0 = r4.mChildNonConfigs
            r0.clear()
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r4.mViewModelStores
            r0.clear()
            if (r5 == 0) goto L70
            java.util.Collection r0 = r5.getFragments()
            if (r0 == 0) goto L31
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1b
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r2 = r4.mRetainedFragments
            java.lang.String r3 = r1.mWho
            r2.put(r3, r1)
            goto L1b
        L31:
            java.util.Map r0 = r5.getChildNonConfigs()
            if (r0 == 0) goto L65
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L3f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            androidx.fragment.app.FragmentManagerViewModel r2 = new androidx.fragment.app.FragmentManagerViewModel
            boolean r3 = r4.mStateAutomaticallySaved
            r2.<init>(r3)
            java.lang.Object r3 = r1.getValue()
            androidx.fragment.app.FragmentManagerNonConfig r3 = (androidx.fragment.app.FragmentManagerNonConfig) r3
            r2.restoreFromSnapshot(r3)
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r3 = r4.mChildNonConfigs
            java.lang.Object r1 = r1.getKey()
            r3.put(r1, r2)
            goto L3f
        L65:
            java.util.Map r5 = r5.getViewModelStores()
            if (r5 == 0) goto L70
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r4.mViewModelStores
            r0.putAll(r5)
        L70:
            r5 = 0
            r4.mHasSavedSnapshot = r5
            return
    }

    void setIsStateSaved(boolean r1) {
            r0 = this;
            r0.mIsStateSaved = r1
            return
    }

    boolean shouldDestroy(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r1.mRetainedFragments
            java.lang.String r2 = r2.mWho
            boolean r2 = r0.containsKey(r2)
            r0 = 1
            if (r2 != 0) goto Lc
            return r0
        Lc:
            boolean r2 = r1.mStateAutomaticallySaved
            if (r2 == 0) goto L13
            boolean r2 = r1.mHasBeenCleared
            return r2
        L13:
            boolean r2 = r1.mHasSavedSnapshot
            r2 = r2 ^ r0
            return r2
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FragmentManagerViewModel{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "} Fragments ("
            r0.append(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r4.mRetainedFragments
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = ", "
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            r0.append(r3)
            goto L22
        L3b:
            java.lang.String r1 = ") Child Non Config ("
            r0.append(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r1 = r4.mChildNonConfigs
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L4a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4a
            r0.append(r3)
            goto L4a
        L63:
            java.lang.String r1 = ") ViewModelStores ("
            r0.append(r1)
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r1 = r4.mViewModelStores
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L72:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L72
            r0.append(r3)
            goto L72
        L8b:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
