package cn.easyar.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class EasyAR {
    private static java.lang.ref.WeakReference<android.app.Activity> InitializedActivity;

    public EasyAR() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.ref.WeakReference<android.app.Activity> getInitializeActivity() {
            java.lang.ref.WeakReference<android.app.Activity> r0 = cn.easyar.engine.EasyAR.InitializedActivity
            return r0
    }

    private static void setInitializeActivity(android.app.Activity r1) {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            cn.easyar.engine.EasyAR.InitializedActivity = r0
            return
    }
}
