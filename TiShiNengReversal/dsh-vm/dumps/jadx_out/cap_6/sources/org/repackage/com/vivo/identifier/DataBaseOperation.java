package org.repackage.com.vivo.identifier;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DataBaseOperation {
    private static final java.lang.String a = "VMS_SDK_DB";
    private static final java.lang.String b = "content://com.vivo.vms.IdProvider/IdentifierId";
    private static final java.lang.String c = "content://com.vivo.abe.exidentifier/guid";
    private static final java.lang.String d = "value";
    private static final java.lang.String e = "OAID";
    private static final java.lang.String f = "AAID";
    private static final java.lang.String g = "VAID";
    private static final java.lang.String h = "OAIDBLACK";
    private static final java.lang.String i = "OAIDSTATUS";
    private static final java.lang.String j = "STATISTICS";
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 3;
    private static final int o = 4;
    private static final int p = 5;

    /* renamed from: q, reason: collision with root package name */
    private static final int f67q = 6;
    private static final int r = 7;
    private static final java.lang.String s = "UDID";
    private android.content.Context t;

    DataBaseOperation(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.t = r1
            return
    }

    java.lang.String a(int r9, java.lang.String r10) {
            r8 = this;
            r1 = 0
            if (r9 == 0) goto L65
            r0 = 1
            if (r9 == r0) goto L4f
            r0 = 2
            if (r9 == r0) goto L39
            r0 = 3
            if (r9 == r0) goto L32
            r0 = 4
            if (r9 == r0) goto L1c
            r10 = 5
            if (r9 == r10) goto L14
            r3 = r1
            goto L6c
        L14:
            java.lang.String r9 = "content://com.vivo.abe.exidentifier/guid"
            android.net.Uri r9 = android.net.Uri.parse(r9)
        L1a:
            r3 = r9
            goto L6c
        L1c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS_"
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L1a
        L32:
            java.lang.String r9 = "content://com.vivo.vms.IdProvider/IdentifierId/UDID"
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L1a
        L39:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L1a
        L4f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L1a
        L65:
            java.lang.String r9 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L1a
        L6c:
            if (r3 != 0) goto L6f
            return r1
        L6f:
            android.content.Context r9 = r8.t     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9f
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9f
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9f
            if (r9 == 0) goto L96
            boolean r10 = r9.moveToNext()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            if (r10 == 0) goto L96
            java.lang.String r10 = "value"
            int r10 = r9.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            java.lang.String r1 = r9.getString(r10)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            goto L96
        L90:
            r0 = move-exception
            r10 = r0
            r1 = r9
            goto La2
        L94:
            goto La8
        L96:
            if (r9 == 0) goto L9b
            r9.close()
        L9b:
            return r1
        L9c:
            r0 = move-exception
            r10 = r0
            goto La2
        L9f:
            r9 = r1
            goto La8
        La2:
            if (r1 == 0) goto La7
            r1.close()
        La7:
            throw r10
        La8:
            if (r9 == 0) goto Lad
            r9.close()
        Lad:
            return r1
    }

    boolean a(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            r0 = 6
            if (r3 == r0) goto L5
            r3 = 0
            goto L1a
        L5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "content://com.vivo.vms.IdProvider/IdentifierId/OAIDBLACK_"
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
        L1a:
            r4 = 0
            if (r3 != 0) goto L1e
            return r4
        L1e:
            android.content.Context r0 = r2.t     // Catch: java.lang.Exception -> L32
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "packageName=? and uid=?"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}     // Catch: java.lang.Exception -> L32
            int r3 = r0.delete(r3, r1, r5)     // Catch: java.lang.Exception -> L32
            if (r3 == 0) goto L32
            r3 = 1
            return r3
        L32:
            return r4
    }

    boolean a(int r2, java.lang.String r3, android.content.ContentValues[] r4) {
            r1 = this;
            r0 = 6
            if (r2 == r0) goto L1e
            r0 = 7
            if (r2 == r0) goto L8
            r2 = 0
            goto L33
        L8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "content://com.vivo.vms.IdProvider/IdentifierId/STATISTICS_"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            goto L33
        L1e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "content://com.vivo.vms.IdProvider/IdentifierId/OAIDBLACK_"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
        L33:
            r3 = 0
            if (r2 != 0) goto L37
            return r3
        L37:
            android.content.Context r0 = r1.t     // Catch: java.lang.Exception -> L45
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L45
            int r2 = r0.bulkInsert(r2, r4)     // Catch: java.lang.Exception -> L45
            if (r2 == 0) goto L45
            r2 = 1
            return r2
        L45:
            return r3
    }
}
