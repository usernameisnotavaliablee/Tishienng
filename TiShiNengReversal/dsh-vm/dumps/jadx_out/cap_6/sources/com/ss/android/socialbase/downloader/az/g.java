package com.ss.android.socialbase.downloader.az;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class g {
    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(java.lang.String r1, java.lang.String r2, java.lang.String[] r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r1 = 34
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            j(r0, r3)
            java.lang.String r1 = ") VALUES ("
            r0.append(r1)
            int r1 = r3.length
            j(r0, r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String j(java.lang.String r2, java.lang.String[] r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\""
            r0.<init>(r1)
            r0.append(r2)
            r2 = 34
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DELETE FROM "
            r0.<init>(r1)
            r0.append(r2)
            if (r3 == 0) goto L2a
            int r1 = r3.length
            if (r1 <= 0) goto L2a
            java.lang.String r1 = " WHERE "
            r0.append(r1)
            j(r0, r2, r3)
        L2a:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String j(java.lang.String r2, java.lang.String[] r3, java.lang.String[] r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\""
            r0.<init>(r1)
            r0.append(r2)
            r2 = 34
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UPDATE "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " SET "
            r0.append(r1)
            xt(r0, r3)
            if (r4 == 0) goto L32
            int r3 = r4.length
            if (r3 <= 0) goto L32
            java.lang.String r3 = " WHERE "
            r0.append(r3)
            j(r0, r2, r4)
        L32:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.StringBuilder j(java.lang.StringBuilder r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto L15
            int r1 = r3 + (-1)
            if (r0 >= r1) goto Ld
            java.lang.String r1 = "?,"
            r2.append(r1)
            goto L12
        Ld:
            r1 = 63
            r2.append(r1)
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            return r2
    }

    public static java.lang.StringBuilder j(java.lang.StringBuilder r1, java.lang.String r2) {
            r0 = 34
            r1.append(r0)
            r1.append(r2)
            r1.append(r0)
            return r1
    }

    public static java.lang.StringBuilder j(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2) {
            r0.append(r1)
            java.lang.String r1 = ".\""
            r0.append(r1)
            r0.append(r2)
            r1 = 34
            r0.append(r1)
            return r0
    }

    public static java.lang.StringBuilder j(java.lang.StringBuilder r3, java.lang.String r4, java.lang.String[] r5) {
            r0 = 0
        L1:
            int r1 = r5.length
            if (r0 >= r1) goto L1c
            r1 = r5[r0]
            java.lang.StringBuilder r1 = j(r3, r4, r1)
            java.lang.String r2 = "=?"
            r1.append(r2)
            int r1 = r5.length
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L19
            r1 = 44
            r3.append(r1)
        L19:
            int r0 = r0 + 1
            goto L1
        L1c:
            return r3
    }

    public static java.lang.StringBuilder j(java.lang.StringBuilder r4, java.lang.String[] r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L1d
            r2 = 34
            r4.append(r2)
            r3 = r5[r1]
            r4.append(r3)
            r4.append(r2)
            int r2 = r0 + (-1)
            if (r1 >= r2) goto L1a
            r2 = 44
            r4.append(r2)
        L1a:
            int r1 = r1 + 1
            goto L2
        L1d:
            return r4
    }

    public static java.lang.String xt(java.lang.String r2, java.lang.String[] r3, java.lang.String[] r4) {
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "INSERT OR REPLACE INTO "
            r4.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\""
            r0.<init>(r1)
            r0.append(r2)
            r2 = 34
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.append(r2)
            java.lang.String r2 = " ("
            r4.append(r2)
            j(r4, r3)
            java.lang.String r2 = ") VALUES ("
            r4.append(r2)
            int r2 = r3.length
            j(r4, r2)
            r2 = 41
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            return r2
    }

    public static java.lang.StringBuilder xt(java.lang.StringBuilder r3, java.lang.String[] r4) {
            r0 = 0
        L1:
            int r1 = r4.length
            if (r0 >= r1) goto L1c
            r1 = r4[r0]
            java.lang.StringBuilder r1 = j(r3, r1)
            java.lang.String r2 = "=?"
            r1.append(r2)
            int r1 = r4.length
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L19
            r1 = 44
            r3.append(r1)
        L19:
            int r0 = r0 + 1
            goto L1
        L1c:
            return r3
    }
}
