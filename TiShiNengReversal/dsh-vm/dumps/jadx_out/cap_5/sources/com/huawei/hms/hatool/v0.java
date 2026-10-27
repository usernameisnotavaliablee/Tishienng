package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class v0 {
    private long a;
    private volatile boolean b;
    private com.huawei.hms.hatool.v0.a c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a {
        java.lang.String a;
        boolean b;
        private long c;
        final /* synthetic */ com.huawei.hms.hatool.v0 d;

        a(com.huawei.hms.hatool.v0 r4, long r5) {
                r3 = this;
                r3.d = r4
                r3.<init>()
                java.util.UUID r0 = java.util.UUID.randomUUID()
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "-"
                java.lang.String r2 = ""
                java.lang.String r0 = r0.replace(r1, r2)
                r3.a = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r3.a
                r0.append(r1)
                java.lang.String r1 = "_"
                r0.append(r1)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                r3.a = r0
                r3.c = r5
                r5 = 1
                r3.b = r5
                r5 = 0
                com.huawei.hms.hatool.v0.d(r4, r5)
                return
        }

        private boolean b(long r2, long r4) {
                r1 = this;
                java.util.Calendar r0 = java.util.Calendar.getInstance()
                r0.setTimeInMillis(r2)
                java.util.Calendar r2 = java.util.Calendar.getInstance()
                r2.setTimeInMillis(r4)
                r3 = 1
                int r4 = r0.get(r3)
                int r5 = r2.get(r3)
                if (r4 != r5) goto L27
                r4 = 6
                int r5 = r0.get(r4)
                int r2 = r2.get(r4)
                if (r5 == r2) goto L25
                goto L27
            L25:
                r2 = 0
                return r2
            L27:
                return r3
        }

        private void c(long r4) {
                r3 = this;
                java.lang.String r0 = "hmsSdk"
                java.lang.String r1 = "getNewSession() session is flush!"
                com.huawei.hms.hatool.j1.h(r0, r1)
                java.util.UUID r0 = java.util.UUID.randomUUID()
                java.lang.String r0 = r0.toString()
                r3.a = r0
                java.lang.String r1 = "-"
                java.lang.String r2 = ""
                java.lang.String r0 = r0.replace(r1, r2)
                r3.a = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r3.a
                r0.append(r1)
                java.lang.String r1 = "_"
                r0.append(r1)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                r3.a = r0
                r3.c = r4
                r4 = 1
                r3.b = r4
                return
        }

        private boolean d(long r2, long r4) {
                r1 = this;
                long r4 = r4 - r2
                com.huawei.hms.hatool.v0 r2 = r1.d
                long r2 = com.huawei.hms.hatool.v0.e(r2)
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 < 0) goto Ld
                r2 = 1
                return r2
            Ld:
                r2 = 0
                return r2
        }

        void a(long r5) {
                r4 = this;
                com.huawei.hms.hatool.v0 r0 = r4.d
                boolean r0 = com.huawei.hms.hatool.v0.c(r0)
                r1 = 0
                if (r0 == 0) goto L12
                com.huawei.hms.hatool.v0 r0 = r4.d
                com.huawei.hms.hatool.v0.d(r0, r1)
                r4.c(r5)
                return
            L12:
                long r2 = r4.c
                boolean r0 = r4.d(r2, r5)
                if (r0 != 0) goto L28
                long r2 = r4.c
                boolean r0 = r4.b(r2, r5)
                if (r0 == 0) goto L23
                goto L28
            L23:
                r4.c = r5
                r4.b = r1
                return
            L28:
                r4.c(r5)
                return
        }
    }

    public v0() {
            r2 = this;
            r2.<init>()
            r0 = 1800000(0x1b7740, double:8.89318E-318)
            r2.a = r0
            r0 = 0
            r2.b = r0
            r0 = 0
            r2.c = r0
            return
    }

    static /* synthetic */ boolean c(com.huawei.hms.hatool.v0 r0) {
            boolean r0 = r0.b
            return r0
    }

    static /* synthetic */ boolean d(com.huawei.hms.hatool.v0 r0, boolean r1) {
            r0.b = r1
            return r1
    }

    static /* synthetic */ long e(com.huawei.hms.hatool.v0 r2) {
            long r0 = r2.a
            return r0
    }

    public java.lang.String a() {
            r2 = this;
            com.huawei.hms.hatool.v0$a r0 = r2.c
            if (r0 != 0) goto Le
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = "getSessionName(): session not prepared. onEvent() must be called first."
            com.huawei.hms.hatool.j1.m(r0, r1)
            java.lang.String r0 = ""
            return r0
        Le:
            java.lang.String r0 = r0.a
            return r0
    }

    void b(long r3) {
            r2 = this;
            com.huawei.hms.hatool.v0$a r0 = r2.c
            if (r0 != 0) goto L13
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = "Session is first flush"
            com.huawei.hms.hatool.j1.h(r0, r1)
            com.huawei.hms.hatool.v0$a r0 = new com.huawei.hms.hatool.v0$a
            r0.<init>(r2, r3)
            r2.c = r0
            return
        L13:
            r0.a(r3)
            return
    }

    public boolean f() {
            r2 = this;
            com.huawei.hms.hatool.v0$a r0 = r2.c
            if (r0 != 0) goto Ld
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = "isFirstEvent(): session not prepared. onEvent() must be called first."
            com.huawei.hms.hatool.j1.m(r0, r1)
            r0 = 0
            return r0
        Ld:
            boolean r0 = r0.b
            return r0
    }
}
