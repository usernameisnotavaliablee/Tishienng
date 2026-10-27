package com.ss.android.downloadlib.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a implements u2.a {

    /* renamed from: com.ss.android.downloadlib.up.a$a, reason: collision with other inner class name */
    private static class C0220a {
        private static com.ss.android.downloadlib.up.a a;

        static {
                com.ss.android.downloadlib.up.a r0 = new com.ss.android.downloadlib.up.a
                r0.<init>()
                com.ss.android.downloadlib.up.a.C0220a.a = r0
                return
        }

        public C0220a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.ss.android.downloadlib.up.a a() {
                com.ss.android.downloadlib.up.a r0 = com.ss.android.downloadlib.up.a.C0220a.a
                return r0
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.ss.android.downloadlib.up.a a() {
            com.ss.android.downloadlib.up.a r0 = com.ss.android.downloadlib.up.a.C0220a.a()
            return r0
    }

    public static java.lang.String b(java.lang.Throwable r0) {
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    private void g(java.lang.Throwable r2) {
            r1 = this;
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
            boolean r0 = com.ss.android.socialbase.appdownloader.m.c.m(r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            com.ss.android.downloadlib.up.j r0 = new com.ss.android.downloadlib.up.j
            r0.<init>(r2)
            throw r0
    }

    private boolean i() {
            r3 = this;
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r1 = "enable_monitor"
            r2 = 1
            int r0 = r0.optInt(r1, r2)
            if (r0 == r2) goto Le
            return r2
        Le:
            r0 = 0
            return r0
    }

    public void c(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.d(r0, r2)
            return
    }

    public void d(boolean r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.i()
            if (r0 == 0) goto L7
            return
        L7:
            if (r2 == 0) goto L11
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r3)
            r1.g(r2)
        L11:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r0 = "msg"
            com.ss.android.downloadlib.a.h.u(r2, r0, r3)
            java.lang.Throwable r3 = new java.lang.Throwable
            r3.<init>()
            java.lang.String r3 = b(r3)
            java.lang.String r0 = "stack"
            com.ss.android.downloadlib.a.h.u(r2, r0, r3)
            com.ss.android.downloadlib.addownload.m.D()
            return
    }

    public void e(boolean r2, java.lang.Throwable r3, java.lang.String r4) {
            r1 = this;
            boolean r0 = r1.i()
            if (r0 == 0) goto L7
            return
        L7:
            if (r3 != 0) goto Le
            java.lang.Throwable r3 = new java.lang.Throwable
            r3.<init>()
        Le:
            if (r2 == 0) goto L13
            r1.g(r3)
        L13:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L1f
            goto L23
        L1f:
            java.lang.String r4 = r3.getMessage()
        L23:
            java.lang.String r0 = "msg"
            com.ss.android.downloadlib.a.h.u(r2, r0, r4)
            java.lang.String r4 = "stack"
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)
            com.ss.android.downloadlib.a.h.u(r2, r4, r3)
            com.ss.android.downloadlib.addownload.m.D()
            return
    }

    public void f(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.h(r0, r2)
            return
    }

    public void h(boolean r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.i()
            if (r0 == 0) goto L7
            return
        L7:
            if (r2 == 0) goto L11
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r3)
            r1.g(r2)
        L11:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r0 = "msg"
            com.ss.android.downloadlib.a.h.u(r2, r0, r3)
            java.lang.Throwable r3 = new java.lang.Throwable
            r3.<init>()
            java.lang.String r3 = b(r3)
            java.lang.String r0 = "stack"
            com.ss.android.downloadlib.a.h.u(r2, r0, r3)
            com.ss.android.downloadlib.addownload.m.D()
            return
    }

    public void j(java.lang.Throwable r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.e(r0, r2, r3)
            return
    }
}
