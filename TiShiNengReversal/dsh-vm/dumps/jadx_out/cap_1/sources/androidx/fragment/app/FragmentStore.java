package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class FragmentStore {
    private static final java.lang.String TAG = "FragmentManager";
    private final java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> mActive;
    private final java.util.ArrayList<androidx.fragment.app.Fragment> mAdded;
    private androidx.fragment.app.FragmentManagerViewModel mNonConfig;

    FragmentStore() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mAdded = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mActive = r0
            return
    }

    void addFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L18
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.mAdded     // Catch: java.lang.Throwable -> L15
            r1.add(r4)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            r0 = 1
            r4.mAdded = r0
            return
        L15:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r4
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment already added: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    void burpActive() {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r2.mActive
            java.util.Collection r0 = r0.values()
            r1 = 0
            java.util.Set r1 = java.util.Collections.singleton(r1)
            r0.removeAll(r1)
            return
    }

    boolean containsActiveFragment(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r1.mActive
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    void dispatchStateChange(int r3) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r2.mActive
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto La
            r1.setFragmentManagerState(r3)
            goto La
        L1c:
            return
    }

    void dump(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.Nullable java.io.FileDescriptor r5, @androidx.annotation.NonNull java.io.PrintWriter r6, @androidx.annotation.Nullable java.lang.String[] r7) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = "    "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r3.mActive
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L4d
            r6.print(r4)
            java.lang.String r1 = "Active Fragments:"
            r6.println(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r3.mActive
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            r6.print(r4)
            if (r2 == 0) goto L47
            androidx.fragment.app.Fragment r2 = r2.getFragment()
            r6.println(r2)
            r2.dump(r0, r5, r6, r7)
            goto L2b
        L47:
            java.lang.String r2 = "null"
            r6.println(r2)
            goto L2b
        L4d:
            java.util.ArrayList<androidx.fragment.app.Fragment> r5 = r3.mAdded
            int r5 = r5.size()
            if (r5 <= 0) goto L82
            r6.print(r4)
            java.lang.String r7 = "Added Fragments:"
            r6.println(r7)
            r7 = 0
        L5e:
            if (r7 >= r5) goto L82
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            java.lang.Object r0 = r0.get(r7)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r6.print(r4)
            java.lang.String r1 = "  #"
            r6.print(r1)
            r6.print(r7)
            java.lang.String r1 = ": "
            r6.print(r1)
            java.lang.String r0 = r0.toString()
            r6.println(r0)
            int r7 = r7 + 1
            goto L5e
        L82:
            return
    }

    @androidx.annotation.Nullable
    androidx.fragment.app.Fragment findActiveFragment(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r1.mActive
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            if (r2 == 0) goto Lf
            androidx.fragment.app.Fragment r2 = r2.getFragment()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    androidx.fragment.app.Fragment findFragmentById(@androidx.annotation.IdRes int r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L1c
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.mAdded
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L19
            int r2 = r1.mFragmentId
            if (r2 != r4) goto L19
            return r1
        L19:
            int r0 = r0 + (-1)
            goto L8
        L1c:
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r3.mActive
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto L26
            androidx.fragment.app.Fragment r1 = r1.getFragment()
            int r2 = r1.mFragmentId
            if (r2 != r4) goto L26
            return r1
        L3d:
            r4 = 0
            return r4
    }

    @androidx.annotation.Nullable
    androidx.fragment.app.Fragment findFragmentByTag(@androidx.annotation.Nullable java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L22
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L22
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.mAdded
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1f
            java.lang.String r2 = r1.mTag
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1f
            return r1
        L1f:
            int r0 = r0 + (-1)
            goto La
        L22:
            if (r4 == 0) goto L49
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r3.mActive
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto L2e
            androidx.fragment.app.Fragment r1 = r1.getFragment()
            java.lang.String r2 = r1.mTag
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L2e
            return r1
        L49:
            r4 = 0
            return r4
    }

    @androidx.annotation.Nullable
    androidx.fragment.app.Fragment findFragmentByWho(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r2.mActive
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto La
            androidx.fragment.app.Fragment r1 = r1.getFragment()
            androidx.fragment.app.Fragment r1 = r1.findFragmentByWho(r3)
            if (r1 == 0) goto La
            return r1
        L23:
            r3 = 0
            return r3
    }

    int findFragmentIndexInContainer(@androidx.annotation.NonNull androidx.fragment.app.Fragment r6) {
            r5 = this;
            android.view.ViewGroup r0 = r6.mContainer
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.mAdded
            int r6 = r2.indexOf(r6)
            int r2 = r6 + (-1)
        Le:
            if (r2 < 0) goto L2a
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r5.mAdded
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.view.ViewGroup r4 = r3.mContainer
            if (r4 != r0) goto L27
            android.view.View r3 = r3.mView
            if (r3 == 0) goto L27
            int r6 = r0.indexOfChild(r3)
            int r6 = r6 + 1
            return r6
        L27:
            int r2 = r2 + (-1)
            goto Le
        L2a:
            int r6 = r6 + 1
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.mAdded
            int r2 = r2.size()
            if (r6 >= r2) goto L4a
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.mAdded
            java.lang.Object r2 = r2.get(r6)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.view.ViewGroup r3 = r2.mContainer
            if (r3 != r0) goto L49
            android.view.View r2 = r2.mView
            if (r2 == 0) goto L49
            int r6 = r0.indexOfChild(r2)
            return r6
        L49:
            goto L2a
        L4a:
            return r1
    }

    int getActiveFragmentCount() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r1.mActive
            int r0 = r0.size()
            return r0
    }

    @androidx.annotation.NonNull
    java.util.List<androidx.fragment.app.FragmentStateManager> getActiveFragmentStateManagers() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r3.mActive
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            if (r2 == 0) goto Lf
            r0.add(r2)
            goto Lf
        L21:
            return r0
    }

    @androidx.annotation.NonNull
    java.util.List<androidx.fragment.app.Fragment> getActiveFragments() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r3.mActive
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            if (r2 == 0) goto L25
            androidx.fragment.app.Fragment r2 = r2.getFragment()
            r0.add(r2)
            goto Lf
        L25:
            r2 = 0
            r0.add(r2)
            goto Lf
        L2a:
            return r0
    }

    @androidx.annotation.Nullable
    androidx.fragment.app.FragmentStateManager getFragmentStateManager(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r1.mActive
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            return r2
    }

    @androidx.annotation.NonNull
    java.util.List<androidx.fragment.app.Fragment> getFragments() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        Lb:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r3.mAdded     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r1
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    androidx.fragment.app.FragmentManagerViewModel getNonConfig() {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            return r0
    }

    void makeActive(@androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r4) {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r4.getFragment()
            java.lang.String r1 = r0.mWho
            boolean r1 = r3.containsActiveFragment(r1)
            if (r1 == 0) goto Ld
            goto L34
        Ld:
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r3.mActive
            java.lang.String r2 = r0.mWho
            r1.put(r2, r4)
            boolean r4 = r0.mRetainInstanceChangedWhileDetached
            if (r4 == 0) goto L2a
            boolean r4 = r0.mRetainInstance
            if (r4 == 0) goto L22
            androidx.fragment.app.FragmentManagerViewModel r4 = r3.mNonConfig
            r4.addRetainedFragment(r0)
            goto L27
        L22:
            androidx.fragment.app.FragmentManagerViewModel r4 = r3.mNonConfig
            r4.removeRetainedFragment(r0)
        L27:
            r4 = 0
            r0.mRetainInstanceChangedWhileDetached = r4
        L2a:
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)
            if (r4 == 0) goto L34
            r0.toString()
        L34:
            return
    }

    void makeInactive(@androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r4) {
            r3 = this;
            androidx.fragment.app.Fragment r4 = r4.getFragment()
            boolean r0 = r4.mRetainInstance
            if (r0 == 0) goto Ld
            androidx.fragment.app.FragmentManagerViewModel r0 = r3.mNonConfig
            r0.removeRetainedFragment(r4)
        Ld:
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r3.mActive
            java.lang.String r1 = r4.mWho
            r2 = 0
            java.lang.Object r0 = r0.put(r1, r2)
            androidx.fragment.app.FragmentStateManager r0 = (androidx.fragment.app.FragmentStateManager) r0
            if (r0 != 0) goto L1b
            goto L25
        L1b:
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L25
            r4.toString()
        L25:
            return
    }

    void moveToExpectedState() {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r4.mAdded
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r2 = r4.mActive
            java.lang.String r1 = r1.mWho
            java.lang.Object r1 = r2.get(r1)
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto L6
            r1.moveToExpectedState()
            goto L6
        L22:
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r4.mActive
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto L2c
            r1.moveToExpectedState()
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            boolean r3 = r2.mRemoving
            if (r3 == 0) goto L2c
            boolean r2 = r2.isInBackStack()
            if (r2 != 0) goto L2c
            r4.makeInactive(r1)
            goto L2c
        L4f:
            return
    }

    void removeFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r2.mAdded
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r2.mAdded     // Catch: java.lang.Throwable -> Ld
            r1.remove(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            r3.mAdded = r0
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    void resetActiveFragments() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r1.mActive
            r0.clear()
            return
    }

    void restoreAddedFragments(@androidx.annotation.Nullable java.util.List<java.lang.String> r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            r0.clear()
            if (r4 == 0) goto L47
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            androidx.fragment.app.Fragment r1 = r3.findActiveFragment(r0)
            if (r1 == 0) goto L2b
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L27
            r1.toString()
        L27:
            r3.addFragment(r1)
            goto Lb
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No instantiated fragment for ("
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L47:
            return
    }

    @androidx.annotation.NonNull
    java.util.ArrayList<androidx.fragment.app.FragmentState> saveActiveFragments() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r5.mActive
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r5.mActive
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            if (r2 == 0) goto L15
            androidx.fragment.app.Fragment r3 = r2.getFragment()
            androidx.fragment.app.FragmentState r2 = r2.saveState()
            r0.add(r2)
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)
            if (r4 == 0) goto L15
            java.util.Objects.toString(r3)
            android.os.Bundle r2 = r2.mSavedFragmentState
            java.util.Objects.toString(r2)
            goto L15
        L3e:
            return r0
    }

    @androidx.annotation.Nullable
    java.util.ArrayList<java.lang.String> saveAddedFragments() {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r5.mAdded
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r5.mAdded     // Catch: java.lang.Throwable -> Le
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            goto L3f
        L10:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.mAdded     // Catch: java.lang.Throwable -> Le
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Le
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Le
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.mAdded     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Le
        L21:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Le
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3     // Catch: java.lang.Throwable -> Le
            java.lang.String r4 = r3.mWho     // Catch: java.lang.Throwable -> Le
            r1.add(r4)     // Catch: java.lang.Throwable -> Le
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)     // Catch: java.lang.Throwable -> Le
            if (r4 == 0) goto L21
            r3.toString()     // Catch: java.lang.Throwable -> Le
            goto L21
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    void setNonConfig(@androidx.annotation.NonNull androidx.fragment.app.FragmentManagerViewModel r1) {
            r0 = this;
            r0.mNonConfig = r1
            return
    }
}
