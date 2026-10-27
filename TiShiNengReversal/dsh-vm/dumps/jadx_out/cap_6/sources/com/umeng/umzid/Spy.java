package com.umeng.umzid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Spy {
    public static boolean initSuccess;

    static {
            java.lang.String r0 = "umeng-spy"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Throwable -> L8
            r0 = 1
            com.umeng.umzid.Spy.initSuccess = r0     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    public Spy() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getID() {
            boolean r0 = com.umeng.umzid.Spy.initSuccess
            if (r0 == 0) goto L9
            java.lang.String r0 = getNativeID()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static native java.lang.String getNativeID();

    public static native java.lang.String getNativeLibraryVersion();

    public static native java.lang.String getNativeTag(boolean r0, boolean r1);

    public static synchronized java.lang.String getTag(android.content.Context r3) {
            java.lang.Class<com.umeng.umzid.Spy> r0 = com.umeng.umzid.Spy.class
            monitor-enter(r0)
            r1 = 0
            if (r3 == 0) goto Ld
            boolean r2 = com.umeng.umzid.d.j(r3)     // Catch: java.lang.Throwable -> Lb
            goto Le
        Lb:
            r3 = move-exception
            goto L1a
        Ld:
            r2 = 0
        Le:
            if (r3 == 0) goto L14
            boolean r1 = com.umeng.umzid.d.i(r3)     // Catch: java.lang.Throwable -> Lb
        L14:
            java.lang.String r3 = getNativeTag(r2, r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r3
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    public static java.lang.String getVersion() {
            boolean r0 = com.umeng.umzid.Spy.initSuccess
            if (r0 == 0) goto L9
            java.lang.String r0 = getNativeLibraryVersion()
            return r0
        L9:
            r0 = 0
            return r0
    }
}
