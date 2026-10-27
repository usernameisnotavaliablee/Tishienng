package com.kwad.components.core.t;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f {
    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.StackTraceElement r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.getClassName()
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.String r2 = r2.getMethodName()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static boolean aH(@androidx.annotation.Nullable java.lang.String r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            int r2 = r1.length
            r3 = 0
        Le:
            if (r3 >= r2) goto L21
            r4 = r1[r3]
            java.lang.String r4 = a(r4)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L1e
            r5 = 1
            return r5
        L1e:
            int r3 = r3 + 1
            goto Le
        L21:
            return r0
    }
}
