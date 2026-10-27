package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NavigatorProvider {
    private static final java.util.HashMap<java.lang.Class<?>, java.lang.String> sAnnotationNames = null;
    private final java.util.HashMap<java.lang.String, androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>> mNavigators;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.navigation.NavigatorProvider.sAnnotationNames = r0
            return
    }

    public NavigatorProvider() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mNavigators = r0
            return
    }

    @androidx.annotation.NonNull
    static java.lang.String getNameForNavigator(@androidx.annotation.NonNull java.lang.Class<? extends androidx.navigation.Navigator> r3) {
            java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.navigation.NavigatorProvider.sAnnotationNames
            java.lang.Object r1 = r0.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L3f
            java.lang.Class<androidx.navigation.Navigator$Name> r1 = androidx.navigation.Navigator.Name.class
            java.lang.annotation.Annotation r1 = r3.getAnnotation(r1)
            androidx.navigation.Navigator$Name r1 = (androidx.navigation.Navigator.Name) r1
            if (r1 == 0) goto L19
            java.lang.String r1 = r1.value()
            goto L1a
        L19:
            r1 = 0
        L1a:
            boolean r2 = validateName(r1)
            if (r2 == 0) goto L24
            r0.put(r3, r1)
            return r1
        L24:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No @Navigator.Name annotation found for "
            r1.append(r2)
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L3f:
            return r1
    }

    private static boolean validateName(java.lang.String r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public final androidx.navigation.Navigator<? extends androidx.navigation.NavDestination> addNavigator(@androidx.annotation.NonNull androidx.navigation.Navigator<? extends androidx.navigation.NavDestination> r2) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = getNameForNavigator(r0)
            androidx.navigation.Navigator r2 = r1.addNavigator(r0, r2)
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    public androidx.navigation.Navigator<? extends androidx.navigation.NavDestination> addNavigator(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull androidx.navigation.Navigator<? extends androidx.navigation.NavDestination> r3) {
            r1 = this;
            boolean r0 = validateName(r2)
            if (r0 == 0) goto Lf
            java.util.HashMap<java.lang.String, androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>> r0 = r1.mNavigators
            java.lang.Object r2 = r0.put(r2, r3)
            androidx.navigation.Navigator r2 = (androidx.navigation.Navigator) r2
            return r2
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "navigator name cannot be an empty string"
            r2.<init>(r3)
            throw r2
    }

    @androidx.annotation.NonNull
    public final <T extends androidx.navigation.Navigator<?>> T getNavigator(@androidx.annotation.NonNull java.lang.Class<T> r1) {
            r0 = this;
            java.lang.String r1 = getNameForNavigator(r1)
            androidx.navigation.Navigator r1 = r0.getNavigator(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CallSuper
    public <T extends androidx.navigation.Navigator<?>> T getNavigator(@androidx.annotation.NonNull java.lang.String r4) {
            r3 = this;
            boolean r0 = validateName(r4)
            if (r0 == 0) goto L2d
            java.util.HashMap<java.lang.String, androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>> r0 = r3.mNavigators
            java.lang.Object r0 = r0.get(r4)
            androidx.navigation.Navigator r0 = (androidx.navigation.Navigator) r0
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not find Navigator with name \""
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "\". You must call NavController.addNavigator() for each navigation type."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "navigator name cannot be an empty string"
            r4.<init>(r0)
            throw r4
    }

    java.util.Map<java.lang.String, androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>> getNavigators() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>> r0 = r1.mNavigators
            return r0
    }
}
