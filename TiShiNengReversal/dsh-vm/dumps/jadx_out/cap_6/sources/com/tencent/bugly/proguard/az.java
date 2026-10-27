package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class az {
    public az() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.app.ActivityManager.ProcessErrorStateInfo a(android.app.ActivityManager r9, long r10) {
            r0 = 0
            r1 = 0
            if (r9 != 0) goto Lc
            java.lang.String r9 = "get anr state, ActivityManager is null"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.al.c(r9, r10)
            return r0
        Lc:
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r1] = r2
            java.lang.String r2 = "get anr state, timeout:%d"
            com.tencent.bugly.proguard.al.c(r2, r4)
            r4 = 500(0x1f4, double:2.47E-321)
            long r10 = r10 / r4
            r2 = 0
        L1e:
            java.util.List r6 = r9.getProcessesInErrorState()
            android.app.ActivityManager$ProcessErrorStateInfo r6 = a(r6)
            if (r6 != 0) goto L30
            java.lang.String r6 = "found proc state is null"
            java.lang.Object[] r7 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.al.c(r6, r7)
            goto L4b
        L30:
            int r7 = r6.condition
            r8 = 2
            if (r7 != r8) goto L41
            java.lang.String r9 = r6.processName
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r1] = r9
            java.lang.String r9 = "found proc state is anr! proc:%s"
            com.tencent.bugly.proguard.al.c(r9, r10)
            return r6
        L41:
            if (r7 != r3) goto L4b
            java.lang.String r9 = "found proc state is crashed!"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.al.c(r9, r10)
            return r0
        L4b:
            int r6 = r2 + 1
            long r7 = (long) r2
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 >= 0) goto L64
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r1] = r2
            java.lang.String r2 = "try the %s times:"
            com.tencent.bugly.proguard.al.c(r2, r7)
            com.tencent.bugly.proguard.ap.b(r4)
            r2 = r6
            goto L1e
        L64:
            java.lang.String r9 = "Find process anr, but unable to get anr message."
            android.app.ActivityManager$ProcessErrorStateInfo r9 = a(r9)
            return r9
    }

    private static android.app.ActivityManager.ProcessErrorStateInfo a(java.lang.String r2) {
            android.app.ActivityManager$ProcessErrorStateInfo r0 = new android.app.ActivityManager$ProcessErrorStateInfo
            r0.<init>()
            int r1 = android.os.Process.myPid()
            r0.pid = r1
            int r1 = android.os.Process.myPid()
            java.lang.String r1 = com.tencent.bugly.proguard.z.a(r1)
            r0.processName = r1
            r0.shortMsg = r2
            return r0
    }

    private static android.app.ActivityManager.ProcessErrorStateInfo a(java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> r5) {
            r0 = 0
            r1 = 0
            if (r5 == 0) goto L3c
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto Lb
            goto L3c
        Lb:
            int r2 = android.os.Process.myPid()
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r3 = r5.next()
            android.app.ActivityManager$ProcessErrorStateInfo r3 = (android.app.ActivityManager.ProcessErrorStateInfo) r3
            int r4 = r3.pid
            if (r4 != r2) goto L13
            java.lang.String r5 = r3.longMsg
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L2c
            return r1
        L2c:
            java.lang.String r5 = "found current proc in the error state"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.c(r5, r0)
            return r3
        L34:
            java.lang.String r5 = "current proc not in the error state"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.c(r5, r0)
            return r1
        L3c:
            java.lang.String r5 = "error state info list is null"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.c(r5, r0)
            return r1
    }
}
