package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h4 {
    public static com.acse.ottn.h4 a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f2355b = "ServiceUtils";

    static {
            return
    }

    public h4() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.h4 a() {
            com.acse.ottn.h4 r0 = com.acse.ottn.h4.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.h4> r0 = com.acse.ottn.h4.class
            monitor-enter(r0)
            com.acse.ottn.h4 r1 = com.acse.ottn.h4.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.h4 r1 = new com.acse.ottn.h4     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.h4.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.h4 r0 = com.acse.ottn.h4.a
            return r0
    }

    public boolean a(android.app.Service r1) {
            r0 = this;
            boolean r1 = r1 instanceof android.accessibilityservice.AccessibilityService
            if (r1 == 0) goto L6
            r1 = 0
            return r1
        L6:
            r1 = 1
            return r1
    }

    public final java.lang.Object b() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.h4 r0 = com.acse.ottn.h4.a
            return r0
    }
}
