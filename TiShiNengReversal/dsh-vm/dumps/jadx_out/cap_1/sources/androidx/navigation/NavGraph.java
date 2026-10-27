package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NavGraph extends androidx.navigation.NavDestination implements java.lang.Iterable<androidx.navigation.NavDestination> {
    final androidx.collection.SparseArrayCompat<androidx.navigation.NavDestination> mNodes;
    private int mStartDestId;
    private java.lang.String mStartDestIdName;


    public NavGraph(@androidx.annotation.NonNull androidx.navigation.Navigator<? extends androidx.navigation.NavGraph> r1) {
            r0 = this;
            r0.<init>(r1)
            androidx.collection.SparseArrayCompat r1 = new androidx.collection.SparseArrayCompat
            r1.<init>()
            r0.mNodes = r1
            return
    }

    public final void addAll(@androidx.annotation.NonNull androidx.navigation.NavGraph r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r2.next()
            androidx.navigation.NavDestination r0 = (androidx.navigation.NavDestination) r0
            r2.remove()
            r1.addDestination(r0)
            goto L4
        L17:
            return
    }

    public final void addDestination(@androidx.annotation.NonNull androidx.navigation.NavDestination r4) {
            r3 = this;
            int r0 = r4.getId()
            if (r0 == 0) goto L57
            int r1 = r3.getId()
            if (r0 == r1) goto L38
            androidx.collection.SparseArrayCompat<androidx.navigation.NavDestination> r1 = r3.mNodes
            java.lang.Object r0 = r1.get(r0)
            androidx.navigation.NavDestination r0 = (androidx.navigation.NavDestination) r0
            if (r0 != r4) goto L17
            return
        L17:
            androidx.navigation.NavGraph r1 = r4.getParent()
            if (r1 != 0) goto L30
            if (r0 == 0) goto L23
            r1 = 0
            r0.setParent(r1)
        L23:
            r4.setParent(r3)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavDestination> r0 = r3.mNodes
            int r1 = r4.getId()
            r0.put(r1, r4)
            return
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Destination already has a parent set. Call NavGraph.remove() to remove the previous parent."
            r4.<init>(r0)
            throw r4
        L38:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Destination "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " cannot have the same id as graph "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L57:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Destinations must have an id. Call setId() or include an android:id in your navigation XML."
            r4.<init>(r0)
            throw r4
    }

    public final void addDestinations(@androidx.annotation.NonNull java.util.Collection<androidx.navigation.NavDestination> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r2.next()
            androidx.navigation.NavDestination r0 = (androidx.navigation.NavDestination) r0
            if (r0 != 0) goto L13
            goto L4
        L13:
            r1.addDestination(r0)
            goto L4
        L17:
            return
    }

    public final void addDestinations(@androidx.annotation.NonNull androidx.navigation.NavDestination... r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lf
            r2 = r4[r1]
            if (r2 != 0) goto L9
            goto Lc
        L9:
            r3.addDestination(r2)
        Lc:
            int r1 = r1 + 1
            goto L2
        Lf:
            return
    }

    public final void clear() {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L11
            r0.next()
            r0.remove()
            goto L4
        L11:
            return
    }

    @androidx.annotation.Nullable
    public final androidx.navigation.NavDestination findNode(@androidx.annotation.IdRes int r2) {
            r1 = this;
            r0 = 1
            androidx.navigation.NavDestination r2 = r1.findNode(r2, r0)
            return r2
    }

    @androidx.annotation.Nullable
    final androidx.navigation.NavDestination findNode(@androidx.annotation.IdRes int r2, boolean r3) {
            r1 = this;
            androidx.collection.SparseArrayCompat<androidx.navigation.NavDestination> r0 = r1.mNodes
            java.lang.Object r0 = r0.get(r2)
            androidx.navigation.NavDestination r0 = (androidx.navigation.NavDestination) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            if (r3 == 0) goto L1c
            androidx.navigation.NavGraph r3 = r1.getParent()
            if (r3 == 0) goto L1c
            androidx.navigation.NavGraph r3 = r1.getParent()
            androidx.navigation.NavDestination r2 = r3.findNode(r2)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    @Override // androidx.navigation.NavDestination
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.lang.String getDisplayName() {
            r1 = this;
            int r0 = r1.getId()
            if (r0 == 0) goto Lb
            java.lang.String r0 = super.getDisplayName()
            return r0
        Lb:
            java.lang.String r0 = "the root navigation"
            return r0
    }

    @androidx.annotation.NonNull
    java.lang.String getStartDestDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.mStartDestIdName
            if (r0 != 0) goto Lc
            int r0 = r1.mStartDestId
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r1.mStartDestIdName = r0
        Lc:
            java.lang.String r0 = r1.mStartDestIdName
            return r0
    }

    @androidx.annotation.IdRes
    public final int getStartDestination() {
            r1 = this;
            int r0 = r1.mStartDestId
            return r0
    }

    @Override // java.lang.Iterable
    @androidx.annotation.NonNull
    public final java.util.Iterator<androidx.navigation.NavDestination> iterator() {
            r1 = this;
            androidx.navigation.NavGraph$1 r0 = new androidx.navigation.NavGraph$1
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.navigation.NavDestination
    @androidx.annotation.Nullable
    androidx.navigation.NavDestination.DeepLinkMatch matchDeepLink(@androidx.annotation.NonNull androidx.navigation.NavDeepLinkRequest r5) {
            r4 = this;
            androidx.navigation.NavDestination$DeepLinkMatch r0 = super.matchDeepLink(r5)
            java.util.Iterator r1 = r4.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            androidx.navigation.NavDestination r2 = (androidx.navigation.NavDestination) r2
            androidx.navigation.NavDestination$DeepLinkMatch r2 = r2.matchDeepLink(r5)
            if (r2 == 0) goto L8
            if (r0 == 0) goto L22
            int r3 = r2.compareTo2(r0)
            if (r3 <= 0) goto L8
        L22:
            r0 = r2
            goto L8
        L24:
            return r0
    }

    @Override // androidx.navigation.NavDestination
    public void onInflate(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.util.AttributeSet r4) {
            r2 = this;
            super.onInflate(r3, r4)
            android.content.res.Resources r0 = r3.getResources()
            int[] r1 = androidx.navigation.common.R.styleable.NavGraphNavigator
            android.content.res.TypedArray r4 = r0.obtainAttributes(r4, r1)
            int r0 = androidx.navigation.common.R.styleable.NavGraphNavigator_startDestination
            r1 = 0
            int r0 = r4.getResourceId(r0, r1)
            r2.setStartDestination(r0)
            int r0 = r2.mStartDestId
            java.lang.String r3 = androidx.navigation.NavDestination.getDisplayName(r3, r0)
            r2.mStartDestIdName = r3
            r4.recycle()
            return
    }

    public final void remove(@androidx.annotation.NonNull androidx.navigation.NavDestination r3) {
            r2 = this;
            androidx.collection.SparseArrayCompat<androidx.navigation.NavDestination> r0 = r2.mNodes
            int r3 = r3.getId()
            int r3 = r0.indexOfKey(r3)
            if (r3 < 0) goto L1d
            androidx.collection.SparseArrayCompat<androidx.navigation.NavDestination> r0 = r2.mNodes
            java.lang.Object r0 = r0.valueAt(r3)
            androidx.navigation.NavDestination r0 = (androidx.navigation.NavDestination) r0
            r1 = 0
            r0.setParent(r1)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavDestination> r0 = r2.mNodes
            r0.removeAt(r3)
        L1d:
            return
    }

    public final void setStartDestination(@androidx.annotation.IdRes int r4) {
            r3 = this;
            int r0 = r3.getId()
            if (r4 == r0) goto Lc
            r3.mStartDestId = r4
            r4 = 0
            r3.mStartDestIdName = r4
            return
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Start destination "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " cannot use the same id as the graph "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // androidx.navigation.NavDestination
    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = " startDestination="
            r0.append(r1)
            int r1 = r3.getStartDestination()
            androidx.navigation.NavDestination r1 = r3.findNode(r1)
            if (r1 != 0) goto L32
            java.lang.String r1 = r3.mStartDestIdName
            if (r1 != 0) goto L2e
            java.lang.String r1 = "0x"
            r0.append(r1)
            int r1 = r3.mStartDestId
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            goto L45
        L2e:
            r0.append(r1)
            goto L45
        L32:
            java.lang.String r2 = "{"
            r0.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
        L45:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
