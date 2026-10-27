package com.kwad.framework.filedownloader.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void b(java.lang.String r1, java.lang.Object... r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ", but the download service isn't connected yet.\nYou can use FileDownloader#isServiceConnected() to check whether the service has been connected, \nbesides you can use following functions easier to control your requestHttpCode invoke after the service has been connected: \n1. FileDownloader#bindService(Runnable)\n2. FileDownloader#insureServiceBind()\n3. FileDownloader#insureServiceBindAsync()"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.Class<com.kwad.framework.filedownloader.f.a> r0 = com.kwad.framework.filedownloader.f.a.class
            com.kwad.framework.filedownloader.f.d.d(r0, r1, r2)
            return
    }

    public static boolean bw(int r2) {
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "request pause the task[%d] in the download service"
            b(r2, r0)
            return r1
    }

    public static byte bx(int r2) {
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "request get the status for the task[%d] in the download service"
            b(r2, r0)
            return r1
    }

    public static boolean by(int r2) {
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "request clear the task[%d] data in the database"
            b(r2, r0)
            return r1
    }

    public static boolean h(java.lang.String r2, java.lang.String r3, boolean r4) {
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            java.lang.String r2 = "request start the task([%s], [%s], [%B]) in the download service"
            b(r2, r0)
            return r1
    }
}
