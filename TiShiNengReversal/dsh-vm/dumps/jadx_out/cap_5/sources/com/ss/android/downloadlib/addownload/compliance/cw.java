package com.ss.android.downloadlib.addownload.compliance;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class cw extends com.ss.android.socialbase.downloader.az.tl<java.lang.Long, com.ss.android.downloadlib.addownload.o.j> {

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private static com.ss.android.downloadlib.addownload.compliance.cw a;

        static {
                com.ss.android.downloadlib.addownload.compliance.cw r0 = new com.ss.android.downloadlib.addownload.compliance.cw
                r1 = 0
                r0.<init>(r1)
                com.ss.android.downloadlib.addownload.compliance.cw.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.ss.android.downloadlib.addownload.compliance.cw a() {
                com.ss.android.downloadlib.addownload.compliance.cw r0 = com.ss.android.downloadlib.addownload.compliance.cw.b.a
                return r0
        }
    }

    private cw() {
            r1 = this;
            r0 = 16
            r1.<init>(r0, r0)
            return
    }

    /* synthetic */ cw(com.ss.android.downloadlib.addownload.compliance.cw.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.ss.android.downloadlib.addownload.compliance.cw j() {
            com.ss.android.downloadlib.addownload.compliance.cw r0 = com.ss.android.downloadlib.addownload.compliance.cw.b.a()
            return r0
    }

    public com.ss.android.downloadlib.addownload.o.j j(long r1) {
            r0 = this;
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r0.get(r1)
            com.ss.android.downloadlib.addownload.o$j r1 = (com.ss.android.downloadlib.addownload.o.j) r1
            return r1
    }

    public com.ss.android.downloadlib.addownload.o.j j(long r2, long r4) {
            r1 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L15
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        Le:
            java.lang.Object r2 = r1.get(r2)
            com.ss.android.downloadlib.addownload.o$j r2 = (com.ss.android.downloadlib.addownload.o.j) r2
            return r2
        L15:
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto Le
    }

    public void j(com.ss.android.downloadlib.addownload.o.j r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            long r0 = r3.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r0, r3)
            return
    }
}
