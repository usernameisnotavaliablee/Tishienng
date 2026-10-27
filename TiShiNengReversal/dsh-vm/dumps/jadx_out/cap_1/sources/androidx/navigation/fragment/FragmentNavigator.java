package androidx.navigation.fragment;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.navigation.Navigator.Name("fragment")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class FragmentNavigator extends androidx.navigation.Navigator<androidx.navigation.fragment.FragmentNavigator.Destination> {
    private static final java.lang.String KEY_BACK_STACK_IDS = "androidx-nav-fragment:navigator:backStackIds";
    private static final java.lang.String TAG = "FragmentNavigator";
    private java.util.ArrayDeque<java.lang.Integer> mBackStack;
    private final int mContainerId;
    private final android.content.Context mContext;
    private final androidx.fragment.app.FragmentManager mFragmentManager;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.navigation.NavDestination.ClassType(androidx.fragment.app.Fragment.class)
    public static class Destination extends androidx.navigation.NavDestination {
        private java.lang.String mClassName;

        public Destination(@androidx.annotation.NonNull androidx.navigation.Navigator<? extends androidx.navigation.fragment.FragmentNavigator.Destination> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public Destination(@androidx.annotation.NonNull androidx.navigation.NavigatorProvider r2) {
                r1 = this;
                java.lang.Class<androidx.navigation.fragment.FragmentNavigator> r0 = androidx.navigation.fragment.FragmentNavigator.class
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
                java.lang.String r1 = "Fragment class was not set"
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.navigation.NavDestination
        @androidx.annotation.CallSuper
        public void onInflate(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.util.AttributeSet r3) {
                r1 = this;
                super.onInflate(r2, r3)
                android.content.res.Resources r2 = r2.getResources()
                int[] r0 = androidx.navigation.fragment.R.styleable.FragmentNavigator
                android.content.res.TypedArray r2 = r2.obtainAttributes(r3, r0)
                int r3 = androidx.navigation.fragment.R.styleable.FragmentNavigator_android_name
                java.lang.String r3 = r2.getString(r3)
                if (r3 == 0) goto L18
                r1.setClassName(r3)
            L18:
                r2.recycle()
                return
        }

        @androidx.annotation.NonNull
        public final androidx.navigation.fragment.FragmentNavigator.Destination setClassName(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.mClassName = r1
                return r0
        }

        @Override // androidx.navigation.NavDestination
        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                r0.append(r1)
                java.lang.String r1 = " class="
                r0.append(r1)
                java.lang.String r1 = r2.mClassName
                if (r1 != 0) goto L1b
                java.lang.String r1 = "null"
                r0.append(r1)
                goto L1e
            L1b:
                r0.append(r1)
            L1e:
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Extras implements androidx.navigation.Navigator.Extras {
        private final java.util.LinkedHashMap<android.view.View, java.lang.String> mSharedElements;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class Builder {
            private final java.util.LinkedHashMap<android.view.View, java.lang.String> mSharedElements;

            public Builder() {
                    r1 = this;
                    r1.<init>()
                    java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                    r0.<init>()
                    r1.mSharedElements = r0
                    return
            }

            @androidx.annotation.NonNull
            public androidx.navigation.fragment.FragmentNavigator.Extras.Builder addSharedElement(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull java.lang.String r3) {
                    r1 = this;
                    java.util.LinkedHashMap<android.view.View, java.lang.String> r0 = r1.mSharedElements
                    r0.put(r2, r3)
                    return r1
            }

            @androidx.annotation.NonNull
            public androidx.navigation.fragment.FragmentNavigator.Extras.Builder addSharedElements(@androidx.annotation.NonNull java.util.Map<android.view.View, java.lang.String> r3) {
                    r2 = this;
                    java.util.Set r3 = r3.entrySet()
                    java.util.Iterator r3 = r3.iterator()
                L8:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L28
                    java.lang.Object r0 = r3.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r1 = r0.getKey()
                    android.view.View r1 = (android.view.View) r1
                    java.lang.Object r0 = r0.getValue()
                    java.lang.String r0 = (java.lang.String) r0
                    if (r1 == 0) goto L8
                    if (r0 == 0) goto L8
                    r2.addSharedElement(r1, r0)
                    goto L8
                L28:
                    return r2
            }

            @androidx.annotation.NonNull
            public androidx.navigation.fragment.FragmentNavigator.Extras build() {
                    r2 = this;
                    androidx.navigation.fragment.FragmentNavigator$Extras r0 = new androidx.navigation.fragment.FragmentNavigator$Extras
                    java.util.LinkedHashMap<android.view.View, java.lang.String> r1 = r2.mSharedElements
                    r0.<init>(r1)
                    return r0
            }
        }

        Extras(java.util.Map<android.view.View, java.lang.String> r2) {
                r1 = this;
                r1.<init>()
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r1.mSharedElements = r0
                r0.putAll(r2)
                return
        }

        @androidx.annotation.NonNull
        public java.util.Map<android.view.View, java.lang.String> getSharedElements() {
                r1 = this;
                java.util.LinkedHashMap<android.view.View, java.lang.String> r0 = r1.mSharedElements
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
                return r0
        }
    }

    public FragmentNavigator(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.fragment.app.FragmentManager r3, int r4) {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.mBackStack = r0
            r1.mContext = r2
            r1.mFragmentManager = r3
            r1.mContainerId = r4
            return
    }

    @androidx.annotation.NonNull
    private java.lang.String generateBackStackName(int r2, int r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "-"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // androidx.navigation.Navigator
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.navigation.fragment.FragmentNavigator.Destination createDestination() {
            r1 = this;
            androidx.navigation.fragment.FragmentNavigator$Destination r0 = r1.createDestination2()
            return r0
    }

    @Override // androidx.navigation.Navigator
    @androidx.annotation.NonNull
    /* renamed from: createDestination, reason: avoid collision after fix types in other method */
    public androidx.navigation.fragment.FragmentNavigator.Destination createDestination2() {
            r1 = this;
            androidx.navigation.fragment.FragmentNavigator$Destination r0 = new androidx.navigation.fragment.FragmentNavigator$Destination
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.fragment.app.Fragment instantiateFragment(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.fragment.app.FragmentManager r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r0 = this;
            androidx.fragment.app.FragmentFactory r2 = r2.getFragmentFactory()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            androidx.fragment.app.Fragment r1 = r2.instantiate(r1, r3)
            return r1
    }

    @Override // androidx.navigation.Navigator
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ androidx.navigation.NavDestination navigate(@androidx.annotation.NonNull androidx.navigation.fragment.FragmentNavigator.Destination r1, @androidx.annotation.Nullable android.os.Bundle r2, @androidx.annotation.Nullable androidx.navigation.NavOptions r3, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r4) {
            r0 = this;
            androidx.navigation.fragment.FragmentNavigator$Destination r1 = (androidx.navigation.fragment.FragmentNavigator.Destination) r1
            androidx.navigation.NavDestination r1 = r0.navigate2(r1, r2, r3, r4)
            return r1
    }

    @androidx.annotation.Nullable
    /* renamed from: navigate, reason: avoid collision after fix types in other method */
    public androidx.navigation.NavDestination navigate2(@androidx.annotation.NonNull androidx.navigation.fragment.FragmentNavigator.Destination r9, @androidx.annotation.Nullable android.os.Bundle r10, @androidx.annotation.Nullable androidx.navigation.NavOptions r11, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r12) {
            r8 = this;
            androidx.fragment.app.FragmentManager r0 = r8.mFragmentManager
            boolean r0 = r0.isStateSaved()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = r9.getClassName()
            r2 = 0
            char r3 = r0.charAt(r2)
            r4 = 46
            if (r3 != r4) goto L2c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r4 = r8.mContext
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L2c:
            android.content.Context r3 = r8.mContext
            androidx.fragment.app.FragmentManager r4 = r8.mFragmentManager
            androidx.fragment.app.Fragment r0 = r8.instantiateFragment(r3, r4, r0, r10)
            r0.setArguments(r10)
            androidx.fragment.app.FragmentManager r10 = r8.mFragmentManager
            androidx.fragment.app.FragmentTransaction r10 = r10.beginTransaction()
            r3 = -1
            if (r11 == 0) goto L45
            int r4 = r11.getEnterAnim()
            goto L46
        L45:
            r4 = -1
        L46:
            if (r11 == 0) goto L4d
            int r5 = r11.getExitAnim()
            goto L4e
        L4d:
            r5 = -1
        L4e:
            if (r11 == 0) goto L55
            int r6 = r11.getPopEnterAnim()
            goto L56
        L55:
            r6 = -1
        L56:
            if (r11 == 0) goto L5d
            int r7 = r11.getPopExitAnim()
            goto L5e
        L5d:
            r7 = -1
        L5e:
            if (r4 != r3) goto L66
            if (r5 != r3) goto L66
            if (r6 != r3) goto L66
            if (r7 == r3) goto L79
        L66:
            if (r4 == r3) goto L69
            goto L6a
        L69:
            r4 = 0
        L6a:
            if (r5 == r3) goto L6d
            goto L6e
        L6d:
            r5 = 0
        L6e:
            if (r6 == r3) goto L71
            goto L72
        L71:
            r6 = 0
        L72:
            if (r7 == r3) goto L75
            goto L76
        L75:
            r7 = 0
        L76:
            r10.setCustomAnimations(r4, r5, r6, r7)
        L79:
            int r3 = r8.mContainerId
            r10.replace(r3, r0)
            r10.setPrimaryNavigationFragment(r0)
            int r0 = r9.getId()
            java.util.ArrayDeque<java.lang.Integer> r3 = r8.mBackStack
            boolean r3 = r3.isEmpty()
            r4 = 1
            if (r11 == 0) goto La6
            if (r3 != 0) goto La6
            boolean r11 = r11.shouldLaunchSingleTop()
            if (r11 == 0) goto La6
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.mBackStack
            java.lang.Object r11 = r11.peekLast()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 != r0) goto La6
            r11 = 1
            goto La7
        La6:
            r11 = 0
        La7:
            if (r3 == 0) goto Lab
        La9:
            r2 = 1
            goto Led
        Lab:
            if (r11 == 0) goto Lde
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.mBackStack
            int r11 = r11.size()
            if (r11 <= r4) goto Led
            androidx.fragment.app.FragmentManager r11 = r8.mFragmentManager
            java.util.ArrayDeque<java.lang.Integer> r3 = r8.mBackStack
            int r3 = r3.size()
            java.util.ArrayDeque<java.lang.Integer> r5 = r8.mBackStack
            java.lang.Object r5 = r5.peekLast()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r3 = r8.generateBackStackName(r3, r5)
            r11.popBackStack(r3, r4)
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.mBackStack
            int r11 = r11.size()
            java.lang.String r11 = r8.generateBackStackName(r11, r0)
            r10.addToBackStack(r11)
            goto Led
        Lde:
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.mBackStack
            int r11 = r11.size()
            int r11 = r11 + r4
            java.lang.String r11 = r8.generateBackStackName(r11, r0)
            r10.addToBackStack(r11)
            goto La9
        Led:
            boolean r11 = r12 instanceof androidx.navigation.fragment.FragmentNavigator.Extras
            if (r11 == 0) goto L11b
            androidx.navigation.fragment.FragmentNavigator$Extras r12 = (androidx.navigation.fragment.FragmentNavigator.Extras) r12
            java.util.Map r11 = r12.getSharedElements()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        Lff:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L11b
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r3 = r12.getKey()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r10.addSharedElement(r3, r12)
            goto Lff
        L11b:
            r10.setReorderingAllowed(r4)
            r10.commit()
            if (r2 == 0) goto L12d
            java.util.ArrayDeque<java.lang.Integer> r10 = r8.mBackStack
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r10.add(r11)
            return r9
        L12d:
            return r1
    }

    @Override // androidx.navigation.Navigator
    public void onRestoreState(@androidx.annotation.Nullable android.os.Bundle r5) {
            r4 = this;
            if (r5 == 0) goto L21
            java.lang.String r0 = "androidx-nav-fragment:navigator:backStackIds"
            int[] r5 = r5.getIntArray(r0)
            if (r5 == 0) goto L21
            java.util.ArrayDeque<java.lang.Integer> r0 = r4.mBackStack
            r0.clear()
            int r0 = r5.length
            r1 = 0
        L11:
            if (r1 >= r0) goto L21
            r2 = r5[r1]
            java.util.ArrayDeque<java.lang.Integer> r3 = r4.mBackStack
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            int r1 = r1 + 1
            goto L11
        L21:
            return
    }

    @Override // androidx.navigation.Navigator
    @androidx.annotation.Nullable
    public android.os.Bundle onSaveState() {
            r6 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.ArrayDeque<java.lang.Integer> r1 = r6.mBackStack
            int r1 = r1.size()
            int[] r1 = new int[r1]
            java.util.ArrayDeque<java.lang.Integer> r2 = r6.mBackStack
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L14:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2a
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r3 + 1
            int r4 = r4.intValue()
            r1[r3] = r4
            r3 = r5
            goto L14
        L2a:
            java.lang.String r2 = "androidx-nav-fragment:navigator:backStackIds"
            r0.putIntArray(r2, r1)
            return r0
    }

    @Override // androidx.navigation.Navigator
    public boolean popBackStack() {
            r3 = this;
            java.util.ArrayDeque<java.lang.Integer> r0 = r3.mBackStack
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            boolean r0 = r0.isStateSaved()
            if (r0 == 0) goto L13
            return r1
        L13:
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            java.util.ArrayDeque<java.lang.Integer> r1 = r3.mBackStack
            int r1 = r1.size()
            java.util.ArrayDeque<java.lang.Integer> r2 = r3.mBackStack
            java.lang.Object r2 = r2.peekLast()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.String r1 = r3.generateBackStackName(r1, r2)
            r2 = 1
            r0.popBackStack(r1, r2)
            java.util.ArrayDeque<java.lang.Integer> r0 = r3.mBackStack
            r0.removeLast()
            return r2
    }
}
