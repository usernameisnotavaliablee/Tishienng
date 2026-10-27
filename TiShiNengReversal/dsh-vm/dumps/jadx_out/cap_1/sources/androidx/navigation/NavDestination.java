package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NavDestination {
    private static final java.util.HashMap<java.lang.String, java.lang.Class<?>> sClasses = null;
    private androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> mActions;
    private java.util.HashMap<java.lang.String, androidx.navigation.NavArgument> mArguments;
    private java.util.ArrayList<androidx.navigation.NavDeepLink> mDeepLinks;
    private int mId;
    private java.lang.String mIdName;
    private java.lang.CharSequence mLabel;
    private final java.lang.String mNavigatorName;
    private androidx.navigation.NavGraph mParent;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface ClassType {
        java.lang.Class<?> value();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class DeepLinkMatch implements java.lang.Comparable<androidx.navigation.NavDestination.DeepLinkMatch> {

        @androidx.annotation.NonNull
        private final androidx.navigation.NavDestination mDestination;
        private final boolean mHasMatchingAction;
        private final boolean mIsExactDeepLink;

        @androidx.annotation.Nullable
        private final android.os.Bundle mMatchingArgs;
        private final int mMimeTypeMatchLevel;

        DeepLinkMatch(@androidx.annotation.NonNull androidx.navigation.NavDestination r1, @androidx.annotation.Nullable android.os.Bundle r2, boolean r3, boolean r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.mDestination = r1
                r0.mMatchingArgs = r2
                r0.mIsExactDeepLink = r3
                r0.mHasMatchingAction = r4
                r0.mMimeTypeMatchLevel = r5
                return
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(@androidx.annotation.NonNull androidx.navigation.NavDestination.DeepLinkMatch r5) {
                r4 = this;
                boolean r0 = r4.mIsExactDeepLink
                r1 = 1
                if (r0 == 0) goto La
                boolean r2 = r5.mIsExactDeepLink
                if (r2 != 0) goto La
                return r1
            La:
                r2 = -1
                if (r0 != 0) goto L12
                boolean r0 = r5.mIsExactDeepLink
                if (r0 == 0) goto L12
                return r2
            L12:
                android.os.Bundle r0 = r4.mMatchingArgs
                if (r0 == 0) goto L1b
                android.os.Bundle r3 = r5.mMatchingArgs
                if (r3 != 0) goto L1b
                return r1
            L1b:
                if (r0 != 0) goto L22
                android.os.Bundle r3 = r5.mMatchingArgs
                if (r3 == 0) goto L22
                return r2
            L22:
                if (r0 == 0) goto L35
                int r0 = r0.size()
                android.os.Bundle r3 = r5.mMatchingArgs
                int r3 = r3.size()
                int r0 = r0 - r3
                if (r0 <= 0) goto L32
                return r1
            L32:
                if (r0 >= 0) goto L35
                return r2
            L35:
                boolean r0 = r4.mHasMatchingAction
                if (r0 == 0) goto L3e
                boolean r3 = r5.mHasMatchingAction
                if (r3 != 0) goto L3e
                return r1
            L3e:
                if (r0 != 0) goto L45
                boolean r0 = r5.mHasMatchingAction
                if (r0 == 0) goto L45
                return r2
            L45:
                int r0 = r4.mMimeTypeMatchLevel
                int r5 = r5.mMimeTypeMatchLevel
                int r0 = r0 - r5
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(@androidx.annotation.NonNull androidx.navigation.NavDestination.DeepLinkMatch r1) {
                r0 = this;
                androidx.navigation.NavDestination$DeepLinkMatch r1 = (androidx.navigation.NavDestination.DeepLinkMatch) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        @androidx.annotation.NonNull
        androidx.navigation.NavDestination getDestination() {
                r1 = this;
                androidx.navigation.NavDestination r0 = r1.mDestination
                return r0
        }

        @androidx.annotation.Nullable
        android.os.Bundle getMatchingArgs() {
                r1 = this;
                android.os.Bundle r0 = r1.mMatchingArgs
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.navigation.NavDestination.sClasses = r0
            return
    }

    public NavDestination(@androidx.annotation.NonNull androidx.navigation.Navigator<? extends androidx.navigation.NavDestination> r1) {
            r0 = this;
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = androidx.navigation.NavigatorProvider.getNameForNavigator(r1)
            r0.<init>(r1)
            return
    }

    public NavDestination(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.mNavigatorName = r1
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    static java.lang.String getDisplayName(@androidx.annotation.NonNull android.content.Context r1, int r2) {
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r2 > r0) goto La
            java.lang.String r1 = java.lang.Integer.toString(r2)
            return r1
        La:
            android.content.res.Resources r1 = r1.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L13
            java.lang.String r1 = r1.getResourceName(r2)     // Catch: android.content.res.Resources.NotFoundException -> L13
            return r1
        L13:
            java.lang.String r1 = java.lang.Integer.toString(r2)
            return r1
    }

    @androidx.annotation.NonNull
    protected static <C> java.lang.Class<? extends C> parseClassFromName(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.Class<? extends C> r4) {
            r0 = 0
            char r0 = r3.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.getPackageName()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L1c:
            java.util.HashMap<java.lang.String, java.lang.Class<?>> r0 = androidx.navigation.NavDestination.sClasses
            java.lang.Object r1 = r0.get(r3)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 != 0) goto L3a
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L33
            r1 = 1
            java.lang.Class r1 = java.lang.Class.forName(r3, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L33
            r0.put(r3, r1)     // Catch: java.lang.ClassNotFoundException -> L33
            goto L3a
        L33:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r2)
            throw r3
        L3a:
            boolean r2 = r4.isAssignableFrom(r1)
            if (r2 == 0) goto L41
            return r1
        L41:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " must be a subclass of "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    public final void addArgument(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull androidx.navigation.NavArgument r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.navigation.NavArgument> r0 = r1.mArguments
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mArguments = r0
        Lb:
            java.util.HashMap<java.lang.String, androidx.navigation.NavArgument> r0 = r1.mArguments
            r0.put(r2, r3)
            return
    }

    public final void addDeepLink(@androidx.annotation.NonNull androidx.navigation.NavDeepLink r2) {
            r1 = this;
            java.util.ArrayList<androidx.navigation.NavDeepLink> r0 = r1.mDeepLinks
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mDeepLinks = r0
        Lb:
            java.util.ArrayList<androidx.navigation.NavDeepLink> r0 = r1.mDeepLinks
            r0.add(r2)
            return
    }

    public final void addDeepLink(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            androidx.navigation.NavDeepLink$Builder r0 = new androidx.navigation.NavDeepLink$Builder
            r0.<init>()
            androidx.navigation.NavDeepLink$Builder r2 = r0.setUriPattern(r2)
            androidx.navigation.NavDeepLink r2 = r2.build()
            r1.addDeepLink(r2)
            return
    }

    @androidx.annotation.Nullable
    android.os.Bundle addInDefaultArgs(@androidx.annotation.Nullable android.os.Bundle r5) {
            r4 = this;
            if (r5 != 0) goto Le
            java.util.HashMap<java.lang.String, androidx.navigation.NavArgument> r0 = r4.mArguments
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
        Lc:
            r5 = 0
            return r5
        Le:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.navigation.NavArgument> r1 = r4.mArguments
            if (r1 == 0) goto L3b
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            androidx.navigation.NavArgument r3 = (androidx.navigation.NavArgument) r3
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r3.putDefaultValue(r2, r0)
            goto L1f
        L3b:
            if (r5 == 0) goto La3
            r0.putAll(r5)
            java.util.HashMap<java.lang.String, androidx.navigation.NavArgument> r5 = r4.mArguments
            if (r5 == 0) goto La3
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L4c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto La3
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.navigation.NavArgument r2 = (androidx.navigation.NavArgument) r2
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = r2.verify(r3, r0)
            if (r2 == 0) goto L6b
            goto L4c
        L6b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Wrong argument type for '"
            r0.append(r2)
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "' in argument bundle. "
            r0.append(r2)
            java.lang.Object r1 = r1.getValue()
            androidx.navigation.NavArgument r1 = (androidx.navigation.NavArgument) r1
            androidx.navigation.NavType r1 = r1.getType()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " expected."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        La3:
            return r0
    }

    @androidx.annotation.NonNull
    int[] buildDeepLinkIds() {
            r5 = this;
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1 = r5
        L6:
            androidx.navigation.NavGraph r2 = r1.getParent()
            if (r2 == 0) goto L16
            int r3 = r2.getStartDestination()
            int r4 = r1.getId()
            if (r3 == r4) goto L19
        L16:
            r0.addFirst(r1)
        L19:
            if (r2 != 0) goto L3d
            int r1 = r0.size()
            int[] r1 = new int[r1]
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L26:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r0.next()
            androidx.navigation.NavDestination r3 = (androidx.navigation.NavDestination) r3
            int r4 = r2 + 1
            int r3 = r3.getId()
            r1[r2] = r3
            r2 = r4
            goto L26
        L3c:
            return r1
        L3d:
            r1 = r2
            goto L6
    }

    @androidx.annotation.Nullable
    public final androidx.navigation.NavAction getAction(@androidx.annotation.IdRes int r3) {
            r2 = this;
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r0 = r2.mActions
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Ld
        L7:
            java.lang.Object r0 = r0.get(r3)
            androidx.navigation.NavAction r0 = (androidx.navigation.NavAction) r0
        Ld:
            if (r0 == 0) goto L10
            return r0
        L10:
            androidx.navigation.NavGraph r0 = r2.getParent()
            if (r0 == 0) goto L1f
            androidx.navigation.NavGraph r0 = r2.getParent()
            androidx.navigation.NavAction r3 = r0.getAction(r3)
            return r3
        L1f:
            return r1
    }

    @androidx.annotation.NonNull
    public final java.util.Map<java.lang.String, androidx.navigation.NavArgument> getArguments() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.navigation.NavArgument> r0 = r1.mArguments
            if (r0 != 0) goto L7
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            return r0
        L7:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.mIdName
            if (r0 != 0) goto Lc
            int r0 = r1.mId
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r1.mIdName = r0
        Lc:
            java.lang.String r0 = r1.mIdName
            return r0
    }

    @androidx.annotation.IdRes
    public final int getId() {
            r1 = this;
            int r0 = r1.mId
            return r0
    }

    @androidx.annotation.Nullable
    public final java.lang.CharSequence getLabel() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mLabel
            return r0
    }

    @androidx.annotation.NonNull
    public final java.lang.String getNavigatorName() {
            r1 = this;
            java.lang.String r0 = r1.mNavigatorName
            return r0
    }

    @androidx.annotation.Nullable
    public final androidx.navigation.NavGraph getParent() {
            r1 = this;
            androidx.navigation.NavGraph r0 = r1.mParent
            return r0
    }

    public boolean hasDeepLink(@androidx.annotation.NonNull android.net.Uri r3) {
            r2 = this;
            androidx.navigation.NavDeepLinkRequest r0 = new androidx.navigation.NavDeepLinkRequest
            r1 = 0
            r0.<init>(r3, r1, r1)
            boolean r3 = r2.hasDeepLink(r0)
            return r3
    }

    public boolean hasDeepLink(@androidx.annotation.NonNull androidx.navigation.NavDeepLinkRequest r1) {
            r0 = this;
            androidx.navigation.NavDestination$DeepLinkMatch r1 = r0.matchDeepLink(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @androidx.annotation.Nullable
    androidx.navigation.NavDestination.DeepLinkMatch matchDeepLink(@androidx.annotation.NonNull androidx.navigation.NavDeepLinkRequest r12) {
            r11 = this;
            java.util.ArrayList<androidx.navigation.NavDeepLink> r0 = r11.mDeepLinks
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        Lb:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L65
            java.lang.Object r3 = r0.next()
            androidx.navigation.NavDeepLink r3 = (androidx.navigation.NavDeepLink) r3
            android.net.Uri r4 = r12.getUri()
            if (r4 == 0) goto L27
            java.util.Map r5 = r11.getArguments()
            android.os.Bundle r4 = r3.getMatchingArguments(r4, r5)
            r7 = r4
            goto L28
        L27:
            r7 = r1
        L28:
            java.lang.String r4 = r12.getAction()
            if (r4 == 0) goto L3b
            java.lang.String r5 = r3.getAction()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L3b
            r4 = 1
            r9 = 1
            goto L3d
        L3b:
            r4 = 0
            r9 = 0
        L3d:
            java.lang.String r4 = r12.getMimeType()
            r5 = -1
            if (r4 == 0) goto L4a
            int r4 = r3.getMimeTypeMatchRating(r4)
            r10 = r4
            goto L4b
        L4a:
            r10 = -1
        L4b:
            if (r7 != 0) goto L51
            if (r9 != 0) goto L51
            if (r10 <= r5) goto Lb
        L51:
            androidx.navigation.NavDestination$DeepLinkMatch r5 = new androidx.navigation.NavDestination$DeepLinkMatch
            boolean r8 = r3.isExactDeepLink()
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            if (r2 == 0) goto L63
            int r3 = r5.compareTo2(r2)
            if (r3 <= 0) goto Lb
        L63:
            r2 = r5
            goto Lb
        L65:
            return r2
    }

    @androidx.annotation.CallSuper
    public void onInflate(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.util.AttributeSet r4) {
            r2 = this;
            android.content.res.Resources r0 = r3.getResources()
            int[] r1 = androidx.navigation.common.R.styleable.Navigator
            android.content.res.TypedArray r4 = r0.obtainAttributes(r4, r1)
            int r0 = androidx.navigation.common.R.styleable.Navigator_android_id
            r1 = 0
            int r0 = r4.getResourceId(r0, r1)
            r2.setId(r0)
            int r0 = r2.mId
            java.lang.String r3 = getDisplayName(r3, r0)
            r2.mIdName = r3
            int r3 = androidx.navigation.common.R.styleable.Navigator_android_label
            java.lang.CharSequence r3 = r4.getText(r3)
            r2.setLabel(r3)
            r4.recycle()
            return
    }

    public final void putAction(@androidx.annotation.IdRes int r2, @androidx.annotation.IdRes int r3) {
            r1 = this;
            androidx.navigation.NavAction r0 = new androidx.navigation.NavAction
            r0.<init>(r3)
            r1.putAction(r2, r0)
            return
    }

    public final void putAction(@androidx.annotation.IdRes int r3, @androidx.annotation.NonNull androidx.navigation.NavAction r4) {
            r2 = this;
            boolean r0 = r2.supportsActions()
            if (r0 == 0) goto L21
            if (r3 == 0) goto L19
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r0 = r2.mActions
            if (r0 != 0) goto L13
            androidx.collection.SparseArrayCompat r0 = new androidx.collection.SparseArrayCompat
            r0.<init>()
            r2.mActions = r0
        L13:
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r0 = r2.mActions
            r0.put(r3, r4)
            return
        L19:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Cannot have an action with actionId 0"
            r3.<init>(r4)
            throw r3
        L21:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot add action "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " to "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public final void removeAction(@androidx.annotation.IdRes int r2) {
            r1 = this;
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r0 = r1.mActions
            if (r0 != 0) goto L5
            return
        L5:
            r0.remove(r2)
            return
    }

    public final void removeArgument(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.navigation.NavArgument> r0 = r1.mArguments
            if (r0 != 0) goto L5
            return
        L5:
            r0.remove(r2)
            return
    }

    public final void setId(@androidx.annotation.IdRes int r1) {
            r0 = this;
            r0.mId = r1
            r1 = 0
            r0.mIdName = r1
            return
    }

    public final void setLabel(@androidx.annotation.Nullable java.lang.CharSequence r1) {
            r0 = this;
            r0.mLabel = r1
            return
    }

    final void setParent(androidx.navigation.NavGraph r1) {
            r0 = this;
            r0.mParent = r1
            return
    }

    boolean supportsActions() {
            r1 = this;
            r0 = 1
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.String r1 = r2.mIdName
            if (r1 != 0) goto L28
            java.lang.String r1 = "0x"
            r0.append(r1)
            int r1 = r2.mId
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            goto L2b
        L28:
            r0.append(r1)
        L2b:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.CharSequence r1 = r2.mLabel
            if (r1 == 0) goto L3e
            java.lang.String r1 = " label="
            r0.append(r1)
            java.lang.CharSequence r1 = r2.mLabel
            r0.append(r1)
        L3e:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
