package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class FragmentTransition {
    private static final int[] INVERSE_OPS = null;
    static final androidx.fragment.app.FragmentTransitionImpl PLATFORM_IMPL = null;
    static final androidx.fragment.app.FragmentTransitionImpl SUPPORT_IMPL = null;







    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Callback {
        void onComplete(@androidx.annotation.NonNull androidx.fragment.app.Fragment r1, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r2);

        void onStart(@androidx.annotation.NonNull androidx.fragment.app.Fragment r1, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class FragmentContainerTransition {
        public androidx.fragment.app.Fragment firstOut;
        public boolean firstOutIsPop;
        public androidx.fragment.app.BackStackRecord firstOutTransaction;
        public androidx.fragment.app.Fragment lastIn;
        public boolean lastInIsPop;
        public androidx.fragment.app.BackStackRecord lastInTransaction;

        FragmentContainerTransition() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 11
            int[] r0 = new int[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10} // fill-array
            androidx.fragment.app.FragmentTransition.INVERSE_OPS = r0
            androidx.fragment.app.FragmentTransitionCompat21 r0 = new androidx.fragment.app.FragmentTransitionCompat21
            r0.<init>()
            androidx.fragment.app.FragmentTransition.PLATFORM_IMPL = r0
            androidx.fragment.app.FragmentTransitionImpl r0 = resolveSupportImpl()
            androidx.fragment.app.FragmentTransition.SUPPORT_IMPL = r0
            return
    }

    private FragmentTransition() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addSharedElementsWithMatchingNames(java.util.ArrayList<android.view.View> r3, androidx.collection.ArrayMap<java.lang.String, android.view.View> r4, java.util.Collection<java.lang.String> r5) {
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1e
            java.lang.Object r1 = r4.valueAt(r0)
            android.view.View r1 = (android.view.View) r1
            java.lang.String r2 = androidx.core.view.ViewCompat.getTransitionName(r1)
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L1b
            r3.add(r1)
        L1b:
            int r0 = r0 + (-1)
            goto L6
        L1e:
            return
    }

    private static void addToFirstInLastOut(androidx.fragment.app.BackStackRecord r8, androidx.fragment.app.FragmentTransaction.Op r9, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> r10, boolean r11, boolean r12) {
            androidx.fragment.app.Fragment r0 = r9.mFragment
            if (r0 != 0) goto L6
            goto Le5
        L6:
            int r1 = r0.mContainerId
            if (r1 != 0) goto Lc
            goto Le5
        Lc:
            if (r11 == 0) goto L15
            int[] r2 = androidx.fragment.app.FragmentTransition.INVERSE_OPS
            int r9 = r9.mCmd
            r9 = r2[r9]
            goto L17
        L15:
            int r9 = r9.mCmd
        L17:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L86
            r4 = 3
            if (r9 == r4) goto L65
            r4 = 4
            if (r9 == r4) goto L46
            r4 = 5
            if (r9 == r4) goto L2f
            r4 = 6
            if (r9 == r4) goto L65
            r4 = 7
            if (r9 == r4) goto L86
            r9 = 0
            r3 = 0
        L2c:
            r4 = 0
            goto L94
        L2f:
            if (r12 == 0) goto L41
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L3f
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L3f
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L3f
        L3d:
            r9 = 1
            goto L43
        L3f:
            r9 = 0
            goto L43
        L41:
            boolean r9 = r0.mHidden
        L43:
            r2 = r9
            r9 = 0
            goto L2c
        L46:
            if (r12 == 0) goto L58
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L56
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L56
            boolean r9 = r0.mHidden
            if (r9 == 0) goto L56
        L54:
            r9 = 1
            goto L61
        L56:
            r9 = 0
            goto L61
        L58:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L56
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L56
            goto L54
        L61:
            r4 = r9
            r9 = 1
            r3 = 0
            goto L94
        L65:
            if (r12 == 0) goto L7d
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L56
            android.view.View r9 = r0.mView
            if (r9 == 0) goto L56
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L56
            float r9 = r0.mPostponedAlpha
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L56
        L7c:
            goto L54
        L7d:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L56
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L56
            goto L7c
        L86:
            if (r12 == 0) goto L8b
            boolean r9 = r0.mIsNewlyAdded
            goto L43
        L8b:
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L3f
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L3f
            goto L3d
        L94:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.FragmentTransition$FragmentContainerTransition r5 = (androidx.fragment.app.FragmentTransition.FragmentContainerTransition) r5
            if (r2 == 0) goto La6
            androidx.fragment.app.FragmentTransition$FragmentContainerTransition r5 = ensureContainer(r5, r10, r1)
            r5.lastIn = r0
            r5.lastInIsPop = r11
            r5.lastInTransaction = r8
        La6:
            r2 = 0
            if (r12 != 0) goto Lc7
            if (r3 == 0) goto Lc7
            if (r5 == 0) goto Lb3
            androidx.fragment.app.Fragment r3 = r5.firstOut
            if (r3 != r0) goto Lb3
            r5.firstOut = r2
        Lb3:
            boolean r3 = r8.mReorderingAllowed
            if (r3 != 0) goto Lc7
            androidx.fragment.app.FragmentManager r3 = r8.mManager
            androidx.fragment.app.FragmentStateManager r6 = r3.createOrGetFragmentStateManager(r0)
            androidx.fragment.app.FragmentStore r7 = r3.getFragmentStore()
            r7.makeActive(r6)
            r3.moveToState(r0)
        Lc7:
            if (r4 == 0) goto Ld9
            if (r5 == 0) goto Lcf
            androidx.fragment.app.Fragment r3 = r5.firstOut
            if (r3 != 0) goto Ld9
        Lcf:
            androidx.fragment.app.FragmentTransition$FragmentContainerTransition r5 = ensureContainer(r5, r10, r1)
            r5.firstOut = r0
            r5.firstOutIsPop = r11
            r5.firstOutTransaction = r8
        Ld9:
            if (r12 != 0) goto Le5
            if (r9 == 0) goto Le5
            if (r5 == 0) goto Le5
            androidx.fragment.app.Fragment r8 = r5.lastIn
            if (r8 != r0) goto Le5
            r5.lastIn = r2
        Le5:
            return
    }

    public static void calculateFragments(androidx.fragment.app.BackStackRecord r4, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> r5, boolean r6) {
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r4.mOps
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L18
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r4.mOps
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.Op) r3
            addToFirstInLastOut(r4, r3, r5, r1, r6)
            int r2 = r2 + 1
            goto L8
        L18:
            return
    }

    private static androidx.collection.ArrayMap<java.lang.String, java.lang.String> calculateNameOverrides(int r9, java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10, java.util.ArrayList<java.lang.Boolean> r11, int r12, int r13) {
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            int r13 = r13 + (-1)
        L7:
            if (r13 < r12) goto L5a
            java.lang.Object r1 = r10.get(r13)
            androidx.fragment.app.BackStackRecord r1 = (androidx.fragment.app.BackStackRecord) r1
            boolean r2 = r1.interactsWith(r9)
            if (r2 != 0) goto L16
            goto L57
        L16:
            java.lang.Object r2 = r11.get(r13)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.util.ArrayList<java.lang.String> r3 = r1.mSharedElementSourceNames
            if (r3 == 0) goto L57
            int r3 = r3.size()
            if (r2 == 0) goto L2f
            java.util.ArrayList<java.lang.String> r2 = r1.mSharedElementSourceNames
            java.util.ArrayList<java.lang.String> r1 = r1.mSharedElementTargetNames
            goto L36
        L2f:
            java.util.ArrayList<java.lang.String> r2 = r1.mSharedElementSourceNames
            java.util.ArrayList<java.lang.String> r1 = r1.mSharedElementTargetNames
            r8 = r2
            r2 = r1
            r1 = r8
        L36:
            r4 = 0
        L37:
            if (r4 >= r3) goto L57
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.remove(r6)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L51
            r0.put(r5, r7)
            goto L54
        L51:
            r0.put(r5, r6)
        L54:
            int r4 = r4 + 1
            goto L37
        L57:
            int r13 = r13 + (-1)
            goto L7
        L5a:
            return r0
    }

    public static void calculatePopFragments(androidx.fragment.app.BackStackRecord r3, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> r4, boolean r5) {
            androidx.fragment.app.FragmentManager r0 = r3.mManager
            androidx.fragment.app.FragmentContainer r0 = r0.getContainer()
            boolean r0 = r0.onHasView()
            if (r0 != 0) goto Ld
            goto L25
        Ld:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r3.mOps
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L15:
            if (r0 < 0) goto L25
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r3.mOps
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            addToFirstInLastOut(r3, r2, r4, r1, r5)
            int r0 = r0 + (-1)
            goto L15
        L25:
            return
    }

    static void callSharedElementStartEnd(androidx.fragment.app.Fragment r3, androidx.fragment.app.Fragment r4, boolean r5, androidx.collection.ArrayMap<java.lang.String, android.view.View> r6, boolean r7) {
            if (r5 == 0) goto L7
            androidx.core.app.SharedElementCallback r3 = r4.getEnterTransitionCallback()
            goto Lb
        L7:
            androidx.core.app.SharedElementCallback r3 = r3.getEnterTransitionCallback()
        Lb:
            if (r3 == 0) goto L3d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = 0
            if (r6 != 0) goto L1c
            r1 = 0
            goto L20
        L1c:
            int r1 = r6.size()
        L20:
            if (r0 >= r1) goto L33
            java.lang.Object r2 = r6.keyAt(r0)
            r5.add(r2)
            java.lang.Object r2 = r6.valueAt(r0)
            r4.add(r2)
            int r0 = r0 + 1
            goto L20
        L33:
            r6 = 0
            if (r7 == 0) goto L3a
            r3.onSharedElementStart(r5, r4, r6)
            return
        L3a:
            r3.onSharedElementEnd(r5, r4, r6)
        L3d:
            return
    }

    private static boolean canHandleAll(androidx.fragment.app.FragmentTransitionImpl r4, java.util.List<java.lang.Object> r5) {
            int r0 = r5.size()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L16
            java.lang.Object r3 = r5.get(r2)
            boolean r3 = r4.canHandle(r3)
            if (r3 != 0) goto L13
            return r1
        L13:
            int r2 = r2 + 1
            goto L6
        L16:
            r4 = 1
            return r4
    }

    static androidx.collection.ArrayMap<java.lang.String, android.view.View> captureInSharedElements(androidx.fragment.app.FragmentTransitionImpl r3, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r4, java.lang.Object r5, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r6) {
            androidx.fragment.app.Fragment r0 = r6.lastIn
            android.view.View r1 = r0.getView()
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L7c
            if (r5 == 0) goto L7c
            if (r1 != 0) goto L11
            goto L7c
        L11:
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r5.<init>()
            r3.findNamedViews(r5, r1)
            androidx.fragment.app.BackStackRecord r3 = r6.lastInTransaction
            boolean r6 = r6.lastInIsPop
            if (r6 == 0) goto L26
            androidx.core.app.SharedElementCallback r6 = r0.getExitTransitionCallback()
            java.util.ArrayList<java.lang.String> r3 = r3.mSharedElementSourceNames
            goto L2c
        L26:
            androidx.core.app.SharedElementCallback r6 = r0.getEnterTransitionCallback()
            java.util.ArrayList<java.lang.String> r3 = r3.mSharedElementTargetNames
        L2c:
            if (r3 == 0) goto L38
            r5.retainAll(r3)
            java.util.Collection r0 = r4.values()
            r5.retainAll(r0)
        L38:
            if (r6 == 0) goto L78
            r6.onMapSharedElements(r3, r5)
            int r6 = r3.size()
            int r6 = r6 + (-1)
        L43:
            if (r6 < 0) goto L77
            java.lang.Object r0 = r3.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r5.get(r0)
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto L5d
            java.lang.String r0 = findKeyForValue(r4, r0)
            if (r0 == 0) goto L74
            r4.remove(r0)
            goto L74
        L5d:
            java.lang.String r2 = androidx.core.view.ViewCompat.getTransitionName(r1)
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L74
            java.lang.String r0 = findKeyForValue(r4, r0)
            if (r0 == 0) goto L74
            java.lang.String r1 = androidx.core.view.ViewCompat.getTransitionName(r1)
            r4.put(r0, r1)
        L74:
            int r6 = r6 + (-1)
            goto L43
        L77:
            return r5
        L78:
            retainValues(r4, r5)
            return r5
        L7c:
            r4.clear()
            r3 = 0
            return r3
    }

    private static androidx.collection.ArrayMap<java.lang.String, android.view.View> captureOutSharedElements(androidx.fragment.app.FragmentTransitionImpl r3, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r4, java.lang.Object r5, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r6) {
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L71
            if (r5 != 0) goto L9
            goto L71
        L9:
            androidx.fragment.app.Fragment r5 = r6.firstOut
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.view.View r1 = r5.requireView()
            r3.findNamedViews(r0, r1)
            androidx.fragment.app.BackStackRecord r3 = r6.firstOutTransaction
            boolean r6 = r6.firstOutIsPop
            if (r6 == 0) goto L24
            androidx.core.app.SharedElementCallback r5 = r5.getEnterTransitionCallback()
            java.util.ArrayList<java.lang.String> r3 = r3.mSharedElementTargetNames
            goto L2a
        L24:
            androidx.core.app.SharedElementCallback r5 = r5.getExitTransitionCallback()
            java.util.ArrayList<java.lang.String> r3 = r3.mSharedElementSourceNames
        L2a:
            if (r3 == 0) goto L2f
            r0.retainAll(r3)
        L2f:
            if (r5 == 0) goto L69
            r5.onMapSharedElements(r3, r0)
            int r5 = r3.size()
            int r5 = r5 + (-1)
        L3a:
            if (r5 < 0) goto L68
            java.lang.Object r6 = r3.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r0.get(r6)
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto L4e
            r4.remove(r6)
            goto L65
        L4e:
            java.lang.String r2 = androidx.core.view.ViewCompat.getTransitionName(r1)
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L65
            java.lang.Object r6 = r4.remove(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = androidx.core.view.ViewCompat.getTransitionName(r1)
            r4.put(r1, r6)
        L65:
            int r5 = r5 + (-1)
            goto L3a
        L68:
            return r0
        L69:
            java.util.Set r3 = r0.keySet()
            r4.retainAll(r3)
            return r0
        L71:
            r4.clear()
            r3 = 0
            return r3
    }

    private static androidx.fragment.app.FragmentTransitionImpl chooseImpl(androidx.fragment.app.Fragment r2, androidx.fragment.app.Fragment r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L22
            java.lang.Object r1 = r2.getExitTransition()
            if (r1 == 0) goto L10
            r0.add(r1)
        L10:
            java.lang.Object r1 = r2.getReturnTransition()
            if (r1 == 0) goto L19
            r0.add(r1)
        L19:
            java.lang.Object r2 = r2.getSharedElementReturnTransition()
            if (r2 == 0) goto L22
            r0.add(r2)
        L22:
            if (r3 == 0) goto L3f
            java.lang.Object r2 = r3.getEnterTransition()
            if (r2 == 0) goto L2d
            r0.add(r2)
        L2d:
            java.lang.Object r2 = r3.getReenterTransition()
            if (r2 == 0) goto L36
            r0.add(r2)
        L36:
            java.lang.Object r2 = r3.getSharedElementEnterTransition()
            if (r2 == 0) goto L3f
            r0.add(r2)
        L3f:
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L47
            return r3
        L47:
            androidx.fragment.app.FragmentTransitionImpl r2 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
            if (r2 == 0) goto L52
            boolean r1 = canHandleAll(r2, r0)
            if (r1 == 0) goto L52
            return r2
        L52:
            androidx.fragment.app.FragmentTransitionImpl r1 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
            if (r1 == 0) goto L5d
            boolean r0 = canHandleAll(r1, r0)
            if (r0 == 0) goto L5d
            return r1
        L5d:
            if (r2 != 0) goto L62
            if (r1 != 0) goto L62
            return r3
        L62:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid Transition types"
            r2.<init>(r3)
            throw r2
    }

    static java.util.ArrayList<android.view.View> configureEnteringExitingViews(androidx.fragment.app.FragmentTransitionImpl r1, java.lang.Object r2, androidx.fragment.app.Fragment r3, java.util.ArrayList<android.view.View> r4, android.view.View r5) {
            if (r2 == 0) goto L22
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.View r3 = r3.getView()
            if (r3 == 0) goto L10
            r1.captureTransitioningViews(r0, r3)
        L10:
            if (r4 == 0) goto L15
            r0.removeAll(r4)
        L15:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L21
            r0.add(r5)
            r1.addTargets(r2, r0)
        L21:
            return r0
        L22:
            r1 = 0
            return r1
    }

    private static java.lang.Object configureSharedElementsOrdered(androidx.fragment.app.FragmentTransitionImpl r15, android.view.ViewGroup r16, android.view.View r17, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r18, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r19, java.util.ArrayList<android.view.View> r20, java.util.ArrayList<android.view.View> r21, java.lang.Object r22, java.lang.Object r23) {
            r6 = r19
            r10 = r20
            r11 = r22
            androidx.fragment.app.Fragment r7 = r6.lastIn
            androidx.fragment.app.Fragment r8 = r6.firstOut
            r1 = 0
            if (r7 == 0) goto L75
            if (r8 != 0) goto L11
            goto L75
        L11:
            boolean r9 = r6.lastInIsPop
            boolean r2 = r18.isEmpty()
            if (r2 == 0) goto L1d
            r2 = r1
        L1a:
            r12 = r18
            goto L22
        L1d:
            java.lang.Object r2 = getSharedElementTransition(r15, r7, r8, r9)
            goto L1a
        L22:
            androidx.collection.ArrayMap r3 = captureOutSharedElements(r15, r12, r2, r6)
            boolean r4 = r12.isEmpty()
            if (r4 == 0) goto L2e
            r2 = r1
            goto L35
        L2e:
            java.util.Collection r4 = r3.values()
            r10.addAll(r4)
        L35:
            if (r11 != 0) goto L3c
            if (r23 != 0) goto L3c
            if (r2 != 0) goto L3c
            return r1
        L3c:
            r4 = 1
            callSharedElementStartEnd(r7, r8, r9, r3, r4)
            if (r2 == 0) goto L5f
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            r14 = r17
            r15.setSharedElementTargets(r2, r14, r10)
            boolean r4 = r6.firstOutIsPop
            androidx.fragment.app.BackStackRecord r5 = r6.firstOutTransaction
            r0 = r15
            r1 = r2
            r2 = r23
            setOutEpicenter(r0, r1, r2, r3, r4, r5)
            r3 = r1
            if (r11 == 0) goto L5d
            r15.setEpicenter(r11, r13)
        L5d:
            r1 = r13
            goto L62
        L5f:
            r14 = r17
            r3 = r2
        L62:
            androidx.fragment.app.FragmentTransition$6 r0 = new androidx.fragment.app.FragmentTransition$6
            r5 = r21
            r4 = r6
            r2 = r12
            r6 = r14
            r12 = r1
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r0
            r0 = r16
            androidx.core.view.OneShotPreDrawListener.add(r0, r1)
            return r3
        L75:
            return r1
    }

    private static java.lang.Object configureSharedElementsReordered(androidx.fragment.app.FragmentTransitionImpl r15, android.view.ViewGroup r16, android.view.View r17, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r18, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r19, java.util.ArrayList<android.view.View> r20, java.util.ArrayList<android.view.View> r21, java.lang.Object r22, java.lang.Object r23) {
            r1 = r17
            r2 = r18
            r6 = r19
            r3 = r20
            r4 = r21
            r7 = r22
            androidx.fragment.app.Fragment r8 = r6.lastIn
            androidx.fragment.app.Fragment r9 = r6.firstOut
            if (r8 == 0) goto L1a
            android.view.View r5 = r8.requireView()
            r10 = 0
            r5.setVisibility(r10)
        L1a:
            r5 = 0
            if (r8 == 0) goto L99
            if (r9 != 0) goto L21
            goto L99
        L21:
            boolean r10 = r6.lastInIsPop
            boolean r11 = r2.isEmpty()
            if (r11 == 0) goto L2b
            r11 = r5
            goto L2f
        L2b:
            java.lang.Object r11 = getSharedElementTransition(r15, r8, r9, r10)
        L2f:
            androidx.collection.ArrayMap r12 = captureOutSharedElements(r15, r2, r11, r6)
            androidx.collection.ArrayMap r13 = captureInSharedElements(r15, r2, r11, r6)
            boolean r14 = r2.isEmpty()
            if (r14 == 0) goto L49
            if (r12 == 0) goto L42
            r12.clear()
        L42:
            if (r13 == 0) goto L47
            r13.clear()
        L47:
            r11 = r5
            goto L57
        L49:
            java.util.Set r14 = r2.keySet()
            addSharedElementsWithMatchingNames(r3, r12, r14)
            java.util.Collection r2 = r2.values()
            addSharedElementsWithMatchingNames(r4, r13, r2)
        L57:
            if (r7 != 0) goto L5e
            if (r23 != 0) goto L5e
            if (r11 != 0) goto L5e
            return r5
        L5e:
            r2 = 1
            callSharedElementStartEnd(r8, r9, r10, r12, r2)
            if (r11 == 0) goto L87
            r4.add(r1)
            r15.setSharedElementTargets(r11, r1, r3)
            boolean r4 = r6.firstOutIsPop
            androidx.fragment.app.BackStackRecord r5 = r6.firstOutTransaction
            r0 = r15
            r2 = r23
            r1 = r11
            r3 = r12
            setOutEpicenter(r0, r1, r2, r3, r4, r5)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            android.view.View r1 = getInEpicenterView(r13, r6, r7, r10)
            if (r1 == 0) goto L84
            r15.setEpicenter(r7, r5)
        L84:
            r7 = r5
            r5 = r1
            goto L88
        L87:
            r7 = r5
        L88:
            androidx.fragment.app.FragmentTransition$5 r0 = new androidx.fragment.app.FragmentTransition$5
            r6 = r15
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1 = r0
            r0 = r16
            androidx.core.view.OneShotPreDrawListener.add(r0, r1)
            return r11
        L99:
            return r5
    }

    private static void configureTransitionsOrdered(@androidx.annotation.NonNull android.view.ViewGroup r16, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r17, android.view.View r18, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r19, androidx.fragment.app.FragmentTransition.Callback r20) {
            r4 = r17
            r9 = r20
            androidx.fragment.app.Fragment r10 = r4.lastIn
            androidx.fragment.app.Fragment r11 = r4.firstOut
            androidx.fragment.app.FragmentTransitionImpl r0 = chooseImpl(r11, r10)
            if (r0 != 0) goto L10
            goto La5
        L10:
            boolean r1 = r4.lastInIsPop
            boolean r2 = r4.firstOutIsPop
            java.lang.Object r1 = getEnterTransition(r0, r10, r1)
            java.lang.Object r8 = getExitTransition(r0, r11, r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r2 = r18
            r3 = r19
            r7 = r1
            r1 = r16
            java.lang.Object r12 = configureSharedElementsOrdered(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r13 = r2
            r14 = r3
            r1 = r7
            r7 = r6
            r6 = r5
            if (r1 != 0) goto L3e
            if (r12 != 0) goto L3e
            if (r8 != 0) goto L3e
            goto La5
        L3e:
            java.util.ArrayList r15 = configureEnteringExitingViews(r0, r8, r11, r6, r13)
            if (r15 == 0) goto L4d
            boolean r2 = r15.isEmpty()
            if (r2 == 0) goto L4b
            goto L4d
        L4b:
            r2 = r8
            goto L4f
        L4d:
            r8 = 0
            goto L4b
        L4f:
            r0.addTarget(r1, r13)
            boolean r5 = r4.lastInIsPop
            r4 = r10
            r3 = r12
            java.lang.Object r5 = mergeTransitions(r0, r1, r2, r3, r4, r5)
            r8 = r4
            if (r11 == 0) goto L7b
            if (r15 == 0) goto L7b
            int r4 = r15.size()
            if (r4 > 0) goto L6b
            int r4 = r6.size()
            if (r4 <= 0) goto L7b
        L6b:
            androidx.core.os.CancellationSignal r4 = new androidx.core.os.CancellationSignal
            r4.<init>()
            r9.onStart(r11, r4)
            androidx.fragment.app.FragmentTransition$3 r6 = new androidx.fragment.app.FragmentTransition$3
            r6.<init>(r9, r11, r4)
            r0.setListenerForTransitionEnd(r11, r5, r4, r6)
        L7b:
            if (r5 == 0) goto La5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4 = r6
            r6 = r3
            r3 = r4
            r4 = r2
            r2 = r1
            r1 = r5
            r5 = r15
            r0.scheduleRemoveTargets(r1, r2, r3, r4, r5, r6, r7)
            r6 = r5
            r5 = r2
            r2 = r8
            r8 = r6
            r6 = r7
            r7 = r4
            r4 = r6
            r9 = r1
            r6 = r3
            r3 = r13
            r1 = r16
            scheduleTargetChange(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r7 = r4
            r0.setNameOverridesOrdered(r1, r7, r14)
            r0.beginDelayedTransition(r1, r9)
            r0.scheduleNameReset(r1, r7, r14)
        La5:
            return
    }

    private static void configureTransitionsReordered(@androidx.annotation.NonNull android.view.ViewGroup r14, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r15, android.view.View r16, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r17, androidx.fragment.app.FragmentTransition.Callback r18) {
            r9 = r18
            androidx.fragment.app.Fragment r10 = r15.lastIn
            androidx.fragment.app.Fragment r11 = r15.firstOut
            androidx.fragment.app.FragmentTransitionImpl r0 = chooseImpl(r11, r10)
            if (r0 != 0) goto Le
            goto L9b
        Le:
            boolean r12 = r15.lastInIsPop
            boolean r1 = r15.firstOutIsPop
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r7 = getEnterTransition(r0, r10, r12)
            java.lang.Object r8 = getExitTransition(r0, r11, r1)
            r1 = r14
            r4 = r15
            r5 = r2
            r6 = r3
            r2 = r16
            r3 = r17
            java.lang.Object r4 = configureSharedElementsReordered(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r7
            r3 = r8
            r8 = r5
            if (r1 != 0) goto L3b
            if (r4 != 0) goto L3b
            if (r3 != 0) goto L3b
            goto L9b
        L3b:
            java.util.ArrayList r7 = configureEnteringExitingViews(r0, r3, r11, r8, r2)
            java.util.ArrayList r13 = configureEnteringExitingViews(r0, r1, r10, r6, r2)
            r2 = 4
            setViewVisibility(r13, r2)
            r2 = r3
            r3 = r4
            r4 = r10
            r5 = r12
            java.lang.Object r4 = mergeTransitions(r0, r1, r2, r3, r4, r5)
            if (r11 == 0) goto L6f
            if (r7 == 0) goto L6f
            int r5 = r7.size()
            if (r5 > 0) goto L5f
            int r5 = r8.size()
            if (r5 <= 0) goto L6f
        L5f:
            androidx.core.os.CancellationSignal r5 = new androidx.core.os.CancellationSignal
            r5.<init>()
            r9.onStart(r11, r5)
            androidx.fragment.app.FragmentTransition$1 r10 = new androidx.fragment.app.FragmentTransition$1
            r10.<init>(r9, r11, r5)
            r0.setListenerForTransitionEnd(r11, r4, r5, r10)
        L6f:
            if (r4 == 0) goto L9b
            replaceHide(r0, r2, r11, r7)
            java.util.ArrayList r9 = r0.prepareSetNameOverridesReordered(r6)
            r5 = r2
            r2 = r1
            r1 = r4
            r4 = r5
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r13
            r0.scheduleRemoveTargets(r1, r2, r3, r4, r5, r6, r7)
            r2 = r7
            r7 = r6
            r6 = r2
            r2 = r1
            r10 = r3
            r0.beginDelayedTransition(r14, r2)
            r1 = r14
            r5 = r17
            r3 = r6
            r2 = r8
            r4 = r9
            r0.setNameOverridesReordered(r1, r2, r3, r4, r5)
            r1 = 0
            setViewVisibility(r10, r1)
            r0.swapSharedElementTargets(r7, r2, r6)
        L9b:
            return
    }

    private static androidx.fragment.app.FragmentTransition.FragmentContainerTransition ensureContainer(androidx.fragment.app.FragmentTransition.FragmentContainerTransition r0, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> r1, int r2) {
            if (r0 != 0) goto La
            androidx.fragment.app.FragmentTransition$FragmentContainerTransition r0 = new androidx.fragment.app.FragmentTransition$FragmentContainerTransition
            r0.<init>()
            r1.put(r2, r0)
        La:
            return r0
    }

    static java.lang.String findKeyForValue(androidx.collection.ArrayMap<java.lang.String, java.lang.String> r3, java.lang.String r4) {
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1b
            java.lang.Object r2 = r3.valueAt(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L18
            java.lang.Object r3 = r3.keyAt(r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L18:
            int r1 = r1 + 1
            goto L5
        L1b:
            r3 = 0
            return r3
    }

    private static java.lang.Object getEnterTransition(androidx.fragment.app.FragmentTransitionImpl r0, androidx.fragment.app.Fragment r1, boolean r2) {
            if (r1 != 0) goto L4
            r0 = 0
            return r0
        L4:
            if (r2 == 0) goto Lb
            java.lang.Object r1 = r1.getReenterTransition()
            goto Lf
        Lb:
            java.lang.Object r1 = r1.getEnterTransition()
        Lf:
            java.lang.Object r0 = r0.cloneTransition(r1)
            return r0
    }

    private static java.lang.Object getExitTransition(androidx.fragment.app.FragmentTransitionImpl r0, androidx.fragment.app.Fragment r1, boolean r2) {
            if (r1 != 0) goto L4
            r0 = 0
            return r0
        L4:
            if (r2 == 0) goto Lb
            java.lang.Object r1 = r1.getReturnTransition()
            goto Lf
        Lb:
            java.lang.Object r1 = r1.getExitTransition()
        Lf:
            java.lang.Object r0 = r0.cloneTransition(r1)
            return r0
    }

    static android.view.View getInEpicenterView(androidx.collection.ArrayMap<java.lang.String, android.view.View> r0, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r1, java.lang.Object r2, boolean r3) {
            androidx.fragment.app.BackStackRecord r1 = r1.lastInTransaction
            if (r2 == 0) goto L2b
            if (r0 == 0) goto L2b
            java.util.ArrayList<java.lang.String> r2 = r1.mSharedElementSourceNames
            if (r2 == 0) goto L2b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L2b
            r2 = 0
            if (r3 == 0) goto L1c
            java.util.ArrayList<java.lang.String> r1 = r1.mSharedElementSourceNames
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            goto L24
        L1c:
            java.util.ArrayList<java.lang.String> r1 = r1.mSharedElementTargetNames
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
        L24:
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            return r0
        L2b:
            r0 = 0
            return r0
    }

    private static java.lang.Object getSharedElementTransition(androidx.fragment.app.FragmentTransitionImpl r0, androidx.fragment.app.Fragment r1, androidx.fragment.app.Fragment r2, boolean r3) {
            if (r1 == 0) goto L19
            if (r2 != 0) goto L5
            goto L19
        L5:
            if (r3 == 0) goto Lc
            java.lang.Object r1 = r2.getSharedElementReturnTransition()
            goto L10
        Lc:
            java.lang.Object r1 = r1.getSharedElementEnterTransition()
        L10:
            java.lang.Object r1 = r0.cloneTransition(r1)
            java.lang.Object r0 = r0.wrapTransitionInSet(r1)
            return r0
        L19:
            r0 = 0
            return r0
    }

    private static java.lang.Object mergeTransitions(androidx.fragment.app.FragmentTransitionImpl r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, androidx.fragment.app.Fragment r4, boolean r5) {
            if (r1 == 0) goto L12
            if (r2 == 0) goto L12
            if (r4 == 0) goto L12
            if (r5 == 0) goto Ld
            boolean r4 = r4.getAllowReturnTransitionOverlap()
            goto L13
        Ld:
            boolean r4 = r4.getAllowEnterTransitionOverlap()
            goto L13
        L12:
            r4 = 1
        L13:
            if (r4 == 0) goto L1a
            java.lang.Object r0 = r0.mergeTransitionsTogether(r2, r1, r3)
            return r0
        L1a:
            java.lang.Object r0 = r0.mergeTransitionsInSequence(r2, r1, r3)
            return r0
    }

    private static void replaceHide(androidx.fragment.app.FragmentTransitionImpl r1, java.lang.Object r2, androidx.fragment.app.Fragment r3, java.util.ArrayList<android.view.View> r4) {
            if (r3 == 0) goto L25
            if (r2 == 0) goto L25
            boolean r0 = r3.mAdded
            if (r0 == 0) goto L25
            boolean r0 = r3.mHidden
            if (r0 == 0) goto L25
            boolean r0 = r3.mHiddenChanged
            if (r0 == 0) goto L25
            r0 = 1
            r3.setHideReplaced(r0)
            android.view.View r0 = r3.getView()
            r1.scheduleHideFragmentView(r2, r0, r4)
            android.view.ViewGroup r1 = r3.mContainer
            androidx.fragment.app.FragmentTransition$2 r2 = new androidx.fragment.app.FragmentTransition$2
            r2.<init>(r4)
            androidx.core.view.OneShotPreDrawListener.add(r1, r2)
        L25:
            return
    }

    private static androidx.fragment.app.FragmentTransitionImpl resolveSupportImpl() {
            r0 = 0
            java.lang.Class<androidx.transition.FragmentTransitionSupport> r1 = androidx.transition.FragmentTransitionSupport.class
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch: java.lang.Exception -> Le
            java.lang.Object r1 = r1.newInstance(r0)     // Catch: java.lang.Exception -> Le
            androidx.fragment.app.FragmentTransitionImpl r1 = (androidx.fragment.app.FragmentTransitionImpl) r1     // Catch: java.lang.Exception -> Le
            return r1
        Le:
            return r0
    }

    static void retainValues(@androidx.annotation.NonNull androidx.collection.ArrayMap<java.lang.String, java.lang.String> r2, @androidx.annotation.NonNull androidx.collection.ArrayMap<java.lang.String, android.view.View> r3) {
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r2.valueAt(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.containsKey(r1)
            if (r1 != 0) goto L17
            r2.removeAt(r0)
        L17:
            int r0 = r0 + (-1)
            goto L6
        L1a:
            return
    }

    private static void scheduleTargetChange(androidx.fragment.app.FragmentTransitionImpl r9, android.view.ViewGroup r10, androidx.fragment.app.Fragment r11, android.view.View r12, java.util.ArrayList<android.view.View> r13, java.lang.Object r14, java.util.ArrayList<android.view.View> r15, java.lang.Object r16, java.util.ArrayList<android.view.View> r17) {
            androidx.fragment.app.FragmentTransition$4 r0 = new androidx.fragment.app.FragmentTransition$4
            r2 = r9
            r4 = r11
            r3 = r12
            r5 = r13
            r1 = r14
            r6 = r15
            r8 = r16
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.core.view.OneShotPreDrawListener.add(r10, r0)
            return
    }

    private static void setOutEpicenter(androidx.fragment.app.FragmentTransitionImpl r1, java.lang.Object r2, java.lang.Object r3, androidx.collection.ArrayMap<java.lang.String, android.view.View> r4, boolean r5, androidx.fragment.app.BackStackRecord r6) {
            java.util.ArrayList<java.lang.String> r0 = r6.mSharedElementSourceNames
            if (r0 == 0) goto L2c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2c
            r0 = 0
            if (r5 == 0) goto L16
            java.util.ArrayList<java.lang.String> r5 = r6.mSharedElementTargetNames
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            goto L1e
        L16:
            java.util.ArrayList<java.lang.String> r5 = r6.mSharedElementSourceNames
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
        L1e:
            java.lang.Object r4 = r4.get(r5)
            android.view.View r4 = (android.view.View) r4
            r1.setEpicenter(r2, r4)
            if (r3 == 0) goto L2c
            r1.setEpicenter(r3, r4)
        L2c:
            return
    }

    static void setViewVisibility(java.util.ArrayList<android.view.View> r2, int r3) {
            if (r2 != 0) goto L3
            goto L17
        L3:
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L9:
            if (r0 < 0) goto L17
            java.lang.Object r1 = r2.get(r0)
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r3)
            int r0 = r0 + (-1)
            goto L9
        L17:
            return
    }

    static void startTransitions(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.NonNull androidx.fragment.app.FragmentContainer r8, java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9, java.util.ArrayList<java.lang.Boolean> r10, int r11, int r12, boolean r13, androidx.fragment.app.FragmentTransition.Callback r14) {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = r11
        L6:
            if (r1 >= r12) goto L24
            java.lang.Object r2 = r9.get(r1)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            java.lang.Object r3 = r10.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1e
            calculatePopFragments(r2, r0, r13)
            goto L21
        L1e:
            calculateFragments(r2, r0, r13)
        L21:
            int r1 = r1 + 1
            goto L6
        L24:
            int r1 = r0.size()
            if (r1 == 0) goto L5f
            android.view.View r1 = new android.view.View
            r1.<init>(r7)
            int r7 = r0.size()
            r2 = 0
        L34:
            if (r2 >= r7) goto L5f
            int r3 = r0.keyAt(r2)
            androidx.collection.ArrayMap r4 = calculateNameOverrides(r3, r9, r10, r11, r12)
            java.lang.Object r5 = r0.valueAt(r2)
            androidx.fragment.app.FragmentTransition$FragmentContainerTransition r5 = (androidx.fragment.app.FragmentTransition.FragmentContainerTransition) r5
            boolean r6 = r8.onHasView()
            if (r6 == 0) goto L5c
            android.view.View r3 = r8.onFindViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 != 0) goto L53
            goto L5c
        L53:
            if (r13 == 0) goto L59
            configureTransitionsReordered(r3, r5, r1, r4, r14)
            goto L5c
        L59:
            configureTransitionsOrdered(r3, r5, r1, r4, r14)
        L5c:
            int r2 = r2 + 1
            goto L34
        L5f:
            return
    }

    static boolean supportsTransition() {
            androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
            if (r0 != 0) goto Lb
            androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }
}
