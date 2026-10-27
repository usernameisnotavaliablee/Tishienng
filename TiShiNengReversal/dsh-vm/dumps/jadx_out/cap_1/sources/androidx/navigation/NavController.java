package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NavController {
    private static final java.lang.String KEY_BACK_STACK = "android-support-nav:controller:backStack";
    static final java.lang.String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";
    static final java.lang.String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";
    static final java.lang.String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";

    @androidx.annotation.NonNull
    public static final java.lang.String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";
    private static final java.lang.String KEY_NAVIGATOR_STATE = "android-support-nav:controller:navigatorState";
    private static final java.lang.String KEY_NAVIGATOR_STATE_NAMES = "android-support-nav:controller:navigatorState:names";
    private static final java.lang.String TAG = "NavController";
    private android.app.Activity mActivity;
    final java.util.Deque<androidx.navigation.NavBackStackEntry> mBackStack;
    private android.os.Parcelable[] mBackStackToRestore;
    private final android.content.Context mContext;
    private boolean mDeepLinkHandled;
    private boolean mEnableOnBackPressedCallback;
    androidx.navigation.NavGraph mGraph;
    private androidx.navigation.NavInflater mInflater;
    private final androidx.lifecycle.LifecycleObserver mLifecycleObserver;
    private androidx.lifecycle.LifecycleOwner mLifecycleOwner;
    private androidx.navigation.NavigatorProvider mNavigatorProvider;
    private android.os.Bundle mNavigatorStateToRestore;
    private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.navigation.NavController.OnDestinationChangedListener> mOnDestinationChangedListeners;
    private androidx.navigation.NavControllerViewModel mViewModel;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnDestinationChangedListener {
        void onDestinationChanged(@androidx.annotation.NonNull androidx.navigation.NavController r1, @androidx.annotation.NonNull androidx.navigation.NavDestination r2, @androidx.annotation.Nullable android.os.Bundle r3);
    }

    public NavController(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.mBackStack = r0
            androidx.navigation.NavigatorProvider r0 = new androidx.navigation.NavigatorProvider
            r0.<init>()
            r2.mNavigatorProvider = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.mOnDestinationChangedListeners = r0
            androidx.navigation.NavController$1 r0 = new androidx.navigation.NavController$1
            r0.<init>(r2)
            r2.mLifecycleObserver = r0
            androidx.navigation.NavController$2 r0 = new androidx.navigation.NavController$2
            r1 = 0
            r0.<init>(r2, r1)
            r2.mOnBackPressedCallback = r0
            r0 = 1
            r2.mEnableOnBackPressedCallback = r0
            r2.mContext = r3
        L2c:
            boolean r0 = r3 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L40
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L39
            android.app.Activity r3 = (android.app.Activity) r3
            r2.mActivity = r3
            goto L40
        L39:
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            goto L2c
        L40:
            androidx.navigation.NavigatorProvider r3 = r2.mNavigatorProvider
            androidx.navigation.NavGraphNavigator r0 = new androidx.navigation.NavGraphNavigator
            r0.<init>(r3)
            r3.addNavigator(r0)
            androidx.navigation.NavigatorProvider r3 = r2.mNavigatorProvider
            androidx.navigation.ActivityNavigator r0 = new androidx.navigation.ActivityNavigator
            android.content.Context r1 = r2.mContext
            r0.<init>(r1)
            r3.addNavigator(r0)
            return
    }

    private boolean dispatchOnDestinationChanged() {
            r10 = this;
        L0:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r10.mBackStack
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L30
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r10.mBackStack
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r0 = r0.getDestination()
            boolean r0 = r0 instanceof androidx.navigation.NavGraph
            if (r0 == 0) goto L30
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r10.mBackStack
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r0 = r0.getDestination()
            int r0 = r0.getId()
            boolean r0 = r10.popBackStackInternal(r0, r1)
            if (r0 == 0) goto L30
            goto L0
        L30:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r10.mBackStack
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L110
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r10.mBackStack
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r0 = r0.getDestination()
            boolean r2 = r0 instanceof androidx.navigation.FloatingWindow
            if (r2 == 0) goto L67
            java.util.Deque<androidx.navigation.NavBackStackEntry> r2 = r10.mBackStack
            java.util.Iterator r2 = r2.descendingIterator()
        L4e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r2.next()
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            androidx.navigation.NavDestination r3 = r3.getDestination()
            boolean r4 = r3 instanceof androidx.navigation.NavGraph
            if (r4 != 0) goto L4e
            boolean r4 = r3 instanceof androidx.navigation.FloatingWindow
            if (r4 != 0) goto L4e
            goto L68
        L67:
            r3 = 0
        L68:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Deque<androidx.navigation.NavBackStackEntry> r4 = r10.mBackStack
            java.util.Iterator r4 = r4.descendingIterator()
        L73:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lc7
            java.lang.Object r5 = r4.next()
            androidx.navigation.NavBackStackEntry r5 = (androidx.navigation.NavBackStackEntry) r5
            androidx.lifecycle.Lifecycle$State r6 = r5.getMaxLifecycle()
            androidx.navigation.NavDestination r7 = r5.getDestination()
            if (r0 == 0) goto L9f
            int r8 = r7.getId()
            int r9 = r0.getId()
            if (r8 != r9) goto L9f
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r6 == r7) goto L9a
            r2.put(r5, r7)
        L9a:
            androidx.navigation.NavGraph r0 = r0.getParent()
            goto L73
        L9f:
            if (r3 == 0) goto Lc1
            int r7 = r7.getId()
            int r8 = r3.getId()
            if (r7 != r8) goto Lc1
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r6 != r7) goto Lb5
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.STARTED
            r5.setMaxLifecycle(r6)
            goto Lbc
        Lb5:
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.STARTED
            if (r6 == r7) goto Lbc
            r2.put(r5, r7)
        Lbc:
            androidx.navigation.NavGraph r3 = r3.getParent()
            goto L73
        Lc1:
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.CREATED
            r5.setMaxLifecycle(r6)
            goto L73
        Lc7:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r10.mBackStack
            java.util.Iterator r0 = r0.iterator()
        Lcd:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Le9
            java.lang.Object r3 = r0.next()
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            java.lang.Object r4 = r2.get(r3)
            androidx.lifecycle.Lifecycle$State r4 = (androidx.lifecycle.Lifecycle.State) r4
            if (r4 == 0) goto Le5
            r3.setMaxLifecycle(r4)
            goto Lcd
        Le5:
            r3.updateState()
            goto Lcd
        Le9:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r10.mBackStack
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            java.util.concurrent.CopyOnWriteArrayList<androidx.navigation.NavController$OnDestinationChangedListener> r2 = r10.mOnDestinationChangedListeners
            java.util.Iterator r2 = r2.iterator()
        Lf7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L10f
            java.lang.Object r3 = r2.next()
            androidx.navigation.NavController$OnDestinationChangedListener r3 = (androidx.navigation.NavController.OnDestinationChangedListener) r3
            androidx.navigation.NavDestination r4 = r0.getDestination()
            android.os.Bundle r5 = r0.getArguments()
            r3.onDestinationChanged(r10, r4, r5)
            goto Lf7
        L10f:
            return r1
        L110:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    private java.lang.String findInvalidDestinationDisplayNameInDeepLink(@androidx.annotation.NonNull int[] r6) {
            r5 = this;
            androidx.navigation.NavGraph r0 = r5.mGraph
            r1 = 0
        L3:
            int r2 = r6.length
            r3 = 0
            if (r1 >= r2) goto L46
            r2 = r6[r1]
            if (r1 != 0) goto L16
            androidx.navigation.NavGraph r4 = r5.mGraph
            int r4 = r4.getId()
            if (r4 != r2) goto L1a
            androidx.navigation.NavGraph r3 = r5.mGraph
            goto L1a
        L16:
            androidx.navigation.NavDestination r3 = r0.findNode(r2)
        L1a:
            if (r3 != 0) goto L23
            android.content.Context r6 = r5.mContext
            java.lang.String r6 = androidx.navigation.NavDestination.getDisplayName(r6, r2)
            return r6
        L23:
            int r2 = r6.length
            int r2 = r2 + (-1)
            if (r1 == r2) goto L43
            androidx.navigation.NavGraph r3 = (androidx.navigation.NavGraph) r3
        L2a:
            int r0 = r3.getStartDestination()
            androidx.navigation.NavDestination r0 = r3.findNode(r0)
            boolean r0 = r0 instanceof androidx.navigation.NavGraph
            if (r0 == 0) goto L42
            int r0 = r3.getStartDestination()
            androidx.navigation.NavDestination r0 = r3.findNode(r0)
            r3 = r0
            androidx.navigation.NavGraph r3 = (androidx.navigation.NavGraph) r3
            goto L2a
        L42:
            r0 = r3
        L43:
            int r1 = r1 + 1
            goto L3
        L46:
            return r3
    }

    private int getDestinationCountOnBackStack() {
            r3 = this;
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r3.mBackStack
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r0.next()
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            androidx.navigation.NavDestination r2 = r2.getDestination()
            boolean r2 = r2 instanceof androidx.navigation.NavGraph
            if (r2 != 0) goto L7
            int r1 = r1 + 1
            goto L7
        L1e:
            return r1
    }

    private void navigate(@androidx.annotation.NonNull androidx.navigation.NavDestination r17, @androidx.annotation.Nullable android.os.Bundle r18, @androidx.annotation.Nullable androidx.navigation.NavOptions r19, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = 0
            if (r2 == 0) goto L1d
            int r4 = r2.getPopUpTo()
            r5 = -1
            if (r4 == r5) goto L1d
            int r4 = r2.getPopUpTo()
            boolean r5 = r2.isPopUpToInclusive()
            boolean r4 = r0.popBackStackInternal(r4, r5)
            goto L1e
        L1d:
            r4 = 0
        L1e:
            androidx.navigation.NavigatorProvider r5 = r0.mNavigatorProvider
            java.lang.String r6 = r1.getNavigatorName()
            androidx.navigation.Navigator r5 = r5.getNavigator(r6)
            android.os.Bundle r9 = r17.addInDefaultArgs(r18)
            r6 = r20
            androidx.navigation.NavDestination r12 = r5.navigate(r1, r9, r2, r6)
            r5 = 1
            if (r12 == 0) goto L17b
            boolean r2 = r12 instanceof androidx.navigation.FloatingWindow
            if (r2 != 0) goto L68
        L39:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r2 = r0.mBackStack
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L68
            java.util.Deque<androidx.navigation.NavBackStackEntry> r2 = r0.mBackStack
            java.lang.Object r2 = r2.peekLast()
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            androidx.navigation.NavDestination r2 = r2.getDestination()
            boolean r2 = r2 instanceof androidx.navigation.FloatingWindow
            if (r2 == 0) goto L68
            java.util.Deque<androidx.navigation.NavBackStackEntry> r2 = r0.mBackStack
            java.lang.Object r2 = r2.peekLast()
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            androidx.navigation.NavDestination r2 = r2.getDestination()
            int r2 = r2.getId()
            boolean r2 = r0.popBackStackInternal(r2, r5)
            if (r2 == 0) goto L68
            goto L39
        L68:
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            boolean r6 = r1 instanceof androidx.navigation.NavGraph
            if (r6 == 0) goto Laa
            r6 = r12
        L72:
            androidx.navigation.NavGraph r8 = r6.getParent()
            if (r8 == 0) goto La3
            androidx.navigation.NavBackStackEntry r6 = new androidx.navigation.NavBackStackEntry
            android.content.Context r7 = r0.mContext
            androidx.lifecycle.LifecycleOwner r10 = r0.mLifecycleOwner
            androidx.navigation.NavControllerViewModel r11 = r0.mViewModel
            r6.<init>(r7, r8, r9, r10, r11)
            r2.addFirst(r6)
            java.util.Deque<androidx.navigation.NavBackStackEntry> r6 = r0.mBackStack
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto La3
            java.util.Deque<androidx.navigation.NavBackStackEntry> r6 = r0.mBackStack
            java.lang.Object r6 = r6.getLast()
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            androidx.navigation.NavDestination r6 = r6.getDestination()
            if (r6 != r8) goto La3
            int r6 = r8.getId()
            r0.popBackStackInternal(r6, r5)
        La3:
            if (r8 == 0) goto Laa
            if (r8 != r1) goto La8
            goto Laa
        La8:
            r6 = r8
            goto L72
        Laa:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Lb2
            r1 = r12
            goto Lbc
        Lb2:
            java.lang.Object r1 = r2.getFirst()
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            androidx.navigation.NavDestination r1 = r1.getDestination()
        Lbc:
            if (r1 == 0) goto Lde
            int r6 = r1.getId()
            androidx.navigation.NavDestination r6 = r0.findDestination(r6)
            if (r6 != 0) goto Lde
            androidx.navigation.NavGraph r8 = r1.getParent()
            if (r8 == 0) goto Ldc
            androidx.navigation.NavBackStackEntry r6 = new androidx.navigation.NavBackStackEntry
            android.content.Context r7 = r0.mContext
            androidx.lifecycle.LifecycleOwner r10 = r0.mLifecycleOwner
            androidx.navigation.NavControllerViewModel r11 = r0.mViewModel
            r6.<init>(r7, r8, r9, r10, r11)
            r2.addFirst(r6)
        Ldc:
            r1 = r8
            goto Lbc
        Lde:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Le6
            r1 = r12
            goto Lf0
        Le6:
            java.lang.Object r1 = r2.getLast()
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            androidx.navigation.NavDestination r1 = r1.getDestination()
        Lf0:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r6 = r0.mBackStack
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L137
            java.util.Deque<androidx.navigation.NavBackStackEntry> r6 = r0.mBackStack
            java.lang.Object r6 = r6.getLast()
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            androidx.navigation.NavDestination r6 = r6.getDestination()
            boolean r6 = r6 instanceof androidx.navigation.NavGraph
            if (r6 == 0) goto L137
            java.util.Deque<androidx.navigation.NavBackStackEntry> r6 = r0.mBackStack
            java.lang.Object r6 = r6.getLast()
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            androidx.navigation.NavDestination r6 = r6.getDestination()
            androidx.navigation.NavGraph r6 = (androidx.navigation.NavGraph) r6
            int r7 = r1.getId()
            androidx.navigation.NavDestination r6 = r6.findNode(r7, r3)
            if (r6 != 0) goto L137
            java.util.Deque<androidx.navigation.NavBackStackEntry> r6 = r0.mBackStack
            java.lang.Object r6 = r6.getLast()
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            androidx.navigation.NavDestination r6 = r6.getDestination()
            int r6 = r6.getId()
            boolean r6 = r0.popBackStackInternal(r6, r5)
            if (r6 == 0) goto L137
            goto Lf0
        L137:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r1 = r0.mBackStack
            r1.addAll(r2)
            java.util.Deque<androidx.navigation.NavBackStackEntry> r1 = r0.mBackStack
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L154
            java.util.Deque<androidx.navigation.NavBackStackEntry> r1 = r0.mBackStack
            java.lang.Object r1 = r1.getFirst()
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            androidx.navigation.NavDestination r1 = r1.getDestination()
            androidx.navigation.NavGraph r2 = r0.mGraph
            if (r1 == r2) goto L166
        L154:
            androidx.navigation.NavBackStackEntry r6 = new androidx.navigation.NavBackStackEntry
            android.content.Context r7 = r0.mContext
            androidx.navigation.NavGraph r8 = r0.mGraph
            androidx.lifecycle.LifecycleOwner r10 = r0.mLifecycleOwner
            androidx.navigation.NavControllerViewModel r11 = r0.mViewModel
            r6.<init>(r7, r8, r9, r10, r11)
            java.util.Deque<androidx.navigation.NavBackStackEntry> r1 = r0.mBackStack
            r1.addFirst(r6)
        L166:
            androidx.navigation.NavBackStackEntry r10 = new androidx.navigation.NavBackStackEntry
            android.content.Context r11 = r0.mContext
            android.os.Bundle r13 = r12.addInDefaultArgs(r9)
            androidx.lifecycle.LifecycleOwner r14 = r0.mLifecycleOwner
            androidx.navigation.NavControllerViewModel r15 = r0.mViewModel
            r10.<init>(r11, r12, r13, r14, r15)
            java.util.Deque<androidx.navigation.NavBackStackEntry> r1 = r0.mBackStack
            r1.add(r10)
            goto L191
        L17b:
            if (r2 == 0) goto L191
            boolean r1 = r2.shouldLaunchSingleTop()
            if (r1 == 0) goto L191
            java.util.Deque<androidx.navigation.NavBackStackEntry> r1 = r0.mBackStack
            java.lang.Object r1 = r1.peekLast()
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            if (r1 == 0) goto L190
            r1.replaceArguments(r9)
        L190:
            r3 = 1
        L191:
            r0.updateOnBackPressedCallbackEnabled()
            if (r4 != 0) goto L19c
            if (r12 != 0) goto L19c
            if (r3 == 0) goto L19b
            goto L19c
        L19b:
            return
        L19c:
            r0.dispatchOnDestinationChanged()
            return
    }

    private void onGraphCreated(@androidx.annotation.Nullable android.os.Bundle r15) {
            r14 = this;
            android.os.Bundle r0 = r14.mNavigatorStateToRestore
            if (r0 == 0) goto L2e
            java.lang.String r1 = "android-support-nav:controller:navigatorState:names"
            java.util.ArrayList r0 = r0.getStringArrayList(r1)
            if (r0 == 0) goto L2e
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            androidx.navigation.NavigatorProvider r2 = r14.mNavigatorProvider
            androidx.navigation.Navigator r2 = r2.getNavigator(r1)
            android.os.Bundle r3 = r14.mNavigatorStateToRestore
            android.os.Bundle r1 = r3.getBundle(r1)
            if (r1 == 0) goto L10
            r2.onRestoreState(r1)
            goto L10
        L2e:
            android.os.Parcelable[] r0 = r14.mBackStackToRestore
            r1 = 0
            if (r0 == 0) goto La1
            int r2 = r0.length
            r3 = 0
        L35:
            if (r3 >= r2) goto L9c
            r4 = r0[r3]
            androidx.navigation.NavBackStackEntryState r4 = (androidx.navigation.NavBackStackEntryState) r4
            int r5 = r4.getDestinationId()
            androidx.navigation.NavDestination r8 = r14.findDestination(r5)
            if (r8 == 0) goto L6f
            android.os.Bundle r9 = r4.getArgs()
            if (r9 == 0) goto L54
            android.content.Context r5 = r14.mContext
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r9.setClassLoader(r5)
        L54:
            androidx.navigation.NavBackStackEntry r6 = new androidx.navigation.NavBackStackEntry
            android.content.Context r7 = r14.mContext
            androidx.lifecycle.LifecycleOwner r10 = r14.mLifecycleOwner
            androidx.navigation.NavControllerViewModel r11 = r14.mViewModel
            java.util.UUID r12 = r4.getUUID()
            android.os.Bundle r13 = r4.getSavedState()
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            java.util.Deque<androidx.navigation.NavBackStackEntry> r4 = r14.mBackStack
            r4.add(r6)
            int r3 = r3 + 1
            goto L35
        L6f:
            android.content.Context r15 = r14.mContext
            int r0 = r4.getDestinationId()
            java.lang.String r15 = androidx.navigation.NavDestination.getDisplayName(r15, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Restoring the Navigation back stack failed: destination "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = " cannot be found from the current destination "
            r1.append(r15)
            androidx.navigation.NavDestination r15 = r14.getCurrentDestination()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L9c:
            r14.updateOnBackPressedCallbackEnabled()
            r14.mBackStackToRestore = r1
        La1:
            androidx.navigation.NavGraph r0 = r14.mGraph
            if (r0 == 0) goto Lc6
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r14.mBackStack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc6
            boolean r0 = r14.mDeepLinkHandled
            if (r0 != 0) goto Lc0
            android.app.Activity r0 = r14.mActivity
            if (r0 == 0) goto Lc0
            android.content.Intent r0 = r0.getIntent()
            boolean r0 = r14.handleDeepLink(r0)
            if (r0 == 0) goto Lc0
            return
        Lc0:
            androidx.navigation.NavGraph r0 = r14.mGraph
            r14.navigate(r0, r15, r1, r1)
            return
        Lc6:
            r14.dispatchOnDestinationChanged()
            return
    }

    private void updateOnBackPressedCallbackEnabled() {
            r3 = this;
            androidx.activity.OnBackPressedCallback r0 = r3.mOnBackPressedCallback
            boolean r1 = r3.mEnableOnBackPressedCallback
            if (r1 == 0) goto Le
            int r1 = r3.getDestinationCountOnBackStack()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setEnabled(r2)
            return
    }

    public void addOnDestinationChangedListener(@androidx.annotation.NonNull androidx.navigation.NavController.OnDestinationChangedListener r3) {
            r2 = this;
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r2.mBackStack
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1b
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r2.mBackStack
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r1 = r0.getDestination()
            android.os.Bundle r0 = r0.getArguments()
            r3.onDestinationChanged(r2, r1, r0)
        L1b:
            java.util.concurrent.CopyOnWriteArrayList<androidx.navigation.NavController$OnDestinationChangedListener> r0 = r2.mOnDestinationChangedListeners
            r0.add(r3)
            return
    }

    @androidx.annotation.NonNull
    public androidx.navigation.NavDeepLinkBuilder createDeepLink() {
            r1 = this;
            androidx.navigation.NavDeepLinkBuilder r0 = new androidx.navigation.NavDeepLinkBuilder
            r0.<init>(r1)
            return r0
    }

    void enableOnBackPressed(boolean r1) {
            r0 = this;
            r0.mEnableOnBackPressedCallback = r1
            r0.updateOnBackPressedCallbackEnabled()
            return
    }

    androidx.navigation.NavDestination findDestination(@androidx.annotation.IdRes int r3) {
            r2 = this;
            androidx.navigation.NavGraph r0 = r2.mGraph
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            int r0 = r0.getId()
            if (r0 != r3) goto Lf
            androidx.navigation.NavGraph r3 = r2.mGraph
            return r3
        Lf:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r2.mBackStack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            androidx.navigation.NavGraph r0 = r2.mGraph
            goto L26
        L1a:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r2.mBackStack
            java.lang.Object r0 = r0.getLast()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r0 = r0.getDestination()
        L26:
            boolean r1 = r0 instanceof androidx.navigation.NavGraph
            if (r1 == 0) goto L2d
            androidx.navigation.NavGraph r0 = (androidx.navigation.NavGraph) r0
            goto L31
        L2d:
            androidx.navigation.NavGraph r0 = r0.getParent()
        L31:
            androidx.navigation.NavDestination r3 = r0.findNode(r3)
            return r3
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.util.Deque<androidx.navigation.NavBackStackEntry> getBackStack() {
            r1 = this;
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r1.mBackStack
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.navigation.NavBackStackEntry getBackStackEntry(@androidx.annotation.IdRes int r4) {
            r3 = this;
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r3.mBackStack
            java.util.Iterator r0 = r0.descendingIterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            androidx.navigation.NavDestination r2 = r1.getDestination()
            int r2 = r2.getId()
            if (r2 != r4) goto L6
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L21
            return r1
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No destination with ID "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is on the NavController's back stack. The current destination is "
            r1.append(r4)
            androidx.navigation.NavDestination r4 = r3.getCurrentDestination()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @androidx.annotation.NonNull
    android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.navigation.NavBackStackEntry getCurrentBackStackEntry() {
            r1 = this;
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r1.mBackStack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r1.mBackStack
            java.lang.Object r0 = r0.getLast()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.navigation.NavDestination getCurrentDestination() {
            r1 = this;
            androidx.navigation.NavBackStackEntry r0 = r1.getCurrentBackStackEntry()
            if (r0 == 0) goto Lb
            androidx.navigation.NavDestination r0 = r0.getDestination()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.navigation.NavGraph getGraph() {
            r2 = this;
            androidx.navigation.NavGraph r0 = r2.mGraph
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must call setGraph() before calling getGraph()"
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    public androidx.navigation.NavInflater getNavInflater() {
            r3 = this;
            androidx.navigation.NavInflater r0 = r3.mInflater
            if (r0 != 0) goto Lf
            androidx.navigation.NavInflater r0 = new androidx.navigation.NavInflater
            android.content.Context r1 = r3.mContext
            androidx.navigation.NavigatorProvider r2 = r3.mNavigatorProvider
            r0.<init>(r1, r2)
            r3.mInflater = r0
        Lf:
            androidx.navigation.NavInflater r0 = r3.mInflater
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.navigation.NavigatorProvider getNavigatorProvider() {
            r1 = this;
            androidx.navigation.NavigatorProvider r0 = r1.mNavigatorProvider
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.navigation.NavBackStackEntry getPreviousBackStackEntry() {
            r3 = this;
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r3.mBackStack
            java.util.Iterator r0 = r0.descendingIterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf
            r0.next()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            androidx.navigation.NavDestination r2 = r1.getDestination()
            boolean r2 = r2 instanceof androidx.navigation.NavGraph
            if (r2 != 0) goto Lf
            return r1
        L24:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.lifecycle.ViewModelStoreOwner getViewModelStoreOwner(@androidx.annotation.IdRes int r4) {
            r3 = this;
            androidx.navigation.NavControllerViewModel r0 = r3.mViewModel
            if (r0 == 0) goto L2d
            androidx.navigation.NavBackStackEntry r0 = r3.getBackStackEntry(r4)
            androidx.navigation.NavDestination r1 = r0.getDestination()
            boolean r1 = r1 instanceof androidx.navigation.NavGraph
            if (r1 == 0) goto L11
            return r0
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No NavGraph with ID "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is on the NavController's back stack"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "You must call setViewModelStore() before calling getViewModelStoreOwner()."
            r4.<init>(r0)
            throw r4
    }

    public boolean handleDeepLink(@androidx.annotation.Nullable android.content.Intent r12) {
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            android.os.Bundle r1 = r12.getExtras()
            r2 = 0
            if (r1 == 0) goto L12
            java.lang.String r3 = "android-support-nav:controller:deepLinkIds"
            int[] r3 = r1.getIntArray(r3)
            goto L13
        L12:
            r3 = r2
        L13:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            if (r1 == 0) goto L21
            java.lang.String r5 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r1 = r1.getBundle(r5)
            goto L22
        L21:
            r1 = r2
        L22:
            if (r1 == 0) goto L27
            r4.putAll(r1)
        L27:
            if (r3 == 0) goto L2c
            int r1 = r3.length
            if (r1 != 0) goto L53
        L2c:
            android.net.Uri r1 = r12.getData()
            if (r1 == 0) goto L53
            androidx.navigation.NavGraph r1 = r11.mGraph
            androidx.navigation.NavDeepLinkRequest r5 = new androidx.navigation.NavDeepLinkRequest
            r5.<init>(r12)
            androidx.navigation.NavDestination$DeepLinkMatch r1 = r1.matchDeepLink(r5)
            if (r1 == 0) goto L53
            androidx.navigation.NavDestination r3 = r1.getDestination()
            int[] r5 = r3.buildDeepLinkIds()
            android.os.Bundle r1 = r1.getMatchingArgs()
            android.os.Bundle r1 = r3.addInDefaultArgs(r1)
            r4.putAll(r1)
            r3 = r5
        L53:
            if (r3 == 0) goto L175
            int r1 = r3.length
            if (r1 != 0) goto L5a
            goto L175
        L5a:
            java.lang.String r1 = r11.findInvalidDestinationDisplayNameInDeepLink(r3)
            if (r1 == 0) goto L64
            r12.toString()
            return r0
        L64:
            java.lang.String r1 = "android-support-nav:controller:deepLinkIntent"
            r4.putParcelable(r1, r12)
            int r1 = r12.getFlags()
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r5 = r5 & r1
            r6 = 1
            if (r5 == 0) goto L96
            r7 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r7
            if (r1 != 0) goto L96
            r12.addFlags(r7)
            android.content.Context r1 = r11.mContext
            androidx.core.app.TaskStackBuilder r1 = androidx.core.app.TaskStackBuilder.create(r1)
            androidx.core.app.TaskStackBuilder r12 = r1.addNextIntentWithParentStack(r12)
            r12.startActivities()
            android.app.Activity r12 = r11.mActivity
            if (r12 == 0) goto L95
            r12.finish()
            android.app.Activity r12 = r11.mActivity
            r12.overridePendingTransition(r0, r0)
        L95:
            return r6
        L96:
            java.lang.String r12 = "Deep Linking failed: destination "
            if (r5 == 0) goto Lf7
            java.util.Deque<androidx.navigation.NavBackStackEntry> r1 = r11.mBackStack
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lab
            androidx.navigation.NavGraph r1 = r11.mGraph
            int r1 = r1.getId()
            r11.popBackStackInternal(r1, r6)
        Lab:
            r1 = 0
        Lac:
            int r5 = r3.length
            if (r1 >= r5) goto Lf6
            int r5 = r1 + 1
            r1 = r3[r1]
            androidx.navigation.NavDestination r7 = r11.findDestination(r1)
            if (r7 == 0) goto Lcf
            androidx.navigation.NavOptions$Builder r1 = new androidx.navigation.NavOptions$Builder
            r1.<init>()
            androidx.navigation.NavOptions$Builder r1 = r1.setEnterAnim(r0)
            androidx.navigation.NavOptions$Builder r1 = r1.setExitAnim(r0)
            androidx.navigation.NavOptions r1 = r1.build()
            r11.navigate(r7, r4, r1, r2)
            r1 = r5
            goto Lac
        Lcf:
            android.content.Context r0 = r11.mContext
            java.lang.String r0 = androidx.navigation.NavDestination.getDisplayName(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r0)
            java.lang.String r12 = " cannot be found from the current destination "
            r2.append(r12)
            androidx.navigation.NavDestination r12 = r11.getCurrentDestination()
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r1.<init>(r12)
            throw r1
        Lf6:
            return r6
        Lf7:
            androidx.navigation.NavGraph r1 = r11.mGraph
            r5 = 0
        Lfa:
            int r7 = r3.length
            if (r5 >= r7) goto L172
            r7 = r3[r5]
            if (r5 != 0) goto L104
            androidx.navigation.NavGraph r8 = r11.mGraph
            goto L108
        L104:
            androidx.navigation.NavDestination r8 = r1.findNode(r7)
        L108:
            if (r8 == 0) goto L14f
            int r7 = r3.length
            int r7 = r7 - r6
            if (r5 == r7) goto L12a
            androidx.navigation.NavGraph r8 = (androidx.navigation.NavGraph) r8
        L110:
            int r1 = r8.getStartDestination()
            androidx.navigation.NavDestination r1 = r8.findNode(r1)
            boolean r1 = r1 instanceof androidx.navigation.NavGraph
            if (r1 == 0) goto L128
            int r1 = r8.getStartDestination()
            androidx.navigation.NavDestination r1 = r8.findNode(r1)
            r8 = r1
            androidx.navigation.NavGraph r8 = (androidx.navigation.NavGraph) r8
            goto L110
        L128:
            r1 = r8
            goto L14c
        L12a:
            android.os.Bundle r7 = r8.addInDefaultArgs(r4)
            androidx.navigation.NavOptions$Builder r9 = new androidx.navigation.NavOptions$Builder
            r9.<init>()
            androidx.navigation.NavGraph r10 = r11.mGraph
            int r10 = r10.getId()
            androidx.navigation.NavOptions$Builder r9 = r9.setPopUpTo(r10, r6)
            androidx.navigation.NavOptions$Builder r9 = r9.setEnterAnim(r0)
            androidx.navigation.NavOptions$Builder r9 = r9.setExitAnim(r0)
            androidx.navigation.NavOptions r9 = r9.build()
            r11.navigate(r8, r7, r9, r2)
        L14c:
            int r5 = r5 + 1
            goto Lfa
        L14f:
            android.content.Context r0 = r11.mContext
            java.lang.String r0 = androidx.navigation.NavDestination.getDisplayName(r0, r7)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            r3.append(r0)
            java.lang.String r12 = " cannot be found in graph "
            r3.append(r12)
            r3.append(r1)
            java.lang.String r12 = r3.toString()
            r2.<init>(r12)
            throw r2
        L172:
            r11.mDeepLinkHandled = r6
            return r6
        L175:
            return r0
    }

    public void navigate(@androidx.annotation.IdRes int r2) {
            r1 = this;
            r0 = 0
            r1.navigate(r2, r0)
            return
    }

    public void navigate(@androidx.annotation.IdRes int r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r1 = this;
            r0 = 0
            r1.navigate(r2, r3, r0)
            return
    }

    public void navigate(@androidx.annotation.IdRes int r2, @androidx.annotation.Nullable android.os.Bundle r3, @androidx.annotation.Nullable androidx.navigation.NavOptions r4) {
            r1 = this;
            r0 = 0
            r1.navigate(r2, r3, r4, r0)
            return
    }

    public void navigate(@androidx.annotation.IdRes int r6, @androidx.annotation.Nullable android.os.Bundle r7, @androidx.annotation.Nullable androidx.navigation.NavOptions r8, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r9) {
            r5 = this;
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r5.mBackStack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            androidx.navigation.NavGraph r0 = r5.mGraph
            goto L17
        Lb:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r5.mBackStack
            java.lang.Object r0 = r0.getLast()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r0 = r0.getDestination()
        L17:
            if (r0 == 0) goto Lc3
            androidx.navigation.NavAction r1 = r0.getAction(r6)
            r2 = 0
            if (r1 == 0) goto L39
            if (r8 != 0) goto L26
            androidx.navigation.NavOptions r8 = r1.getNavOptions()
        L26:
            int r3 = r1.getDestinationId()
            android.os.Bundle r4 = r1.getDefaultArguments()
            if (r4 == 0) goto L3a
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r2.putAll(r4)
            goto L3a
        L39:
            r3 = r6
        L3a:
            if (r7 == 0) goto L46
            if (r2 != 0) goto L43
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L43:
            r2.putAll(r7)
        L46:
            if (r3 != 0) goto L5d
            if (r8 == 0) goto L5d
            int r7 = r8.getPopUpTo()
            r4 = -1
            if (r7 == r4) goto L5d
            int r6 = r8.getPopUpTo()
            boolean r7 = r8.isPopUpToInclusive()
            r5.popBackStack(r6, r7)
            return
        L5d:
            if (r3 == 0) goto Lbb
            androidx.navigation.NavDestination r7 = r5.findDestination(r3)
            if (r7 != 0) goto Lb7
            android.content.Context r7 = r5.mContext
            java.lang.String r7 = androidx.navigation.NavDestination.getDisplayName(r7, r3)
            java.lang.String r8 = " cannot be found from the current destination "
            if (r1 == 0) goto L9a
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Navigation destination "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " referenced from action "
            r1.append(r7)
            android.content.Context r7 = r5.mContext
            java.lang.String r6 = androidx.navigation.NavDestination.getDisplayName(r7, r6)
            r1.append(r6)
            r1.append(r8)
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            r9.<init>(r6)
            throw r9
        L9a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "Navigation action/destination "
            r9.append(r1)
            r9.append(r7)
            r9.append(r8)
            r9.append(r0)
            java.lang.String r7 = r9.toString()
            r6.<init>(r7)
            throw r6
        Lb7:
            r5.navigate(r7, r2, r8, r9)
            return
        Lbb:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo"
            r6.<init>(r7)
            throw r6
        Lc3:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "no current navigation node"
            r6.<init>(r7)
            throw r6
    }

    public void navigate(@androidx.annotation.NonNull android.net.Uri r3) {
            r2 = this;
            androidx.navigation.NavDeepLinkRequest r0 = new androidx.navigation.NavDeepLinkRequest
            r1 = 0
            r0.<init>(r3, r1, r1)
            r2.navigate(r0)
            return
    }

    public void navigate(@androidx.annotation.NonNull android.net.Uri r3, @androidx.annotation.Nullable androidx.navigation.NavOptions r4) {
            r2 = this;
            androidx.navigation.NavDeepLinkRequest r0 = new androidx.navigation.NavDeepLinkRequest
            r1 = 0
            r0.<init>(r3, r1, r1)
            r2.navigate(r0, r4)
            return
    }

    public void navigate(@androidx.annotation.NonNull android.net.Uri r3, @androidx.annotation.Nullable androidx.navigation.NavOptions r4, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r5) {
            r2 = this;
            androidx.navigation.NavDeepLinkRequest r0 = new androidx.navigation.NavDeepLinkRequest
            r1 = 0
            r0.<init>(r3, r1, r1)
            r2.navigate(r0, r4, r5)
            return
    }

    public void navigate(@androidx.annotation.NonNull androidx.navigation.NavDeepLinkRequest r2) {
            r1 = this;
            r0 = 0
            r1.navigate(r2, r0)
            return
    }

    public void navigate(@androidx.annotation.NonNull androidx.navigation.NavDeepLinkRequest r2, @androidx.annotation.Nullable androidx.navigation.NavOptions r3) {
            r1 = this;
            r0 = 0
            r1.navigate(r2, r3, r0)
            return
    }

    public void navigate(@androidx.annotation.NonNull androidx.navigation.NavDeepLinkRequest r6, @androidx.annotation.Nullable androidx.navigation.NavOptions r7, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r8) {
            r5 = this;
            androidx.navigation.NavGraph r0 = r5.mGraph
            androidx.navigation.NavDestination$DeepLinkMatch r0 = r0.matchDeepLink(r6)
            if (r0 == 0) goto L3f
            androidx.navigation.NavDestination r1 = r0.getDestination()
            android.os.Bundle r2 = r0.getMatchingArgs()
            android.os.Bundle r1 = r1.addInDefaultArgs(r2)
            if (r1 != 0) goto L1b
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L1b:
            androidx.navigation.NavDestination r0 = r0.getDestination()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.net.Uri r3 = r6.getUri()
            java.lang.String r4 = r6.getMimeType()
            r2.setDataAndType(r3, r4)
            java.lang.String r6 = r6.getAction()
            r2.setAction(r6)
            java.lang.String r6 = "android-support-nav:controller:deepLinkIntent"
            r1.putParcelable(r6, r2)
            r5.navigate(r0, r1, r7, r8)
            return
        L3f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Navigation destination that matches request "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r6 = " cannot be found in the navigation graph "
            r8.append(r6)
            androidx.navigation.NavGraph r6 = r5.mGraph
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
    }

    public void navigate(@androidx.annotation.NonNull androidx.navigation.NavDirections r2) {
            r1 = this;
            int r0 = r2.getActionId()
            android.os.Bundle r2 = r2.getArguments()
            r1.navigate(r0, r2)
            return
    }

    public void navigate(@androidx.annotation.NonNull androidx.navigation.NavDirections r2, @androidx.annotation.Nullable androidx.navigation.NavOptions r3) {
            r1 = this;
            int r0 = r2.getActionId()
            android.os.Bundle r2 = r2.getArguments()
            r1.navigate(r0, r2, r3)
            return
    }

    public void navigate(@androidx.annotation.NonNull androidx.navigation.NavDirections r3, @androidx.annotation.NonNull androidx.navigation.Navigator.Extras r4) {
            r2 = this;
            int r0 = r3.getActionId()
            android.os.Bundle r3 = r3.getArguments()
            r1 = 0
            r2.navigate(r0, r3, r1, r4)
            return
    }

    public boolean navigateUp() {
            r6 = this;
            int r0 = r6.getDestinationCountOnBackStack()
            r1 = 1
            if (r0 != r1) goto L8e
            androidx.navigation.NavDestination r0 = r6.getCurrentDestination()
            int r2 = r0.getId()
            androidx.navigation.NavGraph r0 = r0.getParent()
        L13:
            if (r0 == 0) goto L8c
            int r3 = r0.getStartDestination()
            if (r3 == r2) goto L83
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.app.Activity r3 = r6.mActivity
            if (r3 == 0) goto L63
            android.content.Intent r3 = r3.getIntent()
            if (r3 == 0) goto L63
            android.app.Activity r3 = r6.mActivity
            android.content.Intent r3 = r3.getIntent()
            android.net.Uri r3 = r3.getData()
            if (r3 == 0) goto L63
            android.app.Activity r3 = r6.mActivity
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r4 = "android-support-nav:controller:deepLinkIntent"
            r2.putParcelable(r4, r3)
            androidx.navigation.NavGraph r3 = r6.mGraph
            androidx.navigation.NavDeepLinkRequest r4 = new androidx.navigation.NavDeepLinkRequest
            android.app.Activity r5 = r6.mActivity
            android.content.Intent r5 = r5.getIntent()
            r4.<init>(r5)
            androidx.navigation.NavDestination$DeepLinkMatch r3 = r3.matchDeepLink(r4)
            if (r3 == 0) goto L63
            androidx.navigation.NavDestination r4 = r3.getDestination()
            android.os.Bundle r3 = r3.getMatchingArgs()
            android.os.Bundle r3 = r4.addInDefaultArgs(r3)
            r2.putAll(r3)
        L63:
            androidx.navigation.NavDeepLinkBuilder r3 = new androidx.navigation.NavDeepLinkBuilder
            r3.<init>(r6)
            int r0 = r0.getId()
            androidx.navigation.NavDeepLinkBuilder r0 = r3.setDestination(r0)
            androidx.navigation.NavDeepLinkBuilder r0 = r0.setArguments(r2)
            androidx.core.app.TaskStackBuilder r0 = r0.createTaskStackBuilder()
            r0.startActivities()
            android.app.Activity r0 = r6.mActivity
            if (r0 == 0) goto L82
            r0.finish()
        L82:
            return r1
        L83:
            int r2 = r0.getId()
            androidx.navigation.NavGraph r0 = r0.getParent()
            goto L13
        L8c:
            r0 = 0
            return r0
        L8e:
            boolean r0 = r6.popBackStack()
            return r0
    }

    public boolean popBackStack() {
            r2 = this;
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r2.mBackStack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            androidx.navigation.NavDestination r0 = r2.getCurrentDestination()
            int r0 = r0.getId()
            r1 = 1
            boolean r0 = r2.popBackStack(r0, r1)
            return r0
    }

    public boolean popBackStack(@androidx.annotation.IdRes int r1, boolean r2) {
            r0 = this;
            boolean r1 = r0.popBackStackInternal(r1, r2)
            if (r1 == 0) goto Le
            boolean r1 = r0.dispatchOnDestinationChanged()
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    boolean popBackStackInternal(@androidx.annotation.IdRes int r7, boolean r8) {
            r6 = this;
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r6.mBackStack
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Deque<androidx.navigation.NavBackStackEntry> r2 = r6.mBackStack
            java.util.Iterator r2 = r2.descendingIterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L82
            java.lang.Object r3 = r2.next()
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            androidx.navigation.NavDestination r3 = r3.getDestination()
            androidx.navigation.NavigatorProvider r4 = r6.mNavigatorProvider
            java.lang.String r5 = r3.getNavigatorName()
            androidx.navigation.Navigator r4 = r4.getNavigator(r5)
            if (r8 != 0) goto L37
            int r5 = r3.getId()
            if (r5 == r7) goto L3a
        L37:
            r0.add(r4)
        L3a:
            int r3 = r3.getId()
            if (r3 != r7) goto L15
            java.util.Iterator r7 = r0.iterator()
        L44:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L7e
            java.lang.Object r8 = r7.next()
            androidx.navigation.Navigator r8 = (androidx.navigation.Navigator) r8
            boolean r8 = r8.popBackStack()
            if (r8 == 0) goto L7e
            java.util.Deque<androidx.navigation.NavBackStackEntry> r8 = r6.mBackStack
            java.lang.Object r8 = r8.removeLast()
            androidx.navigation.NavBackStackEntry r8 = (androidx.navigation.NavBackStackEntry) r8
            androidx.lifecycle.Lifecycle r0 = r8.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 == 0) goto L73
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            r8.setMaxLifecycle(r0)
        L73:
            androidx.navigation.NavControllerViewModel r0 = r6.mViewModel
            if (r0 == 0) goto L7c
            java.util.UUID r8 = r8.mId
            r0.clear(r8)
        L7c:
            r1 = 1
            goto L44
        L7e:
            r6.updateOnBackPressedCallbackEnabled()
            return r1
        L82:
            android.content.Context r8 = r6.mContext
            androidx.navigation.NavDestination.getDisplayName(r8, r7)
            return r1
    }

    public void removeOnDestinationChangedListener(@androidx.annotation.NonNull androidx.navigation.NavController.OnDestinationChangedListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.navigation.NavController$OnDestinationChangedListener> r0 = r1.mOnDestinationChangedListeners
            r0.remove(r2)
            return
    }

    @androidx.annotation.CallSuper
    public void restoreState(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            android.content.Context r0 = r1.mContext
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r2.setClassLoader(r0)
            java.lang.String r0 = "android-support-nav:controller:navigatorState"
            android.os.Bundle r0 = r2.getBundle(r0)
            r1.mNavigatorStateToRestore = r0
            java.lang.String r0 = "android-support-nav:controller:backStack"
            android.os.Parcelable[] r0 = r2.getParcelableArray(r0)
            r1.mBackStackToRestore = r0
            java.lang.String r0 = "android-support-nav:controller:deepLinkHandled"
            boolean r2 = r2.getBoolean(r0)
            r1.mDeepLinkHandled = r2
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    public android.os.Bundle saveState() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            androidx.navigation.NavigatorProvider r2 = r7.mNavigatorProvider
            java.util.Map r2 = r2.getNavigators()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            androidx.navigation.Navigator r3 = (androidx.navigation.Navigator) r3
            android.os.Bundle r3 = r3.onSaveState()
            if (r3 == 0) goto L18
            r0.add(r4)
            r1.putBundle(r4, r3)
            goto L18
        L3d:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L53
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "android-support-nav:controller:navigatorState:names"
            r1.putStringArrayList(r3, r0)
            java.lang.String r0 = "android-support-nav:controller:navigatorState"
            r2.putBundle(r0, r1)
            goto L54
        L53:
            r2 = 0
        L54:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r7.mBackStack
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8e
            if (r2 != 0) goto L63
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L63:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r7.mBackStack
            int r0 = r0.size()
            android.os.Parcelable[] r0 = new android.os.Parcelable[r0]
            java.util.Deque<androidx.navigation.NavBackStackEntry> r1 = r7.mBackStack
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L72:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L89
            java.lang.Object r4 = r1.next()
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            int r5 = r3 + 1
            androidx.navigation.NavBackStackEntryState r6 = new androidx.navigation.NavBackStackEntryState
            r6.<init>(r4)
            r0[r3] = r6
            r3 = r5
            goto L72
        L89:
            java.lang.String r1 = "android-support-nav:controller:backStack"
            r2.putParcelableArray(r1, r0)
        L8e:
            boolean r0 = r7.mDeepLinkHandled
            if (r0 == 0) goto La0
            if (r2 != 0) goto L99
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L99:
            java.lang.String r0 = "android-support-nav:controller:deepLinkHandled"
            boolean r1 = r7.mDeepLinkHandled
            r2.putBoolean(r0, r1)
        La0:
            return r2
    }

    @androidx.annotation.CallSuper
    public void setGraph(@androidx.annotation.NavigationRes int r2) {
            r1 = this;
            r0 = 0
            r1.setGraph(r2, r0)
            return
    }

    @androidx.annotation.CallSuper
    public void setGraph(@androidx.annotation.NavigationRes int r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r1 = this;
            androidx.navigation.NavInflater r0 = r1.getNavInflater()
            androidx.navigation.NavGraph r2 = r0.inflate(r2)
            r1.setGraph(r2, r3)
            return
    }

    @androidx.annotation.CallSuper
    public void setGraph(@androidx.annotation.NonNull androidx.navigation.NavGraph r2) {
            r1 = this;
            r0 = 0
            r1.setGraph(r2, r0)
            return
    }

    @androidx.annotation.CallSuper
    public void setGraph(@androidx.annotation.NonNull androidx.navigation.NavGraph r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r2 = this;
            androidx.navigation.NavGraph r0 = r2.mGraph
            if (r0 == 0) goto Lc
            int r0 = r0.getId()
            r1 = 1
            r2.popBackStackInternal(r0, r1)
        Lc:
            r2.mGraph = r3
            r2.onGraphCreated(r4)
            return
    }

    void setLifecycleOwner(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            androidx.lifecycle.LifecycleOwner r0 = r1.mLifecycleOwner
            if (r2 != r0) goto L5
            return
        L5:
            r1.mLifecycleOwner = r2
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            androidx.lifecycle.LifecycleObserver r0 = r1.mLifecycleObserver
            r2.addObserver(r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setNavigatorProvider(@androidx.annotation.NonNull androidx.navigation.NavigatorProvider r2) {
            r1 = this;
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r1.mBackStack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            r1.mNavigatorProvider = r2
            return
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "NavigatorProvider must be set before setGraph call"
            r2.<init>(r0)
            throw r2
    }

    void setOnBackPressedDispatcher(@androidx.annotation.NonNull androidx.activity.OnBackPressedDispatcher r3) {
            r2 = this;
            androidx.lifecycle.LifecycleOwner r0 = r2.mLifecycleOwner
            if (r0 == 0) goto L27
            androidx.activity.OnBackPressedCallback r0 = r2.mOnBackPressedCallback
            r0.remove()
            androidx.lifecycle.LifecycleOwner r0 = r2.mLifecycleOwner
            androidx.activity.OnBackPressedCallback r1 = r2.mOnBackPressedCallback
            r3.addCallback(r0, r1)
            androidx.lifecycle.LifecycleOwner r3 = r2.mLifecycleOwner
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            androidx.lifecycle.LifecycleObserver r0 = r2.mLifecycleObserver
            r3.removeObserver(r0)
            androidx.lifecycle.LifecycleOwner r3 = r2.mLifecycleOwner
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            androidx.lifecycle.LifecycleObserver r0 = r2.mLifecycleObserver
            r3.addObserver(r0)
            return
        L27:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()"
            r3.<init>(r0)
            throw r3
    }

    void setViewModelStore(@androidx.annotation.NonNull androidx.lifecycle.ViewModelStore r3) {
            r2 = this;
            androidx.navigation.NavControllerViewModel r0 = r2.mViewModel
            androidx.navigation.NavControllerViewModel r1 = androidx.navigation.NavControllerViewModel.getInstance(r3)
            if (r0 != r1) goto L9
            return
        L9:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r2.mBackStack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            androidx.navigation.NavControllerViewModel r3 = androidx.navigation.NavControllerViewModel.getInstance(r3)
            r2.mViewModel = r3
            return
        L18:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "ViewModelStore should be set before setGraph call"
            r3.<init>(r0)
            throw r3
    }
}
