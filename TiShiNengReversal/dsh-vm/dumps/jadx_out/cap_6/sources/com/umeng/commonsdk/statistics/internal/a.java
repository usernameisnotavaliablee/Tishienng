package com.umeng.commonsdk.statistics.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    private static android.content.Context a;
    private java.lang.String b;
    private java.lang.String c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.internal.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.internal.a$a, reason: collision with other inner class name */
    private static class C0051a {
        private static final com.umeng.commonsdk.statistics.internal.a a = null;

        static {
                com.umeng.commonsdk.statistics.internal.a r0 = new com.umeng.commonsdk.statistics.internal.a
                r1 = 0
                r0.<init>(r1)
                com.umeng.commonsdk.statistics.internal.a.C0051a.a = r0
                return
        }

        private C0051a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.commonsdk.statistics.internal.a a() {
                com.umeng.commonsdk.statistics.internal.a r0 = com.umeng.commonsdk.statistics.internal.a.C0051a.a
                return r0
        }
    }

    static {
            return
    }

    private a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.c = r0
            return
    }

    /* synthetic */ a(com.umeng.commonsdk.statistics.internal.a.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.commonsdk.statistics.internal.a a(android.content.Context r1) {
            android.content.Context r0 = com.umeng.commonsdk.statistics.internal.a.a
            if (r0 != 0) goto L10
            if (r1 == 0) goto L10
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.umeng.commonsdk.statistics.internal.a.a = r1
        L10:
            com.umeng.commonsdk.statistics.internal.a r1 = com.umeng.commonsdk.statistics.internal.a.C0051a.a()
            return r1
    }

    private void f(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "/"
            java.lang.String r1 = " "
            java.lang.String r2 = "&="
            java.lang.String r4 = r4.replaceAll(r2, r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "&&"
            java.lang.String r4 = r4.replaceAll(r2, r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "=="
            java.lang.String r4 = r4.replaceAll(r2, r0)     // Catch: java.lang.Throwable -> L3d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r2.<init>()     // Catch: java.lang.Throwable -> L3d
            r2.append(r4)     // Catch: java.lang.Throwable -> L3d
            r2.append(r0)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = "Android"
            r2.append(r4)     // Catch: java.lang.Throwable -> L3d
            r2.append(r1)     // Catch: java.lang.Throwable -> L3d
            android.content.Context r4 = com.umeng.commonsdk.statistics.internal.a.a     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.HelperUtils.getUmengMD5(r4)     // Catch: java.lang.Throwable -> L3d
            r2.append(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L3d
            r3.b = r4     // Catch: java.lang.Throwable -> L3d
            return
        L3d:
            r4 = move-exception
            android.content.Context r0 = com.umeng.commonsdk.statistics.internal.a.a
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r4)
            return
    }

    private void g(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "="
            java.lang.String r1 = "&&"
            java.lang.String[] r7 = r7.split(r1)     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            r7 = r7[r1]     // Catch: java.lang.Throwable -> L3f
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L3f
            if (r2 != 0) goto L4d
            java.lang.String r2 = "&="
            java.lang.String[] r7 = r7.split(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r2.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = "ut/"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3f
            r3 = 0
        L22:
            int r4 = r7.length     // Catch: java.lang.Throwable -> L3f
            if (r3 >= r4) goto L47
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L3f
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L3f
            if (r5 != 0) goto L44
            r5 = 2
            java.lang.String r4 = r4.substring(r1, r5)     // Catch: java.lang.Throwable -> L3f
            boolean r5 = r4.endsWith(r0)     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L41
            java.lang.String r5 = ""
            java.lang.String r4 = r4.replace(r0, r5)     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r7 = move-exception
            goto L4e
        L41:
            r2.append(r4)     // Catch: java.lang.Throwable -> L3f
        L44:
            int r3 = r3 + 1
            goto L22
        L47:
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L3f
            r6.c = r7     // Catch: java.lang.Throwable -> L3f
        L4d:
            return
        L4e:
            android.content.Context r0 = com.umeng.commonsdk.statistics.internal.a.a
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r7)
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public boolean a(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            java.lang.String r0 = "a"
            boolean r2 = r2.startsWith(r0)
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public boolean b(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            java.lang.String r0 = "t"
            boolean r2 = r2.startsWith(r0)
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public boolean c(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            java.lang.String r0 = "z"
            boolean r2 = r2.startsWith(r0)
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public boolean d(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            java.lang.String r0 = "h"
            boolean r2 = r2.startsWith(r0)
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public void e(java.lang.String r3) {
            r2 = this;
            r0 = 95
            int r0 = r3.indexOf(r0)
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
            r2.g(r3)
            r2.f(r3)
            return
    }
}
