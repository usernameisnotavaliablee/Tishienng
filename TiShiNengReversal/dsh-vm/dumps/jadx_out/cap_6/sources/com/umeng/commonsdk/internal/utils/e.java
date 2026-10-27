package com.umeng.commonsdk.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum a extends java.lang.Enum<com.umeng.commonsdk.internal.utils.e.a> {
        public static final com.umeng.commonsdk.internal.utils.e.a a = null;
        private static final /* synthetic */ com.umeng.commonsdk.internal.utils.e.a[] c = null;
        java.lang.String[] b;

        static {
                com.umeng.commonsdk.internal.utils.e$a r0 = new com.umeng.commonsdk.internal.utils.e$a
                java.lang.String r1 = "/system/xbin/which"
                java.lang.String r2 = "su"
                java.lang.String[] r1 = new java.lang.String[]{r1, r2}
                java.lang.String r2 = "check_su_binary"
                r3 = 0
                r0.<init>(r2, r3, r1)
                com.umeng.commonsdk.internal.utils.e.a.a = r0
                r1 = 1
                com.umeng.commonsdk.internal.utils.e$a[] r1 = new com.umeng.commonsdk.internal.utils.e.a[r1]
                r1[r3] = r0
                com.umeng.commonsdk.internal.utils.e.a.c = r1
                return
        }

        a(java.lang.String r1, int r2, java.lang.String[] r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.b = r3
                return
        }

        public static com.umeng.commonsdk.internal.utils.e.a valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.commonsdk.internal.utils.e$a> r0 = com.umeng.commonsdk.internal.utils.e.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.commonsdk.internal.utils.e$a r1 = (com.umeng.commonsdk.internal.utils.e.a) r1
                return r1
        }

        public static com.umeng.commonsdk.internal.utils.e.a[] values() {
                com.umeng.commonsdk.internal.utils.e$a[] r0 = com.umeng.commonsdk.internal.utils.e.a.c
                java.lang.Object r0 = r0.clone()
                com.umeng.commonsdk.internal.utils.e$a[] r0 = (com.umeng.commonsdk.internal.utils.e.a[]) r0
                return r0
        }
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.ArrayList a(com.umeng.commonsdk.internal.utils.e.a r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 <= r2) goto Lc
            goto L3c
        Lc:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Exception -> L3d
            java.lang.String[] r5 = r5.b     // Catch: java.lang.Exception -> L3d
            java.lang.Process r5 = r1.exec(r5)     // Catch: java.lang.Exception -> L3d
            java.io.BufferedWriter r1 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            java.io.OutputStream r3 = r5.getOutputStream()
            r2.<init>(r3)
            r1.<init>(r2)
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.io.InputStream r5 = r5.getInputStream()
            r2.<init>(r5)
            r1.<init>(r2)
        L32:
            java.lang.String r5 = r1.readLine()     // Catch: java.lang.Exception -> L3c
            if (r5 == 0) goto L3c
            r0.add(r5)     // Catch: java.lang.Exception -> L3c
            goto L32
        L3c:
            return r0
        L3d:
            r5 = 0
            return r5
    }
}
