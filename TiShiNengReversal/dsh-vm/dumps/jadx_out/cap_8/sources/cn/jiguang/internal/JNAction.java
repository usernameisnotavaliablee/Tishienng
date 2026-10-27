package cn.jiguang.internal;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JNAction {
    public JNAction() {
            r0 = this;
            r0.<init>()
            return
    }

    public static native boolean a(java.lang.String r0, java.lang.String r1);

    public static native boolean d(java.lang.String r0);

    public static native void i(java.lang.String r0, long r1, int r3);

    public static boolean load() {
            java.lang.String r0 = "jutils"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Throwable -> L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static boolean loadPath(java.lang.String r0) {
            java.lang.System.load(r0)     // Catch: java.lang.Throwable -> L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static native byte[] r(java.lang.String r0);

    public static native void s(java.lang.String r0, long r1, int r3, java.lang.String r4);

    public static native java.lang.String v();

    public static native boolean w(java.lang.String r0, java.lang.String r1);
}
