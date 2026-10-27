package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class Transition implements java.lang.Cloneable {
    static final boolean DBG = false;
    private static final int[] DEFAULT_MATCH_ORDER = null;
    private static final java.lang.String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final java.lang.String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final java.lang.String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final java.lang.String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final java.lang.String MATCH_NAME_STR = "name";
    private static final androidx.transition.PathMotion STRAIGHT_PATH_MOTION = null;
    private static java.lang.ThreadLocal<androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo>> sRunningAnimators;
    private java.util.ArrayList<android.animation.Animator> mAnimators;
    boolean mCanRemoveViews;
    java.util.ArrayList<android.animation.Animator> mCurrentAnimators;
    long mDuration;
    private androidx.transition.TransitionValuesMaps mEndValues;
    private java.util.ArrayList<androidx.transition.TransitionValues> mEndValuesList;
    private boolean mEnded;
    private androidx.transition.Transition.EpicenterCallback mEpicenterCallback;
    private android.animation.TimeInterpolator mInterpolator;
    private java.util.ArrayList<androidx.transition.Transition.TransitionListener> mListeners;
    private int[] mMatchOrder;
    private java.lang.String mName;
    private androidx.collection.ArrayMap<java.lang.String, java.lang.String> mNameOverrides;
    private int mNumInstances;
    androidx.transition.TransitionSet mParent;
    private androidx.transition.PathMotion mPathMotion;
    private boolean mPaused;
    androidx.transition.TransitionPropagation mPropagation;
    private android.view.ViewGroup mSceneRoot;
    private long mStartDelay;
    private androidx.transition.TransitionValuesMaps mStartValues;
    private java.util.ArrayList<androidx.transition.TransitionValues> mStartValuesList;
    private java.util.ArrayList<android.view.View> mTargetChildExcludes;
    private java.util.ArrayList<android.view.View> mTargetExcludes;
    private java.util.ArrayList<java.lang.Integer> mTargetIdChildExcludes;
    private java.util.ArrayList<java.lang.Integer> mTargetIdExcludes;
    java.util.ArrayList<java.lang.Integer> mTargetIds;
    private java.util.ArrayList<java.lang.String> mTargetNameExcludes;
    private java.util.ArrayList<java.lang.String> mTargetNames;
    private java.util.ArrayList<java.lang.Class<?>> mTargetTypeChildExcludes;
    private java.util.ArrayList<java.lang.Class<?>> mTargetTypeExcludes;
    private java.util.ArrayList<java.lang.Class<?>> mTargetTypes;
    java.util.ArrayList<android.view.View> mTargets;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class AnimationInfo {
        java.lang.String mName;
        androidx.transition.Transition mTransition;
        androidx.transition.TransitionValues mValues;
        android.view.View mView;
        androidx.transition.WindowIdImpl mWindowId;

        AnimationInfo(android.view.View r1, java.lang.String r2, androidx.transition.Transition r3, androidx.transition.WindowIdImpl r4, androidx.transition.TransitionValues r5) {
                r0 = this;
                r0.<init>()
                r0.mView = r1
                r0.mName = r2
                r0.mValues = r5
                r0.mWindowId = r4
                r0.mTransition = r3
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ArrayListManager {
        private ArrayListManager() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T> java.util.ArrayList<T> add(java.util.ArrayList<T> r1, T r2) {
                if (r1 != 0) goto L7
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
            L7:
                boolean r0 = r1.contains(r2)
                if (r0 != 0) goto L10
                r1.add(r2)
            L10:
                return r1
        }

        static <T> java.util.ArrayList<T> remove(java.util.ArrayList<T> r0, T r1) {
                if (r0 == 0) goto Lc
                r0.remove(r1)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto Lc
                r0 = 0
            Lc:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class EpicenterCallback {
        public EpicenterCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract android.graphics.Rect onGetEpicenter(@androidx.annotation.NonNull androidx.transition.Transition r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface MatchOrder {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface TransitionListener {
        void onTransitionCancel(@androidx.annotation.NonNull androidx.transition.Transition r1);

        void onTransitionEnd(@androidx.annotation.NonNull androidx.transition.Transition r1);

        void onTransitionPause(@androidx.annotation.NonNull androidx.transition.Transition r1);

        void onTransitionResume(@androidx.annotation.NonNull androidx.transition.Transition r1);

        void onTransitionStart(@androidx.annotation.NonNull androidx.transition.Transition r1);
    }

    static {
            r0 = 3
            r1 = 4
            r2 = 2
            r3 = 1
            int[] r0 = new int[]{r2, r3, r0, r1}
            androidx.transition.Transition.DEFAULT_MATCH_ORDER = r0
            androidx.transition.Transition$1 r0 = new androidx.transition.Transition$1
            r0.<init>()
            androidx.transition.Transition.STRAIGHT_PATH_MOTION = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.transition.Transition.sRunningAnimators = r0
            return
    }

    public Transition() {
            r3 = this;
            r3.<init>()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r3.mName = r0
            r0 = -1
            r3.mStartDelay = r0
            r3.mDuration = r0
            r0 = 0
            r3.mInterpolator = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.mTargetIds = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.mTargets = r1
            r3.mTargetNames = r0
            r3.mTargetTypes = r0
            r3.mTargetIdExcludes = r0
            r3.mTargetExcludes = r0
            r3.mTargetTypeExcludes = r0
            r3.mTargetNameExcludes = r0
            r3.mTargetIdChildExcludes = r0
            r3.mTargetChildExcludes = r0
            r3.mTargetTypeChildExcludes = r0
            androidx.transition.TransitionValuesMaps r1 = new androidx.transition.TransitionValuesMaps
            r1.<init>()
            r3.mStartValues = r1
            androidx.transition.TransitionValuesMaps r1 = new androidx.transition.TransitionValuesMaps
            r1.<init>()
            r3.mEndValues = r1
            r3.mParent = r0
            int[] r1 = androidx.transition.Transition.DEFAULT_MATCH_ORDER
            r3.mMatchOrder = r1
            r3.mSceneRoot = r0
            r1 = 0
            r3.mCanRemoveViews = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.mCurrentAnimators = r2
            r3.mNumInstances = r1
            r3.mPaused = r1
            r3.mEnded = r1
            r3.mListeners = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mAnimators = r0
            androidx.transition.PathMotion r0 = androidx.transition.Transition.STRAIGHT_PATH_MOTION
            r3.mPathMotion = r0
            return
    }

    @android.annotation.SuppressLint({"RestrictedApi"})
    public Transition(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            r8.<init>()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getName()
            r8.mName = r0
            r0 = -1
            r8.mStartDelay = r0
            r8.mDuration = r0
            r0 = 0
            r8.mInterpolator = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.mTargetIds = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.mTargets = r1
            r8.mTargetNames = r0
            r8.mTargetTypes = r0
            r8.mTargetIdExcludes = r0
            r8.mTargetExcludes = r0
            r8.mTargetTypeExcludes = r0
            r8.mTargetNameExcludes = r0
            r8.mTargetIdChildExcludes = r0
            r8.mTargetChildExcludes = r0
            r8.mTargetTypeChildExcludes = r0
            androidx.transition.TransitionValuesMaps r1 = new androidx.transition.TransitionValuesMaps
            r1.<init>()
            r8.mStartValues = r1
            androidx.transition.TransitionValuesMaps r1 = new androidx.transition.TransitionValuesMaps
            r1.<init>()
            r8.mEndValues = r1
            r8.mParent = r0
            int[] r1 = androidx.transition.Transition.DEFAULT_MATCH_ORDER
            r8.mMatchOrder = r1
            r8.mSceneRoot = r0
            r1 = 0
            r8.mCanRemoveViews = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r8.mCurrentAnimators = r2
            r8.mNumInstances = r1
            r8.mPaused = r1
            r8.mEnded = r1
            r8.mListeners = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.mAnimators = r0
            androidx.transition.PathMotion r0 = androidx.transition.Transition.STRAIGHT_PATH_MOTION
            r8.mPathMotion = r0
            int[] r0 = androidx.transition.Styleable.TRANSITION
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0)
            android.content.res.XmlResourceParser r10 = (android.content.res.XmlResourceParser) r10
            java.lang.String r2 = "duration"
            r3 = 1
            r4 = -1
            int r2 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r0, r10, r2, r3, r4)
            long r2 = (long) r2
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L83
            r8.setDuration(r2)
        L83:
            java.lang.String r2 = "startDelay"
            r3 = 2
            int r2 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r0, r10, r2, r3, r4)
            long r2 = (long) r2
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 <= 0) goto L92
            r8.setStartDelay(r2)
        L92:
            java.lang.String r2 = "interpolator"
            int r1 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(r0, r10, r2, r1, r1)
            if (r1 <= 0) goto La1
            android.view.animation.Interpolator r9 = android.view.animation.AnimationUtils.loadInterpolator(r9, r1)
            r8.setInterpolator(r9)
        La1:
            java.lang.String r9 = "matchOrder"
            r1 = 3
            java.lang.String r9 = androidx.core.content.res.TypedArrayUtils.getNamedString(r0, r10, r9, r1)
            if (r9 == 0) goto Lb1
            int[] r9 = parseMatchOrder(r9)
            r8.setMatchOrder(r9)
        Lb1:
            r0.recycle()
            return
    }

    private void addUnmatched(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r6, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r7) {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r6.size()
            r3 = 0
            if (r1 >= r2) goto L24
            java.lang.Object r2 = r6.valueAt(r1)
            androidx.transition.TransitionValues r2 = (androidx.transition.TransitionValues) r2
            android.view.View r4 = r2.view
            boolean r4 = r5.isValidTarget(r4)
            if (r4 == 0) goto L21
            java.util.ArrayList<androidx.transition.TransitionValues> r4 = r5.mStartValuesList
            r4.add(r2)
            java.util.ArrayList<androidx.transition.TransitionValues> r2 = r5.mEndValuesList
            r2.add(r3)
        L21:
            int r1 = r1 + 1
            goto L2
        L24:
            int r6 = r7.size()
            if (r0 >= r6) goto L45
            java.lang.Object r6 = r7.valueAt(r0)
            androidx.transition.TransitionValues r6 = (androidx.transition.TransitionValues) r6
            android.view.View r1 = r6.view
            boolean r1 = r5.isValidTarget(r1)
            if (r1 == 0) goto L42
            java.util.ArrayList<androidx.transition.TransitionValues> r1 = r5.mEndValuesList
            r1.add(r6)
            java.util.ArrayList<androidx.transition.TransitionValues> r6 = r5.mStartValuesList
            r6.add(r3)
        L42:
            int r0 = r0 + 1
            goto L24
        L45:
            return
    }

    private static void addViewValues(androidx.transition.TransitionValuesMaps r3, android.view.View r4, androidx.transition.TransitionValues r5) {
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r0 = r3.mViewValues
            r0.put(r4, r5)
            int r5 = r4.getId()
            r0 = 0
            if (r5 < 0) goto L1f
            android.util.SparseArray<android.view.View> r1 = r3.mIdValues
            int r1 = r1.indexOfKey(r5)
            if (r1 < 0) goto L1a
            android.util.SparseArray<android.view.View> r1 = r3.mIdValues
            r1.put(r5, r0)
            goto L1f
        L1a:
            android.util.SparseArray<android.view.View> r1 = r3.mIdValues
            r1.put(r5, r4)
        L1f:
            java.lang.String r5 = androidx.core.view.ViewCompat.getTransitionName(r4)
            if (r5 == 0) goto L38
            androidx.collection.ArrayMap<java.lang.String, android.view.View> r1 = r3.mNameValues
            boolean r1 = r1.containsKey(r5)
            if (r1 == 0) goto L33
            androidx.collection.ArrayMap<java.lang.String, android.view.View> r1 = r3.mNameValues
            r1.put(r5, r0)
            goto L38
        L33:
            androidx.collection.ArrayMap<java.lang.String, android.view.View> r1 = r3.mNameValues
            r1.put(r5, r4)
        L38:
            android.view.ViewParent r5 = r4.getParent()
            boolean r5 = r5 instanceof android.widget.ListView
            if (r5 == 0) goto L7d
            android.view.ViewParent r5 = r4.getParent()
            android.widget.ListView r5 = (android.widget.ListView) r5
            android.widget.ListAdapter r1 = r5.getAdapter()
            boolean r1 = r1.hasStableIds()
            if (r1 == 0) goto L7d
            int r1 = r5.getPositionForView(r4)
            long r1 = r5.getItemIdAtPosition(r1)
            androidx.collection.LongSparseArray<android.view.View> r5 = r3.mItemIdValues
            int r5 = r5.indexOfKey(r1)
            if (r5 < 0) goto L74
            androidx.collection.LongSparseArray<android.view.View> r4 = r3.mItemIdValues
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L7d
            r5 = 0
            androidx.core.view.ViewCompat.setHasTransientState(r4, r5)
            androidx.collection.LongSparseArray<android.view.View> r3 = r3.mItemIdValues
            r3.put(r1, r0)
            return
        L74:
            r5 = 1
            androidx.core.view.ViewCompat.setHasTransientState(r4, r5)
            androidx.collection.LongSparseArray<android.view.View> r3 = r3.mItemIdValues
            r3.put(r1, r4)
        L7d:
            return
    }

    private static boolean alreadyContains(int[] r4, int r5) {
            r0 = r4[r5]
            r1 = 0
            r2 = 0
        L4:
            if (r2 >= r5) goto Lf
            r3 = r4[r2]
            if (r3 != r0) goto Lc
            r4 = 1
            return r4
        Lc:
            int r2 = r2 + 1
            goto L4
        Lf:
            return r1
    }

    private void captureHierarchy(android.view.View r6, boolean r7) {
            r5 = this;
            if (r6 != 0) goto L4
            goto Lbb
        L4:
            int r0 = r6.getId()
            java.util.ArrayList<java.lang.Integer> r1 = r5.mTargetIdExcludes
            if (r1 == 0) goto L18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L18
            goto Lbb
        L18:
            java.util.ArrayList<android.view.View> r1 = r5.mTargetExcludes
            if (r1 == 0) goto L24
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L24
            goto Lbb
        L24:
            java.util.ArrayList<java.lang.Class<?>> r1 = r5.mTargetTypeExcludes
            r2 = 0
            if (r1 == 0) goto L43
            int r1 = r1.size()
            r3 = 0
        L2e:
            if (r3 >= r1) goto L43
            java.util.ArrayList<java.lang.Class<?>> r4 = r5.mTargetTypeExcludes
            java.lang.Object r4 = r4.get(r3)
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r4 = r4.isInstance(r6)
            if (r4 == 0) goto L40
            goto Lbb
        L40:
            int r3 = r3 + 1
            goto L2e
        L43:
            android.view.ViewParent r1 = r6.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L6e
            androidx.transition.TransitionValues r1 = new androidx.transition.TransitionValues
            r1.<init>(r6)
            if (r7 == 0) goto L56
            r5.captureStartValues(r1)
            goto L59
        L56:
            r5.captureEndValues(r1)
        L59:
            java.util.ArrayList<androidx.transition.Transition> r3 = r1.mTargetedTransitions
            r3.add(r5)
            r5.capturePropagationValues(r1)
            if (r7 == 0) goto L69
            androidx.transition.TransitionValuesMaps r3 = r5.mStartValues
            addViewValues(r3, r6, r1)
            goto L6e
        L69:
            androidx.transition.TransitionValuesMaps r3 = r5.mEndValues
            addViewValues(r3, r6, r1)
        L6e:
            boolean r1 = r6 instanceof android.view.ViewGroup
            if (r1 == 0) goto Lbb
            java.util.ArrayList<java.lang.Integer> r1 = r5.mTargetIdChildExcludes
            if (r1 == 0) goto L81
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L81
            goto Lbb
        L81:
            java.util.ArrayList<android.view.View> r0 = r5.mTargetChildExcludes
            if (r0 == 0) goto L8c
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L8c
            goto Lbb
        L8c:
            java.util.ArrayList<java.lang.Class<?>> r0 = r5.mTargetTypeChildExcludes
            if (r0 == 0) goto La9
            int r0 = r0.size()
            r1 = 0
        L95:
            if (r1 >= r0) goto La9
            java.util.ArrayList<java.lang.Class<?>> r3 = r5.mTargetTypeChildExcludes
            java.lang.Object r3 = r3.get(r1)
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isInstance(r6)
            if (r3 == 0) goto La6
            goto Lbb
        La6:
            int r1 = r1 + 1
            goto L95
        La9:
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
        Lab:
            int r0 = r6.getChildCount()
            if (r2 >= r0) goto Lbb
            android.view.View r0 = r6.getChildAt(r2)
            r5.captureHierarchy(r0, r7)
            int r2 = r2 + 1
            goto Lab
        Lbb:
            return
    }

    private java.util.ArrayList<java.lang.Integer> excludeId(java.util.ArrayList<java.lang.Integer> r1, int r2, boolean r3) {
            r0 = this;
            if (r2 <= 0) goto L15
            if (r3 == 0) goto Ld
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.ArrayList r1 = androidx.transition.Transition.ArrayListManager.add(r1, r2)
            return r1
        Ld:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.ArrayList r1 = androidx.transition.Transition.ArrayListManager.remove(r1, r2)
        L15:
            return r1
    }

    private static <T> java.util.ArrayList<T> excludeObject(java.util.ArrayList<T> r0, T r1, boolean r2) {
            if (r1 == 0) goto Ld
            if (r2 == 0) goto L9
            java.util.ArrayList r0 = androidx.transition.Transition.ArrayListManager.add(r0, r1)
            return r0
        L9:
            java.util.ArrayList r0 = androidx.transition.Transition.ArrayListManager.remove(r0, r1)
        Ld:
            return r0
    }

    private java.util.ArrayList<java.lang.Class<?>> excludeType(java.util.ArrayList<java.lang.Class<?>> r1, java.lang.Class<?> r2, boolean r3) {
            r0 = this;
            if (r2 == 0) goto Ld
            if (r3 == 0) goto L9
            java.util.ArrayList r1 = androidx.transition.Transition.ArrayListManager.add(r1, r2)
            return r1
        L9:
            java.util.ArrayList r1 = androidx.transition.Transition.ArrayListManager.remove(r1, r2)
        Ld:
            return r1
    }

    private java.util.ArrayList<android.view.View> excludeView(java.util.ArrayList<android.view.View> r1, android.view.View r2, boolean r3) {
            r0 = this;
            if (r2 == 0) goto Ld
            if (r3 == 0) goto L9
            java.util.ArrayList r1 = androidx.transition.Transition.ArrayListManager.add(r1, r2)
            return r1
        L9:
            java.util.ArrayList r1 = androidx.transition.Transition.ArrayListManager.remove(r1, r2)
        Ld:
            return r1
    }

    private static androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> getRunningAnimators() {
            java.lang.ThreadLocal<androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition$AnimationInfo>> r0 = androidx.transition.Transition.sRunningAnimators
            java.lang.Object r0 = r0.get()
            androidx.collection.ArrayMap r0 = (androidx.collection.ArrayMap) r0
            if (r0 != 0) goto L14
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.ThreadLocal<androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition$AnimationInfo>> r1 = androidx.transition.Transition.sRunningAnimators
            r1.set(r0)
        L14:
            return r0
    }

    private static boolean isValidMatch(int r2) {
            r0 = 1
            if (r2 < r0) goto L7
            r1 = 4
            if (r2 > r1) goto L7
            return r0
        L7:
            r2 = 0
            return r2
    }

    private static boolean isValueChanged(androidx.transition.TransitionValues r0, androidx.transition.TransitionValues r1, java.lang.String r2) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.values
            java.lang.Object r0 = r0.get(r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.values
            java.lang.Object r1 = r1.get(r2)
            if (r0 != 0) goto L12
            if (r1 != 0) goto L12
            r0 = 0
            return r0
        L12:
            r2 = 1
            if (r0 == 0) goto L1e
            if (r1 != 0) goto L18
            goto L1e
        L18:
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ r2
            return r0
        L1e:
            return r2
    }

    private void matchIds(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r8, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r9, android.util.SparseArray<android.view.View> r10, android.util.SparseArray<android.view.View> r11) {
            r7 = this;
            int r0 = r10.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L4a
            java.lang.Object r2 = r10.valueAt(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L47
            boolean r3 = r7.isValidTarget(r2)
            if (r3 == 0) goto L47
            int r3 = r10.keyAt(r1)
            java.lang.Object r3 = r11.get(r3)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L47
            boolean r4 = r7.isValidTarget(r3)
            if (r4 == 0) goto L47
            java.lang.Object r4 = r8.get(r2)
            androidx.transition.TransitionValues r4 = (androidx.transition.TransitionValues) r4
            java.lang.Object r5 = r9.get(r3)
            androidx.transition.TransitionValues r5 = (androidx.transition.TransitionValues) r5
            if (r4 == 0) goto L47
            if (r5 == 0) goto L47
            java.util.ArrayList<androidx.transition.TransitionValues> r6 = r7.mStartValuesList
            r6.add(r4)
            java.util.ArrayList<androidx.transition.TransitionValues> r4 = r7.mEndValuesList
            r4.add(r5)
            r8.remove(r2)
            r9.remove(r3)
        L47:
            int r1 = r1 + 1
            goto L5
        L4a:
            return
    }

    private void matchInstances(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r5, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r6) {
            r4 = this;
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L39
            java.lang.Object r1 = r5.keyAt(r0)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L36
            boolean r2 = r4.isValidTarget(r1)
            if (r2 == 0) goto L36
            java.lang.Object r1 = r6.remove(r1)
            androidx.transition.TransitionValues r1 = (androidx.transition.TransitionValues) r1
            if (r1 == 0) goto L36
            android.view.View r2 = r1.view
            boolean r2 = r4.isValidTarget(r2)
            if (r2 == 0) goto L36
            java.lang.Object r2 = r5.removeAt(r0)
            androidx.transition.TransitionValues r2 = (androidx.transition.TransitionValues) r2
            java.util.ArrayList<androidx.transition.TransitionValues> r3 = r4.mStartValuesList
            r3.add(r2)
            java.util.ArrayList<androidx.transition.TransitionValues> r2 = r4.mEndValuesList
            r2.add(r1)
        L36:
            int r0 = r0 + (-1)
            goto L6
        L39:
            return
    }

    private void matchItemIds(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r8, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r9, androidx.collection.LongSparseArray<android.view.View> r10, androidx.collection.LongSparseArray<android.view.View> r11) {
            r7 = this;
            int r0 = r10.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L4a
            java.lang.Object r2 = r10.valueAt(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L47
            boolean r3 = r7.isValidTarget(r2)
            if (r3 == 0) goto L47
            long r3 = r10.keyAt(r1)
            java.lang.Object r3 = r11.get(r3)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L47
            boolean r4 = r7.isValidTarget(r3)
            if (r4 == 0) goto L47
            java.lang.Object r4 = r8.get(r2)
            androidx.transition.TransitionValues r4 = (androidx.transition.TransitionValues) r4
            java.lang.Object r5 = r9.get(r3)
            androidx.transition.TransitionValues r5 = (androidx.transition.TransitionValues) r5
            if (r4 == 0) goto L47
            if (r5 == 0) goto L47
            java.util.ArrayList<androidx.transition.TransitionValues> r6 = r7.mStartValuesList
            r6.add(r4)
            java.util.ArrayList<androidx.transition.TransitionValues> r4 = r7.mEndValuesList
            r4.add(r5)
            r8.remove(r2)
            r9.remove(r3)
        L47:
            int r1 = r1 + 1
            goto L5
        L4a:
            return
    }

    private void matchNames(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r8, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r9, androidx.collection.ArrayMap<java.lang.String, android.view.View> r10, androidx.collection.ArrayMap<java.lang.String, android.view.View> r11) {
            r7 = this;
            int r0 = r10.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L4a
            java.lang.Object r2 = r10.valueAt(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L47
            boolean r3 = r7.isValidTarget(r2)
            if (r3 == 0) goto L47
            java.lang.Object r3 = r10.keyAt(r1)
            java.lang.Object r3 = r11.get(r3)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L47
            boolean r4 = r7.isValidTarget(r3)
            if (r4 == 0) goto L47
            java.lang.Object r4 = r8.get(r2)
            androidx.transition.TransitionValues r4 = (androidx.transition.TransitionValues) r4
            java.lang.Object r5 = r9.get(r3)
            androidx.transition.TransitionValues r5 = (androidx.transition.TransitionValues) r5
            if (r4 == 0) goto L47
            if (r5 == 0) goto L47
            java.util.ArrayList<androidx.transition.TransitionValues> r6 = r7.mStartValuesList
            r6.add(r4)
            java.util.ArrayList<androidx.transition.TransitionValues> r4 = r7.mEndValuesList
            r4.add(r5)
            r8.remove(r2)
            r9.remove(r3)
        L47:
            int r1 = r1 + 1
            goto L5
        L4a:
            return
    }

    private void matchStartAndEnd(androidx.transition.TransitionValuesMaps r6, androidx.transition.TransitionValuesMaps r7) {
            r5 = this;
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r1 = r6.mViewValues
            r0.<init>(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r2 = r7.mViewValues
            r1.<init>(r2)
            r2 = 0
        Lf:
            int[] r3 = r5.mMatchOrder
            int r4 = r3.length
            if (r2 >= r4) goto L41
            r3 = r3[r2]
            r4 = 1
            if (r3 == r4) goto L3b
            r4 = 2
            if (r3 == r4) goto L33
            r4 = 3
            if (r3 == r4) goto L2b
            r4 = 4
            if (r3 == r4) goto L23
            goto L3e
        L23:
            androidx.collection.LongSparseArray<android.view.View> r3 = r6.mItemIdValues
            androidx.collection.LongSparseArray<android.view.View> r4 = r7.mItemIdValues
            r5.matchItemIds(r0, r1, r3, r4)
            goto L3e
        L2b:
            android.util.SparseArray<android.view.View> r3 = r6.mIdValues
            android.util.SparseArray<android.view.View> r4 = r7.mIdValues
            r5.matchIds(r0, r1, r3, r4)
            goto L3e
        L33:
            androidx.collection.ArrayMap<java.lang.String, android.view.View> r3 = r6.mNameValues
            androidx.collection.ArrayMap<java.lang.String, android.view.View> r4 = r7.mNameValues
            r5.matchNames(r0, r1, r3, r4)
            goto L3e
        L3b:
            r5.matchInstances(r0, r1)
        L3e:
            int r2 = r2 + 1
            goto Lf
        L41:
            r5.addUnmatched(r0, r1)
            return
    }

    private static int[] parseMatchOrder(java.lang.String r6) {
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            java.lang.String r1 = ","
            r0.<init>(r6, r1)
            int r6 = r0.countTokens()
            int[] r6 = new int[r6]
            r1 = 0
            r2 = 0
        Lf:
            boolean r3 = r0.hasMoreTokens()
            if (r3 == 0) goto L7b
            java.lang.String r3 = r0.nextToken()
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = "id"
            boolean r4 = r4.equalsIgnoreCase(r3)
            r5 = 1
            if (r4 == 0) goto L2a
            r3 = 3
            r6[r2] = r3
            goto L5d
        L2a:
            java.lang.String r4 = "instance"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 == 0) goto L35
            r6[r2] = r5
            goto L5d
        L35:
            java.lang.String r4 = "name"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 == 0) goto L41
            r3 = 2
            r6[r2] = r3
            goto L5d
        L41:
            java.lang.String r4 = "itemId"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 == 0) goto L4d
            r3 = 4
            r6[r2] = r3
            goto L5d
        L4d:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L5f
            int r3 = r6.length
            int r3 = r3 - r5
            int[] r3 = new int[r3]
            java.lang.System.arraycopy(r6, r1, r3, r1, r2)
            int r2 = r2 + (-1)
            r6 = r3
        L5d:
            int r2 = r2 + r5
            goto Lf
        L5f:
            android.view.InflateException r6 = new android.view.InflateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown match type in matchOrder: '"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L7b:
            return r6
    }

    private void runAnimator(android.animation.Animator r2, androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> r3) {
            r1 = this;
            if (r2 == 0) goto Ld
            androidx.transition.Transition$2 r0 = new androidx.transition.Transition$2
            r0.<init>(r1, r3)
            r2.addListener(r0)
            r1.animate(r2)
        Ld:
            return
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition addListener(@androidx.annotation.NonNull androidx.transition.Transition.TransitionListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r0 = r1.mListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mListeners = r0
        Lb:
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r0 = r1.mListeners
            r0.add(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition addTarget(@androidx.annotation.IdRes int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            java.util.ArrayList<java.lang.Integer> r0 = r1.mTargetIds
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
        Lb:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition addTarget(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTargets
            r0.add(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition addTarget(@androidx.annotation.NonNull java.lang.Class<?> r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypes
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTargetTypes = r0
        Lb:
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypes
            r0.add(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition addTarget(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.mTargetNames
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTargetNames = r0
        Lb:
            java.util.ArrayList<java.lang.String> r0 = r1.mTargetNames
            r0.add(r2)
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void animate(android.animation.Animator r6) {
            r5 = this;
            if (r6 != 0) goto L6
            r5.end()
            return
        L6:
            long r0 = r5.getDuration()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L17
            long r0 = r5.getDuration()
            r6.setDuration(r0)
        L17:
            long r0 = r5.getStartDelay()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L2b
            long r0 = r5.getStartDelay()
            long r2 = r6.getStartDelay()
            long r0 = r0 + r2
            r6.setStartDelay(r0)
        L2b:
            android.animation.TimeInterpolator r0 = r5.getInterpolator()
            if (r0 == 0) goto L38
            android.animation.TimeInterpolator r0 = r5.getInterpolator()
            r6.setInterpolator(r0)
        L38:
            androidx.transition.Transition$3 r0 = new androidx.transition.Transition$3
            r0.<init>(r5)
            r6.addListener(r0)
            r6.start()
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void cancel() {
            r4 = this;
            java.util.ArrayList<android.animation.Animator> r0 = r4.mCurrentAnimators
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList<android.animation.Animator> r1 = r4.mCurrentAnimators
            java.lang.Object r1 = r1.get(r0)
            android.animation.Animator r1 = (android.animation.Animator) r1
            r1.cancel()
            int r0 = r0 + (-1)
            goto L8
        L18:
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r0 = r4.mListeners
            if (r0 == 0) goto L3d
            int r0 = r0.size()
            if (r0 <= 0) goto L3d
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r0 = r4.mListeners
            java.lang.Object r0 = r0.clone()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 0
        L2f:
            if (r2 >= r1) goto L3d
            java.lang.Object r3 = r0.get(r2)
            androidx.transition.Transition$TransitionListener r3 = (androidx.transition.Transition.TransitionListener) r3
            r3.onTransitionCancel(r4)
            int r2 = r2 + 1
            goto L2f
        L3d:
            return
    }

    public abstract void captureEndValues(@androidx.annotation.NonNull androidx.transition.TransitionValues r1);

    void capturePropagationValues(androidx.transition.TransitionValues r5) {
            r4 = this;
            androidx.transition.TransitionPropagation r0 = r4.mPropagation
            if (r0 == 0) goto L2c
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.values
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2c
            androidx.transition.TransitionPropagation r0 = r4.mPropagation
            java.lang.String[] r0 = r0.getPropagationProperties()
            if (r0 != 0) goto L15
            goto L2c
        L15:
            r1 = 0
        L16:
            int r2 = r0.length
            if (r1 >= r2) goto L2c
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.values
            r3 = r0[r1]
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L29
            androidx.transition.TransitionPropagation r0 = r4.mPropagation
            r0.captureValues(r5)
            return
        L29:
            int r1 = r1 + 1
            goto L16
        L2c:
            return
    }

    public abstract void captureStartValues(@androidx.annotation.NonNull androidx.transition.TransitionValues r1);

    void captureValues(android.view.ViewGroup r6, boolean r7) {
            r5 = this;
            r5.clearValues(r7)
            java.util.ArrayList<java.lang.Integer> r0 = r5.mTargetIds
            int r0 = r0.size()
            r1 = 0
            if (r0 > 0) goto L14
            java.util.ArrayList<android.view.View> r0 = r5.mTargets
            int r0 = r0.size()
            if (r0 <= 0) goto L29
        L14:
            java.util.ArrayList<java.lang.String> r0 = r5.mTargetNames
            if (r0 == 0) goto L1e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L29
        L1e:
            java.util.ArrayList<java.lang.Class<?>> r0 = r5.mTargetTypes
            if (r0 == 0) goto L2e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L29
            goto L2e
        L29:
            r5.captureHierarchy(r6, r7)
            goto La6
        L2e:
            r0 = 0
        L2f:
            java.util.ArrayList<java.lang.Integer> r2 = r5.mTargetIds
            int r2 = r2.size()
            if (r0 >= r2) goto L6f
            java.util.ArrayList<java.lang.Integer> r2 = r5.mTargetIds
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.view.View r2 = r6.findViewById(r2)
            if (r2 == 0) goto L6c
            androidx.transition.TransitionValues r3 = new androidx.transition.TransitionValues
            r3.<init>(r2)
            if (r7 == 0) goto L54
            r5.captureStartValues(r3)
            goto L57
        L54:
            r5.captureEndValues(r3)
        L57:
            java.util.ArrayList<androidx.transition.Transition> r4 = r3.mTargetedTransitions
            r4.add(r5)
            r5.capturePropagationValues(r3)
            if (r7 == 0) goto L67
            androidx.transition.TransitionValuesMaps r4 = r5.mStartValues
            addViewValues(r4, r2, r3)
            goto L6c
        L67:
            androidx.transition.TransitionValuesMaps r4 = r5.mEndValues
            addViewValues(r4, r2, r3)
        L6c:
            int r0 = r0 + 1
            goto L2f
        L6f:
            r6 = 0
        L70:
            java.util.ArrayList<android.view.View> r0 = r5.mTargets
            int r0 = r0.size()
            if (r6 >= r0) goto La6
            java.util.ArrayList<android.view.View> r0 = r5.mTargets
            java.lang.Object r0 = r0.get(r6)
            android.view.View r0 = (android.view.View) r0
            androidx.transition.TransitionValues r2 = new androidx.transition.TransitionValues
            r2.<init>(r0)
            if (r7 == 0) goto L8b
            r5.captureStartValues(r2)
            goto L8e
        L8b:
            r5.captureEndValues(r2)
        L8e:
            java.util.ArrayList<androidx.transition.Transition> r3 = r2.mTargetedTransitions
            r3.add(r5)
            r5.capturePropagationValues(r2)
            if (r7 == 0) goto L9e
            androidx.transition.TransitionValuesMaps r3 = r5.mStartValues
            addViewValues(r3, r0, r2)
            goto La3
        L9e:
            androidx.transition.TransitionValuesMaps r3 = r5.mEndValues
            addViewValues(r3, r0, r2)
        La3:
            int r6 = r6 + 1
            goto L70
        La6:
            if (r7 != 0) goto Lea
            androidx.collection.ArrayMap<java.lang.String, java.lang.String> r6 = r5.mNameOverrides
            if (r6 == 0) goto Lea
            int r6 = r6.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r6)
            r0 = 0
        Lb6:
            if (r0 >= r6) goto Lce
            androidx.collection.ArrayMap<java.lang.String, java.lang.String> r2 = r5.mNameOverrides
            java.lang.Object r2 = r2.keyAt(r0)
            java.lang.String r2 = (java.lang.String) r2
            androidx.transition.TransitionValuesMaps r3 = r5.mStartValues
            androidx.collection.ArrayMap<java.lang.String, android.view.View> r3 = r3.mNameValues
            java.lang.Object r2 = r3.remove(r2)
            r7.add(r2)
            int r0 = r0 + 1
            goto Lb6
        Lce:
            if (r1 >= r6) goto Lea
            java.lang.Object r0 = r7.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto Le7
            androidx.collection.ArrayMap<java.lang.String, java.lang.String> r2 = r5.mNameOverrides
            java.lang.Object r2 = r2.valueAt(r1)
            java.lang.String r2 = (java.lang.String) r2
            androidx.transition.TransitionValuesMaps r3 = r5.mStartValues
            androidx.collection.ArrayMap<java.lang.String, android.view.View> r3 = r3.mNameValues
            r3.put(r2, r0)
        Le7:
            int r1 = r1 + 1
            goto Lce
        Lea:
            return
    }

    void clearValues(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L18
            androidx.transition.TransitionValuesMaps r1 = r0.mStartValues
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r1 = r1.mViewValues
            r1.clear()
            androidx.transition.TransitionValuesMaps r1 = r0.mStartValues
            android.util.SparseArray<android.view.View> r1 = r1.mIdValues
            r1.clear()
            androidx.transition.TransitionValuesMaps r1 = r0.mStartValues
            androidx.collection.LongSparseArray<android.view.View> r1 = r1.mItemIdValues
            r1.clear()
            return
        L18:
            androidx.transition.TransitionValuesMaps r1 = r0.mEndValues
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r1 = r1.mViewValues
            r1.clear()
            androidx.transition.TransitionValuesMaps r1 = r0.mEndValues
            android.util.SparseArray<android.view.View> r1 = r1.mIdValues
            r1.clear()
            androidx.transition.TransitionValuesMaps r1 = r0.mEndValues
            androidx.collection.LongSparseArray<android.view.View> r1 = r1.mItemIdValues
            r1.clear()
            return
    }

    public androidx.transition.Transition clone() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L21
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1     // Catch: java.lang.CloneNotSupportedException -> L21
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.CloneNotSupportedException -> L21
            r2.<init>()     // Catch: java.lang.CloneNotSupportedException -> L21
            r1.mAnimators = r2     // Catch: java.lang.CloneNotSupportedException -> L21
            androidx.transition.TransitionValuesMaps r2 = new androidx.transition.TransitionValuesMaps     // Catch: java.lang.CloneNotSupportedException -> L21
            r2.<init>()     // Catch: java.lang.CloneNotSupportedException -> L21
            r1.mStartValues = r2     // Catch: java.lang.CloneNotSupportedException -> L21
            androidx.transition.TransitionValuesMaps r2 = new androidx.transition.TransitionValuesMaps     // Catch: java.lang.CloneNotSupportedException -> L21
            r2.<init>()     // Catch: java.lang.CloneNotSupportedException -> L21
            r1.mEndValues = r2     // Catch: java.lang.CloneNotSupportedException -> L21
            r1.mStartValuesList = r0     // Catch: java.lang.CloneNotSupportedException -> L21
            r1.mEndValuesList = r0     // Catch: java.lang.CloneNotSupportedException -> L21
            return r1
        L21:
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object mo91clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.transition.Transition r0 = r1.clone()
            return r0
    }

    @androidx.annotation.Nullable
    public android.animation.Animator createAnimator(@androidx.annotation.NonNull android.view.ViewGroup r1, @androidx.annotation.Nullable androidx.transition.TransitionValues r2, @androidx.annotation.Nullable androidx.transition.TransitionValues r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void createAnimators(android.view.ViewGroup r21, androidx.transition.TransitionValuesMaps r22, androidx.transition.TransitionValuesMaps r23, java.util.ArrayList<androidx.transition.TransitionValues> r24, java.util.ArrayList<androidx.transition.TransitionValues> r25) {
            r20 = this;
            r3 = r20
            r6 = r21
            androidx.collection.ArrayMap r7 = getRunningAnimators()
            android.util.SparseIntArray r8 = new android.util.SparseIntArray
            r8.<init>()
            int r9 = r24.size()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
        L17:
            if (r11 >= r9) goto L117
            r12 = r24
            java.lang.Object r2 = r12.get(r11)
            androidx.transition.TransitionValues r2 = (androidx.transition.TransitionValues) r2
            r13 = r25
            java.lang.Object r4 = r13.get(r11)
            androidx.transition.TransitionValues r4 = (androidx.transition.TransitionValues) r4
            if (r2 == 0) goto L34
            java.util.ArrayList<androidx.transition.Transition> r14 = r2.mTargetedTransitions
            boolean r14 = r14.contains(r3)
            if (r14 != 0) goto L34
            r2 = 0
        L34:
            if (r4 == 0) goto L3f
            java.util.ArrayList<androidx.transition.Transition> r14 = r4.mTargetedTransitions
            boolean r14 = r14.contains(r3)
            if (r14 != 0) goto L3f
            r4 = 0
        L3f:
            if (r2 != 0) goto L49
            if (r4 != 0) goto L49
        L43:
            r16 = r9
            r17 = r11
            goto L111
        L49:
            if (r2 == 0) goto L53
            if (r4 == 0) goto L53
            boolean r14 = r3.isTransitionRequired(r2, r4)
            if (r14 == 0) goto L43
        L53:
            android.animation.Animator r14 = r3.createAnimator(r6, r2, r4)
            if (r14 == 0) goto L43
            if (r4 == 0) goto Lda
            android.view.View r15 = r4.view
            java.lang.String[] r5 = r3.getTransitionProperties()
            if (r5 == 0) goto Ld1
            int r10 = r5.length
            if (r10 <= 0) goto Ld1
            androidx.transition.TransitionValues r10 = new androidx.transition.TransitionValues
            r10.<init>(r15)
            r16 = r9
            r17 = r11
            r9 = r23
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r11 = r9.mViewValues
            java.lang.Object r11 = r11.get(r15)
            androidx.transition.TransitionValues r11 = (androidx.transition.TransitionValues) r11
            if (r11 == 0) goto L95
            r9 = 0
        L7c:
            int r12 = r5.length
            if (r9 >= r12) goto L95
            java.util.Map<java.lang.String, java.lang.Object> r12 = r10.values
            r18 = r5
            r5 = r18[r9]
            r19 = r9
            java.util.Map<java.lang.String, java.lang.Object> r9 = r11.values
            java.lang.Object r9 = r9.get(r5)
            r12.put(r5, r9)
            int r9 = r19 + 1
            r5 = r18
            goto L7c
        L95:
            int r5 = r7.size()
            r9 = 0
        L9a:
            if (r9 >= r5) goto Lcf
            java.lang.Object r11 = r7.keyAt(r9)
            android.animation.Animator r11 = (android.animation.Animator) r11
            java.lang.Object r11 = r7.get(r11)
            androidx.transition.Transition$AnimationInfo r11 = (androidx.transition.Transition.AnimationInfo) r11
            androidx.transition.TransitionValues r12 = r11.mValues
            if (r12 == 0) goto Lc8
            android.view.View r12 = r11.mView
            if (r12 != r15) goto Lc8
            java.lang.String r12 = r11.mName
            r18 = r5
            java.lang.String r5 = r3.getName()
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto Lca
            androidx.transition.TransitionValues r5 = r11.mValues
            boolean r5 = r5.equals(r10)
            if (r5 == 0) goto Lca
            r5 = 0
            goto Ld7
        Lc8:
            r18 = r5
        Lca:
            int r9 = r9 + 1
            r5 = r18
            goto L9a
        Lcf:
            r5 = r14
            goto Ld7
        Ld1:
            r16 = r9
            r17 = r11
            r5 = r14
            r10 = 0
        Ld7:
            r14 = r5
            r5 = r10
            goto Le1
        Lda:
            r16 = r9
            r17 = r11
            android.view.View r15 = r2.view
            r5 = 0
        Le1:
            if (r14 == 0) goto L111
            androidx.transition.TransitionPropagation r9 = r3.mPropagation
            if (r9 == 0) goto Lf9
            long r9 = r9.getStartDelay(r6, r3, r2, r4)
            java.util.ArrayList<android.animation.Animator> r2 = r3.mAnimators
            int r2 = r2.size()
            int r4 = (int) r9
            r8.put(r2, r4)
            long r0 = java.lang.Math.min(r9, r0)
        Lf9:
            r9 = r0
            androidx.transition.Transition$AnimationInfo r0 = new androidx.transition.Transition$AnimationInfo
            java.lang.String r2 = r3.getName()
            androidx.transition.WindowIdImpl r4 = androidx.transition.ViewUtils.getWindowId(r6)
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r7.put(r14, r0)
            java.util.ArrayList<android.animation.Animator> r0 = r3.mAnimators
            r0.add(r14)
            r0 = r9
        L111:
            int r11 = r17 + 1
            r9 = r16
            goto L17
        L117:
            int r2 = r8.size()
            if (r2 == 0) goto L141
            r10 = 0
        L11e:
            int r2 = r8.size()
            if (r10 >= r2) goto L141
            int r2 = r8.keyAt(r10)
            java.util.ArrayList<android.animation.Animator> r4 = r3.mAnimators
            java.lang.Object r2 = r4.get(r2)
            android.animation.Animator r2 = (android.animation.Animator) r2
            int r4 = r8.valueAt(r10)
            long r4 = (long) r4
            long r4 = r4 - r0
            long r6 = r2.getStartDelay()
            long r4 = r4 + r6
            r2.setStartDelay(r4)
            int r10 = r10 + 1
            goto L11e
        L141:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void end() {
            r6 = this;
            int r0 = r6.mNumInstances
            r1 = 1
            int r0 = r0 - r1
            r6.mNumInstances = r0
            if (r0 != 0) goto L6a
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r0 = r6.mListeners
            r2 = 0
            if (r0 == 0) goto L2e
            int r0 = r0.size()
            if (r0 <= 0) goto L2e
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r0 = r6.mListeners
            java.lang.Object r0 = r0.clone()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r0.size()
            r4 = 0
        L20:
            if (r4 >= r3) goto L2e
            java.lang.Object r5 = r0.get(r4)
            androidx.transition.Transition$TransitionListener r5 = (androidx.transition.Transition.TransitionListener) r5
            r5.onTransitionEnd(r6)
            int r4 = r4 + 1
            goto L20
        L2e:
            r0 = 0
        L2f:
            androidx.transition.TransitionValuesMaps r3 = r6.mStartValues
            androidx.collection.LongSparseArray<android.view.View> r3 = r3.mItemIdValues
            int r3 = r3.size()
            if (r0 >= r3) goto L4b
            androidx.transition.TransitionValuesMaps r3 = r6.mStartValues
            androidx.collection.LongSparseArray<android.view.View> r3 = r3.mItemIdValues
            java.lang.Object r3 = r3.valueAt(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L48
            androidx.core.view.ViewCompat.setHasTransientState(r3, r2)
        L48:
            int r0 = r0 + 1
            goto L2f
        L4b:
            r0 = 0
        L4c:
            androidx.transition.TransitionValuesMaps r3 = r6.mEndValues
            androidx.collection.LongSparseArray<android.view.View> r3 = r3.mItemIdValues
            int r3 = r3.size()
            if (r0 >= r3) goto L68
            androidx.transition.TransitionValuesMaps r3 = r6.mEndValues
            androidx.collection.LongSparseArray<android.view.View> r3 = r3.mItemIdValues
            java.lang.Object r3 = r3.valueAt(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L65
            androidx.core.view.ViewCompat.setHasTransientState(r3, r2)
        L65:
            int r0 = r0 + 1
            goto L4c
        L68:
            r6.mEnded = r1
        L6a:
            return
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition excludeChildren(@androidx.annotation.IdRes int r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mTargetIdChildExcludes
            java.util.ArrayList r2 = r1.excludeId(r0, r2, r3)
            r1.mTargetIdChildExcludes = r2
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition excludeChildren(@androidx.annotation.NonNull android.view.View r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTargetChildExcludes
            java.util.ArrayList r2 = r1.excludeView(r0, r2, r3)
            r1.mTargetChildExcludes = r2
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition excludeChildren(@androidx.annotation.NonNull java.lang.Class<?> r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypeChildExcludes
            java.util.ArrayList r2 = r1.excludeType(r0, r2, r3)
            r1.mTargetTypeChildExcludes = r2
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition excludeTarget(@androidx.annotation.IdRes int r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mTargetIdExcludes
            java.util.ArrayList r2 = r1.excludeId(r0, r2, r3)
            r1.mTargetIdExcludes = r2
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition excludeTarget(@androidx.annotation.NonNull android.view.View r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTargetExcludes
            java.util.ArrayList r2 = r1.excludeView(r0, r2, r3)
            r1.mTargetExcludes = r2
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition excludeTarget(@androidx.annotation.NonNull java.lang.Class<?> r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypeExcludes
            java.util.ArrayList r2 = r1.excludeType(r0, r2, r3)
            r1.mTargetTypeExcludes = r2
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition excludeTarget(@androidx.annotation.NonNull java.lang.String r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.mTargetNameExcludes
            java.util.ArrayList r2 = excludeObject(r0, r2, r3)
            r1.mTargetNameExcludes = r2
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void forceToEnd(android.view.ViewGroup r5) {
            r4 = this;
            androidx.collection.ArrayMap r0 = getRunningAnimators()
            int r1 = r0.size()
            if (r5 == 0) goto L3d
            if (r1 != 0) goto Ld
            goto L3d
        Ld:
            androidx.transition.WindowIdImpl r5 = androidx.transition.ViewUtils.getWindowId(r5)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>(r0)
            r0.clear()
            int r1 = r1 + (-1)
        L1b:
            if (r1 < 0) goto L3d
            java.lang.Object r0 = r2.valueAt(r1)
            androidx.transition.Transition$AnimationInfo r0 = (androidx.transition.Transition.AnimationInfo) r0
            android.view.View r3 = r0.mView
            if (r3 == 0) goto L3a
            if (r5 == 0) goto L3a
            androidx.transition.WindowIdImpl r0 = r0.mWindowId
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r2.keyAt(r1)
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.end()
        L3a:
            int r1 = r1 + (-1)
            goto L1b
        L3d:
            return
    }

    public long getDuration() {
            r2 = this;
            long r0 = r2.mDuration
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.Rect getEpicenter() {
            r1 = this;
            androidx.transition.Transition$EpicenterCallback r0 = r1.mEpicenterCallback
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.graphics.Rect r0 = r0.onGetEpicenter(r1)
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.transition.Transition.EpicenterCallback getEpicenterCallback() {
            r1 = this;
            androidx.transition.Transition$EpicenterCallback r0 = r1.mEpicenterCallback
            return r0
    }

    @androidx.annotation.Nullable
    public android.animation.TimeInterpolator getInterpolator() {
            r1 = this;
            android.animation.TimeInterpolator r0 = r1.mInterpolator
            return r0
    }

    androidx.transition.TransitionValues getMatchedTransitionValues(android.view.View r6, boolean r7) {
            r5 = this;
            androidx.transition.TransitionSet r0 = r5.mParent
            if (r0 == 0) goto L9
            androidx.transition.TransitionValues r6 = r0.getMatchedTransitionValues(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList<androidx.transition.TransitionValues> r0 = r5.mStartValuesList
            goto L10
        Le:
            java.util.ArrayList<androidx.transition.TransitionValues> r0 = r5.mEndValuesList
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            androidx.transition.TransitionValues r4 = (androidx.transition.TransitionValues) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.view
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList<androidx.transition.TransitionValues> r6 = r5.mEndValuesList
            goto L36
        L34:
            java.util.ArrayList<androidx.transition.TransitionValues> r6 = r5.mStartValuesList
        L36:
            java.lang.Object r6 = r6.get(r3)
            androidx.transition.TransitionValues r6 = (androidx.transition.TransitionValues) r6
            return r6
        L3d:
            return r1
    }

    @androidx.annotation.NonNull
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.transition.PathMotion getPathMotion() {
            r1 = this;
            androidx.transition.PathMotion r0 = r1.mPathMotion
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.transition.TransitionPropagation getPropagation() {
            r1 = this;
            androidx.transition.TransitionPropagation r0 = r1.mPropagation
            return r0
    }

    public long getStartDelay() {
            r2 = this;
            long r0 = r2.mStartDelay
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<java.lang.Integer> getTargetIds() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mTargetIds
            return r0
    }

    @androidx.annotation.Nullable
    public java.util.List<java.lang.String> getTargetNames() {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.mTargetNames
            return r0
    }

    @androidx.annotation.Nullable
    public java.util.List<java.lang.Class<?>> getTargetTypes() {
            r1 = this;
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypes
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<android.view.View> getTargets() {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTargets
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.transition.TransitionValues getTransitionValues(@androidx.annotation.NonNull android.view.View r2, boolean r3) {
            r1 = this;
            androidx.transition.TransitionSet r0 = r1.mParent
            if (r0 == 0) goto L9
            androidx.transition.TransitionValues r2 = r0.getTransitionValues(r2, r3)
            return r2
        L9:
            if (r3 == 0) goto Le
            androidx.transition.TransitionValuesMaps r3 = r1.mStartValues
            goto L10
        Le:
            androidx.transition.TransitionValuesMaps r3 = r1.mEndValues
        L10:
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r3 = r3.mViewValues
            java.lang.Object r2 = r3.get(r2)
            androidx.transition.TransitionValues r2 = (androidx.transition.TransitionValues) r2
            return r2
    }

    public boolean isTransitionRequired(@androidx.annotation.Nullable androidx.transition.TransitionValues r7, @androidx.annotation.Nullable androidx.transition.TransitionValues r8) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L39
            if (r8 == 0) goto L39
            java.lang.String[] r1 = r6.getTransitionProperties()
            r2 = 1
            if (r1 == 0) goto L1c
            int r3 = r1.length
            r4 = 0
        Le:
            if (r4 >= r3) goto L39
            r5 = r1[r4]
            boolean r5 = isValueChanged(r7, r8, r5)
            if (r5 == 0) goto L19
            return r2
        L19:
            int r4 = r4 + 1
            goto Le
        L1c:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.values
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = isValueChanged(r7, r8, r3)
            if (r3 == 0) goto L26
            return r2
        L39:
            return r0
    }

    boolean isValidTarget(android.view.View r6) {
            r5 = this;
            int r0 = r6.getId()
            java.util.ArrayList<java.lang.Integer> r1 = r5.mTargetIdExcludes
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L14
            return r2
        L14:
            java.util.ArrayList<android.view.View> r1 = r5.mTargetExcludes
            if (r1 == 0) goto L1f
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L1f
            return r2
        L1f:
            java.util.ArrayList<java.lang.Class<?>> r1 = r5.mTargetTypeExcludes
            if (r1 == 0) goto L3c
            int r1 = r1.size()
            r3 = 0
        L28:
            if (r3 >= r1) goto L3c
            java.util.ArrayList<java.lang.Class<?>> r4 = r5.mTargetTypeExcludes
            java.lang.Object r4 = r4.get(r3)
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r4 = r4.isInstance(r6)
            if (r4 == 0) goto L39
            return r2
        L39:
            int r3 = r3 + 1
            goto L28
        L3c:
            java.util.ArrayList<java.lang.String> r1 = r5.mTargetNameExcludes
            if (r1 == 0) goto L53
            java.lang.String r1 = androidx.core.view.ViewCompat.getTransitionName(r6)
            if (r1 == 0) goto L53
            java.util.ArrayList<java.lang.String> r1 = r5.mTargetNameExcludes
            java.lang.String r3 = androidx.core.view.ViewCompat.getTransitionName(r6)
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L53
            return r2
        L53:
            java.util.ArrayList<java.lang.Integer> r1 = r5.mTargetIds
            int r1 = r1.size()
            r3 = 1
            if (r1 != 0) goto L79
            java.util.ArrayList<android.view.View> r1 = r5.mTargets
            int r1 = r1.size()
            if (r1 != 0) goto L79
            java.util.ArrayList<java.lang.Class<?>> r1 = r5.mTargetTypes
            if (r1 == 0) goto L6e
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L79
        L6e:
            java.util.ArrayList<java.lang.String> r1 = r5.mTargetNames
            if (r1 == 0) goto L78
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L79
        L78:
            return r3
        L79:
            java.util.ArrayList<java.lang.Integer> r1 = r5.mTargetIds
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lbd
            java.util.ArrayList<android.view.View> r0 = r5.mTargets
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L8e
            goto Lbd
        L8e:
            java.util.ArrayList<java.lang.String> r0 = r5.mTargetNames
            if (r0 == 0) goto L9d
            java.lang.String r1 = androidx.core.view.ViewCompat.getTransitionName(r6)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L9d
            return r3
        L9d:
            java.util.ArrayList<java.lang.Class<?>> r0 = r5.mTargetTypes
            if (r0 == 0) goto Lbc
            r0 = 0
        La2:
            java.util.ArrayList<java.lang.Class<?>> r1 = r5.mTargetTypes
            int r1 = r1.size()
            if (r0 >= r1) goto Lbc
            java.util.ArrayList<java.lang.Class<?>> r1 = r5.mTargetTypes
            java.lang.Object r1 = r1.get(r0)
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isInstance(r6)
            if (r1 == 0) goto Lb9
            return r3
        Lb9:
            int r0 = r0 + 1
            goto La2
        Lbc:
            return r2
        Lbd:
            return r3
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(android.view.View r6) {
            r5 = this;
            boolean r0 = r5.mEnded
            if (r0 != 0) goto L59
            androidx.collection.ArrayMap r0 = getRunningAnimators()
            int r1 = r0.size()
            androidx.transition.WindowIdImpl r6 = androidx.transition.ViewUtils.getWindowId(r6)
            r2 = 1
            int r1 = r1 - r2
        L12:
            if (r1 < 0) goto L32
            java.lang.Object r3 = r0.valueAt(r1)
            androidx.transition.Transition$AnimationInfo r3 = (androidx.transition.Transition.AnimationInfo) r3
            android.view.View r4 = r3.mView
            if (r4 == 0) goto L2f
            androidx.transition.WindowIdImpl r3 = r3.mWindowId
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r0.keyAt(r1)
            android.animation.Animator r3 = (android.animation.Animator) r3
            androidx.transition.AnimatorUtils.pause(r3)
        L2f:
            int r1 = r1 + (-1)
            goto L12
        L32:
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r6 = r5.mListeners
            if (r6 == 0) goto L57
            int r6 = r6.size()
            if (r6 <= 0) goto L57
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r6 = r5.mListeners
            java.lang.Object r6 = r6.clone()
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r0 = r6.size()
            r1 = 0
        L49:
            if (r1 >= r0) goto L57
            java.lang.Object r3 = r6.get(r1)
            androidx.transition.Transition$TransitionListener r3 = (androidx.transition.Transition.TransitionListener) r3
            r3.onTransitionPause(r5)
            int r1 = r1 + 1
            goto L49
        L57:
            r5.mPaused = r2
        L59:
            return
    }

    void playTransition(android.view.ViewGroup r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.mStartValuesList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.mEndValuesList = r0
            androidx.transition.TransitionValuesMaps r0 = r10.mStartValues
            androidx.transition.TransitionValuesMaps r1 = r10.mEndValues
            r10.matchStartAndEnd(r0, r1)
            androidx.collection.ArrayMap r0 = getRunningAnimators()
            int r1 = r0.size()
            androidx.transition.WindowIdImpl r2 = androidx.transition.ViewUtils.getWindowId(r11)
            r3 = 1
            int r1 = r1 - r3
        L23:
            if (r1 < 0) goto L7f
            java.lang.Object r4 = r0.keyAt(r1)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L7c
            java.lang.Object r5 = r0.get(r4)
            androidx.transition.Transition$AnimationInfo r5 = (androidx.transition.Transition.AnimationInfo) r5
            if (r5 == 0) goto L7c
            android.view.View r6 = r5.mView
            if (r6 == 0) goto L7c
            androidx.transition.WindowIdImpl r6 = r5.mWindowId
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L7c
            androidx.transition.TransitionValues r6 = r5.mValues
            android.view.View r7 = r5.mView
            androidx.transition.TransitionValues r8 = r10.getTransitionValues(r7, r3)
            androidx.transition.TransitionValues r9 = r10.getMatchedTransitionValues(r7, r3)
            if (r8 != 0) goto L5c
            if (r9 != 0) goto L5c
            androidx.transition.TransitionValuesMaps r9 = r10.mEndValues
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r9 = r9.mViewValues
            java.lang.Object r7 = r9.get(r7)
            r9 = r7
            androidx.transition.TransitionValues r9 = (androidx.transition.TransitionValues) r9
        L5c:
            if (r8 != 0) goto L60
            if (r9 == 0) goto L7c
        L60:
            androidx.transition.Transition r5 = r5.mTransition
            boolean r5 = r5.isTransitionRequired(r6, r9)
            if (r5 == 0) goto L7c
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L79
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L75
            goto L79
        L75:
            r0.remove(r4)
            goto L7c
        L79:
            r4.cancel()
        L7c:
            int r1 = r1 + (-1)
            goto L23
        L7f:
            androidx.transition.TransitionValuesMaps r6 = r10.mStartValues
            androidx.transition.TransitionValuesMaps r7 = r10.mEndValues
            java.util.ArrayList<androidx.transition.TransitionValues> r8 = r10.mStartValuesList
            java.util.ArrayList<androidx.transition.TransitionValues> r9 = r10.mEndValuesList
            r4 = r10
            r5 = r11
            r4.createAnimators(r5, r6, r7, r8, r9)
            r10.runAnimators()
            return
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition removeListener(@androidx.annotation.NonNull androidx.transition.Transition.TransitionListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r0 = r1.mListeners
            if (r0 != 0) goto L5
            goto L13
        L5:
            r0.remove(r2)
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r2 = r1.mListeners
            int r2 = r2.size()
            if (r2 != 0) goto L13
            r2 = 0
            r1.mListeners = r2
        L13:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition removeTarget(@androidx.annotation.IdRes int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            java.util.ArrayList<java.lang.Integer> r0 = r1.mTargetIds
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
        Lb:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition removeTarget(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTargets
            r0.remove(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition removeTarget(@androidx.annotation.NonNull java.lang.Class<?> r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypes
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition removeTarget(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.mTargetNames
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(android.view.View r6) {
            r5 = this;
            boolean r0 = r5.mPaused
            if (r0 == 0) goto L5e
            boolean r0 = r5.mEnded
            r1 = 0
            if (r0 != 0) goto L5c
            androidx.collection.ArrayMap r0 = getRunningAnimators()
            int r2 = r0.size()
            androidx.transition.WindowIdImpl r6 = androidx.transition.ViewUtils.getWindowId(r6)
            int r2 = r2 + (-1)
        L17:
            if (r2 < 0) goto L37
            java.lang.Object r3 = r0.valueAt(r2)
            androidx.transition.Transition$AnimationInfo r3 = (androidx.transition.Transition.AnimationInfo) r3
            android.view.View r4 = r3.mView
            if (r4 == 0) goto L34
            androidx.transition.WindowIdImpl r3 = r3.mWindowId
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L34
            java.lang.Object r3 = r0.keyAt(r2)
            android.animation.Animator r3 = (android.animation.Animator) r3
            androidx.transition.AnimatorUtils.resume(r3)
        L34:
            int r2 = r2 + (-1)
            goto L17
        L37:
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r6 = r5.mListeners
            if (r6 == 0) goto L5c
            int r6 = r6.size()
            if (r6 <= 0) goto L5c
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r6 = r5.mListeners
            java.lang.Object r6 = r6.clone()
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r0 = r6.size()
            r2 = 0
        L4e:
            if (r2 >= r0) goto L5c
            java.lang.Object r3 = r6.get(r2)
            androidx.transition.Transition$TransitionListener r3 = (androidx.transition.Transition.TransitionListener) r3
            r3.onTransitionResume(r5)
            int r2 = r2 + 1
            goto L4e
        L5c:
            r5.mPaused = r1
        L5e:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void runAnimators() {
            r4 = this;
            r4.start()
            androidx.collection.ArrayMap r0 = getRunningAnimators()
            java.util.ArrayList<android.animation.Animator> r1 = r4.mAnimators
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            android.animation.Animator r2 = (android.animation.Animator) r2
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto Ld
            r4.start()
            r4.runAnimator(r2, r0)
            goto Ld
        L26:
            java.util.ArrayList<android.animation.Animator> r0 = r4.mAnimators
            r0.clear()
            r4.end()
            return
    }

    void setCanRemoveViews(boolean r1) {
            r0 = this;
            r0.mCanRemoveViews = r1
            return
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition setDuration(long r1) {
            r0 = this;
            r0.mDuration = r1
            return r0
    }

    public void setEpicenterCallback(@androidx.annotation.Nullable androidx.transition.Transition.EpicenterCallback r1) {
            r0 = this;
            r0.mEpicenterCallback = r1
            return
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition setInterpolator(@androidx.annotation.Nullable android.animation.TimeInterpolator r1) {
            r0 = this;
            r0.mInterpolator = r1
            return r0
    }

    public void setMatchOrder(int... r3) {
            r2 = this;
            if (r3 == 0) goto L34
            int r0 = r3.length
            if (r0 != 0) goto L6
            goto L34
        L6:
            r0 = 0
        L7:
            int r1 = r3.length
            if (r0 >= r1) goto L2b
            r1 = r3[r0]
            boolean r1 = isValidMatch(r1)
            if (r1 == 0) goto L23
            boolean r1 = alreadyContains(r3, r0)
            if (r1 != 0) goto L1b
            int r0 = r0 + 1
            goto L7
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "matches contains a duplicate value"
            r3.<init>(r0)
            throw r3
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "matches contains invalid value"
            r3.<init>(r0)
            throw r3
        L2b:
            java.lang.Object r3 = r3.clone()
            int[] r3 = (int[]) r3
            r2.mMatchOrder = r3
            return
        L34:
            int[] r3 = androidx.transition.Transition.DEFAULT_MATCH_ORDER
            r2.mMatchOrder = r3
            return
    }

    public void setPathMotion(@androidx.annotation.Nullable androidx.transition.PathMotion r1) {
            r0 = this;
            if (r1 != 0) goto L7
            androidx.transition.PathMotion r1 = androidx.transition.Transition.STRAIGHT_PATH_MOTION
            r0.mPathMotion = r1
            return
        L7:
            r0.mPathMotion = r1
            return
    }

    public void setPropagation(@androidx.annotation.Nullable androidx.transition.TransitionPropagation r1) {
            r0 = this;
            r0.mPropagation = r1
            return
    }

    androidx.transition.Transition setSceneRoot(android.view.ViewGroup r1) {
            r0 = this;
            r0.mSceneRoot = r1
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.transition.Transition setStartDelay(long r1) {
            r0 = this;
            r0.mStartDelay = r1
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void start() {
            r5 = this;
            int r0 = r5.mNumInstances
            if (r0 != 0) goto L2c
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r0 = r5.mListeners
            r1 = 0
            if (r0 == 0) goto L2a
            int r0 = r0.size()
            if (r0 <= 0) goto L2a
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r0 = r5.mListeners
            java.lang.Object r0 = r0.clone()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
            r3 = 0
        L1c:
            if (r3 >= r2) goto L2a
            java.lang.Object r4 = r0.get(r3)
            androidx.transition.Transition$TransitionListener r4 = (androidx.transition.Transition.TransitionListener) r4
            r4.onTransitionStart(r5)
            int r3 = r3 + 1
            goto L1c
        L2a:
            r5.mEnded = r1
        L2c:
            int r0 = r5.mNumInstances
            int r0 = r0 + 1
            r5.mNumInstances = r0
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r0 = r1.toString(r0)
            return r0
    }

    java.lang.String toString(java.lang.String r8) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.Class r8 = r7.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r0.append(r8)
            java.lang.String r8 = "@"
            r0.append(r8)
            int r8 = r7.hashCode()
            java.lang.String r8 = java.lang.Integer.toHexString(r8)
            r0.append(r8)
            java.lang.String r8 = ": "
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            long r0 = r7.mDuration
            java.lang.String r2 = ") "
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L4f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = "dur("
            r0.append(r8)
            long r5 = r7.mDuration
            r0.append(r5)
            r0.append(r2)
            java.lang.String r8 = r0.toString()
        L4f:
            long r0 = r7.mStartDelay
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L6e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = "dly("
            r0.append(r8)
            long r3 = r7.mStartDelay
            r0.append(r3)
            r0.append(r2)
            java.lang.String r8 = r0.toString()
        L6e:
            android.animation.TimeInterpolator r0 = r7.mInterpolator
            if (r0 == 0) goto L8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = "interp("
            r0.append(r8)
            android.animation.TimeInterpolator r8 = r7.mInterpolator
            r0.append(r8)
            r0.append(r2)
            java.lang.String r8 = r0.toString()
        L8b:
            java.util.ArrayList<java.lang.Integer> r0 = r7.mTargetIds
            int r0 = r0.size()
            if (r0 > 0) goto L9d
            java.util.ArrayList<android.view.View> r0 = r7.mTargets
            int r0 = r0.size()
            if (r0 <= 0) goto L9c
            goto L9d
        L9c:
            return r8
        L9d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = "tgts("
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.util.ArrayList<java.lang.Integer> r0 = r7.mTargetIds
            int r0 = r0.size()
            java.lang.String r1 = ", "
            r2 = 0
            if (r0 <= 0) goto Leb
            r0 = 0
        Lba:
            java.util.ArrayList<java.lang.Integer> r3 = r7.mTargetIds
            int r3 = r3.size()
            if (r0 >= r3) goto Leb
            if (r0 <= 0) goto Ld3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r1)
            java.lang.String r8 = r3.toString()
        Ld3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.util.ArrayList<java.lang.Integer> r8 = r7.mTargetIds
            java.lang.Object r8 = r8.get(r0)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            int r0 = r0 + 1
            goto Lba
        Leb:
            java.util.ArrayList<android.view.View> r0 = r7.mTargets
            int r0 = r0.size()
            if (r0 <= 0) goto L124
        Lf3:
            java.util.ArrayList<android.view.View> r0 = r7.mTargets
            int r0 = r0.size()
            if (r2 >= r0) goto L124
            if (r2 <= 0) goto L10c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r1)
            java.lang.String r8 = r0.toString()
        L10c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.util.ArrayList<android.view.View> r8 = r7.mTargets
            java.lang.Object r8 = r8.get(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            int r2 = r2 + 1
            goto Lf3
        L124:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = ")"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            return r8
    }
}
