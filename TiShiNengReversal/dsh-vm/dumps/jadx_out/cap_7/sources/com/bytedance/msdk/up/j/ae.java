package com.bytedance.msdk.up.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ae {
    private static final java.lang.Object cw = null;
    private com.bytedance.msdk.up.j.ae.j j;
    private android.content.Context xt;

    public class j {
        final /* synthetic */ com.bytedance.msdk.up.j.ae j;
        private android.database.sqlite.SQLiteDatabase xt;

        public j(com.bytedance.msdk.up.j.ae r1) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                r1 = 0
                r0.xt = r1
                return
        }

        private boolean cw() {
                r2 = this;
                android.database.sqlite.SQLiteDatabase r0 = r2.xt
                if (r0 == 0) goto L12
                boolean r1 = r0.isOpen()
                if (r1 == 0) goto L12
                boolean r0 = r0.inTransaction()
                if (r0 == 0) goto L12
                r0 = 1
                return r0
            L12:
                r0 = 0
                return r0
        }

        private void xt() {
                r5 = this;
                java.lang.Object r0 = com.bytedance.msdk.up.j.ae.xt()     // Catch: java.lang.Throwable -> L2e
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L2e
                android.database.sqlite.SQLiteDatabase r1 = r5.xt     // Catch: java.lang.Throwable -> L10
                if (r1 == 0) goto L12
                boolean r1 = r1.isOpen()     // Catch: java.lang.Throwable -> L10
                if (r1 != 0) goto L2a
                goto L12
            L10:
                r1 = move-exception
                goto L2c
            L12:
                com.bytedance.msdk.up.j.tl r1 = new com.bytedance.msdk.up.j.tl     // Catch: java.lang.Throwable -> L10
                com.bytedance.msdk.up.j.ae r2 = r5.j     // Catch: java.lang.Throwable -> L10
                android.content.Context r2 = com.bytedance.msdk.up.j.ae.j(r2)     // Catch: java.lang.Throwable -> L10
                java.lang.String r3 = "tt_mediation_open_sdk.db"
                r4 = 4
                r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L10
                android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch: java.lang.Throwable -> L10
                r5.xt = r1     // Catch: java.lang.Throwable -> L10
                r2 = 0
                r1.setLockingEnabled(r2)     // Catch: java.lang.Throwable -> L10
            L2a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
                return
            L2c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
                throw r1     // Catch: java.lang.Throwable -> L2e
            L2e:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)
                r5.cw()
                return
        }

        public android.database.sqlite.SQLiteDatabase j() {
                r1 = this;
                r1.xt()
                android.database.sqlite.SQLiteDatabase r0 = r1.xt
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.bytedance.msdk.up.j.ae.cw = r0
            return
    }

    ae(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto Lc
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> La
            goto L14
        La:
            r1 = move-exception
            goto L22
        Lc:
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> La
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> La
        L14:
            r0.xt = r1     // Catch: java.lang.Throwable -> La
            com.bytedance.msdk.up.j.ae$j r1 = r0.j     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto L21
            com.bytedance.msdk.up.j.ae$j r1 = new com.bytedance.msdk.up.j.ae$j     // Catch: java.lang.Throwable -> La
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La
            r0.j = r1     // Catch: java.lang.Throwable -> La
        L21:
            return
        L22:
            com.bytedance.sdk.component.utils.vl.j(r1)
            return
    }

    private android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.xt
            if (r0 != 0) goto L8
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
        L8:
            return r0
    }

    static /* synthetic */ android.content.Context j(com.bytedance.msdk.up.j.ae r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ java.lang.Object xt() {
            java.lang.Object r0 = com.bytedance.msdk.up.j.ae.cw
            return r0
    }

    public com.bytedance.msdk.up.j.ae.j j() {
            r1 = this;
            com.bytedance.msdk.up.j.ae$j r0 = r1.j
            return r0
    }
}
