package androidx.navigation;

import androidx.navigation.NavDestination;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.navigation.NavDestinationDsl
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NavDestinationBuilder<D extends androidx.navigation.NavDestination> {
    private java.util.Map<java.lang.Integer, androidx.navigation.NavAction> actions;
    private java.util.Map<java.lang.String, androidx.navigation.NavArgument> arguments;
    private java.util.List<androidx.navigation.NavDeepLink> deepLinks;
    private final int id;

    @org.jetbrains.annotations.Nullable
    private java.lang.CharSequence label;

    @org.jetbrains.annotations.NotNull
    private final androidx.navigation.Navigator<? extends D> navigator;

    public NavDestinationBuilder(@org.jetbrains.annotations.NotNull androidx.navigation.Navigator<? extends D> r2, @androidx.annotation.IdRes int r3) {
            r1 = this;
            java.lang.String r0 = "navigator"
            kotlin.jvm.internal.g0.q(r2, r0)
            r1.<init>()
            r1.navigator = r2
            r1.id = r3
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.arguments = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.deepLinks = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.actions = r2
            return
    }

    public final void action(int r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.navigation.NavActionBuilder, kotlin.n1> r4) {
            r2 = this;
            java.lang.String r0 = "actionBuilder"
            kotlin.jvm.internal.g0.q(r4, r0)
            java.util.Map<java.lang.Integer, androidx.navigation.NavAction> r0 = r2.actions
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            androidx.navigation.NavActionBuilder r1 = new androidx.navigation.NavActionBuilder
            r1.<init>()
            r4.invoke(r1)
            androidx.navigation.NavAction r4 = r1.build$navigation_common_ktx_release()
            r0.put(r3, r4)
            return
    }

    public final void argument(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.navigation.NavArgumentBuilder, kotlin.n1> r4) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.q(r3, r0)
            java.lang.String r0 = "argumentBuilder"
            kotlin.jvm.internal.g0.q(r4, r0)
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r0 = r2.arguments
            androidx.navigation.NavArgumentBuilder r1 = new androidx.navigation.NavArgumentBuilder
            r1.<init>()
            r4.invoke(r1)
            androidx.navigation.NavArgument r4 = r1.build()
            r0.put(r3, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public D build() {
            r4 = this;
            androidx.navigation.Navigator<? extends D extends androidx.navigation.NavDestination> r0 = r4.navigator
            androidx.navigation.NavDestination r0 = r0.createDestination()
            int r1 = r4.id
            r0.setId(r1)
            java.lang.CharSequence r1 = r4.label
            r0.setLabel(r1)
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r1 = r4.arguments
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.navigation.NavArgument r2 = (androidx.navigation.NavArgument) r2
            r0.addArgument(r3, r2)
            goto L1a
        L36:
            java.util.List<androidx.navigation.NavDeepLink> r1 = r4.deepLinks
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L3e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r1.next()
            androidx.navigation.NavDeepLink r2 = (androidx.navigation.NavDeepLink) r2
            r0.addDeepLink(r2)
            goto L3e
        L4e:
            java.util.Map<java.lang.Integer, androidx.navigation.NavAction> r1 = r4.actions
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L58:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            androidx.navigation.NavAction r2 = (androidx.navigation.NavAction) r2
            r0.putAction(r3, r2)
            goto L58
        L78:
            return r0
    }

    public final void deepLink(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "uriPattern"
            kotlin.jvm.internal.g0.q(r3, r0)
            java.util.List<androidx.navigation.NavDeepLink> r0 = r2.deepLinks
            androidx.navigation.NavDeepLink r1 = new androidx.navigation.NavDeepLink
            r1.<init>(r3)
            r0.add(r1)
            return
    }

    public final void deepLink(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.navigation.NavDeepLinkDslBuilder, kotlin.n1> r3) {
            r2 = this;
            java.lang.String r0 = "navDeepLink"
            kotlin.jvm.internal.g0.q(r3, r0)
            java.util.List<androidx.navigation.NavDeepLink> r0 = r2.deepLinks
            androidx.navigation.NavDeepLinkDslBuilder r1 = new androidx.navigation.NavDeepLinkDslBuilder
            r1.<init>()
            r3.invoke(r1)
            androidx.navigation.NavDeepLink r3 = r1.build$navigation_common_ktx_release()
            r0.add(r3)
            return
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.CharSequence getLabel() {
            r1 = this;
            java.lang.CharSequence r0 = r1.label
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected final androidx.navigation.Navigator<? extends D> getNavigator() {
            r1 = this;
            androidx.navigation.Navigator<? extends D extends androidx.navigation.NavDestination> r0 = r1.navigator
            return r0
    }

    public final void setLabel(@org.jetbrains.annotations.Nullable java.lang.CharSequence r1) {
            r0 = this;
            r0.label = r1
            return
    }
}
