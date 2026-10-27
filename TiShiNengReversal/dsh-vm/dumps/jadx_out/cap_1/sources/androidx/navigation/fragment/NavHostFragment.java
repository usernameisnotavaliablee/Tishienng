package androidx.navigation.fragment;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NavHostFragment extends androidx.fragment.app.Fragment implements androidx.navigation.NavHost {
    private static final java.lang.String KEY_DEFAULT_NAV_HOST = "android-support-nav:fragment:defaultHost";
    private static final java.lang.String KEY_GRAPH_ID = "android-support-nav:fragment:graphId";
    private static final java.lang.String KEY_NAV_CONTROLLER_STATE = "android-support-nav:fragment:navControllerState";
    private static final java.lang.String KEY_START_DESTINATION_ARGS = "android-support-nav:fragment:startDestinationArgs";
    private boolean mDefaultNavHost;
    private int mGraphId;
    private java.lang.Boolean mIsPrimaryBeforeOnCreate;
    private androidx.navigation.NavHostController mNavController;
    private android.view.View mViewParent;

    public NavHostFragment() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mIsPrimaryBeforeOnCreate = r0
            return
    }

    @androidx.annotation.NonNull
    public static androidx.navigation.fragment.NavHostFragment create(@androidx.annotation.NavigationRes int r1) {
            r0 = 0
            androidx.navigation.fragment.NavHostFragment r1 = create(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.navigation.fragment.NavHostFragment create(@androidx.annotation.NavigationRes int r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            if (r2 == 0) goto Ld
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "android-support-nav:fragment:graphId"
            r0.putInt(r1, r2)
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r3 == 0) goto L1c
            if (r0 != 0) goto L17
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L17:
            java.lang.String r2 = "android-support-nav:fragment:startDestinationArgs"
            r0.putBundle(r2, r3)
        L1c:
            androidx.navigation.fragment.NavHostFragment r2 = new androidx.navigation.fragment.NavHostFragment
            r2.<init>()
            if (r0 == 0) goto L26
            r2.setArguments(r0)
        L26:
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.navigation.NavController findNavController(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r0 = r3
        L1:
            if (r0 == 0) goto L26
            boolean r1 = r0 instanceof androidx.navigation.fragment.NavHostFragment
            if (r1 == 0) goto Le
            androidx.navigation.fragment.NavHostFragment r0 = (androidx.navigation.fragment.NavHostFragment) r0
            androidx.navigation.NavController r3 = r0.getNavController()
            return r3
        Le:
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            androidx.fragment.app.Fragment r1 = r1.getPrimaryNavigationFragment()
            boolean r2 = r1 instanceof androidx.navigation.fragment.NavHostFragment
            if (r2 == 0) goto L21
            androidx.navigation.fragment.NavHostFragment r1 = (androidx.navigation.fragment.NavHostFragment) r1
            androidx.navigation.NavController r3 = r1.getNavController()
            return r3
        L21:
            androidx.fragment.app.Fragment r0 = r0.getParentFragment()
            goto L1
        L26:
            android.view.View r0 = r3.getView()
            if (r0 == 0) goto L31
            androidx.navigation.NavController r3 = androidx.navigation.Navigation.findNavController(r0)
            return r3
        L31:
            boolean r0 = r3 instanceof androidx.fragment.app.DialogFragment
            if (r0 == 0) goto L3d
            r0 = r3
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            android.app.Dialog r0 = r0.getDialog()
            goto L3e
        L3d:
            r0 = 0
        L3e:
            if (r0 == 0) goto L53
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L53
            android.view.Window r3 = r0.getWindow()
            android.view.View r3 = r3.getDecorView()
            androidx.navigation.NavController r3 = androidx.navigation.Navigation.findNavController(r3)
            return r3
        L53:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " does not have a NavController set"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private int getContainerId() {
            r2 = this;
            int r0 = r2.getId()
            if (r0 == 0) goto La
            r1 = -1
            if (r0 == r1) goto La
            return r0
        La:
            int r0 = androidx.navigation.fragment.R.id.nav_host_fragment_container
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    protected androidx.navigation.Navigator<? extends androidx.navigation.fragment.FragmentNavigator.Destination> createFragmentNavigator() {
            r4 = this;
            androidx.navigation.fragment.FragmentNavigator r0 = new androidx.navigation.fragment.FragmentNavigator
            android.content.Context r1 = r4.requireContext()
            androidx.fragment.app.FragmentManager r2 = r4.getChildFragmentManager()
            int r3 = r4.getContainerId()
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // androidx.navigation.NavHost
    @androidx.annotation.NonNull
    public final androidx.navigation.NavController getNavController() {
            r2 = this;
            androidx.navigation.NavHostController r0 = r2.mNavController
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "NavController is not available before onCreate()"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.CallSuper
    public void onAttach(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            super.onAttach(r1)
            boolean r1 = r0.mDefaultNavHost
            if (r1 == 0) goto L16
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            androidx.fragment.app.FragmentTransaction r1 = r1.setPrimaryNavigationFragment(r0)
            r1.commit()
        L16:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttachFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            super.onAttachFragment(r3)
            androidx.navigation.NavHostController r0 = r2.mNavController
            androidx.navigation.NavigatorProvider r0 = r0.getNavigatorProvider()
            java.lang.Class<androidx.navigation.fragment.DialogFragmentNavigator> r1 = androidx.navigation.fragment.DialogFragmentNavigator.class
            androidx.navigation.Navigator r0 = r0.getNavigator(r1)
            androidx.navigation.fragment.DialogFragmentNavigator r0 = (androidx.navigation.fragment.DialogFragmentNavigator) r0
            r0.onAttachFragment(r3)
            return
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.CallSuper
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r7) {
            r6 = this;
            android.content.Context r0 = r6.requireContext()
            androidx.navigation.NavHostController r1 = new androidx.navigation.NavHostController
            r1.<init>(r0)
            r6.mNavController = r1
            r1.setLifecycleOwner(r6)
            androidx.navigation.NavHostController r0 = r6.mNavController
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            androidx.activity.OnBackPressedDispatcher r1 = r1.getOnBackPressedDispatcher()
            r0.setOnBackPressedDispatcher(r1)
            androidx.navigation.NavHostController r0 = r6.mNavController
            java.lang.Boolean r1 = r6.mIsPrimaryBeforeOnCreate
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2b
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2b
            r1 = 1
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r0.enableOnBackPressed(r1)
            r0 = 0
            r6.mIsPrimaryBeforeOnCreate = r0
            androidx.navigation.NavHostController r1 = r6.mNavController
            androidx.lifecycle.ViewModelStore r4 = r6.getViewModelStore()
            r1.setViewModelStore(r4)
            androidx.navigation.NavHostController r1 = r6.mNavController
            r6.onCreateNavController(r1)
            java.lang.String r1 = "android-support-nav:fragment:graphId"
            if (r7 == 0) goto L6a
            java.lang.String r4 = "android-support-nav:fragment:navControllerState"
            android.os.Bundle r4 = r7.getBundle(r4)
            java.lang.String r5 = "android-support-nav:fragment:defaultHost"
            boolean r5 = r7.getBoolean(r5, r3)
            if (r5 == 0) goto L63
            r6.mDefaultNavHost = r2
            androidx.fragment.app.FragmentManager r2 = r6.getParentFragmentManager()
            androidx.fragment.app.FragmentTransaction r2 = r2.beginTransaction()
            androidx.fragment.app.FragmentTransaction r2 = r2.setPrimaryNavigationFragment(r6)
            r2.commit()
        L63:
            int r2 = r7.getInt(r1)
            r6.mGraphId = r2
            goto L6b
        L6a:
            r4 = r0
        L6b:
            if (r4 == 0) goto L72
            androidx.navigation.NavHostController r2 = r6.mNavController
            r2.restoreState(r4)
        L72:
            int r2 = r6.mGraphId
            if (r2 == 0) goto L7c
            androidx.navigation.NavHostController r0 = r6.mNavController
            r0.setGraph(r2)
            goto L95
        L7c:
            android.os.Bundle r2 = r6.getArguments()
            if (r2 == 0) goto L86
            int r3 = r2.getInt(r1)
        L86:
            if (r2 == 0) goto L8e
            java.lang.String r0 = "android-support-nav:fragment:startDestinationArgs"
            android.os.Bundle r0 = r2.getBundle(r0)
        L8e:
            if (r3 == 0) goto L95
            androidx.navigation.NavHostController r1 = r6.mNavController
            r1.setGraph(r3, r0)
        L95:
            super.onCreate(r7)
            return
    }

    @androidx.annotation.CallSuper
    protected void onCreateNavController(@androidx.annotation.NonNull androidx.navigation.NavController r5) {
            r4 = this;
            androidx.navigation.NavigatorProvider r0 = r5.getNavigatorProvider()
            androidx.navigation.fragment.DialogFragmentNavigator r1 = new androidx.navigation.fragment.DialogFragmentNavigator
            android.content.Context r2 = r4.requireContext()
            androidx.fragment.app.FragmentManager r3 = r4.getChildFragmentManager()
            r1.<init>(r2, r3)
            r0.addNavigator(r1)
            androidx.navigation.NavigatorProvider r5 = r5.getNavigatorProvider()
            androidx.navigation.Navigator r0 = r4.createFragmentNavigator()
            r5.addNavigator(r0)
            return
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.Nullable
    public android.view.View onCreateView(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r0 = this;
            androidx.fragment.app.FragmentContainerView r2 = new androidx.fragment.app.FragmentContainerView
            android.content.Context r1 = r1.getContext()
            r2.<init>(r1)
            int r1 = r0.getContainerId()
            r2.setId(r1)
            return r2
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
            r3 = this;
            super.onDestroyView()
            android.view.View r0 = r3.mViewParent
            r1 = 0
            if (r0 == 0) goto L15
            androidx.navigation.NavController r0 = androidx.navigation.Navigation.findNavController(r0)
            androidx.navigation.NavHostController r2 = r3.mNavController
            if (r0 != r2) goto L15
            android.view.View r0 = r3.mViewParent
            androidx.navigation.Navigation.setViewNavController(r0, r1)
        L15:
            r3.mViewParent = r1
            return
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.CallSuper
    public void onInflate(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.util.AttributeSet r4, @androidx.annotation.Nullable android.os.Bundle r5) {
            r2 = this;
            super.onInflate(r3, r4, r5)
            int[] r5 = androidx.navigation.R.styleable.NavHost
            android.content.res.TypedArray r5 = r3.obtainStyledAttributes(r4, r5)
            int r0 = androidx.navigation.R.styleable.NavHost_navGraph
            r1 = 0
            int r0 = r5.getResourceId(r0, r1)
            if (r0 == 0) goto L14
            r2.mGraphId = r0
        L14:
            r5.recycle()
            int[] r5 = androidx.navigation.fragment.R.styleable.NavHostFragment
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r5)
            int r4 = androidx.navigation.fragment.R.styleable.NavHostFragment_defaultNavHost
            boolean r4 = r3.getBoolean(r4, r1)
            if (r4 == 0) goto L28
            r4 = 1
            r2.mDefaultNavHost = r4
        L28:
            r3.recycle()
            return
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.CallSuper
    public void onPrimaryNavigationFragmentChanged(boolean r2) {
            r1 = this;
            androidx.navigation.NavHostController r0 = r1.mNavController
            if (r0 == 0) goto L8
            r0.enableOnBackPressed(r2)
            return
        L8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.mIsPrimaryBeforeOnCreate = r2
            return
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.CallSuper
    public void onSaveInstanceState(@androidx.annotation.NonNull android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            androidx.navigation.NavHostController r0 = r2.mNavController
            android.os.Bundle r0 = r0.saveState()
            if (r0 == 0) goto L10
            java.lang.String r1 = "android-support-nav:fragment:navControllerState"
            r3.putBundle(r1, r0)
        L10:
            boolean r0 = r2.mDefaultNavHost
            if (r0 == 0) goto L1a
            java.lang.String r0 = "android-support-nav:fragment:defaultHost"
            r1 = 1
            r3.putBoolean(r0, r1)
        L1a:
            int r0 = r2.mGraphId
            if (r0 == 0) goto L23
            java.lang.String r1 = "android-support-nav:fragment:graphId"
            r3.putInt(r1, r0)
        L23:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r2 = this;
            super.onViewCreated(r3, r4)
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L2c
            androidx.navigation.NavHostController r4 = r2.mNavController
            androidx.navigation.Navigation.setViewNavController(r3, r4)
            android.view.ViewParent r4 = r3.getParent()
            if (r4 == 0) goto L2b
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            r2.mViewParent = r3
            int r3 = r3.getId()
            int r4 = r2.getId()
            if (r3 != r4) goto L2b
            android.view.View r3 = r2.mViewParent
            androidx.navigation.NavHostController r4 = r2.mNavController
            androidx.navigation.Navigation.setViewNavController(r3, r4)
        L2b:
            return
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "created host view "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " is not a ViewGroup"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }
}
