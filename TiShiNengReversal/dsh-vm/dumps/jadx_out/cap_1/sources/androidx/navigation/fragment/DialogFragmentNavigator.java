package androidx.navigation.fragment;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.navigation.Navigator.Name("dialog")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DialogFragmentNavigator extends androidx.navigation.Navigator<androidx.navigation.fragment.DialogFragmentNavigator.Destination> {
    private static final java.lang.String DIALOG_TAG = "androidx-nav-fragment:navigator:dialog:";
    private static final java.lang.String KEY_DIALOG_COUNT = "androidx-nav-dialogfragment:navigator:count";
    private static final java.lang.String TAG = "DialogFragmentNavigator";
    private final android.content.Context mContext;
    private int mDialogCount;
    private final androidx.fragment.app.FragmentManager mFragmentManager;
    private androidx.lifecycle.LifecycleEventObserver mObserver;
    private final java.util.HashSet<java.lang.String> mRestoredTagsAwaitingAttach;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.navigation.NavDestination.ClassType(androidx.fragment.app.DialogFragment.class)
    public static class Destination extends androidx.navigation.NavDestination implements androidx.navigation.FloatingWindow {
        private java.lang.String mClassName;

        public Destination(@androidx.annotation.NonNull androidx.navigation.Navigator<? extends androidx.navigation.fragment.DialogFragmentNavigator.Destination> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public Destination(@androidx.annotation.NonNull androidx.navigation.NavigatorProvider r2) {
                r1 = this;
                java.lang.Class<androidx.navigation.fragment.DialogFragmentNavigator> r0 = androidx.navigation.fragment.DialogFragmentNavigator.class
                androidx.navigation.Navigator r2 = r2.getNavigator(r0)
                r1.<init>(r2)
                return
        }

        @androidx.annotation.NonNull
        public final java.lang.String getClassName() {
                r2 = this;
                java.lang.String r0 = r2.mClassName
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "DialogFragment class was not set"
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.navigation.NavDestination
        @androidx.annotation.CallSuper
        public void onInflate(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.util.AttributeSet r3) {
                r1 = this;
                super.onInflate(r2, r3)
                android.content.res.Resources r2 = r2.getResources()
                int[] r0 = androidx.navigation.fragment.R.styleable.DialogFragmentNavigator
                android.content.res.TypedArray r2 = r2.obtainAttributes(r3, r0)
                int r3 = androidx.navigation.fragment.R.styleable.DialogFragmentNavigator_android_name
                java.lang.String r3 = r2.getString(r3)
                if (r3 == 0) goto L18
                r1.setClassName(r3)
            L18:
                r2.recycle()
                return
        }

        @androidx.annotation.NonNull
        public final androidx.navigation.fragment.DialogFragmentNavigator.Destination setClassName(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.mClassName = r1
                return r0
        }
    }

    public DialogFragmentNavigator(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.fragment.app.FragmentManager r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mDialogCount = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.mRestoredTagsAwaitingAttach = r0
            androidx.navigation.fragment.DialogFragmentNavigator$1 r0 = new androidx.navigation.fragment.DialogFragmentNavigator$1
            r0.<init>(r1)
            r1.mObserver = r0
            r1.mContext = r2
            r1.mFragmentManager = r3
            return
    }

    @Override // androidx.navigation.Navigator
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.navigation.fragment.DialogFragmentNavigator.Destination createDestination() {
            r1 = this;
            androidx.navigation.fragment.DialogFragmentNavigator$Destination r0 = r1.createDestination2()
            return r0
    }

    @Override // androidx.navigation.Navigator
    @androidx.annotation.NonNull
    /* renamed from: createDestination, reason: avoid collision after fix types in other method */
    public androidx.navigation.fragment.DialogFragmentNavigator.Destination createDestination2() {
            r1 = this;
            androidx.navigation.fragment.DialogFragmentNavigator$Destination r0 = new androidx.navigation.fragment.DialogFragmentNavigator$Destination
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.navigation.Navigator
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ androidx.navigation.NavDestination navigate(@androidx.annotation.NonNull androidx.navigation.fragment.DialogFragmentNavigator.Destination r1, @androidx.annotation.Nullable android.os.Bundle r2, @androidx.annotation.Nullable androidx.navigation.NavOptions r3, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r4) {
            r0 = this;
            androidx.navigation.fragment.DialogFragmentNavigator$Destination r1 = (androidx.navigation.fragment.DialogFragmentNavigator.Destination) r1
            androidx.navigation.NavDestination r1 = r0.navigate2(r1, r2, r3, r4)
            return r1
    }

    @androidx.annotation.Nullable
    /* renamed from: navigate, reason: avoid collision after fix types in other method */
    public androidx.navigation.NavDestination navigate2(@androidx.annotation.NonNull androidx.navigation.fragment.DialogFragmentNavigator.Destination r3, @androidx.annotation.Nullable android.os.Bundle r4, @androidx.annotation.Nullable androidx.navigation.NavOptions r5, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r6) {
            r2 = this;
            androidx.fragment.app.FragmentManager r5 = r2.mFragmentManager
            boolean r5 = r5.isStateSaved()
            if (r5 == 0) goto La
            r3 = 0
            return r3
        La:
            java.lang.String r5 = r3.getClassName()
            r6 = 0
            char r6 = r5.charAt(r6)
            r0 = 46
            if (r6 != r0) goto L2c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r0 = r2.mContext
            java.lang.String r0 = r0.getPackageName()
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        L2c:
            androidx.fragment.app.FragmentManager r6 = r2.mFragmentManager
            androidx.fragment.app.FragmentFactory r6 = r6.getFragmentFactory()
            android.content.Context r0 = r2.mContext
            java.lang.ClassLoader r0 = r0.getClassLoader()
            androidx.fragment.app.Fragment r5 = r6.instantiate(r0, r5)
            java.lang.Class<androidx.fragment.app.DialogFragment> r6 = androidx.fragment.app.DialogFragment.class
            java.lang.Class r0 = r5.getClass()
            boolean r6 = r6.isAssignableFrom(r0)
            if (r6 == 0) goto L73
            androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
            r5.setArguments(r4)
            androidx.lifecycle.Lifecycle r4 = r5.getLifecycle()
            androidx.lifecycle.LifecycleEventObserver r6 = r2.mObserver
            r4.addObserver(r6)
            androidx.fragment.app.FragmentManager r4 = r2.mFragmentManager
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "androidx-nav-fragment:navigator:dialog:"
            r6.append(r0)
            int r0 = r2.mDialogCount
            int r1 = r0 + 1
            r2.mDialogCount = r1
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.show(r4, r6)
            return r3
        L73:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Dialog destination "
            r5.append(r6)
            java.lang.String r3 = r3.getClassName()
            r5.append(r3)
            java.lang.String r3 = " is not an instance of DialogFragment"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    void onAttachFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.HashSet<java.lang.String> r0 = r2.mRestoredTagsAwaitingAttach
            java.lang.String r1 = r3.getTag()
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L15
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            androidx.lifecycle.LifecycleEventObserver r0 = r2.mObserver
            r3.addObserver(r0)
        L15:
            return
    }

    @Override // androidx.navigation.Navigator
    public void onRestoreState(@androidx.annotation.Nullable android.os.Bundle r4) {
            r3 = this;
            if (r4 == 0) goto L4b
            java.lang.String r0 = "androidx-nav-dialogfragment:navigator:count"
            r1 = 0
            int r4 = r4.getInt(r0, r1)
            r3.mDialogCount = r4
        Lb:
            int r4 = r3.mDialogCount
            if (r1 >= r4) goto L4b
            androidx.fragment.app.FragmentManager r4 = r3.mFragmentManager
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "androidx-nav-fragment:navigator:dialog:"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.Fragment r4 = r4.findFragmentByTag(r0)
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            if (r4 == 0) goto L34
            androidx.lifecycle.Lifecycle r4 = r4.getLifecycle()
            androidx.lifecycle.LifecycleEventObserver r0 = r3.mObserver
            r4.addObserver(r0)
            goto L48
        L34:
            java.util.HashSet<java.lang.String> r4 = r3.mRestoredTagsAwaitingAttach
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.add(r0)
        L48:
            int r1 = r1 + 1
            goto Lb
        L4b:
            return
    }

    @Override // androidx.navigation.Navigator
    @androidx.annotation.Nullable
    public android.os.Bundle onSaveState() {
            r3 = this;
            int r0 = r3.mDialogCount
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "androidx-nav-dialogfragment:navigator:count"
            int r2 = r3.mDialogCount
            r0.putInt(r1, r2)
            return r0
    }

    @Override // androidx.navigation.Navigator
    public boolean popBackStack() {
            r4 = this;
            int r0 = r4.mDialogCount
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            boolean r0 = r0.isStateSaved()
            if (r0 == 0) goto Lf
            return r1
        Lf:
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "androidx-nav-fragment:navigator:dialog:"
            r1.append(r2)
            int r2 = r4.mDialogCount
            r3 = 1
            int r2 = r2 - r3
            r4.mDialogCount = r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.fragment.app.Fragment r0 = r0.findFragmentByTag(r1)
            if (r0 == 0) goto L3c
            androidx.lifecycle.Lifecycle r1 = r0.getLifecycle()
            androidx.lifecycle.LifecycleEventObserver r2 = r4.mObserver
            r1.removeObserver(r2)
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.dismiss()
        L3c:
            return r3
    }
}
