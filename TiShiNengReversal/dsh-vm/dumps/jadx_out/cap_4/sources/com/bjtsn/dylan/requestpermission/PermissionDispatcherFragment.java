package com.bjtsn.dylan.requestpermission;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class PermissionDispatcherFragment extends androidx.fragment.app.Fragment {
    private android.util.SparseArray<s.b.a> c;

    public PermissionDispatcherFragment() {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.c = r0
            return
    }

    private final boolean b(java.lang.String r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto Le
            int r2 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r2)
            if (r2 != 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    private final java.util.List<java.lang.String> c(java.lang.String[] r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L17
            r3 = r6[r2]
            boolean r4 = r5.b(r3)
            if (r4 != 0) goto L14
            r0.add(r3)
        L14:
            int r2 = r2 + 1
            goto L7
        L17:
            return r0
    }

    private final boolean d(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            if (r0 == 0) goto Le
            boolean r2 = androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(r0, r2)
            r0 = 1
            if (r2 != r0) goto Le
            return r0
        Le:
            r2 = 0
            return r2
    }

    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            r1 = 1
            r0.setRetainInstance(r1)
            return
    }

    public void onRequestPermissionsResult(int r2, @org.jetbrains.annotations.NotNull java.lang.String[] r3, @org.jetbrains.annotations.NotNull int[] r4) {
            r1 = this;
            com.stub.StubApp.interface22(r2, r3, r4)
            java.lang.String r0 = "permissions"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "grantResults"
            kotlin.jvm.internal.g0.p(r4, r0)
            super.onRequestPermissionsResult(r2, r3, r4)
            android.util.SparseArray<s.b$a> r4 = r1.c
            java.lang.Object r4 = r4.get(r2)
            s.b$a r4 = (s.b.a) r4
            android.util.SparseArray<s.b$a> r0 = r1.c
            r0.remove(r2)
            if (r4 != 0) goto L20
            return
        L20:
            java.util.List r2 = r1.c(r3)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L2e
            r4.a()
            return
        L2e:
            java.util.Iterator r2 = r2.iterator()
        L32:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r1.d(r0)
            if (r0 != 0) goto L32
            r4.b(r3)
            return
        L48:
            r4.c(r3)
            return
    }

    public final void requestPermissions(@org.jetbrains.annotations.NotNull java.lang.String[] r3, @org.jetbrains.annotations.NotNull s.b.a r4) {
            r2 = this;
            java.lang.String r0 = "permissions"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "callBack"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.List r0 = r2.c(r3)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
            android.util.SparseArray<s.b$a> r0 = r2.c
            int r0 = r0.size()
            int r0 = r0 + 1
            android.util.SparseArray<s.b$a> r1 = r2.c
            r1.put(r0, r4)
            r2.requestPermissions(r3, r0)
            return
        L27:
            r4.a()
            return
    }
}
