package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ViewCompat {
    private static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = null;
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;

    @java.lang.Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;

    @java.lang.Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;

    @java.lang.Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;

    @java.lang.Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_NONE = 0;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;

    @java.lang.Deprecated
    public static final int LAYOUT_DIRECTION_INHERIT = 2;

    @java.lang.Deprecated
    public static final int LAYOUT_DIRECTION_LOCALE = 3;

    @java.lang.Deprecated
    public static final int LAYOUT_DIRECTION_LTR = 0;

    @java.lang.Deprecated
    public static final int LAYOUT_DIRECTION_RTL = 1;

    @java.lang.Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;

    @java.lang.Deprecated
    public static final int MEASURED_SIZE_MASK = 16777215;

    @java.lang.Deprecated
    public static final int MEASURED_STATE_MASK = -16777216;

    @java.lang.Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;
    private static final androidx.core.view.OnReceiveContentViewBehavior NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = null;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    private static final java.lang.String TAG = "ViewCompat";
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;
    private static boolean sAccessibilityDelegateCheckFailed;
    private static java.lang.reflect.Field sAccessibilityDelegateField;
    private static final androidx.core.view.ViewCompat.AccessibilityPaneVisibilityManager sAccessibilityPaneVisibilityManager = null;
    private static java.lang.reflect.Method sChildrenDrawingOrderMethod;
    private static java.lang.reflect.Method sDispatchFinishTemporaryDetach;
    private static java.lang.reflect.Method sDispatchStartTemporaryDetach;
    private static boolean sTempDetachBound;
    private static java.lang.ThreadLocal<android.graphics.Rect> sThreadLocalRect;
    private static java.util.WeakHashMap<android.view.View, java.lang.String> sTransitionNameMap;
    private static java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> sViewPropertyAnimatorMap;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AccessibilityPaneVisibilityManager implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.View.OnAttachStateChangeListener {
        private final java.util.WeakHashMap<android.view.View, java.lang.Boolean> mPanesToVisible;

        AccessibilityPaneVisibilityManager() {
                r1 = this;
                r1.<init>()
                java.util.WeakHashMap r0 = new java.util.WeakHashMap
                r0.<init>()
                r1.mPanesToVisible = r0
                return
        }

        private void checkPaneVisibility(java.util.Map.Entry<android.view.View, java.lang.Boolean> r4) {
                r3 = this;
                java.lang.Object r0 = r4.getKey()
                android.view.View r0 = (android.view.View) r0
                java.lang.Object r1 = r4.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                boolean r2 = r0.isShown()
                if (r2 == 0) goto L1e
                int r2 = r0.getWindowVisibility()
                if (r2 != 0) goto L1e
                r2 = 1
                goto L1f
            L1e:
                r2 = 0
            L1f:
                if (r1 == r2) goto L32
                if (r2 == 0) goto L26
                r1 = 16
                goto L28
            L26:
                r1 = 32
            L28:
                androidx.core.view.ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(r0, r1)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                r4.setValue(r0)
            L32:
                return
        }

        private void registerForLayoutCallback(android.view.View r1) {
                r0 = this;
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.addOnGlobalLayoutListener(r0)
                return
        }

        private void unregisterForLayoutCallback(android.view.View r1) {
                r0 = this;
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnGlobalLayoutListener(r0)
                return
        }

        void addAccessibilityPane(android.view.View r3) {
                r2 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r2.mPanesToVisible
                boolean r1 = r3.isShown()
                if (r1 == 0) goto L10
                int r1 = r3.getWindowVisibility()
                if (r1 != 0) goto L10
                r1 = 1
                goto L11
            L10:
                r1 = 0
            L11:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.put(r3, r1)
                r3.addOnAttachStateChangeListener(r2)
                boolean r0 = r3.isAttachedToWindow()
                if (r0 == 0) goto L24
                r2.registerForLayoutCallback(r3)
            L24:
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 >= r1) goto L20
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r2.mPanesToVisible
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L10:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                r2.checkPaneVisibility(r1)
                goto L10
            L20:
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                r0.registerForLayoutCallback(r1)
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r1) {
                r0 = this;
                return
        }

        void removeAccessibilityPane(android.view.View r2) {
                r1 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r1.mPanesToVisible
                r0.remove(r2)
                r2.removeOnAttachStateChangeListener(r1)
                r1.unregisterForLayoutCallback(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class AccessibilityViewProperty<T> {
        private final int mContentChangeType;
        private final int mFrameworkMinimumSdk;
        private final int mTagKey;
        private final java.lang.Class<T> mType;

        AccessibilityViewProperty(int r2, java.lang.Class<T> r3, int r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0, r4)
                return
        }

        AccessibilityViewProperty(int r1, java.lang.Class<T> r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.mTagKey = r1
                r0.mType = r2
                r0.mContentChangeType = r3
                r0.mFrameworkMinimumSdk = r4
                return
        }

        private boolean frameworkAvailable() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                int r1 = r2.mFrameworkMinimumSdk
                if (r0 < r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        boolean booleanNullToFalseEquals(java.lang.Boolean r3, java.lang.Boolean r4) {
                r2 = this;
                r0 = 0
                r1 = 1
                if (r3 == 0) goto Lc
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto Lc
                r3 = 1
                goto Ld
            Lc:
                r3 = 0
            Ld:
                if (r4 == 0) goto L17
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L17
                r4 = 1
                goto L18
            L17:
                r4 = 0
            L18:
                if (r3 != r4) goto L1b
                return r1
            L1b:
                return r0
        }

        abstract T frameworkGet(android.view.View r1);

        abstract void frameworkSet(android.view.View r1, T r2);

        T get(android.view.View r2) {
                r1 = this;
                boolean r0 = r1.frameworkAvailable()
                if (r0 == 0) goto Lb
                java.lang.Object r2 = r1.frameworkGet(r2)
                return r2
            Lb:
                int r0 = r1.mTagKey
                java.lang.Object r2 = r2.getTag(r0)
                java.lang.Class<T> r0 = r1.mType
                boolean r0 = r0.isInstance(r2)
                if (r0 == 0) goto L1a
                return r2
            L1a:
                r2 = 0
                return r2
        }

        void set(android.view.View r2, T r3) {
                r1 = this;
                boolean r0 = r1.frameworkAvailable()
                if (r0 == 0) goto La
                r1.frameworkSet(r2, r3)
                return
            La:
                java.lang.Object r0 = r1.get(r2)
                boolean r0 = r1.shouldUpdate(r0, r3)
                if (r0 == 0) goto L21
                androidx.core.view.ViewCompat.ensureAccessibilityDelegateCompat(r2)
                int r0 = r1.mTagKey
                r2.setTag(r0, r3)
                int r3 = r1.mContentChangeType
                androidx.core.view.ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(r2, r3)
            L21:
                return
        }

        boolean shouldUpdate(T r1, T r2) {
                r0 = this;
                boolean r1 = r2.equals(r1)
                r1 = r1 ^ 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(20)
    static class Api20Impl {
        private Api20Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.view.WindowInsets dispatchApplyWindowInsets(android.view.View r0, android.view.WindowInsets r1) {
                android.view.WindowInsets r0 = r0.dispatchApplyWindowInsets(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.view.WindowInsets onApplyWindowInsets(android.view.View r0, android.view.WindowInsets r1) {
                android.view.WindowInsets r0 = r0.onApplyWindowInsets(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static void requestApplyInsets(android.view.View r0) {
                r0.requestApplyInsets()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    private static class Api21Impl {


        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void callCompatInsetAnimationCallback(@androidx.annotation.NonNull android.view.WindowInsets r1, @androidx.annotation.NonNull android.view.View r2) {
                int r0 = androidx.core.R.id.tag_window_insets_animation_callback
                java.lang.Object r0 = r2.getTag(r0)
                android.view.View$OnApplyWindowInsetsListener r0 = (android.view.View.OnApplyWindowInsetsListener) r0
                if (r0 == 0) goto Ld
                r0.onApplyWindowInsets(r2, r1)
            Ld:
                return
        }

        @androidx.annotation.DoNotInline
        static androidx.core.view.WindowInsetsCompat computeSystemWindowInsets(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
                android.view.WindowInsets r0 = r2.toWindowInsets()
                if (r0 == 0) goto Lf
                android.view.WindowInsets r2 = r1.computeSystemWindowInsets(r0, r3)
                androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r2, r1)
                return r1
            Lf:
                r3.setEmpty()
                return r2
        }

        @androidx.annotation.DoNotInline
        static boolean dispatchNestedFling(@androidx.annotation.NonNull android.view.View r0, float r1, float r2, boolean r3) {
                boolean r0 = r0.dispatchNestedFling(r1, r2, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean dispatchNestedPreFling(@androidx.annotation.NonNull android.view.View r0, float r1, float r2) {
                boolean r0 = r0.dispatchNestedPreFling(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean dispatchNestedPreScroll(android.view.View r0, int r1, int r2, int[] r3, int[] r4) {
                boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean dispatchNestedScroll(android.view.View r0, int r1, int r2, int r3, int r4, int[] r5) {
                boolean r0 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.content.res.ColorStateList getBackgroundTintList(android.view.View r0) {
                android.content.res.ColorStateList r0 = r0.getBackgroundTintList()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.graphics.PorterDuff.Mode getBackgroundTintMode(android.view.View r0) {
                android.graphics.PorterDuff$Mode r0 = r0.getBackgroundTintMode()
                return r0
        }

        @androidx.annotation.DoNotInline
        static float getElevation(android.view.View r0) {
                float r0 = r0.getElevation()
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(@androidx.annotation.NonNull android.view.View r0) {
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.getRootWindowInsets(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getTransitionName(android.view.View r0) {
                java.lang.String r0 = r0.getTransitionName()
                return r0
        }

        @androidx.annotation.DoNotInline
        static float getTranslationZ(android.view.View r0) {
                float r0 = r0.getTranslationZ()
                return r0
        }

        @androidx.annotation.DoNotInline
        static float getZ(@androidx.annotation.NonNull android.view.View r0) {
                float r0 = r0.getZ()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean hasNestedScrollingParent(android.view.View r0) {
                boolean r0 = r0.hasNestedScrollingParent()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean isImportantForAccessibility(android.view.View r0) {
                boolean r0 = r0.isImportantForAccessibility()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean isNestedScrollingEnabled(android.view.View r0) {
                boolean r0 = r0.isNestedScrollingEnabled()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setBackgroundTintList(android.view.View r0, android.content.res.ColorStateList r1) {
                r0.setBackgroundTintList(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setBackgroundTintMode(android.view.View r0, android.graphics.PorterDuff.Mode r1) {
                r0.setBackgroundTintMode(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setElevation(android.view.View r0, float r1) {
                r0.setElevation(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setNestedScrollingEnabled(android.view.View r0, boolean r1) {
                r0.setNestedScrollingEnabled(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setOnApplyWindowInsetsListener(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable androidx.core.view.OnApplyWindowInsetsListener r3) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 >= r1) goto Lb
                int r0 = androidx.core.R.id.tag_on_apply_window_listener
                r2.setTag(r0, r3)
            Lb:
                if (r3 != 0) goto L19
                int r3 = androidx.core.R.id.tag_window_insets_animation_callback
                java.lang.Object r3 = r2.getTag(r3)
                android.view.View$OnApplyWindowInsetsListener r3 = (android.view.View.OnApplyWindowInsetsListener) r3
                r2.setOnApplyWindowInsetsListener(r3)
                return
            L19:
                androidx.core.view.ViewCompat$Api21Impl$1 r0 = new androidx.core.view.ViewCompat$Api21Impl$1
                r0.<init>(r2, r3)
                r2.setOnApplyWindowInsetsListener(r0)
                return
        }

        @androidx.annotation.DoNotInline
        static void setTransitionName(android.view.View r0, java.lang.String r1) {
                r0.setTransitionName(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setTranslationZ(android.view.View r0, float r1) {
                r0.setTranslationZ(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setZ(@androidx.annotation.NonNull android.view.View r0, float r1) {
                r0.setZ(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static boolean startNestedScroll(android.view.View r0, int r1) {
                boolean r0 = r0.startNestedScroll(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static void stopNestedScroll(android.view.View r0) {
                r0.stopNestedScroll()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    private static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(@androidx.annotation.NonNull android.view.View r1) {
                android.view.WindowInsets r0 = r1.getRootWindowInsets()
                if (r0 != 0) goto L8
                r1 = 0
                return r1
            L8:
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                r0.setRootWindowInsets(r0)
                android.view.View r1 = r1.getRootView()
                r0.copyRootViewBounds(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getScrollIndicators(@androidx.annotation.NonNull android.view.View r0) {
                int r0 = r0.getScrollIndicators()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setScrollIndicators(@androidx.annotation.NonNull android.view.View r0, int r1) {
                r0.setScrollIndicators(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setScrollIndicators(@androidx.annotation.NonNull android.view.View r0, int r1, int r2) {
                r0.setScrollIndicators(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void cancelDragAndDrop(@androidx.annotation.NonNull android.view.View r0) {
                r0.cancelDragAndDrop()
                return
        }

        @androidx.annotation.DoNotInline
        static void dispatchFinishTemporaryDetach(android.view.View r0) {
                r0.dispatchFinishTemporaryDetach()
                return
        }

        @androidx.annotation.DoNotInline
        static void dispatchStartTemporaryDetach(android.view.View r0) {
                r0.dispatchStartTemporaryDetach()
                return
        }

        @androidx.annotation.DoNotInline
        static void setPointerIcon(@androidx.annotation.NonNull android.view.View r0, android.view.PointerIcon r1) {
                r0.setPointerIcon(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static boolean startDragAndDrop(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Nullable android.content.ClipData r1, @androidx.annotation.NonNull android.view.View.DragShadowBuilder r2, @androidx.annotation.Nullable java.lang.Object r3, int r4) {
                boolean r0 = r0.startDragAndDrop(r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.DoNotInline
        static void updateDragShadow(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull android.view.View.DragShadowBuilder r1) {
                r0.updateDragShadow(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(26)
    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void addKeyboardNavigationClusters(@androidx.annotation.NonNull android.view.View r0, java.util.Collection<android.view.View> r1, int r2) {
                r0.addKeyboardNavigationClusters(r1, r2)
                return
        }

        @androidx.annotation.DoNotInline
        public static android.view.autofill.AutofillId getAutofillId(android.view.View r0) {
                android.view.autofill.AutofillId r0 = r0.getAutofillId()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getImportantForAutofill(android.view.View r0) {
                int r0 = r0.getImportantForAutofill()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getNextClusterForwardId(@androidx.annotation.NonNull android.view.View r0) {
                int r0 = r0.getNextClusterForwardId()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean hasExplicitFocusable(@androidx.annotation.NonNull android.view.View r0) {
                boolean r0 = r0.hasExplicitFocusable()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean isFocusedByDefault(@androidx.annotation.NonNull android.view.View r0) {
                boolean r0 = r0.isFocusedByDefault()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean isImportantForAutofill(android.view.View r0) {
                boolean r0 = r0.isImportantForAutofill()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean isKeyboardNavigationCluster(@androidx.annotation.NonNull android.view.View r0) {
                boolean r0 = r0.isKeyboardNavigationCluster()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.view.View keyboardNavigationClusterSearch(@androidx.annotation.NonNull android.view.View r0, android.view.View r1, int r2) {
                android.view.View r0 = r0.keyboardNavigationClusterSearch(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean restoreDefaultFocus(@androidx.annotation.NonNull android.view.View r0) {
                boolean r0 = r0.restoreDefaultFocus()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setAutofillHints(@androidx.annotation.NonNull android.view.View r0, java.lang.String... r1) {
                r0.setAutofillHints(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setFocusedByDefault(@androidx.annotation.NonNull android.view.View r0, boolean r1) {
                r0.setFocusedByDefault(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setImportantForAutofill(android.view.View r0, int r1) {
                r0.setImportantForAutofill(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setKeyboardNavigationCluster(@androidx.annotation.NonNull android.view.View r0, boolean r1) {
                r0.setKeyboardNavigationCluster(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setNextClusterForwardId(android.view.View r0, int r1) {
                r0.setNextClusterForwardId(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setTooltipText(@androidx.annotation.NonNull android.view.View r0, java.lang.CharSequence r1) {
                r0.setTooltipText(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void addOnUnhandledKeyEventListener(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r3) {
                int r0 = androidx.core.R.id.tag_unhandled_key_listeners
                java.lang.Object r1 = r2.getTag(r0)
                androidx.collection.SimpleArrayMap r1 = (androidx.collection.SimpleArrayMap) r1
                if (r1 != 0) goto L12
                androidx.collection.SimpleArrayMap r1 = new androidx.collection.SimpleArrayMap
                r1.<init>()
                r2.setTag(r0, r1)
            L12:
                java.util.Objects.requireNonNull(r3)
                androidx.core.view.i0 r0 = new androidx.core.view.i0
                r0.<init>(r3)
                r1.put(r3, r0)
                r2.addOnUnhandledKeyEventListener(r0)
                return
        }

        @androidx.annotation.DoNotInline
        static java.lang.CharSequence getAccessibilityPaneTitle(android.view.View r0) {
                java.lang.CharSequence r0 = r0.getAccessibilityPaneTitle()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean isAccessibilityHeading(android.view.View r0) {
                boolean r0 = r0.isAccessibilityHeading()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean isScreenReaderFocusable(android.view.View r0) {
                boolean r0 = r0.isScreenReaderFocusable()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void removeOnUnhandledKeyEventListener(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r2) {
                int r0 = androidx.core.R.id.tag_unhandled_key_listeners
                java.lang.Object r0 = r1.getTag(r0)
                androidx.collection.SimpleArrayMap r0 = (androidx.collection.SimpleArrayMap) r0
                if (r0 != 0) goto Lb
                goto L16
            Lb:
                java.lang.Object r2 = r0.get(r2)
                android.view.View$OnUnhandledKeyEventListener r2 = (android.view.View.OnUnhandledKeyEventListener) r2
                if (r2 == 0) goto L16
                r1.removeOnUnhandledKeyEventListener(r2)
            L16:
                return
        }

        @androidx.annotation.DoNotInline
        static <T> T requireViewById(android.view.View r0, int r1) {
                android.view.View r0 = r0.requireViewById(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setAccessibilityHeading(android.view.View r0, boolean r1) {
                r0.setAccessibilityHeading(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setAccessibilityPaneTitle(android.view.View r0, java.lang.CharSequence r1) {
                r0.setAccessibilityPaneTitle(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setAutofillId(android.view.View r0, androidx.core.view.autofill.AutofillIdCompat r1) {
                if (r1 != 0) goto L4
                r1 = 0
                goto L8
            L4:
                android.view.autofill.AutofillId r1 = r1.toAutofillId()
            L8:
                r0.setAutofillId(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setScreenReaderFocusable(android.view.View r0, boolean r1) {
                r0.setScreenReaderFocusable(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.view.View.AccessibilityDelegate getAccessibilityDelegate(android.view.View r0) {
                android.view.View$AccessibilityDelegate r0 = r0.getAccessibilityDelegate()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.view.contentcapture.ContentCaptureSession getContentCaptureSession(android.view.View r0) {
                android.view.contentcapture.ContentCaptureSession r0 = r0.getContentCaptureSession()
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.util.List<android.graphics.Rect> getSystemGestureExclusionRects(android.view.View r0) {
                java.util.List r0 = r0.getSystemGestureExclusionRects()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void saveAttributeDataForStyleable(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull int[] r2, @androidx.annotation.Nullable android.util.AttributeSet r3, @androidx.annotation.NonNull android.content.res.TypedArray r4, int r5, int r6) {
                r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
                return
        }

        @androidx.annotation.DoNotInline
        static void setContentCaptureSession(android.view.View r0, androidx.core.view.contentcapture.ContentCaptureSessionCompat r1) {
                if (r1 != 0) goto L4
                r1 = 0
                goto L8
            L4:
                android.view.contentcapture.ContentCaptureSession r1 = r1.toContentCaptureSession()
            L8:
                r0.setContentCaptureSession(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setSystemGestureExclusionRects(android.view.View r0, java.util.List<android.graphics.Rect> r1) {
                r0.setSystemGestureExclusionRects(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(30)
    private static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static int getImportantForContentCapture(android.view.View r0) {
                int r0 = r0.getImportantForContentCapture()
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.lang.CharSequence getStateDescription(android.view.View r0) {
                java.lang.CharSequence r0 = r0.getStateDescription()
                return r0
        }

        @androidx.annotation.Nullable
        public static androidx.core.view.WindowInsetsControllerCompat getWindowInsetsController(@androidx.annotation.NonNull android.view.View r0) {
                android.view.WindowInsetsController r0 = r0.getWindowInsetsController()
                if (r0 == 0) goto Lb
                androidx.core.view.WindowInsetsControllerCompat r0 = androidx.core.view.WindowInsetsControllerCompat.toWindowInsetsControllerCompat(r0)
                return r0
            Lb:
                r0 = 0
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean isImportantForContentCapture(android.view.View r0) {
                boolean r0 = r0.isImportantForContentCapture()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setImportantForContentCapture(android.view.View r0, int r1) {
                r0.setImportantForContentCapture(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setStateDescription(android.view.View r0, java.lang.CharSequence r1) {
                r0.setStateDescription(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(31)
    private static final class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static java.lang.String[] getReceiveContentMimeTypes(@androidx.annotation.NonNull android.view.View r0) {
                java.lang.String[] r0 = r0.getReceiveContentMimeTypes()
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static androidx.core.view.ContentInfoCompat performReceiveContent(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull androidx.core.view.ContentInfoCompat r2) {
                android.view.ContentInfo r0 = r2.toContentInfo()
                android.view.ContentInfo r1 = r1.performReceiveContent(r0)
                if (r1 != 0) goto Lc
                r1 = 0
                return r1
            Lc:
                if (r1 != r0) goto Lf
                return r2
            Lf:
                androidx.core.view.ContentInfoCompat r1 = androidx.core.view.ContentInfoCompat.toContentInfoCompat(r1)
                return r1
        }

        @androidx.annotation.DoNotInline
        public static void setOnReceiveContentListener(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.String[] r2, @androidx.annotation.Nullable androidx.core.view.OnReceiveContentListener r3) {
                if (r3 != 0) goto L7
                r3 = 0
                r1.setOnReceiveContentListener(r2, r3)
                return
            L7:
                androidx.core.view.ViewCompat$OnReceiveContentListenerAdapter r0 = new androidx.core.view.ViewCompat$OnReceiveContentListenerAdapter
                r0.<init>(r3)
                r1.setOnReceiveContentListener(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusDirection {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusRealDirection {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusRelativeDirection {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface NestedScrollType {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(31)
    private static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {

        @androidx.annotation.NonNull
        private final androidx.core.view.OnReceiveContentListener mJetpackListener;

        OnReceiveContentListenerAdapter(@androidx.annotation.NonNull androidx.core.view.OnReceiveContentListener r1) {
                r0 = this;
                r0.<init>()
                r0.mJetpackListener = r1
                return
        }

        @Override // android.view.OnReceiveContentListener
        @androidx.annotation.Nullable
        public android.view.ContentInfo onReceiveContent(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.ContentInfo r4) {
                r2 = this;
                androidx.core.view.ContentInfoCompat r0 = androidx.core.view.ContentInfoCompat.toContentInfoCompat(r4)
                androidx.core.view.OnReceiveContentListener r1 = r2.mJetpackListener
                androidx.core.view.ContentInfoCompat r3 = r1.onReceiveContent(r3, r0)
                if (r3 != 0) goto Le
                r3 = 0
                return r3
            Le:
                if (r3 != r0) goto L11
                return r4
            L11:
                android.view.ContentInfo r3 = r3.toContentInfo()
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.KeyEvent r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ScrollAxis {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ScrollIndicators {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class UnhandledKeyEventManager {
        private static final java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> sViewsWithListeners = null;
        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> mCapturedKeys;
        private java.lang.ref.WeakReference<android.view.KeyEvent> mLastDispatchedPreViewKeyEvent;

        @androidx.annotation.Nullable
        private java.util.WeakHashMap<android.view.View, java.lang.Boolean> mViewsContainingListeners;

        static {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners = r0
                return
        }

        UnhandledKeyEventManager() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mViewsContainingListeners = r0
                r1.mCapturedKeys = r0
                r1.mLastDispatchedPreViewKeyEvent = r0
                return
        }

        static androidx.core.view.ViewCompat.UnhandledKeyEventManager at(android.view.View r2) {
                int r0 = androidx.core.R.id.tag_unhandled_key_event_manager
                java.lang.Object r1 = r2.getTag(r0)
                androidx.core.view.ViewCompat$UnhandledKeyEventManager r1 = (androidx.core.view.ViewCompat.UnhandledKeyEventManager) r1
                if (r1 != 0) goto L12
                androidx.core.view.ViewCompat$UnhandledKeyEventManager r1 = new androidx.core.view.ViewCompat$UnhandledKeyEventManager
                r1.<init>()
                r2.setTag(r0, r1)
            L12:
                return r1
        }

        @androidx.annotation.Nullable
        private android.view.View dispatchInOrder(android.view.View r5, android.view.KeyEvent r6) {
                r4 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r4.mViewsContainingListeners
                r1 = 0
                if (r0 == 0) goto L30
                boolean r0 = r0.containsKey(r5)
                if (r0 != 0) goto Lc
                goto L30
            Lc:
                boolean r0 = r5 instanceof android.view.ViewGroup
                if (r0 == 0) goto L29
                r0 = r5
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                int r2 = r0.getChildCount()
                int r2 = r2 + (-1)
            L19:
                if (r2 < 0) goto L29
                android.view.View r3 = r0.getChildAt(r2)
                android.view.View r3 = r4.dispatchInOrder(r3, r6)
                if (r3 == 0) goto L26
                return r3
            L26:
                int r2 = r2 + (-1)
                goto L19
            L29:
                boolean r6 = r4.onUnhandledKeyEvent(r5, r6)
                if (r6 == 0) goto L30
                return r5
            L30:
                return r1
        }

        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> getCapturedKeys() {
                r1 = this;
                android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r1.mCapturedKeys
                if (r0 != 0) goto Lb
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mCapturedKeys = r0
            Lb:
                android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r1.mCapturedKeys
                return r0
        }

        private boolean onUnhandledKeyEvent(@androidx.annotation.NonNull android.view.View r5, @androidx.annotation.NonNull android.view.KeyEvent r6) {
                r4 = this;
                int r0 = androidx.core.R.id.tag_unhandled_key_listeners
                java.lang.Object r0 = r5.getTag(r0)
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                if (r0 == 0) goto L22
                int r1 = r0.size()
                r2 = 1
                int r1 = r1 - r2
            L10:
                if (r1 < 0) goto L22
                java.lang.Object r3 = r0.get(r1)
                androidx.core.view.ViewCompat$OnUnhandledKeyEventListenerCompat r3 = (androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat) r3
                boolean r3 = r3.onUnhandledKeyEvent(r5, r6)
                if (r3 == 0) goto L1f
                return r2
            L1f:
                int r1 = r1 + (-1)
                goto L10
            L22:
                r5 = 0
                return r5
        }

        private void recalcViewsWithUnhandled() {
                r6 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r6.mViewsContainingListeners
                if (r0 == 0) goto L7
                r0.clear()
            L7:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L10
                return
            L10:
                monitor-enter(r0)
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r1 = r6.mViewsContainingListeners     // Catch: java.lang.Throwable -> L1d
                if (r1 != 0) goto L1f
                java.util.WeakHashMap r1 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L1d
                r1.<init>()     // Catch: java.lang.Throwable -> L1d
                r6.mViewsContainingListeners = r1     // Catch: java.lang.Throwable -> L1d
                goto L1f
            L1d:
                r1 = move-exception
                goto L5e
            L1f:
                int r1 = r0.size()     // Catch: java.lang.Throwable -> L1d
                int r1 = r1 + (-1)
            L25:
                if (r1 < 0) goto L5c
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r2 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r3 = r2.get(r1)     // Catch: java.lang.Throwable -> L1d
                java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L1d
                android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L1d
                if (r3 != 0) goto L3b
                r2.remove(r1)     // Catch: java.lang.Throwable -> L1d
                goto L59
            L3b:
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r2 = r6.mViewsContainingListeners     // Catch: java.lang.Throwable -> L1d
                java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1d
                r2.put(r3, r4)     // Catch: java.lang.Throwable -> L1d
                android.view.ViewParent r2 = r3.getParent()     // Catch: java.lang.Throwable -> L1d
            L46:
                boolean r3 = r2 instanceof android.view.View     // Catch: java.lang.Throwable -> L1d
                if (r3 == 0) goto L59
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r3 = r6.mViewsContainingListeners     // Catch: java.lang.Throwable -> L1d
                r4 = r2
                android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L1d
                java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1d
                r3.put(r4, r5)     // Catch: java.lang.Throwable -> L1d
                android.view.ViewParent r2 = r2.getParent()     // Catch: java.lang.Throwable -> L1d
                goto L46
            L59:
                int r1 = r1 + (-1)
                goto L25
            L5c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
                return
            L5e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
                throw r1
        }

        static void registerListeningView(android.view.View r3) {
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners
                monitor-enter(r0)
                java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L1b
            L7:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1b
                if (r2 == 0) goto L1d
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1b
                java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L1b
                if (r2 != r3) goto L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
                return
            L1b:
                r3 = move-exception
                goto L29
            L1d:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r1 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L1b
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L1b
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L1b
                r1.add(r2)     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
                return
            L29:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
                throw r3
        }

        static void unregisterListeningView(android.view.View r4) {
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners
                monitor-enter(r0)
                r1 = 0
            L4:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r2 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L1d
                int r3 = r2.size()     // Catch: java.lang.Throwable -> L1d
                if (r1 >= r3) goto L22
                java.lang.Object r3 = r2.get(r1)     // Catch: java.lang.Throwable -> L1d
                java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L1d
                if (r3 != r4) goto L1f
                r2.remove(r1)     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
                return
            L1d:
                r4 = move-exception
                goto L24
            L1f:
                int r1 = r1 + 1
                goto L4
            L22:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
                return
            L24:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
                throw r4
        }

        boolean dispatch(android.view.View r3, android.view.KeyEvent r4) {
                r2 = this;
                int r0 = r4.getAction()
                if (r0 != 0) goto L9
                r2.recalcViewsWithUnhandled()
            L9:
                android.view.View r3 = r2.dispatchInOrder(r3, r4)
                int r0 = r4.getAction()
                if (r0 != 0) goto L2b
                int r4 = r4.getKeyCode()
                if (r3 == 0) goto L2b
                boolean r0 = android.view.KeyEvent.isModifierKey(r4)
                if (r0 != 0) goto L2b
                android.util.SparseArray r0 = r2.getCapturedKeys()
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r3)
                r0.put(r4, r1)
            L2b:
                if (r3 == 0) goto L2f
                r3 = 1
                return r3
            L2f:
                r3 = 0
                return r3
        }

        boolean preDispatch(android.view.KeyEvent r6) {
                r5 = this;
                java.lang.ref.WeakReference<android.view.KeyEvent> r0 = r5.mLastDispatchedPreViewKeyEvent
                r1 = 0
                if (r0 == 0) goto Lc
                java.lang.Object r0 = r0.get()
                if (r0 != r6) goto Lc
                return r1
            Lc:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r6)
                r5.mLastDispatchedPreViewKeyEvent = r0
                android.util.SparseArray r0 = r5.getCapturedKeys()
                int r2 = r6.getAction()
                r3 = 1
                if (r2 != r3) goto L32
                int r2 = r6.getKeyCode()
                int r2 = r0.indexOfKey(r2)
                if (r2 < 0) goto L32
                java.lang.Object r4 = r0.valueAt(r2)
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
                r0.removeAt(r2)
                goto L33
            L32:
                r4 = 0
            L33:
                if (r4 != 0) goto L40
                int r2 = r6.getKeyCode()
                java.lang.Object r0 = r0.get(r2)
                r4 = r0
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            L40:
                if (r4 == 0) goto L54
                java.lang.Object r0 = r4.get()
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L53
                boolean r1 = r0.isAttachedToWindow()
                if (r1 == 0) goto L53
                r5.onUnhandledKeyEvent(r0, r6)
            L53:
                return r3
            L54:
                return r1
        }
    }

    static {
            int r1 = androidx.core.R.id.accessibility_custom_action_0
            int r2 = androidx.core.R.id.accessibility_custom_action_1
            int r3 = androidx.core.R.id.accessibility_custom_action_2
            int r4 = androidx.core.R.id.accessibility_custom_action_3
            int r5 = androidx.core.R.id.accessibility_custom_action_4
            int r6 = androidx.core.R.id.accessibility_custom_action_5
            int r7 = androidx.core.R.id.accessibility_custom_action_6
            int r8 = androidx.core.R.id.accessibility_custom_action_7
            int r9 = androidx.core.R.id.accessibility_custom_action_8
            int r10 = androidx.core.R.id.accessibility_custom_action_9
            int r11 = androidx.core.R.id.accessibility_custom_action_10
            int r12 = androidx.core.R.id.accessibility_custom_action_11
            int r13 = androidx.core.R.id.accessibility_custom_action_12
            int r14 = androidx.core.R.id.accessibility_custom_action_13
            int r15 = androidx.core.R.id.accessibility_custom_action_14
            int r16 = androidx.core.R.id.accessibility_custom_action_15
            int r17 = androidx.core.R.id.accessibility_custom_action_16
            int r18 = androidx.core.R.id.accessibility_custom_action_17
            int r19 = androidx.core.R.id.accessibility_custom_action_18
            int r20 = androidx.core.R.id.accessibility_custom_action_19
            int r21 = androidx.core.R.id.accessibility_custom_action_20
            int r22 = androidx.core.R.id.accessibility_custom_action_21
            int r23 = androidx.core.R.id.accessibility_custom_action_22
            int r24 = androidx.core.R.id.accessibility_custom_action_23
            int r25 = androidx.core.R.id.accessibility_custom_action_24
            int r26 = androidx.core.R.id.accessibility_custom_action_25
            int r27 = androidx.core.R.id.accessibility_custom_action_26
            int r28 = androidx.core.R.id.accessibility_custom_action_27
            int r29 = androidx.core.R.id.accessibility_custom_action_28
            int r30 = androidx.core.R.id.accessibility_custom_action_29
            int r31 = androidx.core.R.id.accessibility_custom_action_30
            int r32 = androidx.core.R.id.accessibility_custom_action_31
            int[] r0 = new int[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}
            androidx.core.view.ViewCompat.ACCESSIBILITY_ACTIONS_RESOURCE_IDS = r0
            androidx.core.view.h0 r0 = new androidx.core.view.h0
            r0.<init>()
            androidx.core.view.ViewCompat.NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = r0
            androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager r0 = new androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager
            r0.<init>()
            androidx.core.view.ViewCompat.sAccessibilityPaneVisibilityManager = r0
            return
    }

    @java.lang.Deprecated
    protected ViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ androidx.core.view.ContentInfoCompat a(androidx.core.view.ContentInfoCompat r0) {
            return r0
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean> accessibilityHeadingProperty() {
            androidx.core.view.ViewCompat$4 r0 = new androidx.core.view.ViewCompat$4
            int r1 = androidx.core.R.id.tag_accessibility_heading
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r3 = 28
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static int addAccessibilityAction(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull java.lang.CharSequence r3, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityViewCommand r4) {
            int r0 = getAvailableActionIdFromResources(r2, r3)
            r1 = -1
            if (r0 == r1) goto Lf
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
            r1.<init>(r0, r3, r4)
            addAccessibilityAction(r2, r1)
        Lf:
            return r0
    }

    private static void addAccessibilityAction(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r2) {
            ensureAccessibilityDelegateCompat(r1)
            int r0 = r2.getId()
            removeActionWithId(r0, r1)
            java.util.List r0 = getActionList(r1)
            r0.add(r2)
            r2 = 0
            notifyViewAccessibilityStateChangedIfNeeded(r1, r2)
            return
    }

    public static void addKeyboardNavigationClusters(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull java.util.Collection<android.view.View> r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.addKeyboardNavigationClusters(r2, r3, r4)
        L9:
            return
    }

    public static void addOnUnhandledKeyEventListener(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.Api28Impl.addOnUnhandledKeyEventListener(r2, r3)
            return
        La:
            int r0 = androidx.core.R.id.tag_unhandled_key_listeners
            java.lang.Object r1 = r2.getTag(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 != 0) goto L1c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.setTag(r0, r1)
        L1c:
            r1.add(r3)
            int r3 = r1.size()
            r0 = 1
            if (r3 != r0) goto L29
            androidx.core.view.ViewCompat.UnhandledKeyEventManager.registerListeningView(r2)
        L29:
            return
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static androidx.core.view.ViewPropertyAnimatorCompat animate(@androidx.annotation.NonNull android.view.View r2) {
            java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> r0 = androidx.core.view.ViewCompat.sViewPropertyAnimatorMap
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            androidx.core.view.ViewCompat.sViewPropertyAnimatorMap = r0
        Lb:
            java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> r0 = androidx.core.view.ViewCompat.sViewPropertyAnimatorMap
            java.lang.Object r0 = r0.get(r2)
            androidx.core.view.ViewPropertyAnimatorCompat r0 = (androidx.core.view.ViewPropertyAnimatorCompat) r0
            if (r0 != 0) goto L1f
            androidx.core.view.ViewPropertyAnimatorCompat r0 = new androidx.core.view.ViewPropertyAnimatorCompat
            r0.<init>(r2)
            java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> r1 = androidx.core.view.ViewCompat.sViewPropertyAnimatorMap
            r1.put(r2, r0)
        L1f:
            return r0
    }

    private static void bindTempDetach() {
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "dispatchStartTemporaryDetach"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L13
            androidx.core.view.ViewCompat.sDispatchStartTemporaryDetach = r1     // Catch: java.lang.NoSuchMethodException -> L13
            java.lang.String r1 = "dispatchFinishTemporaryDetach"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L13
            androidx.core.view.ViewCompat.sDispatchFinishTemporaryDetach = r0     // Catch: java.lang.NoSuchMethodException -> L13
        L13:
            r0 = 1
            androidx.core.view.ViewCompat.sTempDetachBound = r0
            return
    }

    @java.lang.Deprecated
    public static boolean canScrollHorizontally(android.view.View r0, int r1) {
            boolean r0 = r0.canScrollHorizontally(r1)
            return r0
    }

    @java.lang.Deprecated
    public static boolean canScrollVertically(android.view.View r0, int r1) {
            boolean r0 = r0.canScrollVertically(r1)
            return r0
    }

    public static void cancelDragAndDrop(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api24Impl.cancelDragAndDrop(r2)
        L9:
            return
    }

    @java.lang.Deprecated
    public static int combineMeasuredStates(int r0, int r1) {
            int r0 = android.view.View.combineMeasuredStates(r0, r1)
            return r0
    }

    private static void compatOffsetLeftAndRight(android.view.View r0, int r1) {
            r0.offsetLeftAndRight(r1)
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L19
            tickleInvalidationFlag(r0)
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L19
            android.view.View r0 = (android.view.View) r0
            tickleInvalidationFlag(r0)
        L19:
            return
    }

    private static void compatOffsetTopAndBottom(android.view.View r0, int r1) {
            r0.offsetTopAndBottom(r1)
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L19
            tickleInvalidationFlag(r0)
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L19
            android.view.View r0 = (android.view.View) r0
            tickleInvalidationFlag(r0)
        L19:
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.view.WindowInsetsCompat computeSystemWindowInsets(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1, @androidx.annotation.NonNull android.graphics.Rect r2) {
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.ViewCompat.Api21Impl.computeSystemWindowInsets(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.view.WindowInsetsCompat dispatchApplyWindowInsets(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r3) {
            android.view.WindowInsets r0 = r3.toWindowInsets()
            if (r0 == 0) goto L15
            android.view.WindowInsets r1 = androidx.core.view.ViewCompat.Api20Impl.dispatchApplyWindowInsets(r2, r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1, r2)
            return r2
        L15:
            return r3
    }

    public static void dispatchFinishTemporaryDetach(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.Api24Impl.dispatchFinishTemporaryDetach(r2)
            return
        La:
            boolean r0 = androidx.core.view.ViewCompat.sTempDetachBound
            if (r0 != 0) goto L11
            bindTempDetach()
        L11:
            java.lang.reflect.Method r0 = androidx.core.view.ViewCompat.sDispatchFinishTemporaryDetach
            if (r0 == 0) goto L1a
            r1 = 0
            r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L19
        L19:
            return
        L1a:
            r2.onFinishTemporaryDetach()
            return
    }

    public static boolean dispatchNestedFling(@androidx.annotation.NonNull android.view.View r0, float r1, float r2, boolean r3) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.dispatchNestedFling(r0, r1, r2, r3)
            return r0
    }

    public static boolean dispatchNestedPreFling(@androidx.annotation.NonNull android.view.View r0, float r1, float r2) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.dispatchNestedPreFling(r0, r1, r2)
            return r0
    }

    public static boolean dispatchNestedPreScroll(@androidx.annotation.NonNull android.view.View r0, int r1, int r2, @androidx.annotation.Nullable int[] r3, @androidx.annotation.Nullable int[] r4) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.dispatchNestedPreScroll(r0, r1, r2, r3, r4)
            return r0
    }

    public static boolean dispatchNestedPreScroll(@androidx.annotation.NonNull android.view.View r1, int r2, int r3, @androidx.annotation.Nullable int[] r4, @androidx.annotation.Nullable int[] r5, int r6) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto Lb
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            boolean r1 = r1.dispatchNestedPreScroll(r2, r3, r4, r5, r6)
            return r1
        Lb:
            if (r6 != 0) goto L12
            boolean r1 = dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static void dispatchNestedScroll(@androidx.annotation.NonNull android.view.View r1, int r2, int r3, int r4, int r5, @androidx.annotation.Nullable int[] r6, int r7, @androidx.annotation.NonNull int[] r8) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingChild3
            if (r0 == 0) goto La
            androidx.core.view.NestedScrollingChild3 r1 = (androidx.core.view.NestedScrollingChild3) r1
            r1.dispatchNestedScroll(r2, r3, r4, r5, r6, r7, r8)
            return
        La:
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            dispatchNestedScroll(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static boolean dispatchNestedScroll(@androidx.annotation.NonNull android.view.View r0, int r1, int r2, int r3, int r4, @androidx.annotation.Nullable int[] r5) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.dispatchNestedScroll(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static boolean dispatchNestedScroll(@androidx.annotation.NonNull android.view.View r1, int r2, int r3, int r4, int r5, @androidx.annotation.Nullable int[] r6, int r7) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto Lb
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            boolean r1 = r1.dispatchNestedScroll(r2, r3, r4, r5, r6, r7)
            return r1
        Lb:
            if (r7 != 0) goto L18
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            boolean r1 = dispatchNestedScroll(r2, r3, r4, r5, r6, r7)
            return r1
        L18:
            r1 = 0
            return r1
    }

    public static void dispatchStartTemporaryDetach(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.Api24Impl.dispatchStartTemporaryDetach(r2)
            return
        La:
            boolean r0 = androidx.core.view.ViewCompat.sTempDetachBound
            if (r0 != 0) goto L11
            bindTempDetach()
        L11:
            java.lang.reflect.Method r0 = androidx.core.view.ViewCompat.sDispatchStartTemporaryDetach
            if (r0 == 0) goto L1a
            r1 = 0
            r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L19
        L19:
            return
        L1a:
            r2.onStartTemporaryDetach()
            return
    }

    @androidx.annotation.UiThread
    static boolean dispatchUnhandledKeyEventBeforeCallback(android.view.View r2, android.view.KeyEvent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r2 = 0
            return r2
        L8:
            androidx.core.view.ViewCompat$UnhandledKeyEventManager r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.at(r2)
            boolean r2 = r0.dispatch(r2, r3)
            return r2
    }

    @androidx.annotation.UiThread
    static boolean dispatchUnhandledKeyEventBeforeHierarchy(android.view.View r2, android.view.KeyEvent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r2 = 0
            return r2
        L8:
            androidx.core.view.ViewCompat$UnhandledKeyEventManager r2 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.at(r2)
            boolean r2 = r2.preDispatch(r3)
            return r2
    }

    public static void enableAccessibleClickableSpanSupport(@androidx.annotation.NonNull android.view.View r0) {
            ensureAccessibilityDelegateCompat(r0)
            return
    }

    static void ensureAccessibilityDelegateCompat(@androidx.annotation.NonNull android.view.View r1) {
            androidx.core.view.AccessibilityDelegateCompat r0 = getAccessibilityDelegate(r1)
            if (r0 != 0) goto Lb
            androidx.core.view.AccessibilityDelegateCompat r0 = new androidx.core.view.AccessibilityDelegateCompat
            r0.<init>()
        Lb:
            setAccessibilityDelegate(r1, r0)
            return
    }

    @java.lang.Deprecated
    public static int generateViewId() {
            int r0 = android.view.View.generateViewId()
            return r0
    }

    @androidx.annotation.Nullable
    public static androidx.core.view.AccessibilityDelegateCompat getAccessibilityDelegate(@androidx.annotation.NonNull android.view.View r1) {
            android.view.View$AccessibilityDelegate r1 = getAccessibilityDelegateInternal(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r0 = r1 instanceof androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter
            if (r0 == 0) goto L11
            androidx.core.view.AccessibilityDelegateCompat$AccessibilityDelegateAdapter r1 = (androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter) r1
            androidx.core.view.AccessibilityDelegateCompat r1 = r1.mCompat
            return r1
        L11:
            androidx.core.view.AccessibilityDelegateCompat r0 = new androidx.core.view.AccessibilityDelegateCompat
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.Nullable
    private static android.view.View.AccessibilityDelegate getAccessibilityDelegateInternal(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            android.view.View$AccessibilityDelegate r2 = androidx.core.view.ViewCompat.Api29Impl.getAccessibilityDelegate(r2)
            return r2
        Lb:
            android.view.View$AccessibilityDelegate r2 = getAccessibilityDelegateThroughReflection(r2)
            return r2
    }

    @androidx.annotation.Nullable
    private static android.view.View.AccessibilityDelegate getAccessibilityDelegateThroughReflection(@androidx.annotation.NonNull android.view.View r4) {
            boolean r0 = androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.reflect.Field r0 = androidx.core.view.ViewCompat.sAccessibilityDelegateField
            r2 = 1
            if (r0 != 0) goto L1c
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r3 = "mAccessibilityDelegate"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L19
            androidx.core.view.ViewCompat.sAccessibilityDelegateField = r0     // Catch: java.lang.Throwable -> L19
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed = r2
            return r1
        L1c:
            java.lang.reflect.Field r0 = androidx.core.view.ViewCompat.sAccessibilityDelegateField     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r4 instanceof android.view.View.AccessibilityDelegate     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L29
            android.view.View$AccessibilityDelegate r4 = (android.view.View.AccessibilityDelegate) r4     // Catch: java.lang.Throwable -> L2a
            return r4
        L29:
            return r1
        L2a:
            androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed = r2
            return r1
    }

    @java.lang.Deprecated
    public static int getAccessibilityLiveRegion(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = r0.getAccessibilityLiveRegion()
            return r0
    }

    @androidx.annotation.Nullable
    public static androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@androidx.annotation.NonNull android.view.View r1) {
            android.view.accessibility.AccessibilityNodeProvider r1 = r1.getAccessibilityNodeProvider()
            if (r1 == 0) goto Lc
            androidx.core.view.accessibility.AccessibilityNodeProviderCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeProviderCompat
            r0.<init>(r1)
            return r0
        Lc:
            r1 = 0
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.UiThread
    public static java.lang.CharSequence getAccessibilityPaneTitle(@androidx.annotation.NonNull android.view.View r1) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = paneTitleProperty()
            java.lang.Object r1 = r0.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            return r1
    }

    private static java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(android.view.View r2) {
            int r0 = androidx.core.R.id.tag_accessibility_actions
            java.lang.Object r1 = r2.getTag(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 != 0) goto L12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.setTag(r0, r1)
        L12:
            return r1
    }

    @java.lang.Deprecated
    public static float getAlpha(android.view.View r0) {
            float r0 = r0.getAlpha()
            return r0
    }

    @androidx.annotation.Nullable
    public static androidx.core.view.autofill.AutofillIdCompat getAutofillId(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lf
            android.view.autofill.AutofillId r2 = androidx.core.view.ViewCompat.Api26Impl.getAutofillId(r2)
            androidx.core.view.autofill.AutofillIdCompat r2 = androidx.core.view.autofill.AutofillIdCompat.toAutofillIdCompat(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    private static int getAvailableActionIdFromResources(android.view.View r8, @androidx.annotation.NonNull java.lang.CharSequence r9) {
            java.util.List r8 = getActionList(r8)
            r0 = 0
            r1 = 0
        L6:
            int r2 = r8.size()
            if (r1 >= r2) goto L2a
            java.lang.Object r2 = r8.get(r1)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r2
            java.lang.CharSequence r2 = r2.getLabel()
            boolean r2 = android.text.TextUtils.equals(r9, r2)
            if (r2 == 0) goto L27
            java.lang.Object r8 = r8.get(r1)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r8 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r8
            int r8 = r8.getId()
            return r8
        L27:
            int r1 = r1 + 1
            goto L6
        L2a:
            r9 = -1
            r1 = 0
            r2 = -1
        L2d:
            int[] r3 = androidx.core.view.ViewCompat.ACCESSIBILITY_ACTIONS_RESOURCE_IDS
            int r4 = r3.length
            if (r1 >= r4) goto L58
            if (r2 != r9) goto L58
            r3 = r3[r1]
            r4 = 1
            r5 = 0
            r6 = 1
        L39:
            int r7 = r8.size()
            if (r5 >= r7) goto L52
            java.lang.Object r7 = r8.get(r5)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r7 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r7
            int r7 = r7.getId()
            if (r7 == r3) goto L4d
            r7 = 1
            goto L4e
        L4d:
            r7 = 0
        L4e:
            r6 = r6 & r7
            int r5 = r5 + 1
            goto L39
        L52:
            if (r6 == 0) goto L55
            r2 = r3
        L55:
            int r1 = r1 + 1
            goto L2d
        L58:
            return r2
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList getBackgroundTintList(@androidx.annotation.NonNull android.view.View r0) {
            android.content.res.ColorStateList r0 = androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintList(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.PorterDuff.Mode getBackgroundTintMode(@androidx.annotation.NonNull android.view.View r0) {
            android.graphics.PorterDuff$Mode r0 = androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintMode(r0)
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public static android.graphics.Rect getClipBounds(@androidx.annotation.NonNull android.view.View r0) {
            android.graphics.Rect r0 = r0.getClipBounds()
            return r0
    }

    @androidx.annotation.Nullable
    public static androidx.core.view.contentcapture.ContentCaptureSessionCompat getContentCaptureSession(@androidx.annotation.NonNull android.view.View r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L13
            android.view.contentcapture.ContentCaptureSession r0 = androidx.core.view.ViewCompat.Api29Impl.getContentCaptureSession(r3)
            if (r0 != 0) goto Le
            return r2
        Le:
            androidx.core.view.contentcapture.ContentCaptureSessionCompat r3 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.toContentCaptureSessionCompat(r0, r3)
            return r3
        L13:
            return r2
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public static android.view.Display getDisplay(@androidx.annotation.NonNull android.view.View r0) {
            android.view.Display r0 = r0.getDisplay()
            return r0
    }

    public static float getElevation(@androidx.annotation.NonNull android.view.View r0) {
            float r0 = androidx.core.view.ViewCompat.Api21Impl.getElevation(r0)
            return r0
    }

    private static android.graphics.Rect getEmptyTempRect() {
            java.lang.ThreadLocal<android.graphics.Rect> r0 = androidx.core.view.ViewCompat.sThreadLocalRect
            if (r0 != 0) goto Lb
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.view.ViewCompat.sThreadLocalRect = r0
        Lb:
            java.lang.ThreadLocal<android.graphics.Rect> r0 = androidx.core.view.ViewCompat.sThreadLocalRect
            java.lang.Object r0 = r0.get()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 != 0) goto L1f
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.lang.ThreadLocal<android.graphics.Rect> r1 = androidx.core.view.ViewCompat.sThreadLocalRect
            r1.set(r0)
        L1f:
            r0.setEmpty()
            return r0
    }

    private static androidx.core.view.OnReceiveContentViewBehavior getFallback(@androidx.annotation.NonNull android.view.View r1) {
            boolean r0 = r1 instanceof androidx.core.view.OnReceiveContentViewBehavior
            if (r0 == 0) goto L7
            androidx.core.view.OnReceiveContentViewBehavior r1 = (androidx.core.view.OnReceiveContentViewBehavior) r1
            return r1
        L7:
            androidx.core.view.OnReceiveContentViewBehavior r1 = androidx.core.view.ViewCompat.NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR
            return r1
    }

    @java.lang.Deprecated
    public static boolean getFitsSystemWindows(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = r0.getFitsSystemWindows()
            return r0
    }

    @java.lang.Deprecated
    public static int getImportantForAccessibility(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = r0.getImportantForAccessibility()
            return r0
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    public static int getImportantForAutofill(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            int r2 = androidx.core.view.ViewCompat.Api26Impl.getImportantForAutofill(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static int getImportantForContentCapture(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            int r2 = androidx.core.view.ViewCompat.Api30Impl.getImportantForContentCapture(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    public static int getLabelFor(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = r0.getLabelFor()
            return r0
    }

    @java.lang.Deprecated
    public static int getLayerType(android.view.View r0) {
            int r0 = r0.getLayerType()
            return r0
    }

    @java.lang.Deprecated
    public static int getLayoutDirection(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = r0.getLayoutDirection()
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public static android.graphics.Matrix getMatrix(android.view.View r0) {
            android.graphics.Matrix r0 = r0.getMatrix()
            return r0
    }

    @java.lang.Deprecated
    public static int getMeasuredHeightAndState(android.view.View r0) {
            int r0 = r0.getMeasuredHeightAndState()
            return r0
    }

    @java.lang.Deprecated
    public static int getMeasuredState(android.view.View r0) {
            int r0 = r0.getMeasuredState()
            return r0
    }

    @java.lang.Deprecated
    public static int getMeasuredWidthAndState(android.view.View r0) {
            int r0 = r0.getMeasuredWidthAndState()
            return r0
    }

    @java.lang.Deprecated
    public static int getMinimumHeight(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = r0.getMinimumHeight()
            return r0
    }

    @java.lang.Deprecated
    public static int getMinimumWidth(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = r0.getMinimumWidth()
            return r0
    }

    public static int getNextClusterForwardId(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            int r2 = androidx.core.view.ViewCompat.Api26Impl.getNextClusterForwardId(r2)
            return r2
        Lb:
            r2 = -1
            return r2
    }

    @androidx.annotation.Nullable
    public static java.lang.String[] getOnReceiveContentMimeTypes(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            java.lang.String[] r2 = androidx.core.view.ViewCompat.Api31Impl.getReceiveContentMimeTypes(r2)
            return r2
        Lb:
            int r0 = androidx.core.R.id.tag_on_receive_content_mime_types
            java.lang.Object r2 = r2.getTag(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }

    @java.lang.Deprecated
    public static int getOverScrollMode(android.view.View r0) {
            int r0 = r0.getOverScrollMode()
            return r0
    }

    @androidx.annotation.Px
    @java.lang.Deprecated
    public static int getPaddingEnd(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = r0.getPaddingEnd()
            return r0
    }

    @androidx.annotation.Px
    @java.lang.Deprecated
    public static int getPaddingStart(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = r0.getPaddingStart()
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public static android.view.ViewParent getParentForAccessibility(@androidx.annotation.NonNull android.view.View r0) {
            android.view.ViewParent r0 = r0.getParentForAccessibility()
            return r0
    }

    @java.lang.Deprecated
    public static float getPivotX(android.view.View r0) {
            float r0 = r0.getPivotX()
            return r0
    }

    @java.lang.Deprecated
    public static float getPivotY(android.view.View r0) {
            float r0 = r0.getPivotY()
            return r0
    }

    @androidx.annotation.Nullable
    public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.ViewCompat.Api23Impl.getRootWindowInsets(r2)
            return r2
        Lb:
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.ViewCompat.Api21Impl.getRootWindowInsets(r2)
            return r2
    }

    @java.lang.Deprecated
    public static float getRotation(android.view.View r0) {
            float r0 = r0.getRotation()
            return r0
    }

    @java.lang.Deprecated
    public static float getRotationX(android.view.View r0) {
            float r0 = r0.getRotationX()
            return r0
    }

    @java.lang.Deprecated
    public static float getRotationY(android.view.View r0) {
            float r0 = r0.getRotationY()
            return r0
    }

    @java.lang.Deprecated
    public static float getScaleX(android.view.View r0) {
            float r0 = r0.getScaleX()
            return r0
    }

    @java.lang.Deprecated
    public static float getScaleY(android.view.View r0) {
            float r0 = r0.getScaleY()
            return r0
    }

    public static int getScrollIndicators(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            int r2 = androidx.core.view.ViewCompat.Api23Impl.getScrollIndicators(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.UiThread
    public static java.lang.CharSequence getStateDescription(@androidx.annotation.NonNull android.view.View r1) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = stateDescriptionProperty()
            java.lang.Object r1 = r0.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static java.util.List<android.graphics.Rect> getSystemGestureExclusionRects(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            java.util.List r2 = androidx.core.view.ViewCompat.Api29Impl.getSystemGestureExclusionRects(r2)
            return r2
        Lb:
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
    }

    @androidx.annotation.Nullable
    public static java.lang.String getTransitionName(@androidx.annotation.NonNull android.view.View r0) {
            java.lang.String r0 = androidx.core.view.ViewCompat.Api21Impl.getTransitionName(r0)
            return r0
    }

    @java.lang.Deprecated
    public static float getTranslationX(android.view.View r0) {
            float r0 = r0.getTranslationX()
            return r0
    }

    @java.lang.Deprecated
    public static float getTranslationY(android.view.View r0) {
            float r0 = r0.getTranslationY()
            return r0
    }

    public static float getTranslationZ(@androidx.annotation.NonNull android.view.View r0) {
            float r0 = androidx.core.view.ViewCompat.Api21Impl.getTranslationZ(r0)
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public static androidx.core.view.WindowInsetsControllerCompat getWindowInsetsController(@androidx.annotation.NonNull android.view.View r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            androidx.core.view.WindowInsetsControllerCompat r3 = androidx.core.view.ViewCompat.Api30Impl.getWindowInsetsController(r3)
            return r3
        Lb:
            android.content.Context r0 = r3.getContext()
        Lf:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            r2 = 0
            if (r1 == 0) goto L2d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L26
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L25
            androidx.core.view.WindowInsetsControllerCompat r3 = androidx.core.view.WindowCompat.getInsetsController(r0, r3)
            return r3
        L25:
            return r2
        L26:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto Lf
        L2d:
            return r2
    }

    @java.lang.Deprecated
    public static int getWindowSystemUiVisibility(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = r0.getWindowSystemUiVisibility()
            return r0
    }

    @java.lang.Deprecated
    public static float getX(android.view.View r0) {
            float r0 = r0.getX()
            return r0
    }

    @java.lang.Deprecated
    public static float getY(android.view.View r0) {
            float r0 = r0.getY()
            return r0
    }

    public static float getZ(@androidx.annotation.NonNull android.view.View r0) {
            float r0 = androidx.core.view.ViewCompat.Api21Impl.getZ(r0)
            return r0
    }

    public static boolean hasAccessibilityDelegate(@androidx.annotation.NonNull android.view.View r0) {
            android.view.View$AccessibilityDelegate r0 = getAccessibilityDelegateInternal(r0)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean hasExplicitFocusable(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.ViewCompat.Api26Impl.hasExplicitFocusable(r2)
            return r2
        Lb:
            boolean r2 = r2.hasFocusable()
            return r2
    }

    public static boolean hasNestedScrollingParent(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.hasNestedScrollingParent(r0)
            return r0
    }

    public static boolean hasNestedScrollingParent(@androidx.annotation.NonNull android.view.View r1, int r2) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto La
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            r1.hasNestedScrollingParent(r2)
            goto L11
        La:
            if (r2 != 0) goto L11
            boolean r1 = hasNestedScrollingParent(r1)
            return r1
        L11:
            r1 = 0
            return r1
    }

    @java.lang.Deprecated
    public static boolean hasOnClickListeners(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = r0.hasOnClickListeners()
            return r0
    }

    @java.lang.Deprecated
    public static boolean hasOverlappingRendering(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = r0.hasOverlappingRendering()
            return r0
    }

    @java.lang.Deprecated
    public static boolean hasTransientState(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = r0.hasTransientState()
            return r0
    }

    @androidx.annotation.UiThread
    public static boolean isAccessibilityHeading(@androidx.annotation.NonNull android.view.View r1) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = accessibilityHeadingProperty()
            java.lang.Object r1 = r0.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L14
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    @java.lang.Deprecated
    public static boolean isAttachedToWindow(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = r0.isAttachedToWindow()
            return r0
    }

    public static boolean isFocusedByDefault(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.ViewCompat.Api26Impl.isFocusedByDefault(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static boolean isImportantForAccessibility(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.isImportantForAccessibility(r0)
            return r0
    }

    public static boolean isImportantForAutofill(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.ViewCompat.Api26Impl.isImportantForAutofill(r2)
            return r2
        Lb:
            r2 = 1
            return r2
    }

    public static boolean isImportantForContentCapture(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.ViewCompat.Api30Impl.isImportantForContentCapture(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    public static boolean isInLayout(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = r0.isInLayout()
            return r0
    }

    public static boolean isKeyboardNavigationCluster(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.ViewCompat.Api26Impl.isKeyboardNavigationCluster(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    public static boolean isLaidOut(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = r0.isLaidOut()
            return r0
    }

    @java.lang.Deprecated
    public static boolean isLayoutDirectionResolved(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = r0.isLayoutDirectionResolved()
            return r0
    }

    public static boolean isNestedScrollingEnabled(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.isNestedScrollingEnabled(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean isOpaque(android.view.View r0) {
            boolean r0 = r0.isOpaque()
            return r0
    }

    @java.lang.Deprecated
    public static boolean isPaddingRelative(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = r0.isPaddingRelative()
            return r0
    }

    @androidx.annotation.UiThread
    public static boolean isScreenReaderFocusable(@androidx.annotation.NonNull android.view.View r1) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = screenReaderFocusableProperty()
            java.lang.Object r1 = r0.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L14
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    @java.lang.Deprecated
    public static void jumpDrawablesToCurrentState(android.view.View r0) {
            r0.jumpDrawablesToCurrentState()
            return
    }

    @androidx.annotation.Nullable
    public static android.view.View keyboardNavigationClusterSearch(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable android.view.View r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.view.View r2 = androidx.core.view.ViewCompat.Api26Impl.keyboardNavigationClusterSearch(r2, r3, r4)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    static void notifyViewAccessibilityStateChangedIfNeeded(android.view.View r4, int r5) {
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            boolean r1 = r0.isEnabled()
            if (r1 != 0) goto L13
            goto L6c
        L13:
            java.lang.CharSequence r1 = getAccessibilityPaneTitle(r4)
            if (r1 == 0) goto L27
            boolean r1 = r4.isShown()
            if (r1 == 0) goto L27
            int r1 = r4.getWindowVisibility()
            if (r1 != 0) goto L27
            r1 = 1
            goto L28
        L27:
            r1 = 0
        L28:
            int r2 = r4.getAccessibilityLiveRegion()
            r3 = 32
            if (r2 != 0) goto L6d
            if (r1 == 0) goto L33
            goto L6d
        L33:
            if (r5 != r3) goto L57
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain()
            r4.onInitializeAccessibilityEvent(r1)
            r1.setEventType(r3)
            r1.setContentChangeTypes(r5)
            r1.setSource(r4)
            r4.onPopulateAccessibilityEvent(r1)
            java.util.List r5 = r1.getText()
            java.lang.CharSequence r4 = getAccessibilityPaneTitle(r4)
            r5.add(r4)
            r0.sendAccessibilityEvent(r1)
            return
        L57:
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L6c
            android.view.ViewParent r0 = r4.getParent()
            r0.notifySubtreeAccessibilityStateChanged(r4, r4, r5)     // Catch: java.lang.AbstractMethodError -> L65
            return
        L65:
            android.view.ViewParent r4 = r4.getParent()
            r4.getClass()
        L6c:
            return
        L6d:
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r1 == 0) goto L74
            goto L76
        L74:
            r3 = 2048(0x800, float:2.87E-42)
        L76:
            r0.setEventType(r3)
            r0.setContentChangeTypes(r5)
            if (r1 == 0) goto L8c
            java.util.List r5 = r0.getText()
            java.lang.CharSequence r1 = getAccessibilityPaneTitle(r4)
            r5.add(r1)
            setImportantForAccessibilityIfNeeded(r4)
        L8c:
            r4.sendAccessibilityEventUnchecked(r0)
            return
    }

    public static void offsetLeftAndRight(@androidx.annotation.NonNull android.view.View r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            r6.offsetLeftAndRight(r7)
            return
        La:
            android.graphics.Rect r0 = getEmptyTempRect()
            android.view.ViewParent r1 = r6.getParent()
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L43
            r2 = r1
            android.view.View r2 = (android.view.View) r2
            int r3 = r2.getLeft()
            int r4 = r2.getTop()
            int r5 = r2.getRight()
            int r2 = r2.getBottom()
            r0.set(r3, r4, r5, r2)
            int r2 = r6.getLeft()
            int r3 = r6.getTop()
            int r4 = r6.getRight()
            int r5 = r6.getBottom()
            boolean r2 = r0.intersects(r2, r3, r4, r5)
            r2 = r2 ^ 1
            goto L44
        L43:
            r2 = 0
        L44:
            compatOffsetLeftAndRight(r6, r7)
            if (r2 == 0) goto L64
            int r7 = r6.getLeft()
            int r2 = r6.getTop()
            int r3 = r6.getRight()
            int r6 = r6.getBottom()
            boolean r6 = r0.intersect(r7, r2, r3, r6)
            if (r6 == 0) goto L64
            android.view.View r1 = (android.view.View) r1
            r1.invalidate(r0)
        L64:
            return
    }

    public static void offsetTopAndBottom(@androidx.annotation.NonNull android.view.View r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            r6.offsetTopAndBottom(r7)
            return
        La:
            android.graphics.Rect r0 = getEmptyTempRect()
            android.view.ViewParent r1 = r6.getParent()
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L43
            r2 = r1
            android.view.View r2 = (android.view.View) r2
            int r3 = r2.getLeft()
            int r4 = r2.getTop()
            int r5 = r2.getRight()
            int r2 = r2.getBottom()
            r0.set(r3, r4, r5, r2)
            int r2 = r6.getLeft()
            int r3 = r6.getTop()
            int r4 = r6.getRight()
            int r5 = r6.getBottom()
            boolean r2 = r0.intersects(r2, r3, r4, r5)
            r2 = r2 ^ 1
            goto L44
        L43:
            r2 = 0
        L44:
            compatOffsetTopAndBottom(r6, r7)
            if (r2 == 0) goto L64
            int r7 = r6.getLeft()
            int r2 = r6.getTop()
            int r3 = r6.getRight()
            int r6 = r6.getBottom()
            boolean r6 = r0.intersect(r7, r2, r3, r6)
            if (r6 == 0) goto L64
            android.view.View r1 = (android.view.View) r1
            r1.invalidate(r0)
        L64:
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.view.WindowInsetsCompat onApplyWindowInsets(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r3) {
            android.view.WindowInsets r0 = r3.toWindowInsets()
            if (r0 == 0) goto L15
            android.view.WindowInsets r1 = androidx.core.view.ViewCompat.Api20Impl.onApplyWindowInsets(r2, r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1, r2)
            return r2
        L15:
            return r3
    }

    @java.lang.Deprecated
    public static void onInitializeAccessibilityEvent(android.view.View r0, android.view.accessibility.AccessibilityEvent r1) {
            r0.onInitializeAccessibilityEvent(r1)
            return
    }

    @java.lang.Deprecated
    public static void onInitializeAccessibilityNodeInfo(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1) {
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.unwrap()
            r0.onInitializeAccessibilityNodeInfo(r1)
            return
    }

    @java.lang.Deprecated
    public static void onPopulateAccessibilityEvent(android.view.View r0, android.view.accessibility.AccessibilityEvent r1) {
            r0.onPopulateAccessibilityEvent(r1)
            return
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence> paneTitleProperty() {
            androidx.core.view.ViewCompat$2 r0 = new androidx.core.view.ViewCompat$2
            int r1 = androidx.core.R.id.tag_accessibility_pane_title
            r2 = 8
            r3 = 28
            java.lang.Class<java.lang.CharSequence> r4 = java.lang.CharSequence.class
            r0.<init>(r1, r4, r2, r3)
            return r0
    }

    @java.lang.Deprecated
    public static boolean performAccessibilityAction(@androidx.annotation.NonNull android.view.View r0, int r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            boolean r0 = r0.performAccessibilityAction(r1, r2)
            return r0
    }

    public static boolean performHapticFeedback(@androidx.annotation.NonNull android.view.View r1, int r2) {
            int r2 = androidx.core.view.HapticFeedbackConstantsCompat.getFeedbackConstantOrFallback(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r1 = 0
            return r1
        L9:
            boolean r1 = r1.performHapticFeedback(r2)
            return r1
    }

    public static boolean performHapticFeedback(@androidx.annotation.NonNull android.view.View r1, int r2, int r3) {
            int r2 = androidx.core.view.HapticFeedbackConstantsCompat.getFeedbackConstantOrFallback(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r1 = 0
            return r1
        L9:
            boolean r1 = r1.performHapticFeedback(r2, r3)
            return r1
    }

    @androidx.annotation.Nullable
    public static androidx.core.view.ContentInfoCompat performReceiveContent(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.core.view.ContentInfoCompat r3) {
            java.lang.String r0 = "ViewCompat"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L12
            java.util.Objects.toString(r3)
            r2.getClass()
            r2.getId()
        L12:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L1d
            androidx.core.view.ContentInfoCompat r2 = androidx.core.view.ViewCompat.Api31Impl.performReceiveContent(r2, r3)
            return r2
        L1d:
            int r0 = androidx.core.R.id.tag_on_receive_content_listener
            java.lang.Object r0 = r2.getTag(r0)
            androidx.core.view.OnReceiveContentListener r0 = (androidx.core.view.OnReceiveContentListener) r0
            if (r0 == 0) goto L38
            androidx.core.view.ContentInfoCompat r3 = r0.onReceiveContent(r2, r3)
            if (r3 != 0) goto L2f
            r2 = 0
            return r2
        L2f:
            androidx.core.view.OnReceiveContentViewBehavior r2 = getFallback(r2)
            androidx.core.view.ContentInfoCompat r2 = r2.onReceiveContent(r3)
            return r2
        L38:
            androidx.core.view.OnReceiveContentViewBehavior r2 = getFallback(r2)
            androidx.core.view.ContentInfoCompat r2 = r2.onReceiveContent(r3)
            return r2
    }

    @java.lang.Deprecated
    public static void postInvalidateOnAnimation(@androidx.annotation.NonNull android.view.View r0) {
            r0.postInvalidateOnAnimation()
            return
    }

    @java.lang.Deprecated
    public static void postInvalidateOnAnimation(@androidx.annotation.NonNull android.view.View r0, int r1, int r2, int r3, int r4) {
            r0.postInvalidateOnAnimation(r1, r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    public static void postOnAnimation(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull java.lang.Runnable r1) {
            r0.postOnAnimation(r1)
            return
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    @java.lang.Deprecated
    public static void postOnAnimationDelayed(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull java.lang.Runnable r1, long r2) {
            r0.postOnAnimationDelayed(r1, r2)
            return
    }

    public static void removeAccessibilityAction(@androidx.annotation.NonNull android.view.View r0, int r1) {
            removeActionWithId(r1, r0)
            r1 = 0
            notifyViewAccessibilityStateChangedIfNeeded(r0, r1)
            return
    }

    private static void removeActionWithId(int r2, android.view.View r3) {
            java.util.List r3 = getActionList(r3)
            r0 = 0
        L5:
            int r1 = r3.size()
            if (r0 >= r1) goto L1e
            java.lang.Object r1 = r3.get(r0)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r1
            int r1 = r1.getId()
            if (r1 != r2) goto L1b
            r3.remove(r0)
            return
        L1b:
            int r0 = r0 + 1
            goto L5
        L1e:
            return
    }

    public static void removeOnUnhandledKeyEventListener(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.Api28Impl.removeOnUnhandledKeyEventListener(r2, r3)
            return
        La:
            int r0 = androidx.core.R.id.tag_unhandled_key_listeners
            java.lang.Object r0 = r2.getTag(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L20
            r0.remove(r3)
            int r3 = r0.size()
            if (r3 != 0) goto L20
            androidx.core.view.ViewCompat.UnhandledKeyEventManager.unregisterListeningView(r2)
        L20:
            return
    }

    public static void replaceAccessibilityAction(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r1, @androidx.annotation.Nullable java.lang.CharSequence r2, @androidx.annotation.Nullable androidx.core.view.accessibility.AccessibilityViewCommand r3) {
            if (r3 != 0) goto Lc
            if (r2 != 0) goto Lc
            int r1 = r1.getId()
            removeAccessibilityAction(r0, r1)
            return
        Lc:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = r1.createReplacementAction(r2, r3)
            addAccessibilityAction(r0, r1)
            return
    }

    public static void requestApplyInsets(@androidx.annotation.NonNull android.view.View r0) {
            androidx.core.view.ViewCompat.Api20Impl.requestApplyInsets(r0)
            return
    }

    @androidx.annotation.NonNull
    public static <T extends android.view.View> T requireViewById(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.IdRes int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            java.lang.Object r2 = androidx.core.view.ViewCompat.Api28Impl.requireViewById(r2, r3)
            android.view.View r2 = (android.view.View) r2
            return r2
        Ld:
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L14
            return r2
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ID does not reference a View inside this View"
            r2.<init>(r3)
            throw r2
    }

    @java.lang.Deprecated
    public static int resolveSizeAndState(int r0, int r1, int r2) {
            int r0 = android.view.View.resolveSizeAndState(r0, r1, r2)
            return r0
    }

    public static boolean restoreDefaultFocus(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.ViewCompat.Api26Impl.restoreDefaultFocus(r2)
            return r2
        Lb:
            boolean r2 = r2.requestFocus()
            return r2
    }

    public static void saveAttributeDataForStyleable(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull @android.annotation.SuppressLint({"ContextFirst"}) android.content.Context r3, @androidx.annotation.NonNull int[] r4, @androidx.annotation.Nullable android.util.AttributeSet r5, @androidx.annotation.NonNull android.content.res.TypedArray r6, int r7, int r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api29Impl.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, r7, r8)
        L9:
            return
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean> screenReaderFocusableProperty() {
            androidx.core.view.ViewCompat$1 r0 = new androidx.core.view.ViewCompat$1
            int r1 = androidx.core.R.id.tag_screen_reader_focusable
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r3 = 28
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static void setAccessibilityDelegate(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable androidx.core.view.AccessibilityDelegateCompat r2) {
            if (r2 != 0) goto Lf
            android.view.View$AccessibilityDelegate r0 = getAccessibilityDelegateInternal(r1)
            boolean r0 = r0 instanceof androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter
            if (r0 == 0) goto Lf
            androidx.core.view.AccessibilityDelegateCompat r2 = new androidx.core.view.AccessibilityDelegateCompat
            r2.<init>()
        Lf:
            setImportantForAccessibilityIfNeeded(r1)
            if (r2 != 0) goto L16
            r2 = 0
            goto L1a
        L16:
            android.view.View$AccessibilityDelegate r2 = r2.getBridge()
        L1a:
            r1.setAccessibilityDelegate(r2)
            return
    }

    @androidx.annotation.UiThread
    public static void setAccessibilityHeading(@androidx.annotation.NonNull android.view.View r1, boolean r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = accessibilityHeadingProperty()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.set(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void setAccessibilityLiveRegion(@androidx.annotation.NonNull android.view.View r0, int r1) {
            r0.setAccessibilityLiveRegion(r1)
            return
    }

    @androidx.annotation.UiThread
    public static void setAccessibilityPaneTitle(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.CharSequence r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = paneTitleProperty()
            r0.set(r1, r2)
            if (r2 == 0) goto Lf
            androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager r2 = androidx.core.view.ViewCompat.sAccessibilityPaneVisibilityManager
            r2.addAccessibilityPane(r1)
            return
        Lf:
            androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager r2 = androidx.core.view.ViewCompat.sAccessibilityPaneVisibilityManager
            r2.removeAccessibilityPane(r1)
            return
    }

    @java.lang.Deprecated
    public static void setActivated(android.view.View r0, boolean r1) {
            r0.setActivated(r1)
            return
    }

    @java.lang.Deprecated
    public static void setAlpha(android.view.View r0, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r1) {
            r0.setAlpha(r1)
            return
    }

    public static void setAutofillHints(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable java.lang.String... r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setAutofillHints(r2, r3)
        L9:
            return
    }

    public static void setAutofillId(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable androidx.core.view.autofill.AutofillIdCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api28Impl.setAutofillId(r2, r3)
        L9:
            return
    }

    @java.lang.Deprecated
    public static void setBackground(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0.setBackground(r1)
            return
    }

    public static void setBackgroundTintList(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            androidx.core.view.ViewCompat.Api21Impl.setBackgroundTintList(r1, r2)
            r2 = 21
            if (r0 != r2) goto L31
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            android.content.res.ColorStateList r0 = androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintList(r1)
            if (r0 != 0) goto L1c
            android.graphics.PorterDuff$Mode r0 = androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintMode(r1)
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = 0
            goto L1d
        L1c:
            r0 = 1
        L1d:
            if (r2 == 0) goto L31
            if (r0 == 0) goto L31
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L2e
            int[] r0 = r1.getDrawableState()
            r2.setState(r0)
        L2e:
            r1.setBackground(r2)
        L31:
            return
    }

    public static void setBackgroundTintMode(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            androidx.core.view.ViewCompat.Api21Impl.setBackgroundTintMode(r1, r2)
            r2 = 21
            if (r0 != r2) goto L31
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            android.content.res.ColorStateList r0 = androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintList(r1)
            if (r0 != 0) goto L1c
            android.graphics.PorterDuff$Mode r0 = androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintMode(r1)
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = 0
            goto L1d
        L1c:
            r0 = 1
        L1d:
            if (r2 == 0) goto L31
            if (r0 == 0) goto L31
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L2e
            int[] r0 = r1.getDrawableState()
            r2.setState(r0)
        L2e:
            r1.setBackground(r2)
        L31:
            return
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    @java.lang.Deprecated
    public static void setChildrenDrawingOrderEnabled(android.view.ViewGroup r6, boolean r7) {
            java.lang.reflect.Method r0 = androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1b
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            java.lang.String r3 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L16
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L16
            r4[r1] = r5     // Catch: java.lang.NoSuchMethodException -> L16
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L16
            androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod = r0     // Catch: java.lang.NoSuchMethodException -> L16
        L16:
            java.lang.reflect.Method r0 = androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod
            r0.setAccessible(r2)
        L1b:
            java.lang.reflect.Method r0 = androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod     // Catch: java.lang.Throwable -> L28
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L28
            r2[r1] = r7     // Catch: java.lang.Throwable -> L28
            r0.invoke(r6, r2)     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }

    @java.lang.Deprecated
    public static void setClipBounds(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Nullable android.graphics.Rect r1) {
            r0.setClipBounds(r1)
            return
    }

    public static void setContentCaptureSession(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable androidx.core.view.contentcapture.ContentCaptureSessionCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api29Impl.setContentCaptureSession(r2, r3)
        L9:
            return
    }

    public static void setElevation(@androidx.annotation.NonNull android.view.View r0, float r1) {
            androidx.core.view.ViewCompat.Api21Impl.setElevation(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void setFitsSystemWindows(android.view.View r0, boolean r1) {
            r0.setFitsSystemWindows(r1)
            return
    }

    public static void setFocusedByDefault(@androidx.annotation.NonNull android.view.View r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setFocusedByDefault(r2, r3)
        L9:
            return
    }

    @java.lang.Deprecated
    public static void setHasTransientState(@androidx.annotation.NonNull android.view.View r0, boolean r1) {
            r0.setHasTransientState(r1)
            return
    }

    @androidx.annotation.UiThread
    @java.lang.Deprecated
    public static void setImportantForAccessibility(@androidx.annotation.NonNull android.view.View r0, int r1) {
            r0.setImportantForAccessibility(r1)
            return
    }

    private static void setImportantForAccessibilityIfNeeded(android.view.View r1) {
            int r0 = r1.getImportantForAccessibility()
            if (r0 != 0) goto La
            r0 = 1
            r1.setImportantForAccessibility(r0)
        La:
            return
    }

    public static void setImportantForAutofill(@androidx.annotation.NonNull android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setImportantForAutofill(r2, r3)
        L9:
            return
    }

    public static void setImportantForContentCapture(@androidx.annotation.NonNull android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api30Impl.setImportantForContentCapture(r2, r3)
        L9:
            return
    }

    public static void setKeyboardNavigationCluster(@androidx.annotation.NonNull android.view.View r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setKeyboardNavigationCluster(r2, r3)
        L9:
            return
    }

    @java.lang.Deprecated
    public static void setLabelFor(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.IdRes int r1) {
            r0.setLabelFor(r1)
            return
    }

    @java.lang.Deprecated
    public static void setLayerPaint(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Nullable android.graphics.Paint r1) {
            r0.setLayerPaint(r1)
            return
    }

    @java.lang.Deprecated
    public static void setLayerType(android.view.View r0, int r1, android.graphics.Paint r2) {
            r0.setLayerType(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void setLayoutDirection(@androidx.annotation.NonNull android.view.View r0, int r1) {
            r0.setLayoutDirection(r1)
            return
    }

    public static void setNestedScrollingEnabled(@androidx.annotation.NonNull android.view.View r0, boolean r1) {
            androidx.core.view.ViewCompat.Api21Impl.setNestedScrollingEnabled(r0, r1)
            return
    }

    public static void setNextClusterForwardId(@androidx.annotation.NonNull android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setNextClusterForwardId(r2, r3)
        L9:
            return
    }

    public static void setOnApplyWindowInsetsListener(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Nullable androidx.core.view.OnApplyWindowInsetsListener r1) {
            androidx.core.view.ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(r0, r1)
            return
    }

    public static void setOnReceiveContentListener(@androidx.annotation.NonNull android.view.View r6, @androidx.annotation.Nullable java.lang.String[] r7, @androidx.annotation.Nullable androidx.core.view.OnReceiveContentListener r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.Api31Impl.setOnReceiveContentListener(r6, r7, r8)
            return
        La:
            if (r7 == 0) goto Lf
            int r0 = r7.length
            if (r0 != 0) goto L10
        Lf:
            r7 = 0
        L10:
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L1e
            if (r7 == 0) goto L18
            r2 = 1
            goto L19
        L18:
            r2 = 0
        L19:
            java.lang.String r3 = "When the listener is set, MIME types must also be set"
            androidx.core.util.Preconditions.checkArgument(r2, r3)
        L1e:
            if (r7 == 0) goto L4c
            int r2 = r7.length
            r3 = 0
        L22:
            if (r3 >= r2) goto L33
            r4 = r7[r3]
            java.lang.String r5 = "*"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L30
            r0 = 1
            goto L33
        L30:
            int r3 = r3 + 1
            goto L22
        L33:
            r0 = r0 ^ r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "A MIME type set here must not start with *: "
            r1.append(r2)
            java.lang.String r2 = java.util.Arrays.toString(r7)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.core.util.Preconditions.checkArgument(r0, r1)
        L4c:
            int r0 = androidx.core.R.id.tag_on_receive_content_mime_types
            r6.setTag(r0, r7)
            int r7 = androidx.core.R.id.tag_on_receive_content_listener
            r6.setTag(r7, r8)
            return
    }

    @java.lang.Deprecated
    public static void setOverScrollMode(android.view.View r0, int r1) {
            r0.setOverScrollMode(r1)
            return
    }

    @java.lang.Deprecated
    public static void setPaddingRelative(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Px int r1, @androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @androidx.annotation.Px int r4) {
            r0.setPaddingRelative(r1, r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    public static void setPivotX(android.view.View r0, float r1) {
            r0.setPivotX(r1)
            return
    }

    @java.lang.Deprecated
    public static void setPivotY(android.view.View r0, float r1) {
            r0.setPivotY(r1)
            return
    }

    public static void setPointerIcon(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable androidx.core.view.PointerIconCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L15
            if (r3 == 0) goto Ld
            java.lang.Object r3 = r3.getPointerIcon()
            goto Le
        Ld:
            r3 = 0
        Le:
            android.view.PointerIcon r3 = androidx.core.view.g0.a(r3)
            androidx.core.view.ViewCompat.Api24Impl.setPointerIcon(r2, r3)
        L15:
            return
    }

    @java.lang.Deprecated
    public static void setRotation(android.view.View r0, float r1) {
            r0.setRotation(r1)
            return
    }

    @java.lang.Deprecated
    public static void setRotationX(android.view.View r0, float r1) {
            r0.setRotationX(r1)
            return
    }

    @java.lang.Deprecated
    public static void setRotationY(android.view.View r0, float r1) {
            r0.setRotationY(r1)
            return
    }

    @java.lang.Deprecated
    public static void setSaveFromParentEnabled(android.view.View r0, boolean r1) {
            r0.setSaveFromParentEnabled(r1)
            return
    }

    @java.lang.Deprecated
    public static void setScaleX(android.view.View r0, float r1) {
            r0.setScaleX(r1)
            return
    }

    @java.lang.Deprecated
    public static void setScaleY(android.view.View r0, float r1) {
            r0.setScaleY(r1)
            return
    }

    @androidx.annotation.UiThread
    public static void setScreenReaderFocusable(@androidx.annotation.NonNull android.view.View r1, boolean r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = screenReaderFocusableProperty()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.set(r1, r2)
            return
    }

    public static void setScrollIndicators(@androidx.annotation.NonNull android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api23Impl.setScrollIndicators(r2, r3)
        L9:
            return
    }

    public static void setScrollIndicators(@androidx.annotation.NonNull android.view.View r2, int r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api23Impl.setScrollIndicators(r2, r3, r4)
        L9:
            return
    }

    @androidx.annotation.UiThread
    public static void setStateDescription(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.CharSequence r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = stateDescriptionProperty()
            r0.set(r1, r2)
            return
    }

    public static void setSystemGestureExclusionRects(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull java.util.List<android.graphics.Rect> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api29Impl.setSystemGestureExclusionRects(r2, r3)
        L9:
            return
    }

    public static void setTooltipText(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable java.lang.CharSequence r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setTooltipText(r2, r3)
        L9:
            return
    }

    public static void setTransitionName(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Nullable java.lang.String r1) {
            androidx.core.view.ViewCompat.Api21Impl.setTransitionName(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void setTranslationX(android.view.View r0, float r1) {
            r0.setTranslationX(r1)
            return
    }

    @java.lang.Deprecated
    public static void setTranslationY(android.view.View r0, float r1) {
            r0.setTranslationY(r1)
            return
    }

    public static void setTranslationZ(@androidx.annotation.NonNull android.view.View r0, float r1) {
            androidx.core.view.ViewCompat.Api21Impl.setTranslationZ(r0, r1)
            return
    }

    public static void setWindowInsetsAnimationCallback(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Nullable androidx.core.view.WindowInsetsAnimationCompat.Callback r1) {
            androidx.core.view.WindowInsetsAnimationCompat.setCallback(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void setX(android.view.View r0, float r1) {
            r0.setX(r1)
            return
    }

    @java.lang.Deprecated
    public static void setY(android.view.View r0, float r1) {
            r0.setY(r1)
            return
    }

    public static void setZ(@androidx.annotation.NonNull android.view.View r0, float r1) {
            androidx.core.view.ViewCompat.Api21Impl.setZ(r0, r1)
            return
    }

    public static boolean startDragAndDrop(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable android.content.ClipData r3, @androidx.annotation.NonNull android.view.View.DragShadowBuilder r4, @androidx.annotation.Nullable java.lang.Object r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.ViewCompat.Api24Impl.startDragAndDrop(r2, r3, r4, r5, r6)
            return r2
        Lb:
            boolean r2 = r2.startDrag(r3, r4, r5, r6)
            return r2
    }

    public static boolean startNestedScroll(@androidx.annotation.NonNull android.view.View r0, int r1) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.startNestedScroll(r0, r1)
            return r0
    }

    public static boolean startNestedScroll(@androidx.annotation.NonNull android.view.View r1, int r2, int r3) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto Lb
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            boolean r1 = r1.startNestedScroll(r2, r3)
            return r1
        Lb:
            if (r3 != 0) goto L12
            boolean r1 = startNestedScroll(r1, r2)
            return r1
        L12:
            r1 = 0
            return r1
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence> stateDescriptionProperty() {
            androidx.core.view.ViewCompat$3 r0 = new androidx.core.view.ViewCompat$3
            int r1 = androidx.core.R.id.tag_state_description
            r2 = 64
            r3 = 30
            java.lang.Class<java.lang.CharSequence> r4 = java.lang.CharSequence.class
            r0.<init>(r1, r4, r2, r3)
            return r0
    }

    public static void stopNestedScroll(@androidx.annotation.NonNull android.view.View r0) {
            androidx.core.view.ViewCompat.Api21Impl.stopNestedScroll(r0)
            return
    }

    public static void stopNestedScroll(@androidx.annotation.NonNull android.view.View r1, int r2) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto La
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            r1.stopNestedScroll(r2)
            return
        La:
            if (r2 != 0) goto Lf
            stopNestedScroll(r1)
        Lf:
            return
    }

    private static void tickleInvalidationFlag(android.view.View r2) {
            float r0 = r2.getTranslationY()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r2.setTranslationY(r1)
            r2.setTranslationY(r0)
            return
    }

    public static void updateDragShadow(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View.DragShadowBuilder r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api24Impl.updateDragShadow(r2, r3)
        L9:
            return
    }
}
