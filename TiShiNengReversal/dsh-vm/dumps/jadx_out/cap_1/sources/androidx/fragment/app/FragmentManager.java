package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class FragmentManager implements androidx.fragment.app.FragmentResultOwner {
    private static boolean DEBUG = false;
    private static final java.lang.String EXTRA_CREATED_FILLIN_INTENT = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    static final java.lang.String TAG = "FragmentManager";
    static boolean USE_STATE_MANAGER = true;
    java.util.ArrayList<androidx.fragment.app.BackStackRecord> mBackStack;
    private java.util.ArrayList<androidx.fragment.app.FragmentManager.OnBackStackChangedListener> mBackStackChangeListeners;
    private final java.util.concurrent.atomic.AtomicInteger mBackStackIndex;
    private androidx.fragment.app.FragmentContainer mContainer;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mCreatedMenus;
    int mCurState;
    private androidx.fragment.app.SpecialEffectsControllerFactory mDefaultSpecialEffectsControllerFactory;
    private boolean mDestroyed;
    private java.lang.Runnable mExecCommit;
    private boolean mExecutingActions;
    private java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> mExitAnimationCancellationSignals;
    private androidx.fragment.app.FragmentFactory mFragmentFactory;
    private final androidx.fragment.app.FragmentStore mFragmentStore;
    private final androidx.fragment.app.FragmentTransition.Callback mFragmentTransitionCallback;
    private boolean mHavePendingDeferredStart;
    private androidx.fragment.app.FragmentHostCallback<?> mHost;
    private androidx.fragment.app.FragmentFactory mHostFragmentFactory;
    java.util.ArrayDeque<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> mLaunchedFragments;
    private final androidx.fragment.app.FragmentLayoutInflaterFactory mLayoutInflaterFactory;
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher mLifecycleCallbacksDispatcher;
    private boolean mNeedMenuInvalidate;
    private androidx.fragment.app.FragmentManagerViewModel mNonConfig;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> mOnAttachListeners;
    private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback;
    private androidx.activity.OnBackPressedDispatcher mOnBackPressedDispatcher;
    private androidx.fragment.app.Fragment mParent;
    private final java.util.ArrayList<androidx.fragment.app.FragmentManager.OpGenerator> mPendingActions;
    private java.util.ArrayList<androidx.fragment.app.FragmentManager.StartEnterTransitionListener> mPostponedTransactions;

    @androidx.annotation.Nullable
    androidx.fragment.app.Fragment mPrimaryNav;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String[]> mRequestPermissions;
    private final java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager.LifecycleAwareResultListener> mResultListeners;
    private final java.util.Map<java.lang.String, android.os.Bundle> mResults;
    private androidx.fragment.app.SpecialEffectsControllerFactory mSpecialEffectsControllerFactory;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> mStartActivityForResult;
    private androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> mStartIntentSenderForResult;
    private boolean mStateSaved;
    private boolean mStopped;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mTmpAddedFragments;
    private java.util.ArrayList<java.lang.Boolean> mTmpIsPop;
    private java.util.ArrayList<androidx.fragment.app.BackStackRecord> mTmpRecords;












    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface BackStackEntry {
        @androidx.annotation.Nullable
        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbShortTitle();

        @androidx.annotation.StringRes
        @java.lang.Deprecated
        int getBreadCrumbShortTitleRes();

        @androidx.annotation.Nullable
        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbTitle();

        @androidx.annotation.StringRes
        @java.lang.Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        @androidx.annotation.Nullable
        java.lang.String getName();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class FragmentIntentSenderContract extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.IntentSenderRequest, androidx.activity.result.ActivityResult> {
        FragmentIntentSenderContract() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@androidx.annotation.NonNull android.content.Context r4, androidx.activity.result.IntentSenderRequest r5) {
                r3 = this;
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r0 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                r4.<init>(r0)
                android.content.Intent r0 = r5.getFillInIntent()
                if (r0 == 0) goto L42
                java.lang.String r1 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
                android.os.Bundle r2 = r0.getBundleExtra(r1)
                if (r2 == 0) goto L42
                r4.putExtra(r1, r2)
                r0.removeExtra(r1)
                java.lang.String r1 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
                r2 = 0
                boolean r0 = r0.getBooleanExtra(r1, r2)
                if (r0 == 0) goto L42
                androidx.activity.result.IntentSenderRequest$Builder r0 = new androidx.activity.result.IntentSenderRequest$Builder
                android.content.IntentSender r1 = r5.getIntentSender()
                r0.<init>(r1)
                r1 = 0
                androidx.activity.result.IntentSenderRequest$Builder r0 = r0.setFillInIntent(r1)
                int r1 = r5.getFlagsValues()
                int r5 = r5.getFlagsMask()
                androidx.activity.result.IntentSenderRequest$Builder r5 = r0.setFlags(r1, r5)
                androidx.activity.result.IntentSenderRequest r5 = r5.build()
            L42:
                java.lang.String r0 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                r4.putExtra(r0, r5)
                r5 = 2
                boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
                if (r5 == 0) goto L51
                r4.toString()
            L51:
                return r4
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(@androidx.annotation.NonNull android.content.Context r1, androidx.activity.result.IntentSenderRequest r2) {
                r0 = this;
                androidx.activity.result.IntentSenderRequest r2 = (androidx.activity.result.IntentSenderRequest) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @androidx.annotation.NonNull
        public androidx.activity.result.ActivityResult parseResult(int r2, @androidx.annotation.Nullable android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
                r0.<init>(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResult parseResult(int r1, @androidx.annotation.Nullable android.content.Intent r2) {
                r0 = this;
                androidx.activity.result.ActivityResult r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class FragmentLifecycleCallbacks {
        public FragmentLifecycleCallbacks() {
                r0 = this;
                r0.<init>()
                return
        }

        @java.lang.Deprecated
        public void onFragmentActivityCreated(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.Nullable android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentAttached(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.NonNull android.content.Context r3) {
                r0 = this;
                return
        }

        public void onFragmentCreated(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.Nullable android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentDestroyed(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentDetached(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentPaused(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentPreAttached(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.NonNull android.content.Context r3) {
                r0 = this;
                return
        }

        public void onFragmentPreCreated(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.Nullable android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentResumed(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentSaveInstanceState(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.NonNull android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentStarted(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentStopped(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentViewCreated(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.Nullable android.os.Bundle r4) {
                r0 = this;
                return
        }

        public void onFragmentViewDestroyed(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.SuppressLint({"BanParcelableUsage"})
    static class LaunchedFragmentInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> CREATOR = null;
        int mRequestCode;
        java.lang.String mWho;


        static {
                androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1 r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1
                r0.<init>()
                androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.CREATOR = r0
                return
        }

        LaunchedFragmentInfo(@androidx.annotation.NonNull android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.mWho = r0
                int r2 = r2.readInt()
                r1.mRequestCode = r2
                return
        }

        LaunchedFragmentInfo(@androidx.annotation.NonNull java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.mWho = r1
                r0.mRequestCode = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.mWho
                r1.writeString(r2)
                int r2 = r0.mRequestCode
                r1.writeInt(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class LifecycleAwareResultListener implements androidx.fragment.app.FragmentResultListener {
        private final androidx.lifecycle.Lifecycle mLifecycle;
        private final androidx.fragment.app.FragmentResultListener mListener;
        private final androidx.lifecycle.LifecycleEventObserver mObserver;

        LifecycleAwareResultListener(@androidx.annotation.NonNull androidx.lifecycle.Lifecycle r1, @androidx.annotation.NonNull androidx.fragment.app.FragmentResultListener r2, @androidx.annotation.NonNull androidx.lifecycle.LifecycleEventObserver r3) {
                r0 = this;
                r0.<init>()
                r0.mLifecycle = r1
                r0.mListener = r2
                r0.mObserver = r3
                return
        }

        public boolean isAtLeast(androidx.lifecycle.Lifecycle.State r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.mLifecycle
                androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
                boolean r2 = r0.isAtLeast(r2)
                return r2
        }

        @Override // androidx.fragment.app.FragmentResultListener
        public void onFragmentResult(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.os.Bundle r3) {
                r1 = this;
                androidx.fragment.app.FragmentResultListener r0 = r1.mListener
                r0.onFragmentResult(r2, r3)
                return
        }

        public void removeObserver() {
                r2 = this;
                androidx.lifecycle.Lifecycle r0 = r2.mLifecycle
                androidx.lifecycle.LifecycleEventObserver r1 = r2.mObserver
                r0.removeObserver(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnBackStackChangedListener {
        @androidx.annotation.MainThread
        void onBackStackChanged();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface OpGenerator {
        boolean generateOps(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class PopBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        final int mFlags;
        final int mId;
        final java.lang.String mName;
        final /* synthetic */ androidx.fragment.app.FragmentManager this$0;

        PopBackStackState(@androidx.annotation.Nullable androidx.fragment.app.FragmentManager r1, java.lang.String r2, int r3, int r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mName = r2
                r0.mId = r3
                r0.mFlags = r4
                return
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r8) {
                r6 = this;
                androidx.fragment.app.FragmentManager r0 = r6.this$0
                androidx.fragment.app.Fragment r0 = r0.mPrimaryNav
                if (r0 == 0) goto L1a
                int r1 = r6.mId
                if (r1 >= 0) goto L1a
                java.lang.String r1 = r6.mName
                if (r1 != 0) goto L1a
                androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
                boolean r0 = r0.popBackStackImmediate()
                if (r0 == 0) goto L1a
                r7 = 0
                return r7
            L1a:
                androidx.fragment.app.FragmentManager r0 = r6.this$0
                java.lang.String r3 = r6.mName
                int r4 = r6.mId
                int r5 = r6.mFlags
                r1 = r7
                r2 = r8
                boolean r7 = r0.popBackStackState(r1, r2, r3, r4, r5)
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class StartEnterTransitionListener implements androidx.fragment.app.Fragment.OnStartEnterTransitionListener {
        final boolean mIsBack;
        private int mNumPostponed;
        final androidx.fragment.app.BackStackRecord mRecord;

        StartEnterTransitionListener(@androidx.annotation.NonNull androidx.fragment.app.BackStackRecord r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.mIsBack = r2
                r0.mRecord = r1
                return
        }

        void cancelTransaction() {
                r4 = this;
                androidx.fragment.app.BackStackRecord r0 = r4.mRecord
                androidx.fragment.app.FragmentManager r1 = r0.mManager
                boolean r2 = r4.mIsBack
                r3 = 0
                r1.completeExecute(r0, r2, r3, r3)
                return
        }

        void completeTransaction() {
                r5 = this;
                int r0 = r5.mNumPostponed
                r1 = 1
                if (r0 <= 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                androidx.fragment.app.BackStackRecord r2 = r5.mRecord
                androidx.fragment.app.FragmentManager r2 = r2.mManager
                java.util.List r2 = r2.getFragments()
                java.util.Iterator r2 = r2.iterator()
            L14:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L30
                java.lang.Object r3 = r2.next()
                androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
                r4 = 0
                r3.setOnStartEnterTransitionListener(r4)
                if (r0 == 0) goto L14
                boolean r4 = r3.isPostponed()
                if (r4 == 0) goto L14
                r3.startPostponedEnterTransition()
                goto L14
            L30:
                androidx.fragment.app.BackStackRecord r2 = r5.mRecord
                androidx.fragment.app.FragmentManager r3 = r2.mManager
                boolean r4 = r5.mIsBack
                r0 = r0 ^ r1
                r3.completeExecute(r2, r4, r0, r1)
                return
        }

        public boolean isReady() {
                r1 = this;
                int r0 = r1.mNumPostponed
                if (r0 != 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // androidx.fragment.app.Fragment.OnStartEnterTransitionListener
        public void onStartEnterTransition() {
                r1 = this;
                int r0 = r1.mNumPostponed
                int r0 = r0 + (-1)
                r1.mNumPostponed = r0
                if (r0 == 0) goto L9
                return
            L9:
                androidx.fragment.app.BackStackRecord r0 = r1.mRecord
                androidx.fragment.app.FragmentManager r0 = r0.mManager
                r0.scheduleCommit()
                return
        }

        @Override // androidx.fragment.app.Fragment.OnStartEnterTransitionListener
        public void startListening() {
                r1 = this;
                int r0 = r1.mNumPostponed
                int r0 = r0 + 1
                r1.mNumPostponed = r0
                return
        }
    }

    static {
            return
    }

    public FragmentManager() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mPendingActions = r0
            androidx.fragment.app.FragmentStore r0 = new androidx.fragment.app.FragmentStore
            r0.<init>()
            r2.mFragmentStore = r0
            androidx.fragment.app.FragmentLayoutInflaterFactory r0 = new androidx.fragment.app.FragmentLayoutInflaterFactory
            r0.<init>(r2)
            r2.mLayoutInflaterFactory = r0
            androidx.fragment.app.FragmentManager$1 r0 = new androidx.fragment.app.FragmentManager$1
            r1 = 0
            r0.<init>(r2, r1)
            r2.mOnBackPressedCallback = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.mBackStackIndex = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.mResults = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.mResultListeners = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.mExitAnimationCancellationSignals = r0
            androidx.fragment.app.FragmentManager$2 r0 = new androidx.fragment.app.FragmentManager$2
            r0.<init>(r2)
            r2.mFragmentTransitionCallback = r0
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = new androidx.fragment.app.FragmentLifecycleCallbacksDispatcher
            r0.<init>(r2)
            r2.mLifecycleCallbacksDispatcher = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.mOnAttachListeners = r0
            r0 = -1
            r2.mCurState = r0
            r0 = 0
            r2.mFragmentFactory = r0
            androidx.fragment.app.FragmentManager$3 r1 = new androidx.fragment.app.FragmentManager$3
            r1.<init>(r2)
            r2.mHostFragmentFactory = r1
            r2.mSpecialEffectsControllerFactory = r0
            androidx.fragment.app.FragmentManager$4 r0 = new androidx.fragment.app.FragmentManager$4
            r0.<init>(r2)
            r2.mDefaultSpecialEffectsControllerFactory = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.mLaunchedFragments = r0
            androidx.fragment.app.FragmentManager$5 r0 = new androidx.fragment.app.FragmentManager$5
            r0.<init>(r2)
            r2.mExecCommit = r0
            return
    }

    static /* synthetic */ java.util.Map access$000(androidx.fragment.app.FragmentManager r0) {
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r0.mResults
            return r0
    }

    static /* synthetic */ java.util.Map access$100(androidx.fragment.app.FragmentManager r0) {
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r0.mResultListeners
            return r0
    }

    static /* synthetic */ androidx.fragment.app.FragmentStore access$200(androidx.fragment.app.FragmentManager r0) {
            androidx.fragment.app.FragmentStore r0 = r0.mFragmentStore
            return r0
    }

    private void addAddedFragments(@androidx.annotation.NonNull androidx.collection.ArraySet<androidx.fragment.app.Fragment> r5) {
            r4 = this;
            int r0 = r4.mCurState
            r1 = 1
            if (r0 >= r1) goto L6
            goto L38
        L6:
            r1 = 5
            int r0 = java.lang.Math.min(r0, r1)
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            java.util.List r1 = r1.getFragments()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            int r3 = r2.mState
            if (r3 >= r0) goto L15
            r4.moveToState(r2, r0)
            android.view.View r3 = r2.mView
            if (r3 == 0) goto L15
            boolean r3 = r2.mHidden
            if (r3 != 0) goto L15
            boolean r3 = r2.mIsNewlyAdded
            if (r3 == 0) goto L15
            r5.add(r2)
            goto L15
        L38:
            return
    }

    private void cancelExitAnimation(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r3.mExitAnimationCancellationSignals
            java.lang.Object r0 = r0.get(r4)
            java.util.HashSet r0 = (java.util.HashSet) r0
            if (r0 == 0) goto L29
            java.util.Iterator r1 = r0.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            androidx.core.os.CancellationSignal r2 = (androidx.core.os.CancellationSignal) r2
            r2.cancel()
            goto Le
        L1e:
            r0.clear()
            r3.destroyFragmentView(r4)
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r3.mExitAnimationCancellationSignals
            r0.remove(r4)
        L29:
            return
    }

    private void checkStateLoss() {
            r2 = this;
            boolean r0 = r2.isStateSaved()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can not perform this action after onSaveInstanceState"
            r0.<init>(r1)
            throw r0
    }

    private void cleanupExec() {
            r1 = this;
            r0 = 0
            r1.mExecutingActions = r0
            java.util.ArrayList<java.lang.Boolean> r0 = r1.mTmpIsPop
            r0.clear()
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mTmpRecords
            r0.clear()
            return
    }

    private java.util.Set<androidx.fragment.app.SpecialEffectsController> collectAllSpecialEffectsController() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            java.util.List r1 = r1.getActiveFragmentStateManagers()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            androidx.fragment.app.Fragment r2 = r2.getFragment()
            android.view.ViewGroup r2 = r2.mContainer
            if (r2 == 0) goto Lf
            androidx.fragment.app.SpecialEffectsControllerFactory r3 = r4.getSpecialEffectsControllerFactory()
            androidx.fragment.app.SpecialEffectsController r2 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r2, r3)
            r0.add(r2)
            goto Lf
        L2f:
            return r0
    }

    private java.util.Set<androidx.fragment.app.SpecialEffectsController> collectChangedControllers(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r4, int r5, int r6) {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L5:
            if (r5 >= r6) goto L32
            java.lang.Object r1 = r4.get(r5)
            androidx.fragment.app.BackStackRecord r1 = (androidx.fragment.app.BackStackRecord) r1
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r1.mOps
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            androidx.fragment.app.Fragment r2 = r2.mFragment
            if (r2 == 0) goto L13
            android.view.ViewGroup r2 = r2.mContainer
            if (r2 == 0) goto L13
            androidx.fragment.app.SpecialEffectsController r2 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r2, r3)
            r0.add(r2)
            goto L13
        L2f:
            int r5 = r5 + 1
            goto L5
        L32:
            return r0
    }

    private void completeShowHideFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r7) {
            r6 = this;
            android.view.View r0 = r7.mView
            r1 = 0
            if (r0 == 0) goto L77
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            android.content.Context r0 = r0.getContext()
            boolean r2 = r7.mHidden
            r2 = r2 ^ 1
            boolean r3 = r7.getPopDirection()
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = androidx.fragment.app.FragmentAnim.loadAnimation(r0, r7, r2, r3)
            if (r0 == 0) goto L4d
            android.animation.Animator r2 = r0.animator
            if (r2 == 0) goto L4d
            android.view.View r3 = r7.mView
            r2.setTarget(r3)
            boolean r2 = r7.mHidden
            if (r2 == 0) goto L42
            boolean r2 = r7.isHideReplaced()
            if (r2 == 0) goto L30
            r7.setHideReplaced(r1)
            goto L47
        L30:
            android.view.ViewGroup r2 = r7.mContainer
            android.view.View r3 = r7.mView
            r2.startViewTransition(r3)
            android.animation.Animator r4 = r0.animator
            androidx.fragment.app.FragmentManager$7 r5 = new androidx.fragment.app.FragmentManager$7
            r5.<init>(r6, r2, r3, r7)
            r4.addListener(r5)
            goto L47
        L42:
            android.view.View r2 = r7.mView
            r2.setVisibility(r1)
        L47:
            android.animation.Animator r0 = r0.animator
            r0.start()
            goto L77
        L4d:
            if (r0 == 0) goto L5b
            android.view.View r2 = r7.mView
            android.view.animation.Animation r3 = r0.animation
            r2.startAnimation(r3)
            android.view.animation.Animation r0 = r0.animation
            r0.start()
        L5b:
            boolean r0 = r7.mHidden
            if (r0 == 0) goto L68
            boolean r0 = r7.isHideReplaced()
            if (r0 != 0) goto L68
            r0 = 8
            goto L69
        L68:
            r0 = 0
        L69:
            android.view.View r2 = r7.mView
            r2.setVisibility(r0)
            boolean r0 = r7.isHideReplaced()
            if (r0 == 0) goto L77
            r7.setHideReplaced(r1)
        L77:
            r6.invalidateMenuForFragment(r7)
            r7.mHiddenChanged = r1
            boolean r0 = r7.mHidden
            r7.onHiddenChanged(r0)
            return
    }

    private void destroyFragmentView(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            r4.performDestroyView()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mLifecycleCallbacksDispatcher
            r1 = 0
            r0.dispatchOnFragmentViewDestroyed(r4, r1)
            r0 = 0
            r4.mContainer = r0
            r4.mView = r0
            r4.mViewLifecycleOwner = r0
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r2 = r4.mViewLifecycleOwnerLiveData
            r2.setValue(r0)
            r4.mInLayout = r1
            return
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(@androidx.annotation.Nullable androidx.fragment.app.Fragment r2) {
            r1 = this;
            if (r2 == 0) goto L11
            java.lang.String r0 = r2.mWho
            androidx.fragment.app.Fragment r0 = r1.findActiveFragment(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L11
            r2.performPrimaryNavigationFragmentChanged()
        L11:
            return
    }

    private void dispatchStateChange(int r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            r3.mExecutingActions = r0     // Catch: java.lang.Throwable -> L28
            androidx.fragment.app.FragmentStore r2 = r3.mFragmentStore     // Catch: java.lang.Throwable -> L28
            r2.dispatchStateChange(r4)     // Catch: java.lang.Throwable -> L28
            r3.moveToState(r4, r1)     // Catch: java.lang.Throwable -> L28
            boolean r4 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L2a
            java.util.Set r4 = r3.collectAllSpecialEffectsController()     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L28
        L18:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L28
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2     // Catch: java.lang.Throwable -> L28
            r2.forceCompleteAllOperations()     // Catch: java.lang.Throwable -> L28
            goto L18
        L28:
            r4 = move-exception
            goto L30
        L2a:
            r3.mExecutingActions = r1
            r3.execPendingActions(r0)
            return
        L30:
            r3.mExecutingActions = r1
            throw r4
    }

    private void doPendingDeferredStart() {
            r1 = this;
            boolean r0 = r1.mHavePendingDeferredStart
            if (r0 == 0) goto La
            r0 = 0
            r1.mHavePendingDeferredStart = r0
            r1.startPendingDeferredFragments()
        La:
            return
    }

    @java.lang.Deprecated
    public static void enableDebugLogging(boolean r0) {
            androidx.fragment.app.FragmentManager.DEBUG = r0
            return
    }

    @androidx.fragment.app.FragmentStateManagerControl
    public static void enableNewStateManager(boolean r0) {
            androidx.fragment.app.FragmentManager.USE_STATE_MANAGER = r0
            return
    }

    private void endAnimatingAwayFragments() {
            r2 = this;
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 == 0) goto L1c
            java.util.Set r0 = r2.collectAllSpecialEffectsController()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController r1 = (androidx.fragment.app.SpecialEffectsController) r1
            r1.forceCompleteAllOperations()
            goto Lc
        L1c:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L41
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r2.cancelExitAnimation(r1)
            r2.moveToState(r1)
            goto L2e
        L41:
            return
    }

    private void ensureExecReady(boolean r3) {
            r2 = this;
            boolean r0 = r2.mExecutingActions
            if (r0 != 0) goto L5a
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L1c
            boolean r3 = r2.mDestroyed
            if (r3 == 0) goto L14
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager has been destroyed"
            r3.<init>(r0)
            throw r3
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager has not been attached to a host."
            r3.<init>(r0)
            throw r3
        L1c:
            android.os.Looper r0 = android.os.Looper.myLooper()
            androidx.fragment.app.FragmentHostCallback<?> r1 = r2.mHost
            android.os.Handler r1 = r1.getHandler()
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L52
            if (r3 != 0) goto L31
            r2.checkStateLoss()
        L31:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r2.mTmpRecords
            if (r3 != 0) goto L43
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mTmpRecords = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mTmpIsPop = r3
        L43:
            r3 = 1
            r2.mExecutingActions = r3
            r3 = 0
            r0 = 0
            r2.executePostponedTransaction(r0, r0)     // Catch: java.lang.Throwable -> L4e
            r2.mExecutingActions = r3
            return
        L4e:
            r0 = move-exception
            r2.mExecutingActions = r3
            throw r0
        L52:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must be called from main thread of fragment host"
            r3.<init>(r0)
            throw r3
        L5a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager is already executing transactions"
            r3.<init>(r0)
            throw r3
    }

    private static void executeOps(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r4, int r5, int r6) {
        L0:
            if (r5 >= r6) goto L2c
            java.lang.Object r0 = r3.get(r5)
            androidx.fragment.app.BackStackRecord r0 = (androidx.fragment.app.BackStackRecord) r0
            java.lang.Object r1 = r4.get(r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            if (r1 == 0) goto L23
            r1 = -1
            r0.bumpBackStackNesting(r1)
            int r1 = r6 + (-1)
            if (r5 != r1) goto L1e
            goto L1f
        L1e:
            r2 = 0
        L1f:
            r0.executePopOps(r2)
            goto L29
        L23:
            r0.bumpBackStackNesting(r2)
            r0.executeOps()
        L29:
            int r5 = r5 + 1
            goto L0
        L2c:
            return
    }

    private void executeOpsTogether(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r13, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r14, int r15, int r16) {
            r12 = this;
            r4 = r15
            r5 = r16
            java.lang.Object r0 = r13.get(r15)
            androidx.fragment.app.BackStackRecord r0 = (androidx.fragment.app.BackStackRecord) r0
            boolean r8 = r0.mReorderingAllowed
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r12.mTmpAddedFragments
            if (r0 != 0) goto L17
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.mTmpAddedFragments = r0
            goto L1a
        L17:
            r0.clear()
        L1a:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r12.mTmpAddedFragments
            androidx.fragment.app.FragmentStore r1 = r12.mFragmentStore
            java.util.List r1 = r1.getFragments()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r12.getPrimaryNavigationFragment()
            r1 = 0
            r2 = r4
            r9 = 0
        L2c:
            r10 = 1
            if (r2 >= r5) goto L5b
            java.lang.Object r3 = r13.get(r2)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            java.lang.Object r6 = r14.get(r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L48
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r12.mTmpAddedFragments
            androidx.fragment.app.Fragment r0 = r3.expandOps(r6, r0)
            goto L4e
        L48:
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r12.mTmpAddedFragments
            androidx.fragment.app.Fragment r0 = r3.trackAddedFragmentsInPop(r6, r0)
        L4e:
            if (r9 != 0) goto L57
            boolean r3 = r3.mAddToBackStack
            if (r3 == 0) goto L55
            goto L57
        L55:
            r9 = 0
            goto L58
        L57:
            r9 = 1
        L58:
            int r2 = r2 + 1
            goto L2c
        L5b:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r12.mTmpAddedFragments
            r0.clear()
            if (r8 != 0) goto Laa
            int r0 = r12.mCurState
            if (r0 < r10) goto Laa
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 == 0) goto L9a
            r0 = r4
        L6b:
            if (r0 >= r5) goto Laa
            java.lang.Object r1 = r13.get(r0)
            androidx.fragment.app.BackStackRecord r1 = (androidx.fragment.app.BackStackRecord) r1
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r1.mOps
            java.util.Iterator r1 = r1.iterator()
        L79:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L97
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            androidx.fragment.app.Fragment r2 = r2.mFragment
            if (r2 == 0) goto L79
            androidx.fragment.app.FragmentManager r3 = r2.mFragmentManager
            if (r3 == 0) goto L79
            androidx.fragment.app.FragmentStateManager r2 = r12.createOrGetFragmentStateManager(r2)
            androidx.fragment.app.FragmentStore r3 = r12.mFragmentStore
            r3.makeActive(r2)
            goto L79
        L97:
            int r0 = r0 + 1
            goto L6b
        L9a:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r12.mHost
            android.content.Context r0 = r0.getContext()
            androidx.fragment.app.FragmentContainer r1 = r12.mContainer
            r6 = 0
            androidx.fragment.app.FragmentTransition$Callback r7 = r12.mFragmentTransitionCallback
            r2 = r13
            r3 = r14
            androidx.fragment.app.FragmentTransition.startTransitions(r0, r1, r2, r3, r4, r5, r6, r7)
        Laa:
            executeOps(r13, r14, r15, r16)
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 == 0) goto L12d
            int r0 = r5 + (-1)
            java.lang.Object r0 = r14.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r4
        Lbe:
            if (r1 >= r5) goto L108
            java.lang.Object r6 = r13.get(r1)
            androidx.fragment.app.BackStackRecord r6 = (androidx.fragment.app.BackStackRecord) r6
            if (r0 == 0) goto Le7
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r7 = r6.mOps
            int r7 = r7.size()
            int r7 = r7 - r10
        Lcf:
            if (r7 < 0) goto L105
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r8 = r6.mOps
            java.lang.Object r8 = r8.get(r7)
            androidx.fragment.app.FragmentTransaction$Op r8 = (androidx.fragment.app.FragmentTransaction.Op) r8
            androidx.fragment.app.Fragment r8 = r8.mFragment
            if (r8 == 0) goto Le4
            androidx.fragment.app.FragmentStateManager r8 = r12.createOrGetFragmentStateManager(r8)
            r8.moveToExpectedState()
        Le4:
            int r7 = r7 + (-1)
            goto Lcf
        Le7:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r6 = r6.mOps
            java.util.Iterator r6 = r6.iterator()
        Led:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L105
            java.lang.Object r7 = r6.next()
            androidx.fragment.app.FragmentTransaction$Op r7 = (androidx.fragment.app.FragmentTransaction.Op) r7
            androidx.fragment.app.Fragment r7 = r7.mFragment
            if (r7 == 0) goto Led
            androidx.fragment.app.FragmentStateManager r7 = r12.createOrGetFragmentStateManager(r7)
            r7.moveToExpectedState()
            goto Led
        L105:
            int r1 = r1 + 1
            goto Lbe
        L108:
            int r1 = r12.mCurState
            r12.moveToState(r1, r10)
            java.util.Set r1 = r12.collectChangedControllers(r13, r15, r5)
            java.util.Iterator r1 = r1.iterator()
        L115:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L12b
            java.lang.Object r6 = r1.next()
            androidx.fragment.app.SpecialEffectsController r6 = (androidx.fragment.app.SpecialEffectsController) r6
            r6.updateOperationDirection(r0)
            r6.markPostponedState()
            r6.executePendingOperations()
            goto L115
        L12b:
            r11 = r5
            goto L166
        L12d:
            if (r8 == 0) goto L148
            androidx.collection.ArraySet r5 = new androidx.collection.ArraySet
            r5.<init>()
            r12.addAddedFragments(r5)
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r4
            r4 = r16
            int r6 = r0.postponePostponableTransactions(r1, r2, r3, r4, r5)
            r11 = r4
            r4 = r3
            r12.makeRemovedFragmentsInvisible(r5)
            r5 = r6
            goto L149
        L148:
            r11 = r5
        L149:
            if (r5 == r4) goto L166
            if (r8 == 0) goto L166
            int r0 = r12.mCurState
            if (r0 < r10) goto L161
            androidx.fragment.app.FragmentHostCallback<?> r0 = r12.mHost
            android.content.Context r0 = r0.getContext()
            androidx.fragment.app.FragmentContainer r1 = r12.mContainer
            r6 = 1
            androidx.fragment.app.FragmentTransition$Callback r7 = r12.mFragmentTransitionCallback
            r2 = r13
            r3 = r14
            androidx.fragment.app.FragmentTransition.startTransitions(r0, r1, r2, r3, r4, r5, r6, r7)
        L161:
            int r0 = r12.mCurState
            r12.moveToState(r0, r10)
        L166:
            r0 = r15
        L167:
            if (r0 >= r11) goto L188
            java.lang.Object r1 = r13.get(r0)
            androidx.fragment.app.BackStackRecord r1 = (androidx.fragment.app.BackStackRecord) r1
            java.lang.Object r4 = r14.get(r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L182
            int r4 = r1.mIndex
            if (r4 < 0) goto L182
            r4 = -1
            r1.mIndex = r4
        L182:
            r1.runOnCommitRunnables()
            int r0 = r0 + 1
            goto L167
        L188:
            if (r9 == 0) goto L18d
            r12.reportBackStackChanged()
        L18d:
            return
    }

    private void executePostponedTransaction(@androidx.annotation.Nullable java.util.ArrayList<androidx.fragment.app.BackStackRecord> r8, @androidx.annotation.Nullable java.util.ArrayList<java.lang.Boolean> r9) {
            r7 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r7.mPostponedTransactions
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.size()
        Lb:
            r2 = 0
        Lc:
            if (r2 >= r0) goto L83
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r3 = r7.mPostponedTransactions
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.FragmentManager$StartEnterTransitionListener r3 = (androidx.fragment.app.FragmentManager.StartEnterTransitionListener) r3
            r4 = -1
            if (r8 == 0) goto L40
            boolean r5 = r3.mIsBack
            if (r5 != 0) goto L40
            androidx.fragment.app.BackStackRecord r5 = r3.mRecord
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L40
            if (r9 == 0) goto L40
            java.lang.Object r5 = r9.get(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L40
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r4 = r7.mPostponedTransactions
            r4.remove(r2)
            int r2 = r2 + (-1)
            int r0 = r0 + (-1)
            r3.cancelTransaction()
            goto L80
        L40:
            boolean r5 = r3.isReady()
            if (r5 != 0) goto L54
            if (r8 == 0) goto L80
            androidx.fragment.app.BackStackRecord r5 = r3.mRecord
            int r6 = r8.size()
            boolean r5 = r5.interactsWith(r8, r1, r6)
            if (r5 == 0) goto L80
        L54:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r5 = r7.mPostponedTransactions
            r5.remove(r2)
            int r2 = r2 + (-1)
            int r0 = r0 + (-1)
            if (r8 == 0) goto L7d
            boolean r5 = r3.mIsBack
            if (r5 != 0) goto L7d
            androidx.fragment.app.BackStackRecord r5 = r3.mRecord
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L7d
            if (r9 == 0) goto L7d
            java.lang.Object r4 = r9.get(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L7d
            r3.cancelTransaction()
            goto L80
        L7d:
            r3.completeTransaction()
        L80:
            int r2 = r2 + 1
            goto Lc
        L83:
            return
    }

    @androidx.annotation.NonNull
    public static <F extends androidx.fragment.app.Fragment> F findFragment(@androidx.annotation.NonNull android.view.View r3) {
            androidx.fragment.app.Fragment r0 = findViewFragment(r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " does not have a Fragment set"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @androidx.annotation.NonNull
    static androidx.fragment.app.FragmentManager findFragmentManager(@androidx.annotation.NonNull android.view.View r4) {
            androidx.fragment.app.Fragment r0 = findViewFragment(r4)
            if (r0 == 0) goto L35
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto L11
            androidx.fragment.app.FragmentManager r4 = r0.getChildFragmentManager()
            return r4
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The Fragment "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " that owns View "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = " has already been destroyed. Nested fragments should always use the child FragmentManager."
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L35:
            android.content.Context r0 = r4.getContext()
        L39:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L4b
            boolean r1 = r0 instanceof androidx.fragment.app.FragmentActivity
            if (r1 == 0) goto L44
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            goto L4c
        L44:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L39
        L4b:
            r0 = 0
        L4c:
            if (r0 == 0) goto L53
            androidx.fragment.app.FragmentManager r4 = r0.getSupportFragmentManager()
            return r4
        L53:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not within a subclass of FragmentActivity."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @androidx.annotation.Nullable
    private static androidx.fragment.app.Fragment findViewFragment(@androidx.annotation.NonNull android.view.View r2) {
        L0:
            r0 = 0
            if (r2 == 0) goto L17
            androidx.fragment.app.Fragment r1 = getViewFragment(r2)
            if (r1 == 0) goto La
            return r1
        La:
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L15
            android.view.View r2 = (android.view.View) r2
            goto L0
        L15:
            r2 = r0
            goto L0
        L17:
            return r0
    }

    private void forcePostponedTransactions() {
            r2 = this;
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 == 0) goto L1c
            java.util.Set r0 = r2.collectAllSpecialEffectsController()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController r1 = (androidx.fragment.app.SpecialEffectsController) r1
            r1.forcePostponedExecutePendingOperations()
            goto Lc
        L1c:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r2.mPostponedTransactions
            if (r0 == 0) goto L35
        L20:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r2.mPostponedTransactions
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L35
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r2.mPostponedTransactions
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)
            androidx.fragment.app.FragmentManager$StartEnterTransitionListener r0 = (androidx.fragment.app.FragmentManager.StartEnterTransitionListener) r0
            r0.completeTransaction()
            goto L20
        L35:
            return
    }

    private boolean generateOpsForPendingActions(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r7) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r5.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r5.mPendingActions     // Catch: java.lang.Throwable -> Le
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Le
            r2 = 0
            if (r1 == 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r2
        Le:
            r6 = move-exception
            goto L3b
        L10:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r5.mPendingActions     // Catch: java.lang.Throwable -> Le
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le
            r3 = 0
        L17:
            if (r2 >= r1) goto L29
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r5.mPendingActions     // Catch: java.lang.Throwable -> Le
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> Le
            androidx.fragment.app.FragmentManager$OpGenerator r4 = (androidx.fragment.app.FragmentManager.OpGenerator) r4     // Catch: java.lang.Throwable -> Le
            boolean r4 = r4.generateOps(r6, r7)     // Catch: java.lang.Throwable -> Le
            r3 = r3 | r4
            int r2 = r2 + 1
            goto L17
        L29:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r6 = r5.mPendingActions     // Catch: java.lang.Throwable -> Le
            r6.clear()     // Catch: java.lang.Throwable -> Le
            androidx.fragment.app.FragmentHostCallback<?> r6 = r5.mHost     // Catch: java.lang.Throwable -> Le
            android.os.Handler r6 = r6.getHandler()     // Catch: java.lang.Throwable -> Le
            java.lang.Runnable r7 = r5.mExecCommit     // Catch: java.lang.Throwable -> Le
            r6.removeCallbacks(r7)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r3
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r6
    }

    @androidx.annotation.NonNull
    private androidx.fragment.app.FragmentManagerViewModel getChildNonConfig(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            androidx.fragment.app.FragmentManagerViewModel r2 = r0.getChildNonConfig(r2)
            return r2
    }

    private android.view.ViewGroup getFragmentContainer(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            android.view.ViewGroup r0 = r3.mContainer
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r3.mContainerId
            r1 = 0
            if (r0 > 0) goto Lb
            return r1
        Lb:
            androidx.fragment.app.FragmentContainer r0 = r2.mContainer
            boolean r0 = r0.onHasView()
            if (r0 == 0) goto L22
            androidx.fragment.app.FragmentContainer r0 = r2.mContainer
            int r3 = r3.mContainerId
            android.view.View r3 = r0.onFindViewById(r3)
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L22
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
        L22:
            return r1
    }

    @androidx.annotation.Nullable
    static androidx.fragment.app.Fragment getViewFragment(@androidx.annotation.NonNull android.view.View r1) {
            int r0 = androidx.fragment.R.id.fragment_container_view_tag
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto Ld
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    static boolean isLoggingEnabled(int r1) {
            boolean r0 = androidx.fragment.app.FragmentManager.DEBUG
            if (r0 != 0) goto Lf
            java.lang.String r0 = "FragmentManager"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    private boolean isMenuAvailable(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            boolean r0 = r2.mHasMenu
            if (r0 == 0) goto L8
            boolean r0 = r2.mMenuVisible
            if (r0 != 0) goto L10
        L8:
            androidx.fragment.app.FragmentManager r2 = r2.mChildFragmentManager
            boolean r2 = r2.checkForMenus()
            if (r2 == 0) goto L12
        L10:
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    private void makeRemovedFragmentsInvisible(@androidx.annotation.NonNull androidx.collection.ArraySet<androidx.fragment.app.Fragment> r6) {
            r5 = this;
            int r0 = r6.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L22
            java.lang.Object r2 = r6.valueAt(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            boolean r3 = r2.mAdded
            if (r3 != 0) goto L1f
            android.view.View r3 = r2.requireView()
            float r4 = r3.getAlpha()
            r2.mPostponedAlpha = r4
            r2 = 0
            r3.setAlpha(r2)
        L1f:
            int r1 = r1 + 1
            goto L5
        L22:
            return
    }

    private boolean popBackStackImmediate(@androidx.annotation.Nullable java.lang.String r9, int r10, int r11) {
            r8 = this;
            r0 = 0
            r8.execPendingActions(r0)
            r0 = 1
            r8.ensureExecReady(r0)
            androidx.fragment.app.Fragment r1 = r8.mPrimaryNav
            if (r1 == 0) goto L1b
            if (r10 >= 0) goto L1b
            if (r9 != 0) goto L1b
            androidx.fragment.app.FragmentManager r1 = r1.getChildFragmentManager()
            boolean r1 = r1.popBackStackImmediate()
            if (r1 == 0) goto L1b
            return r0
        L1b:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r8.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r4 = r8.mTmpIsPop
            r2 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            boolean r9 = r2.popBackStackState(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L3c
            r2.mExecutingActions = r0
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10 = r2.mTmpRecords     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList<java.lang.Boolean> r11 = r2.mTmpIsPop     // Catch: java.lang.Throwable -> L36
            r8.removeRedundantOperationsAndExecute(r10, r11)     // Catch: java.lang.Throwable -> L36
            r8.cleanupExec()
            goto L3c
        L36:
            r0 = move-exception
            r9 = r0
            r8.cleanupExec()
            throw r9
        L3c:
            r8.updateOnBackPressedCallbackEnabled()
            r8.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r10 = r2.mFragmentStore
            r10.burpActive()
            return r9
    }

    private int postponePostponableTransactions(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r8, int r9, int r10, @androidx.annotation.NonNull androidx.collection.ArraySet<androidx.fragment.app.Fragment> r11) {
            r6 = this;
            int r0 = r10 + (-1)
            r1 = r10
        L3:
            if (r0 < r9) goto L55
            java.lang.Object r2 = r7.get(r0)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            java.lang.Object r3 = r8.get(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r4 = r2.isPostponed()
            if (r4 == 0) goto L52
            int r4 = r0 + 1
            boolean r4 = r2.interactsWith(r7, r4, r10)
            if (r4 != 0) goto L52
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r4 = r6.mPostponedTransactions
            if (r4 != 0) goto L2e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.mPostponedTransactions = r4
        L2e:
            androidx.fragment.app.FragmentManager$StartEnterTransitionListener r4 = new androidx.fragment.app.FragmentManager$StartEnterTransitionListener
            r4.<init>(r2, r3)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r5 = r6.mPostponedTransactions
            r5.add(r4)
            r2.setOnStartPostponedListener(r4)
            if (r3 == 0) goto L41
            r2.executeOps()
            goto L45
        L41:
            r3 = 0
            r2.executePopOps(r3)
        L45:
            int r1 = r1 + (-1)
            if (r0 == r1) goto L4f
            r7.remove(r0)
            r7.add(r1, r2)
        L4f:
            r6.addAddedFragments(r11)
        L52:
            int r0 = r0 + (-1)
            goto L3
        L55:
            return r1
    }

    private void removeRedundantOperationsAndExecute(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r6) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L7
            goto L61
        L7:
            int r0 = r5.size()
            int r1 = r6.size()
            if (r0 != r1) goto L62
            r4.executePostponedTransaction(r5, r6)
            int r0 = r5.size()
            r1 = 0
            r2 = 0
        L1a:
            if (r1 >= r0) goto L5c
            java.lang.Object r3 = r5.get(r1)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            boolean r3 = r3.mReorderingAllowed
            if (r3 != 0) goto L59
            if (r2 == r1) goto L2b
            r4.executeOpsTogether(r5, r6, r2, r1)
        L2b:
            int r2 = r1 + 1
            java.lang.Object r3 = r6.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L54
        L39:
            if (r2 >= r0) goto L54
            java.lang.Object r3 = r6.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L54
            java.lang.Object r3 = r5.get(r2)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            boolean r3 = r3.mReorderingAllowed
            if (r3 != 0) goto L54
            int r2 = r2 + 1
            goto L39
        L54:
            r4.executeOpsTogether(r5, r6, r1, r2)
            int r1 = r2 + (-1)
        L59:
            int r1 = r1 + 1
            goto L1a
        L5c:
            if (r2 == r0) goto L61
            r4.executeOpsTogether(r5, r6, r2, r0)
        L61:
            return
        L62:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Internal error with the back stack records"
            r5.<init>(r6)
            throw r5
    }

    private void reportBackStackChanged() {
            r2 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r2.mBackStackChangeListeners
            if (r0 == 0) goto L1b
            r0 = 0
        L5:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r1 = r2.mBackStackChangeListeners
            int r1 = r1.size()
            if (r0 >= r1) goto L1b
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r1 = r2.mBackStackChangeListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.FragmentManager$OnBackStackChangedListener r1 = (androidx.fragment.app.FragmentManager.OnBackStackChangedListener) r1
            r1.onBackStackChanged()
            int r0 = r0 + 1
            goto L5
        L1b:
            return
    }

    static int reverseTransit(int r3) {
            r0 = 8194(0x2002, float:1.1482E-41)
            r1 = 4097(0x1001, float:5.741E-42)
            if (r3 == r1) goto L10
            r2 = 4099(0x1003, float:5.744E-42)
            if (r3 == r2) goto Lf
            if (r3 == r0) goto Le
            r3 = 0
            return r3
        Le:
            return r1
        Lf:
            return r2
        L10:
            return r0
    }

    private void setVisibleRemovingFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            android.view.ViewGroup r0 = r3.getFragmentContainer(r4)
            if (r0 == 0) goto L33
            int r1 = r4.getEnterAnim()
            int r2 = r4.getExitAnim()
            int r1 = r1 + r2
            int r2 = r4.getPopEnterAnim()
            int r1 = r1 + r2
            int r2 = r4.getPopExitAnim()
            int r1 = r1 + r2
            if (r1 <= 0) goto L33
            int r1 = androidx.fragment.R.id.visible_removing_fragment_view_tag
            java.lang.Object r2 = r0.getTag(r1)
            if (r2 != 0) goto L26
            r0.setTag(r1, r4)
        L26:
            java.lang.Object r0 = r0.getTag(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            boolean r4 = r4.getPopDirection()
            r0.setPopDirection(r4)
        L33:
            return
    }

    private void startPendingDeferredFragments() {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            r2.performPendingDeferredStart(r1)
            goto La
        L1a:
            return
    }

    private void throwException(java.lang.RuntimeException r6) {
            r5 = this;
            r6.getMessage()
            androidx.fragment.app.LogWriter r0 = new androidx.fragment.app.LogWriter
            java.lang.String r1 = "FragmentManager"
            r0.<init>(r1)
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            androidx.fragment.app.FragmentHostCallback<?> r0 = r5.mHost
            r2 = 0
            r3 = 0
            java.lang.String r4 = "  "
            if (r0 == 0) goto L1d
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Exception -> L22
            r0.onDump(r4, r3, r1, r2)     // Catch: java.lang.Exception -> L22
            goto L22
        L1d:
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch: java.lang.Exception -> L22
            r5.dump(r4, r3, r1, r0)     // Catch: java.lang.Exception -> L22
        L22:
            throw r6
    }

    private void updateOnBackPressedCallbackEnabled() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r3.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r3.mPendingActions     // Catch: java.lang.Throwable -> L13
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L13
            r2 = 1
            if (r1 != 0) goto L15
            androidx.activity.OnBackPressedCallback r1 = r3.mOnBackPressedCallback     // Catch: java.lang.Throwable -> L13
            r1.setEnabled(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            goto L2c
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            androidx.activity.OnBackPressedCallback r0 = r3.mOnBackPressedCallback
            int r1 = r3.getBackStackEntryCount()
            if (r1 <= 0) goto L27
            androidx.fragment.app.Fragment r1 = r3.mParent
            boolean r1 = r3.isPrimaryNavigation(r1)
            if (r1 == 0) goto L27
            goto L28
        L27:
            r2 = 0
        L28:
            r0.setEnabled(r2)
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    void addBackStackState(androidx.fragment.app.BackStackRecord r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mBackStack = r0
        Lb:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            r0.add(r2)
            return
    }

    void addCancellationSignal(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r4) {
            r2 = this;
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L12
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.put(r3, r1)
        L12:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            java.lang.Object r3 = r0.get(r3)
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.add(r4)
            return
    }

    androidx.fragment.app.FragmentStateManager addFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto La
            java.util.Objects.toString(r4)
        La:
            androidx.fragment.app.FragmentStateManager r0 = r3.createOrGetFragmentStateManager(r4)
            r4.mFragmentManager = r3
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            r1.makeActive(r0)
            boolean r1 = r4.mDetached
            if (r1 != 0) goto L30
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            r1.addFragment(r4)
            r1 = 0
            r4.mRemoving = r1
            android.view.View r2 = r4.mView
            if (r2 != 0) goto L27
            r4.mHiddenChanged = r1
        L27:
            boolean r4 = r3.isMenuAvailable(r4)
            if (r4 == 0) goto L30
            r4 = 1
            r3.mNeedMenuInvalidate = r4
        L30:
            return r0
    }

    public void addFragmentOnAttachListener(@androidx.annotation.NonNull androidx.fragment.app.FragmentOnAttachListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r1.mOnAttachListeners
            r0.add(r2)
            return
    }

    public void addOnBackStackChangedListener(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager.OnBackStackChangedListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mBackStackChangeListeners = r0
        Lb:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            r0.add(r2)
            return
    }

    void addRetainedFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            r0.addRetainedFragment(r2)
            return
    }

    int allocBackStackIndex() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.mBackStackIndex
            int r0 = r0.getAndIncrement()
            return r0
    }

    @android.annotation.SuppressLint({"SyntheticAccessor"})
    void attachController(@androidx.annotation.NonNull androidx.fragment.app.FragmentHostCallback<?> r3, @androidx.annotation.NonNull androidx.fragment.app.FragmentContainer r4, @androidx.annotation.Nullable androidx.fragment.app.Fragment r5) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L108
            r2.mHost = r3
            r2.mContainer = r4
            r2.mParent = r5
            if (r5 == 0) goto L15
            androidx.fragment.app.FragmentManager$8 r4 = new androidx.fragment.app.FragmentManager$8
            r4.<init>(r2, r5)
            r2.addFragmentOnAttachListener(r4)
            goto L1f
        L15:
            boolean r4 = r3 instanceof androidx.fragment.app.FragmentOnAttachListener
            if (r4 == 0) goto L1f
            r4 = r3
            androidx.fragment.app.FragmentOnAttachListener r4 = (androidx.fragment.app.FragmentOnAttachListener) r4
            r2.addFragmentOnAttachListener(r4)
        L1f:
            androidx.fragment.app.Fragment r4 = r2.mParent
            if (r4 == 0) goto L26
            r2.updateOnBackPressedCallbackEnabled()
        L26:
            boolean r4 = r3 instanceof androidx.activity.OnBackPressedDispatcherOwner
            if (r4 == 0) goto L3b
            r4 = r3
            androidx.activity.OnBackPressedDispatcherOwner r4 = (androidx.activity.OnBackPressedDispatcherOwner) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.mOnBackPressedDispatcher = r0
            if (r5 == 0) goto L36
            r4 = r5
        L36:
            androidx.activity.OnBackPressedCallback r1 = r2.mOnBackPressedCallback
            r0.addCallback(r4, r1)
        L3b:
            if (r5 == 0) goto L46
            androidx.fragment.app.FragmentManager r3 = r5.mFragmentManager
            androidx.fragment.app.FragmentManagerViewModel r3 = r3.getChildNonConfig(r5)
            r2.mNonConfig = r3
            goto L5f
        L46:
            boolean r4 = r3 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r4 == 0) goto L57
            androidx.lifecycle.ViewModelStoreOwner r3 = (androidx.lifecycle.ViewModelStoreOwner) r3
            androidx.lifecycle.ViewModelStore r3 = r3.getViewModelStore()
            androidx.fragment.app.FragmentManagerViewModel r3 = androidx.fragment.app.FragmentManagerViewModel.getInstance(r3)
            r2.mNonConfig = r3
            goto L5f
        L57:
            androidx.fragment.app.FragmentManagerViewModel r3 = new androidx.fragment.app.FragmentManagerViewModel
            r4 = 0
            r3.<init>(r4)
            r2.mNonConfig = r3
        L5f:
            androidx.fragment.app.FragmentManagerViewModel r3 = r2.mNonConfig
            boolean r4 = r2.isStateSaved()
            r3.setIsStateSaved(r4)
            androidx.fragment.app.FragmentStore r3 = r2.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r4 = r2.mNonConfig
            r3.setNonConfig(r4)
            androidx.fragment.app.FragmentHostCallback<?> r3 = r2.mHost
            boolean r4 = r3 instanceof androidx.activity.result.ActivityResultRegistryOwner
            if (r4 == 0) goto L107
            androidx.activity.result.ActivityResultRegistryOwner r3 = (androidx.activity.result.ActivityResultRegistryOwner) r3
            androidx.activity.result.ActivityResultRegistry r3 = r3.getActivityResultRegistry()
            if (r5 == 0) goto L91
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.mWho
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L93
        L91:
            java.lang.String r4 = ""
        L93:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "FragmentManager:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            androidx.fragment.app.FragmentManager$9 r1 = new androidx.fragment.app.FragmentManager$9
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r5 = r3.register(r5, r0, r1)
            r2.mStartActivityForResult = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.FragmentManager$FragmentIntentSenderContract r0 = new androidx.fragment.app.FragmentManager$FragmentIntentSenderContract
            r0.<init>()
            androidx.fragment.app.FragmentManager$10 r1 = new androidx.fragment.app.FragmentManager$10
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r5 = r3.register(r5, r0, r1)
            r2.mStartIntentSenderForResult = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions r5 = new androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions
            r5.<init>()
            androidx.fragment.app.FragmentManager$11 r0 = new androidx.fragment.app.FragmentManager$11
            r0.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r3 = r3.register(r4, r5, r0)
            r2.mRequestPermissions = r3
        L107:
            return
        L108:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
    }

    void attachFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r1 = isLoggingEnabled(r0)
            if (r1 == 0) goto La
            java.util.Objects.toString(r3)
        La:
            boolean r1 = r3.mDetached
            if (r1 == 0) goto L2c
            r1 = 0
            r3.mDetached = r1
            boolean r1 = r3.mAdded
            if (r1 != 0) goto L2c
            androidx.fragment.app.FragmentStore r1 = r2.mFragmentStore
            r1.addFragment(r3)
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L23
            r3.toString()
        L23:
            boolean r3 = r2.isMenuAvailable(r3)
            if (r3 == 0) goto L2c
            r3 = 1
            r2.mNeedMenuInvalidate = r3
        L2c:
            return
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction beginTransaction() {
            r1 = this;
            androidx.fragment.app.BackStackRecord r0 = new androidx.fragment.app.BackStackRecord
            r0.<init>(r1)
            return r0
    }

    boolean checkForMenus() {
            r4 = this;
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.util.List r0 = r0.getActiveFragments()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        Lc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L1e
            boolean r2 = r4.isMenuAvailable(r3)
        L1e:
            if (r2 == 0) goto Lc
            r0 = 1
            return r0
        L22:
            return r1
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResult(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r1.mResults
            r0.remove(r2)
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResultListener(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r1.mResultListeners
            java.lang.Object r2 = r0.remove(r2)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r2 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r2
            if (r2 == 0) goto Ld
            r2.removeObserver()
        Ld:
            return
    }

    void completeExecute(@androidx.annotation.NonNull androidx.fragment.app.BackStackRecord r10, boolean r11, boolean r12, boolean r13) {
            r9 = this;
            if (r11 == 0) goto L6
            r10.executePopOps(r13)
            goto L9
        L6:
            r10.executeOps()
        L9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r8 = 1
            r2.<init>(r8)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r8)
            r2.add(r10)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r3.add(r11)
            if (r12 == 0) goto L34
            int r11 = r9.mCurState
            if (r11 < r8) goto L34
            androidx.fragment.app.FragmentHostCallback<?> r11 = r9.mHost
            android.content.Context r0 = r11.getContext()
            androidx.fragment.app.FragmentContainer r1 = r9.mContainer
            r6 = 1
            androidx.fragment.app.FragmentTransition$Callback r7 = r9.mFragmentTransitionCallback
            r4 = 0
            r5 = 1
            androidx.fragment.app.FragmentTransition.startTransitions(r0, r1, r2, r3, r4, r5, r6, r7)
        L34:
            if (r13 == 0) goto L3b
            int r11 = r9.mCurState
            r9.moveToState(r11, r8)
        L3b:
            androidx.fragment.app.FragmentStore r11 = r9.mFragmentStore
            java.util.List r11 = r11.getActiveFragments()
            java.util.Iterator r11 = r11.iterator()
        L45:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L7c
            java.lang.Object r12 = r11.next()
            androidx.fragment.app.Fragment r12 = (androidx.fragment.app.Fragment) r12
            if (r12 == 0) goto L45
            android.view.View r0 = r12.mView
            if (r0 == 0) goto L45
            boolean r0 = r12.mIsNewlyAdded
            if (r0 == 0) goto L45
            int r0 = r12.mContainerId
            boolean r0 = r10.interactsWith(r0)
            if (r0 == 0) goto L45
            float r0 = r12.mPostponedAlpha
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L6f
            android.view.View r2 = r12.mView
            r2.setAlpha(r0)
        L6f:
            if (r13 == 0) goto L74
            r12.mPostponedAlpha = r1
            goto L45
        L74:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12.mPostponedAlpha = r0
            r0 = 0
            r12.mIsNewlyAdded = r0
            goto L45
        L7c:
            return
    }

    @androidx.annotation.NonNull
    androidx.fragment.app.FragmentStateManager createOrGetFragmentStateManager(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            java.lang.String r1 = r4.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            androidx.fragment.app.FragmentStateManager r0 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r3.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r2 = r3.mFragmentStore
            r0.<init>(r1, r2, r4)
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.mHost
            android.content.Context r4 = r4.getContext()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r0.restoreState(r4)
            int r4 = r3.mCurState
            r0.setFragmentManagerState(r4)
            return r0
    }

    void detachFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = 2
            boolean r1 = isLoggingEnabled(r0)
            if (r1 == 0) goto La
            java.util.Objects.toString(r4)
        La:
            boolean r1 = r4.mDetached
            if (r1 != 0) goto L2e
            r1 = 1
            r4.mDetached = r1
            boolean r2 = r4.mAdded
            if (r2 == 0) goto L2e
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L1e
            r4.toString()
        L1e:
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            r0.removeFragment(r4)
            boolean r0 = r3.isMenuAvailable(r4)
            if (r0 == 0) goto L2b
            r3.mNeedMenuInvalidate = r1
        L2b:
            r3.setVisibleRemovingFragment(r4)
        L2e:
            return
    }

    void dispatchActivityCreated() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 4
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchAttach() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchConfigurationChanged(@androidx.annotation.NonNull android.content.res.Configuration r3) {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto La
            r1.performConfigurationChanged(r3)
            goto La
        L1c:
            return
    }

    boolean dispatchContextItemSelected(@androidx.annotation.NonNull android.view.MenuItem r5) {
            r4 = this;
            int r0 = r4.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L11
            boolean r3 = r3.performContextItemSelected(r5)
            if (r3 == 0) goto L11
            return r2
        L26:
            return r1
    }

    void dispatchCreate() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 1
            r2.dispatchStateChange(r0)
            return
    }

    boolean dispatchCreateOptionsMenu(@androidx.annotation.NonNull android.view.Menu r8, @androidx.annotation.NonNull android.view.MenuInflater r9) {
            r7 = this;
            int r0 = r7.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r7.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
            r4 = 0
        L13:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L39
            java.lang.Object r5 = r0.next()
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            if (r5 == 0) goto L13
            boolean r6 = r7.isParentMenuVisible(r5)
            if (r6 == 0) goto L13
            boolean r6 = r5.performCreateOptionsMenu(r8, r9)
            if (r6 == 0) goto L13
            if (r3 != 0) goto L34
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L34:
            r3.add(r5)
            r4 = 1
            goto L13
        L39:
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.mCreatedMenus
            if (r8 == 0) goto L5b
        L3d:
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.mCreatedMenus
            int r8 = r8.size()
            if (r1 >= r8) goto L5b
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.mCreatedMenus
            java.lang.Object r8 = r8.get(r1)
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            if (r3 == 0) goto L55
            boolean r9 = r3.contains(r8)
            if (r9 != 0) goto L58
        L55:
            r8.onDestroyOptionsMenu()
        L58:
            int r1 = r1 + 1
            goto L3d
        L5b:
            r7.mCreatedMenus = r3
            return r4
    }

    void dispatchDestroy() {
            r2 = this;
            r0 = 1
            r2.mDestroyed = r0
            r2.execPendingActions(r0)
            r2.endAnimatingAwayFragments()
            r0 = -1
            r2.dispatchStateChange(r0)
            r0 = 0
            r2.mHost = r0
            r2.mContainer = r0
            r2.mParent = r0
            androidx.activity.OnBackPressedDispatcher r1 = r2.mOnBackPressedDispatcher
            if (r1 == 0) goto L1f
            androidx.activity.OnBackPressedCallback r1 = r2.mOnBackPressedCallback
            r1.remove()
            r2.mOnBackPressedDispatcher = r0
        L1f:
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r2.mStartActivityForResult
            if (r0 == 0) goto L30
            r0.unregister()
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r0 = r2.mStartIntentSenderForResult
            r0.unregister()
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r0 = r2.mRequestPermissions
            r0.unregister()
        L30:
            return
    }

    void dispatchDestroyView() {
            r1 = this;
            r0 = 1
            r1.dispatchStateChange(r0)
            return
    }

    void dispatchLowMemory() {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto La
            r1.performLowMemory()
            goto La
        L1c:
            return
    }

    void dispatchMultiWindowModeChanged(boolean r3) {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto La
            r1.performMultiWindowModeChanged(r3)
            goto La
        L1c:
            return
    }

    void dispatchOnAttachFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r2.mOnAttachListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentOnAttachListener r1 = (androidx.fragment.app.FragmentOnAttachListener) r1
            r1.onAttachFragment(r2, r3)
            goto L6
        L16:
            return
    }

    boolean dispatchOptionsItemSelected(@androidx.annotation.NonNull android.view.MenuItem r5) {
            r4 = this;
            int r0 = r4.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L11
            boolean r3 = r3.performOptionsItemSelected(r5)
            if (r3 == 0) goto L11
            return r2
        L26:
            return r1
    }

    void dispatchOptionsMenuClosed(@androidx.annotation.NonNull android.view.Menu r3) {
            r2 = this;
            int r0 = r2.mCurState
            r1 = 1
            if (r0 >= r1) goto L6
            goto L22
        L6:
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L10
            r1.performOptionsMenuClosed(r3)
            goto L10
        L22:
            return
    }

    void dispatchPause() {
            r1 = this;
            r0 = 5
            r1.dispatchStateChange(r0)
            return
    }

    void dispatchPictureInPictureModeChanged(boolean r3) {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto La
            r1.performPictureInPictureModeChanged(r3)
            goto La
        L1c:
            return
    }

    boolean dispatchPrepareOptionsMenu(@androidx.annotation.NonNull android.view.Menu r6) {
            r5 = this;
            int r0 = r5.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L11
            boolean r4 = r5.isParentMenuVisible(r3)
            if (r4 == 0) goto L11
            boolean r3 = r3.performPrepareOptionsMenu(r6)
            if (r3 == 0) goto L11
            r1 = 1
            goto L11
        L2d:
            return r1
    }

    void dispatchPrimaryNavigationFragmentChanged() {
            r1 = this;
            r1.updateOnBackPressedCallbackEnabled()
            androidx.fragment.app.Fragment r0 = r1.mPrimaryNav
            r1.dispatchParentPrimaryNavigationFragmentChanged(r0)
            return
    }

    void dispatchResume() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 7
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchStart() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 5
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchStop() {
            r2 = this;
            r0 = 1
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 4
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchViewCreated() {
            r1 = this;
            r0 = 2
            r1.dispatchStateChange(r0)
            return
    }

    public void dump(@androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable java.io.FileDescriptor r6, @androidx.annotation.NonNull java.io.PrintWriter r7, @androidx.annotation.Nullable java.lang.String[] r8) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "    "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            r1.dump(r5, r6, r7, r8)
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r4.mCreatedMenus
            r8 = 0
            if (r6 == 0) goto L4e
            int r6 = r6.size()
            if (r6 <= 0) goto L4e
            r7.print(r5)
            java.lang.String r1 = "Fragments Created Menus:"
            r7.println(r1)
            r1 = 0
        L2a:
            if (r1 >= r6) goto L4e
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r4.mCreatedMenus
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r7.print(r5)
            java.lang.String r3 = "  #"
            r7.print(r3)
            r7.print(r1)
            java.lang.String r3 = ": "
            r7.print(r3)
            java.lang.String r2 = r2.toString()
            r7.println(r2)
            int r1 = r1 + 1
            goto L2a
        L4e:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6 = r4.mBackStack
            if (r6 == 0) goto L88
            int r6 = r6.size()
            if (r6 <= 0) goto L88
            r7.print(r5)
            java.lang.String r1 = "Back Stack:"
            r7.println(r1)
            r1 = 0
        L61:
            if (r1 >= r6) goto L88
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r2 = r4.mBackStack
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            r7.print(r5)
            java.lang.String r3 = "  #"
            r7.print(r3)
            r7.print(r1)
            java.lang.String r3 = ": "
            r7.print(r3)
            java.lang.String r3 = r2.toString()
            r7.println(r3)
            r2.dump(r0, r7)
            int r1 = r1 + 1
            goto L61
        L88:
            r7.print(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Back Stack Index: "
            r6.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.mBackStackIndex
            int r0 = r0.get()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r7.println(r6)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r6 = r4.mPendingActions
            monitor-enter(r6)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r4.mPendingActions     // Catch: java.lang.Throwable -> Ld8
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld8
            if (r0 <= 0) goto Lda
            r7.print(r5)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r1 = "Pending Actions:"
            r7.println(r1)     // Catch: java.lang.Throwable -> Ld8
        Lb8:
            if (r8 >= r0) goto Lda
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r4.mPendingActions     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> Ld8
            androidx.fragment.app.FragmentManager$OpGenerator r1 = (androidx.fragment.app.FragmentManager.OpGenerator) r1     // Catch: java.lang.Throwable -> Ld8
            r7.print(r5)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = "  #"
            r7.print(r2)     // Catch: java.lang.Throwable -> Ld8
            r7.print(r8)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = ": "
            r7.print(r2)     // Catch: java.lang.Throwable -> Ld8
            r7.println(r1)     // Catch: java.lang.Throwable -> Ld8
            int r8 = r8 + 1
            goto Lb8
        Ld8:
            r5 = move-exception
            goto L14b
        Lda:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld8
            r7.print(r5)
            java.lang.String r6 = "FragmentManager misc state:"
            r7.println(r6)
            r7.print(r5)
            java.lang.String r6 = "  mHost="
            r7.print(r6)
            androidx.fragment.app.FragmentHostCallback<?> r6 = r4.mHost
            r7.println(r6)
            r7.print(r5)
            java.lang.String r6 = "  mContainer="
            r7.print(r6)
            androidx.fragment.app.FragmentContainer r6 = r4.mContainer
            r7.println(r6)
            androidx.fragment.app.Fragment r6 = r4.mParent
            if (r6 == 0) goto L10e
            r7.print(r5)
            java.lang.String r6 = "  mParent="
            r7.print(r6)
            androidx.fragment.app.Fragment r6 = r4.mParent
            r7.println(r6)
        L10e:
            r7.print(r5)
            java.lang.String r6 = "  mCurState="
            r7.print(r6)
            int r6 = r4.mCurState
            r7.print(r6)
            java.lang.String r6 = " mStateSaved="
            r7.print(r6)
            boolean r6 = r4.mStateSaved
            r7.print(r6)
            java.lang.String r6 = " mStopped="
            r7.print(r6)
            boolean r6 = r4.mStopped
            r7.print(r6)
            java.lang.String r6 = " mDestroyed="
            r7.print(r6)
            boolean r6 = r4.mDestroyed
            r7.println(r6)
            boolean r6 = r4.mNeedMenuInvalidate
            if (r6 == 0) goto L14a
            r7.print(r5)
            java.lang.String r5 = "  mNeedMenuInvalidate="
            r7.print(r5)
            boolean r5 = r4.mNeedMenuInvalidate
            r7.println(r5)
        L14a:
            return
        L14b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld8
            throw r5
    }

    void enqueueAction(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager.OpGenerator r3, boolean r4) {
            r2 = this;
            if (r4 != 0) goto L1d
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L1a
            boolean r3 = r2.mDestroyed
            if (r3 == 0) goto L12
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "FragmentManager has been destroyed"
            r3.<init>(r4)
            throw r3
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "FragmentManager has not been attached to a host."
            r3.<init>(r4)
            throw r3
        L1a:
            r2.checkStateLoss()
        L1d:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r2.mPendingActions
            monitor-enter(r0)
            androidx.fragment.app.FragmentHostCallback<?> r1 = r2.mHost     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L32
            if (r4 == 0) goto L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r3 = move-exception
            goto L3c
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "Activity has been destroyed"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L28
            throw r3     // Catch: java.lang.Throwable -> L28
        L32:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r2.mPendingActions     // Catch: java.lang.Throwable -> L28
            r4.add(r3)     // Catch: java.lang.Throwable -> L28
            r2.scheduleCommit()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r3
    }

    boolean execPendingActions(boolean r3) {
            r2 = this;
            r2.ensureExecReady(r3)
            r3 = 0
        L4:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r2.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r1 = r2.mTmpIsPop
            boolean r0 = r2.generateOpsForPendingActions(r0, r1)
            if (r0 == 0) goto L21
            r3 = 1
            r2.mExecutingActions = r3
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r2.mTmpRecords     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayList<java.lang.Boolean> r1 = r2.mTmpIsPop     // Catch: java.lang.Throwable -> L1c
            r2.removeRedundantOperationsAndExecute(r0, r1)     // Catch: java.lang.Throwable -> L1c
            r2.cleanupExec()
            goto L4
        L1c:
            r3 = move-exception
            r2.cleanupExec()
            throw r3
        L21:
            r2.updateOnBackPressedCallbackEnabled()
            r2.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            r0.burpActive()
            return r3
    }

    void execSingleAction(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager.OpGenerator r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 == 0) goto La
            boolean r0 = r1.mDestroyed
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            r1.ensureExecReady(r3)
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r1.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r0 = r1.mTmpIsPop
            boolean r2 = r2.generateOps(r3, r0)
            if (r2 == 0) goto L2b
            r2 = 1
            r1.mExecutingActions = r2
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r2 = r1.mTmpRecords     // Catch: java.lang.Throwable -> L26
            java.util.ArrayList<java.lang.Boolean> r3 = r1.mTmpIsPop     // Catch: java.lang.Throwable -> L26
            r1.removeRedundantOperationsAndExecute(r2, r3)     // Catch: java.lang.Throwable -> L26
            r1.cleanupExec()
            goto L2b
        L26:
            r2 = move-exception
            r1.cleanupExec()
            throw r2
        L2b:
            r1.updateOnBackPressedCallbackEnabled()
            r1.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r2 = r1.mFragmentStore
            r2.burpActive()
            return
    }

    public boolean executePendingTransactions() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.execPendingActions(r0)
            r1.forcePostponedTransactions()
            return r0
    }

    @androidx.annotation.Nullable
    androidx.fragment.app.Fragment findActiveFragment(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findActiveFragment(r2)
            return r2
    }

    @androidx.annotation.Nullable
    public androidx.fragment.app.Fragment findFragmentById(@androidx.annotation.IdRes int r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findFragmentById(r2)
            return r2
    }

    @androidx.annotation.Nullable
    public androidx.fragment.app.Fragment findFragmentByTag(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findFragmentByTag(r2)
            return r2
    }

    androidx.fragment.app.Fragment findFragmentByWho(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findFragmentByWho(r2)
            return r2
    }

    int getActiveFragmentCount() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            int r0 = r0.getActiveFragmentCount()
            return r0
    }

    @androidx.annotation.NonNull
    java.util.List<androidx.fragment.app.Fragment> getActiveFragments() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            java.util.List r0 = r0.getActiveFragments()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentManager.BackStackEntry getBackStackEntryAt(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.FragmentManager$BackStackEntry r2 = (androidx.fragment.app.FragmentManager.BackStackEntry) r2
            return r2
    }

    public int getBackStackEntryCount() {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            if (r0 == 0) goto L9
            int r0 = r0.size()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    androidx.fragment.app.FragmentContainer getContainer() {
            r1 = this;
            androidx.fragment.app.FragmentContainer r0 = r1.mContainer
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.fragment.app.Fragment getFragment(@androidx.annotation.NonNull android.os.Bundle r5, @androidx.annotation.NonNull java.lang.String r6) {
            r4 = this;
            java.lang.String r5 = r5.getString(r6)
            if (r5 != 0) goto L8
            r5 = 0
            return r5
        L8:
            androidx.fragment.app.Fragment r0 = r4.findActiveFragment(r5)
            if (r0 != 0) goto L2f
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment no longer exists for key "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = ": unique id "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            r4.throwException(r1)
        L2f:
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentFactory getFragmentFactory() {
            r1 = this;
            androidx.fragment.app.FragmentFactory r0 = r1.mFragmentFactory
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.fragment.app.Fragment r0 = r1.mParent
            if (r0 == 0) goto L10
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.FragmentFactory r0 = r0.getFragmentFactory()
            return r0
        L10:
            androidx.fragment.app.FragmentFactory r0 = r1.mHostFragmentFactory
            return r0
    }

    @androidx.annotation.NonNull
    androidx.fragment.app.FragmentStore getFragmentStore() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.fragment.app.Fragment> getFragments() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            java.util.List r0 = r0.getFragments()
            return r0
    }

    @androidx.annotation.NonNull
    androidx.fragment.app.FragmentHostCallback<?> getHost() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            return r0
    }

    @androidx.annotation.NonNull
    android.view.LayoutInflater.Factory2 getLayoutInflaterFactory() {
            r1 = this;
            androidx.fragment.app.FragmentLayoutInflaterFactory r0 = r1.mLayoutInflaterFactory
            return r0
    }

    @androidx.annotation.NonNull
    androidx.fragment.app.FragmentLifecycleCallbacksDispatcher getLifecycleCallbacksDispatcher() {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            return r0
    }

    @androidx.annotation.Nullable
    androidx.fragment.app.Fragment getParent() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mParent
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.fragment.app.Fragment getPrimaryNavigationFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mPrimaryNav
            return r0
    }

    @androidx.annotation.NonNull
    androidx.fragment.app.SpecialEffectsControllerFactory getSpecialEffectsControllerFactory() {
            r1 = this;
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r1.mSpecialEffectsControllerFactory
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.fragment.app.Fragment r0 = r1.mParent
            if (r0 == 0) goto L10
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r0.getSpecialEffectsControllerFactory()
            return r0
        L10:
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r1.mDefaultSpecialEffectsControllerFactory
            return r0
    }

    @androidx.annotation.NonNull
    androidx.lifecycle.ViewModelStore getViewModelStore(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            androidx.lifecycle.ViewModelStore r2 = r0.getViewModelStore(r2)
            return r2
    }

    void handleOnBackPressed() {
            r1 = this;
            r0 = 1
            r1.execPendingActions(r0)
            androidx.activity.OnBackPressedCallback r0 = r1.mOnBackPressedCallback
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L10
            r1.popBackStackImmediate()
            return
        L10:
            androidx.activity.OnBackPressedDispatcher r0 = r1.mOnBackPressedDispatcher
            r0.onBackPressed()
            return
    }

    void hideFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto La
            java.util.Objects.toString(r3)
        La:
            boolean r0 = r3.mHidden
            if (r0 != 0) goto L19
            r0 = 1
            r3.mHidden = r0
            boolean r1 = r3.mHiddenChanged
            r0 = r0 ^ r1
            r3.mHiddenChanged = r0
            r2.setVisibleRemovingFragment(r3)
        L19:
            return
    }

    void invalidateMenuForFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            boolean r0 = r2.mAdded
            if (r0 == 0) goto Ld
            boolean r2 = r1.isMenuAvailable(r2)
            if (r2 == 0) goto Ld
            r2 = 1
            r1.mNeedMenuInvalidate = r2
        Ld:
            return
    }

    public boolean isDestroyed() {
            r1 = this;
            boolean r0 = r1.mDestroyed
            return r0
    }

    boolean isParentMenuVisible(@androidx.annotation.Nullable androidx.fragment.app.Fragment r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 1
            return r1
        L4:
            boolean r1 = r1.isMenuVisible()
            return r1
    }

    boolean isPrimaryNavigation(@androidx.annotation.Nullable androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            androidx.fragment.app.FragmentManager r1 = r4.mFragmentManager
            androidx.fragment.app.Fragment r2 = r1.getPrimaryNavigationFragment()
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L19
            androidx.fragment.app.Fragment r4 = r1.mParent
            boolean r4 = r3.isPrimaryNavigation(r4)
            if (r4 == 0) goto L19
            return r0
        L19:
            r4 = 0
            return r4
    }

    boolean isStateAtLeast(int r2) {
            r1 = this;
            int r0 = r1.mCurState
            if (r0 < r2) goto L6
            r2 = 1
            return r2
        L6:
            r2 = 0
            return r2
    }

    public boolean isStateSaved() {
            r1 = this;
            boolean r0 = r1.mStateSaved
            if (r0 != 0) goto Lb
            boolean r0 = r1.mStopped
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    void launchRequestPermissions(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.NonNull java.lang.String[] r3, int r4) {
            r1 = this;
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r0 = r1.mRequestPermissions
            if (r0 == 0) goto L16
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r2 = r2.mWho
            r0.<init>(r2, r4)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r2 = r1.mLaunchedFragments
            r2.addLast(r0)
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r2 = r1.mRequestPermissions
            r2.launch(r3)
            return
        L16:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            r0.onRequestPermissionsFromFragment(r2, r3, r4)
            return
    }

    void launchStartActivityForResult(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @android.annotation.SuppressLint({"UnknownNullness"}) android.content.Intent r3, int r4, @androidx.annotation.Nullable android.os.Bundle r5) {
            r1 = this;
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r1.mStartActivityForResult
            if (r0 == 0) goto L1f
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r2 = r2.mWho
            r0.<init>(r2, r4)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r2 = r1.mLaunchedFragments
            r2.addLast(r0)
            if (r3 == 0) goto L19
            if (r5 == 0) goto L19
            java.lang.String r2 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r3.putExtra(r2, r5)
        L19:
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r2 = r1.mStartActivityForResult
            r2.launch(r3)
            return
        L1f:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            r0.onStartActivityFromFragment(r2, r3, r4, r5)
            return
    }

    void launchStartIntentSenderForResult(@androidx.annotation.NonNull androidx.fragment.app.Fragment r10, @android.annotation.SuppressLint({"UnknownNullness"}) android.content.IntentSender r11, int r12, @androidx.annotation.Nullable android.content.Intent r13, int r14, int r15, int r16, @androidx.annotation.Nullable android.os.Bundle r17) throws android.content.IntentSender.SendIntentException {
            r9 = this;
            r8 = r17
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r0 = r9.mStartIntentSenderForResult
            if (r0 == 0) goto L56
            r0 = 2
            if (r8 == 0) goto L2a
            if (r13 != 0) goto L16
            android.content.Intent r13 = new android.content.Intent
            r13.<init>()
            java.lang.String r1 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
            r2 = 1
            r13.putExtra(r1, r2)
        L16:
            boolean r1 = isLoggingEnabled(r0)
            if (r1 == 0) goto L25
            r8.toString()
            r13.toString()
            java.util.Objects.toString(r10)
        L25:
            java.lang.String r1 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r13.putExtra(r1, r8)
        L2a:
            androidx.activity.result.IntentSenderRequest$Builder r1 = new androidx.activity.result.IntentSenderRequest$Builder
            r1.<init>(r11)
            androidx.activity.result.IntentSenderRequest$Builder r11 = r1.setFillInIntent(r13)
            androidx.activity.result.IntentSenderRequest$Builder r11 = r11.setFlags(r15, r14)
            androidx.activity.result.IntentSenderRequest r11 = r11.build()
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r13 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r14 = r10.mWho
            r13.<init>(r14, r12)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r12 = r9.mLaunchedFragments
            r12.addLast(r13)
            boolean r12 = isLoggingEnabled(r0)
            if (r12 == 0) goto L50
            r10.toString()
        L50:
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r10 = r9.mStartIntentSenderForResult
            r10.launch(r11)
            return
        L56:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r9.mHost
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0.onStartIntentSenderFromFragment(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    void moveFragmentToExpectedState(@androidx.annotation.NonNull androidx.fragment.app.Fragment r5) {
            r4 = this;
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.lang.String r1 = r5.mWho
            boolean r0 = r0.containsActiveFragment(r1)
            if (r0 != 0) goto L18
            r0 = 3
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L64
            r5.toString()
            r4.toString()
            return
        L18:
            r4.moveToState(r5)
            android.view.View r0 = r5.mView
            if (r0 == 0) goto L5d
            boolean r1 = r5.mIsNewlyAdded
            if (r1 == 0) goto L5d
            android.view.ViewGroup r1 = r5.mContainer
            if (r1 == 0) goto L5d
            float r1 = r5.mPostponedAlpha
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L31
            r0.setAlpha(r1)
        L31:
            r5.mPostponedAlpha = r2
            r0 = 0
            r5.mIsNewlyAdded = r0
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            android.content.Context r0 = r0.getContext()
            r1 = 1
            boolean r2 = r5.getPopDirection()
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = androidx.fragment.app.FragmentAnim.loadAnimation(r0, r5, r1, r2)
            if (r0 == 0) goto L5d
            android.view.animation.Animation r1 = r0.animation
            if (r1 == 0) goto L51
            android.view.View r0 = r5.mView
            r0.startAnimation(r1)
            goto L5d
        L51:
            android.animation.Animator r1 = r0.animator
            android.view.View r2 = r5.mView
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.animator
            r0.start()
        L5d:
            boolean r0 = r5.mHiddenChanged
            if (r0 == 0) goto L64
            r4.completeShowHideFragment(r5)
        L64:
            return
    }

    void moveToState(int r3, boolean r4) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L10
            r0 = -1
            if (r3 != r0) goto L8
            goto L10
        L8:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "No activity"
            r3.<init>(r4)
            throw r3
        L10:
            if (r4 != 0) goto L17
            int r4 = r2.mCurState
            if (r3 != r4) goto L17
            goto L84
        L17:
            r2.mCurState = r3
            boolean r3 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r3 == 0) goto L23
            androidx.fragment.app.FragmentStore r3 = r2.mFragmentStore
            r3.moveToExpectedState()
            goto L6e
        L23:
            androidx.fragment.app.FragmentStore r3 = r2.mFragmentStore
            java.util.List r3 = r3.getFragments()
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2.moveFragmentToExpectedState(r4)
            goto L2d
        L3d:
            androidx.fragment.app.FragmentStore r3 = r2.mFragmentStore
            java.util.List r3 = r3.getActiveFragmentStateManagers()
            java.util.Iterator r3 = r3.iterator()
        L47:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.FragmentStateManager r4 = (androidx.fragment.app.FragmentStateManager) r4
            androidx.fragment.app.Fragment r0 = r4.getFragment()
            boolean r1 = r0.mIsNewlyAdded
            if (r1 != 0) goto L5e
            r2.moveFragmentToExpectedState(r0)
        L5e:
            boolean r1 = r0.mRemoving
            if (r1 == 0) goto L47
            boolean r0 = r0.isInBackStack()
            if (r0 != 0) goto L47
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            r0.makeInactive(r4)
            goto L47
        L6e:
            r2.startPendingDeferredFragments()
            boolean r3 = r2.mNeedMenuInvalidate
            if (r3 == 0) goto L84
            androidx.fragment.app.FragmentHostCallback<?> r3 = r2.mHost
            if (r3 == 0) goto L84
            int r4 = r2.mCurState
            r0 = 7
            if (r4 != r0) goto L84
            r3.onSupportInvalidateOptionsMenu()
            r3 = 0
            r2.mNeedMenuInvalidate = r3
        L84:
            return
    }

    void moveToState(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            int r0 = r1.mCurState
            r1.moveToState(r2, r0)
            return
    }

    void moveToState(@androidx.annotation.NonNull androidx.fragment.app.Fragment r10, int r11) {
            r9 = this;
            androidx.fragment.app.FragmentStore r0 = r9.mFragmentStore
            java.lang.String r1 = r10.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            r1 = 1
            if (r0 != 0) goto L17
            androidx.fragment.app.FragmentStateManager r0 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r9.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r3 = r9.mFragmentStore
            r0.<init>(r2, r3, r10)
            r0.setFragmentManagerState(r1)
        L17:
            boolean r2 = r10.mFromLayout
            r3 = 2
            if (r2 == 0) goto L28
            boolean r2 = r10.mInLayout
            if (r2 == 0) goto L28
            int r2 = r10.mState
            if (r2 != r3) goto L28
            int r11 = java.lang.Math.max(r11, r3)
        L28:
            int r2 = r0.computeExpectedState()
            int r11 = java.lang.Math.min(r11, r2)
            int r2 = r10.mState
            r4 = 3
            r5 = 5
            r6 = 4
            r7 = -1
            if (r2 > r11) goto L7a
            if (r2 >= r11) goto L45
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r2 = r9.mExitAnimationCancellationSignals
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L45
            r9.cancelExitAnimation(r10)
        L45:
            int r2 = r10.mState
            if (r2 == r7) goto L55
            if (r2 == 0) goto L5a
            if (r2 == r1) goto L5f
            if (r2 == r3) goto L69
            if (r2 == r6) goto L6e
            if (r2 == r5) goto L73
            goto L137
        L55:
            if (r11 <= r7) goto L5a
            r0.attach()
        L5a:
            if (r11 <= 0) goto L5f
            r0.create()
        L5f:
            if (r11 <= r7) goto L64
            r0.ensureInflatedView()
        L64:
            if (r11 <= r1) goto L69
            r0.createView()
        L69:
            if (r11 <= r3) goto L6e
            r0.activityCreated()
        L6e:
            if (r11 <= r6) goto L73
            r0.start()
        L73:
            if (r11 <= r5) goto L137
            r0.resume()
            goto L137
        L7a:
            if (r2 <= r11) goto L137
            if (r2 == 0) goto L130
            if (r2 == r1) goto L122
            if (r2 == r3) goto Lb3
            if (r2 == r6) goto L95
            if (r2 == r5) goto L90
            r8 = 7
            if (r2 == r8) goto L8b
            goto L137
        L8b:
            if (r11 >= r8) goto L90
            r0.pause()
        L90:
            if (r11 >= r5) goto L95
            r0.stop()
        L95:
            if (r11 >= r6) goto Lb3
            boolean r2 = isLoggingEnabled(r4)
            if (r2 == 0) goto La0
            r10.toString()
        La0:
            android.view.View r2 = r10.mView
            if (r2 == 0) goto Lb3
            androidx.fragment.app.FragmentHostCallback<?> r2 = r9.mHost
            boolean r2 = r2.onShouldSaveFragmentState(r10)
            if (r2 == 0) goto Lb3
            android.util.SparseArray<android.os.Parcelable> r2 = r10.mSavedViewState
            if (r2 != 0) goto Lb3
            r0.saveViewState()
        Lb3:
            if (r11 >= r3) goto L122
            android.view.View r2 = r10.mView
            if (r2 == 0) goto L117
            android.view.ViewGroup r5 = r10.mContainer
            if (r5 == 0) goto L117
            r5.endViewTransition(r2)
            android.view.View r2 = r10.mView
            r2.clearAnimation()
            boolean r2 = r10.isRemovingParent()
            if (r2 != 0) goto L117
            int r2 = r9.mCurState
            r5 = 0
            if (r2 <= r7) goto Lf2
            boolean r2 = r9.mDestroyed
            if (r2 != 0) goto Lf2
            android.view.View r2 = r10.mView
            int r2 = r2.getVisibility()
            if (r2 != 0) goto Lf2
            float r2 = r10.mPostponedAlpha
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto Lf2
            androidx.fragment.app.FragmentHostCallback<?> r2 = r9.mHost
            android.content.Context r2 = r2.getContext()
            r6 = 0
            boolean r7 = r10.getPopDirection()
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r2 = androidx.fragment.app.FragmentAnim.loadAnimation(r2, r10, r6, r7)
            goto Lf3
        Lf2:
            r2 = 0
        Lf3:
            r10.mPostponedAlpha = r5
            android.view.ViewGroup r5 = r10.mContainer
            android.view.View r6 = r10.mView
            if (r2 == 0) goto L100
            androidx.fragment.app.FragmentTransition$Callback r7 = r9.mFragmentTransitionCallback
            androidx.fragment.app.FragmentAnim.animateRemoveFragment(r10, r2, r7)
        L100:
            r5.removeView(r6)
            boolean r2 = isLoggingEnabled(r3)
            if (r2 == 0) goto L112
            java.util.Objects.toString(r6)
            r10.toString()
            r5.toString()
        L112:
            android.view.ViewGroup r2 = r10.mContainer
            if (r5 == r2) goto L117
            goto L146
        L117:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r2 = r9.mExitAnimationCancellationSignals
            java.lang.Object r2 = r2.get(r10)
            if (r2 != 0) goto L122
            r0.destroyFragmentView()
        L122:
            if (r11 >= r1) goto L130
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r2 = r9.mExitAnimationCancellationSignals
            java.lang.Object r2 = r2.get(r10)
            if (r2 == 0) goto L12d
            goto L131
        L12d:
            r0.destroy()
        L130:
            r1 = r11
        L131:
            if (r1 >= 0) goto L136
            r0.detach()
        L136:
            r11 = r1
        L137:
            int r0 = r10.mState
            if (r0 == r11) goto L146
            boolean r0 = isLoggingEnabled(r4)
            if (r0 == 0) goto L144
            r10.toString()
        L144:
            r10.mState = r11
        L146:
            return
    }

    void noteStateNotSaved() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L5
            goto L2b
        L5:
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L19
            r1.noteStateNotSaved()
            goto L19
        L2b:
            return
    }

    void onContainerAvailable(@androidx.annotation.NonNull androidx.fragment.app.FragmentContainerView r6) {
            r5 = this;
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            int r3 = r2.mContainerId
            int r4 = r6.getId()
            if (r3 != r4) goto La
            android.view.View r3 = r2.mView
            if (r3 == 0) goto La
            android.view.ViewParent r3 = r3.getParent()
            if (r3 != 0) goto La
            r2.mContainer = r6
            r1.addViewToContainer()
            goto La
        L32:
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction openTransaction() {
            r1 = this;
            androidx.fragment.app.FragmentTransaction r0 = r1.beginTransaction()
            return r0
    }

    void performPendingDeferredStart(@androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r3.getFragment()
            boolean r1 = r0.mDeferStart
            if (r1 == 0) goto L1e
            boolean r1 = r2.mExecutingActions
            if (r1 == 0) goto L10
            r3 = 1
            r2.mHavePendingDeferredStart = r3
            return
        L10:
            r1 = 0
            r0.mDeferStart = r1
            boolean r1 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r1 == 0) goto L1b
            r3.moveToExpectedState()
            return
        L1b:
            r2.moveToState(r0)
        L1e:
            return
    }

    public void popBackStack() {
            r4 = this;
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = 0
            r2 = -1
            r3 = 0
            r0.<init>(r4, r1, r2, r3)
            r4.enqueueAction(r0, r3)
            return
    }

    public void popBackStack(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto Ld
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = 0
            r0.<init>(r2, r1, r3, r4)
            r3 = 0
            r2.enqueueAction(r0, r3)
            return
        Ld:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Bad id: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public void popBackStack(@androidx.annotation.Nullable java.lang.String r3, int r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = -1
            r0.<init>(r2, r3, r1, r4)
            r3 = 0
            r2.enqueueAction(r0, r3)
            return
    }

    public boolean popBackStackImmediate() {
            r3 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            boolean r0 = r3.popBackStackImmediate(r2, r0, r1)
            return r0
    }

    public boolean popBackStackImmediate(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto L8
            r0 = 0
            boolean r3 = r2.popBackStackImmediate(r0, r3, r4)
            return r3
        L8:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Bad id: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public boolean popBackStackImmediate(@androidx.annotation.Nullable java.lang.String r2, int r3) {
            r1 = this;
            r0 = -1
            boolean r2 = r1.popBackStackImmediate(r2, r0, r3)
            return r2
    }

    boolean popBackStackState(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r7, @androidx.annotation.Nullable java.lang.String r8, int r9, int r10) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r5.mBackStack
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = 1
            if (r8 != 0) goto L27
            if (r9 >= 0) goto L27
            r3 = r10 & 1
            if (r3 != 0) goto L27
            int r8 = r0.size()
            int r8 = r8 - r2
            if (r8 >= 0) goto L17
            return r1
        L17:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9 = r5.mBackStack
            java.lang.Object r8 = r9.remove(r8)
            r6.add(r8)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7.add(r6)
            goto L9e
        L27:
            if (r8 != 0) goto L2e
            if (r9 < 0) goto L2c
            goto L2e
        L2c:
            r8 = -1
            goto L7a
        L2e:
            int r0 = r0.size()
            int r0 = r0 - r2
        L33:
            if (r0 < 0) goto L54
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r5.mBackStack
            java.lang.Object r3 = r3.get(r0)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            if (r8 == 0) goto L4a
            java.lang.String r4 = r3.getName()
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L4a
            goto L54
        L4a:
            if (r9 < 0) goto L51
            int r3 = r3.mIndex
            if (r9 != r3) goto L51
            goto L54
        L51:
            int r0 = r0 + (-1)
            goto L33
        L54:
            if (r0 >= 0) goto L57
            return r1
        L57:
            r10 = r10 & r2
            if (r10 == 0) goto L79
        L5a:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L79
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10 = r5.mBackStack
            java.lang.Object r10 = r10.get(r0)
            androidx.fragment.app.BackStackRecord r10 = (androidx.fragment.app.BackStackRecord) r10
            if (r8 == 0) goto L72
            java.lang.String r3 = r10.getName()
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L5a
        L72:
            if (r9 < 0) goto L79
            int r10 = r10.mIndex
            if (r9 != r10) goto L79
            goto L5a
        L79:
            r8 = r0
        L7a:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9 = r5.mBackStack
            int r9 = r9.size()
            int r9 = r9 - r2
            if (r8 != r9) goto L84
            return r1
        L84:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9 = r5.mBackStack
            int r9 = r9.size()
            int r9 = r9 - r2
        L8b:
            if (r9 <= r8) goto L9e
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10 = r5.mBackStack
            java.lang.Object r10 = r10.remove(r9)
            r6.add(r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r7.add(r10)
            int r9 = r9 + (-1)
            goto L8b
        L9e:
            return r2
    }

    public void putFragment(@androidx.annotation.NonNull android.os.Bundle r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.NonNull androidx.fragment.app.Fragment r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r6.mFragmentManager
            if (r0 == r3) goto L22
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = " is not currently in the FragmentManager"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r3.throwException(r0)
        L22:
            java.lang.String r6 = r6.mWho
            r4.putString(r5, r6)
            return
    }

    public void registerFragmentLifecycleCallbacks(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r2, boolean r3) {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            r0.registerFragmentLifecycleCallbacks(r2, r3)
            return
    }

    void removeCancellationSignal(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r3) {
            r1 = this;
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r1.mExitAnimationCancellationSignals
            java.lang.Object r0 = r0.get(r2)
            java.util.HashSet r0 = (java.util.HashSet) r0
            if (r0 == 0) goto L26
            boolean r3 = r0.remove(r3)
            if (r3 == 0) goto L26
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L26
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r3 = r1.mExitAnimationCancellationSignals
            r3.remove(r2)
            int r3 = r2.mState
            r0 = 5
            if (r3 >= r0) goto L26
            r1.destroyFragmentView(r2)
            r1.moveToState(r2)
        L26:
            return
    }

    void removeFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto Lc
            java.util.Objects.toString(r3)
            int r0 = r3.mBackStackNesting
        Lc:
            boolean r0 = r3.isInBackStack()
            boolean r1 = r3.mDetached
            if (r1 == 0) goto L18
            if (r0 != 0) goto L17
            goto L18
        L17:
            return
        L18:
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            r0.removeFragment(r3)
            boolean r0 = r2.isMenuAvailable(r3)
            r1 = 1
            if (r0 == 0) goto L26
            r2.mNeedMenuInvalidate = r1
        L26:
            r3.mRemoving = r1
            r2.setVisibleRemovingFragment(r3)
            return
    }

    public void removeFragmentOnAttachListener(@androidx.annotation.NonNull androidx.fragment.app.FragmentOnAttachListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r1.mOnAttachListeners
            r0.remove(r2)
            return
    }

    public void removeOnBackStackChangedListener(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager.OnBackStackChangedListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    void removeRetainedFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            r0.removeRetainedFragment(r2)
            return
    }

    void restoreAllState(@androidx.annotation.Nullable android.os.Parcelable r3, @androidx.annotation.Nullable androidx.fragment.app.FragmentManagerNonConfig r4) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            androidx.fragment.app.FragmentManagerViewModel r0 = r2.mNonConfig
            r0.restoreFromSnapshot(r4)
            r2.restoreSaveState(r3)
            return
    }

    void restoreSaveState(@androidx.annotation.Nullable android.os.Parcelable r10) {
            r9 = this;
            if (r10 != 0) goto L3
            goto L9
        L3:
            androidx.fragment.app.FragmentManagerState r10 = (androidx.fragment.app.FragmentManagerState) r10
            java.util.ArrayList<androidx.fragment.app.FragmentState> r0 = r10.mActive
            if (r0 != 0) goto La
        L9:
            return
        La:
            androidx.fragment.app.FragmentStore r0 = r9.mFragmentStore
            r0.resetActiveFragments()
            java.util.ArrayList<androidx.fragment.app.FragmentState> r0 = r10.mActive
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            r2 = 2
            if (r1 == 0) goto L80
            java.lang.Object r1 = r0.next()
            r8 = r1
            androidx.fragment.app.FragmentState r8 = (androidx.fragment.app.FragmentState) r8
            if (r8 == 0) goto L15
            androidx.fragment.app.FragmentManagerViewModel r1 = r9.mNonConfig
            java.lang.String r3 = r8.mWho
            androidx.fragment.app.Fragment r1 = r1.findRetainedFragmentByWho(r3)
            if (r1 == 0) goto L42
            boolean r3 = isLoggingEnabled(r2)
            if (r3 == 0) goto L38
            r1.toString()
        L38:
            androidx.fragment.app.FragmentStateManager r3 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r4 = r9.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r5 = r9.mFragmentStore
            r3.<init>(r4, r5, r1, r8)
            goto L59
        L42:
            androidx.fragment.app.FragmentStateManager r3 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r4 = r9.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r5 = r9.mFragmentStore
            androidx.fragment.app.FragmentHostCallback<?> r1 = r9.mHost
            android.content.Context r1 = r1.getContext()
            java.lang.ClassLoader r6 = r1.getClassLoader()
            androidx.fragment.app.FragmentFactory r7 = r9.getFragmentFactory()
            r3.<init>(r4, r5, r6, r7, r8)
        L59:
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            r1.mFragmentManager = r9
            boolean r2 = isLoggingEnabled(r2)
            if (r2 == 0) goto L68
            r1.toString()
        L68:
            androidx.fragment.app.FragmentHostCallback<?> r1 = r9.mHost
            android.content.Context r1 = r1.getContext()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r3.restoreState(r1)
            androidx.fragment.app.FragmentStore r1 = r9.mFragmentStore
            r1.makeActive(r3)
            int r1 = r9.mCurState
            r3.setFragmentManagerState(r1)
            goto L15
        L80:
            androidx.fragment.app.FragmentManagerViewModel r0 = r9.mNonConfig
            java.util.Collection r0 = r0.getRetainedFragments()
            java.util.Iterator r0 = r0.iterator()
        L8a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lcb
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.FragmentStore r3 = r9.mFragmentStore
            java.lang.String r4 = r1.mWho
            boolean r3 = r3.containsActiveFragment(r4)
            if (r3 != 0) goto L8a
            boolean r3 = isLoggingEnabled(r2)
            if (r3 == 0) goto Lae
            r1.toString()
            java.util.ArrayList<androidx.fragment.app.FragmentState> r3 = r10.mActive
            java.util.Objects.toString(r3)
        Lae:
            androidx.fragment.app.FragmentManagerViewModel r3 = r9.mNonConfig
            r3.removeRetainedFragment(r1)
            r1.mFragmentManager = r9
            androidx.fragment.app.FragmentStateManager r3 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r4 = r9.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r5 = r9.mFragmentStore
            r3.<init>(r4, r5, r1)
            r4 = 1
            r3.setFragmentManagerState(r4)
            r3.moveToExpectedState()
            r1.mRemoving = r4
            r3.moveToExpectedState()
            goto L8a
        Lcb:
            androidx.fragment.app.FragmentStore r0 = r9.mFragmentStore
            java.util.ArrayList<java.lang.String> r1 = r10.mAdded
            r0.restoreAddedFragments(r1)
            androidx.fragment.app.BackStackState[] r0 = r10.mBackStack
            r1 = 0
            if (r0 == 0) goto L114
            java.util.ArrayList r0 = new java.util.ArrayList
            androidx.fragment.app.BackStackState[] r3 = r10.mBackStack
            int r3 = r3.length
            r0.<init>(r3)
            r9.mBackStack = r0
            r0 = 0
        Le2:
            androidx.fragment.app.BackStackState[] r3 = r10.mBackStack
            int r4 = r3.length
            if (r0 >= r4) goto L117
            r3 = r3[r0]
            androidx.fragment.app.BackStackRecord r3 = r3.instantiate(r9)
            boolean r4 = isLoggingEnabled(r2)
            if (r4 == 0) goto L10c
            int r4 = r3.mIndex
            r3.toString()
            androidx.fragment.app.LogWriter r4 = new androidx.fragment.app.LogWriter
            java.lang.String r5 = "FragmentManager"
            r4.<init>(r5)
            java.io.PrintWriter r5 = new java.io.PrintWriter
            r5.<init>(r4)
            java.lang.String r4 = "  "
            r3.dump(r4, r5, r1)
            r5.close()
        L10c:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r4 = r9.mBackStack
            r4.add(r3)
            int r0 = r0 + 1
            goto Le2
        L114:
            r0 = 0
            r9.mBackStack = r0
        L117:
            java.util.concurrent.atomic.AtomicInteger r0 = r9.mBackStackIndex
            int r2 = r10.mBackStackIndex
            r0.set(r2)
            java.lang.String r0 = r10.mPrimaryNavActiveWho
            if (r0 == 0) goto L12b
            androidx.fragment.app.Fragment r0 = r9.findActiveFragment(r0)
            r9.mPrimaryNav = r0
            r9.dispatchParentPrimaryNavigationFragmentChanged(r0)
        L12b:
            java.util.ArrayList<java.lang.String> r0 = r10.mResultKeys
            if (r0 == 0) goto L156
        L12f:
            int r2 = r0.size()
            if (r1 >= r2) goto L156
            java.util.ArrayList<android.os.Bundle> r2 = r10.mResults
            java.lang.Object r2 = r2.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            androidx.fragment.app.FragmentHostCallback<?> r3 = r9.mHost
            android.content.Context r3 = r3.getContext()
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r2.setClassLoader(r3)
            java.util.Map<java.lang.String, android.os.Bundle> r3 = r9.mResults
            java.lang.Object r4 = r0.get(r1)
            r3.put(r4, r2)
            int r1 = r1 + 1
            goto L12f
        L156:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            java.util.ArrayList<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r10 = r10.mLaunchedFragments
            r0.<init>(r10)
            r9.mLaunchedFragments = r0
            return
    }

    @java.lang.Deprecated
    androidx.fragment.app.FragmentManagerNonConfig retainNonConfig() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            androidx.fragment.app.FragmentManagerViewModel r0 = r2.mNonConfig
            androidx.fragment.app.FragmentManagerNonConfig r0 = r0.getSnapshot()
            return r0
    }

    android.os.Parcelable saveAllState() {
            r8 = this;
            r8.forcePostponedTransactions()
            r8.endAnimatingAwayFragments()
            r0 = 1
            r8.execPendingActions(r0)
            r8.mStateSaved = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r8.mNonConfig
            r1.setIsStateSaved(r0)
            androidx.fragment.app.FragmentStore r0 = r8.mFragmentStore
            java.util.ArrayList r0 = r0.saveActiveFragments()
            boolean r1 = r0.isEmpty()
            r2 = 0
            r3 = 2
            if (r1 == 0) goto L23
            isLoggingEnabled(r3)
            return r2
        L23:
            androidx.fragment.app.FragmentStore r1 = r8.mFragmentStore
            java.util.ArrayList r1 = r1.saveAddedFragments()
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r4 = r8.mBackStack
            if (r4 == 0) goto L59
            int r4 = r4.size()
            if (r4 <= 0) goto L59
            androidx.fragment.app.BackStackState[] r2 = new androidx.fragment.app.BackStackState[r4]
            r5 = 0
        L36:
            if (r5 >= r4) goto L59
            androidx.fragment.app.BackStackState r6 = new androidx.fragment.app.BackStackState
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7 = r8.mBackStack
            java.lang.Object r7 = r7.get(r5)
            androidx.fragment.app.BackStackRecord r7 = (androidx.fragment.app.BackStackRecord) r7
            r6.<init>(r7)
            r2[r5] = r6
            boolean r6 = isLoggingEnabled(r3)
            if (r6 == 0) goto L56
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6 = r8.mBackStack
            java.lang.Object r6 = r6.get(r5)
            java.util.Objects.toString(r6)
        L56:
            int r5 = r5 + 1
            goto L36
        L59:
            androidx.fragment.app.FragmentManagerState r3 = new androidx.fragment.app.FragmentManagerState
            r3.<init>()
            r3.mActive = r0
            r3.mAdded = r1
            r3.mBackStack = r2
            java.util.concurrent.atomic.AtomicInteger r0 = r8.mBackStackIndex
            int r0 = r0.get()
            r3.mBackStackIndex = r0
            androidx.fragment.app.Fragment r0 = r8.mPrimaryNav
            if (r0 == 0) goto L74
            java.lang.String r0 = r0.mWho
            r3.mPrimaryNavActiveWho = r0
        L74:
            java.util.ArrayList<java.lang.String> r0 = r3.mResultKeys
            java.util.Map<java.lang.String, android.os.Bundle> r1 = r8.mResults
            java.util.Set r1 = r1.keySet()
            r0.addAll(r1)
            java.util.ArrayList<android.os.Bundle> r0 = r3.mResults
            java.util.Map<java.lang.String, android.os.Bundle> r1 = r8.mResults
            java.util.Collection r1 = r1.values()
            r0.addAll(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r1 = r8.mLaunchedFragments
            r0.<init>(r1)
            r3.mLaunchedFragments = r0
            return r3
    }

    @androidx.annotation.Nullable
    public androidx.fragment.app.Fragment.SavedState saveFragmentInstanceState(@androidx.annotation.NonNull androidx.fragment.app.Fragment r5) {
            r4 = this;
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.lang.String r1 = r5.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment r1 = r0.getFragment()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L32
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = " is not currently in the FragmentManager"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            r4.throwException(r1)
        L32:
            androidx.fragment.app.Fragment$SavedState r5 = r0.saveInstanceState()
            return r5
    }

    void scheduleCommit() {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r5.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r1 = r5.mPostponedTransactions     // Catch: java.lang.Throwable -> L11
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L13
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            r1 = 1
            goto L14
        L11:
            r1 = move-exception
            goto L3c
        L13:
            r1 = 0
        L14:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r5.mPendingActions     // Catch: java.lang.Throwable -> L11
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L1d
            r2 = 1
        L1d:
            if (r1 != 0) goto L21
            if (r2 == 0) goto L3a
        L21:
            androidx.fragment.app.FragmentHostCallback<?> r1 = r5.mHost     // Catch: java.lang.Throwable -> L11
            android.os.Handler r1 = r1.getHandler()     // Catch: java.lang.Throwable -> L11
            java.lang.Runnable r2 = r5.mExecCommit     // Catch: java.lang.Throwable -> L11
            r1.removeCallbacks(r2)     // Catch: java.lang.Throwable -> L11
            androidx.fragment.app.FragmentHostCallback<?> r1 = r5.mHost     // Catch: java.lang.Throwable -> L11
            android.os.Handler r1 = r1.getHandler()     // Catch: java.lang.Throwable -> L11
            java.lang.Runnable r2 = r5.mExecCommit     // Catch: java.lang.Throwable -> L11
            r1.post(r2)     // Catch: java.lang.Throwable -> L11
            r5.updateOnBackPressedCallbackEnabled()     // Catch: java.lang.Throwable -> L11
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    void setExitAnimationOrder(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2, boolean r3) {
            r1 = this;
            android.view.ViewGroup r2 = r1.getFragmentContainer(r2)
            if (r2 == 0) goto L11
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentContainerView
            if (r0 == 0) goto L11
            androidx.fragment.app.FragmentContainerView r2 = (androidx.fragment.app.FragmentContainerView) r2
            r3 = r3 ^ 1
            r2.setDrawDisappearingViewsLast(r3)
        L11:
            return
    }

    public void setFragmentFactory(@androidx.annotation.NonNull androidx.fragment.app.FragmentFactory r1) {
            r0 = this;
            r0.mFragmentFactory = r1
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResult(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull android.os.Bundle r4) {
            r2 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r2.mResultListeners
            java.lang.Object r0 = r0.get(r3)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r0 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r0
            if (r0 == 0) goto L16
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r0.isAtLeast(r1)
            if (r1 == 0) goto L16
            r0.onFragmentResult(r3, r4)
            return
        L16:
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r2.mResults
            r0.put(r3, r4)
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    public final void setFragmentResultListener(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r5, @androidx.annotation.NonNull androidx.fragment.app.FragmentResultListener r6) {
            r3 = this;
            androidx.lifecycle.Lifecycle r5 = r5.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r5.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto Ld
            goto L27
        Ld:
            androidx.fragment.app.FragmentManager$6 r0 = new androidx.fragment.app.FragmentManager$6
            r0.<init>(r3, r4, r6, r5)
            r5.addObserver(r0)
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r1 = r3.mResultListeners
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r2 = new androidx.fragment.app.FragmentManager$LifecycleAwareResultListener
            r2.<init>(r5, r6, r0)
            java.lang.Object r4 = r1.put(r4, r2)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r4 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r4
            if (r4 == 0) goto L27
            r4.removeObserver()
        L27:
            return
    }

    void setMaxLifecycle(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3, @androidx.annotation.NonNull androidx.lifecycle.Lifecycle.State r4) {
            r2 = this;
            java.lang.String r0 = r3.mWho
            androidx.fragment.app.Fragment r0 = r2.findActiveFragment(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 != r2) goto L17
        L14:
            r3.mMaxState = r4
            return
        L17:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " is not an active fragment of FragmentManager "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    void setPrimaryNavigationFragment(@androidx.annotation.Nullable androidx.fragment.app.Fragment r4) {
            r3 = this;
            if (r4 == 0) goto L36
            java.lang.String r0 = r4.mWho
            androidx.fragment.app.Fragment r0 = r3.findActiveFragment(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            if (r0 == 0) goto L36
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 != r3) goto L17
            goto L36
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not an active fragment of FragmentManager "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L36:
            androidx.fragment.app.Fragment r0 = r3.mPrimaryNav
            r3.mPrimaryNav = r4
            r3.dispatchParentPrimaryNavigationFragmentChanged(r0)
            androidx.fragment.app.Fragment r4 = r3.mPrimaryNav
            r3.dispatchParentPrimaryNavigationFragmentChanged(r4)
            return
    }

    void setSpecialEffectsControllerFactory(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsControllerFactory r1) {
            r0 = this;
            r0.mSpecialEffectsControllerFactory = r1
            return
    }

    void showFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto La
            java.util.Objects.toString(r2)
        La:
            boolean r0 = r2.mHidden
            if (r0 == 0) goto L17
            r0 = 0
            r2.mHidden = r0
            boolean r0 = r2.mHiddenChanged
            r0 = r0 ^ 1
            r2.mHiddenChanged = r0
        L17:
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.mParent
            java.lang.String r2 = "}"
            java.lang.String r3 = "{"
            if (r1 == 0) goto L45
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            androidx.fragment.app.Fragment r1 = r4.mParent
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r0.append(r2)
            goto L6d
        L45:
            androidx.fragment.app.FragmentHostCallback<?> r1 = r4.mHost
            if (r1 == 0) goto L68
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            androidx.fragment.app.FragmentHostCallback<?> r1 = r4.mHost
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r0.append(r2)
            goto L6d
        L68:
            java.lang.String r1 = "null"
            r0.append(r1)
        L6d:
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void unregisterFragmentLifecycleCallbacks(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r2) {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            r0.unregisterFragmentLifecycleCallbacks(r2)
            return
    }
}
