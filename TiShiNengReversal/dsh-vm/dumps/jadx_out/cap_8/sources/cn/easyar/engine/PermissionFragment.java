package cn.easyar.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(23)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PermissionFragment extends android.app.Fragment {
    private static final int PERMISSIONS_REQUEST_CODE = 43;
    private cn.easyar.engine.PermissionFragment.PermissionCallback callback;
    private android.app.FragmentManager fragmentManager;
    private long instanceId;
    private java.lang.String[] requests;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface PermissionCallback {
        void invoke(long r1, int r3, java.lang.String r4);
    }

    public PermissionFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized cn.easyar.engine.PermissionFragment newInstance(long r2, java.lang.String[] r4, cn.easyar.engine.PermissionFragment.PermissionCallback r5, android.app.FragmentManager r6) {
            java.lang.Class<cn.easyar.engine.PermissionFragment> r0 = cn.easyar.engine.PermissionFragment.class
            monitor-enter(r0)
            cn.easyar.engine.PermissionFragment r1 = new cn.easyar.engine.PermissionFragment     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            r1.instanceId = r2     // Catch: java.lang.Throwable -> L12
            r1.requests = r4     // Catch: java.lang.Throwable -> L12
            r1.callback = r5     // Catch: java.lang.Throwable -> L12
            r1.fragmentManager = r6     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            java.lang.String[] r2 = r1.requests
            r0 = 43
            cn.easyar.engine.b.a(r1, r2, r0)
            return
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int r4, java.lang.String[] r5, int[] r6) {
            r3 = this;
            com.stub.StubApp.interface22(r4, r5, r6)
            r0 = 43
            if (r4 == r0) goto L8
            return
        L8:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0 = 0
            r1 = 0
        Lf:
            int r2 = r6.length
            if (r1 >= r2) goto L1f
            r2 = r6[r1]
            if (r2 != 0) goto L17
            goto L1c
        L17:
            r2 = r5[r1]
            r4.add(r2)
        L1c:
            int r1 = r1 + 1
            goto Lf
        L1f:
            android.app.FragmentManager r5 = r3.fragmentManager
            android.app.FragmentTransaction r5 = r5.beginTransaction()
            r5.remove(r3)
            r5.commit()
            int r5 = r4.size()
            if (r5 == 0) goto L40
            cn.easyar.engine.PermissionFragment$PermissionCallback r5 = r3.callback
            long r0 = r3.instanceId
            java.lang.String r6 = " "
            java.lang.String r4 = androidx.camera.core.processing.j0.a(r6, r4)
            r6 = 1
            r5.invoke(r0, r6, r4)
            return
        L40:
            cn.easyar.engine.PermissionFragment$PermissionCallback r4 = r3.callback
            long r5 = r3.instanceId
            java.lang.String r1 = ""
            r4.invoke(r5, r0, r1)
            return
    }
}
