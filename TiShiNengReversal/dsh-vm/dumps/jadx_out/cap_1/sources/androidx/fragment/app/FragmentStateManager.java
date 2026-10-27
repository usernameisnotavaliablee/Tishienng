package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class FragmentStateManager {
    private static final java.lang.String TAG = "FragmentManager";
    private static final java.lang.String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    private static final java.lang.String TARGET_STATE_TAG = "android:target_state";
    private static final java.lang.String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    private static final java.lang.String VIEW_REGISTRY_STATE_TAG = "android:view_registry_state";
    private static final java.lang.String VIEW_STATE_TAG = "android:view_state";
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher mDispatcher;

    @androidx.annotation.NonNull
    private final androidx.fragment.app.Fragment mFragment;
    private int mFragmentManagerState;
    private final androidx.fragment.app.FragmentStore mFragmentStore;
    private boolean mMovingToState;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.fragment.app.FragmentStateManager$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State = null;

        static {
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State = r0
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    FragmentStateManager(@androidx.annotation.NonNull androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2, @androidx.annotation.NonNull androidx.fragment.app.FragmentStore r3, @androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMovingToState = r0
            r0 = -1
            r1.mFragmentManagerState = r0
            r1.mDispatcher = r2
            r1.mFragmentStore = r3
            r1.mFragment = r4
            return
    }

    FragmentStateManager(@androidx.annotation.NonNull androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r3, @androidx.annotation.NonNull androidx.fragment.app.FragmentStore r4, @androidx.annotation.NonNull androidx.fragment.app.Fragment r5, @androidx.annotation.NonNull androidx.fragment.app.FragmentState r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mMovingToState = r0
            r1 = -1
            r2.mFragmentManagerState = r1
            r2.mDispatcher = r3
            r2.mFragmentStore = r4
            r2.mFragment = r5
            r3 = 0
            r5.mSavedViewState = r3
            r5.mSavedViewRegistryState = r3
            r5.mBackStackNesting = r0
            r5.mInLayout = r0
            r5.mAdded = r0
            androidx.fragment.app.Fragment r4 = r5.mTarget
            if (r4 == 0) goto L21
            java.lang.String r4 = r4.mWho
            goto L22
        L21:
            r4 = r3
        L22:
            r5.mTargetWho = r4
            r5.mTarget = r3
            android.os.Bundle r3 = r6.mSavedFragmentState
            if (r3 == 0) goto L2d
            r5.mSavedFragmentState = r3
            return
        L2d:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r5.mSavedFragmentState = r3
            return
    }

    FragmentStateManager(@androidx.annotation.NonNull androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2, @androidx.annotation.NonNull androidx.fragment.app.FragmentStore r3, @androidx.annotation.NonNull java.lang.ClassLoader r4, @androidx.annotation.NonNull androidx.fragment.app.FragmentFactory r5, @androidx.annotation.NonNull androidx.fragment.app.FragmentState r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMovingToState = r0
            r0 = -1
            r1.mFragmentManagerState = r0
            r1.mDispatcher = r2
            r1.mFragmentStore = r3
            java.lang.String r2 = r6.mClassName
            androidx.fragment.app.Fragment r2 = r5.instantiate(r4, r2)
            r1.mFragment = r2
            android.os.Bundle r3 = r6.mArguments
            if (r3 == 0) goto L1c
            r3.setClassLoader(r4)
        L1c:
            android.os.Bundle r3 = r6.mArguments
            r2.setArguments(r3)
            java.lang.String r3 = r6.mWho
            r2.mWho = r3
            boolean r3 = r6.mFromLayout
            r2.mFromLayout = r3
            r3 = 1
            r2.mRestored = r3
            int r3 = r6.mFragmentId
            r2.mFragmentId = r3
            int r3 = r6.mContainerId
            r2.mContainerId = r3
            java.lang.String r3 = r6.mTag
            r2.mTag = r3
            boolean r3 = r6.mRetainInstance
            r2.mRetainInstance = r3
            boolean r3 = r6.mRemoving
            r2.mRemoving = r3
            boolean r3 = r6.mDetached
            r2.mDetached = r3
            boolean r3 = r6.mHidden
            r2.mHidden = r3
            androidx.lifecycle.Lifecycle$State[] r3 = androidx.lifecycle.Lifecycle.State.values()
            int r4 = r6.mMaxLifecycleState
            r3 = r3[r4]
            r2.mMaxState = r3
            android.os.Bundle r3 = r6.mSavedFragmentState
            if (r3 == 0) goto L59
            r2.mSavedFragmentState = r3
            goto L60
        L59:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r2.mSavedFragmentState = r3
        L60:
            r3 = 2
            boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r3 == 0) goto L6a
            java.util.Objects.toString(r2)
        L6a:
            return
    }

    private boolean isFragmentViewChild(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.mFragment
            android.view.View r0 = r0.mView
            r1 = 1
            if (r3 != r0) goto L8
            return r1
        L8:
            android.view.ViewParent r3 = r3.getParent()
        Lc:
            if (r3 == 0) goto L1a
            androidx.fragment.app.Fragment r0 = r2.mFragment
            android.view.View r0 = r0.mView
            if (r3 != r0) goto L15
            return r1
        L15:
            android.view.ViewParent r3 = r3.getParent()
            goto Lc
        L1a:
            r3 = 0
            return r3
    }

    private android.os.Bundle saveBasicState() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r1.performSaveInstanceState(r0)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r4.mDispatcher
            androidx.fragment.app.Fragment r2 = r4.mFragment
            r3 = 0
            r1.dispatchOnFragmentSaveInstanceState(r2, r0, r3)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L19
            r0 = 0
        L19:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.view.View r1 = r1.mView
            if (r1 == 0) goto L22
            r4.saveViewState()
        L22:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.util.SparseArray<android.os.Parcelable> r1 = r1.mSavedViewState
            if (r1 == 0) goto L38
            if (r0 != 0) goto L2f
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L2f:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.util.SparseArray<android.os.Parcelable> r1 = r1.mSavedViewState
            java.lang.String r2 = "android:view_state"
            r0.putSparseParcelableArray(r2, r1)
        L38:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedViewRegistryState
            if (r1 == 0) goto L4e
            if (r0 != 0) goto L45
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L45:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedViewRegistryState
            java.lang.String r2 = "android:view_registry_state"
            r0.putBundle(r2, r1)
        L4e:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            boolean r1 = r1.mUserVisibleHint
            if (r1 != 0) goto L64
            if (r0 != 0) goto L5b
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L5b:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            boolean r1 = r1.mUserVisibleHint
            java.lang.String r2 = "android:user_visible_hint"
            r0.putBoolean(r2, r1)
        L64:
            return r0
    }

    void activityCreated() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto Lc
            androidx.fragment.app.Fragment r0 = r4.mFragment
            java.util.Objects.toString(r0)
        Lc:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.performActivityCreated(r1)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r4.mDispatcher
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r2 = r1.mSavedFragmentState
            r3 = 0
            r0.dispatchOnFragmentActivityCreated(r1, r2, r3)
            return
    }

    void addViewToContainer() {
            r3 = this;
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            androidx.fragment.app.Fragment r1 = r3.mFragment
            int r0 = r0.findFragmentIndexInContainer(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            android.view.ViewGroup r2 = r1.mContainer
            android.view.View r1 = r1.mView
            r2.addView(r1, r0)
            return
    }

    void attach() {
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto Lc
            androidx.fragment.app.Fragment r0 = r6.mFragment
            java.util.Objects.toString(r0)
        Lc:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.Fragment r1 = r0.mTarget
            r2 = 0
            java.lang.String r3 = " that does not belong to this FragmentManager!"
            java.lang.String r4 = " declared target fragment "
            java.lang.String r5 = "Fragment "
            if (r1 == 0) goto L53
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            java.lang.String r1 = r1.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            if (r0 == 0) goto L2f
            androidx.fragment.app.Fragment r1 = r6.mFragment
            androidx.fragment.app.Fragment r3 = r1.mTarget
            java.lang.String r3 = r3.mWho
            r1.mTargetWho = r3
            r1.mTarget = r2
            r2 = r0
            goto L84
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            androidx.fragment.app.Fragment r2 = r6.mFragment
            r1.append(r2)
            r1.append(r4)
            androidx.fragment.app.Fragment r2 = r6.mFragment
            androidx.fragment.app.Fragment r2 = r2.mTarget
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L53:
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto L84
            androidx.fragment.app.FragmentStore r1 = r6.mFragmentStore
            androidx.fragment.app.FragmentStateManager r2 = r1.getFragmentStateManager(r0)
            if (r2 == 0) goto L60
            goto L84
        L60:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            androidx.fragment.app.Fragment r2 = r6.mFragment
            r1.append(r2)
            r1.append(r4)
            androidx.fragment.app.Fragment r2 = r6.mFragment
            java.lang.String r2 = r2.mTargetWho
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L84:
            if (r2 == 0) goto L96
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 != 0) goto L93
            androidx.fragment.app.Fragment r0 = r2.getFragment()
            int r0 = r0.mState
            r1 = 1
            if (r0 >= r1) goto L96
        L93:
            r2.moveToExpectedState()
        L96:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r1 = r1.getHost()
            r0.mHost = r1
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            androidx.fragment.app.Fragment r1 = r1.getParent()
            r0.mParentFragment = r1
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r6.mDispatcher
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r2 = 0
            r0.dispatchOnFragmentPreAttached(r1, r2)
            androidx.fragment.app.Fragment r0 = r6.mFragment
            r0.performAttach()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r6.mDispatcher
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r0.dispatchOnFragmentAttached(r1, r2)
            return
    }

    int computeExpectedState() {
            r9 = this;
            androidx.fragment.app.Fragment r0 = r9.mFragment
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            if (r1 != 0) goto L9
            int r0 = r0.mState
            return r0
        L9:
            int r1 = r9.mFragmentManagerState
            int[] r2 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State
            androidx.lifecycle.Lifecycle$State r0 = r0.mMaxState
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 5
            r3 = -1
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            if (r0 == r7) goto L37
            if (r0 == r6) goto L33
            if (r0 == r4) goto L2e
            if (r0 == r5) goto L28
            int r1 = java.lang.Math.min(r1, r3)
            goto L37
        L28:
            r0 = 0
            int r1 = java.lang.Math.min(r1, r0)
            goto L37
        L2e:
            int r1 = java.lang.Math.min(r1, r7)
            goto L37
        L33:
            int r1 = java.lang.Math.min(r1, r2)
        L37:
            androidx.fragment.app.Fragment r0 = r9.mFragment
            boolean r8 = r0.mFromLayout
            if (r8 == 0) goto L67
            boolean r8 = r0.mInLayout
            if (r8 == 0) goto L58
            int r0 = r9.mFragmentManagerState
            int r1 = java.lang.Math.max(r0, r6)
            androidx.fragment.app.Fragment r0 = r9.mFragment
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L67
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L67
            int r1 = java.lang.Math.min(r1, r6)
            goto L67
        L58:
            int r8 = r9.mFragmentManagerState
            if (r8 >= r5) goto L63
            int r0 = r0.mState
            int r1 = java.lang.Math.min(r1, r0)
            goto L67
        L63:
            int r1 = java.lang.Math.min(r1, r7)
        L67:
            androidx.fragment.app.Fragment r0 = r9.mFragment
            boolean r0 = r0.mAdded
            if (r0 != 0) goto L71
            int r1 = java.lang.Math.min(r1, r7)
        L71:
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 == 0) goto L88
            androidx.fragment.app.Fragment r0 = r9.mFragment
            android.view.ViewGroup r8 = r0.mContainer
            if (r8 == 0) goto L88
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.SpecialEffectsController r0 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r8, r0)
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r0.getAwaitingCompletionLifecycleImpact(r9)
            goto L89
        L88:
            r0 = 0
        L89:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r8 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            if (r0 != r8) goto L93
            r0 = 6
            int r1 = java.lang.Math.min(r1, r0)
            goto Lb1
        L93:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r8 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
            if (r0 != r8) goto L9c
            int r1 = java.lang.Math.max(r1, r4)
            goto Lb1
        L9c:
            androidx.fragment.app.Fragment r0 = r9.mFragment
            boolean r4 = r0.mRemoving
            if (r4 == 0) goto Lb1
            boolean r0 = r0.isInBackStack()
            if (r0 == 0) goto Lad
            int r1 = java.lang.Math.min(r1, r7)
            goto Lb1
        Lad:
            int r1 = java.lang.Math.min(r1, r3)
        Lb1:
            androidx.fragment.app.Fragment r0 = r9.mFragment
            boolean r3 = r0.mDeferStart
            if (r3 == 0) goto Lbf
            int r0 = r0.mState
            if (r0 >= r2) goto Lbf
            int r1 = java.lang.Math.min(r1, r5)
        Lbf:
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)
            if (r0 == 0) goto Lca
            androidx.fragment.app.Fragment r0 = r9.mFragment
            java.util.Objects.toString(r0)
        Lca:
            return r1
    }

    void create() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto Lc
            androidx.fragment.app.Fragment r0 = r4.mFragment
            java.util.Objects.toString(r0)
        Lc:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            boolean r1 = r0.mIsCreated
            if (r1 != 0) goto L2b
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r4.mDispatcher
            android.os.Bundle r2 = r0.mSavedFragmentState
            r3 = 0
            r1.dispatchOnFragmentPreCreated(r0, r2, r3)
            androidx.fragment.app.Fragment r0 = r4.mFragment
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.performCreate(r1)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r4.mDispatcher
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r2 = r1.mSavedFragmentState
            r0.dispatchOnFragmentCreated(r1, r2, r3)
            return
        L2b:
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.restoreChildFragmentState(r1)
            androidx.fragment.app.Fragment r0 = r4.mFragment
            r1 = 1
            r0.mState = r1
            return
    }

    void createView() {
            r6 = this;
            androidx.fragment.app.Fragment r0 = r6.mFragment
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L13
            androidx.fragment.app.Fragment r0 = r6.mFragment
            java.util.Objects.toString(r0)
        L13:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            android.os.Bundle r1 = r0.mSavedFragmentState
            android.view.LayoutInflater r0 = r0.performGetLayoutInflater(r1)
            androidx.fragment.app.Fragment r1 = r6.mFragment
            android.view.ViewGroup r2 = r1.mContainer
            if (r2 == 0) goto L23
            goto La3
        L23:
            int r2 = r1.mContainerId
            if (r2 == 0) goto La2
            r3 = -1
            if (r2 == r3) goto L84
            androidx.fragment.app.FragmentManager r1 = r1.mFragmentManager
            androidx.fragment.app.FragmentContainer r1 = r1.getContainer()
            androidx.fragment.app.Fragment r2 = r6.mFragment
            int r2 = r2.mContainerId
            android.view.View r1 = r1.onFindViewById(r2)
            r2 = r1
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto La3
            androidx.fragment.app.Fragment r1 = r6.mFragment
            boolean r3 = r1.mRestored
            if (r3 == 0) goto L44
            goto La3
        L44:
            android.content.res.Resources r0 = r1.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L51
            androidx.fragment.app.Fragment r1 = r6.mFragment     // Catch: android.content.res.Resources.NotFoundException -> L51
            int r1 = r1.mContainerId     // Catch: android.content.res.Resources.NotFoundException -> L51
            java.lang.String r0 = r0.getResourceName(r1)     // Catch: android.content.res.Resources.NotFoundException -> L51
            goto L53
        L51:
            java.lang.String r0 = "unknown"
        L53:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            androidx.fragment.app.Fragment r3 = r6.mFragment
            int r3 = r3.mContainerId
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            androidx.fragment.app.Fragment r0 = r6.mFragment
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L84:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            androidx.fragment.app.Fragment r2 = r6.mFragment
            r1.append(r2)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La2:
            r2 = 0
        La3:
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r1.mContainer = r2
            android.os.Bundle r3 = r1.mSavedFragmentState
            r1.performCreateView(r0, r2, r3)
            androidx.fragment.app.Fragment r0 = r6.mFragment
            android.view.View r0 = r0.mView
            r1 = 2
            if (r0 == 0) goto L150
            r3 = 0
            r0.setSaveFromParentEnabled(r3)
            androidx.fragment.app.Fragment r0 = r6.mFragment
            android.view.View r4 = r0.mView
            int r5 = androidx.fragment.R.id.fragment_container_view_tag
            r4.setTag(r5, r0)
            if (r2 == 0) goto Lc5
            r6.addViewToContainer()
        Lc5:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            boolean r2 = r0.mHidden
            if (r2 == 0) goto Ld2
            android.view.View r0 = r0.mView
            r2 = 8
            r0.setVisibility(r2)
        Ld2:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            android.view.View r0 = r0.mView
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            if (r0 == 0) goto Le4
            androidx.fragment.app.Fragment r0 = r6.mFragment
            android.view.View r0 = r0.mView
            androidx.core.view.ViewCompat.requestApplyInsets(r0)
            goto Lf0
        Le4:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            android.view.View r0 = r0.mView
            androidx.fragment.app.FragmentStateManager$1 r2 = new androidx.fragment.app.FragmentStateManager$1
            r2.<init>(r6, r0)
            r0.addOnAttachStateChangeListener(r2)
        Lf0:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            r0.performViewCreated()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r6.mDispatcher
            androidx.fragment.app.Fragment r2 = r6.mFragment
            android.view.View r4 = r2.mView
            android.os.Bundle r5 = r2.mSavedFragmentState
            r0.dispatchOnFragmentViewCreated(r2, r4, r5, r3)
            androidx.fragment.app.Fragment r0 = r6.mFragment
            android.view.View r0 = r0.mView
            int r0 = r0.getVisibility()
            androidx.fragment.app.Fragment r2 = r6.mFragment
            android.view.View r2 = r2.mView
            float r2 = r2.getAlpha()
            boolean r4 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r4 == 0) goto L145
            androidx.fragment.app.Fragment r3 = r6.mFragment
            r3.setPostOnViewCreatedAlpha(r2)
            androidx.fragment.app.Fragment r2 = r6.mFragment
            android.view.ViewGroup r3 = r2.mContainer
            if (r3 == 0) goto L150
            if (r0 != 0) goto L150
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            if (r0 == 0) goto L13c
            androidx.fragment.app.Fragment r2 = r6.mFragment
            r2.setFocusedView(r0)
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            if (r2 == 0) goto L13c
            r0.toString()
            androidx.fragment.app.Fragment r0 = r6.mFragment
            java.util.Objects.toString(r0)
        L13c:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            android.view.View r0 = r0.mView
            r2 = 0
            r0.setAlpha(r2)
            goto L150
        L145:
            androidx.fragment.app.Fragment r2 = r6.mFragment
            if (r0 != 0) goto L14e
            android.view.ViewGroup r0 = r2.mContainer
            if (r0 == 0) goto L14e
            r3 = 1
        L14e:
            r2.mIsNewlyAdded = r3
        L150:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            r0.mState = r1
            return
    }

    void destroy() {
            r5 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto Lc
            androidx.fragment.app.Fragment r0 = r5.mFragment
            java.util.Objects.toString(r0)
        Lc:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r1 = r0.mRemoving
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            boolean r0 = r0.isInBackStack()
            if (r0 != 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 != 0) goto L49
            androidx.fragment.app.FragmentStore r1 = r5.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r1.getNonConfig()
            androidx.fragment.app.Fragment r4 = r5.mFragment
            boolean r1 = r1.shouldDestroy(r4)
            if (r1 == 0) goto L2e
            goto L49
        L2e:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto L44
            androidx.fragment.app.FragmentStore r1 = r5.mFragmentStore
            androidx.fragment.app.Fragment r0 = r1.findActiveFragment(r0)
            if (r0 == 0) goto L44
            boolean r1 = r0.mRetainInstance
            if (r1 == 0) goto L44
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.mTarget = r0
        L44:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.mState = r2
            return
        L49:
            androidx.fragment.app.Fragment r1 = r5.mFragment
            androidx.fragment.app.FragmentHostCallback<?> r1 = r1.mHost
            boolean r4 = r1 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r4 == 0) goto L5c
            androidx.fragment.app.FragmentStore r1 = r5.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r1.getNonConfig()
            boolean r3 = r1.isCleared()
            goto L6f
        L5c:
            android.content.Context r4 = r1.getContext()
            boolean r4 = r4 instanceof android.app.Activity
            if (r4 == 0) goto L6f
            android.content.Context r1 = r1.getContext()
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r3 = r3 ^ r1
        L6f:
            if (r0 != 0) goto L73
            if (r3 == 0) goto L7e
        L73:
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r0 = r0.getNonConfig()
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r0.clearNonConfigState(r1)
        L7e:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.performDestroy()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r5.mDispatcher
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r0.dispatchOnFragmentDestroyed(r1, r2)
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.Iterator r0 = r0.iterator()
        L94:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lba
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto L94
            androidx.fragment.app.Fragment r1 = r1.getFragment()
            androidx.fragment.app.Fragment r2 = r5.mFragment
            java.lang.String r2 = r2.mWho
            java.lang.String r3 = r1.mTargetWho
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L94
            androidx.fragment.app.Fragment r2 = r5.mFragment
            r1.mTarget = r2
            r2 = 0
            r1.mTargetWho = r2
            goto L94
        Lba:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            java.lang.String r1 = r0.mTargetWho
            if (r1 == 0) goto Lc8
            androidx.fragment.app.FragmentStore r2 = r5.mFragmentStore
            androidx.fragment.app.Fragment r1 = r2.findActiveFragment(r1)
            r0.mTarget = r1
        Lc8:
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            r0.makeInactive(r5)
            return
    }

    void destroyFragmentView() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto Lc
            androidx.fragment.app.Fragment r0 = r3.mFragment
            java.util.Objects.toString(r0)
        Lc:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.ViewGroup r1 = r0.mContainer
            if (r1 == 0) goto L19
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L19
            r1.removeView(r0)
        L19:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performDestroyView()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentViewDestroyed(r1, r2)
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r1 = 0
            r0.mContainer = r1
            r0.mView = r1
            r0.mViewLifecycleOwner = r1
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r0 = r0.mViewLifecycleOwnerLiveData
            r0.setValue(r1)
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.mInLayout = r2
            return
    }

    void detach() {
            r4 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r1 == 0) goto Lc
            androidx.fragment.app.Fragment r1 = r4.mFragment
            java.util.Objects.toString(r1)
        Lc:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r1.performDetach()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r4.mDispatcher
            androidx.fragment.app.Fragment r2 = r4.mFragment
            r3 = 0
            r1.dispatchOnFragmentDetached(r2, r3)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r2 = -1
            r1.mState = r2
            r2 = 0
            r1.mHost = r2
            r1.mParentFragment = r2
            r1.mFragmentManager = r2
            boolean r2 = r1.mRemoving
            if (r2 == 0) goto L30
            boolean r1 = r1.isInBackStack()
            if (r1 != 0) goto L30
            goto L3e
        L30:
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r1.getNonConfig()
            androidx.fragment.app.Fragment r2 = r4.mFragment
            boolean r1 = r1.shouldDestroy(r2)
            if (r1 == 0) goto L4e
        L3e:
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L49
            androidx.fragment.app.Fragment r0 = r4.mFragment
            java.util.Objects.toString(r0)
        L49:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            r0.initState()
        L4e:
            return
    }

    void ensureInflatedView() {
            r5 = this;
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r1 = r0.mFromLayout
            if (r1 == 0) goto L5f
            boolean r1 = r0.mInLayout
            if (r1 == 0) goto L5f
            boolean r0 = r0.mPerformedCreateView
            if (r0 != 0) goto L5f
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1a
            androidx.fragment.app.Fragment r0 = r5.mFragment
            java.util.Objects.toString(r0)
        L1a:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.os.Bundle r1 = r0.mSavedFragmentState
            android.view.LayoutInflater r1 = r0.performGetLayoutInflater(r1)
            androidx.fragment.app.Fragment r2 = r5.mFragment
            android.os.Bundle r2 = r2.mSavedFragmentState
            r3 = 0
            r0.performCreateView(r1, r3, r2)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L5f
            r1 = 0
            r0.setSaveFromParentEnabled(r1)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r2 = r0.mView
            int r3 = androidx.fragment.R.id.fragment_container_view_tag
            r2.setTag(r3, r0)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r2 = r0.mHidden
            if (r2 == 0) goto L4a
            android.view.View r0 = r0.mView
            r2 = 8
            r0.setVisibility(r2)
        L4a:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.performViewCreated()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r5.mDispatcher
            androidx.fragment.app.Fragment r2 = r5.mFragment
            android.view.View r3 = r2.mView
            android.os.Bundle r4 = r2.mSavedFragmentState
            r0.dispatchOnFragmentViewCreated(r2, r3, r4, r1)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r1 = 2
            r0.mState = r1
        L5f:
            return
    }

    @androidx.annotation.NonNull
    androidx.fragment.app.Fragment getFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mFragment
            return r0
    }

    void moveToExpectedState() {
            r6 = this;
            boolean r0 = r6.mMovingToState
            r1 = 2
            if (r0 == 0) goto L13
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            if (r0 == 0) goto L12
            androidx.fragment.app.Fragment r0 = r6.getFragment()
            java.util.Objects.toString(r0)
        L12:
            return
        L13:
            r0 = 0
            r2 = 1
            r6.mMovingToState = r2     // Catch: java.lang.Throwable -> L2d
        L17:
            int r3 = r6.computeExpectedState()     // Catch: java.lang.Throwable -> L2d
            androidx.fragment.app.Fragment r4 = r6.mFragment     // Catch: java.lang.Throwable -> L2d
            int r5 = r4.mState     // Catch: java.lang.Throwable -> L2d
            if (r3 == r5) goto Lcf
            if (r3 <= r5) goto L70
            int r5 = r5 + 1
            switch(r5) {
                case 0: goto L6c;
                case 1: goto L68;
                case 2: goto L61;
                case 3: goto L5d;
                case 4: goto L38;
                case 5: goto L34;
                case 6: goto L30;
                case 7: goto L29;
                default: goto L28;
            }     // Catch: java.lang.Throwable -> L2d
        L28:
            goto L17
        L29:
            r6.resume()     // Catch: java.lang.Throwable -> L2d
            goto L17
        L2d:
            r1 = move-exception
            goto L109
        L30:
            r3 = 6
            r4.mState = r3     // Catch: java.lang.Throwable -> L2d
            goto L17
        L34:
            r6.start()     // Catch: java.lang.Throwable -> L2d
            goto L17
        L38:
            android.view.View r3 = r4.mView     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L57
            android.view.ViewGroup r3 = r4.mContainer     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L57
            androidx.fragment.app.FragmentManager r4 = r4.getParentFragmentManager()     // Catch: java.lang.Throwable -> L2d
            androidx.fragment.app.SpecialEffectsController r3 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r3, r4)     // Catch: java.lang.Throwable -> L2d
            androidx.fragment.app.Fragment r4 = r6.mFragment     // Catch: java.lang.Throwable -> L2d
            android.view.View r4 = r4.mView     // Catch: java.lang.Throwable -> L2d
            int r4 = r4.getVisibility()     // Catch: java.lang.Throwable -> L2d
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r4)     // Catch: java.lang.Throwable -> L2d
            r3.enqueueAdd(r4, r6)     // Catch: java.lang.Throwable -> L2d
        L57:
            androidx.fragment.app.Fragment r3 = r6.mFragment     // Catch: java.lang.Throwable -> L2d
            r4 = 4
            r3.mState = r4     // Catch: java.lang.Throwable -> L2d
            goto L17
        L5d:
            r6.activityCreated()     // Catch: java.lang.Throwable -> L2d
            goto L17
        L61:
            r6.ensureInflatedView()     // Catch: java.lang.Throwable -> L2d
            r6.createView()     // Catch: java.lang.Throwable -> L2d
            goto L17
        L68:
            r6.create()     // Catch: java.lang.Throwable -> L2d
            goto L17
        L6c:
            r6.attach()     // Catch: java.lang.Throwable -> L2d
            goto L17
        L70:
            int r5 = r5 + (-1)
            switch(r5) {
                case -1: goto Lca;
                case 0: goto Lc5;
                case 1: goto Lbc;
                case 2: goto Lb6;
                case 3: goto L82;
                case 4: goto L7e;
                case 5: goto L7a;
                case 6: goto L76;
                default: goto L75;
            }     // Catch: java.lang.Throwable -> L2d
        L75:
            goto L17
        L76:
            r6.pause()     // Catch: java.lang.Throwable -> L2d
            goto L17
        L7a:
            r3 = 5
            r4.mState = r3     // Catch: java.lang.Throwable -> L2d
            goto L17
        L7e:
            r6.stop()     // Catch: java.lang.Throwable -> L2d
            goto L17
        L82:
            r3 = 3
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L8e
            androidx.fragment.app.Fragment r4 = r6.mFragment     // Catch: java.lang.Throwable -> L2d
            java.util.Objects.toString(r4)     // Catch: java.lang.Throwable -> L2d
        L8e:
            androidx.fragment.app.Fragment r4 = r6.mFragment     // Catch: java.lang.Throwable -> L2d
            android.view.View r5 = r4.mView     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L9b
            android.util.SparseArray<android.os.Parcelable> r4 = r4.mSavedViewState     // Catch: java.lang.Throwable -> L2d
            if (r4 != 0) goto L9b
            r6.saveViewState()     // Catch: java.lang.Throwable -> L2d
        L9b:
            androidx.fragment.app.Fragment r4 = r6.mFragment     // Catch: java.lang.Throwable -> L2d
            android.view.View r5 = r4.mView     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto Lb0
            android.view.ViewGroup r5 = r4.mContainer     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto Lb0
            androidx.fragment.app.FragmentManager r4 = r4.getParentFragmentManager()     // Catch: java.lang.Throwable -> L2d
            androidx.fragment.app.SpecialEffectsController r4 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r5, r4)     // Catch: java.lang.Throwable -> L2d
            r4.enqueueRemove(r6)     // Catch: java.lang.Throwable -> L2d
        Lb0:
            androidx.fragment.app.Fragment r4 = r6.mFragment     // Catch: java.lang.Throwable -> L2d
            r4.mState = r3     // Catch: java.lang.Throwable -> L2d
            goto L17
        Lb6:
            r4.mInLayout = r0     // Catch: java.lang.Throwable -> L2d
            r4.mState = r1     // Catch: java.lang.Throwable -> L2d
            goto L17
        Lbc:
            r6.destroyFragmentView()     // Catch: java.lang.Throwable -> L2d
            androidx.fragment.app.Fragment r3 = r6.mFragment     // Catch: java.lang.Throwable -> L2d
            r3.mState = r2     // Catch: java.lang.Throwable -> L2d
            goto L17
        Lc5:
            r6.destroy()     // Catch: java.lang.Throwable -> L2d
            goto L17
        Lca:
            r6.detach()     // Catch: java.lang.Throwable -> L2d
            goto L17
        Lcf:
            boolean r1 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L106
            boolean r1 = r4.mHiddenChanged     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L106
            android.view.View r1 = r4.mView     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto Lf4
            android.view.ViewGroup r1 = r4.mContainer     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto Lf4
            androidx.fragment.app.FragmentManager r2 = r4.getParentFragmentManager()     // Catch: java.lang.Throwable -> L2d
            androidx.fragment.app.SpecialEffectsController r1 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r1, r2)     // Catch: java.lang.Throwable -> L2d
            androidx.fragment.app.Fragment r2 = r6.mFragment     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r2.mHidden     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto Lf1
            r1.enqueueHide(r6)     // Catch: java.lang.Throwable -> L2d
            goto Lf4
        Lf1:
            r1.enqueueShow(r6)     // Catch: java.lang.Throwable -> L2d
        Lf4:
            androidx.fragment.app.Fragment r1 = r6.mFragment     // Catch: java.lang.Throwable -> L2d
            androidx.fragment.app.FragmentManager r2 = r1.mFragmentManager     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto Lfd
            r2.invalidateMenuForFragment(r1)     // Catch: java.lang.Throwable -> L2d
        Lfd:
            androidx.fragment.app.Fragment r1 = r6.mFragment     // Catch: java.lang.Throwable -> L2d
            r1.mHiddenChanged = r0     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r1.mHidden     // Catch: java.lang.Throwable -> L2d
            r1.onHiddenChanged(r2)     // Catch: java.lang.Throwable -> L2d
        L106:
            r6.mMovingToState = r0
            return
        L109:
            r6.mMovingToState = r0
            throw r1
    }

    void pause() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto Lc
            androidx.fragment.app.Fragment r0 = r3.mFragment
            java.util.Objects.toString(r0)
        Lc:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performPause()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentPaused(r1, r2)
            return
    }

    void restoreState(@androidx.annotation.NonNull java.lang.ClassLoader r4) {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.os.Bundle r0 = r0.mSavedFragmentState
            if (r0 != 0) goto L7
            goto L64
        L7:
            r0.setClassLoader(r4)
            androidx.fragment.app.Fragment r4 = r3.mFragment
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r4.mSavedViewState = r0
            androidx.fragment.app.Fragment r4 = r3.mFragment
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r1 = "android:view_registry_state"
            android.os.Bundle r0 = r0.getBundle(r1)
            r4.mSavedViewRegistryState = r0
            androidx.fragment.app.Fragment r4 = r3.mFragment
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r1 = "android:target_state"
            java.lang.String r0 = r0.getString(r1)
            r4.mTargetWho = r0
            androidx.fragment.app.Fragment r4 = r3.mFragment
            java.lang.String r0 = r4.mTargetWho
            if (r0 == 0) goto L3f
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r1 = "android:target_req_state"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            r4.mTargetRequestCode = r0
        L3f:
            androidx.fragment.app.Fragment r4 = r3.mFragment
            java.lang.Boolean r0 = r4.mSavedUserVisibleHint
            r1 = 1
            if (r0 == 0) goto L52
            boolean r0 = r0.booleanValue()
            r4.mUserVisibleHint = r0
            androidx.fragment.app.Fragment r4 = r3.mFragment
            r0 = 0
            r4.mSavedUserVisibleHint = r0
            goto L5c
        L52:
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r2 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r2, r1)
            r4.mUserVisibleHint = r0
        L5c:
            androidx.fragment.app.Fragment r4 = r3.mFragment
            boolean r0 = r4.mUserVisibleHint
            if (r0 != 0) goto L64
            r4.mDeferStart = r1
        L64:
            return
    }

    void resume() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto Lc
            androidx.fragment.app.Fragment r0 = r4.mFragment
            java.util.Objects.toString(r0)
        Lc:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            android.view.View r0 = r0.getFocusedView()
            if (r0 == 0) goto L37
            boolean r1 = r4.isFragmentViewChild(r0)
            if (r1 == 0) goto L37
            r0.requestFocus()
            r1 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            if (r1 == 0) goto L37
            r0.toString()
            androidx.fragment.app.Fragment r0 = r4.mFragment
            java.util.Objects.toString(r0)
            androidx.fragment.app.Fragment r0 = r4.mFragment
            android.view.View r0 = r0.mView
            android.view.View r0 = r0.findFocus()
            java.util.Objects.toString(r0)
        L37:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            r1 = 0
            r0.setFocusedView(r1)
            androidx.fragment.app.Fragment r0 = r4.mFragment
            r0.performResume()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r4.mDispatcher
            androidx.fragment.app.Fragment r2 = r4.mFragment
            r3 = 0
            r0.dispatchOnFragmentResumed(r2, r3)
            androidx.fragment.app.Fragment r0 = r4.mFragment
            r0.mSavedFragmentState = r1
            r0.mSavedViewState = r1
            r0.mSavedViewRegistryState = r1
            return
    }

    @androidx.annotation.Nullable
    androidx.fragment.app.Fragment.SavedState saveInstanceState() {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.mFragment
            int r0 = r0.mState
            r1 = -1
            r2 = 0
            if (r0 <= r1) goto L14
            android.os.Bundle r0 = r3.saveBasicState()
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment$SavedState r1 = new androidx.fragment.app.Fragment$SavedState
            r1.<init>(r0)
            return r1
        L14:
            return r2
    }

    @androidx.annotation.NonNull
    androidx.fragment.app.FragmentState saveState() {
            r4 = this;
            androidx.fragment.app.FragmentState r0 = new androidx.fragment.app.FragmentState
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            int r2 = r1.mState
            r3 = -1
            if (r2 <= r3) goto L40
            android.os.Bundle r2 = r0.mSavedFragmentState
            if (r2 != 0) goto L40
            android.os.Bundle r1 = r4.saveBasicState()
            r0.mSavedFragmentState = r1
            androidx.fragment.app.Fragment r2 = r4.mFragment
            java.lang.String r2 = r2.mTargetWho
            if (r2 == 0) goto L3f
            if (r1 != 0) goto L27
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.mSavedFragmentState = r1
        L27:
            android.os.Bundle r1 = r0.mSavedFragmentState
            androidx.fragment.app.Fragment r2 = r4.mFragment
            java.lang.String r2 = r2.mTargetWho
            java.lang.String r3 = "android:target_state"
            r1.putString(r3, r2)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            int r1 = r1.mTargetRequestCode
            if (r1 == 0) goto L3f
            android.os.Bundle r2 = r0.mSavedFragmentState
            java.lang.String r3 = "android:target_req_state"
            r2.putInt(r3, r1)
        L3f:
            return r0
        L40:
            android.os.Bundle r1 = r1.mSavedFragmentState
            r0.mSavedFragmentState = r1
            return r0
    }

    void saveViewState() {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.mFragment
            android.view.View r0 = r0.mView
            if (r0 != 0) goto L7
            goto L33
        L7:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r2.mFragment
            android.view.View r1 = r1.mView
            r1.saveHierarchyState(r0)
            int r1 = r0.size()
            if (r1 <= 0) goto L1d
            androidx.fragment.app.Fragment r1 = r2.mFragment
            r1.mSavedViewState = r0
        L1d:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r2.mFragment
            androidx.fragment.app.FragmentViewLifecycleOwner r1 = r1.mViewLifecycleOwner
            r1.performSave(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L33
            androidx.fragment.app.Fragment r1 = r2.mFragment
            r1.mSavedViewRegistryState = r0
        L33:
            return
    }

    void setFragmentManagerState(int r1) {
            r0 = this;
            r0.mFragmentManagerState = r1
            return
    }

    void start() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto Lc
            androidx.fragment.app.Fragment r0 = r3.mFragment
            java.util.Objects.toString(r0)
        Lc:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performStart()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentStarted(r1, r2)
            return
    }

    void stop() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto Lc
            androidx.fragment.app.Fragment r0 = r3.mFragment
            java.util.Objects.toString(r0)
        Lc:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performStop()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentStopped(r1, r2)
            return
    }
}
