package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavDeepLinkBuilder {
    private android.os.Bundle mArgs;
    private final android.content.Context mContext;
    private int mDestId;
    private androidx.navigation.NavGraph mGraph;
    private final android.content.Intent mIntent;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class PermissiveNavigatorProvider extends androidx.navigation.NavigatorProvider {
        private final androidx.navigation.Navigator<androidx.navigation.NavDestination> mDestNavigator;


        PermissiveNavigatorProvider() {
                r1 = this;
                r1.<init>()
                androidx.navigation.NavDeepLinkBuilder$PermissiveNavigatorProvider$1 r0 = new androidx.navigation.NavDeepLinkBuilder$PermissiveNavigatorProvider$1
                r0.<init>(r1)
                r1.mDestNavigator = r0
                androidx.navigation.NavGraphNavigator r0 = new androidx.navigation.NavGraphNavigator
                r0.<init>(r1)
                r1.addNavigator(r0)
                return
        }

        @Override // androidx.navigation.NavigatorProvider
        @androidx.annotation.NonNull
        public androidx.navigation.Navigator<? extends androidx.navigation.NavDestination> getNavigator(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                androidx.navigation.Navigator r1 = super.getNavigator(r1)     // Catch: java.lang.IllegalStateException -> L5
                return r1
            L5:
                androidx.navigation.Navigator<androidx.navigation.NavDestination> r1 = r0.mDestNavigator
                return r1
        }
    }

    public NavDeepLinkBuilder(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r2.mContext = r3
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L15
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class r1 = r3.getClass()
            r0.<init>(r3, r1)
            r2.mIntent = r0
            goto L2b
        L15:
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            java.lang.String r3 = r3.getPackageName()
            android.content.Intent r3 = r0.getLaunchIntentForPackage(r3)
            if (r3 == 0) goto L24
            goto L29
        L24:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
        L29:
            r2.mIntent = r3
        L2b:
            android.content.Intent r3 = r2.mIntent
            r0 = 268468224(0x10008000, float:2.5342157E-29)
            r3.addFlags(r0)
            return
    }

    NavDeepLinkBuilder(@androidx.annotation.NonNull androidx.navigation.NavController r2) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0)
            androidx.navigation.NavGraph r2 = r2.getGraph()
            r1.mGraph = r2
            return
    }

    private void fillInIntent() {
            r5 = this;
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            androidx.navigation.NavGraph r1 = r5.mGraph
            r0.add(r1)
            r1 = 0
        Lb:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L3d
            if (r1 != 0) goto L3d
            java.lang.Object r2 = r0.poll()
            androidx.navigation.NavDestination r2 = (androidx.navigation.NavDestination) r2
            int r3 = r2.getId()
            int r4 = r5.mDestId
            if (r3 != r4) goto L23
            r1 = r2
            goto Lb
        L23:
            boolean r3 = r2 instanceof androidx.navigation.NavGraph
            if (r3 == 0) goto Lb
            androidx.navigation.NavGraph r2 = (androidx.navigation.NavGraph) r2
            java.util.Iterator r2 = r2.iterator()
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb
            java.lang.Object r3 = r2.next()
            androidx.navigation.NavDestination r3 = (androidx.navigation.NavDestination) r3
            r0.add(r3)
            goto L2d
        L3d:
            if (r1 == 0) goto L4b
            android.content.Intent r0 = r5.mIntent
            java.lang.String r2 = "android-support-nav:controller:deepLinkIds"
            int[] r1 = r1.buildDeepLinkIds()
            r0.putExtra(r2, r1)
            return
        L4b:
            android.content.Context r0 = r5.mContext
            int r1 = r5.mDestId
            java.lang.String r0 = androidx.navigation.NavDestination.getDisplayName(r0, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Navigation destination "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " cannot be found in the navigation graph "
            r2.append(r0)
            androidx.navigation.NavGraph r0 = r5.mGraph
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.NonNull
    public android.app.PendingIntent createPendingIntent() {
            r5 = this;
            android.os.Bundle r0 = r5.mArgs
            r1 = 0
            if (r0 == 0) goto L2d
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        Le:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r5.mArgs
            java.lang.Object r3 = r4.get(r3)
            int r2 = r2 * 31
            if (r3 == 0) goto L29
            int r3 = r3.hashCode()
            goto L2a
        L29:
            r3 = 0
        L2a:
            int r2 = r2 + r3
            goto Le
        L2c:
            r1 = r2
        L2d:
            int r1 = r1 * 31
            int r0 = r5.mDestId
            int r1 = r1 + r0
            androidx.core.app.TaskStackBuilder r0 = r5.createTaskStackBuilder()
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = r0.getPendingIntent(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.app.TaskStackBuilder createTaskStackBuilder() {
            r5 = this;
            android.content.Intent r0 = r5.mIntent
            java.lang.String r1 = "android-support-nav:controller:deepLinkIds"
            int[] r0 = r0.getIntArrayExtra(r1)
            if (r0 != 0) goto L1e
            androidx.navigation.NavGraph r0 = r5.mGraph
            if (r0 != 0) goto L16
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must call setGraph() before constructing the deep link"
            r0.<init>(r1)
            throw r0
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must call setDestination() before constructing the deep link"
            r0.<init>(r1)
            throw r0
        L1e:
            android.content.Context r0 = r5.mContext
            androidx.core.app.TaskStackBuilder r0 = androidx.core.app.TaskStackBuilder.create(r0)
            android.content.Intent r1 = new android.content.Intent
            android.content.Intent r2 = r5.mIntent
            r1.<init>(r2)
            androidx.core.app.TaskStackBuilder r0 = r0.addNextIntentWithParentStack(r1)
            r1 = 0
        L30:
            int r2 = r0.getIntentCount()
            if (r1 >= r2) goto L44
            android.content.Intent r2 = r0.editIntentAt(r1)
            java.lang.String r3 = "android-support-nav:controller:deepLinkIntent"
            android.content.Intent r4 = r5.mIntent
            r2.putExtra(r3, r4)
            int r1 = r1 + 1
            goto L30
        L44:
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.navigation.NavDeepLinkBuilder setArguments(@androidx.annotation.Nullable android.os.Bundle r3) {
            r2 = this;
            r2.mArgs = r3
            android.content.Intent r0 = r2.mIntent
            java.lang.String r1 = "android-support-nav:controller:deepLinkExtras"
            r0.putExtra(r1, r3)
            return r2
    }

    @androidx.annotation.NonNull
    public androidx.navigation.NavDeepLinkBuilder setComponentName(@androidx.annotation.NonNull android.content.ComponentName r2) {
            r1 = this;
            android.content.Intent r0 = r1.mIntent
            r0.setComponent(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.navigation.NavDeepLinkBuilder setComponentName(@androidx.annotation.NonNull java.lang.Class<? extends android.app.Activity> r3) {
            r2 = this;
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r1 = r2.mContext
            r0.<init>(r1, r3)
            androidx.navigation.NavDeepLinkBuilder r3 = r2.setComponentName(r0)
            return r3
    }

    @androidx.annotation.NonNull
    public androidx.navigation.NavDeepLinkBuilder setDestination(@androidx.annotation.IdRes int r1) {
            r0 = this;
            r0.mDestId = r1
            androidx.navigation.NavGraph r1 = r0.mGraph
            if (r1 == 0) goto L9
            r0.fillInIntent()
        L9:
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.navigation.NavDeepLinkBuilder setGraph(@androidx.annotation.NavigationRes int r4) {
            r3 = this;
            androidx.navigation.NavInflater r0 = new androidx.navigation.NavInflater
            android.content.Context r1 = r3.mContext
            androidx.navigation.NavDeepLinkBuilder$PermissiveNavigatorProvider r2 = new androidx.navigation.NavDeepLinkBuilder$PermissiveNavigatorProvider
            r2.<init>()
            r0.<init>(r1, r2)
            androidx.navigation.NavGraph r4 = r0.inflate(r4)
            androidx.navigation.NavDeepLinkBuilder r4 = r3.setGraph(r4)
            return r4
    }

    @androidx.annotation.NonNull
    public androidx.navigation.NavDeepLinkBuilder setGraph(@androidx.annotation.NonNull androidx.navigation.NavGraph r1) {
            r0 = this;
            r0.mGraph = r1
            int r1 = r0.mDestId
            if (r1 == 0) goto L9
            r0.fillInIntent()
        L9:
            return r0
    }
}
