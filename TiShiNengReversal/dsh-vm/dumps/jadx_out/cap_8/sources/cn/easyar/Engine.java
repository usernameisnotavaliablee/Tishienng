package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C8E75EBBD")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Engine {
    public Engine() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.app.Activity r0, java.lang.String r1) {
            d()
            boolean r0 = setupActivity(r0)
            if (r0 == 0) goto L11
            boolean r0 = initializeKey(r1)
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    public static boolean b(android.app.Activity r0, java.lang.String r1, java.lang.String r2) {
            e(r2)
            boolean r0 = setupActivity(r0)
            if (r0 == 0) goto L11
            boolean r0 = initializeKey(r1)
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    public static boolean c(android.app.Activity r0, java.lang.String r1) {
            boolean r0 = setupActivity(r0)
            if (r0 == 0) goto Le
            boolean r0 = initializeKey(r1)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static void d() {
            java.lang.String r0 = "EasyAR"
            java.lang.System.loadLibrary(r0)
            cn.easyar.q.a()
            return
    }

    public static void e(java.lang.String r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "/libEasyAR.so"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.System.load(r1)
            cn.easyar.q.a()
            return
    }

    @cn.easyar.MethodId("C1D7F81F3")
    public static native java.lang.String errorMessage();

    @cn.easyar.MethodId("C37873CEF")
    public static native boolean initializeKey(java.lang.String r0);

    @cn.easyar.MethodId("C059E7BAC")
    public static native boolean isLicenseKeyMatched(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3);

    @cn.easyar.MethodId("C82A3537F")
    public static native java.lang.String name();

    @cn.easyar.MethodId("CDBC6476A")
    public static native void onPause();

    @cn.easyar.MethodId("CA37CC4E3")
    public static native void onResume();

    @cn.easyar.MethodId("CB01257F6")
    public static native int schemaHash();

    @cn.easyar.MethodId("C3556B4DE")
    public static native boolean setupActivity(android.app.Activity r0);

    @cn.easyar.MethodId("CCB7BF562")
    public static native java.lang.String variant();

    @cn.easyar.MethodId("CB781B70F")
    public static native java.lang.String versionString();
}
