package s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {
    private final java.lang.String a;
    private com.bjtsn.dylan.requestpermission.PermissionDispatcherFragment b;
    private java.lang.String[] c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();

        void b(@org.jetbrains.annotations.NotNull java.lang.String[] r1);

        void c(@org.jetbrains.annotations.NotNull java.lang.String[] r1);
    }

    public b(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            java.lang.String r0 = "REQUEST_PERMISSION_FRAGMENT"
            r1.a = r0
            androidx.fragment.app.FragmentManager r2 = r2.getChildFragmentManager()
            java.lang.String r0 = "fragment.childFragmentManager"
            kotlin.jvm.internal.g0.o(r2, r0)
            com.bjtsn.dylan.requestpermission.PermissionDispatcherFragment r2 = r1.b(r2)
            r1.b = r2
            return
    }

    public b(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            java.lang.String r0 = "REQUEST_PERMISSION_FRAGMENT"
            r1.a = r0
            androidx.fragment.app.FragmentManager r2 = r2.getSupportFragmentManager()
            java.lang.String r0 = "activity.supportFragmentManager"
            kotlin.jvm.internal.g0.o(r2, r0)
            com.bjtsn.dylan.requestpermission.PermissionDispatcherFragment r2 = r1.b(r2)
            r1.b = r2
            return
    }

    private final androidx.fragment.app.Fragment a(androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            java.lang.String r0 = r1.a
            androidx.fragment.app.Fragment r2 = r2.findFragmentByTag(r0)
            return r2
    }

    private final com.bjtsn.dylan.requestpermission.PermissionDispatcherFragment b(androidx.fragment.app.FragmentManager r4) {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.a(r4)
            if (r0 != 0) goto L1b
            com.bjtsn.dylan.requestpermission.PermissionDispatcherFragment r0 = new com.bjtsn.dylan.requestpermission.PermissionDispatcherFragment
            r0.<init>()
            androidx.fragment.app.FragmentTransaction r1 = r4.beginTransaction()
            java.lang.String r2 = r3.a
            androidx.fragment.app.FragmentTransaction r1 = r1.add(r0, r2)
            r1.commitAllowingStateLoss()
            r4.executePendingTransactions()
        L1b:
            com.bjtsn.dylan.requestpermission.PermissionDispatcherFragment r0 = (com.bjtsn.dylan.requestpermission.PermissionDispatcherFragment) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final s.b c(@org.jetbrains.annotations.NotNull java.lang.String... r2) {
            r1 = this;
            java.lang.String r0 = "permissions"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.c = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final s.b d(@org.jetbrains.annotations.NotNull s.b.a r4) {
            r3 = this;
            java.lang.String r0 = "permissionCheckCallBack"
            kotlin.jvm.internal.g0.p(r4, r0)
            com.bjtsn.dylan.requestpermission.PermissionDispatcherFragment r0 = r3.b
            java.lang.String[] r1 = r3.c
            if (r1 != 0) goto L10
            java.lang.String r2 = "permissions"
            kotlin.jvm.internal.g0.S(r2)
        L10:
            r0.requestPermissions(r1, r4)
            return r3
    }
}
