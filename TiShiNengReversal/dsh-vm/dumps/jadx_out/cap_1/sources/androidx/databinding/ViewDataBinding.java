package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ViewDataBinding extends androidx.databinding.BaseObservable implements androidx.viewbinding.ViewBinding {
    private static final int BINDING_NUMBER_START = 8;
    public static final java.lang.String BINDING_TAG_PREFIX = "binding_";
    private static final androidx.databinding.CreateWeakListener CREATE_LIST_LISTENER = null;
    private static final androidx.databinding.CreateWeakListener CREATE_LIVE_DATA_LISTENER = null;
    private static final androidx.databinding.CreateWeakListener CREATE_MAP_LISTENER = null;
    private static final androidx.databinding.CreateWeakListener CREATE_PROPERTY_LISTENER = null;
    private static final int HALTED = 2;
    private static final int REBIND = 1;
    private static final androidx.databinding.CallbackRegistry.NotifierCallback<androidx.databinding.OnRebindCallback, androidx.databinding.ViewDataBinding, java.lang.Void> REBIND_NOTIFIER = null;
    private static final int REBOUND = 3;
    private static final android.view.View.OnAttachStateChangeListener ROOT_REATTACHED_LISTENER = null;
    static int SDK_INT;
    private static final boolean USE_CHOREOGRAPHER = false;
    private static final java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> sReferenceQueue = null;
    protected final androidx.databinding.DataBindingComponent mBindingComponent;
    private android.view.Choreographer mChoreographer;
    private androidx.databinding.ViewDataBinding mContainingBinding;
    private final android.view.Choreographer.FrameCallback mFrameCallback;
    private boolean mInLiveDataRegisterObserver;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected boolean mInStateFlowRegisterObserver;
    private boolean mIsExecutingPendingBindings;
    private androidx.lifecycle.LifecycleOwner mLifecycleOwner;
    private androidx.databinding.WeakListener[] mLocalFieldObservers;
    private androidx.databinding.ViewDataBinding.OnStartListener mOnStartListener;
    private boolean mPendingRebind;
    private androidx.databinding.CallbackRegistry<androidx.databinding.OnRebindCallback, androidx.databinding.ViewDataBinding, java.lang.Void> mRebindCallbacks;
    private boolean mRebindHalted;
    private final java.lang.Runnable mRebindRunnable;
    private final android.view.View mRoot;
    private android.os.Handler mUIThreadHandler;









    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static class IncludedLayouts {
        public final int[][] indexes;
        public final int[][] layoutIds;
        public final java.lang.String[][] layouts;

        public IncludedLayouts(int r2) {
                r1 = this;
                r1.<init>()
                java.lang.String[][] r0 = new java.lang.String[r2][]
                r1.layouts = r0
                int[][] r0 = new int[r2][]
                r1.indexes = r0
                int[][] r2 = new int[r2][]
                r1.layoutIds = r2
                return
        }

        public void setIncludes(int r2, java.lang.String[] r3, int[] r4, int[] r5) {
                r1 = this;
                java.lang.String[][] r0 = r1.layouts
                r0[r2] = r3
                int[][] r3 = r1.indexes
                r3[r2] = r4
                int[][] r3 = r1.layoutIds
                r3[r2] = r5
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class LiveDataListener implements androidx.lifecycle.Observer, androidx.databinding.ObservableReference<androidx.lifecycle.LiveData<?>> {

        @androidx.annotation.Nullable
        java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> mLifecycleOwnerRef;
        final androidx.databinding.WeakListener<androidx.lifecycle.LiveData<?>> mListener;

        public LiveDataListener(androidx.databinding.ViewDataBinding r2, int r3, java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> r4) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mLifecycleOwnerRef = r0
                androidx.databinding.WeakListener r0 = new androidx.databinding.WeakListener
                r0.<init>(r2, r3, r1, r4)
                r1.mListener = r0
                return
        }

        @androidx.annotation.Nullable
        private androidx.lifecycle.LifecycleOwner getLifecycleOwner() {
                r1 = this;
                java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r0 = r1.mLifecycleOwnerRef
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.Object r0 = r0.get()
                androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
                return r0
        }

        /* renamed from: addListener, reason: avoid collision after fix types in other method */
        public void addListener2(androidx.lifecycle.LiveData<?> r2) {
                r1 = this;
                androidx.lifecycle.LifecycleOwner r0 = r1.getLifecycleOwner()
                if (r0 == 0) goto L9
                r2.observe(r0, r1)
            L9:
                return
        }

        @Override // androidx.databinding.ObservableReference
        public /* bridge */ /* synthetic */ void addListener(androidx.lifecycle.LiveData<?> r1) {
                r0 = this;
                androidx.lifecycle.LiveData r1 = (androidx.lifecycle.LiveData) r1
                r0.addListener2(r1)
                return
        }

        @Override // androidx.databinding.ObservableReference
        public androidx.databinding.WeakListener<androidx.lifecycle.LiveData<?>> getListener() {
                r1 = this;
                androidx.databinding.WeakListener<androidx.lifecycle.LiveData<?>> r0 = r1.mListener
                return r0
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@androidx.annotation.Nullable java.lang.Object r4) {
                r3 = this;
                androidx.databinding.WeakListener<androidx.lifecycle.LiveData<?>> r4 = r3.mListener
                androidx.databinding.ViewDataBinding r4 = r4.getBinder()
                if (r4 == 0) goto L14
                androidx.databinding.WeakListener<androidx.lifecycle.LiveData<?>> r0 = r3.mListener
                int r1 = r0.mLocalFieldId
                java.lang.Object r0 = r0.getTarget()
                r2 = 0
                r4.handleFieldChange(r1, r0, r2)
            L14:
                return
        }

        /* renamed from: removeListener, reason: avoid collision after fix types in other method */
        public void removeListener2(androidx.lifecycle.LiveData<?> r1) {
                r0 = this;
                r1.removeObserver(r0)
                return
        }

        @Override // androidx.databinding.ObservableReference
        public /* bridge */ /* synthetic */ void removeListener(androidx.lifecycle.LiveData<?> r1) {
                r0 = this;
                androidx.lifecycle.LiveData r1 = (androidx.lifecycle.LiveData) r1
                r0.removeListener2(r1)
                return
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(@androidx.annotation.Nullable androidx.lifecycle.LifecycleOwner r3) {
                r2 = this;
                androidx.lifecycle.LifecycleOwner r0 = r2.getLifecycleOwner()
                androidx.databinding.WeakListener<androidx.lifecycle.LiveData<?>> r1 = r2.mListener
                java.lang.Object r1 = r1.getTarget()
                androidx.lifecycle.LiveData r1 = (androidx.lifecycle.LiveData) r1
                if (r1 == 0) goto L18
                if (r0 == 0) goto L13
                r1.removeObserver(r2)
            L13:
                if (r3 == 0) goto L18
                r1.observe(r3, r2)
            L18:
                if (r3 == 0) goto L21
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r3)
                r2.mLifecycleOwnerRef = r0
            L21:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class OnStartListener implements androidx.lifecycle.LifecycleObserver {
        final java.lang.ref.WeakReference<androidx.databinding.ViewDataBinding> mBinding;

        private OnStartListener(androidx.databinding.ViewDataBinding r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mBinding = r0
                return
        }

        /* synthetic */ OnStartListener(androidx.databinding.ViewDataBinding r1, androidx.databinding.ViewDataBinding.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START)
        public void onStart() {
                r1 = this;
                java.lang.ref.WeakReference<androidx.databinding.ViewDataBinding> r0 = r1.mBinding
                java.lang.Object r0 = r0.get()
                androidx.databinding.ViewDataBinding r0 = (androidx.databinding.ViewDataBinding) r0
                if (r0 == 0) goto Ld
                r0.executePendingBindings()
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static abstract class PropertyChangedInverseListener extends androidx.databinding.Observable.OnPropertyChangedCallback implements androidx.databinding.InverseBindingListener {
        final int mPropertyId;

        public PropertyChangedInverseListener(int r1) {
                r0 = this;
                r0.<init>()
                r0.mPropertyId = r1
                return
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(androidx.databinding.Observable r1, int r2) {
                r0 = this;
                int r1 = r0.mPropertyId
                if (r2 == r1) goto L8
                if (r2 != 0) goto L7
                goto L8
            L7:
                return
            L8:
                r0.onChange()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class WeakListListener extends androidx.databinding.ObservableList.OnListChangedCallback implements androidx.databinding.ObservableReference<androidx.databinding.ObservableList> {
        final androidx.databinding.WeakListener<androidx.databinding.ObservableList> mListener;

        public WeakListListener(androidx.databinding.ViewDataBinding r2, int r3, java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> r4) {
                r1 = this;
                r1.<init>()
                androidx.databinding.WeakListener r0 = new androidx.databinding.WeakListener
                r0.<init>(r2, r3, r1, r4)
                r1.mListener = r0
                return
        }

        /* renamed from: addListener, reason: avoid collision after fix types in other method */
        public void addListener2(androidx.databinding.ObservableList r1) {
                r0 = this;
                r1.addOnListChangedCallback(r0)
                return
        }

        @Override // androidx.databinding.ObservableReference
        public /* bridge */ /* synthetic */ void addListener(androidx.databinding.ObservableList r1) {
                r0 = this;
                androidx.databinding.ObservableList r1 = (androidx.databinding.ObservableList) r1
                r0.addListener2(r1)
                return
        }

        @Override // androidx.databinding.ObservableReference
        public androidx.databinding.WeakListener<androidx.databinding.ObservableList> getListener() {
                r1 = this;
                androidx.databinding.WeakListener<androidx.databinding.ObservableList> r0 = r1.mListener
                return r0
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onChanged(androidx.databinding.ObservableList r4) {
                r3 = this;
                androidx.databinding.WeakListener<androidx.databinding.ObservableList> r0 = r3.mListener
                androidx.databinding.ViewDataBinding r0 = r0.getBinder()
                if (r0 != 0) goto L9
                goto L13
            L9:
                androidx.databinding.WeakListener<androidx.databinding.ObservableList> r1 = r3.mListener
                java.lang.Object r1 = r1.getTarget()
                androidx.databinding.ObservableList r1 = (androidx.databinding.ObservableList) r1
                if (r1 == r4) goto L14
            L13:
                return
            L14:
                androidx.databinding.WeakListener<androidx.databinding.ObservableList> r4 = r3.mListener
                int r4 = r4.mLocalFieldId
                r2 = 0
                r0.handleFieldChange(r4, r1, r2)
                return
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeChanged(androidx.databinding.ObservableList r1, int r2, int r3) {
                r0 = this;
                r0.onChanged(r1)
                return
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeInserted(androidx.databinding.ObservableList r1, int r2, int r3) {
                r0 = this;
                r0.onChanged(r1)
                return
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeMoved(androidx.databinding.ObservableList r1, int r2, int r3, int r4) {
                r0 = this;
                r0.onChanged(r1)
                return
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeRemoved(androidx.databinding.ObservableList r1, int r2, int r3) {
                r0 = this;
                r0.onChanged(r1)
                return
        }

        /* renamed from: removeListener, reason: avoid collision after fix types in other method */
        public void removeListener2(androidx.databinding.ObservableList r1) {
                r0 = this;
                r1.removeOnListChangedCallback(r0)
                return
        }

        @Override // androidx.databinding.ObservableReference
        public /* bridge */ /* synthetic */ void removeListener(androidx.databinding.ObservableList r1) {
                r0 = this;
                androidx.databinding.ObservableList r1 = (androidx.databinding.ObservableList) r1
                r0.removeListener2(r1)
                return
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class WeakMapListener extends androidx.databinding.ObservableMap.OnMapChangedCallback implements androidx.databinding.ObservableReference<androidx.databinding.ObservableMap> {
        final androidx.databinding.WeakListener<androidx.databinding.ObservableMap> mListener;

        public WeakMapListener(androidx.databinding.ViewDataBinding r2, int r3, java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> r4) {
                r1 = this;
                r1.<init>()
                androidx.databinding.WeakListener r0 = new androidx.databinding.WeakListener
                r0.<init>(r2, r3, r1, r4)
                r1.mListener = r0
                return
        }

        /* renamed from: addListener, reason: avoid collision after fix types in other method */
        public void addListener2(androidx.databinding.ObservableMap r1) {
                r0 = this;
                r1.addOnMapChangedCallback(r0)
                return
        }

        @Override // androidx.databinding.ObservableReference
        public /* bridge */ /* synthetic */ void addListener(androidx.databinding.ObservableMap r1) {
                r0 = this;
                androidx.databinding.ObservableMap r1 = (androidx.databinding.ObservableMap) r1
                r0.addListener2(r1)
                return
        }

        @Override // androidx.databinding.ObservableReference
        public androidx.databinding.WeakListener<androidx.databinding.ObservableMap> getListener() {
                r1 = this;
                androidx.databinding.WeakListener<androidx.databinding.ObservableMap> r0 = r1.mListener
                return r0
        }

        @Override // androidx.databinding.ObservableMap.OnMapChangedCallback
        public void onMapChanged(androidx.databinding.ObservableMap r3, java.lang.Object r4) {
                r2 = this;
                androidx.databinding.WeakListener<androidx.databinding.ObservableMap> r4 = r2.mListener
                androidx.databinding.ViewDataBinding r4 = r4.getBinder()
                if (r4 == 0) goto L19
                androidx.databinding.WeakListener<androidx.databinding.ObservableMap> r0 = r2.mListener
                java.lang.Object r0 = r0.getTarget()
                if (r3 == r0) goto L11
                goto L19
            L11:
                androidx.databinding.WeakListener<androidx.databinding.ObservableMap> r0 = r2.mListener
                int r0 = r0.mLocalFieldId
                r1 = 0
                r4.handleFieldChange(r0, r3, r1)
            L19:
                return
        }

        /* renamed from: removeListener, reason: avoid collision after fix types in other method */
        public void removeListener2(androidx.databinding.ObservableMap r1) {
                r0 = this;
                r1.removeOnMapChangedCallback(r0)
                return
        }

        @Override // androidx.databinding.ObservableReference
        public /* bridge */ /* synthetic */ void removeListener(androidx.databinding.ObservableMap r1) {
                r0 = this;
                androidx.databinding.ObservableMap r1 = (androidx.databinding.ObservableMap) r1
                r0.removeListener2(r1)
                return
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class WeakPropertyListener extends androidx.databinding.Observable.OnPropertyChangedCallback implements androidx.databinding.ObservableReference<androidx.databinding.Observable> {
        final androidx.databinding.WeakListener<androidx.databinding.Observable> mListener;

        public WeakPropertyListener(androidx.databinding.ViewDataBinding r2, int r3, java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> r4) {
                r1 = this;
                r1.<init>()
                androidx.databinding.WeakListener r0 = new androidx.databinding.WeakListener
                r0.<init>(r2, r3, r1, r4)
                r1.mListener = r0
                return
        }

        /* renamed from: addListener, reason: avoid collision after fix types in other method */
        public void addListener2(androidx.databinding.Observable r1) {
                r0 = this;
                r1.addOnPropertyChangedCallback(r0)
                return
        }

        @Override // androidx.databinding.ObservableReference
        public /* bridge */ /* synthetic */ void addListener(androidx.databinding.Observable r1) {
                r0 = this;
                androidx.databinding.Observable r1 = (androidx.databinding.Observable) r1
                r0.addListener2(r1)
                return
        }

        @Override // androidx.databinding.ObservableReference
        public androidx.databinding.WeakListener<androidx.databinding.Observable> getListener() {
                r1 = this;
                androidx.databinding.WeakListener<androidx.databinding.Observable> r0 = r1.mListener
                return r0
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(androidx.databinding.Observable r3, int r4) {
                r2 = this;
                androidx.databinding.WeakListener<androidx.databinding.Observable> r0 = r2.mListener
                androidx.databinding.ViewDataBinding r0 = r0.getBinder()
                if (r0 != 0) goto L9
                goto L13
            L9:
                androidx.databinding.WeakListener<androidx.databinding.Observable> r1 = r2.mListener
                java.lang.Object r1 = r1.getTarget()
                androidx.databinding.Observable r1 = (androidx.databinding.Observable) r1
                if (r1 == r3) goto L14
            L13:
                return
            L14:
                androidx.databinding.WeakListener<androidx.databinding.Observable> r1 = r2.mListener
                int r1 = r1.mLocalFieldId
                r0.handleFieldChange(r1, r3, r4)
                return
        }

        /* renamed from: removeListener, reason: avoid collision after fix types in other method */
        public void removeListener2(androidx.databinding.Observable r1) {
                r0 = this;
                r1.removeOnPropertyChangedCallback(r0)
                return
        }

        @Override // androidx.databinding.ObservableReference
        public /* bridge */ /* synthetic */ void removeListener(androidx.databinding.Observable r1) {
                r0 = this;
                androidx.databinding.Observable r1 = (androidx.databinding.Observable) r1
                r0.removeListener2(r1)
                return
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
                r0 = this;
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            androidx.databinding.ViewDataBinding.SDK_INT = r0
            r0 = 1
            androidx.databinding.ViewDataBinding.USE_CHOREOGRAPHER = r0
            androidx.databinding.ViewDataBinding$1 r0 = new androidx.databinding.ViewDataBinding$1
            r0.<init>()
            androidx.databinding.ViewDataBinding.CREATE_PROPERTY_LISTENER = r0
            androidx.databinding.ViewDataBinding$2 r0 = new androidx.databinding.ViewDataBinding$2
            r0.<init>()
            androidx.databinding.ViewDataBinding.CREATE_LIST_LISTENER = r0
            androidx.databinding.ViewDataBinding$3 r0 = new androidx.databinding.ViewDataBinding$3
            r0.<init>()
            androidx.databinding.ViewDataBinding.CREATE_MAP_LISTENER = r0
            androidx.databinding.ViewDataBinding$4 r0 = new androidx.databinding.ViewDataBinding$4
            r0.<init>()
            androidx.databinding.ViewDataBinding.CREATE_LIVE_DATA_LISTENER = r0
            androidx.databinding.ViewDataBinding$5 r0 = new androidx.databinding.ViewDataBinding$5
            r0.<init>()
            androidx.databinding.ViewDataBinding.REBIND_NOTIFIER = r0
            java.lang.ref.ReferenceQueue r0 = new java.lang.ref.ReferenceQueue
            r0.<init>()
            androidx.databinding.ViewDataBinding.sReferenceQueue = r0
            androidx.databinding.ViewDataBinding$6 r0 = new androidx.databinding.ViewDataBinding$6
            r0.<init>()
            androidx.databinding.ViewDataBinding.ROOT_REATTACHED_LISTENER = r0
            return
    }

    protected ViewDataBinding(androidx.databinding.DataBindingComponent r2, android.view.View r3, int r4) {
            r1 = this;
            r1.<init>()
            androidx.databinding.ViewDataBinding$7 r0 = new androidx.databinding.ViewDataBinding$7
            r0.<init>(r1)
            r1.mRebindRunnable = r0
            r0 = 0
            r1.mPendingRebind = r0
            r1.mRebindHalted = r0
            r1.mBindingComponent = r2
            androidx.databinding.WeakListener[] r2 = new androidx.databinding.WeakListener[r4]
            r1.mLocalFieldObservers = r2
            r1.mRoot = r3
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 == 0) goto L3e
            boolean r2 = androidx.databinding.ViewDataBinding.USE_CHOREOGRAPHER
            if (r2 == 0) goto L2f
            android.view.Choreographer r2 = android.view.Choreographer.getInstance()
            r1.mChoreographer = r2
            androidx.databinding.ViewDataBinding$8 r2 = new androidx.databinding.ViewDataBinding$8
            r2.<init>(r1)
            r1.mFrameCallback = r2
            return
        L2f:
            r2 = 0
            r1.mFrameCallback = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.myLooper()
            r2.<init>(r3)
            r1.mUIThreadHandler = r2
            return
        L3e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "DataBinding must be created in view's UI Thread"
            r2.<init>(r3)
            throw r2
    }

    protected ViewDataBinding(java.lang.Object r1, android.view.View r2, int r3) {
            r0 = this;
            androidx.databinding.DataBindingComponent r1 = checkAndCastToBindingComponent(r1)
            r0.<init>(r1, r2, r3)
            return
    }

    static /* synthetic */ boolean access$002(androidx.databinding.ViewDataBinding r0, boolean r1) {
            r0.mRebindHalted = r1
            return r1
    }

    static /* synthetic */ java.lang.Runnable access$100(androidx.databinding.ViewDataBinding r0) {
            java.lang.Runnable r0 = r0.mRebindRunnable
            return r0
    }

    static /* synthetic */ boolean access$202(androidx.databinding.ViewDataBinding r0, boolean r1) {
            r0.mPendingRebind = r1
            return r1
    }

    static /* synthetic */ void access$300() {
            processReferenceQueue()
            return
    }

    static /* synthetic */ android.view.View access$400(androidx.databinding.ViewDataBinding r0) {
            android.view.View r0 = r0.mRoot
            return r0
    }

    static /* synthetic */ android.view.View.OnAttachStateChangeListener access$500() {
            android.view.View$OnAttachStateChangeListener r0 = androidx.databinding.ViewDataBinding.ROOT_REATTACHED_LISTENER
            return r0
    }

    protected static androidx.databinding.ViewDataBinding bind(java.lang.Object r0, android.view.View r1, int r2) {
            androidx.databinding.DataBindingComponent r0 = checkAndCastToBindingComponent(r0)
            androidx.databinding.ViewDataBinding r0 = androidx.databinding.DataBindingUtil.bind(r0, r1, r2)
            return r0
    }

    private static androidx.databinding.DataBindingComponent checkAndCastToBindingComponent(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = r1 instanceof androidx.databinding.DataBindingComponent
            if (r0 == 0) goto Lb
            androidx.databinding.DataBindingComponent r1 = (androidx.databinding.DataBindingComponent) r1
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent"
            r1.<init>(r0)
            throw r1
    }

    private void executeBindingsInternal() {
            r4 = this;
            boolean r0 = r4.mIsExecutingPendingBindings
            if (r0 == 0) goto L8
            r4.requestRebind()
            return
        L8:
            boolean r0 = r4.hasPendingBindings()
            if (r0 != 0) goto Lf
            return
        Lf:
            r0 = 1
            r4.mIsExecutingPendingBindings = r0
            r1 = 0
            r4.mRebindHalted = r1
            androidx.databinding.CallbackRegistry<androidx.databinding.OnRebindCallback, androidx.databinding.ViewDataBinding, java.lang.Void> r2 = r4.mRebindCallbacks
            r3 = 0
            if (r2 == 0) goto L27
            r2.notifyCallbacks(r4, r0, r3)
            boolean r0 = r4.mRebindHalted
            if (r0 == 0) goto L27
            androidx.databinding.CallbackRegistry<androidx.databinding.OnRebindCallback, androidx.databinding.ViewDataBinding, java.lang.Void> r0 = r4.mRebindCallbacks
            r2 = 2
            r0.notifyCallbacks(r4, r2, r3)
        L27:
            boolean r0 = r4.mRebindHalted
            if (r0 != 0) goto L36
            r4.executeBindings()
            androidx.databinding.CallbackRegistry<androidx.databinding.OnRebindCallback, androidx.databinding.ViewDataBinding, java.lang.Void> r0 = r4.mRebindCallbacks
            if (r0 == 0) goto L36
            r2 = 3
            r0.notifyCallbacks(r4, r2, r3)
        L36:
            r4.mIsExecutingPendingBindings = r1
            return
    }

    protected static void executeBindingsOn(androidx.databinding.ViewDataBinding r0) {
            r0.executeBindingsInternal()
            return
    }

    private static int findIncludeIndex(java.lang.String r2, int r3, androidx.databinding.ViewDataBinding.IncludedLayouts r4, int r5) {
            r0 = 47
            int r0 = r2.indexOf(r0)
            int r0 = r0 + 1
            int r1 = r2.length()
            int r1 = r1 + (-2)
            java.lang.CharSequence r2 = r2.subSequence(r0, r1)
            java.lang.String[][] r4 = r4.layouts
            r4 = r4[r5]
            int r5 = r4.length
        L17:
            if (r3 >= r5) goto L25
            r0 = r4[r3]
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L22
            return r3
        L22:
            int r3 = r3 + 1
            goto L17
        L25:
            r2 = -1
            return r2
    }

    private static int findLastMatching(android.view.ViewGroup r8, int r9) {
            android.view.View r0 = r8.getChildAt(r9)
            java.lang.Object r0 = r0.getTag()
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r2 = 0
            java.lang.String r1 = r0.substring(r2, r1)
            int r2 = r1.length()
            int r3 = r8.getChildCount()
            int r4 = r9 + 1
        L1f:
            if (r4 >= r3) goto L60
            android.view.View r5 = r8.getChildAt(r4)
            java.lang.Object r6 = r5.getTag()
            boolean r6 = r6 instanceof java.lang.String
            if (r6 == 0) goto L34
            java.lang.Object r5 = r5.getTag()
            java.lang.String r5 = (java.lang.String) r5
            goto L35
        L34:
            r5 = 0
        L35:
            if (r5 == 0) goto L5d
            boolean r6 = r5.startsWith(r1)
            if (r6 == 0) goto L5d
            int r6 = r5.length()
            int r7 = r0.length()
            if (r6 != r7) goto L56
            int r6 = r5.length()
            int r6 = r6 + (-1)
            char r6 = r5.charAt(r6)
            r7 = 48
            if (r6 != r7) goto L56
            goto L60
        L56:
            boolean r5 = isNumeric(r5, r2)
            if (r5 == 0) goto L5d
            r9 = r4
        L5d:
            int r4 = r4 + 1
            goto L1f
        L60:
            return r9
    }

    static androidx.databinding.ViewDataBinding getBinding(android.view.View r1) {
            if (r1 == 0) goto Lb
            int r0 = androidx.databinding.library.R.id.dataBinding
            java.lang.Object r1 = r1.getTag(r0)
            androidx.databinding.ViewDataBinding r1 = (androidx.databinding.ViewDataBinding) r1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static int getBuildSdkInt() {
            int r0 = androidx.databinding.ViewDataBinding.SDK_INT
            return r0
    }

    protected static int getColorFromResource(android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lf
            android.content.Context r2 = r2.getContext()
            int r2 = androidx.databinding.b.a(r2, r3)
            return r2
        Lf:
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r3)
            return r2
    }

    protected static android.content.res.ColorStateList getColorStateListFromResource(android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lf
            android.content.Context r2 = r2.getContext()
            android.content.res.ColorStateList r2 = androidx.databinding.a.a(r2, r3)
            return r2
        Lf:
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.ColorStateList r2 = r2.getColorStateList(r3)
            return r2
    }

    protected static android.graphics.drawable.Drawable getDrawableFromResource(android.view.View r0, int r1) {
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            return r0
    }

    protected static <K, T> T getFrom(java.util.Map<K, T> r0, K r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    protected static byte getFromArray(byte[] r1, int r2) {
            if (r1 == 0) goto Lb
            if (r2 < 0) goto Lb
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto Lb
        L8:
            r1 = r1[r2]
            return r1
        Lb:
            r1 = 0
            return r1
    }

    protected static char getFromArray(char[] r1, int r2) {
            if (r1 == 0) goto Lb
            if (r2 < 0) goto Lb
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto Lb
        L8:
            char r1 = r1[r2]
            return r1
        Lb:
            r1 = 0
            return r1
    }

    protected static double getFromArray(double[] r2, int r3) {
            if (r2 == 0) goto Lb
            if (r3 < 0) goto Lb
            int r0 = r2.length
            if (r3 < r0) goto L8
            goto Lb
        L8:
            r0 = r2[r3]
            return r0
        Lb:
            r2 = 0
            return r2
    }

    protected static float getFromArray(float[] r1, int r2) {
            if (r1 == 0) goto Lb
            if (r2 < 0) goto Lb
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto Lb
        L8:
            r1 = r1[r2]
            return r1
        Lb:
            r1 = 0
            return r1
    }

    protected static int getFromArray(int[] r1, int r2) {
            if (r1 == 0) goto Lb
            if (r2 < 0) goto Lb
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto Lb
        L8:
            r1 = r1[r2]
            return r1
        Lb:
            r1 = 0
            return r1
    }

    protected static long getFromArray(long[] r2, int r3) {
            if (r2 == 0) goto Lb
            if (r3 < 0) goto Lb
            int r0 = r2.length
            if (r3 < r0) goto L8
            goto Lb
        L8:
            r0 = r2[r3]
            return r0
        Lb:
            r2 = 0
            return r2
    }

    protected static <T> T getFromArray(T[] r1, int r2) {
            if (r1 == 0) goto Lb
            if (r2 < 0) goto Lb
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto Lb
        L8:
            r1 = r1[r2]
            return r1
        Lb:
            r1 = 0
            return r1
    }

    protected static short getFromArray(short[] r1, int r2) {
            if (r1 == 0) goto Lb
            if (r2 < 0) goto Lb
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto Lb
        L8:
            short r1 = r1[r2]
            return r1
        Lb:
            r1 = 0
            return r1
    }

    protected static boolean getFromArray(boolean[] r1, int r2) {
            if (r1 == 0) goto Lb
            if (r2 < 0) goto Lb
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto Lb
        L8:
            boolean r1 = r1[r2]
            return r1
        Lb:
            r1 = 0
            return r1
    }

    protected static int getFromList(android.util.SparseIntArray r0, int r1) {
            if (r0 == 0) goto La
            if (r1 >= 0) goto L5
            goto La
        L5:
            int r0 = r0.get(r1)
            return r0
        La:
            r0 = 0
            return r0
    }

    @android.annotation.TargetApi(18)
    protected static long getFromList(android.util.SparseLongArray r0, int r1) {
            if (r0 == 0) goto La
            if (r1 >= 0) goto L5
            goto La
        L5:
            long r0 = r0.get(r1)
            return r0
        La:
            r0 = 0
            return r0
    }

    @android.annotation.TargetApi(16)
    protected static <T> T getFromList(android.util.LongSparseArray<T> r2, int r3) {
            if (r2 == 0) goto Lb
            if (r3 >= 0) goto L5
            goto Lb
        L5:
            long r0 = (long) r3
            java.lang.Object r2 = r2.get(r0)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    protected static <T> T getFromList(android.util.SparseArray<T> r0, int r1) {
            if (r0 == 0) goto La
            if (r1 >= 0) goto L5
            goto La
        L5:
            java.lang.Object r0 = r0.get(r1)
            return r0
        La:
            r0 = 0
            return r0
    }

    protected static <T> T getFromList(androidx.collection.LongSparseArray<T> r2, int r3) {
            if (r2 == 0) goto Lb
            if (r3 >= 0) goto L5
            goto Lb
        L5:
            long r0 = (long) r3
            java.lang.Object r2 = r2.get(r0)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    protected static <T> T getFromList(java.util.List<T> r1, int r2) {
            if (r1 == 0) goto L10
            if (r2 < 0) goto L10
            int r0 = r1.size()
            if (r2 < r0) goto Lb
            goto L10
        Lb:
            java.lang.Object r1 = r1.get(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    protected static boolean getFromList(android.util.SparseBooleanArray r0, int r1) {
            if (r0 == 0) goto La
            if (r1 >= 0) goto L5
            goto La
        L5:
            boolean r0 = r0.get(r1)
            return r0
        La:
            r0 = 0
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected static <T extends androidx.databinding.ViewDataBinding> T inflateInternal(@androidx.annotation.NonNull android.view.LayoutInflater r0, int r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            androidx.databinding.DataBindingComponent r4 = checkAndCastToBindingComponent(r4)
            androidx.databinding.ViewDataBinding r0 = androidx.databinding.DataBindingUtil.inflate(r0, r1, r2, r3, r4)
            return r0
    }

    private static boolean isNumeric(java.lang.String r3, int r4) {
            int r0 = r3.length()
            r1 = 0
            if (r0 != r4) goto L8
            return r1
        L8:
            if (r4 >= r0) goto L18
            char r2 = r3.charAt(r4)
            boolean r2 = java.lang.Character.isDigit(r2)
            if (r2 != 0) goto L15
            return r1
        L15:
            int r4 = r4 + 1
            goto L8
        L18:
            r3 = 1
            return r3
    }

    private static void mapBindings(androidx.databinding.DataBindingComponent r18, android.view.View r19, java.lang.Object[] r20, androidx.databinding.ViewDataBinding.IncludedLayouts r21, android.util.SparseIntArray r22, boolean r23) {
            r0 = r18
            r1 = r19
            r3 = r21
            r4 = r22
            androidx.databinding.ViewDataBinding r2 = getBinding(r1)
            if (r2 == 0) goto L10
            goto L127
        L10:
            java.lang.Object r2 = r1.getTag()
            boolean r5 = r2 instanceof java.lang.String
            if (r5 == 0) goto L1b
            java.lang.String r2 = (java.lang.String) r2
            goto L1c
        L1b:
            r2 = 0
        L1c:
            java.lang.String r6 = "layout"
            r5 = -1
            r8 = 1
            if (r23 == 0) goto L50
            if (r2 == 0) goto L50
            boolean r9 = r2.startsWith(r6)
            if (r9 == 0) goto L50
            r9 = 95
            int r9 = r2.lastIndexOf(r9)
            if (r9 <= 0) goto L48
            int r9 = r9 + r8
            boolean r10 = isNumeric(r2, r9)
            if (r10 == 0) goto L48
            int r2 = parseTagInt(r2, r9)
            r9 = r20[r2]
            if (r9 != 0) goto L43
            r20[r2] = r1
        L43:
            if (r3 != 0) goto L46
            r2 = -1
        L46:
            r9 = 1
            goto L4a
        L48:
            r2 = -1
            r9 = 0
        L4a:
            r17 = r9
            r9 = r2
            r2 = r17
            goto L6e
        L50:
            if (r2 == 0) goto L6c
            java.lang.String r9 = "binding_"
            boolean r9 = r2.startsWith(r9)
            if (r9 == 0) goto L6c
            int r9 = androidx.databinding.ViewDataBinding.BINDING_NUMBER_START
            int r2 = parseTagInt(r2, r9)
            r9 = r20[r2]
            if (r9 != 0) goto L66
            r20[r2] = r1
        L66:
            if (r3 != 0) goto L69
            r2 = -1
        L69:
            r9 = r2
            r2 = 1
            goto L6e
        L6c:
            r2 = 0
            r9 = -1
        L6e:
            if (r2 != 0) goto L84
            int r2 = r1.getId()
            if (r2 <= 0) goto L84
            if (r4 == 0) goto L84
            int r2 = r4.get(r2, r5)
            if (r2 < 0) goto L84
            r5 = r20[r2]
            if (r5 != 0) goto L84
            r20[r2] = r1
        L84:
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L127
            r10 = r1
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            int r11 = r10.getChildCount()
            r1 = 0
            r2 = 0
        L91:
            if (r1 >= r11) goto L127
            android.view.View r5 = r10.getChildAt(r1)
            if (r9 < 0) goto L10a
            java.lang.Object r12 = r5.getTag()
            boolean r12 = r12 instanceof java.lang.String
            if (r12 == 0) goto L10a
            java.lang.Object r12 = r5.getTag()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = "_0"
            boolean r13 = r12.endsWith(r13)
            if (r13 == 0) goto L10a
            boolean r13 = r12.startsWith(r6)
            if (r13 == 0) goto L10a
            r13 = 47
            int r13 = r12.indexOf(r13)
            if (r13 <= 0) goto L10a
            int r12 = findIncludeIndex(r12, r2, r3, r9)
            if (r12 < 0) goto L10a
            int r2 = r12 + 1
            int[][] r13 = r3.indexes
            r13 = r13[r9]
            r13 = r13[r12]
            int[][] r14 = r3.layoutIds
            r14 = r14[r9]
            r12 = r14[r12]
            int r14 = findLastMatching(r10, r1)
            if (r14 != r1) goto Le3
            androidx.databinding.ViewDataBinding r12 = androidx.databinding.DataBindingUtil.bind(r0, r5, r12)
            r20[r13] = r12
            r7 = r1
            r8 = r2
            r1 = 1
            r16 = 1
            goto L112
        Le3:
            int r14 = r14 - r1
            int r15 = r14 + 1
            android.view.View[] r7 = new android.view.View[r15]
            r8 = 0
            r16 = 1
        Leb:
            if (r8 >= r15) goto Lfc
            r19 = r1
            int r1 = r19 + r8
            android.view.View r1 = r10.getChildAt(r1)
            r7[r8] = r1
            int r8 = r8 + 1
            r1 = r19
            goto Leb
        Lfc:
            r19 = r1
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.DataBindingUtil.bind(r0, r7, r12)
            r20[r13] = r1
            int r1 = r19 + r14
            r7 = r1
            r8 = r2
            r1 = 1
            goto L112
        L10a:
            r19 = r1
            r16 = 1
            r7 = r19
            r8 = r2
            r1 = 0
        L112:
            if (r1 != 0) goto L11b
            r1 = r5
            r5 = 0
            r2 = r20
            mapBindings(r0, r1, r2, r3, r4, r5)
        L11b:
            int r1 = r7 + 1
            r0 = r18
            r3 = r21
            r4 = r22
            r2 = r8
            r8 = 1
            goto L91
        L127:
            return
    }

    protected static java.lang.Object[] mapBindings(androidx.databinding.DataBindingComponent r6, android.view.View r7, int r8, androidx.databinding.ViewDataBinding.IncludedLayouts r9, android.util.SparseIntArray r10) {
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r5 = 1
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            mapBindings(r0, r1, r2, r3, r4, r5)
            return r2
    }

    protected static java.lang.Object[] mapBindings(androidx.databinding.DataBindingComponent r6, android.view.View[] r7, int r8, androidx.databinding.ViewDataBinding.IncludedLayouts r9, android.util.SparseIntArray r10) {
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r8 = 0
        L3:
            int r0 = r7.length
            if (r8 >= r0) goto L12
            r1 = r7[r8]
            r5 = 1
            r0 = r6
            r3 = r9
            r4 = r10
            mapBindings(r0, r1, r2, r3, r4, r5)
            int r8 = r8 + 1
            goto L3
        L12:
            return r2
    }

    protected static byte parse(java.lang.String r0, byte r1) {
            byte r0 = java.lang.Byte.parseByte(r0)     // Catch: java.lang.NumberFormatException -> L5
            return r0
        L5:
            return r1
    }

    protected static char parse(java.lang.String r1, char r2) {
            if (r1 == 0) goto Lf
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto Lf
        L9:
            r2 = 0
            char r1 = r1.charAt(r2)
            return r1
        Lf:
            return r2
    }

    protected static double parse(java.lang.String r0, double r1) {
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> L5
            return r0
        L5:
            return r1
    }

    protected static float parse(java.lang.String r0, float r1) {
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L5
            return r0
        L5:
            return r1
    }

    protected static int parse(java.lang.String r0, int r1) {
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L5
            return r0
        L5:
            return r1
    }

    protected static long parse(java.lang.String r0, long r1) {
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L5
            return r0
        L5:
            return r1
    }

    protected static short parse(java.lang.String r0, short r1) {
            short r0 = java.lang.Short.parseShort(r0)     // Catch: java.lang.NumberFormatException -> L5
            return r0
        L5:
            return r1
    }

    protected static boolean parse(java.lang.String r0, boolean r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            return r0
    }

    private static int parseTagInt(java.lang.String r3, int r4) {
            int r0 = r3.length()
            r1 = 0
        L5:
            if (r4 >= r0) goto L13
            int r1 = r1 * 10
            char r2 = r3.charAt(r4)
            int r2 = r2 + (-48)
            int r1 = r1 + r2
            int r4 = r4 + 1
            goto L5
        L13:
            return r1
    }

    private static void processReferenceQueue() {
        L0:
            java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> r0 = androidx.databinding.ViewDataBinding.sReferenceQueue
            java.lang.ref.Reference r0 = r0.poll()
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof androidx.databinding.WeakListener
            if (r1 == 0) goto L0
            androidx.databinding.WeakListener r0 = (androidx.databinding.WeakListener) r0
            r0.unregister()
            goto L0
        L12:
            return
    }

    protected static byte safeUnbox(java.lang.Byte r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            byte r0 = r0.byteValue()
            return r0
    }

    protected static char safeUnbox(java.lang.Character r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            char r0 = r0.charValue()
            return r0
    }

    protected static double safeUnbox(java.lang.Double r2) {
            if (r2 != 0) goto L5
            r0 = 0
            return r0
        L5:
            double r0 = r2.doubleValue()
            return r0
    }

    protected static float safeUnbox(java.lang.Float r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            float r0 = r0.floatValue()
            return r0
    }

    protected static int safeUnbox(java.lang.Integer r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0.intValue()
            return r0
    }

    protected static long safeUnbox(java.lang.Long r2) {
            if (r2 != 0) goto L5
            r0 = 0
            return r0
        L5:
            long r0 = r2.longValue()
            return r0
    }

    protected static short safeUnbox(java.lang.Short r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            short r0 = r0.shortValue()
            return r0
    }

    protected static boolean safeUnbox(java.lang.Boolean r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            boolean r0 = r0.booleanValue()
            return r0
    }

    protected static void setBindingInverseListener(androidx.databinding.ViewDataBinding r0, androidx.databinding.InverseBindingListener r1, androidx.databinding.ViewDataBinding.PropertyChangedInverseListener r2) {
            if (r1 == r2) goto Le
            if (r1 == 0) goto L9
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r1 = (androidx.databinding.ViewDataBinding.PropertyChangedInverseListener) r1
            r0.removeOnPropertyChangedCallback(r1)
        L9:
            if (r2 == 0) goto Le
            r0.addOnPropertyChangedCallback(r2)
        Le:
            return
    }

    @android.annotation.TargetApi(16)
    protected static <T> void setTo(android.util.LongSparseArray<T> r2, int r3, T r4) {
            if (r2 == 0) goto Lf
            if (r3 < 0) goto Lf
            int r0 = r2.size()
            if (r3 < r0) goto Lb
            goto Lf
        Lb:
            long r0 = (long) r3
            r2.put(r0, r4)
        Lf:
            return
    }

    protected static <T> void setTo(android.util.SparseArray<T> r1, int r2, T r3) {
            if (r1 == 0) goto Le
            if (r2 < 0) goto Le
            int r0 = r1.size()
            if (r2 < r0) goto Lb
            goto Le
        Lb:
            r1.put(r2, r3)
        Le:
            return
    }

    protected static void setTo(android.util.SparseBooleanArray r1, int r2, boolean r3) {
            if (r1 == 0) goto Le
            if (r2 < 0) goto Le
            int r0 = r1.size()
            if (r2 < r0) goto Lb
            goto Le
        Lb:
            r1.put(r2, r3)
        Le:
            return
    }

    protected static void setTo(android.util.SparseIntArray r1, int r2, int r3) {
            if (r1 == 0) goto Le
            if (r2 < 0) goto Le
            int r0 = r1.size()
            if (r2 < r0) goto Lb
            goto Le
        Lb:
            r1.put(r2, r3)
        Le:
            return
    }

    @android.annotation.TargetApi(18)
    protected static void setTo(android.util.SparseLongArray r1, int r2, long r3) {
            if (r1 == 0) goto Le
            if (r2 < 0) goto Le
            int r0 = r1.size()
            if (r2 < r0) goto Lb
            goto Le
        Lb:
            r1.put(r2, r3)
        Le:
            return
    }

    protected static <T> void setTo(androidx.collection.LongSparseArray<T> r2, int r3, T r4) {
            if (r2 == 0) goto Lf
            if (r3 < 0) goto Lf
            int r0 = r2.size()
            if (r3 < r0) goto Lb
            goto Lf
        Lb:
            long r0 = (long) r3
            r2.put(r0, r4)
        Lf:
            return
    }

    protected static <T> void setTo(java.util.List<T> r1, int r2, T r3) {
            if (r1 == 0) goto Le
            if (r2 < 0) goto Le
            int r0 = r1.size()
            if (r2 < r0) goto Lb
            goto Le
        Lb:
            r1.set(r2, r3)
        Le:
            return
    }

    protected static <K, T> void setTo(java.util.Map<K, T> r0, K r1, T r2) {
            if (r0 != 0) goto L3
            return
        L3:
            r0.put(r1, r2)
            return
    }

    protected static void setTo(byte[] r1, int r2, byte r3) {
            if (r1 == 0) goto La
            if (r2 < 0) goto La
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto La
        L8:
            r1[r2] = r3
        La:
            return
    }

    protected static void setTo(char[] r1, int r2, char r3) {
            if (r1 == 0) goto La
            if (r2 < 0) goto La
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto La
        L8:
            r1[r2] = r3
        La:
            return
    }

    protected static void setTo(double[] r1, int r2, double r3) {
            if (r1 == 0) goto La
            if (r2 < 0) goto La
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto La
        L8:
            r1[r2] = r3
        La:
            return
    }

    protected static void setTo(float[] r1, int r2, float r3) {
            if (r1 == 0) goto La
            if (r2 < 0) goto La
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto La
        L8:
            r1[r2] = r3
        La:
            return
    }

    protected static void setTo(int[] r1, int r2, int r3) {
            if (r1 == 0) goto La
            if (r2 < 0) goto La
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto La
        L8:
            r1[r2] = r3
        La:
            return
    }

    protected static void setTo(long[] r1, int r2, long r3) {
            if (r1 == 0) goto La
            if (r2 < 0) goto La
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto La
        L8:
            r1[r2] = r3
        La:
            return
    }

    protected static <T> void setTo(T[] r1, int r2, T r3) {
            if (r1 == 0) goto La
            if (r2 < 0) goto La
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto La
        L8:
            r1[r2] = r3
        La:
            return
    }

    protected static void setTo(short[] r1, int r2, short r3) {
            if (r1 == 0) goto La
            if (r2 < 0) goto La
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto La
        L8:
            r1[r2] = r3
        La:
            return
    }

    protected static void setTo(boolean[] r1, int r2, boolean r3) {
            if (r1 == 0) goto La
            if (r2 < 0) goto La
            int r0 = r1.length
            if (r2 < r0) goto L8
            goto La
        L8:
            r1[r2] = r3
        La:
            return
    }

    public void addOnRebindCallback(@androidx.annotation.NonNull androidx.databinding.OnRebindCallback r3) {
            r2 = this;
            androidx.databinding.CallbackRegistry<androidx.databinding.OnRebindCallback, androidx.databinding.ViewDataBinding, java.lang.Void> r0 = r2.mRebindCallbacks
            if (r0 != 0) goto Ld
            androidx.databinding.CallbackRegistry r0 = new androidx.databinding.CallbackRegistry
            androidx.databinding.CallbackRegistry$NotifierCallback<androidx.databinding.OnRebindCallback, androidx.databinding.ViewDataBinding, java.lang.Void> r1 = androidx.databinding.ViewDataBinding.REBIND_NOTIFIER
            r0.<init>(r1)
            r2.mRebindCallbacks = r0
        Ld:
            androidx.databinding.CallbackRegistry<androidx.databinding.OnRebindCallback, androidx.databinding.ViewDataBinding, java.lang.Void> r0 = r2.mRebindCallbacks
            r0.add(r3)
            return
    }

    protected void ensureBindingComponentIsNotNull(java.lang.Class<?> r3) {
            r2 = this;
            androidx.databinding.DataBindingComponent r0 = r2.mBindingComponent
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Required DataBindingComponent is null in class "
            r0.append(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ". A BindingAdapter in "
            r0.append(r1)
            java.lang.String r3 = r3.getCanonicalName()
            r0.append(r3)
            java.lang.String r3 = " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
    }

    protected abstract void executeBindings();

    public void executePendingBindings() {
            r1 = this;
            androidx.databinding.ViewDataBinding r0 = r1.mContainingBinding
            if (r0 != 0) goto L8
            r1.executeBindingsInternal()
            return
        L8:
            r0.executePendingBindings()
            return
    }

    void forceExecuteBindings() {
            r0 = this;
            r0.executeBindings()
            return
    }

    @androidx.annotation.Nullable
    public androidx.lifecycle.LifecycleOwner getLifecycleOwner() {
            r1 = this;
            androidx.lifecycle.LifecycleOwner r0 = r1.mLifecycleOwner
            return r0
    }

    protected java.lang.Object getObservedField(int r2) {
            r1 = this;
            androidx.databinding.WeakListener[] r0 = r1.mLocalFieldObservers
            r2 = r0[r2]
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.Object r2 = r2.getTarget()
            return r2
    }

    @Override // androidx.viewbinding.ViewBinding
    @androidx.annotation.NonNull
    public android.view.View getRoot() {
            r1 = this;
            android.view.View r0 = r1.mRoot
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected void handleFieldChange(int r2, java.lang.Object r3, int r4) {
            r1 = this;
            boolean r0 = r1.mInLiveDataRegisterObserver
            if (r0 != 0) goto L12
            boolean r0 = r1.mInStateFlowRegisterObserver
            if (r0 == 0) goto L9
            goto L12
        L9:
            boolean r2 = r1.onFieldChange(r2, r3, r4)
            if (r2 == 0) goto L12
            r1.requestRebind()
        L12:
            return
    }

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    protected abstract boolean onFieldChange(int r1, java.lang.Object r2, int r3);

    protected void registerTo(int r2, java.lang.Object r3, androidx.databinding.CreateWeakListener r4) {
            r1 = this;
            if (r3 != 0) goto L3
            return
        L3:
            androidx.databinding.WeakListener[] r0 = r1.mLocalFieldObservers
            r0 = r0[r2]
            if (r0 != 0) goto L1a
            java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> r0 = androidx.databinding.ViewDataBinding.sReferenceQueue
            androidx.databinding.WeakListener r0 = r4.create(r1, r2, r0)
            androidx.databinding.WeakListener[] r4 = r1.mLocalFieldObservers
            r4[r2] = r0
            androidx.lifecycle.LifecycleOwner r2 = r1.mLifecycleOwner
            if (r2 == 0) goto L1a
            r0.setLifecycleOwner(r2)
        L1a:
            r0.setTarget(r3)
            return
    }

    public void removeOnRebindCallback(@androidx.annotation.NonNull androidx.databinding.OnRebindCallback r2) {
            r1 = this;
            androidx.databinding.CallbackRegistry<androidx.databinding.OnRebindCallback, androidx.databinding.ViewDataBinding, java.lang.Void> r0 = r1.mRebindCallbacks
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    protected void requestRebind() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.mContainingBinding
            if (r0 == 0) goto L8
            r0.requestRebind()
            return
        L8:
            androidx.lifecycle.LifecycleOwner r0 = r2.mLifecycleOwner
            if (r0 == 0) goto L1d
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 != 0) goto L1d
            return
        L1d:
            monitor-enter(r2)
            boolean r0 = r2.mPendingRebind     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L26
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r0 = move-exception
            goto L3e
        L26:
            r0 = 1
            r2.mPendingRebind = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            boolean r0 = androidx.databinding.ViewDataBinding.USE_CHOREOGRAPHER
            if (r0 == 0) goto L36
            android.view.Choreographer r0 = r2.mChoreographer
            android.view.Choreographer$FrameCallback r1 = r2.mFrameCallback
            r0.postFrameCallback(r1)
            return
        L36:
            android.os.Handler r0 = r2.mUIThreadHandler
            java.lang.Runnable r1 = r2.mRebindRunnable
            r0.post(r1)
            return
        L3e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            throw r0
    }

    protected void setContainedBinding(androidx.databinding.ViewDataBinding r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r1.mContainingBinding = r0
        L4:
            return
    }

    @androidx.annotation.MainThread
    public void setLifecycleOwner(@androidx.annotation.Nullable androidx.lifecycle.LifecycleOwner r5) {
            r4 = this;
            androidx.lifecycle.LifecycleOwner r0 = r4.mLifecycleOwner
            if (r0 != r5) goto L5
            goto L39
        L5:
            if (r0 == 0) goto L10
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.databinding.ViewDataBinding$OnStartListener r1 = r4.mOnStartListener
            r0.removeObserver(r1)
        L10:
            r4.mLifecycleOwner = r5
            if (r5 == 0) goto L29
            androidx.databinding.ViewDataBinding$OnStartListener r0 = r4.mOnStartListener
            if (r0 != 0) goto L20
            androidx.databinding.ViewDataBinding$OnStartListener r0 = new androidx.databinding.ViewDataBinding$OnStartListener
            r1 = 0
            r0.<init>(r4, r1)
            r4.mOnStartListener = r0
        L20:
            androidx.lifecycle.Lifecycle r0 = r5.getLifecycle()
            androidx.databinding.ViewDataBinding$OnStartListener r1 = r4.mOnStartListener
            r0.addObserver(r1)
        L29:
            androidx.databinding.WeakListener[] r0 = r4.mLocalFieldObservers
            int r1 = r0.length
            r2 = 0
        L2d:
            if (r2 >= r1) goto L39
            r3 = r0[r2]
            if (r3 == 0) goto L36
            r3.setLifecycleOwner(r5)
        L36:
            int r2 = r2 + 1
            goto L2d
        L39:
            return
    }

    protected void setRootTag(android.view.View r2) {
            r1 = this;
            int r0 = androidx.databinding.library.R.id.dataBinding
            r2.setTag(r0, r1)
            return
    }

    protected void setRootTag(android.view.View[] r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Le
            r2 = r5[r1]
            int r3 = androidx.databinding.library.R.id.dataBinding
            r2.setTag(r3, r4)
            int r1 = r1 + 1
            goto L2
        Le:
            return
    }

    public abstract boolean setVariable(int r1, @androidx.annotation.Nullable java.lang.Object r2);

    public void unbind() {
            r4 = this;
            androidx.databinding.WeakListener[] r0 = r4.mLocalFieldObservers
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L10
            r3 = r0[r2]
            if (r3 == 0) goto Ld
            r3.unregister()
        Ld:
            int r2 = r2 + 1
            goto L4
        L10:
            return
    }

    protected boolean unregisterFrom(int r2) {
            r1 = this;
            androidx.databinding.WeakListener[] r0 = r1.mLocalFieldObservers
            r2 = r0[r2]
            if (r2 == 0) goto Lb
            boolean r2 = r2.unregister()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    protected boolean updateLiveDataRegistration(int r3, androidx.lifecycle.LiveData<?> r4) {
            r2 = this;
            r0 = 1
            r2.mInLiveDataRegisterObserver = r0
            r0 = 0
            androidx.databinding.CreateWeakListener r1 = androidx.databinding.ViewDataBinding.CREATE_LIVE_DATA_LISTENER     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r2.updateRegistration(r3, r4, r1)     // Catch: java.lang.Throwable -> Ld
            r2.mInLiveDataRegisterObserver = r0
            return r3
        Ld:
            r3 = move-exception
            r2.mInLiveDataRegisterObserver = r0
            throw r3
    }

    protected boolean updateRegistration(int r2, androidx.databinding.Observable r3) {
            r1 = this;
            androidx.databinding.CreateWeakListener r0 = androidx.databinding.ViewDataBinding.CREATE_PROPERTY_LISTENER
            boolean r2 = r1.updateRegistration(r2, r3, r0)
            return r2
    }

    protected boolean updateRegistration(int r2, androidx.databinding.ObservableList r3) {
            r1 = this;
            androidx.databinding.CreateWeakListener r0 = androidx.databinding.ViewDataBinding.CREATE_LIST_LISTENER
            boolean r2 = r1.updateRegistration(r2, r3, r0)
            return r2
    }

    protected boolean updateRegistration(int r2, androidx.databinding.ObservableMap r3) {
            r1 = this;
            androidx.databinding.CreateWeakListener r0 = androidx.databinding.ViewDataBinding.CREATE_MAP_LISTENER
            boolean r2 = r1.updateRegistration(r2, r3, r0)
            return r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected boolean updateRegistration(int r3, java.lang.Object r4, androidx.databinding.CreateWeakListener r5) {
            r2 = this;
            if (r4 != 0) goto L7
            boolean r3 = r2.unregisterFrom(r3)
            return r3
        L7:
            androidx.databinding.WeakListener[] r0 = r2.mLocalFieldObservers
            r0 = r0[r3]
            r1 = 1
            if (r0 != 0) goto L12
            r2.registerTo(r3, r4, r5)
            return r1
        L12:
            java.lang.Object r0 = r0.getTarget()
            if (r0 != r4) goto L1a
            r3 = 0
            return r3
        L1a:
            r2.unregisterFrom(r3)
            r2.registerTo(r3, r4, r5)
            return r1
    }
}
