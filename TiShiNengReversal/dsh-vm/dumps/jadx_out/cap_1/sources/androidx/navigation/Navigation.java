package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Navigation {



    private Navigation() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.view.View.OnClickListener createNavigateOnClickListener(@androidx.annotation.IdRes int r1) {
            r0 = 0
            android.view.View$OnClickListener r1 = createNavigateOnClickListener(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static android.view.View.OnClickListener createNavigateOnClickListener(@androidx.annotation.IdRes int r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            androidx.navigation.Navigation$1 r0 = new androidx.navigation.Navigation$1
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.view.View.OnClickListener createNavigateOnClickListener(@androidx.annotation.NonNull androidx.navigation.NavDirections r1) {
            androidx.navigation.Navigation$2 r0 = new androidx.navigation.Navigation$2
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.navigation.NavController findNavController(@androidx.annotation.NonNull android.app.Activity r3, @androidx.annotation.IdRes int r4) {
            android.view.View r0 = androidx.core.app.ActivityCompat.requireViewById(r3, r4)
            androidx.navigation.NavController r0 = findViewNavController(r0)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Activity "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " does not have a NavController set on "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @androidx.annotation.NonNull
    public static androidx.navigation.NavController findNavController(@androidx.annotation.NonNull android.view.View r3) {
            androidx.navigation.NavController r0 = findViewNavController(r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " does not have a NavController set"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @androidx.annotation.Nullable
    private static androidx.navigation.NavController findViewNavController(@androidx.annotation.NonNull android.view.View r2) {
        L0:
            r0 = 0
            if (r2 == 0) goto L17
            androidx.navigation.NavController r1 = getViewNavController(r2)
            if (r1 == 0) goto La
            return r1
        La:
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L15
            android.view.View r2 = (android.view.View) r2
            goto L0
        L15:
            r2 = r0
            goto L0
        L17:
            return r0
    }

    @androidx.annotation.Nullable
    private static androidx.navigation.NavController getViewNavController(@androidx.annotation.NonNull android.view.View r1) {
            int r0 = androidx.navigation.R.id.nav_controller_view_tag
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof java.lang.ref.WeakReference
            if (r0 == 0) goto L13
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            androidx.navigation.NavController r1 = (androidx.navigation.NavController) r1
            return r1
        L13:
            boolean r0 = r1 instanceof androidx.navigation.NavController
            if (r0 == 0) goto L1a
            androidx.navigation.NavController r1 = (androidx.navigation.NavController) r1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    public static void setViewNavController(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable androidx.navigation.NavController r2) {
            int r0 = androidx.navigation.R.id.nav_controller_view_tag
            r1.setTag(r0, r2)
            return
    }
}
